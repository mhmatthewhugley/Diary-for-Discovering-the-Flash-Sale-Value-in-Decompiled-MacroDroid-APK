package com.arlosoft.macrodroid.triggers.services.quicksettings;

import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.events.MacroDroidDisabledEvent;
import com.arlosoft.macrodroid.events.MacroDroidEnabledEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import p148q0.C8151a;
import p161s1.C10180a;

@RequiresApi(api = 24)
public class MacroDroidOnOffTileService extends TileService {
    /* renamed from: a */
    private void m24244a() {
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            if (C5163j2.m20013M0(this)) {
                qsTile.setLabel(getString(C17541R$string.enabled));
                qsTile.setState(2);
            } else {
                qsTile.setLabel(getString(C17541R$string.disabled));
                qsTile.setState(1);
            }
            try {
                qsTile.updateTile();
            } catch (Exception e) {
                C4878b.m18868g("Could not update quick settings tile: " + e.toString());
            }
        }
    }

    public void onClick() {
        super.onClick();
        C8151a.m33860a("MacroDroid On/Off Tile");
        if (C5163j2.m20013M0(this)) {
            MacroDroidService.m9501f(this);
            C5163j2.m19935B4(this, false);
            Macro.setMacroDroidEnabledState(false);
            C4934n.m18998M().mo29694n0();
            C10180a.m40075a().mo80018i(new MacroDroidDisabledEvent());
        } else {
            MacroDroidService.m9500e(this);
            Macro.setMacroDroidEnabledState(true);
            C4934n.m18998M().mo29694n0();
            C5163j2.m19935B4(this, true);
            C10180a.m40075a().mo80018i(new MacroDroidEnabledEvent());
        }
        m24244a();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onStartListening() {
        m24244a();
    }

    public void onTileAdded() {
        super.onTileAdded();
        m24244a();
    }
}
