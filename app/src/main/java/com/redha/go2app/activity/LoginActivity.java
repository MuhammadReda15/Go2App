package com.redha.go2app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.redha.go2app.R;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username,password;
    protected void onCreate(Bundle saveInstancestate){
        super.onCreate(saveInstancestate);

        setContentView(R.layout.login_relatif);

        login = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().toUpperCase().equals("REDHA")) {
                    Login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(), "Salah password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Login_sukses() {
        String userlogin = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirim username ke tampilan utama
        i.putExtra("Username",userlogin);
        startActivity(i);
    }
}
