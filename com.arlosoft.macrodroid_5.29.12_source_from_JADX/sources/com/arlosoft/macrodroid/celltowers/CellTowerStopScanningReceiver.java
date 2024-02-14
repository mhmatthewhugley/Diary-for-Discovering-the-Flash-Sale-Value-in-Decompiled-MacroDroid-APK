package com.arlosoft.macrodroid.celltowers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CellTowerStopScanningReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        CellTowerBackgroundScanService.m15184b(context);
    }
}
