package com.daowat.tech.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class top_section_fragment extends Fragment {

    private static EditText topText;
    private static EditText buttomText;

    TopSectionListener activityComnder;

    public interface TopSectionListener {
        public void creatFrag(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityComnder = (TopSectionListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        topText = (EditText) view.findViewById(R.id.textfield1);
        buttomText = (EditText) view.findViewById(R.id.textfield2);
        final Button button = (Button) view.findViewById(R.id.clik_button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }


    //calles this when the button clicked
    public void buttonClicked(View view) {
        activityComnder.creatFrag(topText.getText().toString(), buttomText.getText().toString());
    }
}


























