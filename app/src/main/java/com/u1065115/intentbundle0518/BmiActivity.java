package com.u1065115.intentbundle0518;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }

    public void btnClose(View view) {
        finish();
    }
}
