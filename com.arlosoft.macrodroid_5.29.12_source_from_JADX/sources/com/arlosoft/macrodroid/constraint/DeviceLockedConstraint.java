package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.app.KeyguardManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7638q;

public class DeviceLockedConstraint extends Constraint {
    public static final Parcelable.Creator<DeviceLockedConstraint> CREATOR = new C4136a();
    private boolean m_locked;

    /* renamed from: com.arlosoft.macrodroid.constraint.DeviceLockedConstraint$a */
    class C4136a implements Parcelable.Creator<DeviceLockedConstraint> {
        C4136a() {
        }

        /* renamed from: a */
        public DeviceLockedConstraint createFromParcel(Parcel parcel) {
            return new DeviceLockedConstraint(parcel, (C4136a) null);
        }

        /* renamed from: b */
        public DeviceLockedConstraint[] newArray(int i) {
            return new DeviceLockedConstraint[i];
        }
    }

    /* synthetic */ DeviceLockedConstraint(Parcel parcel, C4136a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16416g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_device_locked_option_locked), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_device_locked_option_unlocked)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_locked ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m16416g3()[!this.m_locked];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        return this.m_locked == ((KeyguardManager) mo27827K0().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7638q.m31821u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16416g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_locked ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_locked = i == 0;
    }

    public DeviceLockedConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DeviceLockedConstraint() {
        this.m_locked = true;
    }

    private DeviceLockedConstraint(Parcel parcel) {
        super(parcel);
        this.m_locked = parcel.readInt() != 0;
    }
}
