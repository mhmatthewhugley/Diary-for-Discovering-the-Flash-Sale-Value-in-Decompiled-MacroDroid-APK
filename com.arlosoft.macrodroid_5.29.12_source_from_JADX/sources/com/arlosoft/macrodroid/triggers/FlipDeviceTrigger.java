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
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Iterator;
import p119k3.C7497f0;
import p136n3.C7969c;
import p148q0.C8151a;

public class FlipDeviceTrigger extends Trigger {
    public static final Parcelable.Creator<FlipDeviceTrigger> CREATOR = new C5647b();
    private static C7969c s_flipListener;
    private static boolean s_screenOn;
    private static ScreenOnOffReceiver s_screenOnOffTriggerReceiver;
    private static boolean s_sensorLive = false;
    private static final SensorManager s_sensorManager = ((SensorManager) MacroDroidApplication.m14845u().getSystemService("sensor"));
    private static int s_triggerCounter = 0;
    private boolean m_anyStart;
    private boolean m_faceDown;
    private boolean m_workWithScreenOff;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            FlipDeviceTrigger.m22179o3(context, intent.getAction().equals("android.intent.action.SCREEN_ON"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.FlipDeviceTrigger$a */
    class C5646a implements C7969c.C7970a {
        C5646a() {
        }

        /* renamed from: a */
        public void mo31130a() {
            FlipDeviceTrigger.m22177m3();
        }

        /* renamed from: b */
        public void mo31131b(boolean z) {
            FlipDeviceTrigger.m22178n3(z);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.FlipDeviceTrigger$b */
    class C5647b implements Parcelable.Creator<FlipDeviceTrigger> {
        C5647b() {
        }

        /* renamed from: a */
        public FlipDeviceTrigger createFromParcel(Parcel parcel) {
            return new FlipDeviceTrigger(parcel, (C5646a) null);
        }

        /* renamed from: b */
        public FlipDeviceTrigger[] newArray(int i) {
            return new FlipDeviceTrigger[i];
        }
    }

    /* synthetic */ FlipDeviceTrigger(Parcel parcel, C5646a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private boolean m22174j3() {
        return this.m_anyStart;
    }

    /* renamed from: k3 */
    private boolean m22175k3() {
        return this.m_faceDown;
    }

    /* renamed from: l3 */
    private String[] m22176l3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_flip_device_up_to_down), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_flip_device_down_to_up), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_flip_device_any_to_down)};
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static void m22177m3() {
        ArrayList arrayList = new ArrayList();
        for (Macro next : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Trigger next2 = it.next();
                if ((next2 instanceof FlipDeviceTrigger) && ((FlipDeviceTrigger) next2).m22174j3() && next2.mo31374R2()) {
                    next.setTriggerThatInvoked(next2);
                    if (next.canInvoke(next.getTriggerContextInfo())) {
                        arrayList.add(next);
                    }
                }
            }
        }
        if (arrayList.size() > 0 && C5163j2.m20096Y(MacroDroidApplication.m14845u())) {
            ((Vibrator) MacroDroidApplication.m14845u().getSystemService("vibrator")).vibrate(new long[]{0, 100}, -1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static void m22178n3(boolean z) {
        Trigger next;
        ArrayList arrayList = new ArrayList();
        for (Macro next2 : C4934n.m18998M().mo29679I()) {
            Iterator<Trigger> it = next2.getTriggerListWithAwaitingActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                if (next instanceof FlipDeviceTrigger) {
                    FlipDeviceTrigger flipDeviceTrigger = (FlipDeviceTrigger) next;
                    if (flipDeviceTrigger.m22175k3() == z && (!z || !flipDeviceTrigger.m22174j3())) {
                    }
                }
            }
            if (next.mo31374R2()) {
                next2.setTriggerThatInvoked(next);
                if (next2.canInvoke(next2.getTriggerContextInfo())) {
                    arrayList.add(next2);
                }
            }
        }
        if (arrayList.size() > 0 && C5163j2.m20096Y(MacroDroidApplication.m14845u())) {
            ((Vibrator) MacroDroidApplication.m14845u().getSystemService("vibrator")).vibrate(new long[]{0, 100}, -1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Macro macro = (Macro) it2.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static void m22179o3(Context context, boolean z) {
        s_screenOn = z;
        m22180p3(context);
    }

    /* renamed from: p3 */
    public static void m22180p3(Context context) {
        if (s_screenOn || C5163j2.m20089X(context)) {
            if (s_triggerCounter > 0) {
                if (!s_sensorLive) {
                    s_flipListener.mo37860a(new C5646a());
                    SensorManager sensorManager = s_sensorManager;
                    sensorManager.registerListener(s_flipListener, sensorManager.getDefaultSensor(1), 3);
                    s_sensorLive = true;
                }
            } else if (s_sensorLive) {
                s_sensorManager.unregisterListener(s_flipListener);
                s_sensorLive = false;
            }
        } else if (s_sensorLive) {
            s_sensorManager.unregisterListener(s_flipListener);
            s_sensorLive = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.m_anyStart) {
            return 2;
        }
        return this.m_faceDown ^ true ? 1 : 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_anyStart) {
            return m22176l3()[2];
        }
        return m22176l3()[!this.m_faceDown];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        s_triggerCounter--;
        m22180p3(mo27827K0());
        if (s_triggerCounter == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_screenOnOffTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_flipListener = null;
            s_screenOnOffTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7497f0.m31175u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_flipListener = new C7969c();
            s_screenOnOffTriggerReceiver = new ScreenOnOffReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffTriggerReceiver, intentFilter);
            s_screenOn = ((PowerManager) mo27827K0().getSystemService("power")).isScreenOn();
        }
        s_triggerCounter++;
        m22180p3(mo27827K0());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22176l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.select_option);
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_faceDown ^ true ? 1 : 0);
        parcel.writeInt(this.m_workWithScreenOff ^ true ? 1 : 0);
        parcel.writeInt(this.m_anyStart ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = false;
        this.m_faceDown = i == 0 || i == 2;
        if (i == 2) {
            z = true;
        }
        this.m_anyStart = z;
    }

    public FlipDeviceTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public FlipDeviceTrigger() {
        this.m_faceDown = true;
        this.m_workWithScreenOff = false;
        this.m_anyStart = false;
    }

    private FlipDeviceTrigger(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_faceDown = parcel.readInt() == 0;
        this.m_workWithScreenOff = parcel.readInt() == 0;
        this.m_anyStart = parcel.readInt() != 0 ? false : z;
    }
}
