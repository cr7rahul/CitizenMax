package com.example.gopinath.citizenmax.Registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.gopinath.citizenmax.Login;
import com.example.gopinath.citizenmax.R;


public class Registration extends AppCompatActivity {
Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(), Login.class);
                startActivity(back);
            }
        });
        cancel= (Button) findViewById(R.id.btn_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backLogin=new Intent(getApplicationContext(),Login.class);
                startActivity(backLogin);
            }
        });
    }
}
