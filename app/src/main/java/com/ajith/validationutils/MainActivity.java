package com.ajith.validationutils;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ajith.validate.ValidateText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText nameText, mobileText, pincodeText, stateText, addressLineOne, addressLineTwo, landmarkText, cityText;
    private String nameString, mobileNumberString, pincodeString, stateTextString, addressLineOneString, addressLineTwoString, landmarkTextString, cityTextString;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.name_text);
        mobileText = findViewById(R.id.mobile_text);
        pincodeText = findViewById(R.id.pincode_text);
        stateText = findViewById(R.id.state_text);
        addressLineOne = findViewById(R.id.address_line_one);
        addressLineTwo = findViewById(R.id.address_line_two);
        landmarkText = findViewById(R.id.landmark_text);
        cityText = findViewById(R.id.city_text);
        saveBtn = findViewById(R.id.save_btn);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataInput();
                ValidateText.name(nameString, nameText);
                ValidateText.mobile(mobileNumberString, mobileText);
                ValidateText.pincode(pincodeString, pincodeText);
                ValidateText.pincode(pincodeString, pincodeText);

                if (ValidateText.name(nameString, nameText) &&
                        ValidateText.mobile(mobileNumberString, mobileText) &&
                        ValidateText.pincode(pincodeString, pincodeText) &&
                        ValidateText.pincode(pincodeString, pincodeText)) {
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    private void dataInput() {
        nameString = nameText.getText().toString().trim();
        mobileNumberString = mobileText.getText().toString().trim();
        pincodeString = pincodeText.getText().toString().trim();
        stateTextString = stateText.getText().toString().trim();
        addressLineOneString = addressLineOne.getText().toString().trim();
        addressLineTwoString = addressLineTwo.getText().toString().trim();
        landmarkTextString = landmarkText.getText().toString().trim();
        cityTextString = cityText.getText().toString().trim();


    }
}
