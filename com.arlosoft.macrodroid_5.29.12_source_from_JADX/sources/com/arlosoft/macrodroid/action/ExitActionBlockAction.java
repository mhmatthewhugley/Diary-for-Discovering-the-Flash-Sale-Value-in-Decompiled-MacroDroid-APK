package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.ContinuePausedActionsHandler;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7858v0;

/* compiled from: ExitActionBlockAction.kt */
public final class ExitActionBlockAction extends Action {
    public static final Parcelable.Creator<ExitActionBlockAction> CREATOR = new C2424a();

    /* renamed from: d */
    public static final C2425b f7226d = new C2425b((C13695i) null);

    /* renamed from: com.arlosoft.macrodroid.action.ExitActionBlockAction$a */
    /* compiled from: ExitActionBlockAction.kt */
    public static final class C2424a implements Parcelable.Creator<ExitActionBlockAction> {
        C2424a() {
        }

        /* renamed from: a */
        public ExitActionBlockAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ExitActionBlockAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ExitActionBlockAction[] newArray(int i) {
            return new ExitActionBlockAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ExitActionBlockAction$b */
    /* compiled from: ExitActionBlockAction.kt */
    public static final class C2425b {
        private C2425b() {
        }

        public /* synthetic */ C2425b(C13695i iVar) {
            this();
        }
    }

    public ExitActionBlockAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ExitActionBlockAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7858v0.f18913j.mo37773a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        C4934n M = C4934n.m18998M();
        C13706o.m87927d(M, "null cannot be cast to non-null type com.arlosoft.macrodroid.macro.ActionBlockStore");
        ActionBlock g = M.mo29649g(mo27837X0().getGUID());
        if (g != null) {
            g.cancelActiveMacro(mo27827K0());
            ContinuePausedActionsHandler.m18973b(mo27827K0(), g);
            return;
        }
        C4878b.m18882u("Failed to exit current action block");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    public ExitActionBlockAction() {
    }

    private ExitActionBlockAction(Parcel parcel) {
        super(parcel);
    }
}
