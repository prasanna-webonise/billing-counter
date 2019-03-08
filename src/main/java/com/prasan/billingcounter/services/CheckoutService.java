package com.prasan.billingcounter.services;

import com.prasan.billingcounter.pojos.CheckoutRequest;
import com.prasan.billingcounter.pojos.CheckoutResponse;

public interface CheckoutService {
    CheckoutResponse checkoutCart(CheckoutRequest checkoutRequest);
}
