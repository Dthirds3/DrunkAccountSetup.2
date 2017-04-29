package com.example.android.drunkaccountsetup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Accsetupact extends AppCompatActivity {

    boolean ImMAle;
    boolean ImFemale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accsetupact);


    }

    private void done(View view) {
        EditText hight = (EditText) findViewById(R.id.etHight);
        String shight = hight.getText().toString();
        double HightValue = Double.parseDouble(shight);
        EditText Wight = (EditText) findViewById(R.id.etWidth);
        String sWight = Wight.getText().toString();
        double WightValue = Double.parseDouble(sWight);
        RadioButton M = (RadioButton) findViewById(R.id.rbMale);
        M.isChecked();
        RadioButton F = (RadioButton) findViewById(R.id.rbFemale);
        F.isChecked();
        if (M.isSelected())
            ImMAle = Boolean.TRUE;
        if (F.isSelected())
            ImFemale = Boolean.TRUE;
        if (ImFemale = true)


        this.finish();
    }



}
