package com.example.ativity;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        TextView textView = findViewById(R.id.textView);
        ImageView imageView = findViewById(R.id.imageView2);
        String stringResource = getResources().getString(R.string.change_photo);
        Bitmap imageResource = BitmapFactory.decodeResource(getResources(), R.drawable.profile_picture);
        textView.setText(stringResource);
        imageView.setImageBitmap(imageResource);
    }
}