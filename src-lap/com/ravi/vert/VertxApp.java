package com.ravi.vert;
import io.vertx.core.Vertx;

public class VertxApp {

	public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new MyVerticle());
        System.out.println(vertx.toString());
    }
}
