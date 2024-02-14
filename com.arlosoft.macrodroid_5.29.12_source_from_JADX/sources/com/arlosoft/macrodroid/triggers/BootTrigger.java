package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import p119k3.C7530m;

public class BootTrigger extends Trigger {
    public static final Parcelable.Creator<BootTrigger> CREATOR = new C5611a();

    /* renamed from: com.arlosoft.macrodroid.triggers.BootTrigger$a */
    class C5611a implements Parcelable.Creator<BootTrigger> {
        C5611a() {
        }

        /* renamed from: a */
        public BootTrigger createFromParcel(Parcel parcel) {
            return new BootTrigger(parcel, (C5611a) null);
        }

        /* renamed from: b */
        public BootTrigger[] newArray(int i) {
            return new BootTrigger[i];
        }
    }

    /* synthetic */ BootTrigger(Parcel parcel, C5611a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7530m.m31329u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    public BootTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private BootTrigger() {
    }

    private BootTrigger(Parcel parcel) {
        super(parcel);
    }
}
