package com.arlosoft.macrodroid.action.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.AndroidWearTrigger;

public class AndroidWearActionReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Macro Q = C4934n.m18998M().mo29682Q(intent.getLongExtra("AndroidWearActionMacroId", 0));
        AndroidWearTrigger androidWearTrigger = new AndroidWearTrigger();
        if (Q != null) {
            Q.setTriggerThatInvoked(androidWearTrigger);
            if (Q.canInvoke(Q.getTriggerContextInfo())) {
                Q.invokeActions(Q.getTriggerContextInfo(), true);
            }
        }
    }
}
