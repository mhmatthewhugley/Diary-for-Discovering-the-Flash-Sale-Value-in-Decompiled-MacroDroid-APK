package com.arlosoft.macrodroid.triggers;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.common.C4001c1;
import p119k3.C7479b0;

public class InvokedByNotificationTrigger extends Trigger implements C5981k4 {
    public static final Parcelable.Creator<InvokedByNotificationTrigger> CREATOR = new C5669a();
    private static InvokedByNotificationTrigger instance;

    /* renamed from: com.arlosoft.macrodroid.triggers.InvokedByNotificationTrigger$a */
    class C5669a implements Parcelable.Creator<InvokedByNotificationTrigger> {
        C5669a() {
        }

        /* renamed from: a */
        public InvokedByNotificationTrigger createFromParcel(Parcel parcel) {
            return new InvokedByNotificationTrigger(parcel, (C5669a) null);
        }

        /* renamed from: b */
        public InvokedByNotificationTrigger[] newArray(int i) {
            return new InvokedByNotificationTrigger[i];
        }
    }

    /* synthetic */ InvokedByNotificationTrigger(Parcel parcel, C5669a aVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    public static InvokedByNotificationTrigger m22475g3() {
        if (instance == null) {
            instance = new InvokedByNotificationTrigger();
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

    public InvokedByNotificationTrigger() {
    }

    private InvokedByNotificationTrigger(Parcel parcel) {
        super(parcel);
    }
}
