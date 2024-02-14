package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17525R$array;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.LocationTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7834r3;

public class SetLocationUpdateRateAction extends Action {
    public static final Parcelable.Creator<SetLocationUpdateRateAction> CREATOR = new C2641a();
    private transient String[] m_optionList;
    private transient String[] m_optionSecondValues;
    private int m_updateRate;
    private int m_updateRateSeconds;

    /* renamed from: com.arlosoft.macrodroid.action.SetLocationUpdateRateAction$a */
    class C2641a implements Parcelable.Creator<SetLocationUpdateRateAction> {
        C2641a() {
        }

        /* renamed from: a */
        public SetLocationUpdateRateAction createFromParcel(Parcel parcel) {
            return new SetLocationUpdateRateAction(parcel, (C2641a) null);
        }

        /* renamed from: b */
        public SetLocationUpdateRateAction[] newArray(int i) {
            return new SetLocationUpdateRateAction[i];
        }
    }

    /* synthetic */ SetLocationUpdateRateAction(Parcel parcel, C2641a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m12493D1() {
        this.m_optionList = mo27827K0().getResources().getStringArray(C17525R$array.location_trigger_update_rate_names);
        this.m_optionSecondValues = mo27827K0().getResources().getStringArray(C17525R$array.location_trigger_update_rates);
        this.m_updateRateSeconds = 600;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = 0;
        while (true) {
            String[] strArr = this.m_optionSecondValues;
            if (i >= strArr.length) {
                return 0;
            }
            if (Integer.valueOf(strArr[i]).intValue() == this.m_updateRateSeconds) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_optionList[mo24671D0()];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7834r3.m32749u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.m_updateRate != 0) {
            C5163j2.m20299x4(mo27827K0(), this.m_updateRate * 60);
        } else {
            C5163j2.m20299x4(mo27827K0(), this.m_updateRateSeconds);
        }
        LocationTrigger.m22607k3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return this.m_optionList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.action_set_location_update_rate);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_updateRate);
        parcel.writeInt(this.m_updateRateSeconds);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_updateRateSeconds = Integer.valueOf(this.m_optionSecondValues[i]).intValue();
        this.m_updateRate = 0;
    }

    public SetLocationUpdateRateAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetLocationUpdateRateAction() {
        m12493D1();
    }

    private SetLocationUpdateRateAction(Parcel parcel) {
        super(parcel);
        m12493D1();
        this.m_updateRate = parcel.readInt();
        this.m_updateRateSeconds = parcel.readInt();
    }
}
