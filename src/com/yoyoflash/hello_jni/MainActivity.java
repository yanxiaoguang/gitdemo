package com.yoyoflash.hello_jni;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView txt=new TextView(this);
		//add new operation ,
		txt.setText("测试:"+stringFromJNI());
		setContentView(txt);
	}
	public native String  stringFromJNI();
    static {
           System.loadLibrary("hello-jni");
    }
}
