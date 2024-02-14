package com.arlosoft.macrodroid.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7845t0;

public class EndIfAction extends EndParentAction {
    public static final Parcelable.Creator<EndIfAction> CREATOR = new C2422a();

    /* renamed from: com.arlosoft.macrodroid.action.EndIfAction$a */
    class C2422a implements Parcelable.Creator<EndIfAction> {
        C2422a() {
        }

        /* renamed from: a */
        public EndIfAction createFromParcel(Parcel parcel) {
            return new EndIfAction(parcel, (C2422a) null);
        }

        /* renamed from: b */
        public EndIfAction[] newArray(int i) {
            return new EndIfAction[i];
        }
    }

    /* synthetic */ EndIfAction(Parcel parcel, C2422a aVar) {
        this(parcel);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7845t0.m32801u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    public EndIfAction() {
    }

    private EndIfAction(Parcel parcel) {
        super(parcel);
    }
}
