package com.mzsg.demo.grpc.qryaccount;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 **
 * �˻��ٲ�ѯ����
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: AccountQry.proto")
public final class QryAccountServiceGrpc {

  private QryAccountServiceGrpc() {}

  public static final String SERVICE_NAME = "accountService.QryAccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mzsg.demo.grpc.qryaccount.AccountQryRequest,
      com.mzsg.demo.grpc.qryaccount.AccountQryResponse> getQryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Qry",
      requestType = com.mzsg.demo.grpc.qryaccount.AccountQryRequest.class,
      responseType = com.mzsg.demo.grpc.qryaccount.AccountQryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mzsg.demo.grpc.qryaccount.AccountQryRequest,
      com.mzsg.demo.grpc.qryaccount.AccountQryResponse> getQryMethod() {
    io.grpc.MethodDescriptor<com.mzsg.demo.grpc.qryaccount.AccountQryRequest, com.mzsg.demo.grpc.qryaccount.AccountQryResponse> getQryMethod;
    if ((getQryMethod = QryAccountServiceGrpc.getQryMethod) == null) {
      synchronized (QryAccountServiceGrpc.class) {
        if ((getQryMethod = QryAccountServiceGrpc.getQryMethod) == null) {
          QryAccountServiceGrpc.getQryMethod = getQryMethod = 
              io.grpc.MethodDescriptor.<com.mzsg.demo.grpc.qryaccount.AccountQryRequest, com.mzsg.demo.grpc.qryaccount.AccountQryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "accountService.QryAccountService", "Qry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mzsg.demo.grpc.qryaccount.AccountQryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mzsg.demo.grpc.qryaccount.AccountQryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new QryAccountServiceMethodDescriptorSupplier("Qry"))
                  .build();
          }
        }
     }
     return getQryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QryAccountServiceStub newStub(io.grpc.Channel channel) {
    return new QryAccountServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QryAccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QryAccountServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QryAccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QryAccountServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   * �˻��ٲ�ѯ����
   * </pre>
   */
  public static abstract class QryAccountServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *�˻���ѯ����
     * </pre>
     */
    public void qry(com.mzsg.demo.grpc.qryaccount.AccountQryRequest request,
        io.grpc.stub.StreamObserver<com.mzsg.demo.grpc.qryaccount.AccountQryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQryMethod(), responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mzsg.demo.grpc.qryaccount.AccountQryRequest,
                com.mzsg.demo.grpc.qryaccount.AccountQryResponse>(
                  this, METHODID_QRY)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * �˻��ٲ�ѯ����
   * </pre>
   */
  public static final class QryAccountServiceStub extends io.grpc.stub.AbstractStub<QryAccountServiceStub> {
    private QryAccountServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QryAccountServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QryAccountServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QryAccountServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *�˻���ѯ����
     * </pre>
     */
    public void qry(com.mzsg.demo.grpc.qryaccount.AccountQryRequest request,
        io.grpc.stub.StreamObserver<com.mzsg.demo.grpc.qryaccount.AccountQryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * �˻��ٲ�ѯ����
   * </pre>
   */
  public static final class QryAccountServiceBlockingStub extends io.grpc.stub.AbstractStub<QryAccountServiceBlockingStub> {
    private QryAccountServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QryAccountServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QryAccountServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QryAccountServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *�˻���ѯ����
     * </pre>
     */
    public com.mzsg.demo.grpc.qryaccount.AccountQryResponse qry(com.mzsg.demo.grpc.qryaccount.AccountQryRequest request) {
      return blockingUnaryCall(
          getChannel(), getQryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * �˻��ٲ�ѯ����
   * </pre>
   */
  public static final class QryAccountServiceFutureStub extends io.grpc.stub.AbstractStub<QryAccountServiceFutureStub> {
    private QryAccountServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QryAccountServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QryAccountServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QryAccountServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *�˻���ѯ����
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mzsg.demo.grpc.qryaccount.AccountQryResponse> qry(
        com.mzsg.demo.grpc.qryaccount.AccountQryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QRY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QryAccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QryAccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QRY:
          serviceImpl.qry((com.mzsg.demo.grpc.qryaccount.AccountQryRequest) request,
              (io.grpc.stub.StreamObserver<com.mzsg.demo.grpc.qryaccount.AccountQryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QryAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QryAccountServiceBaseDescriptorSupplier() {}

    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mzsg.demo.grpc.qryaccount.QryAccountProto.getDescriptor();
    }

    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QryAccountService");
    }
  }

  private static final class QryAccountServiceFileDescriptorSupplier
      extends QryAccountServiceBaseDescriptorSupplier {
    QryAccountServiceFileDescriptorSupplier() {}
  }

  private static final class QryAccountServiceMethodDescriptorSupplier
      extends QryAccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QryAccountServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QryAccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QryAccountServiceFileDescriptorSupplier())
              .addMethod(getQryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
