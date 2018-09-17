package com.example.user.bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    Button bund;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt=(EditText)findViewById(R.id.edt);

        bund=(Button)findViewById(R.id.button);
         bund.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String a= edt.getText().toString();
                 Intent intent= new Intent(MainActivity.this,Page2.class);
                 intent.putExtra("key",a);
                 Log.e("message",a);
                 startActivity(intent);
             }
         });


    }
}
