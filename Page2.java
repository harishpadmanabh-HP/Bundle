package com.example.user.bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        textView=(TextView)findViewById(R.id.textview);
        Bundle bun=getIntent().getExtras();

        String b=bun.getString("key");
        Log.e("message",b);
        textView.setText(b);
    }
}
