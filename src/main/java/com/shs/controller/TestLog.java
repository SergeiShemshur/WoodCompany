package com.shs.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Created by sergei on 10/12/15.
 */
public class TestLog {

    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(SimpleController.class);

    public static void main(String[] args) throws IOException {
        System.out.println("====> Please insert a number from 0 to 100 : \n====> ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.valueOf(br.readLine());
        log.info("You inserted the number:"+number);
        if(number > 100) {
            log.error("You entered a wrong number!");
            throw new IOException();
        } else {
            log.debug("Number is smaller than 100, so it is correct!");
        }
    }}
