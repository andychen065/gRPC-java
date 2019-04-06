package com.test.grpc;

import com.test.grpc.service.*;
import com.test.grpc.service.model.*;

import io.grpc.stub.StreamObserver;
public class TestServiceImpl extends TestRpcServiceGrpc.TestRpcServiceImplBase {  
  
    @Override  
    public void sayHello(TestRequest request, StreamObserver<TestResponse> responseObserver) {  
        String result = request.getName() + request.getId();  
        TestResponse response = TestResponse.newBuilder().setMessage(result).build();  
        responseObserver.onNext(response);  
        responseObserver.onCompleted();  
    }  
}  