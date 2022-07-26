package com.example.demofirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.demofirebase.Entity.Users;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
EditText txtName, txtPhoneNo, txtEmails, txtPass;
Button bttSave;
DatabaseReference reff;
Users users;
long maxid =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = (EditText) findViewById(R.id.txtName);
        txtPhoneNo = (EditText) findViewById(R.id.txtPhoneNo);
        txtEmails = (EditText) findViewById(R.id.txtEmails);
        txtPass = (EditText) findViewById(R.id.txtPass);
        bttSave = (Button) findViewById(R.id.bttSave);

        users = new Users();

        reff = FirebaseDatabase.getInstance().getReference().child("Users");
//
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists())
                    maxid = (snapshot.getChildrenCount());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        bttSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer PhoneNo = Integer.parseInt(txtPhoneNo.getText().toString().trim());
                String Emails = txtEmails.getText().toString().trim();
                String Pass = txtPass.getText().toString().trim();
                String Name = txtName.getText().toString().trim();

                users.setUserName(Name);
                users.setPhoneNo(PhoneNo);
                users.setEmail(Emails);
                users.setPassword(Pass);


                reff.child(String.valueOf(maxid+1)).setValue(users);

                Toast.makeText( MainActivity.this, "Data Inserted Succesfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}


