package com.mzsg.demo.grpc;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.mzsg.demo.grpc.qryaccount.AccountQryRequest;
import com.mzsg.demo.grpc.qryaccount.AccountQryResponse;
import com.mzsg.demo.grpc.qryaccount.QryAccountServiceGrpc;
import com.mzsg.demo.grpc.qryaccount.QryAccountServiceGrpc.QryAccountServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main( String[] args ) throws FileNotFoundException, IOException{
        AccountQryRequest request = AccountQryRequest.newBuilder().setUserId("20012").setRequestId("123").build();
        ManagedChannel channel = ManagedChannelBuilder
                  .forAddress("localhost", 8883)
                  .usePlaintext(true)
                  .build();
        QryAccountServiceBlockingStub stub = QryAccountServiceGrpc.newBlockingStub(channel);
        for (int j = 0; j < 20; j++) {
            long start = System.currentTimeMillis();
                for(int i=0; i<10000; i++){
                    AccountQryResponse rsp = stub.qry(request);
                }
                System.out.println(System.currentTimeMillis() - start + " MS");
            }
    }
}