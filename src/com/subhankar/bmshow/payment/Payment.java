package com.subhankar.bmshow.payment;

import com.subhankar.bmshow.enums.PaymentStatus;

import java.util.Date;

public class Payment {
    private double amount;
    private Date createdOn;
    private int transactionId;
    private PaymentStatus status;
}
