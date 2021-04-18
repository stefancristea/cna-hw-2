package proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: winter.proto")
public final class WinterServiceGrpc {

  private WinterServiceGrpc() {}

  public static final String SERVICE_NAME = "WinterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Gate.CalendarDate,
      proto.Gate.StarSign> getGetStarSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStarSign",
      requestType = proto.Gate.CalendarDate.class,
      responseType = proto.Gate.StarSign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Gate.CalendarDate,
      proto.Gate.StarSign> getGetStarSignMethod() {
    io.grpc.MethodDescriptor<proto.Gate.CalendarDate, proto.Gate.StarSign> getGetStarSignMethod;
    if ((getGetStarSignMethod = WinterServiceGrpc.getGetStarSignMethod) == null) {
      synchronized (WinterServiceGrpc.class) {
        if ((getGetStarSignMethod = WinterServiceGrpc.getGetStarSignMethod) == null) {
          WinterServiceGrpc.getGetStarSignMethod = getGetStarSignMethod = 
              io.grpc.MethodDescriptor.<proto.Gate.CalendarDate, proto.Gate.StarSign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "WinterService", "getStarSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.CalendarDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.StarSign.getDefaultInstance()))
                  .setSchemaDescriptor(new WinterServiceMethodDescriptorSupplier("getStarSign"))
                  .build();
          }
        }
     }
     return getGetStarSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WinterServiceStub newStub(io.grpc.Channel channel) {
    return new WinterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WinterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WinterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WinterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WinterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WinterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStarSign(proto.Gate.CalendarDate request,
        io.grpc.stub.StreamObserver<proto.Gate.StarSign> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStarSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStarSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Gate.CalendarDate,
                proto.Gate.StarSign>(
                  this, METHODID_GET_STAR_SIGN)))
          .build();
    }
  }

  /**
   */
  public static final class WinterServiceStub extends io.grpc.stub.AbstractStub<WinterServiceStub> {
    private WinterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WinterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WinterServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStarSign(proto.Gate.CalendarDate request,
        io.grpc.stub.StreamObserver<proto.Gate.StarSign> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStarSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WinterServiceBlockingStub extends io.grpc.stub.AbstractStub<WinterServiceBlockingStub> {
    private WinterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WinterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WinterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Gate.StarSign getStarSign(proto.Gate.CalendarDate request) {
      return blockingUnaryCall(
          getChannel(), getGetStarSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WinterServiceFutureStub extends io.grpc.stub.AbstractStub<WinterServiceFutureStub> {
    private WinterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WinterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WinterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Gate.StarSign> getStarSign(
        proto.Gate.CalendarDate request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStarSignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STAR_SIGN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WinterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WinterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STAR_SIGN:
          serviceImpl.getStarSign((proto.Gate.CalendarDate) request,
              (io.grpc.stub.StreamObserver<proto.Gate.StarSign>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WinterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WinterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Winter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WinterService");
    }
  }

  private static final class WinterServiceFileDescriptorSupplier
      extends WinterServiceBaseDescriptorSupplier {
    WinterServiceFileDescriptorSupplier() {}
  }

  private static final class WinterServiceMethodDescriptorSupplier
      extends WinterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WinterServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WinterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WinterServiceFileDescriptorSupplier())
              .addMethod(getGetStarSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
