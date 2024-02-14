package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.app.UiModeManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p123l1.C7629m;

/* compiled from: DarkThemeConstraint.kt */
public final class DarkThemeConstraint extends Constraint {
    public static final Parcelable.Creator<DarkThemeConstraint> CREATOR = new C4131a();

    /* renamed from: f */
    public static final C4132b f10715f = new C4132b((C13695i) null);
    private int option;

    /* renamed from: com.arlosoft.macrodroid.constraint.DarkThemeConstraint$a */
    /* compiled from: DarkThemeConstraint.kt */
    public static final class C4131a implements Parcelable.Creator<DarkThemeConstraint> {
        C4131a() {
        }

        /* renamed from: a */
        public DarkThemeConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new DarkThemeConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public DarkThemeConstraint[] newArray(int i) {
            return new DarkThemeConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.DarkThemeConstraint$b */
    /* compiled from: DarkThemeConstraint.kt */
    public static final class C4132b {
        private C4132b() {
        }

        public /* synthetic */ C4132b(C13695i iVar) {
            this();
        }
    }

    public DarkThemeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ DarkThemeConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: g3 */
    private final String[] m16369g3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.enabled), SelectableItem.m15535j1(C17541R$string.disabled)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = m16369g3()[this.option];
        C13706o.m87928e(str, "getOptions()[option]");
        return str;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        Object systemService = mo27827K0().getSystemService("uimode");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        try {
            if (((UiModeManager) systemService).getNightMode() == 2) {
                if (this.option != 0) {
                    return false;
                }
            } else if (this.option == 1) {
                return true;
            } else {
                return false;
            }
            return true;
        } catch (Exception e) {
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Device does not have ui_night_mode flag, so DarkThemeConstraint cannot work: " + e, Y0.longValue());
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7629m.f18536g.mo37668a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16369g3();
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

    public DarkThemeConstraint() {
    }

    private DarkThemeConstraint(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
