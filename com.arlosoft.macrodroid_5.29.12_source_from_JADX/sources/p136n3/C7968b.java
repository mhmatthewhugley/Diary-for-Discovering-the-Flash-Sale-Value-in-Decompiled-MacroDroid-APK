package p136n3;

import android.content.Intent;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.celltowers.CellTowerService;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;

/* renamed from: n3.b */
/* compiled from: CellLocationChangeReceiver */
public class C7968b extends PhoneStateListener {
    public void onCellLocationChanged(CellLocation cellLocation) {
        try {
            MacroDroidApplication u = MacroDroidApplication.m14845u();
            C4878b.m18879r("++ Cell location changed ++");
            u.startService(new Intent(u, CellTowerService.class));
        } catch (IllegalStateException e) {
            C4878b.m18868g("Could not run cell tower service - foreground service not enabled? " + e.toString());
        }
    }
}
