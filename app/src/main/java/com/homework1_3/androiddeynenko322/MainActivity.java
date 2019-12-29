package com.homework1_3.androiddeynenko322;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout layoutNew = findViewById(R.id.calcNew);
        final LinearLayout layoutOld0 = findViewById(R.id.line0);
        final LinearLayout layoutOld1 = findViewById(R.id.line1);
        final LinearLayout layoutOld2 = findViewById(R.id.line2);
        final LinearLayout layoutOld3  = findViewById(R.id.line3);
        final LinearLayout layoutOld4 = findViewById(R.id.line4);
        layoutOld0.setVisibility(View.GONE);
        layoutOld1.setVisibility(View.GONE);
        layoutOld2.setVisibility(View.GONE);
        layoutOld3.setVisibility(View.GONE);
        layoutOld4.setVisibility(View.GONE);
        Button btn = findViewById(R.id.btnNewCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutNew.getVisibility() == View.VISIBLE){
                    layoutNew.setVisibility(View.GONE);
                    layoutOld0.setVisibility(View.VISIBLE);
                    layoutOld1.setVisibility(View.VISIBLE);
                    layoutOld2.setVisibility(View.VISIBLE);
                    layoutOld3.setVisibility(View.VISIBLE);
                    layoutOld4.setVisibility(View.VISIBLE);
                }else {
                    layoutNew.setVisibility(View.VISIBLE);
                    layoutOld0.setVisibility(View.GONE);
                    layoutOld1.setVisibility(View.GONE);
                    layoutOld2.setVisibility(View.GONE);
                    layoutOld3.setVisibility(View.GONE);
                    layoutOld4.setVisibility(View.GONE);
                }
            }
        });
    }
}
