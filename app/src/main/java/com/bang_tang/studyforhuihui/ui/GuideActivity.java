package com.bang_tang.studyforhuihui.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bang_tang.studyforhuihui.MainActivity;
import com.bang_tang.studyforhuihui.R;
import com.bang_tang.studyforhuihui.adapter.GuideAdapter;
import com.bang_tang.studyforhuihui.tools.SharePrefTools;
import com.bang_tang.studyforhuihui.tools.StaticClass;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：StudyForHuiHui
 * 包名：com.bang_tang.studyforhuihui.ui
 * 文件名：GuideActivity
 * 创建者：Wsr
 * 创建时间:2017/9/721:17
 * 描述：TODO
 */

public class GuideActivity extends AppCompatActivity {
    private ViewPager guideViewPager;
    private List<View> viewList = new ArrayList<>();
    private View page1,page2,page3;
    private LayoutInflater inflater;
    private LinearLayout page3Ll;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!SharePrefTools.getBooleanSharePref(this, StaticClass.FIRST_START,true)){
            startActivity(new Intent(GuideActivity.this,FlashActivity.class));
            finish();
        }
        setContentView(R.layout.activity_guide);
        initView();
    }

    private void initView() {
        inflater = getLayoutInflater();
        //三个页面的view
        page1 = inflater.inflate(R.layout.guide_page_item_1,null);
        page2 = inflater.inflate(R.layout.guide_page_item_2,null);
        page3 = inflater.inflate(R.layout.guide_page_item_3,null);

        viewList.add(page1);
        viewList.add(page2);
        viewList.add(page3);

        page3Ll = (LinearLayout) page3.findViewById(R.id.page3);
        page3Ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuideActivity.this, MainActivity.class);
                SharePrefTools.setBooleanSharePref(GuideActivity.this,StaticClass.FIRST_START,false);
                startActivity(intent);
                finish();
            }
        });

        //guideViewPager的适配器
        guideViewPager = (ViewPager) findViewById(R.id.guide_viewpager);
        GuideAdapter adapter = new GuideAdapter(this,viewList);
        guideViewPager.setAdapter(adapter);
    }
}
