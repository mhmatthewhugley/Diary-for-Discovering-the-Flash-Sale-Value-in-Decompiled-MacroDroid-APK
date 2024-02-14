package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6444v0;
import p123l1.C7643s0;

public class ProximitySensorConstraint extends Constraint {
    public static final Parcelable.Creator<ProximitySensorConstraint> CREATOR = new C4181a();
    private static C4182b s_ProximityListener;
    private static int s_constraintCounter;
    /* access modifiers changed from: private */
    public static C4183c s_currentState;
    private static final Object s_lock = new Object();
    private static boolean s_screenOn;
    private static final ScreenOnOffReceiver s_screenOnOffReceiver = new ScreenOnOffReceiver();
    private static boolean s_sensorLive = false;
    private static final SensorManager s_sensorManager = ((SensorManager) MacroDroidApplication.m14845u().getSystemService("sensor"));
    private transient boolean m_enabled;
    private boolean m_near;

    public static class ScreenOnOffReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            ProximitySensorConstraint.m16959j3(intent.getAction().equals("android.intent.action.SCREEN_ON"));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.ProximitySensorConstraint$a */
    class C4181a implements Parcelable.Creator<ProximitySensorConstraint> {
        C4181a() {
        }

        /* renamed from: a */
        public ProximitySensorConstraint createFromParcel(Parcel parcel) {
            return new ProximitySensorConstraint(parcel, (C4181a) null);
        }

        /* renamed from: b */
        public ProximitySensorConstraint[] newArray(int i) {
            return new ProximitySensorConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.ProximitySensorConstraint$b */
    private static class C4182b implements C6444v0.C6447b {
        private C4182b() {
        }

        /* synthetic */ C4182b(C4181a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo28289a(boolean z) {
            C4183c unused = ProximitySensorConstraint.s_currentState = z ? C4183c.NEAR : C4183c.FAR;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.ProximitySensorConstraint$c */
    private enum C4183c {
        NEAR,
        FAR
    }

    /* synthetic */ ProximitySensorConstraint(Parcel parcel, C4181a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private String[] m16958i3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_proximity_sensor_near), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_proximity_sensor_far)};
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static void m16959j3(boolean z) {
        synchronized (s_lock) {
            s_screenOn = z;
            m16960k3();
        }
    }

    /* renamed from: k3 */
    private static void m16960k3() {
        synchronized (s_lock) {
            if (!s_screenOn) {
                if (!C5163j2.m20216n1(MacroDroidApplication.m14845u())) {
                    if (s_sensorLive) {
                        s_currentState = C4183c.FAR;
                        C6444v0.m24760e(s_ProximityListener);
                        s_sensorLive = false;
                    }
                }
            }
            if (s_constraintCounter > 0) {
                if (!s_sensorLive) {
                    s_currentState = C4183c.FAR;
                    C6444v0.m24759d(s_ProximityListener, C6444v0.C6448c.CONSTRAINT);
                    s_sensorLive = true;
                }
            } else if (s_sensorLive) {
                s_currentState = C4183c.FAR;
                C6444v0.m24760e(s_ProximityListener);
                s_sensorLive = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_near ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.constraint_proximity_sensor));
        sb.append(": ");
        sb.append(this.m_near ? m16958i3()[0] : m16958i3()[1]);
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (!s_sensorLive) {
            return false;
        }
        if (this.m_near) {
            if (s_currentState == C4183c.NEAR) {
                return true;
            }
            return false;
        } else if (s_currentState == C4183c.FAR) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7643s0.m31847u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* renamed from: T2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28052T2() {
        /*
            r3 = this;
            java.lang.Object r0 = s_lock
            monitor-enter(r0)
            boolean r1 = r3.m_enabled     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x0009:
            r1 = 0
            r3.m_enabled = r1     // Catch:{ all -> 0x002c }
            int r1 = s_constraintCounter     // Catch:{ all -> 0x002c }
            int r1 = r1 + -1
            s_constraintCounter = r1     // Catch:{ all -> 0x002c }
            m16960k3()     // Catch:{ all -> 0x002c }
            int r1 = s_constraintCounter     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x002a
            com.arlosoft.macrodroid.app.MacroDroidApplication r1 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ Exception -> 0x0023 }
            com.arlosoft.macrodroid.constraint.ProximitySensorConstraint$ScreenOnOffReceiver r2 = s_screenOnOffReceiver     // Catch:{ Exception -> 0x0023 }
            r1.unregisterReceiver(r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r1 = move-exception
            p148q0.C8151a.m33873n(r1)     // Catch:{ all -> 0x002c }
        L_0x0027:
            r1 = 0
            s_ProximityListener = r1     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.ProximitySensorConstraint.mo28052T2():void");
    }

    /* renamed from: V2 */
    public void mo28053V2() {
        synchronized (s_lock) {
            if (!this.m_enabled) {
                this.m_enabled = true;
                if (s_constraintCounter == 0) {
                    s_ProximityListener = new C4182b((C4181a) null);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    MacroDroidApplication.m14845u().registerReceiver(s_screenOnOffReceiver, intentFilter);
                    s_screenOn = ((PowerManager) mo27827K0().getSystemService("power")).isScreenOn();
                }
                s_constraintCounter++;
                m16960k3();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16958i3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.select_option);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_near ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_near = i == 0;
    }

    public ProximitySensorConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ProximitySensorConstraint() {
        this.m_near = true;
    }

    private ProximitySensorConstraint(Parcel parcel) {
        super(parcel);
        this.m_near = parcel.readInt() != 0;
    }
}
