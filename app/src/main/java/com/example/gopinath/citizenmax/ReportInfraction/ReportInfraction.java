package com.example.gopinath.citizenmax.ReportInfraction;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import com.example.gopinath.citizenmax.R;

public class ReportInfraction extends Fragment {
    TextView GoReportViolation;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.report_infraction, container, false);
        //Inflate the layout for this fragment
        GoReportViolation = (TextView) view.findViewById(R.id.GoReportViolation);
      /*  GoReportViolation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ReportViolation.class);
                startActivity(intent);
            }
        });*/
        return view;

    }
}