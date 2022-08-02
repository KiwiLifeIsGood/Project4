package tuan.aprotrain.projectpetcare.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import tuan.aprotrain.projectpetcare.R;
import tuan.aprotrain.projectpetcare.entity.Bookings;
import tuan.aprotrain.projectpetcare.entity.Pets;

public class BookingAdd extends AppCompatActivity {
long id = 0;
Bookings bookings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_add);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Bookings");



        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                    id = (snapshot.getChildrenCount());
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        bookings = new Bookings();
        bookings.setBookingId(id+1);
        bookings.setBookingAddress("285 Doi Can");
        bookings.setBookingDate("31/08/2022");
        bookings.setPrice(350000f);
        bookings.setPayment("Tien mat");
        bookings.setNotes("Cho em son mong chan cho meo");

        reference.child(String.valueOf(id+1)).setValue(bookings);
    }
}