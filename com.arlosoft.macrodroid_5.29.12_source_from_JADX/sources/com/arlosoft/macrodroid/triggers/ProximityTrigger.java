package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6444v0;
import p119k3.C7524k1;
import p148q0.C8151a;

public class ProximityTrigger extends Trigger {
    public static final Parcelable.Creator<ProximityTrigger> CREATOR = new C5722a();
    private static final int OPTION_PROXIMITY_FAR = 1;
    private static final int OPTION_PROXIMITY_FAST_WAVE = 3;
    private static final int OPTION_PROXIMITY_NEAR = 0;
    private static final int OPTION_PROXIMITY_SLOW_WAVE = 2;
    private static final int SLOW_WAVE_TIME_MS = 500;
    private static C5724c sPreviousState = null;
    private static C5723b s_ProximityListener = null;
    private static boolean s_screenOn = false;
    private static ScreenOnOffReceiver s_screenOnOffTriggerReceiver = null;
    private static boolean s_sensorLive = false;
    private static long s_transitionToNearTimestamp;
    private static int s_triggerCounter;
    private boolean m_near;
    private int m_selectedOption;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            ProximityTrigger.m22977l3(intent.getAction().equals("android.intent.action.SCREEN_ON"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ProximityTrigger$a */
    class C5722a implements Parcelable.Creator<ProximityTrigger> {
        C5722a() {
        }

        /* renamed from: a */
        public ProximityTrigger createFromParcel(Parcel parcel) {
            return new ProximityTrigger(parcel, (C5722a) null);
        }

        /* renamed from: b */
        public ProximityTrigger[] newArray(int i) {
            return new ProximityTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ProximityTrigger$b */
    private static class C5723b implements C6444v0.C6447b {
        private C5723b() {
        }

        /* synthetic */ C5723b(C5722a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo28289a(boolean z) {
            ProximityTrigger.m22976k3(z);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ProximityTrigger$c */
    private enum C5724c {
        NONE,
        NEAR,
        FAR
    }

    /* synthetic */ ProximityTrigger(Parcel parcel, C5722a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private String[] m22974i3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_proximity_near), SelectableItem.m15535j1(C17541R$string.trigger_proximity_far), SelectableItem.m15535j1(C17541R$string.trigger_proximity_slow_wave), SelectableItem.m15535j1(C17541R$string.trigger_proximity_fast_wave)};
    }

    /* renamed from: j3 */
    private int m22975j3() {
        return mo24671D0();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f A[LOOP:2: B:66:0x0109->B:68:0x010f, LOOP_END] */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22976k3(boolean r11) {
        /*
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r0 = sPreviousState
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r1 = com.arlosoft.macrodroid.triggers.ProximityTrigger.C5724c.NONE
            if (r0 != r1) goto L_0x0010
            if (r11 == 0) goto L_0x000b
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r11 = com.arlosoft.macrodroid.triggers.ProximityTrigger.C5724c.NEAR
            goto L_0x000d
        L_0x000b:
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r11 = com.arlosoft.macrodroid.triggers.ProximityTrigger.C5724c.FAR
        L_0x000d:
            sPreviousState = r11
            return
        L_0x0010:
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r0 = sPreviousState
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r1 = com.arlosoft.macrodroid.triggers.ProximityTrigger.C5724c.NEAR
            if (r0 != r1) goto L_0x0018
            if (r11 != 0) goto L_0x0020
        L_0x0018:
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r0 = sPreviousState
            com.arlosoft.macrodroid.triggers.ProximityTrigger$c r2 = com.arlosoft.macrodroid.triggers.ProximityTrigger.C5724c.FAR
            if (r0 != r2) goto L_0x0021
            if (r11 != 0) goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            r0 = 0
            r3 = 1
            if (r11 == 0) goto L_0x002c
            long r4 = java.lang.System.currentTimeMillis()
            s_transitionToNearTimestamp = r4
            goto L_0x0046
        L_0x002c:
            long r4 = s_transitionToNearTimestamp
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0046
            long r4 = java.lang.System.currentTimeMillis()
            long r8 = s_transitionToNearTimestamp
            long r4 = r4 - r8
            s_transitionToNearTimestamp = r6
            r6 = 500(0x1f4, double:2.47E-321)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0045
            r4 = 1
            goto L_0x0047
        L_0x0045:
            r0 = 1
        L_0x0046:
            r4 = 0
        L_0x0047:
            if (r11 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            sPreviousState = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            java.util.List r2 = r2.mo29679I()
            java.util.Iterator r2 = r2.iterator()
        L_0x005e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r2.next()
            com.arlosoft.macrodroid.macro.Macro r5 = (com.arlosoft.macrodroid.macro.Macro) r5
            java.util.ArrayList r6 = r5.getTriggerListWithAwaitingActions()
            java.util.Iterator r6 = r6.iterator()
        L_0x0072:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x005e
            java.lang.Object r7 = r6.next()
            com.arlosoft.macrodroid.triggers.Trigger r7 = (com.arlosoft.macrodroid.triggers.Trigger) r7
            boolean r8 = r7 instanceof com.arlosoft.macrodroid.triggers.ProximityTrigger
            if (r8 == 0) goto L_0x0072
            r8 = r7
            com.arlosoft.macrodroid.triggers.ProximityTrigger r8 = (com.arlosoft.macrodroid.triggers.ProximityTrigger) r8
            int r9 = r8.m22975j3()
            if (r9 != 0) goto L_0x00a4
            if (r11 == 0) goto L_0x00a4
            boolean r9 = r7.mo31374R2()
            if (r9 == 0) goto L_0x00a4
            r5.setTriggerThatInvoked(r7)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r5.getTriggerContextInfo()
            boolean r6 = r5.canInvoke(r6)
            if (r6 == 0) goto L_0x005e
            r1.add(r5)
            goto L_0x005e
        L_0x00a4:
            int r9 = r8.m22975j3()
            if (r9 != r3) goto L_0x00c3
            if (r11 != 0) goto L_0x00c3
            boolean r9 = r7.mo31374R2()
            if (r9 == 0) goto L_0x00c3
            r5.setTriggerThatInvoked(r7)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r5.getTriggerContextInfo()
            boolean r6 = r5.canInvoke(r6)
            if (r6 == 0) goto L_0x005e
            r1.add(r5)
            goto L_0x005e
        L_0x00c3:
            int r9 = r8.m22975j3()
            r10 = 2
            if (r9 != r10) goto L_0x00e4
            if (r0 == 0) goto L_0x00e4
            boolean r9 = r7.mo31374R2()
            if (r9 == 0) goto L_0x00e4
            r5.setTriggerThatInvoked(r7)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r5.getTriggerContextInfo()
            boolean r6 = r5.canInvoke(r6)
            if (r6 == 0) goto L_0x005e
            r1.add(r5)
            goto L_0x005e
        L_0x00e4:
            int r8 = r8.m22975j3()
            r9 = 3
            if (r8 != r9) goto L_0x0072
            if (r4 == 0) goto L_0x0072
            boolean r8 = r7.mo31374R2()
            if (r8 == 0) goto L_0x0072
            r5.setTriggerThatInvoked(r7)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r6 = r5.getTriggerContextInfo()
            boolean r6 = r5.canInvoke(r6)
            if (r6 == 0) goto L_0x005e
            r1.add(r5)
            goto L_0x005e
        L_0x0105:
            java.util.Iterator r11 = r1.iterator()
        L_0x0109:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x011d
            java.lang.Object r0 = r11.next()
            com.arlosoft.macrodroid.macro.Macro r0 = (com.arlosoft.macrodroid.macro.Macro) r0
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r1 = r0.getTriggerContextInfo()
            r0.invokeActions(r1)
            goto L_0x0109
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.ProximityTrigger.m22976k3(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static void m22977l3(boolean z) {
        s_screenOn = z;
        m22978m3();
    }

    /* renamed from: m3 */
    private static void m22978m3() {
        if (s_screenOn || C5163j2.m20216n1(MacroDroidApplication.m14845u())) {
            if (s_triggerCounter > 0) {
                if (!s_sensorLive) {
                    sPreviousState = C5724c.NONE;
                    C6444v0.m24759d(s_ProximityListener, C6444v0.C6448c.TRIGGER);
                    s_sensorLive = true;
                }
            } else if (s_sensorLive) {
                sPreviousState = C5724c.NONE;
                C6444v0.m24760e(s_ProximityListener);
                s_sensorLive = false;
            }
        } else if (s_sensorLive) {
            sPreviousState = C5724c.NONE;
            C6444v0.m24760e(s_ProximityListener);
            s_sensorLive = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = this.m_selectedOption;
        if (i >= 0) {
            return i;
        }
        return this.m_near ^ true ? 1 : 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m22974i3()[mo24671D0()];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        s_triggerCounter--;
        m22978m3();
        if (s_triggerCounter == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_screenOnOffTriggerReceiver);
            } catch (Exception e) {
                C4878b.m18864c("Failed to unregister screen on off trigger receiver for ProximityTrigger");
                C8151a.m33873n(e);
            }
            s_screenOnOffTriggerReceiver = null;
            s_ProximityListener = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7524k1.m31299u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (this.m_selectedOption == -1) {
            this.m_selectedOption = this.m_near ^ true ? 1 : 0;
        }
        if (s_triggerCounter == 0) {
            s_ProximityListener = new C5723b((C5722a) null);
            s_screenOnOffTriggerReceiver = new ScreenOnOffReceiver();
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffTriggerReceiver, intentFilter);
            s_screenOn = ((PowerManager) mo27827K0().getSystemService("power")).isScreenOn();
        }
        s_triggerCounter++;
        m22978m3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22974i3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.select_option);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_near ^ true ? 1 : 0);
        parcel.writeInt(this.m_selectedOption);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectedOption = i;
    }

    public ProximityTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ProximityTrigger() {
        this.m_near = true;
        this.m_selectedOption = -1;
    }

    private ProximityTrigger(Parcel parcel) {
        super(parcel);
        this.m_near = parcel.readInt() == 0;
        this.m_selectedOption = parcel.readInt();
    }
}
