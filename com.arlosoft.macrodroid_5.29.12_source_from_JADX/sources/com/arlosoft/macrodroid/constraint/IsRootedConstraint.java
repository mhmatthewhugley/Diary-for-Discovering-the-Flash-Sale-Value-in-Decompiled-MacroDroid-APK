package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7599c0;
import p150q2.C8164a;

public class IsRootedConstraint extends Constraint {
    public static final Parcelable.Creator<IsRootedConstraint> CREATOR = new C4154a();
    private boolean m_rooted;

    /* renamed from: com.arlosoft.macrodroid.constraint.IsRootedConstraint$a */
    class C4154a implements Parcelable.Creator<IsRootedConstraint> {
        C4154a() {
        }

        /* renamed from: a */
        public IsRootedConstraint createFromParcel(Parcel parcel) {
            return new IsRootedConstraint(parcel, (C4154a) null);
        }

        /* renamed from: b */
        public IsRootedConstraint[] newArray(int i) {
            return new IsRootedConstraint[i];
        }
    }

    /* synthetic */ IsRootedConstraint(Parcel parcel, C4154a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16609g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.rooted), MacroDroidApplication.m14845u().getString(C17541R$string.non_rooted)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_rooted ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_rooted ? m16609g3()[0] : m16609g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        return this.m_rooted == C8164a.m33886a();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7599c0.m31632u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16609g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_rooted ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_rooted = i == 0;
    }

    public IsRootedConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private IsRootedConstraint() {
        this.m_rooted = true;
    }

    private IsRootedConstraint(Parcel parcel) {
        super(parcel);
        this.m_rooted = parcel.readInt() != 0;
    }
}
