package com.test.grpc;

import java.util.concurrent.TimeUnit;

import com.test.grpc.service.TestRpcServiceGrpc;
import com.test.grpc.service.model.TestRequest;
import com.test.grpc.service.model.TestResponse;

import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

public class TestClient {
  
    private final TestRpcServiceGrpc.TestRpcServiceBlockingStub client;  
    public TestClient(String host,int port) {  
        ManagedChannel channel =  NettyChannelBuilder.forAddress(host, port).usePlaintext(true).build();  
        client = TestRpcServiceGrpc.newBlockingStub(channel).withDeadlineAfter(60000, TimeUnit.MILLISECONDS);  
    }  
  
    public String sayHello(String name,Integer id) {  
        TestRequest request = TestRequest.newBuilder().setId(id).setName(name).build();
        TestResponse response = client.sayHello(request);  
        return response.getMessage();  
    }  
}  