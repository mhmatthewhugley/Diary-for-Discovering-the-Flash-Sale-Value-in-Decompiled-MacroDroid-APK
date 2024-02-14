package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.receivers.AirplaneModeTriggerReceiver;
import p119k3.C7477b;
import p148q0.C8151a;

public class AirplaneModeTrigger extends Trigger {
    public static final Parcelable.Creator<AirplaneModeTrigger> CREATOR = new C5592a();
    private static AirplaneModeTriggerReceiver s_airplaneModeTriggerReceiver;
    private static int s_triggerCounter;
    private boolean m_airplaneModeEnabled;

    /* renamed from: com.arlosoft.macrodroid.triggers.AirplaneModeTrigger$a */
    class C5592a implements Parcelable.Creator<AirplaneModeTrigger> {
        C5592a() {
        }

        /* renamed from: a */
        public AirplaneModeTrigger createFromParcel(Parcel parcel) {
            return new AirplaneModeTrigger(parcel, (C5592a) null);
        }

        /* renamed from: b */
        public AirplaneModeTrigger[] newArray(int i) {
            return new AirplaneModeTrigger[i];
        }
    }

    /* synthetic */ AirplaneModeTrigger(Parcel parcel, C5592a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private String[] m21438h3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.trigger_airplane_mode_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.trigger_airplane_mode_disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_airplaneModeEnabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_airplaneModeEnabled ? m21438h3()[0] : m21438h3()[1];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            try {
                MacroDroidApplication.m14845u().unregisterReceiver(s_airplaneModeTriggerReceiver);
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            s_airplaneModeTriggerReceiver = null;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7477b.f18329j.mo37637a();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            s_airplaneModeTriggerReceiver = new AirplaneModeTriggerReceiver();
            MacroDroidApplication.m14845u().registerReceiver(s_airplaneModeTriggerReceiver, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        }
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21438h3();
    }

    /* renamed from: g3 */
    public boolean mo30899g3() {
        return this.m_airplaneModeEnabled;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_airplaneModeEnabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_airplaneModeEnabled = i == 0;
    }

    public AirplaneModeTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AirplaneModeTrigger() {
        this.m_airplaneModeEnabled = true;
    }

    private AirplaneModeTrigger(Parcel parcel) {
        super(parcel);
        this.m_airplaneModeEnabled = parcel.readInt() != 0;
    }
}
