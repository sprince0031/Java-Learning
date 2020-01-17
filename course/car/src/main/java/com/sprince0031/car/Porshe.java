package com.sprince0031.car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.Duration;

public class Porshe implements Car, Asset, Property, Loggable {

    public void drive() {
        System.out.println("Porshe driving...");
    }

    public int value() {
        return 188960;
    }

    public String owner() {
        return "Manoj. M";
    }

    public String message() {
        return "Property of Manoj. M";
    }

    BufferedReader stringInput = new BufferedReader(new InputStreamReader(System.in));
    private boolean pluggedIn = false;
    double charge = 0.0, range = 0.0;
    Instant chargeStart, chargeStop;
    Duration chargeDuration;
    public boolean plugInOut() {
        String ch = "";
        System.out.print("Do you want to plug in/plug out the Tycan? (in|out): ");
        try {
            ch = stringInput.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (ch.equals("in")) {
            pluggedIn = true;
            chargeStart = Instant.now();
            System.out.println("Tycan is now charging...");
        } else {
            pluggedIn = false;
            chargeStop = Instant.now();
            chargeDuration = Duration.between(chargeStart, chargeStop);
            charge = chargeDuration.toMinutes() * 1.2;
            System.out.println("Charge time elapsed is " + chargeDuration.toMinutes() + " and current charge level is " + charge);
        }
        return pluggedIn;
    }

    public double checkCarRange() {
        System.out.println("Calculating estimated range left...");
        range = charge * 5.0;
        return range;
    }

    public void close() throws IOException {
        stringInput.close();
    }
}