package com.example.gopinath.citizenmax.Citizen;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.gopinath.citizenmax.CustomerHq.CostomerHq;
import com.example.gopinath.citizenmax.EngageMyNeighbourhood.EngageMyNeighbourhood;
import com.example.gopinath.citizenmax.MySaftyTracker.MySaftyTracker;
import com.example.gopinath.citizenmax.NewsAlerts.NewsAlerts;
import com.example.gopinath.citizenmax.R;
import com.example.gopinath.citizenmax.ReportInfraction.ReportInfraction;

public class CitizenMenuAdditional extends AppCompatActivity {
    LinearLayout one, two, three, four, fifth, Six;
    TextView MenuText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.citizen_menu_additional);
        one = (LinearLayout) findViewById(R.id.first);
        two = (LinearLayout) findViewById(R.id.second);
        three = (LinearLayout) findViewById(R.id.third);
        four = (LinearLayout) findViewById(R.id.fourth);
        fifth = (LinearLayout) findViewById(R.id.fifth);
        Six = (LinearLayout) findViewById(R.id.Six);
        MenuText5 = (TextView) findViewById(R.id.MenuText5);
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goMySafty = new Intent(getApplicationContext(), MySaftyTracker.class);
                startActivity(goMySafty);
            }
        });

    }

    public void selectFrag(View view) {
        Fragment fr;

        if (view == findViewById(R.id.first)) {
            fr = new ReportInfraction();
            one.setBackgroundResource(R.drawable.menu_layout_background);
            //one.setBackgroundColor(Color.parseColor("#ffffff"));
            two.setBackgroundColor(Color.parseColor("#ffffff"));
            three.setBackgroundColor(Color.parseColor("#ffffff"));
            four.setBackgroundColor(Color.parseColor("#ffffff"));
            fifth.setBackgroundColor(Color.parseColor("#4ed534"));
            MenuText5.setTextColor(Color.parseColor("#ffffff"));
        } else if (view == findViewById(R.id.second)) {
            fr = new YourAccount();
            one.setBackgroundColor(Color.parseColor("#ffffff"));
            two.setBackgroundResource(R.drawable.menu_layout_background);
            // two.setBackgroundColor(Color.parseColor("#ffffff"));
            three.setBackgroundColor(Color.parseColor("#ffffff"));
            four.setBackgroundColor(Color.parseColor("#ffffff"));
            fifth.setBackgroundColor(Color.parseColor("#4ed534"));
            MenuText5.setTextColor(Color.parseColor("#ffffff"));
        } else if (view == findViewById(R.id.third)) {
            fr = new NewsAlerts();
            one.setBackgroundColor(Color.parseColor("#ffffff"));
            two.setBackgroundColor(Color.parseColor("#ffffff"));
            three.setBackgroundResource(R.drawable.menu_layout_background);
            //three.setBackgroundColor(Color.parseColor("#ffffff"));
            four.setBackgroundColor(Color.parseColor("#ffffff"));
            fifth.setBackgroundColor(Color.parseColor("#4ed534"));
            MenuText5.setTextColor(Color.parseColor("#ffffff"));
        } else if (view == findViewById(R.id.fourth)) {
            fr = new CostomerHq();
            one.setBackgroundColor(Color.parseColor("#ffffff"));
            two.setBackgroundColor(Color.parseColor("#ffffff"));
            three.setBackgroundColor(Color.parseColor("#ffffff"));
            four.setBackgroundResource(R.drawable.menu_layout_background);
            // four.setBackgroundColor(Color.parseColor("#ffffff"));
            fifth.setBackgroundColor(Color.parseColor("#4ed534"));
            MenuText5.setTextColor(Color.parseColor("#ffffff"));

        } else {
            fr = new EngageMyNeighbourhood();
            //fifth.setBackgroundResource(R.drawable.menu_layout_background);
            one.setBackgroundColor(Color.parseColor("#ffffff"));
            two.setBackgroundColor(Color.parseColor("#ffffff"));
            three.setBackgroundColor(Color.parseColor("#ffffff"));
            four.setBackgroundColor(Color.parseColor("#ffffff"));
            fifth.setBackgroundResource(R.drawable.menu_layout_background);
            MenuText5.setTextColor(Color.parseColor("#000000"));
            // four.setBackgroundColor(Color.parseColor("#ffffff"));
        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }
}
