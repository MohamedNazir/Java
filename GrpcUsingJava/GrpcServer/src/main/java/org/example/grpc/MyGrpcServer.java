package org.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Arrays;


public class MyGrpcServer {
  static public void main(String [] args) throws IOException, InterruptedException {
    Server server = ServerBuilder.forPort(8080)
        .addService(new EmployeeServiceImpl()).build();

    System.out.println("Starting server...");
    server.start();
    System.out.println("Server started!");
    server.awaitTermination();
  }

  public static class EmployeeServiceImpl extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    @Override
    public void getEmployeeDetails(EmployeeRequest request, StreamObserver<EmployeeResponse> responseObserver) {
      System.out.println(request);

      String greeting = String.format("Hello %s, your Hobbies are %s", request.getName(), Arrays.toString(request.getBagOfTricksMap().entrySet().toArray()));

      EmployeeResponse response = EmployeeResponse.newBuilder().setGreeting(greeting).build();

      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
  }
}