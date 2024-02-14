package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.ConfirmDialogActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Stack;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2212a;
import p057a2.C2224m;
import p116k0.C7467l;
import p128m0.C7887z;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16272s;

/* compiled from: ConfirmNextAction.kt */
public final class ConfirmNextAction extends Action implements C2224m, C2212a {
    public static final Parcelable.Creator<ConfirmNextAction> CREATOR = new C2375a();

    /* renamed from: d */
    public static final C2376b f7194d = new C2376b((C13695i) null);
    /* access modifiers changed from: private */
    public String m_message;
    /* access modifiers changed from: private */
    public String m_title;
    /* access modifiers changed from: private */
    public String negativeText;
    /* access modifiers changed from: private */
    public String positiveText;

    /* renamed from: com.arlosoft.macrodroid.action.ConfirmNextAction$a */
    /* compiled from: ConfirmNextAction.kt */
    public static final class C2375a implements Parcelable.Creator<ConfirmNextAction> {
        C2375a() {
        }

        /* renamed from: a */
        public ConfirmNextAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ConfirmNextAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ConfirmNextAction[] newArray(int i) {
            return new ConfirmNextAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ConfirmNextAction$b */
    /* compiled from: ConfirmNextAction.kt */
    public static final class C2376b {
        private C2376b() {
        }

        public /* synthetic */ C2376b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ConfirmNextAction$c */
    /* compiled from: ConfirmNextAction.kt */
    static final class C2377c extends C13708q implements C16272s<String, String, String, String, Boolean, C13339u> {
        final /* synthetic */ ConfirmNextAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2377c(ConfirmNextAction confirmNextAction) {
            super(5);
            this.this$0 = confirmNextAction;
        }

        /* renamed from: a */
        public final void mo24898a(String str, String str2, String str3, String str4, boolean z) {
            C13706o.m87929f(str, "title");
            C13706o.m87929f(str2, "text");
            C13706o.m87929f(str3, "positiveText");
            C13706o.m87929f(str4, "negativeText");
            this.this$0.m_title = str;
            this.this$0.m_message = str2;
            this.this$0.positiveText = str3;
            this.this$0.negativeText = str4;
            this.this$0.mo24689O1();
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ Object mo24899n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            mo24898a((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Boolean) obj5).booleanValue());
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ConfirmNextAction$d */
    /* compiled from: ConfirmNextAction.kt */
    static final class C2378d extends C13708q implements C16254a<C13339u> {
        final /* synthetic */ ConfirmNextAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2378d(ConfirmNextAction confirmNextAction) {
            super(0);
            this.this$0 = confirmNextAction;
        }

        public final void invoke() {
            this.this$0.mo27864r1();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConfirmNextAction(Activity activity, Macro macro) {
        this();
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(macro, "macro");
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ConfirmNextAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: n3 */
    private final String m10224n3(String str, TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), str, triggerContextInfo, mo27837X0());
        C13706o.m87928e(t0, "replaceMagicText(context…text, contextInfo, macro)");
        return C15176v.m93630E(t0, "\\n", IOUtils.LINE_SEPARATOR_UNIX, false, 4, (Object) null);
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_title, this.m_message, this.positiveText, this.negativeText};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 4) {
            this.m_title = strArr[0];
            this.m_message = strArr[1];
            this.positiveText = strArr[2];
            this.negativeText = strArr[3];
            return;
        }
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22936d(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_title + ": " + this.m_message;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7887z.m33003u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        String str = this.positiveText;
        if (str == null) {
            str = SelectableItem.m15535j1(17039370);
            C13706o.m87928e(str, "getString(android.R.string.ok)");
        }
        String str2 = this.negativeText;
        if (str2 == null) {
            str2 = SelectableItem.m15535j1(17039360);
            C13706o.m87928e(str2, "getString(android.R.string.cancel)");
        }
        MacroDroidApplication.C3787a aVar = MacroDroidApplication.f9883I;
        Intent intent = new Intent(aVar.mo27303b(), ConfirmDialogActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("Title", m10224n3(this.m_title, triggerContextInfo));
        intent.putExtra("Message", m10224n3(this.m_message, triggerContextInfo));
        intent.putExtra("guid", mo27837X0().getGUID());
        intent.putExtra("positive_text", m10224n3(str, triggerContextInfo));
        intent.putExtra("negative_text", m10224n3(str2, triggerContextInfo));
        intent.putExtra("TriggerThatInvoked", this.m_macro.getTriggerThatInvoked());
        intent.putExtra("TriggerContextInfo", triggerContextInfo);
        intent.putExtra("NextActionIndex", i);
        intent.putExtra("SkipEndifIndex", stack);
        intent.putExtra("force_not_enabled", z);
        intent.putExtra("IsTest", z2);
        intent.putExtra("resume_macro_info", resumeMacroInfo);
        aVar.mo27303b().startActivity(intent);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: h3 */
    public void mo24703h3(TriggerContextInfo triggerContextInfo) {
        if (mo27839Y()) {
            mo24421h(triggerContextInfo, 0, true, new Stack(), (ResumeMacroInfo) null, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        String j1 = SelectableItem.m15535j1(C17541R$string.action_confirm_next);
        C13706o.m87928e(j1, "getString(R.string.action_confirm_next)");
        Macro X0 = mo27837X0();
        C13706o.m87928e(X0, "macro");
        int L0 = mo24688L0();
        String str = this.m_title;
        String str2 = this.m_message;
        String str3 = this.positiveText;
        String str4 = this.negativeText;
        String j12 = SelectableItem.m15535j1(C17541R$string.action_confirm_default_title);
        C13706o.m87928e(j12, "getString(R.string.action_confirm_default_title)");
        String j13 = SelectableItem.m15535j1(C17541R$string.action_confirm_default_message);
        C13706o.m87928e(j13, "getString(R.string.action_confirm_default_message)");
        C7467l.m31030m(j0, j1, X0, L0, str, str2, str3, str4, j12, j13, false, false, new C2377c(this), new C2378d(this));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_title);
        parcel.writeString(this.m_message);
        parcel.writeString(this.positiveText);
        parcel.writeString(this.negativeText);
    }

    private ConfirmNextAction() {
    }

    private ConfirmNextAction(Parcel parcel) {
        super(parcel);
        this.m_title = parcel.readString();
        this.m_message = parcel.readString();
        this.positiveText = parcel.readString();
        this.negativeText = parcel.readString();
    }
}
