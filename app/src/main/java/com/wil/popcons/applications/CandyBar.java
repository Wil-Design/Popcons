package com.wil.popcons.applications;

import androidx.annotation.NonNull;
import com.wil.popcons.R;

// TODO: Remove `//` below to enable OneSignal
//import com.onesignal.OneSignal;

import candybar.lib.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    // TODO: Remove `/*` and `*/` below to enable OneSignal
    /*
    @Override
    public void onCreate() {
        super.onCreate();

        // OneSignal Initialization
        OneSignal.initWithContext(this, "YOUR_ONESIGNAL_APP_ID");
    }
    */

    @NonNull
    @Override
    public Class<?> getDrawableClass() {
        return R.drawable.class;
    }

    @NonNull
    @Override
    public Configuration onInit() {
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);

        return configuration;
    }
}
