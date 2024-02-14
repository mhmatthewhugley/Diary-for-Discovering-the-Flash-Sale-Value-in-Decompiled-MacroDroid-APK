package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import android.view.WindowManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7640r;

public class DeviceOrientationConstraint extends Constraint {
    public static final Parcelable.Creator<DeviceOrientationConstraint> CREATOR = new C4137a();
    private boolean m_portrait;

    /* renamed from: com.arlosoft.macrodroid.constraint.DeviceOrientationConstraint$a */
    class C4137a implements Parcelable.Creator<DeviceOrientationConstraint> {
        C4137a() {
        }

        /* renamed from: a */
        public DeviceOrientationConstraint createFromParcel(Parcel parcel) {
            return new DeviceOrientationConstraint(parcel, (C4137a) null);
        }

        /* renamed from: b */
        public DeviceOrientationConstraint[] newArray(int i) {
            return new DeviceOrientationConstraint[i];
        }
    }

    /* synthetic */ DeviceOrientationConstraint(Parcel parcel, C4137a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16425g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_device_orientation_portrait), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_device_orientation_landscape)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_portrait ^ true ? 1 : 0;
    }

    /* renamed from: H0 */
    public String mo27823H0() {
        return mo24672O0();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_portrait ? m16425g3()[0] : m16425g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        Display defaultDisplay = ((WindowManager) mo27827K0().getSystemService("window")).getDefaultDisplay();
        return this.m_portrait == (defaultDisplay.getHeight() > defaultDisplay.getWidth());
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7640r.m31831u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16425g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_portrait ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_portrait = i == 0;
    }

    public DeviceOrientationConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DeviceOrientationConstraint() {
        this.m_portrait = true;
    }

    private DeviceOrientationConstraint(Parcel parcel) {
        super(parcel);
        this.m_portrait = parcel.readInt() != 0;
    }
}
