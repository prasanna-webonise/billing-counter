package com.prasan.billingcounter.controllers;

import com.prasan.billingcounter.pojos.CheckoutRequest;
import com.prasan.billingcounter.pojos.CheckoutResponse;
import com.prasan.billingcounter.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutCounterController {

    private CheckoutService checkoutService;

    @Autowired
    CheckoutCounterController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping
    CheckoutResponse checkoutCart(@RequestBody CheckoutRequest checkoutRequest) {
        return checkoutService.checkoutCart(checkoutRequest);
    }
}
