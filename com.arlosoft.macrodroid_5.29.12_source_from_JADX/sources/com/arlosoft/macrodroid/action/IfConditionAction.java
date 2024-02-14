package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import p128m0.C7779k1;

public class IfConditionAction extends ParentAction {
    public static final Parcelable.Creator<IfConditionAction> CREATOR = new C2484a();

    /* renamed from: com.arlosoft.macrodroid.action.IfConditionAction$a */
    class C2484a implements Parcelable.Creator<IfConditionAction> {
        C2484a() {
        }

        /* renamed from: a */
        public IfConditionAction createFromParcel(Parcel parcel) {
            return new IfConditionAction(parcel);
        }

        /* renamed from: b */
        public IfConditionAction[] newArray(int i) {
            return new IfConditionAction[i];
        }
    }

    public IfConditionAction() {
    }

    /* renamed from: E0 */
    public String mo25226E0() {
        return mo24738G0() + " " + mo24672O0();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.if_condition_short);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (mo27826J0().size() > i) {
                sb.append(mo27826J0().get(i).mo27823H0());
                if (i < mo27826J0().size() - 1 && i < 4) {
                    sb.append(" ");
                    sb.append(SelectableItem.m15535j1(mo27825I0() ? C17541R$string.f7057or : C17541R$string.and));
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7779k1.m32478u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 160) + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        mo24877t3(true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w3 */
    public String mo24878w3() {
        return SelectableItem.m15535j1(C17541R$string.enter_condition_if);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
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

    public IfConditionAction(Activity activity, Macro macro) {
        super(activity, macro);
    }

    protected IfConditionAction(Parcel parcel) {
        super(parcel);
    }
}
