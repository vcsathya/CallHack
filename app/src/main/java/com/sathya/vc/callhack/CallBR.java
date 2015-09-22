package com.sathya.vc.callhack;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by sathya on 9/22/15.
 */
public class CallBR extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final String oldNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
        final String newNumber = "7472247827";
        this.setResultData(newNumber);
        String msg = "You are calling... " + newNumber;
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
