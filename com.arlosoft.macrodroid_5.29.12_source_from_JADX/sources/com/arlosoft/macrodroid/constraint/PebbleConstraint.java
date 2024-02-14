package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4072w0;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.getpebble.android.kit.PebbleKit;
import p123l1.C7637p0;

public class PebbleConstraint extends Constraint {
    public static final Parcelable.Creator<PebbleConstraint> CREATOR = new C4178a();
    private static final int OPTION_PEBBLE_CONNECTED = 0;
    private static final int OPTION_PEBBLE_NOT_CONNECTED = 1;
    private static final String[] s_options = {MacroDroidApplication.m14845u().getString(C17541R$string.constraint_pebble_connected), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_pebble_not_connected)};
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.constraint.PebbleConstraint$a */
    class C4178a implements Parcelable.Creator<PebbleConstraint> {
        C4178a() {
        }

        /* renamed from: a */
        public PebbleConstraint createFromParcel(Parcel parcel) {
            return new PebbleConstraint(parcel, (C4178a) null);
        }

        /* renamed from: b */
        public PebbleConstraint[] newArray(int i) {
            return new PebbleConstraint[i];
        }
    }

    /* synthetic */ PebbleConstraint(Parcel parcel, C4178a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public /* synthetic */ void m16915i3() {
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return s_options[this.m_option];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        int i = this.m_option;
        if (i == 0) {
            return PebbleKit.m26081b(mo27827K0());
        }
        if (i != 1) {
            return true;
        }
        return !PebbleKit.m26081b(mo27827K0());
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7637p0.m31815u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return s_options;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        if (C5163j2.m20091X1(mo27827K0())) {
            super.mo24714u1();
        } else {
            C4072w0.m16080d(mo27850j0(), new C4329u2(this));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public PebbleConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private PebbleConstraint() {
        this.m_option = 0;
    }

    private PebbleConstraint(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
