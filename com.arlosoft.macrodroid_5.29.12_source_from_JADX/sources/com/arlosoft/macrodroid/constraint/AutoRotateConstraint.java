package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7598c;
import p148q0.C8151a;

public class AutoRotateConstraint extends Constraint {
    public static final Parcelable.Creator<AutoRotateConstraint> CREATOR = new C4109a();
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.constraint.AutoRotateConstraint$a */
    class C4109a implements Parcelable.Creator<AutoRotateConstraint> {
        C4109a() {
        }

        /* renamed from: a */
        public AutoRotateConstraint createFromParcel(Parcel parcel) {
            return new AutoRotateConstraint(parcel, (C4109a) null);
        }

        /* renamed from: b */
        public AutoRotateConstraint[] newArray(int i) {
            return new AutoRotateConstraint[i];
        }
    }

    /* synthetic */ AutoRotateConstraint(Parcel parcel, C4109a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16161g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.constraint_auto_rotate));
        sb.append(" ");
        sb.append(this.m_enabled ? m16161g3()[0] : m16161g3()[1]);
        return sb.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        try {
            if (this.m_enabled == (Settings.System.getInt(mo27827K0().getContentResolver(), "accelerometer_rotation") != 0)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to get auto rotate setting: " + e.getMessage()));
            return true;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7598c.m31627u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16161g3();
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

    public AutoRotateConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AutoRotateConstraint() {
        this.m_enabled = true;
    }

    private AutoRotateConstraint(Parcel parcel) {
        super(parcel);
        this.m_enabled = parcel.readInt() != 0;
    }
}
