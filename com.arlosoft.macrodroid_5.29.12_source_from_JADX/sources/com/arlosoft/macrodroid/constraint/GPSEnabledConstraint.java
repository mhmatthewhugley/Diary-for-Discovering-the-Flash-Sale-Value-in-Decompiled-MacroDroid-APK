package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.location.LocationManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7646u;

public class GPSEnabledConstraint extends Constraint {
    public static final Parcelable.Creator<GPSEnabledConstraint> CREATOR = new C4142a();
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.constraint.GPSEnabledConstraint$a */
    class C4142a implements Parcelable.Creator<GPSEnabledConstraint> {
        C4142a() {
        }

        /* renamed from: a */
        public GPSEnabledConstraint createFromParcel(Parcel parcel) {
            return new GPSEnabledConstraint(parcel, (C4142a) null);
        }

        /* renamed from: b */
        public GPSEnabledConstraint[] newArray(int i) {
            return new GPSEnabledConstraint[i];
        }
    }

    /* synthetic */ GPSEnabledConstraint(Parcel parcel, C4142a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16484g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_gps_enabled_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_gps_enabled_disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_enabled ? m16484g3()[0] : m16484g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        return this.m_enabled == ((LocationManager) mo27827K0().getSystemService("location")).isProviderEnabled("gps");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7646u.m31862u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16484g3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_gps_enabled_select_state);
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

    public GPSEnabledConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private GPSEnabledConstraint() {
        this.m_enabled = true;
    }

    private GPSEnabledConstraint(Parcel parcel) {
        super(parcel);
        this.m_enabled = parcel.readInt() != 0;
    }
}
