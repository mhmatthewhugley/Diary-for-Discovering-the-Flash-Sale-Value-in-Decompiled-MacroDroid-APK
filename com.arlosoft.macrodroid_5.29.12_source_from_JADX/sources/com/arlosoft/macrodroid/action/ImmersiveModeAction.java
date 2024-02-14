package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7794m1;
import p150q2.C8164a;

public class ImmersiveModeAction extends Action {
    public static final Parcelable.Creator<ImmersiveModeAction> CREATOR = new C2489a();
    private static final int OPTION_FULL_IMMERSIVE = 3;
    private static final int OPTION_HIDE_NAV_BAR = 1;
    private static final int OPTION_HIDE_STATUS_BAR = 2;
    private static final int OPTION_OFF = 0;
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.ImmersiveModeAction$a */
    class C2489a implements Parcelable.Creator<ImmersiveModeAction> {
        C2489a() {
        }

        /* renamed from: a */
        public ImmersiveModeAction createFromParcel(Parcel parcel) {
            return new ImmersiveModeAction(parcel, (C2489a) null);
        }

        /* renamed from: b */
        public ImmersiveModeAction[] newArray(int i) {
            return new ImmersiveModeAction[i];
        }
    }

    /* synthetic */ ImmersiveModeAction(Parcel parcel, C2489a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m11009j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_immersive_mode_off), SelectableItem.m15535j1(C17541R$string.action_immersive_mode_hide_nave_bar), SelectableItem.m15535j1(C17541R$string.action_immersive_hide_status_bar), SelectableItem.m15535j1(C17541R$string.action_immersive_mode_full)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_option == 0) {
            return m11009j3()[0];
        }
        return mo25559a1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_option == 0) {
            return "";
        }
        return m11009j3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7794m1.m32550u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i = this.m_option;
        String str = i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "immersive.full=*" : "immersive.status=*" : "immersive.navigation=*" : "immersive.preconfirms=*";
        boolean z = false;
        if (!C8164a.m33886a()) {
            try {
                z = Settings.Global.putString(mo27827K0().getContentResolver(), "policy_control", str);
            } catch (Exception unused) {
            }
            if (!z) {
                C4878b.m18869h("Could not set immersive mode, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", mo27840Y0().longValue());
                return;
            }
            return;
        }
        C4061t1.m15947B0(new String[]{"settings put global policy_control " + str});
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11009j3();
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

    public ImmersiveModeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ImmersiveModeAction() {
    }

    private ImmersiveModeAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
