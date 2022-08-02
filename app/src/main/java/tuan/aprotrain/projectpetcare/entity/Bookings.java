package tuan.aprotrain.projectpetcare.entity;

public class Bookings {
    private long  bookingId;
    private float price;
    private String bookingDate;
    private String bookingAddress;
    private String notes;
    private String payment;
    private long petId;

    public Bookings(){}

    public Bookings(long bookingId, float price, String bookingDate, String bookingAddress, String notes, String payment, long petId) {
        this.bookingId = bookingId;
        this.price = price;
        this.bookingDate = bookingDate;
        this.bookingAddress = bookingAddress;
        this.notes = notes;
        this.payment = payment;
        this.petId = petId;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingAddress() {
        return bookingAddress;
    }

    public void setBookingAddress(String bookingAddress) {
        this.bookingAddress = bookingAddress;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }
}
