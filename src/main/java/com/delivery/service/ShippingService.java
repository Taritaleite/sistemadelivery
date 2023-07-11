package com.delivery.service;


//frete

import com.delivery.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shippingValue (Order order) {

        if (order.getValueBasic()< 100.00) {
            return 20.00;
        } else if (order.getValueBasic() > 100.00 && order.getValueBasic() < 200.00) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
