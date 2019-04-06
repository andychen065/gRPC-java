package com.mzsg.demo.grpc.qryaccount.impl;

import com.mzsg.demo.grpc.qryaccount.AccountQryRequest;
import com.mzsg.demo.grpc.qryaccount.AccountQryResponse;
import com.mzsg.demo.grpc.qryaccount.QryAccountServiceGrpc;

import io.grpc.stub.StreamObserver;

public class QryAccountServiceImpl extends QryAccountServiceGrpc.QryAccountServiceImplBase {

    public void qry(AccountQryRequest request, StreamObserver<AccountQryResponse> responseObserver) {
        System.out.println("qry " + request.getUserId());
        AccountQryResponse response = AccountQryResponse.newBuilder().setRc(1).setAmount(666).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}