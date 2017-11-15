package com.daowat.tablignews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class msg_otherinfo extends AppCompatActivity implements View.OnClickListener {

    Button button_msgijtima2017;
    Button button_ijtima_nameinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_otherinfo);

        button_msgijtima2017 = (Button) findViewById(R.id.button_msgijtima2017);
        button_ijtima_nameinfo = (Button) findViewById(R.id.button_ijtima_nameinfo);

        button_msgijtima2017.setOnClickListener(this);
        button_ijtima_nameinfo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_msgijtima2017:
                startActivity(new Intent(this, ijtimamsg2017.class));
                break;

            case R.id.button_ijtima_nameinfo:
                startActivity(new Intent(this, ijtima_info_nmbr.class));
                break;

        }
    }
}
