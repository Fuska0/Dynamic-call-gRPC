# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc
import warnings

import ExecutorService_pb2 as ExecutorService__pb2

GRPC_GENERATED_VERSION = '1.63.0'
GRPC_VERSION = grpc.__version__
EXPECTED_ERROR_RELEASE = '1.65.0'
SCHEDULED_RELEASE_DATE = 'June 25, 2024'
_version_not_supported = False

try:
    from grpc._utilities import first_version_is_lower
    _version_not_supported = first_version_is_lower(GRPC_VERSION, GRPC_GENERATED_VERSION)
except ImportError:
    _version_not_supported = True

if _version_not_supported:
    warnings.warn(
        f'The grpc package installed is at version {GRPC_VERSION},'
        + f' but the generated code in ExecutorService_pb2_grpc.py depends on'
        + f' grpcio>={GRPC_GENERATED_VERSION}.'
        + f' Please upgrade your grpc module to grpcio>={GRPC_GENERATED_VERSION}'
        + f' or downgrade your generated code using grpcio-tools<={GRPC_VERSION}.'
        + f' This warning will become an error in {EXPECTED_ERROR_RELEASE},'
        + f' scheduled for release on {SCHEDULED_RELEASE_DATE}.',
        RuntimeWarning
    )


class InventoryServiceStub(object):
    """Definicja usługi zarządzającej inwentarzem produktów.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.addProduct = channel.unary_unary(
                '/dynamiccalls.Inventory.InventoryService/addProduct',
                request_serializer=ExecutorService__pb2.ProductRequest.SerializeToString,
                response_deserializer=ExecutorService__pb2.AddProductResponse.FromString,
                _registered_method=True)


class InventoryServiceServicer(object):
    """Definicja usługi zarządzającej inwentarzem produktów.
    """

    def addProduct(self, request, context):
        """Metoda umożliwiająca dodanie nowego produktu do inwentarza.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_InventoryServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'addProduct': grpc.unary_unary_rpc_method_handler(
                    servicer.addProduct,
                    request_deserializer=ExecutorService__pb2.ProductRequest.FromString,
                    response_serializer=ExecutorService__pb2.AddProductResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'dynamiccalls.Inventory.InventoryService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class InventoryService(object):
    """Definicja usługi zarządzającej inwentarzem produktów.
    """

    @staticmethod
    def addProduct(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(
            request,
            target,
            '/dynamiccalls.Inventory.InventoryService/addProduct',
            ExecutorService__pb2.ProductRequest.SerializeToString,
            ExecutorService__pb2.AddProductResponse.FromString,
            options,
            channel_credentials,
            insecure,
            call_credentials,
            compression,
            wait_for_ready,
            timeout,
            metadata,
            _registered_method=True)