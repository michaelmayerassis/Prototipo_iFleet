package com.example.ifleetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.pim_ifleet.MESSAGE";
    private EditText senha1;
    private String senha;
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean isEmailValid(CharSequence email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public void sendMessage(View view) {
        email = (EditText) findViewById(R.id.txtEmail);
        senha = ((EditText) findViewById(R.id.txtSenha)).getText().toString();
        if (senha.equals("123") && isEmailValid((email).getText().toString())) {
            Intent intent = new Intent(this, MenuActivity.class);
            EditText editText = email;
            String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Email ou senha invalidos!", Toast.LENGTH_SHORT).show();
        }
    }
}
