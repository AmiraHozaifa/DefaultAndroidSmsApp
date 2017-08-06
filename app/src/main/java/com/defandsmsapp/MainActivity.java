package com.defandsmsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.defandsmsapp.utils.NotificationUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {


    @BindView(R.id.send_sms)
    Button send_sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.send_sms)
    public void onSendSms(View view) {
//        NotificationUtil.showNotification(this , "oo");
        startActivity(new Intent(MainActivity.this, SendMsgActivity.class));
    }


}
