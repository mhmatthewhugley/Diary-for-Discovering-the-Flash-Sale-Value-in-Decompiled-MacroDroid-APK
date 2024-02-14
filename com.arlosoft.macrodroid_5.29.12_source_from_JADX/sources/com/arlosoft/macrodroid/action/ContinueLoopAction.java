package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7712c0;

/* compiled from: ContinueLoopAction.kt */
public final class ContinueLoopAction extends Action {
    public static final Parcelable.Creator<ContinueLoopAction> CREATOR = new C2387a();

    /* renamed from: d */
    public static final C2388b f7204d = new C2388b((C13695i) null);

    /* renamed from: com.arlosoft.macrodroid.action.ContinueLoopAction$a */
    /* compiled from: ContinueLoopAction.kt */
    public static final class C2387a implements Parcelable.Creator<ContinueLoopAction> {
        C2387a() {
        }

        /* renamed from: a */
        public ContinueLoopAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ContinueLoopAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ContinueLoopAction[] newArray(int i) {
            return new ContinueLoopAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ContinueLoopAction$b */
    /* compiled from: ContinueLoopAction.kt */
    public static final class C2388b {
        private C2388b() {
        }

        public /* synthetic */ C2388b(C13695i iVar) {
            this();
        }
    }

    public ContinueLoopAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ContinueLoopAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7712c0.f18677j.mo37746a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    public ContinueLoopAction() {
    }

    private ContinueLoopAction(Parcel parcel) {
        super(parcel);
    }
}
