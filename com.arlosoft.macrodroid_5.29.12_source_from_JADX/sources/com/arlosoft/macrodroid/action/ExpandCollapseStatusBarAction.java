package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityServiceJellyBean;
import p128m0.C7866w0;

public class ExpandCollapseStatusBarAction extends Action {
    public static final Parcelable.Creator<ExpandCollapseStatusBarAction> CREATOR = new C2426a();
    private static final int OPTION_COLLAPSE = 1;
    private static final int OPTION_EXPAND = 0;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.ExpandCollapseStatusBarAction$a */
    class C2426a implements Parcelable.Creator<ExpandCollapseStatusBarAction> {
        C2426a() {
        }

        /* renamed from: a */
        public ExpandCollapseStatusBarAction createFromParcel(Parcel parcel) {
            return new ExpandCollapseStatusBarAction(parcel, (C2426a) null);
        }

        /* renamed from: b */
        public ExpandCollapseStatusBarAction[] newArray(int i) {
            return new ExpandCollapseStatusBarAction[i];
        }
    }

    /* synthetic */ ExpandCollapseStatusBarAction(Parcel parcel, C2426a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m10572j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.expand_status_bar), SelectableItem.m15535j1(C17541R$string.collapse_status_bar)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m10572j3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7866w0.m32903u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.m_option == 0) {
            Intent intent = new Intent(mo27827K0(), MacroDroidAccessibilityServiceJellyBean.class);
            intent.putExtra("GlobalControlType", 4);
            mo27827K0().startService(intent);
        } else if (Build.VERSION.SDK_INT >= 31) {
            Intent intent2 = new Intent(mo27827K0(), MacroDroidAccessibilityServiceJellyBean.class);
            intent2.putExtra("GlobalControlType", 15);
            mo27827K0().startService(intent2);
        } else {
            mo27827K0().sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m10572j3();
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

    public ExpandCollapseStatusBarAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ExpandCollapseStatusBarAction() {
    }

    private ExpandCollapseStatusBarAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
