package com.example.gopinath.citizenmax.Citizen;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by Gopinath on 6/7/2016.
 */
public class CitizenMenuFragmentAdapter extends FragmentPagerAdapter
{

    public CitizenMenuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Fragment getItem(int position)
    {
        // TODO Auto-generated method stub
        Fragment fragment = new Fragment();
        switch (position) {
          /*  case 0:
                fragment = new ReportInfraction();
                break;

            case 1:
                fragment = new YourAccount();
                break;

            case 2:
                fragment = new NewsAlerts();
                break;

            case 3:
                fragment = new CostomerHq();
                break;*/

        }

            return fragment;
    }
}
