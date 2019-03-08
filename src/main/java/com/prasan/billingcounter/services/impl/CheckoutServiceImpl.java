package com.prasan.billingcounter.services.impl;

import com.prasan.billingcounter.pojos.InvoiceItemDetails;
import com.prasan.billingcounter.pojos.CheckoutRequest;
import com.prasan.billingcounter.pojos.CheckoutResponse;
import com.prasan.billingcounter.models.Product;
import com.prasan.billingcounter.repositories.ProductRepository;
import com.prasan.billingcounter.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private ProductRepository productRepository;

    @Autowired
    CheckoutServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public CheckoutResponse checkoutCart(CheckoutRequest checkoutRequest) {
        List<InvoiceItemDetails> invoiceItemDetails = new ArrayList<>();
        checkoutRequest.getProductEntriesList().forEach(productEntry -> {
            Optional<Product> optionalProduct = productRepository.findById(productEntry.getProductId());
            if (optionalProduct.isPresent()) {
                final Product product = optionalProduct.get();
                final float price = product.getPrice();
                final float tax = product.getCategory().getTaxPercent();
                final Integer quantity = productEntry.getQuantity();
                final float amount = price * quantity;
                invoiceItemDetails.add(new InvoiceItemDetails(product.getProductName(), quantity, product.getPrice(),
                        amount, tax, amount * (tax/100)));
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Incorrect Article code");
            }
        });
        Double totalPrice = invoiceItemDetails.stream().mapToDouble(InvoiceItemDetails::getTotalPrice).sum();
        Double totalTax = invoiceItemDetails.stream().mapToDouble(InvoiceItemDetails::getTotalTax).sum();
        return new CheckoutResponse(invoiceItemDetails, totalPrice, totalTax);
    }
}
