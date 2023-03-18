package com.example.ativity;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liner_layout);
        Intent intent = new Intent(this, ThirdActivity.class);
        Button register_btn = findViewById(R.id.register_btn);
        ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    TextView textView = new TextView(this);
                    textView.setTextSize(20);
                    textView.setPadding(18, 18, 18, 18);
                    textView.setText("Контракт выполнен");
                    setContentView(textView);
                }
        );
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText mail = findViewById(R.id.editTextEmail);
                EditText password = findViewById(R.id.editTextPassword);
                intent.putExtra("mail", mail.getText());
                intent.putExtra("password", password.getText());
                mStartForResult.launch(intent);
            }
        });
    }
}