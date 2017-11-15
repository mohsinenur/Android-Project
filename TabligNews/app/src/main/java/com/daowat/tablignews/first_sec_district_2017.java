package com.daowat.tablignews;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class first_sec_district_2017 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_first_sec_district_2017);

        Bundle b = getIntent().getExtras();
        if(b != null)
        {
            final TextView textV1 = (TextView) findViewById(R.id.first_sec_con_2017);
            final TextView textV2 = (TextView) findViewById(R.id.first_sec_dist_2017);
            final TextView textV3 = (TextView) findViewById(R.id.second_sec_con_2017);
            final TextView textV4 = (TextView) findViewById(R.id.second_sec_dist_2017);

            String conT =(String) b.get("con");
            textV1.setText(conT);
            String distL =(String) b.get("dist");
            textV2.setText(distL);

            String conT2 =(String) b.get("con2");
            textV3.setText(conT2);
            String distL2 =(String) b.get("dist2");
            textV4.setText(distL2);
        }
    }
}
