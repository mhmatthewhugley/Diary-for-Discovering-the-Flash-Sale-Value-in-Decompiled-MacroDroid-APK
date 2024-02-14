package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.UiModeManager;
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
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7729e0;
import p150q2.C8164a;

/* compiled from: DarkThemeAction.kt */
public final class DarkThemeAction extends Action {
    public static final Parcelable.Creator<DarkThemeAction> CREATOR = new C2392a();

    /* renamed from: d */
    public static final C2393b f7208d = new C2393b((C13695i) null);
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.DarkThemeAction$a */
    /* compiled from: DarkThemeAction.kt */
    public static final class C2392a implements Parcelable.Creator<DarkThemeAction> {
        C2392a() {
        }

        /* renamed from: a */
        public DarkThemeAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new DarkThemeAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public DarkThemeAction[] newArray(int i) {
            return new DarkThemeAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DarkThemeAction$b */
    /* compiled from: DarkThemeAction.kt */
    public static final class C2393b {
        private C2393b() {
        }

        public /* synthetic */ C2393b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m10351b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable), SelectableItem.m15535j1(C17541R$string.toggle)};
        }
    }

    public DarkThemeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ DarkThemeAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: k3 */
    private final void m10340k3(int i) {
        boolean z = false;
        if (!C8164a.m33886a()) {
            try {
                z = Settings.Secure.putInt(mo27827K0().getContentResolver(), "ui_night_mode", i);
            } catch (Exception unused) {
            }
            if (!z) {
                Long Y0 = mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18869h("Could not set colour dark theme, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", Y0.longValue());
                return;
            }
            return;
        }
        C4061t1.m15947B0(new String[]{"settings put secure ui_night_mode " + i});
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = f7208d.m10351b()[this.option];
        C13706o.m87928e(str, "getOptions()[option]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7729e0.f18703l.mo37749a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        int i;
        Object systemService = mo27827K0().getSystemService("uimode");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        UiModeManager uiModeManager = (UiModeManager) systemService;
        try {
            i = Settings.Secure.getInt(mo27827K0().getContentResolver(), "ui_night_mode");
        } catch (Settings.SettingNotFoundException unused) {
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Could not find existing setting for ui_night_mode", Y0.longValue());
            i = 1;
        }
        for (int i2 = 1; i2 < 3; i2++) {
            uiModeManager.enableCarMode(0);
            int i3 = this.option;
            int i4 = 2;
            if (i3 == 0) {
                m10340k3(2);
            } else if (i3 != 1) {
                if (i != 1) {
                    i4 = 1;
                }
                m10340k3(i4);
            } else {
                m10340k3(1);
            }
            uiModeManager.disableCarMode(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return f7208d.m10351b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public DarkThemeAction() {
    }

    private DarkThemeAction(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
