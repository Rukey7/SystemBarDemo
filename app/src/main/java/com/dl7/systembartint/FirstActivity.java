package com.dl7.systembartint;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FirstActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "纯色状态栏");
    }

    @Override
    protected boolean isSystemBarTranslucent() {
        return false;
    }
}
