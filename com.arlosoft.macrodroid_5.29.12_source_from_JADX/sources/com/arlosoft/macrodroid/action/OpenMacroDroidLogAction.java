package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.LogActivity;
import com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7780k2;

public class OpenMacroDroidLogAction extends Action {
    public static final Parcelable.Creator<OpenMacroDroidLogAction> CREATOR = new C2559a();
    private static final int LOG_TYPE_SYSTEM = 0;
    private static final int LOG_TYPE_USER = 1;
    private int m_logType;

    /* renamed from: com.arlosoft.macrodroid.action.OpenMacroDroidLogAction$a */
    class C2559a implements Parcelable.Creator<OpenMacroDroidLogAction> {
        C2559a() {
        }

        /* renamed from: a */
        public OpenMacroDroidLogAction createFromParcel(Parcel parcel) {
            return new OpenMacroDroidLogAction(parcel, (C2559a) null);
        }

        /* renamed from: b */
        public OpenMacroDroidLogAction[] newArray(int i) {
            return new OpenMacroDroidLogAction[i];
        }
    }

    /* synthetic */ OpenMacroDroidLogAction(Parcel parcel, C2559a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m11678j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.system_log), SelectableItem.m15535j1(C17541R$string.user_log)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_logType;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m11678j3()[this.m_logType];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7780k2.m32483u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i = this.m_logType;
        if (i == 0) {
            Intent intent = new Intent(mo27827K0(), SystemLogActivity.class);
            intent.addFlags(268435456);
            mo27827K0().startActivity(intent);
        } else if (i == 1) {
            Intent intent2 = new Intent(mo27827K0(), LogActivity.class);
            intent2.putExtra(LogActivity.f12202B, true);
            intent2.addFlags(268435456);
            mo27827K0().startActivity(intent2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11678j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_logType);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_logType = i;
    }

    public OpenMacroDroidLogAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private OpenMacroDroidLogAction() {
        this.m_logType = 0;
    }

    private OpenMacroDroidLogAction(Parcel parcel) {
        super(parcel);
        this.m_logType = parcel.readInt();
    }
}
