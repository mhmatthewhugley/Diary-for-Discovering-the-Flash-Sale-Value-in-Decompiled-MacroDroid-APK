package com.arlosoft.macrodroid.triggers;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;
import p119k3.C7479b0;

public class InvokedByRunMacroTrigger extends Trigger implements C5981k4 {
    public static final Parcelable.Creator<InvokedByRunMacroTrigger> CREATOR = new C5673a();
    private static InvokedByRunMacroTrigger instance;

    /* renamed from: com.arlosoft.macrodroid.triggers.InvokedByRunMacroTrigger$a */
    class C5673a implements Parcelable.Creator<InvokedByRunMacroTrigger> {
        C5673a() {
        }

        /* renamed from: a */
        public InvokedByRunMacroTrigger createFromParcel(Parcel parcel) {
            return new InvokedByRunMacroTrigger(parcel, (C5673a) null);
        }

        /* renamed from: b */
        public InvokedByRunMacroTrigger[] newArray(int i) {
            return new InvokedByRunMacroTrigger[i];
        }
    }

    /* synthetic */ InvokedByRunMacroTrigger(Parcel parcel, C5673a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    public static InvokedByRunMacroTrigger m22515g3() {
        if (instance == null) {
            instance = new InvokedByRunMacroTrigger();
        }
        return instance;
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: Q0 */
    public String mo25557Q0() {
        return "";
    }

    /* renamed from: S0 */
    public int mo25558S0() {
        return C17530R$drawable.ic_crop_square_white_24dp;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7479b0.m31084u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* renamed from: a1 */
    public String mo25559a1() {
        return "";
    }

    public InvokedByRunMacroTrigger() {
    }

    private InvokedByRunMacroTrigger(Parcel parcel) {
        super(parcel);
    }
}
