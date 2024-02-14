package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7567w0;

/* compiled from: MacroEnabledTrigger.kt */
public final class MacroEnabledTrigger extends Trigger {
    public static final Parcelable.Creator<MacroEnabledTrigger> CREATOR = new C5694a();

    /* renamed from: d */
    public static final C5695b f13643d = new C5695b((C13695i) null);

    /* renamed from: com.arlosoft.macrodroid.triggers.MacroEnabledTrigger$a */
    /* compiled from: MacroEnabledTrigger.kt */
    public static final class C5694a implements Parcelable.Creator<MacroEnabledTrigger> {
        C5694a() {
        }

        /* renamed from: a */
        public MacroEnabledTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new MacroEnabledTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public MacroEnabledTrigger[] newArray(int i) {
            return new MacroEnabledTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.MacroEnabledTrigger$b */
    /* compiled from: MacroEnabledTrigger.kt */
    public static final class C5695b {
        private C5695b() {
        }

        public /* synthetic */ C5695b(C13695i iVar) {
            this();
        }
    }

    public MacroEnabledTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ MacroEnabledTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7567w0.f18469j.mo37653a();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (mo27845e0(new TriggerContextInfo((Trigger) this))) {
            Macro X0 = mo27837X0();
            boolean z = true;
            if (X0 == null || !X0.canInvoke(mo27837X0().getTriggerContextInfo())) {
                z = false;
            }
            if (z) {
                mo27837X0().setTriggerThatInvoked(this);
                try {
                    mo27837X0().invokeActions(mo27837X0().getTriggerContextInfo());
                } catch (Exception e) {
                    Long Y0 = mo27840Y0();
                    C13706o.m87928e(Y0, "macroGuid");
                    C4878b.m18869h("Enabled trigger failed: " + e, Y0.longValue());
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    public MacroEnabledTrigger() {
    }

    private MacroEnabledTrigger(Parcel parcel) {
        super(parcel);
    }
}
