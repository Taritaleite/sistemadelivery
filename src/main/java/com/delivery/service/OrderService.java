package com.delivery.service;


import com.delivery.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double totalValue (Order order) {
        return order.getValueBasic() - (order.getValueBasic() * order.getDiscout()/100)
                + shippingService.shippingValue(order);
    }

}





