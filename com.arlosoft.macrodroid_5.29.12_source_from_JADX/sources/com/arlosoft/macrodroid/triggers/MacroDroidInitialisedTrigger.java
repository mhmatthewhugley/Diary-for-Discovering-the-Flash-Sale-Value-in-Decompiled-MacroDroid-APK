package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import p119k3.C7563v0;

public class MacroDroidInitialisedTrigger extends Trigger {
    public static final Parcelable.Creator<MacroDroidInitialisedTrigger> CREATOR = new C5693a();

    /* renamed from: com.arlosoft.macrodroid.triggers.MacroDroidInitialisedTrigger$a */
    class C5693a implements Parcelable.Creator<MacroDroidInitialisedTrigger> {
        C5693a() {
        }

        /* renamed from: a */
        public MacroDroidInitialisedTrigger createFromParcel(Parcel parcel) {
            return new MacroDroidInitialisedTrigger(parcel, (C5693a) null);
        }

        /* renamed from: b */
        public MacroDroidInitialisedTrigger[] newArray(int i) {
            return new MacroDroidInitialisedTrigger[i];
        }
    }

    /* synthetic */ MacroDroidInitialisedTrigger(Parcel parcel, C5693a aVar) {
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
        return C7563v0.m31485u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    public MacroDroidInitialisedTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MacroDroidInitialisedTrigger() {
    }

    private MacroDroidInitialisedTrigger(Parcel parcel) {
        super(parcel);
    }
}
