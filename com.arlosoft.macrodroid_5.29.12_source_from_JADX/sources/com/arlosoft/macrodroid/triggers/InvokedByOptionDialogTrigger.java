package com.arlosoft.macrodroid.triggers;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;
import p119k3.C7479b0;

public class InvokedByOptionDialogTrigger extends Trigger implements C5981k4 {
    public static final Parcelable.Creator<InvokedByOptionDialogTrigger> CREATOR = new C5670a();
    private static InvokedByOptionDialogTrigger instance;

    /* renamed from: com.arlosoft.macrodroid.triggers.InvokedByOptionDialogTrigger$a */
    class C5670a implements Parcelable.Creator<InvokedByOptionDialogTrigger> {
        C5670a() {
        }

        /* renamed from: a */
        public InvokedByOptionDialogTrigger createFromParcel(Parcel parcel) {
            return new InvokedByOptionDialogTrigger(parcel, (C5670a) null);
        }

        /* renamed from: b */
        public InvokedByOptionDialogTrigger[] newArray(int i) {
            return new InvokedByOptionDialogTrigger[i];
        }
    }

    /* synthetic */ InvokedByOptionDialogTrigger(Parcel parcel, C5670a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    public static InvokedByOptionDialogTrigger m22485g3() {
        if (instance == null) {
            instance = new InvokedByOptionDialogTrigger();
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

    public InvokedByOptionDialogTrigger() {
    }

    private InvokedByOptionDialogTrigger(Parcel parcel) {
        super(parcel);
    }
}
