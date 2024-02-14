package com.arlosoft.macrodroid.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7814p0;

public class ElseAction extends ElseParentAction {
    public static final Parcelable.Creator<ElseAction> CREATOR = new C2413a();

    /* renamed from: com.arlosoft.macrodroid.action.ElseAction$a */
    class C2413a implements Parcelable.Creator<ElseAction> {
        C2413a() {
        }

        /* renamed from: a */
        public ElseAction createFromParcel(Parcel parcel) {
            return new ElseAction(parcel);
        }

        /* renamed from: b */
        public ElseAction[] newArray(int i) {
            return new ElseAction[i];
        }
    }

    public ElseAction() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7814p0.m32653u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    protected ElseAction(Parcel parcel) {
        super(parcel);
    }
}
