package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.celltowers.CellTowerService;
import com.arlosoft.macrodroid.triggers.CellTowerTrigger;
import p148q0.C8151a;

public class CheckCellCoverageReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            context.startService(new Intent(context, CellTowerService.class));
        } catch (Exception e) {
            C8151a.m33873n(e);
        }
        CellTowerTrigger.m21958p3(context);
    }
}
