package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Build;
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
import p123l1.C7639q0;

public class PhoneRingingConstraint extends Constraint {
    public static final Parcelable.Creator<PhoneRingingConstraint> CREATOR = new C4179a();
    private boolean m_ringing;

    /* renamed from: com.arlosoft.macrodroid.constraint.PhoneRingingConstraint$a */
    class C4179a implements Parcelable.Creator<PhoneRingingConstraint> {
        C4179a() {
        }

        /* renamed from: a */
        public PhoneRingingConstraint createFromParcel(Parcel parcel) {
            return new PhoneRingingConstraint(parcel, (C4179a) null);
        }

        /* renamed from: b */
        public PhoneRingingConstraint[] newArray(int i) {
            return new PhoneRingingConstraint[i];
        }
    }

    /* synthetic */ PhoneRingingConstraint(Parcel parcel, C4179a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16925g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_phone_ringing), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_phone_ringing_not_ringing)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_ringing ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_ringing ? m16925g3()[0] : m16925g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        try {
            if (this.m_ringing == (((TelephonyManager) mo27827K0().getSystemService("phone")).getCallState() == 1)) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            C4878b.m18869h("Phone Ringing Constraint failed - missing READ_PHONE_STATE permission", mo27840Y0().longValue());
            C7439d0.m30909o0(mo27827K0(), "android.permission.READ_PHONE_STATE", mo25559a1(), true, false);
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7639q0.m31826u();
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return Build.VERSION.SDK_INT >= 31 ? new String[]{"android.permission.READ_PHONE_STATE"} : new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16925g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_ringing ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_ringing = i == 0;
    }

    public PhoneRingingConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public PhoneRingingConstraint() {
        this.m_ringing = true;
    }

    private PhoneRingingConstraint(Parcel parcel) {
        super(parcel);
        this.m_ringing = parcel.readInt() != 0;
    }
}
