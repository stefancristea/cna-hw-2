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
    comments = "Source: summer.proto")
public final class SummerServiceGrpc {

  private SummerServiceGrpc() {}

  public static final String SERVICE_NAME = "SummerService";

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
    if ((getGetStarSignMethod = SummerServiceGrpc.getGetStarSignMethod) == null) {
      synchronized (SummerServiceGrpc.class) {
        if ((getGetStarSignMethod = SummerServiceGrpc.getGetStarSignMethod) == null) {
          SummerServiceGrpc.getGetStarSignMethod = getGetStarSignMethod = 
              io.grpc.MethodDescriptor.<proto.Gate.CalendarDate, proto.Gate.StarSign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SummerService", "getStarSign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.CalendarDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.StarSign.getDefaultInstance()))
                  .setSchemaDescriptor(new SummerServiceMethodDescriptorSupplier("getStarSign"))
                  .build();
          }
        }
     }
     return getGetStarSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SummerServiceStub newStub(io.grpc.Channel channel) {
    return new SummerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SummerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SummerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SummerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SummerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SummerServiceImplBase implements io.grpc.BindableService {

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
  public static final class SummerServiceStub extends io.grpc.stub.AbstractStub<SummerServiceStub> {
    private SummerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerServiceStub(channel, callOptions);
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
  public static final class SummerServiceBlockingStub extends io.grpc.stub.AbstractStub<SummerServiceBlockingStub> {
    private SummerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerServiceBlockingStub(channel, callOptions);
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
  public static final class SummerServiceFutureStub extends io.grpc.stub.AbstractStub<SummerServiceFutureStub> {
    private SummerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SummerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SummerServiceFutureStub(channel, callOptions);
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
    private final SummerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SummerServiceImplBase serviceImpl, int methodId) {
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

  private static abstract class SummerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SummerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.Summer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SummerService");
    }
  }

  private static final class SummerServiceFileDescriptorSupplier
      extends SummerServiceBaseDescriptorSupplier {
    SummerServiceFileDescriptorSupplier() {}
  }

  private static final class SummerServiceMethodDescriptorSupplier
      extends SummerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SummerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SummerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SummerServiceFileDescriptorSupplier())
              .addMethod(getGetStarSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
