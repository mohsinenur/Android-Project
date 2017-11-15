package com.daowat.tablignews;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class five_days_jor extends AppCompatActivity implements View.OnClickListener {

    Button button_jor_2016;
    Button button_jor_2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_five_days_jor);

        button_jor_2016 = (Button) findViewById(R.id.button_jor_2016);
        button_jor_2015 = (Button) findViewById(R.id.button_jor_2015);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_jor_2016:
                startActivity(new Intent(this, jor_date_2016.class));
                break;
            case R.id.button_jor_2015:
                startActivity(new Intent(this, jor_date_2015.class));
                break;
        }
    }

}
