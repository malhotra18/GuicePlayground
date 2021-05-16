package com.drawingapp.main;

import com.drawingapp.module.AppModule;
import com.drawingapp.requests.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * This time we will use guice to create objects
 */
public class GuiceDemo2 {

    private static final String SQUARE_REQ = "SQUARE";

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }

    private static void sendRequest(String request) {
        if (request.equals(SQUARE_REQ)) {
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest squareRequest = injector.getInstance(SquareRequest.class);
            squareRequest.makeRequest();
        }
    }
}
