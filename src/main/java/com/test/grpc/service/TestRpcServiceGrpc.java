package com.test.grpc.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: TestService.proto")
public final class TestRpcServiceGrpc {

  private TestRpcServiceGrpc() {}

  public static final String SERVICE_NAME = "com.test.grpc.TestRpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.test.grpc.service.model.TestRequest,
      com.test.grpc.service.model.TestResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = com.test.grpc.service.model.TestRequest.class,
      responseType = com.test.grpc.service.model.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test.grpc.service.model.TestRequest,
      com.test.grpc.service.model.TestResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.test.grpc.service.model.TestRequest, com.test.grpc.service.model.TestResponse> getSayHelloMethod;
    if ((getSayHelloMethod = TestRpcServiceGrpc.getSayHelloMethod) == null) {
      synchronized (TestRpcServiceGrpc.class) {
        if ((getSayHelloMethod = TestRpcServiceGrpc.getSayHelloMethod) == null) {
          TestRpcServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.test.grpc.service.model.TestRequest, com.test.grpc.service.model.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.test.grpc.TestRpcService", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.service.model.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.service.model.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TestRpcServiceMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestRpcServiceStub newStub(io.grpc.Channel channel) {
    return new TestRpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestRpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestRpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestRpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestRpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TestRpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.test.grpc.service.model.TestRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.service.model.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.service.model.TestRequest,
                com.test.grpc.service.model.TestResponse>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class TestRpcServiceStub extends io.grpc.stub.AbstractStub<TestRpcServiceStub> {
    private TestRpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestRpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestRpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestRpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.test.grpc.service.model.TestRequest request,
        io.grpc.stub.StreamObserver<com.test.grpc.service.model.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestRpcServiceBlockingStub extends io.grpc.stub.AbstractStub<TestRpcServiceBlockingStub> {
    private TestRpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestRpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestRpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestRpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.test.grpc.service.model.TestResponse sayHello(com.test.grpc.service.model.TestRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestRpcServiceFutureStub extends io.grpc.stub.AbstractStub<TestRpcServiceFutureStub> {
    private TestRpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestRpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestRpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestRpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.service.model.TestResponse> sayHello(
        com.test.grpc.service.model.TestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestRpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestRpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.test.grpc.service.model.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.service.model.TestResponse>) responseObserver);
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

  private static abstract class TestRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestRpcServiceBaseDescriptorSupplier() {}

    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpc.service.TestService.getDescriptor();
    }

    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestRpcService");
    }
  }

  private static final class TestRpcServiceFileDescriptorSupplier
      extends TestRpcServiceBaseDescriptorSupplier {
    TestRpcServiceFileDescriptorSupplier() {}
  }

  private static final class TestRpcServiceMethodDescriptorSupplier
      extends TestRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestRpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestRpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestRpcServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
