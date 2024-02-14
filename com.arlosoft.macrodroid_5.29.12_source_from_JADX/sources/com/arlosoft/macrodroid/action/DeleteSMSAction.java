package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7754h0;

public class DeleteSMSAction extends Action {
    public static final Parcelable.Creator<DeleteSMSAction> CREATOR = new C2396a();

    /* renamed from: com.arlosoft.macrodroid.action.DeleteSMSAction$a */
    class C2396a implements Parcelable.Creator<DeleteSMSAction> {
        C2396a() {
        }

        /* renamed from: a */
        public DeleteSMSAction createFromParcel(Parcel parcel) {
            return new DeleteSMSAction(parcel, (C2396a) null);
        }

        /* renamed from: b */
        public DeleteSMSAction[] newArray(int i) {
            return new DeleteSMSAction[i];
        }
    }

    /* synthetic */ DeleteSMSAction(Parcel parcel, C2396a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return false;
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        return SelectableItem.m15535j1(C17541R$string.not_available_policy_restrictions);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7754h0.m32357u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        C4878b.m18868g(SelectableItem.m15535j1(C17541R$string.not_available_policy_restrictions));
    }

    public DeleteSMSAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DeleteSMSAction() {
    }

    private DeleteSMSAction(Parcel parcel) {
        super(parcel);
    }
}
