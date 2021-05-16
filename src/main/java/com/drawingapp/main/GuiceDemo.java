package com.drawingapp.main;

import com.drawingapp.requests.SquareRequest;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;

/**
 * This is a basic example of dependency injection, problem still persists that initialising dependencies is now
 * Responsibility of client class, this can be solve using Guice or other such frameworks.
 */
public class GuiceDemo {

    private static final String SQUARE_REQ = "SQUARE";

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }

    private static void sendRequest(String request) {
        if (request.equals(SQUARE_REQ)) {
            DrawShape drawSquare = new DrawSquare();
            SquareRequest squareRequest = new SquareRequest(drawSquare);
            squareRequest.makeRequest();
        }
    }
}
