package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6457x1;
import p128m0.C7698a5;

public class VibrateAction extends Action {
    public static final Parcelable.Creator<VibrateAction> CREATOR = new C2779a();
    private int m_vibratePattern;

    /* renamed from: com.arlosoft.macrodroid.action.VibrateAction$a */
    class C2779a implements Parcelable.Creator<VibrateAction> {
        C2779a() {
        }

        /* renamed from: a */
        public VibrateAction createFromParcel(Parcel parcel) {
            return new VibrateAction(parcel, (C2779a) null);
        }

        /* renamed from: b */
        public VibrateAction[] newArray(int i) {
            return new VibrateAction[i];
        }
    }

    /* synthetic */ VibrateAction(Parcel parcel, C2779a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_vibratePattern;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_vibrate) + " (" + C6457x1.m24785a()[this.m_vibratePattern] + ")";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7698a5.m32102u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        C6457x1.m24786b(mo27827K0(), this.m_vibratePattern);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return C6457x1.m24785a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_vibratePattern);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_vibratePattern = i;
        C6457x1.m24786b(mo27827K0(), this.m_vibratePattern);
    }

    public VibrateAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private VibrateAction() {
        this.m_vibratePattern = 0;
    }

    private VibrateAction(Parcel parcel) {
        super(parcel);
        this.m_vibratePattern = parcel.readInt();
    }
}
