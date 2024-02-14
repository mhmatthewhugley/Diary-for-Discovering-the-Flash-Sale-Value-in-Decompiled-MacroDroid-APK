package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver;
import com.arlosoft.macrodroid.utils.HelperSystemCommands;
import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import p128m0.C7785l0;

/* compiled from: DisableCameraAction.kt */
public final class DisableCameraAction extends Action {
    public static final Parcelable.Creator<DisableCameraAction> CREATOR = new C2404a();

    /* renamed from: d */
    public static final C2405b f7217d = new C2405b((C13695i) null);
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.DisableCameraAction$a */
    /* compiled from: DisableCameraAction.kt */
    public static final class C2404a implements Parcelable.Creator<DisableCameraAction> {
        C2404a() {
        }

        /* renamed from: a */
        public DisableCameraAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new DisableCameraAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public DisableCameraAction[] newArray(int i) {
            return new DisableCameraAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DisableCameraAction$b */
    /* compiled from: DisableCameraAction.kt */
    public static final class C2405b {
        private C2405b() {
        }

        public /* synthetic */ C2405b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m10445b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable), SelectableItem.m15535j1(C17541R$string.toggle)};
        }
    }

    public DisableCameraAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ DisableCameraAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return Build.VERSION.SDK_INT <= 29;
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (mo24824M1()) {
            return null;
        }
        C13696i0 i0Var = C13696i0.f61931a;
        String j1 = SelectableItem.m15535j1(C17541R$string.feature_only_available_up_to_android_version);
        C13706o.m87928e(j1, "getString(R.string.featu…le_up_to_android_version)");
        String format = String.format(j1, Arrays.copyOf(new Object[]{10}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        return format;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = f7217d.m10445b()[this.option];
        C13706o.m87928e(str, "getOptions()[option]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7785l0.f18798j.mo37760a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        ComponentName componentName = new ComponentName(mo27827K0(), MacroDroidDeviceAdminReceiver.class);
        Object systemService = mo27827K0().getSystemService("device_policy");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) systemService;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            int i = this.option;
            if (i == 0) {
                Context K0 = mo27827K0();
                C13706o.m87928e(K0, "context");
                HelperSystemCommands.m24580c(K0, 1);
                Long Y0 = mo27840Y0();
                C13706o.m87928e(Y0, "getMacroGuid()");
                C4878b.m18874m("Sending request to Helper File to enable camera", Y0.longValue());
            } else if (i == 1) {
                Context K02 = mo27827K0();
                C13706o.m87928e(K02, "context");
                HelperSystemCommands.m24580c(K02, 0);
                Long Y02 = mo27840Y0();
                C13706o.m87928e(Y02, "getMacroGuid()");
                C4878b.m18874m("Sending request to Helper File to disable camera", Y02.longValue());
            } else if (i == 2) {
                Context K03 = mo27827K0();
                C13706o.m87928e(K03, "context");
                HelperSystemCommands.m24580c(K03, 2);
                Long Y03 = mo27840Y0();
                C13706o.m87928e(Y03, "getMacroGuid()");
                C4878b.m18874m("Sending request to Helper File to toggle camera enabled state", Y03.longValue());
            }
        } else {
            try {
                int i2 = this.option;
                if (i2 == 0) {
                    devicePolicyManager.setCameraDisabled(componentName, false);
                } else if (i2 == 1) {
                    devicePolicyManager.setCameraDisabled(componentName, true);
                } else if (i2 == 2) {
                    if (!devicePolicyManager.getCameraDisabled(componentName)) {
                        z = true;
                    }
                    devicePolicyManager.setCameraDisabled(componentName, z);
                }
            } catch (SecurityException e) {
                Long Y04 = mo27840Y0();
                C13706o.m87928e(Y04, "getMacroGuid()");
                C4878b.m18869h("Could not set camera enabled state: " + e, Y04.longValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return f7217d.m10445b();
    }

    /* renamed from: j2 */
    public boolean mo24958j2() {
        return Build.VERSION.SDK_INT < 29;
    }

    /* renamed from: p2 */
    public Pair<Integer, String> mo24959p2() {
        return new Pair<>(4, "1.4");
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

    public DisableCameraAction() {
    }

    private DisableCameraAction(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
