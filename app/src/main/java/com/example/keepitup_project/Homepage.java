package com.example.keepitup_project;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {

    TextView greetingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_layout); // Use your layout file name here

        greetingText = findViewById(R.id.text_greeting); // ID from homepage_layout.xml

        String username = getIntent().getStringExtra("USERNAME");

        if (username != null && !username.isEmpty()) {
            String formatted = username.substring(0, 1).toUpperCase() + username.substring(1);
            greetingText.setText("Hello " + formatted);
        } else {
            greetingText.setText("Hello!");
        }
    }
}
