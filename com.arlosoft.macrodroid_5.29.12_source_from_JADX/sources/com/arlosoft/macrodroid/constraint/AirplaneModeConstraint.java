package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7595b;

public class AirplaneModeConstraint extends Constraint {
    public static final Parcelable.Creator<AirplaneModeConstraint> CREATOR = new C4108a();
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.constraint.AirplaneModeConstraint$a */
    class C4108a implements Parcelable.Creator<AirplaneModeConstraint> {
        C4108a() {
        }

        /* renamed from: a */
        public AirplaneModeConstraint createFromParcel(Parcel parcel) {
            return new AirplaneModeConstraint(parcel, (C4108a) null);
        }

        /* renamed from: b */
        public AirplaneModeConstraint[] newArray(int i) {
            return new AirplaneModeConstraint[i];
        }
    }

    /* synthetic */ AirplaneModeConstraint(Parcel parcel, C4108a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16151g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_airplane_mode_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_airplane_mode_disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_enabled ? m16151g3()[0] : m16151g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (this.m_enabled == (Settings.Global.getInt(mo27827K0().getContentResolver(), "airplane_mode_on", 0) != 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7595b.m31612u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16151g3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_airplane_mode_select_option);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_enabled ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_enabled = i == 0;
    }

    public AirplaneModeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AirplaneModeConstraint() {
        this.m_enabled = true;
    }

    private AirplaneModeConstraint(Parcel parcel) {
        super(parcel);
        this.m_enabled = parcel.readInt() != 0;
    }
}
