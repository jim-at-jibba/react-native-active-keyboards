
package com.reactlibrary;

import android.util.Log;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.IllegalViewOperationException;

import java.util.List;

import static android.content.Context.INPUT_METHOD_SERVICE;

public class RNReactNativeActiveKeyboardsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeActiveKeyboardsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeActiveKeyboards";
  }

  @ReactMethod
  public void keyboardEnabled(Promise promiseCallback) {

    Log.i("CHECKER INITIALISING", "Initialising!");

    String packageLocal = getReactApplicationContext().getPackageName();
    Log.i("PACKAGE NAME", packageLocal);
    boolean isInputDeviceEnabled = false;
    InputMethodManager inputMethodManager = (InputMethodManager) reactContext.getSystemService(INPUT_METHOD_SERVICE);
    List<InputMethodInfo> list = inputMethodManager.getEnabledInputMethodList();

    try{
      promiseCallback.resolve(list.toString());
    } catch(IllegalViewOperationException e) {
      promiseCallback.reject(e.getMessage());
    }


  }
}