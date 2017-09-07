package com.bang_tang.studyforhuihui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bang_tang.studyforhuihui.MainActivity;
import com.bang_tang.studyforhuihui.R;

/**
 * 项目名：StudyForHuiHui
 * 包名：com.bang_tang.studyforhuihui.ui
 * 文件名：FlashActivity
 * 创建者：Wsr
 * 创建时间:2017/9/721:44
 * 描述：TODO
 */

public class FlashActivity extends AppCompatActivity {
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    startActivity(new Intent(FlashActivity.this, MainActivity.class));
                    finish();
                    break;
            }
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        handler.sendEmptyMessageDelayed(1,2000);
    }
}
