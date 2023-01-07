package com.revature;

import io.javalin.Javalin;

public class JavalinSingleton {

    
    /**
     * Lab: Create an HTTP GET endpoint at the url: http://localhost:9000/hello that will return the string "Hello
     * World" in the response.
     * 
     * Note: Please refer to the "CreatingEndpoints.MD" file for more assistance if needed.
     */
    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        //write endpoint here
        // HTTP GET REQUEST to http://localhost:9000/get-request
        app.get("/get-request", ctx -> {
            ctx.result("get request endpoint hit!");
        });
        
        // HTTP POST REQUEST to http://localhost:9000/post-request
        app.post("/post-request", ctx -> {
            //logic to be executed when this endpoint is hit
            ctx.result("post request endpoint hit!");
        });

        return app;
    }
    
}
