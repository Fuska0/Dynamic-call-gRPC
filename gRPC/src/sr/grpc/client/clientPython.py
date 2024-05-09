
import grpc
import sys

sys.path.append('./gen')
import ExecutorService_pb2
import ExecutorService_pb2_grpc

class GrpcClient:
    def __init__(self, remote_host, remote_port):
        self.channel = grpc.insecure_channel(f"{remote_host}:{remote_port}")
        self.stub = ExecutorService_pb2_grpc.InventoryServiceStub(self.channel)

    def shutdown(self):
        self.channel.close()

    def test(self):
        while True:
            line = input("==> ")
            if line == "add":
                request = ExecutorService_pb2.ProductRequest(
                    productId="C1",
                    name="Cola",
                    price=4,
                    quantity=100
                )
                response = self.stub.addProduct(request)
                print(response)
            elif line in ["x", ""]:
                self.shutdown()
                return
            else:
                print("???")

def main():
    client = GrpcClient("127.0.0.5", 50051)
    client.test()

if __name__ == "__main__":
    main()
