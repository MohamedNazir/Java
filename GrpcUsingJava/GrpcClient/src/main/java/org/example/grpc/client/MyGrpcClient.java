package org.example.grpc.client;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.grpc.EmployeeRequest;
import org.example.grpc.EmployeeResponse;
import org.example.grpc.EmployeeServiceGrpc;
import org.example.grpc.EmployeeType;


public class MyGrpcClient {
  public static void main(String[] args) throws InterruptedException {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
        .usePlaintext()
        .build();

    EmployeeServiceGrpc.EmployeeServiceBlockingStub stub =
            EmployeeServiceGrpc.newBlockingStub(channel);

    EmployeeResponse helloResponse = stub.getEmployeeDetails(
        EmployeeRequest.newBuilder()
            .setName("Rizan")
            .setAge(18)
            .clearBagOfTricks().putBagOfTricks("Games", "Cricket")
            .build());

    System.out.println(helloResponse.getGreeting());

    channel.shutdown();
  }
}