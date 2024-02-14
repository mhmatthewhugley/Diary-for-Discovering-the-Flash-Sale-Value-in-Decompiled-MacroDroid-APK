package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Stack;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p057a2.C2212a;
import p057a2.C2224m;
import p116k0.C7467l;
import p128m0.C7787l1;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16272s;

/* compiled from: IfConfirmedThenAction.kt */
public final class IfConfirmedThenAction extends IfConditionAction implements C2224m, C2212a {
    public static final Parcelable.Creator<IfConfirmedThenAction> CREATOR = new C2485a();

    /* renamed from: d */
    public static final C2486b f7306d = new C2486b((C13695i) null);
    /* access modifiers changed from: private */
    public String negativeText;
    /* access modifiers changed from: private */
    public String positiveText;
    /* access modifiers changed from: private */
    public boolean quitOnBackPressed;
    /* access modifiers changed from: private */
    public String text;
    /* access modifiers changed from: private */
    public String title;

    /* renamed from: com.arlosoft.macrodroid.action.IfConfirmedThenAction$a */
    /* compiled from: IfConfirmedThenAction.kt */
    public static final class C2485a implements Parcelable.Creator<IfConfirmedThenAction> {
        C2485a() {
        }

        /* renamed from: a */
        public IfConfirmedThenAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new IfConfirmedThenAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public IfConfirmedThenAction[] newArray(int i) {
            return new IfConfirmedThenAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.IfConfirmedThenAction$b */
    /* compiled from: IfConfirmedThenAction.kt */
    public static final class C2486b {
        private C2486b() {
        }

        public /* synthetic */ C2486b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.IfConfirmedThenAction$c */
    /* compiled from: IfConfirmedThenAction.kt */
    static final class C2487c extends C13708q implements C16272s<String, String, String, String, Boolean, C13339u> {
        final /* synthetic */ IfConfirmedThenAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2487c(IfConfirmedThenAction ifConfirmedThenAction) {
            super(5);
            this.this$0 = ifConfirmedThenAction;
        }

        /* renamed from: a */
        public final void mo25235a(String str, String str2, String str3, String str4, boolean z) {
            C13706o.m87929f(str, "title");
            C13706o.m87929f(str2, "text");
            C13706o.m87929f(str3, "positiveText");
            C13706o.m87929f(str4, "negativeText");
            this.this$0.title = str;
            this.this$0.text = str2;
            this.this$0.positiveText = str3;
            this.this$0.negativeText = str4;
            this.this$0.quitOnBackPressed = z;
            this.this$0.mo24689O1();
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo24899n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            mo25235a((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Boolean) obj5).booleanValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.IfConfirmedThenAction$d */
    /* compiled from: IfConfirmedThenAction.kt */
    static final class C2488d extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ IfConfirmedThenAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2488d(IfConfirmedThenAction ifConfirmedThenAction) {
            super(0);
            this.this$0 = ifConfirmedThenAction;
        }

        public final void invoke() {
            this.this$0.mo24706w1();
        }
    }

    public IfConfirmedThenAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ IfConfirmedThenAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: E0 */
    public String mo25226E0() {
        return mo24672O0();
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.title, this.text, this.positiveText, this.negativeText};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String j1 = SelectableItem.m15535j1(C17541R$string.action_if_confirmed_then);
        C13706o.m87928e(j1, "getString(R.string.action_if_confirmed_then)");
        return j1;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 4) {
            this.title = strArr[0];
            this.text = strArr[1];
            this.positiveText = strArr[2];
            this.negativeText = strArr[3];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.title + ": " + this.text;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7787l1.f18803j.mo37761a();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        Stack<Integer> stack2 = stack;
        C13706o.m87929f(stack2, "skipEndifIndexStack");
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        Macro X0 = mo27837X0();
        C13706o.m87928e(X0, "macro");
        C7467l.m31042y(K0, X0, triggerContextInfo, this.title, this.text, this.positiveText, this.negativeText, i, z, stack2, resumeMacroInfo, z2, this.quitOnBackPressed);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        String j1 = SelectableItem.m15535j1(C17541R$string.action_if_confirmed_then);
        C13706o.m87928e(j1, "getString(R.string.action_if_confirmed_then)");
        Macro X0 = mo27837X0();
        C13706o.m87928e(X0, "macro");
        int L0 = mo24688L0();
        String str = this.title;
        String str2 = this.text;
        String str3 = this.positiveText;
        String str4 = this.negativeText;
        String j12 = SelectableItem.m15535j1(C17541R$string.action_confirm_actions_default_title);
        C13706o.m87928e(j12, "getString(R.string.actio…rm_actions_default_title)");
        String j13 = SelectableItem.m15535j1(C17541R$string.action_confirm_actions_default_message);
        C13706o.m87928e(j13, "getString(R.string.actio…_actions_default_message)");
        C7467l.m31030m(j0, j1, X0, L0, str, str2, str3, str4, j12, j13, true, this.quitOnBackPressed, new C2487c(this), new C2488d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w3 */
    public String mo24878w3() {
        return "";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.positiveText);
        parcel.writeString(this.negativeText);
        parcel.writeInt(this.quitOnBackPressed ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y3 */
    public String mo24880y3() {
        return mo24738G0() + ' ';
    }

    public IfConfirmedThenAction() {
    }

    private IfConfirmedThenAction(Parcel parcel) {
        super(parcel);
        this.title = parcel.readString();
        this.text = parcel.readString();
        this.positiveText = parcel.readString();
        this.negativeText = parcel.readString();
        this.quitOnBackPressed = parcel.readInt() != 0;
    }
}
