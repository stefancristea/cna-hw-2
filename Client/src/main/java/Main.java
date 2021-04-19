import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.Gate;
import proto.GateServiceGrpc;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8999)
                .keepAliveWithoutCalls(true)
                .usePlaintext()
                .build();

        Scanner sn = new Scanner(System.in);

        System.out.println("Please insert your birth date (d/m/y): ");
        String dateString = sn.next();

        try
        {
            Helper.ValidateDate(dateString);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        GateServiceGrpc.GateServiceBlockingStub stub = GateServiceGrpc.newBlockingStub(channel);

        Gate.StarSign starSign = stub.getStarSign(Gate.CalendarDate.newBuilder().setDate(dateString).build());
        System.out.println(starSign.getSign());
    }
}
