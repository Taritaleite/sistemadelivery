package com.delivery.sistemadelivery;

import com.delivery.entities.Order;
import com.delivery.service.OrderService;
import com.delivery.service.ShippingService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.delivery"})
public class SistemadeliveryApplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your order code: ");
        Integer code = sc.nextInt();

        System.out.print("Enter the base amount of your order: ");
        Double basic = sc.nextDouble();

        System.out.print("Enter the discount amount for your order: ");
        Double discout = sc.nextDouble();

        Order order = new Order(code, basic, discout);

        ShippingService shippingService = new ShippingService();
        OrderService orderService = new OrderService(shippingService);

        double valueTotal = orderService.totalValue(order);

        System.out.println("Pedido Código: " + code);
        System.out.printf("Valor Total: R$ %.2f%n", valueTotal);

        sc.close();
    }
}
