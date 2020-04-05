package com.example.cleanarchitecture.booking;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@ToString
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column
    private LocalDate checkInDate;

    @Column
    private LocalDate checkOutDate;

    private Booking() { }

    public static Booking createBooking(Long userId, LocalDate checkInDate, LocalDate checkOutDate) {
        Booking booking = new Booking();
        booking.userId = userId;
        booking.checkInDate = checkInDate;
        booking.checkOutDate = checkOutDate;
        return booking;
    }

}
