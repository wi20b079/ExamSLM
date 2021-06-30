package com.marta;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
import java.util.Locale;


public class Random {

    @GET
    @Path("/{uptime}")
    @Produces(MediaType.TEXT_PLAIN)
    public String Random () {
       return String.valueOf(randomNumber());
    }

    public int randomNumber(){
        Random rand = new Random();
        int  upperbound=101;
        int int_rand = rand.nextInt(upperbound);
        return int_rand;
    }

    private int nextInt(int upperbound) {
    }

}
