package com.exam.MohamedAmineRami;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    private TextInputLayout usernameLayout;
    private TextInputLayout passwordLayout;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences("ExamPrefs", Context.MODE_PRIVATE);

        usernameLayout = findViewById(R.id.usernameLayout);
        passwordLayout = findViewById(R.id.passwordLayout);

        findViewById(R.id.loginButton).setOnClickListener(v -> validateAndLogin());
    }

    private void validateAndLogin() {
        String username = usernameLayout.getEditText().getText().toString();
        String password = passwordLayout.getEditText().getText().toString();

        if (username.isEmpty()) {
            usernameLayout.setError("Username cannot be empty");
            return;
        }


        if (password.equals(getString(R.string.exam_password))) {
            sharedPreferences.edit().putString("username", username).apply();
            startActivity(new Intent(Login.this, MainActivity.class));
            finish();
        } else {
            passwordLayout.setError("Invalid password");
        }
    }
}
