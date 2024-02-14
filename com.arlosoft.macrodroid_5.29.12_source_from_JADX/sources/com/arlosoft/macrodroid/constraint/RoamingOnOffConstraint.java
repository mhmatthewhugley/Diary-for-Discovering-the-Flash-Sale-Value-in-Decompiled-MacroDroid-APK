package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import p123l1.C7645t0;

public class RoamingOnOffConstraint extends Constraint {
    public static final Parcelable.Creator<RoamingOnOffConstraint> CREATOR = new C4184a();
    private boolean m_roamingOn;

    /* renamed from: com.arlosoft.macrodroid.constraint.RoamingOnOffConstraint$a */
    class C4184a implements Parcelable.Creator<RoamingOnOffConstraint> {
        C4184a() {
        }

        /* renamed from: a */
        public RoamingOnOffConstraint createFromParcel(Parcel parcel) {
            return new RoamingOnOffConstraint(parcel, (C4184a) null);
        }

        /* renamed from: b */
        public RoamingOnOffConstraint[] newArray(int i) {
            return new RoamingOnOffConstraint[i];
        }
    }

    /* synthetic */ RoamingOnOffConstraint(Parcel parcel, C4184a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16973g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_roaming_on_off_option_on), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_roaming_on_off_option_off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_roamingOn ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_roamingOn ? m16973g3()[0] : m16973g3()[1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo r4) {
        /*
            r3 = this;
            r4 = 1
            r0 = 0
            android.content.Context r1 = r3.mo27827K0()     // Catch:{ SettingNotFoundException -> 0x0014 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0014 }
            java.lang.String r2 = "data_roaming"
            int r1 = android.provider.Settings.Secure.getInt(r1, r2)     // Catch:{ SettingNotFoundException -> 0x0014 }
            if (r1 != r4) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            boolean r2 = r3.m_roamingOn
            if (r2 != r1) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.RoamingOnOffConstraint.mo28033Q2(com.arlosoft.macrodroid.triggers.TriggerContextInfo):boolean");
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7645t0.m31857u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16973g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_roamingOn ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_roamingOn = i == 0;
    }

    public RoamingOnOffConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private RoamingOnOffConstraint() {
        this.m_roamingOn = true;
    }

    private RoamingOnOffConstraint(Parcel parcel) {
        super(parcel);
        this.m_roamingOn = parcel.readInt() != 0;
    }
}
