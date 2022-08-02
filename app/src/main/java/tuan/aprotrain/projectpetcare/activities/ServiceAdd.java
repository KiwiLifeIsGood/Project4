package tuan.aprotrain.projectpetcare.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import tuan.aprotrain.projectpetcare.R;
import tuan.aprotrain.projectpetcare.entity.Services;

public class ServiceAdd extends AppCompatActivity {
    EditText editTextCategoryId;
    EditText editTextServiceName;
    long serviceId;
    Button btnSave;
    long id=0;
    DatabaseReference refServices;
    private Boolean isUpdating = false;
    Services services;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_add);

        editTextCategoryId = findViewById(R.id.categoryId);
        editTextServiceName = findViewById(R.id.serviceName);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isUpdating = true;
                String cateId = editTextCategoryId.getText().toString();
                String ServiceName = editTextServiceName.getText().toString().trim();
                ServiceAdd(cateId,ServiceName);

            }
        });
    }
        public void ServiceAdd(String CategoryId, String ServiceName){
            refServices = FirebaseDatabase.getInstance().getReference().child("Services");
            services = new Services();

            refServices.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if(!isUpdating) {
                        return;
                    }
                    serviceId = snapshot.exists() ? snapshot.getChildrenCount() + 1 : 1;
                    services.setServiceId(serviceId);
                    services.setServiceName(ServiceName);
                    services.setCategoryId(CategoryId);

                    refServices.child(String.valueOf(serviceId)).setValue(services);
                    isUpdating = false;
                    Toast.makeText(ServiceAdd.this, "Data Inserted Succesfully", Toast.LENGTH_LONG).show();
                    //finish();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    isUpdating = false;
                }
            });
        }

}