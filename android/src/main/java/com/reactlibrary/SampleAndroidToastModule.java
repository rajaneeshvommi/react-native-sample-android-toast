package com.reactlibrary;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class SampleAndroidToastModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public SampleAndroidToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "SampleAndroidToast";
    }

    @ReactMethod
    public void show(String text) {
      Context context = getReactApplicationContext();
      Toast.makeText(context,text, Toast.LENGTH_LONG).show();
    }
}
