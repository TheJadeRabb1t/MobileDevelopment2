package com.example.ativity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle arguments = getIntent().getExtras();
        String mail = arguments.get("mail").toString();
        String password = arguments.get("password").toString();
        TextView mailView = findViewById(R.id.mail);
        TextView passwordView = findViewById(R.id.password);
        mailView.setText(mail);
        passwordView.setText(password);


        Button return_btn = findViewById(R.id.return_btn);
        return_btn.setOnClickListener(view -> {
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}