package com.subhankar.bmshow.booking;

import com.subhankar.bmshow.enums.BookingStatus;
import com.subhankar.bmshow.movie.Show;
import com.subhankar.bmshow.movie.ShowSeat;
import com.subhankar.bmshow.payment.Payment;

import java.util.Date;
import java.util.List;

public class Booking {
    private String bookingNumber;
    private int numberOfSeats;
    private Date createdOn;
    private BookingStatus status;

    private Show show;
    private List<ShowSeat> seats;
    private Payment payment;

    /*
     * Make payment for outstanding amount
     */
    public boolean makePayment(Payment payment) {
        //return dummy
        return true;
    }

    /**
     * Cancel existing booking
     * @return
     */
    public boolean cancel() {
        //return dummy
        return true;
    }

    /**
     * @param seats
     * allocate the seat.
     * @return
     */
    public boolean assignSeats(List<ShowSeat> seats) {
        //return dummy
        return true;
    }

}