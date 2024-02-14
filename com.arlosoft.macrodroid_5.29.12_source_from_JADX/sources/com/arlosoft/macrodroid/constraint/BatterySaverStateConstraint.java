package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p123l1.C7608f;

public class BatterySaverStateConstraint extends Constraint {
    public static final Parcelable.Creator<BatterySaverStateConstraint> CREATOR = new C4114a();
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.constraint.BatterySaverStateConstraint$a */
    class C4114a implements Parcelable.Creator<BatterySaverStateConstraint> {
        C4114a() {
        }

        /* renamed from: a */
        public BatterySaverStateConstraint createFromParcel(Parcel parcel) {
            return new BatterySaverStateConstraint(parcel, (C4114a) null);
        }

        /* renamed from: b */
        public BatterySaverStateConstraint[] newArray(int i) {
            return new BatterySaverStateConstraint[i];
        }
    }

    /* synthetic */ BatterySaverStateConstraint(Parcel parcel, C4114a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private String[] m16196g3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.enabled), MacroDroidApplication.m14845u().getString(C17541R$string.disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m16196g3()[this.m_option];
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        boolean isPowerSaveMode = ((PowerManager) mo27827K0().getSystemService("power")).isPowerSaveMode();
        return this.m_option != 0 ? !isPowerSaveMode : isPowerSaveMode;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7608f.m31675u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16196g3();
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

    public BatterySaverStateConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BatterySaverStateConstraint() {
    }

    private BatterySaverStateConstraint(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
