package com.example.ifleetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.txtLogin);
        textView.setText(message);
    }

    public void click(View view) {
        Intent intent = new Intent(this, ViagemActivity.class);
        startActivity(intent);
    }

    public void click1(View view){
        Toast.makeText(this, "Não possui equipamentos de rastreio!", Toast.LENGTH_SHORT).show();
    }
}
