package com.ravi.vert;

import io.vertx.core.AbstractVerticle;

public class BasicVerticle extends AbstractVerticle {

	@Override
    public void start() throws Exception {
        System.out.println("BasicVerticle started");
        vertx.deployVerticle(new SecondVerticle());
        
        vertx.deployVerticle(new EventBusReceiverVerticle("R1"));
        vertx.deployVerticle(new EventBusReceiverVerticle("R2"));

        Thread.sleep(3000);
        vertx.deployVerticle(new EventBusSenderVerticle());
    }
	
	 @Override
	    public void stop() throws Exception {
	        System.out.println("BasicVerticle stopped");
	    }
}
