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
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityServiceJellyBean;
import p128m0.C7737f;

public class AndroidShortcutsAction extends Action {
    public static final Parcelable.Creator<AndroidShortcutsAction> CREATOR = new C2332a();
    private static final int GLOBAL_ACTION_RECENTS = 2;
    private static final int POWER_DIALOG = 1;
    private static final int QUICK_SETTINGS = 0;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.AndroidShortcutsAction$a */
    class C2332a implements Parcelable.Creator<AndroidShortcutsAction> {
        C2332a() {
        }

        /* renamed from: a */
        public AndroidShortcutsAction createFromParcel(Parcel parcel) {
            return new AndroidShortcutsAction(parcel, (C2332a) null);
        }

        /* renamed from: b */
        public AndroidShortcutsAction[] newArray(int i) {
            return new AndroidShortcutsAction[i];
        }
    }

    /* synthetic */ AndroidShortcutsAction(Parcel parcel, C2332a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m9740j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_android_shortcuts_settings), SelectableItem.m15535j1(C17541R$string.action_android_shortcuts_options), SelectableItem.m15535j1(C17541R$string.action_android_shortcuts_recent)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m9740j3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7737f.m32273u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Intent intent = new Intent(mo27827K0(), MacroDroidAccessibilityServiceJellyBean.class);
        int i = this.m_option;
        if (i == 0) {
            intent.setAction("com.arlosoft.macrodroid.triggers.services.GLOBAL_CONTROL");
            intent.putExtra("GlobalControlType", 5);
        } else if (i == 1) {
            intent.setAction("com.arlosoft.macrodroid.triggers.services.GLOBAL_CONTROL");
            intent.putExtra("GlobalControlType", 6);
        } else if (i == 2) {
            intent.setAction("com.arlosoft.macrodroid.triggers.services.GLOBAL_CONTROL");
            intent.putExtra("GlobalControlType", 3);
        }
        mo27827K0().startService(intent);
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9740j3();
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

    public AndroidShortcutsAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AndroidShortcutsAction() {
    }

    private AndroidShortcutsAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
