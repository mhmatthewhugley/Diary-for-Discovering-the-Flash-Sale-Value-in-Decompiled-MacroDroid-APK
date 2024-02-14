package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Vibrator;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.util.ArrayList;
import java.util.Iterator;
import p119k3.C7550r1;
import p136n3.C7974g;
import p148q0.C8151a;

public class ShakeDeviceTrigger extends Trigger {
    public static final Parcelable.Creator<ShakeDeviceTrigger> CREATOR = new C5739a();
    private static boolean s_screenOn;
    private static final ScreenOnOffReceiver s_screenOnOffTriggerReceiver = new ScreenOnOffReceiver();
    private static C7974g s_sensorListener;
    private static boolean s_sensorLive = false;
    private static final SensorManager s_sensorManager = ((SensorManager) MacroDroidApplication.m14845u().getSystemService("sensor"));
    private static int s_triggerCounter = 0;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            ShakeDeviceTrigger.m23141k3(intent.getAction().equals("android.intent.action.SCREEN_ON"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ShakeDeviceTrigger$a */
    class C5739a implements Parcelable.Creator<ShakeDeviceTrigger> {
        C5739a() {
        }

        /* renamed from: a */
        public ShakeDeviceTrigger createFromParcel(Parcel parcel) {
            return new ShakeDeviceTrigger(parcel, (C5739a) null);
        }

        /* renamed from: b */
        public ShakeDeviceTrigger[] newArray(int i) {
            return new ShakeDeviceTrigger[i];
        }
    }

    /* synthetic */ ShakeDeviceTrigger(Parcel parcel, C5739a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static void m23139i3() {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof ShakeDeviceTrigger) && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        if (arrayList.size() > 0 && C5163j2.m19948D1(MacroDroidApplication.m14845u())) {
            ((Vibrator) MacroDroidApplication.m14845u().getSystemService("vibrator")).vibrate(new long[]{0, 200}, -1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static void m23141k3(boolean z) {
        s_screenOn = z;
        m23142l3();
    }

    /* renamed from: l3 */
    private static void m23142l3() {
        int i;
        if (s_screenOn || C5163j2.m19932B1(MacroDroidApplication.m14845u())) {
            if (s_triggerCounter > 0) {
                if (!s_sensorLive) {
                    s_sensorListener.mo37865b(C5912e7.f14013a);
                    C7974g.m33260c(C5163j2.m19940C1(MacroDroidApplication.m14845u()));
                    String A1 = C5163j2.m19924A1(MacroDroidApplication.m14845u());
                    if (A1.equals(SelectableItem.m15535j1(C17541R$string.sample_rate_slow))) {
                        i = 3;
                    } else {
                        i = A1.equals(SelectableItem.m15535j1(C17541R$string.sample_rate_fast)) ? 1 : 2;
                    }
                    SensorManager sensorManager = s_sensorManager;
                    sensorManager.registerListener(s_sensorListener, sensorManager.getDefaultSensor(1), i);
                    s_sensorLive = true;
                }
            } else if (s_sensorLive) {
                s_sensorManager.unregisterListener(s_sensorListener);
                s_sensorLive = false;
            }
        } else if (s_sensorLive) {
            s_sensorManager.unregisterListener(s_sensorListener);
            s_sensorLive = false;
        }
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        s_triggerCounter--;
        m23142l3();
        if (s_triggerCounter == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_screenOnOffTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_sensorListener = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7550r1.m31423u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_sensorListener = new C7974g(MacroDroidApplication.m14845u());
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffTriggerReceiver, intentFilter);
            s_screenOn = ((PowerManager) mo27827K0().getSystemService("power")).isScreenOn();
        }
        s_triggerCounter++;
        m23142l3();
    }

    public ShakeDeviceTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ShakeDeviceTrigger() {
    }

    private ShakeDeviceTrigger(Parcel parcel) {
        super(parcel);
    }
}
