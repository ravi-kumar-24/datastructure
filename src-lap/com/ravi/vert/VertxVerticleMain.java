package com.ravi.vert;
import io.vertx.core.Vertx;

public class VertxVerticleMain {

	public static void main(String[] args) throws InterruptedException {
        Vertx vertx = Vertx.vertx();

        vertx.deployVerticle(new BasicVerticle());
		/*
		 * vertx.deployVerticle(new BasicVerticle(), stringAsyncResult -> {
		 * System.out.println("BasicVerticle deployment complete"); });
		 */
        
    }
}
