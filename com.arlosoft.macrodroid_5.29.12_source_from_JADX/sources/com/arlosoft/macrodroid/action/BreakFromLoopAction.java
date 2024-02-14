package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7776k;

/* compiled from: BreakFromLoopAction.kt */
public final class BreakFromLoopAction extends Action {
    public static final Parcelable.Creator<BreakFromLoopAction> CREATOR = new C2341a();

    /* renamed from: d */
    public static final C2342b f7153d = new C2342b((C13695i) null);

    /* renamed from: com.arlosoft.macrodroid.action.BreakFromLoopAction$a */
    /* compiled from: BreakFromLoopAction.kt */
    public static final class C2341a implements Parcelable.Creator<BreakFromLoopAction> {
        C2341a() {
        }

        /* renamed from: a */
        public BreakFromLoopAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new BreakFromLoopAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public BreakFromLoopAction[] newArray(int i) {
            return new BreakFromLoopAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.BreakFromLoopAction$b */
    /* compiled from: BreakFromLoopAction.kt */
    public static final class C2342b {
        private C2342b() {
        }

        public /* synthetic */ C2342b(C13695i iVar) {
            this();
        }
    }

    public BreakFromLoopAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ BreakFromLoopAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7776k.f18781j.mo37758a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    public BreakFromLoopAction() {
    }

    private BreakFromLoopAction(Parcel parcel) {
        super(parcel);
    }
}
