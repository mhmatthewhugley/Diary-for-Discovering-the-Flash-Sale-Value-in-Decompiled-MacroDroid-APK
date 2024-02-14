package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7738f0;
import p319lc.C15626c;

public class DayDreamAction extends Action {
    public static final Parcelable.Creator<DayDreamAction> CREATOR = new C2394a();

    /* renamed from: com.arlosoft.macrodroid.action.DayDreamAction$a */
    class C2394a implements Parcelable.Creator<DayDreamAction> {
        C2394a() {
        }

        /* renamed from: a */
        public DayDreamAction createFromParcel(Parcel parcel) {
            return new DayDreamAction(parcel, (C2394a) null);
        }

        /* renamed from: b */
        public DayDreamAction[] newArray(int i) {
            return new DayDreamAction[i];
        }
    }

    /* synthetic */ DayDreamAction(Parcel parcel, C2394a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7738f0.m32280u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setClassName("com.android.systemui", "com.android.systemui.Somnambulator");
            intent.addFlags(268435456);
            mo27827K0().startActivity(intent);
        } catch (Exception unused) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), SelectableItem.m15535j1(C17541R$string.action_daydream_failed), 0).show();
        }
    }

    public DayDreamAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private DayDreamAction() {
    }

    private DayDreamAction(Parcel parcel) {
        super(parcel);
    }
}
