package com.test.grpc;

public class TestServer {  
  
    public static void main(String[] args) throws Exception{  
  
    	io.grpc.Server server = io.grpc.ServerBuilder.forPort(50010).addService(new TestServiceImpl()).build();  
        server.start();  
        server.awaitTermination();
    }  
}  