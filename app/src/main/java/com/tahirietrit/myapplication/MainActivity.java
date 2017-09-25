package com.tahirietrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.O;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView imageView;
    TextView nameTextView;
    TextView phoneTextView;
    ImageButton callButton;
    EditText someEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.profile_image);
        nameTextView = (TextView) findViewById(R.id.name_textview);
        phoneTextView = (TextView) findViewById(R.id.phone_textview);
        callButton = (ImageButton) findViewById(R.id.call_button);
        someEditText = (EditText) findViewById(R.id.edit_text);
        callButton.setOnClickListener(this);
//        callButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("Call button clicked!");
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.call_button){
            if(someEditText.getText().length()>0){
                System.out.println("typed text: "+ someEditText.getText().toString());
            }else{
                Toast.makeText(this,
                        "Please type something",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
