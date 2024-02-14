package com.arlosoft.macrodroid.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7852u0;

public class EndLoopAction extends EndParentAction {
    public static final Parcelable.Creator<EndLoopAction> CREATOR = new C2423a();

    /* renamed from: com.arlosoft.macrodroid.action.EndLoopAction$a */
    class C2423a implements Parcelable.Creator<EndLoopAction> {
        C2423a() {
        }

        /* renamed from: a */
        public EndLoopAction createFromParcel(Parcel parcel) {
            return new EndLoopAction(parcel, (C2423a) null);
        }

        /* renamed from: b */
        public EndLoopAction[] newArray(int i) {
            return new EndLoopAction[i];
        }
    }

    /* synthetic */ EndLoopAction(Parcel parcel, C2423a aVar) {
        this(parcel);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7852u0.m32834u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    public EndLoopAction() {
    }

    private EndLoopAction(Parcel parcel) {
        super(parcel);
    }
}
