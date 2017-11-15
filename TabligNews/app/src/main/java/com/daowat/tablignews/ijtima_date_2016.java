package com.daowat.tablignews;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ijtima_date_2016 extends AppCompatActivity implements View.OnClickListener {

    Button button_1st_sec_dist_2016;
    Button button_2nd_sec_dist_2016;
    String text1;
    String text2;
    String text3;
    String text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_ijtima_date_2016);
        button_1st_sec_dist_2016 = (Button) findViewById(R.id.button_1st_sec_dist_2016);

        button_1st_sec_dist_2016.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_1st_sec_dist_2016:
                Intent i2 = new Intent(this, first_sec_district_2017.class);
                text1 = "২০১৬ ইজতিমার ১ম ধাপের জেলা সমুহঃ";
                text2 = "১। ঢাকা ১ - ৬, ২। নারায়ণগঞ্জ, ৩। শেরপুর, ৪। মাদারীপুর, ৫। সিরাজগঞ্জ, ৬। নাটোর, ৭। গাইবান্ধা, ৮। নীলফামারী, ৯। পঞ্চগড়, ১০। লক্ষীপুর, ১১। সিলেট ,১২। নড়াইল, ১৩। মাগুড়া, ১৪। পটুয়াখালি, ১৫। ভোলা, ১৬। চট্রগ্রাম, ১৭। ঝালকাঠি";
                text3 = "২০১৬ ইজতিমার ২য় ধাপের জেলা সমুহঃ";
                text4 = "১। ঢাকা ১১, ২। নেত্রকোনা,  ৩। ফরিদপুর, ৪। জামালপুর, ৫। নরসিংদী, ৬। রাজশাহী, ৭। কুড়িগ্রাম, ৮। বগুড়া, ৯। ঠাকুরগাঁও, ১০। ফেনী, ১১। কুমিল্লা ,১২। সুনামগঞ্জ, ১৩। খুলনা, ১৪। ঝিনাইদহ, ১৫। চুয়াডাঙ্গা, ১৬। পিরোজপুর";
                i2.putExtra("con", text1);
                i2.putExtra("dist", text2);
                i2.putExtra("con2", text3);
                i2.putExtra("dist2", text4);
                startActivity(i2);
                break;
        }
    }
}
