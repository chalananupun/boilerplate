package com.fidenz.boilerplate;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

import com.fidenz.android_boilerplate.listeners.NetworkChangeListener;
import com.fidenz.android_boilerplate.managers.PermissionManager;
import com.fidenz.android_boilerplate.managers.PreferenceManager;
import com.fidenz.android_boilerplate.receivers.NetworkChangeReceiver;
import com.fidenz.android_boilerplate.utility.CommonUtility;
import com.fidenz.android_boilerplate.utility.DateTimeUtility;
import com.fidenz.android_boilerplate.utility.DeviceManagerUtility;
import com.fidenz.android_boilerplate.utility.EncryptUtility;
import com.fidenz.android_boilerplate.utility.StringUtility;
import com.fidenz.android_boilerplate.views.activities.CommonMapActivity;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String encryptedText = EncryptUtility.encrypt("Password123","your text here");
            String decryptedText = EncryptUtility.encrypt("Password123","encrypted text here");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}