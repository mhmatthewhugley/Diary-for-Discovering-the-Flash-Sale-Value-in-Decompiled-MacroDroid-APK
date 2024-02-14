package com.arlosoft.macrodroid.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7814p0;

public class ElseParentAction extends ConditionAction {
    public static final Parcelable.Creator<ElseParentAction> CREATOR = new C2419a();

    /* renamed from: com.arlosoft.macrodroid.action.ElseParentAction$a */
    class C2419a implements Parcelable.Creator<ElseParentAction> {
        C2419a() {
        }

        /* renamed from: a */
        public ElseParentAction createFromParcel(Parcel parcel) {
            return new ElseParentAction(parcel);
        }

        /* renamed from: b */
        public ElseParentAction[] newArray(int i) {
            return new ElseParentAction[i];
        }
    }

    public ElseParentAction() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7814p0.m32653u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w3 */
    public String mo24878w3() {
        return SelectableItem.m15535j1(C17541R$string.enter_condition_if);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y3 */
    public String mo24880y3() {
        StringBuilder sb = new StringBuilder(SelectableItem.m15535j1(C17541R$string.if_condition_short));
        sb.append(" (");
        int size = mo27826J0().size();
        for (int i = 0; i < size; i++) {
            sb.append(mo27826J0().get(i).mo24738G0());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(") ");
        return sb.toString();
    }

    protected ElseParentAction(Parcel parcel) {
        super(parcel);
    }
}
