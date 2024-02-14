package com.arlosoft.macrodroid.triggers.services.quicksettings;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.events.QuickSettingSetToggleStateEvent;
import com.arlosoft.macrodroid.events.QuickSettingsTilesUpdatedEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.quicksettings.QuickSettingButton;
import com.arlosoft.macrodroid.quicksettings.QuickSettingsData;
import com.arlosoft.macrodroid.triggers.QuickSettingsTileTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityServiceJellyBean;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p081e1.C7264a;
import p112j2.C7439d0;
import p148q0.C8151a;
import p161s1.C10180a;

@RequiresApi(api = 24)
public abstract class MacroDroidTileService extends TileService {

    /* renamed from: a */
    private boolean f14576a;

    /* renamed from: c */
    private C6132a f14577c;

    /* renamed from: a */
    private void m24245a() {
        QuickSettingsData quickSettingsData;
        Tile qsTile = getQsTile();
        if (qsTile != null && (quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class)) != null) {
            int i = 1;
            QuickSettingButton quickSettingButton = quickSettingsData.getQuickSettingsButtonList().get(mo32153c() - 1);
            this.f14576a = quickSettingButton.isToggle();
            qsTile.setLabel(quickSettingButton.getLabel());
            qsTile.setIcon(Icon.createWithResource(this, m24246b(this, quickSettingButton)));
            if (this.f14576a) {
                if (quickSettingButton.getToggleOn()) {
                    i = 2;
                }
                qsTile.setState(i);
            } else {
                qsTile.setState(2);
            }
            try {
                qsTile.updateTile();
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
        }
    }

    /* renamed from: b */
    public static int m24246b(@NonNull Context context, @NonNull QuickSettingButton quickSettingButton) {
        return quickSettingButton.getImageName() != null ? C4061t1.m15977W(context, quickSettingButton.getImageName()) : quickSettingButton.getImage();
    }

    /* renamed from: d */
    private boolean m24247d(int i, int i2) {
        return i == 0 ? i2 == 2 : i2 == 1;
    }

    /* renamed from: c */
    public abstract int mo32153c();

    public void onClick() {
        super.onClick();
        Tile qsTile = getQsTile();
        if (qsTile == null) {
            C4878b.m18868g("Quick setting tile was null");
        }
        C8151a.m33860a("Quick Settings Tile click");
        C7264a q = MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE);
        QuickSettingsData quickSettingsData = (QuickSettingsData) q.mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class);
        if (quickSettingsData != null) {
            QuickSettingButton quickSettingButton = quickSettingsData.getQuickSettingsButtonList().get(mo32153c() - 1);
            boolean collapseOnPress = quickSettingButton.getCollapseOnPress();
            if (this.f14576a) {
                int i = 2;
                if (qsTile.getState() == 2) {
                    i = 1;
                }
                qsTile.setState(i);
                qsTile.setLabel(quickSettingButton.getLabel());
                qsTile.updateTile();
                quickSettingsData.replaceButton(quickSettingButton, QuickSettingButton.create(quickSettingButton.getLabel(), m24246b(this, quickSettingButton), quickSettingButton.getEnabled(), quickSettingButton.isToggle(), !quickSettingButton.getToggleOn(), quickSettingButton.getCollapseOnPress(), quickSettingButton.getImageName()));
                q.mo37132b(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, quickSettingsData);
            }
            ArrayList arrayList = new ArrayList();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if ((next2 instanceof QuickSettingsTileTrigger) && next2.mo31374R2()) {
                        QuickSettingsTileTrigger quickSettingsTileTrigger = (QuickSettingsTileTrigger) next2;
                        if (quickSettingsTileTrigger.mo31424r3() == mo32153c() && m24247d(quickSettingsTileTrigger.mo31425s3(), qsTile.getState())) {
                            next.setTriggerThatInvoked(next2);
                            if (next.canInvoke(next.getTriggerContextInfo())) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Macro macro = (Macro) it2.next();
                macro.invokeActions(macro.getTriggerContextInfo());
            }
            if (!collapseOnPress) {
                return;
            }
            if (Build.VERSION.SDK_INT < 31) {
                sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } else if (!C4061t1.m15992f0(this)) {
                C4878b.m18868g("Accessibility service is not enabled");
                C7439d0.m30911p0(this, getString(C17541R$string.collapse_status_bar), 4);
            } else {
                Intent intent = new Intent(this, MacroDroidAccessibilityServiceJellyBean.class);
                intent.putExtra("GlobalControlType", 15);
                startService(intent);
            }
        } else {
            C4878b.m18868g("Quick button handling failed. Please try creconfiguring your quick buttons via the home screen tile.");
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f14577c = new C6132a(getApplicationContext());
        C10180a.m40075a().mo80019m(this.f14577c);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f14577c != null) {
            C10180a.m40075a().mo80020p(this.f14577c);
            this.f14577c = null;
        }
    }

    public void onStartListening() {
        super.onStartListening();
        m24245a();
    }

    public void onTileAdded() {
        super.onTileAdded();
        m24245a();
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.services.quicksettings.MacroDroidTileService$a */
    private class C6132a {

        /* renamed from: a */
        private WeakReference<Context> f14578a;

        C6132a(Context context) {
            this.f14578a = new WeakReference<>(context);
        }

        public void onEventMainThread(QuickSettingsTilesUpdatedEvent quickSettingsTilesUpdatedEvent) {
            Tile qsTile = MacroDroidTileService.this.getQsTile();
            if (qsTile != null) {
                Context context = (Context) this.f14578a.get();
                QuickSettingsData quickSettingsData = quickSettingsTilesUpdatedEvent.f11760a;
                if (quickSettingsData != null && context != null) {
                    QuickSettingButton quickSettingButton = quickSettingsData.getQuickSettingsButtonList().get(MacroDroidTileService.this.mo32153c() - 1);
                    qsTile.setLabel(quickSettingButton.getLabel());
                    qsTile.setIcon(Icon.createWithResource(context, MacroDroidTileService.m24246b(context, quickSettingButton)));
                    qsTile.updateTile();
                }
            }
        }

        public void onEventMainThread(QuickSettingSetToggleStateEvent quickSettingSetToggleStateEvent) {
            QuickSettingsData quickSettingsData;
            if (quickSettingSetToggleStateEvent.f11758a == MacroDroidTileService.this.mo32153c() && (quickSettingsData = (QuickSettingsData) MacroDroidApplication.m14845u().mo27293q(QuickSettingsData.QUICK_SETTINGS_CACHE).mo37133c(QuickSettingsData.QUICK_SETTINGS_DATA_KEY, QuickSettingsData.class)) != null) {
                int i = 1;
                QuickSettingButton quickSettingButton = quickSettingsData.getQuickSettingsButtonList().get(MacroDroidTileService.this.mo32153c() - 1);
                if (quickSettingButton.isToggle()) {
                    Tile qsTile = MacroDroidTileService.this.getQsTile();
                    if (quickSettingSetToggleStateEvent.f11759b) {
                        i = 2;
                    }
                    qsTile.setState(i);
                    qsTile.setLabel(quickSettingButton.getLabel());
                    qsTile.updateTile();
                    return;
                }
                C4878b.m18868g("Cannot set toggle state for button tile");
            }
        }
    }
}
