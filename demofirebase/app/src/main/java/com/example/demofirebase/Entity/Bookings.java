package com.example.demofirebase.Entity;

import com.example.demofirebase.Entity.Pets;

public class Bookings{
    Float Price;
    String BookDate;
    String BookAdress;
    String Notes;
    String Payment;
    Pets PetID;

    public Bookings() {
    }

    public Bookings(Float price, String bookDate, String bookAdress, String notes, String payment) {
        Price = price;
        BookDate = bookDate;
        BookAdress = bookAdress;
        Notes = notes;
        Payment = payment;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public String getBookDate() {
        return BookDate;
    }

    public void setBookDate(String bookDate) {
        BookDate = bookDate;
    }

    public String getBookAdress() {
        return BookAdress;
    }

    public void setBookAdress(String bookAdress) {
        BookAdress = bookAdress;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String payment) {
        Payment = payment;
    }
}
