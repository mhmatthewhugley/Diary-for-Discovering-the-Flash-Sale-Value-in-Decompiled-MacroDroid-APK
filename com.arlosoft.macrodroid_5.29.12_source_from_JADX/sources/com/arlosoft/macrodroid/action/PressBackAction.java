package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityServiceJellyBean;
import p128m0.C7824q2;
import p148q0.C8151a;

public class PressBackAction extends Action {
    public static final Parcelable.Creator<PressBackAction> CREATOR = new C2581a();

    /* renamed from: com.arlosoft.macrodroid.action.PressBackAction$a */
    class C2581a implements Parcelable.Creator<PressBackAction> {
        C2581a() {
        }

        /* renamed from: a */
        public PressBackAction createFromParcel(Parcel parcel) {
            return new PressBackAction(parcel, (C2581a) null);
        }

        /* renamed from: b */
        public PressBackAction[] newArray(int i) {
            return new PressBackAction[i];
        }
    }

    /* synthetic */ PressBackAction(Parcel parcel, C2581a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7824q2.m32703u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            if (C4061t1.m15992f0(mo27827K0())) {
                Intent intent = new Intent(mo27827K0(), MacroDroidAccessibilityServiceJellyBean.class);
                intent.putExtra("GlobalControlType", 1);
                mo27827K0().startService(intent);
                return;
            }
            C4061t1.m15947B0(new String[]{"input keyevent 4"});
        } catch (Exception e) {
            C8151a.m33873n(e);
            C4878b.m18868g("Press back failed: " + e.toString());
        }
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        return true;
    }

    public PressBackAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private PressBackAction() {
    }

    private PressBackAction(Parcel parcel) {
        super(parcel);
    }
}
