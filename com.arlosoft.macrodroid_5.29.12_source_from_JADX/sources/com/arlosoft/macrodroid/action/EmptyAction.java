package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7837s0;

/* compiled from: EmptyAction.kt */
public final class EmptyAction extends Action {
    public static final Parcelable.Creator<EmptyAction> CREATOR = new C2420a();

    /* renamed from: d */
    public static final C2421b f7225d = new C2421b((C13695i) null);
    private int state;

    /* renamed from: com.arlosoft.macrodroid.action.EmptyAction$a */
    /* compiled from: EmptyAction.kt */
    public static final class C2420a implements Parcelable.Creator<EmptyAction> {
        C2420a() {
        }

        /* renamed from: a */
        public EmptyAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new EmptyAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public EmptyAction[] newArray(int i) {
            return new EmptyAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.EmptyAction$b */
    /* compiled from: EmptyAction.kt */
    public static final class C2421b {
        private C2421b() {
        }

        public /* synthetic */ C2421b(C13695i iVar) {
            this();
        }
    }

    public EmptyAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ EmptyAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7837s0.f18883j.mo37770a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    public EmptyAction() {
    }

    private EmptyAction(Parcel parcel) {
        super(parcel);
    }
}
