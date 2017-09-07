package com.bang_tang.studyforhuihui.tools;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名：StudyForHuiHui
 * 包名：com.bang_tang.studyforhuihui.tools
 * 文件名：SharePrefTools
 * 创建者：Wsr
 * 创建时间:2017/9/721:37
 * 描述：SharePref工具类
 */

public class SharePrefTools {
    public static void setStringSharePref(Context mContext,String key,String value){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(key,Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(key,value).commit();
    }

    public static String getStringSharePref(Context mContext,String key,String defValue){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(key,Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,defValue);
    }

    public static void setIntSharePref(Context mContext,String key,int value){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(key,Context.MODE_PRIVATE);
        sharedPreferences.edit().putInt(key,value).commit();
    }

    public static int getIntSharePref(Context mContext,String key,int defValue){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(key,Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key,defValue);
    }

    public static void setBooleanSharePref(Context mContext,String key,boolean value){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(key,Context.MODE_PRIVATE);
        sharedPreferences.edit().putBoolean(key,value).commit();
    }

    public static boolean getBooleanSharePref(Context mContext,String key,boolean defValue){
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(key,Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key,defValue);
    }
}
