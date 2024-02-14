package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
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
import p128m0.C7800n1;
import p150q2.C8164a;

public class InvertColoursAction extends Action {
    public static final Parcelable.Creator<InvertColoursAction> CREATOR = new C2490a();
    private int m_option;

    /* renamed from: com.arlosoft.macrodroid.action.InvertColoursAction$a */
    class C2490a implements Parcelable.Creator<InvertColoursAction> {
        C2490a() {
        }

        /* renamed from: a */
        public InvertColoursAction createFromParcel(Parcel parcel) {
            return new InvertColoursAction(parcel, (C2490a) null);
        }

        /* renamed from: b */
        public InvertColoursAction[] newArray(int i) {
            return new InvertColoursAction[i];
        }
    }

    /* synthetic */ InvertColoursAction(Parcel parcel, C2490a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m11019j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.f7056on), SelectableItem.m15535j1(C17541R$string.off), SelectableItem.m15535j1(C17541R$string.toggle)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_invert_colours) + " " + m11019j3()[this.m_option];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7800n1.m32584u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        boolean z;
        boolean z2;
        int i = this.m_option;
        boolean z3 = false;
        int i2 = 1;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            z = true;
        } else {
            try {
                if (Settings.Secure.getInt(mo27827K0().getContentResolver(), "accessibility_display_inversion_enabled") != 0) {
                    z2 = true;
                    z = !z2;
                }
            } catch (Settings.SettingNotFoundException unused) {
            }
            z2 = false;
            z = !z2;
        }
        if (!C8164a.m33886a()) {
            try {
                ContentResolver contentResolver = mo27827K0().getContentResolver();
                if (!z) {
                    i2 = 0;
                }
                z3 = Settings.Secure.putInt(contentResolver, "accessibility_display_inversion_enabled", i2);
            } catch (Exception unused2) {
            }
            if (!z3) {
                C4878b.m18869h("Could not set colour inversion, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", mo27840Y0().longValue());
            }
        } else if (z) {
            C4061t1.m15947B0(new String[]{"settings put secure accessibility_display_inversion_enabled 1"});
        } else {
            C4061t1.m15947B0(new String[]{"settings put secure accessibility_display_inversion_enabled 0"});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11019j3();
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

    public InvertColoursAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private InvertColoursAction() {
        this.m_option = 0;
    }

    private InvertColoursAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
    }
}
