package com.example.senebeli5891.Fragments_Activities;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by senebeli5891 on 12/22/2017.
 */

public class MyCustomApplication extends Application 
{

    public List<String> comments;

    @Override
    public void onCreate() 
	{
        super.onCreate();
        comments = new ArrayList<>();
    }

}