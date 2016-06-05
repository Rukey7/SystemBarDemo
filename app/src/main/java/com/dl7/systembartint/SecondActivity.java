package com.dl7.systembartint;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        initToolBar(mToolbar, true, "透明覆盖状态栏");
    }

    @Override
    protected boolean isSystemBarTranslucent() {
        return true;
    }

}
