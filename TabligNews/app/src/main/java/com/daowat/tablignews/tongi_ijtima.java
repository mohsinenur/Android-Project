package com.daowat.tablignews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class tongi_ijtima extends AppCompatActivity implements View.OnClickListener {

    Button button_ijtima_2017;
    Button button_ijtima_2016;
    Button button_ijtima_2015;
    Button button_ijtima_2014;
    Button button_info_nmbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_tongi_ijtima);

        button_ijtima_2017 = (Button) findViewById(R.id.button_ijtima_2017);
        button_ijtima_2016 = (Button) findViewById(R.id.button_ijtima_2016);
        button_ijtima_2015 = (Button) findViewById(R.id.button_ijtima_2015);
        button_ijtima_2014 = (Button) findViewById(R.id.button_ijtima_2014);
        button_info_nmbr = (Button) findViewById(R.id.button_info_nmbr);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_ijtima_2017:
                startActivity(new Intent(this, ijtima_date_2017.class));
                break;

            case R.id.button_ijtima_2016:
                startActivity(new Intent(this, ijtima_date_2016.class));
                break;

            case R.id.button_ijtima_2015:
                startActivity(new Intent(this, ijtima_date_2015.class));
                break;

            case R.id.button_ijtima_2014:
                startActivity(new Intent(this, total_khuruj_2014.class));
                break;

        }
    }

}
