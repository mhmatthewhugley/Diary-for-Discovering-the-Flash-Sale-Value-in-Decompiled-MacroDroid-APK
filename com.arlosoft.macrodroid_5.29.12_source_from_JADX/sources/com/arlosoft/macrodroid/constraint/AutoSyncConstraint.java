package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7602d;

public class AutoSyncConstraint extends Constraint {
    public static final Parcelable.Creator<AutoSyncConstraint> CREATOR = new C4110a();
    private boolean m_enabled;

    /* renamed from: com.arlosoft.macrodroid.constraint.AutoSyncConstraint$a */
    class C4110a implements Parcelable.Creator<AutoSyncConstraint> {
        C4110a() {
        }

        /* renamed from: a */
        public AutoSyncConstraint createFromParcel(Parcel parcel) {
            return new AutoSyncConstraint(parcel, (C4110a) null);
        }

        /* renamed from: b */
        public AutoSyncConstraint[] newArray(int i) {
            return new AutoSyncConstraint[i];
        }
    }

    /* synthetic */ AutoSyncConstraint(Parcel parcel, C4110a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16170g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m16170g3()[!this.m_enabled];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        return this.m_enabled == ContentResolver.getMasterSyncAutomatically();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7602d.m31645u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16170g3();
    }

    /* renamed from: m1 */
    public String mo27854m1() {
        return mo25559a1() + "(" + mo24672O0() + ")";
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

    public AutoSyncConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AutoSyncConstraint() {
    }

    private AutoSyncConstraint(Parcel parcel) {
        super(parcel);
        this.m_enabled = parcel.readInt() != 0;
    }
}
