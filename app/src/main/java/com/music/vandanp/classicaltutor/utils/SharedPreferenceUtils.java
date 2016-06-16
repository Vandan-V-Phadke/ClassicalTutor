package com.music.vandanp.classicaltutor.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.music.vandanp.classicaltutor.config.Constants;

/**
 * Created by vandanp on 5/4/16.
 */
public class SharedPreferenceUtils {

    Context context ;
    SharedPreferences sharedpreferences;

    public SharedPreferenceUtils(Context context){
        this.context = context ;
        sharedpreferences = context.getSharedPreferences(Constants.MY_PREFS, Context.MODE_PRIVATE);
    }

    public boolean areNotesAdded(){
        return  sharedpreferences.getBoolean(Constants.PREF_NOTES_ADDED, false);
    }

    public void notesAdded(boolean added){
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean(Constants.PREF_NOTES_ADDED, added);
        editor.commit();
    }

}
