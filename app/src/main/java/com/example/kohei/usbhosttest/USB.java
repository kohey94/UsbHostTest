package com.example.kohei.usbhosttest;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;

public class USB extends AppCompatActivity {

    private TextView mTextView;
    private UsbManager mUsbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usb);

        mUsbManager = (UsbManager) getSystemService(USB_SERVICE);

        mTextView = (TextView) findViewById(R.id.textMsg);
        HashMap<String, UsbDevice> deviceList = mUsbManager.getDeviceList();
        Log.v("a",deviceList.values().toString());
        if(deviceList == null || deviceList.isEmpty()){
            mTextView.setText("no device found");
        }else{
            String string = "";
            for(String name : deviceList.keySet()){
                string += name + "\n";
            }
            mTextView.setText(string);

        }
    }
}
