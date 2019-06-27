package com.cust.custopi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Session {

    private SharedPreferences prefs;

    public Session(Context context) {
        // TODO Auto-generated constructor stub
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }


    public void setproduct(String gender) {
        prefs.edit().putString("product", gender).commit();
    }

    public String getproductname() {
        String gender = prefs.getString("product","");
        return gender;
    }
}