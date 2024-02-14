package com.arlosoft.macrodroid.celltowers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.celltowers.C3943v;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.util.List;
import p135n1.C7964a;
import p161s1.C10180a;

public class CellTowerBGScanReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("cellTowerGroupName");
        C7964a d = C3932l.m15307e().mo27631d(stringExtra);
        if (d == null) {
            C4878b.m18868g("BG Scan failed, cell tower group no longer exists (" + stringExtra + ")");
            CellTowerBackgroundScanService.m15184b(context);
            return;
        }
        List<C3943v.C3944a> a = C3943v.m15317a(context);
        if (a.size() == 0) {
            C4878b.m18879r("BG Scan - No towers found");
        } else {
            C4878b.m18873l("BG Scan - Cell towers found = " + a.size());
            for (C3943v.C3944a aVar : a) {
                C4878b.m18873l("-> " + aVar.f10258c);
            }
        }
        boolean z = false;
        for (C3943v.C3944a next : a) {
            if (d.getCellTowerIds() != null && !d.getCellTowerIds().contains(next.f10258c)) {
                d.getCellTowerIds().add(next.f10258c);
                C4878b.m18873l("BG Scan found new cell: " + next.f10258c + " adding to group " + stringExtra);
                z = true;
            }
        }
        if (!z) {
            C4878b.m18879r("BG Cell Tower Scan - no new cell towers");
        }
        C10180a.m40075a().mo80018i(new CellTowerUpdateEvent());
        C3932l.m15307e().mo27633h();
        CellTowerBackgroundScanService.m15186d(context, stringExtra);
    }
}
