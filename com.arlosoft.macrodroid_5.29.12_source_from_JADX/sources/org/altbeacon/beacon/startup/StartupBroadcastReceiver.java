package org.altbeacon.beacon.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.service.C16028n;
import p097gd.C7354d;

public class StartupBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C7354d.m30376a("StartupBroadcastReceiver", "onReceive called in startup broadcast receiver", new Object[0]);
        BeaconManager A = BeaconManager.m33479A(context.getApplicationContext());
        if (A.mo37981N() || A.mo37980L()) {
            int intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1);
            if (intExtra != -1) {
                C7354d.m30376a("StartupBroadcastReceiver", "Passive background scan callback type: " + intExtra, new Object[0]);
                C7354d.m30376a("StartupBroadcastReceiver", "got Android O background scan via intent", new Object[0]);
                int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", -1);
                if (intExtra2 != -1) {
                    C7354d.m30381f("StartupBroadcastReceiver", "Passive background scan failed.  Code; " + intExtra2, new Object[0]);
                }
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
                A.mo37973B();
                if (A.mo37980L()) {
                    C16028n.m96632g().mo76512i(context, parcelableArrayListExtra);
                }
            } else if (intent.getBooleanExtra("wakeup", false)) {
                C7354d.m30376a("StartupBroadcastReceiver", "got wake up intent", new Object[0]);
            } else {
                C7354d.m30376a("StartupBroadcastReceiver", "Already started.  Ignoring intent: %s of type: %s", intent, intent.getStringExtra("wakeup"));
            }
        } else {
            A.mo37973B();
            C7354d.m30376a("StartupBroadcastReceiver", "No consumers are bound.  Ignoring broadcast receiver.", new Object[0]);
        }
    }
}
