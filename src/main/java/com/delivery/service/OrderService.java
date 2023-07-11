package com.delivery.service;


import com.delivery.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double totalValue (Order order) {
        return order.getValueBasic() - (order.getValueBasic() * order.getDiscout()/100)
                + shippingService.shippingValue(order);
    }

}





