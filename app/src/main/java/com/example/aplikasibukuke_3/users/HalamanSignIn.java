package com.example.aplikasibukuke_3.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aplikasibukuke_3.R;

public class HalamanSignIn extends AppCompatActivity {

    Button btnKembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_sign_in);

        getSupportActionBar().hide();

        btnKembali = (Button) findViewById(R.id.btnSignIn);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HalamanSignIn.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
