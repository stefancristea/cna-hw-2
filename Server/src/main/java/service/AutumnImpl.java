package service;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import misc.Helper;
import misc.Sign;
import proto.AutumnServiceGrpc;
import proto.Gate;

import java.util.ArrayList;

public class AutumnImpl extends AutumnServiceGrpc.AutumnServiceImplBase
{
    ArrayList<Sign> starSigns;

    AutumnImpl()
    {
        try
        {
            starSigns = Helper.ReadFile("data/autumn.txt");
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getStarSign(Gate.CalendarDate request, StreamObserver<Gate.StarSign> responseObserver)
    {
        for (Sign starSign : starSigns)
        {
            if (starSign.containsDate(request.getDate()))
            {
                responseObserver.onNext(Gate.StarSign.newBuilder().setSign(starSign.toString()).build());
                responseObserver.onCompleted();

                return;
            }
        }

        Status status = Status.INVALID_ARGUMENT.withDescription("[AUTUMN] Can't get star sign information from date");
        responseObserver.onError(status.asRuntimeException());
    }
}
