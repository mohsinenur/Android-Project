package com.daowat.tablignews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ijtima_date_2017 extends AppCompatActivity  implements View.OnClickListener {

    Button button_1st_sec_dist_2017;
    Button button_1st_sec_map_2017;
    String text1;
    String text2;
    String text3;
    String text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_ijtima_date_2017);

        button_1st_sec_dist_2017 = (Button) findViewById(R.id.button_1st_sec_dist_2017);
        button_1st_sec_map_2017 = (Button) findViewById(R.id.button_1st_sec_map_2017);


        button_1st_sec_dist_2017.setOnClickListener(this);
        button_1st_sec_map_2017.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_1st_sec_dist_2017:
                Intent i2 = new Intent(this, first_sec_district_2017.class);
                text1 = "২০১৭ ইজতিমার ১ম ধাপের জেলা সমুহঃ";
                text2 = "১। ঢাকা ১২ - ১৬, ২। গাজীপুর, ৩। মানিকগঞ্জ, ৪। শরিয়তপুর, ৫। গোপালগঞ্জ, ৬। গোপালগঞ্জ, ৭। রংপুর, ৮। জয়পুরহাট, ৯। চাপাইনবাবগঞ্জ, ১০। মৌলভীবাজার, ১১। রাঙ্গামাটি, ১২। বান্দরবন, ১৩। খাগড়াছড়ি, ১৪। বি-বাড়িয়া, ১৫। যশোর, ১৬। সাতক্ষীরা, ১৭। ময়মনসিংহ";
                text3 = "২০১৭ ইজতিমার ২য় ধাপের জেলা সমুহঃ";
                text4 = "১। ঢাকা ১৭ - ২১, ২। কিশোরগঞ্জ, ৩। রাজবাড়ী, ৪। মেহেরপুর, ৫। লালমনিরহাট, ৬। লালমনিরহাট, ৭। পাবনা, ৮। নওগা, ৯। চাঁদপুর, ১০। নোয়াখালী, ১১। কক্সবাজার ,১২। হবিগঞ্জ, ১৩। কুষ্টিয়া, ১৪। বাগেরহাট, ১৫। বরিশাল, ১৬। বরগুনা, ১৭। মুন্সিগঞ্জ";
                i2.putExtra("con", text1);
                i2.putExtra("dist", text2);

                i2.putExtra("con2", text3);
                i2.putExtra("dist2", text4);
                startActivity(i2);
                break;

            case R.id.button_1st_sec_map_2017:
                startActivity(new Intent(this, first_sec_map_2017.class));
                break;
        }
    }
}