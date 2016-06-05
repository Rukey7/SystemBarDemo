package com.dl7.systembartint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_first)
    Button mBtnFirst;
    @BindView(R.id.btn_second)
    Button mBtnSecond;
    @BindView(R.id.btn_four)
    Button mBtnFour;
    @BindView(R.id.btn_five)
    Button mBtnFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_first, R.id.btn_second, R.id.btn_four, R.id.btn_five})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_first:
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
                break;
            case R.id.btn_second:
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                break;
//            case R.id.btn_thrid:
//                startActivity(new Intent(MainActivity.this, ThridActivity.class));
//                break;
            case R.id.btn_four:
                startActivity(new Intent(MainActivity.this, TestOneActivity.class));
                break;
            case R.id.btn_five:
                startActivity(new Intent(MainActivity.this, TestTwoActivity.class));
                break;
        }
    }

}
