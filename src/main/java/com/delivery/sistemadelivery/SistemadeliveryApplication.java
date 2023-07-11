package com.delivery.sistemadelivery;

import com.delivery.entities.Order;
import com.delivery.service.OrderService;
import com.delivery.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.delivery"})
public class SistemadeliveryApplication implements CommandLineRunner{

    @Autowired
    private OrderService orderService;
    public static void main(String[] args) {
        SpringApplication.run(SistemadeliveryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150.00, 20.0);
        System.out.println("Pedido Codigo: " + order.getCode());
        System.out.printf("Valor Total: R$ %.2f%n", orderService.totalValue(order));
    }
}
