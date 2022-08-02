package tuan.aprotrain.projectpetcare.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;

import tuan.aprotrain.projectpetcare.R;
import tuan.aprotrain.projectpetcare.entity.Users;

public class UserAdd extends AppCompatActivity {
    long id = 0;
    int count=0;
    Users users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Users");



//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                if (snapshot.exists())
//                    id = (snapshot.getChildrenCount());
//            }
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
        reference.runTransaction(new Transaction.Handler() {
            @Override
            public Transaction.Result doTransaction(MutableData mutableData) {
                if (mutableData.getValue() == null) {
                    mutableData.setValue(1);
                } else {
                    count = mutableData.getValue(Integer.class);


                }
                return Transaction.success(mutableData);
            }

            @Override
            public void onComplete(DatabaseError databaseError, boolean success, DataSnapshot dataSnapshot) {
                // Analyse databaseError for any error during increment
                Toast.makeText(UserAdd.this, "Cannot insert", Toast.LENGTH_SHORT).show();
            }
        });


        users = new Users();
        users.setUserId(count+1);
        users.setUserName("Nguyen");
        users.setEmail("nguyen@gmail.com");
        users.setPhoneNo("12345657890");
        users.setPassword("nguyen2909");
        users.setUserToken("d9i4eek0T7CWjUZkFJdBD3:APA91bHV_CBO_HJdGCY504Jg296o6aoznrHSLpTLgEMxVr4L" +
         "DDJEXxCVH4DnPLIa3wYy-LJIUBghHauoSC-L3EdLoj2MgcqECHiSKLADjlcdOs6TXqc9q84ZDSzF1qzEmMPqaiy7EYD2");
        users.setAdminStatus(true);
        reference.child(String.valueOf(id+1)).setValue(users);

        
    }
}