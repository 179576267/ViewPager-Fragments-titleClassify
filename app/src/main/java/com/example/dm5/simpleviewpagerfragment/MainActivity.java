package com.example.dm5.simpleviewpagerfragment;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.dm5.simpleviewpagerfragment.view.FlipFragmentView;
import com.example.dm5.simpleviewpagerfragment.view.FlipFragmentViewSetting;

public class MainActivity extends FragmentActivity {
    private FlipFragmentView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        view = (FlipFragmentView) findViewById(R.id.layout_flip_fragment);
        FlipFragmentViewSetting setting = new FlipFragmentViewSetting();
        setting.addPage("1",new Fragment1());
        setting.addPage("2",new Fragment2());
        setting.addPage("3",new Fragment3());
        setting.addPage("4",new Fragment4());
        setting.addPage("5",new Fragment4());
        setting.addPage("5", new Fragment4());
        setting.addPage("5", new Fragment4());
        setting.addPage("5",new Fragment4());
        setting.addPage("5",new Fragment4());
        view.setViewSettingAndShow(setting);
    }
}
