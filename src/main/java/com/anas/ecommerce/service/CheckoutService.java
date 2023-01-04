package com.anas.ecommerce.service;

import com.anas.ecommerce.dto.Purchase;
import com.anas.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
