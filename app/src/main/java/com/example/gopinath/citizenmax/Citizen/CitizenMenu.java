package com.example.gopinath.citizenmax.Citizen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.gopinath.citizenmax.CustomerHq.CostomerHq;
import com.example.gopinath.citizenmax.Login;
import com.example.gopinath.citizenmax.NewsAlerts.NewsAlerts;
import com.example.gopinath.citizenmax.R;


public class CitizenMenu extends FragmentActivity {
    private Toolbar toolbar;
    GridView gv;
    CitizenMenuFragmentAdapter mAdapter;
    ViewPager mPager;

    private static final String TAG_TOGGLABLE_FRAG = "TOGGLABLE_FRAG";

    private FragmentManager fragMgr;
    public static String[] prgmNameList = {
            "REPORT A INFRACTION",
            "YOUR ACCOUNT",
            "NEWS & ALERTS",
            "CUSTOMER HQ",
    };
    public static int[] prgmImages = {
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
            R.drawable.profile,
    };
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    public CitizenMenu(boolean b) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.citizen_menu);

        fragMgr = getSupportFragmentManager();
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setTitle("");
        //setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(getApplicationContext(), Login.class);
                startActivity(back);
            }
        });

        mAdapter = new CitizenMenuFragmentAdapter(getSupportFragmentManager());

        gv = (GridView) findViewById(R.id.gridView);
        gv.setAdapter(new CitizensMenuAdapter(this, prgmNameList, prgmImages));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:

                     //   Fragment fragmentItem001 = new ReportInfraction();
                     //   FragmentTransaction transaction = getFragmentManager().beginTransaction();
                     //   transaction.replace(R.id.itemDescrFragment, fragmentItem001);
                     //   transaction.commit();
                        //Toast.makeText(ItemDescrFragment.this, "" + positionBasic, Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Intent YourAccount = new Intent(getApplicationContext(), YourAccount.class);
                        startActivity(YourAccount);
                        break;
                    case 2:
                        Intent NewsAlerts = new Intent(getApplicationContext(), NewsAlerts.class);
                        startActivity(NewsAlerts);
                        break;
                    case 3:
                        Intent CostomerHq = new Intent(getApplicationContext(), CostomerHq.class);
                        startActivity(CostomerHq);
                        break;
                }
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    public void switchToFragmentA()
    {
        mPager.setCurrentItem(0);
    }
    public void switchToFragementB()
    {
        mPager.setCurrentItem(1);
    }
    public void switchToFragmentC()
    {
        mPager.setCurrentItem(2);
    }
}

