package sr.grpc.server;
import dynamiccalls.Inventory.AddProductResponse;
import dynamiccalls.Inventory.InventoryServiceGrpc;
import dynamiccalls.Inventory.ProductRequest;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class ExecutionServiceImpl extends InventoryServiceGrpc.InventoryServiceImplBase {
    public ArrayList<ProductRequest> list = new ArrayList();
    @Override
    public void addProduct(ProductRequest request, StreamObserver<AddProductResponse> responseObserver) {
        String productId = request.getProductId();
        String name = request.getName();
        float price = request.getPrice();
        int quantity = request.getQuantity();
        System.out.print(productId + " " + name + " ");
        System.out.print(price);
        System.out.print(" ");
        System.out.println(quantity);
        list.add(new ProductRequest(productId,name, price, quantity));
        System.out.println("list size: " + Integer.toString(list.size()));
        AddProductResponse response = AddProductResponse.newBuilder().setMessage("added").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
