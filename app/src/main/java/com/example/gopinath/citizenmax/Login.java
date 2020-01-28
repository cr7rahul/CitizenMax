package com.example.gopinath.citizenmax;

import android.content.Intent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gopinath.citizenmax.Citizen.CitizenMenu;
import com.example.gopinath.citizenmax.Citizen.CitizenMenuAdditional;
import com.example.gopinath.citizenmax.Registration.Registration;

public class Login extends AppCompatActivity {
Button login;
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login= (Button) findViewById(R.id.login);
        register= (TextView) findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMenu=new Intent(getApplicationContext(),CitizenMenuAdditional.class);
                startActivity(goMenu);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goRegister= new Intent(getApplicationContext(), Registration.class);
                startActivity(goRegister);
            }
        });
    }
}
