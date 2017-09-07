package com.bang_tang.studyforhuihui.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 项目名：StudyForHuiHui
 * 包名：com.bang_tang.studyforhuihui.ui
 * 文件名：BaseActivity
 * 创建者：Wsr
 * 创建时间:2017/9/721:16
 * 描述：TODO
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setHomeButtonEnabled(true);

    }
}
