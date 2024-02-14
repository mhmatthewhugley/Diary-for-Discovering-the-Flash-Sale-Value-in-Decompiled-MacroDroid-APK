package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.clipboard.ClipboardReadActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Stack;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p057a2.C2212a;
import p128m0.C7885y4;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: UpdateClipboardAction.kt */
public final class UpdateClipboardAction extends Action implements C2212a {
    public static final Parcelable.Creator<UpdateClipboardAction> CREATOR = new C2774a();

    /* renamed from: d */
    public static final C2775b f7687d = new C2775b((C13695i) null);

    /* renamed from: com.arlosoft.macrodroid.action.UpdateClipboardAction$a */
    /* compiled from: UpdateClipboardAction.kt */
    public static final class C2774a implements Parcelable.Creator<UpdateClipboardAction> {
        C2774a() {
        }

        /* renamed from: a */
        public UpdateClipboardAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new UpdateClipboardAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public UpdateClipboardAction[] newArray(int i) {
            return new UpdateClipboardAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UpdateClipboardAction$b */
    /* compiled from: UpdateClipboardAction.kt */
    public static final class C2775b {
        private C2775b() {
        }

        public /* synthetic */ C2775b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UpdateClipboardAction$c */
    /* compiled from: UpdateClipboardAction.kt */
    static final class C2776c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ TriggerContextInfo $contextInfo;
        final /* synthetic */ boolean $forceEvenIfNotEnabled;
        final /* synthetic */ boolean $isTest;
        final /* synthetic */ int $nextAction;
        final /* synthetic */ ResumeMacroInfo $resumeMacroInfo;
        final /* synthetic */ Stack<Integer> $skipEndifIndexStack;
        int label;
        final /* synthetic */ UpdateClipboardAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2776c(boolean z, UpdateClipboardAction updateClipboardAction, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, C13635d<? super C2776c> dVar) {
            super(2, dVar);
            this.$isTest = z;
            this.this$0 = updateClipboardAction;
            this.$nextAction = i;
            this.$contextInfo = triggerContextInfo;
            this.$forceEvenIfNotEnabled = z2;
            this.$skipEndifIndexStack = stack;
            this.$resumeMacroInfo = resumeMacroInfo;
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m13682p(UpdateClipboardAction updateClipboardAction, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack stack, ResumeMacroInfo resumeMacroInfo) {
            updateClipboardAction.mo27837X0().invokeActions(updateClipboardAction.mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2776c(this.$isTest, this.this$0, this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2776c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(2500, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!this.$isTest) {
                new Handler(Looper.getMainLooper()).post(new C3554vp(this.this$0, this.$nextAction, this.$contextInfo, this.$forceEvenIfNotEnabled, this.$skipEndifIndexStack, this.$resumeMacroInfo));
            }
            return C13339u.f61331a;
        }
    }

    public UpdateClipboardAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ UpdateClipboardAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7885y4.f18955j.mo37778a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        Intent intent = new Intent(mo27827K0(), ClipboardReadActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("do_not_trigger", true);
        mo27827K0().startActivity(intent);
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C2776c(z2, this, i, triggerContextInfo, z, stack, resumeMacroInfo, (C13635d<? super C2776c>) null), 3, (Object) null);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    public UpdateClipboardAction() {
    }

    private UpdateClipboardAction(Parcel parcel) {
        super(parcel);
    }
}
