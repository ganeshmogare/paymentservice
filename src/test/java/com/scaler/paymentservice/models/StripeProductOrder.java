package com.scaler.paymentservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StripeProductOrder {
    private Long productId;
    private String stripePriceId;
    private String stripeProductId;
}
