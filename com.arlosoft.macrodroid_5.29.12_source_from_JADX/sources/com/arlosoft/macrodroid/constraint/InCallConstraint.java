package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p112j2.C7439d0;
import p123l1.C7653x;

public class InCallConstraint extends Constraint {
    public static final Parcelable.Creator<InCallConstraint> CREATOR = new C4146a();
    private boolean m_inCall;

    /* renamed from: com.arlosoft.macrodroid.constraint.InCallConstraint$a */
    class C4146a implements Parcelable.Creator<InCallConstraint> {
        C4146a() {
        }

        /* renamed from: a */
        public InCallConstraint createFromParcel(Parcel parcel) {
            return new InCallConstraint(parcel, (C4146a) null);
        }

        /* renamed from: b */
        public InCallConstraint[] newArray(int i) {
            return new InCallConstraint[i];
        }
    }

    /* synthetic */ InCallConstraint(Parcel parcel, C4146a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16537g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_in_call_in_call), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_in_call_not_in_call)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_inCall ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_inCall ? m16537g3()[0] : m16537g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        try {
            if (this.m_inCall == (((TelephonyManager) mo27827K0().getSystemService("phone")).getCallState() == 2)) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            C4878b.m18869h("In Call Constraint failed - missing READ_PHONE_STATE permission", mo27840Y0().longValue());
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", mo25559a1(), true, false);
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7653x.m31894u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16537g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_inCall ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_inCall = i == 0;
    }

    public InCallConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private InCallConstraint() {
        this.m_inCall = true;
    }

    private InCallConstraint(Parcel parcel) {
        super(parcel);
        this.m_inCall = parcel.readInt() != 0;
    }
}
