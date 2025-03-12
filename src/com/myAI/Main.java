package com.myAI;

import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        

        //Variables
        String timeOut;
        String response;

        //Time Check
        LocalTime now = LocalTime.now();

        if (now.isBefore(LocalTime.NOON)){
            timeOut = "Morning";
        } else if (now.isBefore(LocalTime.of(18,0)) && now.isAfter(LocalTime.NOON)) {
            timeOut = "Afternoon";
        } else {
            timeOut = "Evening";
        }

        //Command Prompt
        System.out.println("Good " + timeOut + ", would you like to initialize the AI? (Y/N)");
        response = in.nextLine().trim().toLowerCase();
        if (response.startsWith("y")){
            System.out.println("Initializing AI...");
            // put in AI start
        } else {
            System.out.println("AI initialization aborted. Exiting.");
        }
        in.close();
    }
}
