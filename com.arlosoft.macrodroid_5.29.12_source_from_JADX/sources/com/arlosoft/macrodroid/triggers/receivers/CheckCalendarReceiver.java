package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.triggers.services.CheckCalendarService;

public class CheckCalendarReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, CheckCalendarService.class));
    }
}
