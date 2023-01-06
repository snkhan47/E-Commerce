package com.anas.ecommerce.dto;

import com.anas.ecommerce.entity.Address;
import com.anas.ecommerce.entity.Customer;
import com.anas.ecommerce.entity.Order;
import com.anas.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
