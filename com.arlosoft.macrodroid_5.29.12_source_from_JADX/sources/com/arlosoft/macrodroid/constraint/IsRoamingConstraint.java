package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7596b0;

public class IsRoamingConstraint extends Constraint {
    public static final Parcelable.Creator<IsRoamingConstraint> CREATOR = new C4153a();
    private boolean m_isRoaming;

    /* renamed from: com.arlosoft.macrodroid.constraint.IsRoamingConstraint$a */
    class C4153a implements Parcelable.Creator<IsRoamingConstraint> {
        C4153a() {
        }

        /* renamed from: a */
        public IsRoamingConstraint createFromParcel(Parcel parcel) {
            return new IsRoamingConstraint(parcel, (C4153a) null);
        }

        /* renamed from: b */
        public IsRoamingConstraint[] newArray(int i) {
            return new IsRoamingConstraint[i];
        }
    }

    /* synthetic */ IsRoamingConstraint(Parcel parcel, C4153a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16600g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_is_roaming_option_roaming), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_is_roaming_option_not_roaming)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_isRoaming ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_isRoaming ? m16600g3()[0] : m16600g3()[1];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean z;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) mo27827K0().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isRoaming();
        } else {
            C4878b.m18864c("No network info IsRoamingConstraint check failed");
            z = false;
        }
        if (this.m_isRoaming == z) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7596b0.m31617u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16600g3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_isRoaming ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_isRoaming = i == 0;
    }

    public IsRoamingConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private IsRoamingConstraint() {
        this.m_isRoaming = true;
    }

    private IsRoamingConstraint(Parcel parcel) {
        super(parcel);
        this.m_isRoaming = parcel.readInt() != 0;
    }
}
