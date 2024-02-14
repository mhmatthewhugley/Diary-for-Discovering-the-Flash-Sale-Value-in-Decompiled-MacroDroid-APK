package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import p119k3.C7479b0;

public class EmptyTrigger extends Trigger {
    public static final Parcelable.Creator<EmptyTrigger> CREATOR = new C5641a();

    /* renamed from: com.arlosoft.macrodroid.triggers.EmptyTrigger$a */
    class C5641a implements Parcelable.Creator<EmptyTrigger> {
        C5641a() {
        }

        /* renamed from: a */
        public EmptyTrigger createFromParcel(Parcel parcel) {
            return new EmptyTrigger(parcel, (C5641a) null);
        }

        /* renamed from: b */
        public EmptyTrigger[] newArray(int i) {
            return new EmptyTrigger[i];
        }
    }

    /* synthetic */ EmptyTrigger(Parcel parcel, C5641a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: Q0 */
    public String mo25557Q0() {
        return mo27827K0().getString(C17541R$string.trigger_empty_help);
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
        return mo27827K0().getString(C17541R$string.trigger_empty);
    }

    public EmptyTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public EmptyTrigger() {
    }

    private EmptyTrigger(Parcel parcel) {
        super(parcel);
    }
}
