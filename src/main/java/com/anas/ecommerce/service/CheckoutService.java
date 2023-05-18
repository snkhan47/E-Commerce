package com.anas.ecommerce.service;

import com.anas.ecommerce.dto.PaymentInfo;
import com.anas.ecommerce.dto.Purchase;
import com.anas.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
