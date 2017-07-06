package com.yourpackagename;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Aarif on 4/19/2016.
 */
public class MyPrefrences {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    public MyPrefrences(Context context)
    {
        preferences=context.getSharedPreferences(context.getPackageName(),0);
        editor=preferences.edit();
    }
    /**
     * put int preference
     *
     * @param prefName
     * @param val
     *
     */
    public void setInt(String prefName,int val) {
        editor.putInt(prefName,val).commit();
    }
    /**
     * put String preference
     *
     * @param prefName
     * @param val
     *
     */
    public void setString(String prefName,String val) {
        editor.putString(prefName, val).commit();
    }
    /**
     * put float preference
     *
     * @param prefName
     * @param val
     *
     */
    public void setFloat(String prefName,float val) {
        editor.putFloat(prefName, val).commit();
    }
    /**
     * put boolean preference
     *
     * @param prefName
     * @param val
     *
     */
    public void setBoolean(String prefName,boolean val) {
        editor.putBoolean(prefName, val).commit();
    }
    /**
     * put long preference
     *
     * @param prefName
     * @param val
     *
     */
    public void setLong(String prefName,long val) {
        editor.putLong(prefName, val).commit();
    }

    /**
     * get int preference
     *
     * @param prefName
     * @param valDef
     *
     */
    public int getInt(String prefName,int valDef) {
       return preferences.getInt(prefName,valDef);
    }
    /**
     * put String preference
     *  @param prefName
     * @param valDef
     *
     */
    public String getString(String prefName, String valDef) {
        return preferences.getString(prefName, valDef);
    }
    /**
     * put float preference
     *  @param prefName
     * @param valDef
     *
     */
    public float getFloat(String prefName, float valDef) {
            return preferences.getFloat(prefName, valDef);
    }
    /**
     * put boolean preference
     *  @param prefName
     * @param valDef
     *
     */
    public boolean getBoolean(String prefName, boolean valDef) {
        return preferences.getBoolean(prefName, valDef);
    }
    /**
     * put long preference
     *  @param prefName
     * @param valDef
     *
     */
    public long getLong(String prefName, long valDef) {
        return  preferences.getLong(prefName, valDef);
    }


}
