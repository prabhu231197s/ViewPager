package com.example.prabhusivanandam.dummy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Prabhu Sivanandam on 04-May-17.
 */

public class Launcher extends AppCompatActivity {
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher);
        pager=(ViewPager)findViewById(R.id.pager);
        Adapter adapter=new Adapter(this);
        pager.setAdapter(adapter);
    }
}
