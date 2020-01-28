package com.example.gopinath.citizenmax.NewsAlerts;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import com.example.gopinath.citizenmax.Citizen.CitizenMenu;
import com.example.gopinath.citizenmax.R;

public class NewsAlerts extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        return inflater.inflate(
                R.layout.news_alerts, container, false);
    }
}
