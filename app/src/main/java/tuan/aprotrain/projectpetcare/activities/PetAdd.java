package tuan.aprotrain.projectpetcare.activities;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.jar.Attributes;

import tuan.aprotrain.projectpetcare.R;
import tuan.aprotrain.projectpetcare.entity.Pets;

public class PetAdd extends AppCompatActivity {
//    EditText petName, petBreed, petGender, petBirth,petHeight, petWeight, petColor, petIntact, petNote;
//    Button btnSave;
    long id ;
    Pets pets;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_add);


//        petName = (EditText) findViewById(R.id.petName);
//        petBreed = (EditText) findViewById(R.id.petBreed);
//        petGender = (EditText) findViewById(R.id.petGender);
//        petBirth = (EditText) findViewById(R.id.petBirth);
//        petHeight = (EditText) findViewById(R.id.petHeight);
//        petWeight = (EditText) findViewById(R.id.petWeight);
//        petColor = (EditText) findViewById(R.id.petColor);
//        petIntact = (EditText) findViewById(R.id.petIntact);
//        petNote = (EditText) findViewById(R.id.petNote);
//        btnSave = (Button) findViewById(R.id.btnSave);
//        pets = new Pets();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Pets");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                    id = (snapshot.getChildrenCount());
//                    snapshot.getRef().setValue(null);

            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

//          btnSave.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View view) {
//                  String name = petName.getText().toString().trim();
//                  String breed = petBreed.getText().toString().trim();
//                  String gender = petGender.getText().toString().trim();
//                  String birth = petBirth.getText().toString().trim();
//                  String color = petColor.getText().toString().trim();
//                  float height = Float.parseFloat(petHeight.getText().toString());
//                  float weight = Float.parseFloat(petWeight.getText().toString());
//                  String intact = petIntact.getText().toString().trim();
//                  String note = petNote.getText().toString().trim();
//
//                  pets.setPetName(name);
//                  pets.setBreed(breed);
//                  pets.setGender(gender);
//                  pets.setBirthDate(birth);
//                  pets.setBetHeight(height);
//                  pets.setBetWeight(weight);
//                  pets.setColor(color);
//                  pets.setIntact(intact);
//                  pets.setNotes(note);
//
//                  reference.child(String.valueOf(id +1)).setValue(pets);
//
//                  Toast.makeText(PetAdd.this, "Data inserted successfully", Toast.LENGTH_LONG ).show();
//
//              }
//          });

            pets = new Pets();
            pets.setPetId(id+1);
            pets.setPetName("Hoang thuong");
            pets.setSpecies("Cat");
            pets.setBreed("American Curl Cat");
            pets.setGender("female");
            pets.setBirthDate("20/08/1990");
            pets.setPetHeight(12f);
            pets.setPetWeight(1f);
            pets.setColor("Brown");
            pets.setIntact("Intact");
            pets.setNotes("Chua tiem phong day du");

            reference.child(String.valueOf(id)).setValue(pets);

    }


}