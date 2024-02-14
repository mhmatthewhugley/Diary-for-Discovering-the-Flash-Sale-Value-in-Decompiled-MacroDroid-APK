package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7756h2;
import p319lc.C15626c;

public class OpenCallLogAction extends Action {
    public static final Parcelable.Creator<OpenCallLogAction> CREATOR = new C2555a();

    /* renamed from: com.arlosoft.macrodroid.action.OpenCallLogAction$a */
    class C2555a implements Parcelable.Creator<OpenCallLogAction> {
        C2555a() {
        }

        /* renamed from: a */
        public OpenCallLogAction createFromParcel(Parcel parcel) {
            return new OpenCallLogAction(parcel, (C2555a) null);
        }

        /* renamed from: b */
        public OpenCallLogAction[] newArray(int i) {
            return new OpenCallLogAction[i];
        }
    }

    /* synthetic */ OpenCallLogAction(Parcel parcel, C2555a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7756h2.m32368u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setType("vnd.android.cursor.dir/calls");
            intent.addFlags(268435456);
            mo27827K0().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), SelectableItem.m15535j1(C17541R$string.no_app_available), 0).show();
            C4878b.m18883v("No app found to display call log", mo27840Y0().longValue());
        }
    }

    public OpenCallLogAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private OpenCallLogAction() {
    }

    private OpenCallLogAction(Parcel parcel) {
        super(parcel);
    }
}
