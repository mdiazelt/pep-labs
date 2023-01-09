package com.revature;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
                //implement logic here
           
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
                //implement logic here

                //retrieve the json string from the request body
                String jsonString = ctx.body();

                //utilize jackson to convert the json string to a user object
                Problem2 problem2 = ObjectMapper.readValue(jsonString, Problem2.class);

                //we need to let the request know we will send back json in the body
                ctx.contentType("App/json"); 

                //change the last name
                problem2.artistName("Beatles");
            
               //utilize jackson convert back the user object to a json string
               String jsonStringToBeReturned = ObjectMapper.writeValueAsString(problem2);

                //return the json string in the response body
                ctx.result(jsonStringToBeReturned);        
            });


        return app;
    }
    
}
