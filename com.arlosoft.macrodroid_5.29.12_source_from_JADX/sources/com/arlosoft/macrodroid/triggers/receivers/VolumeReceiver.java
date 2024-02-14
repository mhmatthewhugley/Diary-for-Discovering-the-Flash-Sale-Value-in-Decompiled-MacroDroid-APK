package com.arlosoft.macrodroid.triggers.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.preference.PreferenceManager;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.VolumeButtonTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import p455ag.C17105a;

public class VolumeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static long f14383a = 0;

    /* renamed from: b */
    private static int f14384b = 2;

    /* renamed from: c */
    private static final SharedPreferences f14385c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static boolean f14386d = C5163j2.m20281v2(MacroDroidApplication.m14845u());

    /* renamed from: e */
    private static final SharedPreferences.OnSharedPreferenceChangeListener f14387e;

    /* renamed from: com.arlosoft.macrodroid.triggers.receivers.VolumeReceiver$a */
    class C6077a implements SharedPreferences.OnSharedPreferenceChangeListener {
        C6077a() {
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            boolean unused = VolumeReceiver.f14386d = C5163j2.m20281v2(MacroDroidApplication.m14845u());
        }
    }

    static {
        C6077a aVar = new C6077a();
        f14387e = aVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(MacroDroidApplication.m14845u());
        f14385c = defaultSharedPreferences;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(aVar);
    }

    /* renamed from: b */
    private void m24047b(Context context, boolean z, int i, int i2) {
        C17105a.m100579a("VolumeReceiver volumeChanged:" + z + "," + i + "," + i2, new Object[0]);
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if (next2 instanceof VolumeButtonTrigger) {
                    VolumeButtonTrigger volumeButtonTrigger = (VolumeButtonTrigger) next2;
                    if (volumeButtonTrigger.mo31592r3() == 1 && volumeButtonTrigger.mo31595x3() == z && next2.mo31374R2() && next.canInvoke(next.getTriggerContextInfo())) {
                        if (volumeButtonTrigger.mo31593v3()) {
                            z2 = true;
                        }
                        arrayList.add(next);
                        next.setTriggerThatInvoked(next2);
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
            C17105a.m100579a("++ Volumebutton invoking macro", new Object[0]);
        }
        if (arrayList.size() > 0 && z2) {
            try {
                C17105a.m100579a("++ Volume restore stream=" + i + " volume=" + i2, new Object[0]);
                ((AudioManager) context.getSystemService("audio")).setStreamVolume(i, i2, 0);
            } catch (SecurityException e) {
                C4878b.m18868g("Could not set stream volume: " + e.toString());
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        long currentTimeMillis = System.currentTimeMillis();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        if (currentTimeMillis >= f14383a + 200) {
            f14383a = currentTimeMillis;
            int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
            int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", 0);
            int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("VolumeReceiver: stream=");
            sb.append(intExtra2);
            sb.append(",volume=");
            sb.append(intExtra);
            sb.append(",previous=");
            sb.append(intExtra3);
            if (intExtra == intExtra3 + 1 || intExtra == intExtra3 + 2) {
                m24047b(context, true, intExtra2, intExtra3);
            } else if (intExtra3 == intExtra + 1 || intExtra3 == intExtra + 2) {
                m24047b(context, false, intExtra2, intExtra3);
            } else if (intExtra == audioManager.getStreamMaxVolume(intExtra2)) {
                m24047b(context, true, intExtra2, intExtra3);
            } else if (intExtra == 0) {
                if (intExtra2 == 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("VolumeReceiver silent=");
                    sb2.append(ringerMode);
                    if (f14386d) {
                        if (ringerMode != 0) {
                            m24047b(context, false, intExtra2, intExtra3);
                        } else if (f14384b == 2) {
                            m24047b(context, false, intExtra2, intExtra3);
                        } else {
                            m24047b(context, true, intExtra2, intExtra3);
                        }
                        f14384b = ringerMode;
                    } else if (ringerMode == 0) {
                        m24047b(context, false, intExtra2, intExtra3);
                    } else {
                        m24047b(context, true, intExtra2, intExtra3);
                    }
                } else {
                    m24047b(context, false, intExtra2, intExtra3);
                }
            } else if (intExtra == 1 && intExtra3 == 1) {
                m24047b(context, true, intExtra2, 0);
            }
            f14384b = ringerMode;
        }
    }
}
