package dynamiccalls.Inventory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Definicja usługi zarządzającej inwentarzem produktów.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: ExecutorService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "dynamiccalls.Inventory.InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dynamiccalls.Inventory.ProductRequest,
      dynamiccalls.Inventory.AddProductResponse> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addProduct",
      requestType = dynamiccalls.Inventory.ProductRequest.class,
      responseType = dynamiccalls.Inventory.AddProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dynamiccalls.Inventory.ProductRequest,
      dynamiccalls.Inventory.AddProductResponse> getAddProductMethod() {
    io.grpc.MethodDescriptor<dynamiccalls.Inventory.ProductRequest, dynamiccalls.Inventory.AddProductResponse> getAddProductMethod;
    if ((getAddProductMethod = InventoryServiceGrpc.getAddProductMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getAddProductMethod = InventoryServiceGrpc.getAddProductMethod) == null) {
          InventoryServiceGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<dynamiccalls.Inventory.ProductRequest, dynamiccalls.Inventory.AddProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dynamiccalls.Inventory.ProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dynamiccalls.Inventory.AddProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("addProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub>() {
        @java.lang.Override
        public InventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceStub(channel, callOptions);
        }
      };
    return InventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub>() {
        @java.lang.Override
        public InventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return InventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub>() {
        @java.lang.Override
        public InventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceFutureStub(channel, callOptions);
        }
      };
    return InventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Definicja usługi zarządzającej inwentarzem produktów.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Metoda umożliwiająca dodanie nowego produktu do inwentarza.
     * </pre>
     */
    default void addProduct(dynamiccalls.Inventory.ProductRequest request,
        io.grpc.stub.StreamObserver<dynamiccalls.Inventory.AddProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InventoryService.
   * <pre>
   * Definicja usługi zarządzającej inwentarzem produktów.
   * </pre>
   */
  public static abstract class InventoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InventoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InventoryService.
   * <pre>
   * Definicja usługi zarządzającej inwentarzem produktów.
   * </pre>
   */
  public static final class InventoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InventoryServiceStub> {
    private InventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Metoda umożliwiająca dodanie nowego produktu do inwentarza.
     * </pre>
     */
    public void addProduct(dynamiccalls.Inventory.ProductRequest request,
        io.grpc.stub.StreamObserver<dynamiccalls.Inventory.AddProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InventoryService.
   * <pre>
   * Definicja usługi zarządzającej inwentarzem produktów.
   * </pre>
   */
  public static final class InventoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Metoda umożliwiająca dodanie nowego produktu do inwentarza.
     * </pre>
     */
    public dynamiccalls.Inventory.AddProductResponse addProduct(dynamiccalls.Inventory.ProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InventoryService.
   * <pre>
   * Definicja usługi zarządzającej inwentarzem produktów.
   * </pre>
   */
  public static final class InventoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Metoda umożliwiająca dodanie nowego produktu do inwentarza.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<dynamiccalls.Inventory.AddProductResponse> addProduct(
        dynamiccalls.Inventory.ProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PRODUCT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((dynamiccalls.Inventory.ProductRequest) request,
              (io.grpc.stub.StreamObserver<dynamiccalls.Inventory.AddProductResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              dynamiccalls.Inventory.ProductRequest,
              dynamiccalls.Inventory.AddProductResponse>(
                service, METHODID_ADD_PRODUCT)))
        .build();
  }

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dynamiccalls.Inventory.ExecutorService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InventoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getAddProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
