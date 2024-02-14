package com.arlosoft.macrodroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import p148q0.C8151a;

public class PackageReplacedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C8151a.m33860a("PackageReplacedReceiver");
        C4878b.m18873l("MacroDroid packaged replaced, now running v5.29.12 (5290013)");
    }
}
