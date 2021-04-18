package service;

import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import proto.Gate;
import proto.GateServiceGrpc;
import misc.Helper;

public class GateImpl extends GateServiceGrpc.GateServiceImplBase
{

    @Override
    public void getStarSign(Gate.CalendarDate request, StreamObserver<Gate.StarSign> responseObserver)
    {
        switch(Helper.GetSeasonFromDate(request.getDate()))
        {
            case "Winter":
            {
                new WinterImpl().getStarSign(request, responseObserver);
                break;
            }

            case "Spring":
            {
                new SpringImpl().getStarSign(request, responseObserver);
                break;
            }

            case "Summer":
            {
                new SummerImpl().getStarSign(request, responseObserver);
                break;
            }

            case "Autumn":
            {
                new AutumnImpl().getStarSign(request, responseObserver);
                break;
            }

            default:
            {
                Status status = Status.INVALID_ARGUMENT.withDescription("Can't get season information from date");
                responseObserver.onError(status.asRuntimeException());
            }
        }

    }
}
