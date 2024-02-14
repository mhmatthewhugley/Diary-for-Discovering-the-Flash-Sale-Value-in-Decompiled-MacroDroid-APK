package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.UiModeManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7798n;

public class CarModeAction extends Action {
    private static final int CAR_MODE_OFF = 1;
    private static final int CAR_MODE_ON = 0;
    private static final int CAR_MODE_TOGGLE = 2;
    public static final Parcelable.Creator<CarModeAction> CREATOR = new C2347a();
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.CarModeAction$a */
    class C2347a implements Parcelable.Creator<CarModeAction> {
        C2347a() {
        }

        /* renamed from: a */
        public CarModeAction createFromParcel(Parcel parcel) {
            return new CarModeAction(parcel, (C2347a) null);
        }

        /* renamed from: b */
        public CarModeAction[] newArray(int i) {
            return new CarModeAction[i];
        }
    }

    /* synthetic */ CarModeAction(Parcel parcel, C2347a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m9932j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable), SelectableItem.m15535j1(C17541R$string.toggle)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m9932j3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7798n.m32574u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        UiModeManager uiModeManager = (UiModeManager) mo27827K0().getSystemService("uimode");
        int i = this.m_option;
        if (i == 0) {
            uiModeManager.enableCarMode(1);
        } else if (i == 1) {
            uiModeManager.disableCarMode(1);
        } else if (i == 2) {
            if (uiModeManager.getCurrentModeType() == 3) {
                uiModeManager.disableCarMode(1);
            } else {
                uiModeManager.enableCarMode(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9932j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public CarModeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private CarModeAction() {
    }

    private CarModeAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
