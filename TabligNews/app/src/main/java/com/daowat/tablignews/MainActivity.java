package com.daowat.tablignews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button_tongi_ijtima;
    Button button_5_days_jor;
    Button button_infonmbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_tongi_ijtima = (Button) findViewById(R.id.button_tongi_ijtima);
        button_5_days_jor = (Button) findViewById(R.id.button_5_days_jor);
        button_infonmbr = (Button) findViewById(R.id.button_info_nmbr);

        button_tongi_ijtima.setOnClickListener(this);
        button_5_days_jor.setOnClickListener(this);
        button_infonmbr.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_tongi_ijtima:
                startActivity(new Intent(this, tongi_ijtima.class));
                break;

            case R.id.button_5_days_jor:
                startActivity(new Intent(this, jor_date_2016.class));
                break;

            case R.id.button_info_nmbr:
                startActivity(new Intent(this, msg_otherinfo.class));
                break;

        }
    }
}
