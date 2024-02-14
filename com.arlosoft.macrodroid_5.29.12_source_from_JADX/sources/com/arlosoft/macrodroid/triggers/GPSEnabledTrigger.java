package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.GPSEnabledTriggerReceiver;
import p119k3.C7507h0;
import p148q0.C8151a;

public class GPSEnabledTrigger extends Trigger {
    public static final Parcelable.Creator<GPSEnabledTrigger> CREATOR = new C5651a();
    private static GPSEnabledTriggerReceiver s_gpsTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_gpsModeEnabled;

    /* renamed from: com.arlosoft.macrodroid.triggers.GPSEnabledTrigger$a */
    class C5651a implements Parcelable.Creator<GPSEnabledTrigger> {
        C5651a() {
        }

        /* renamed from: a */
        public GPSEnabledTrigger createFromParcel(Parcel parcel) {
            return new GPSEnabledTrigger(parcel, (C5651a) null);
        }

        /* renamed from: b */
        public GPSEnabledTrigger[] newArray(int i) {
            return new GPSEnabledTrigger[i];
        }
    }

    /* synthetic */ GPSEnabledTrigger(Parcel parcel, C5651a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m22246h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_gps_enabled_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_gps_enabled_disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_gpsModeEnabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_gpsModeEnabled ? m22246h3()[0] : m22246h3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_gpsTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_gpsTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7507h0.m31221u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_gpsTriggerReceiver = new GPSEnabledTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_gpsTriggerReceiver, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22246h3();
    }

    /* renamed from: g3 */
    public boolean mo31167g3() {
        return this.m_gpsModeEnabled;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_gpsModeEnabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_gpsModeEnabled = i == 0;
    }

    public GPSEnabledTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private GPSEnabledTrigger() {
        this.m_gpsModeEnabled = true;
    }

    private GPSEnabledTrigger(Parcel parcel) {
        super(parcel);
        this.m_gpsModeEnabled = parcel.readInt() != 0;
    }
}
