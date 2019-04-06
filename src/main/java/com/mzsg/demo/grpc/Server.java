package com.mzsg.demo.grpc;

import java.io.IOException;

import com.mzsg.demo.grpc.qryaccount.impl.QryAccountServiceImpl;

public class Server {

       private static int port = 8883;
        private static io.grpc.Server server;

        public void run() {
            server = io.grpc.ServerBuilder.forPort(port).addService(new QryAccountServiceImpl()).build();
            try {
                server.start();
                System.out.println("Server start success on port:" + port);
                server.awaitTermination();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        public static void main(String[] args) {
            Server server = new Server();
            server.run();
        }
}