package com.example.keepitup_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameInput, passwordInput;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Load the layout

        // Connect UI elements with code
        usernameInput = findViewById(R.id.editTextText2);
        passwordInput = findViewById(R.id.field_password);
        loginButton = findViewById(R.id.login_button);

        // What happens when "Log In" is clicked
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get text from input fields
                String username = usernameInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                // Check if fields are not empty
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Move to next screen and pass the username
                    Intent intent = new Intent(MainActivity.this, Homepage.class);
                    intent.putExtra("USERNAME", username);
                    startActivity(intent);

                }
            }
        });
    }
}
