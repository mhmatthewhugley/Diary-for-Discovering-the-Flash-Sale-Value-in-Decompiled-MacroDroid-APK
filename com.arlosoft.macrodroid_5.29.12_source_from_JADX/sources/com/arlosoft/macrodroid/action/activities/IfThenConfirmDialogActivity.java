package com.arlosoft.macrodroid.action.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6416p0;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p257f0.C12200f;
import p257f0.C12201g;

/* compiled from: IfThenConfirmDialogActivity.kt */
public final class IfThenConfirmDialogActivity extends NonAppActivity {

    /* renamed from: H */
    public static final C2823a f7773H = new C2823a((C13695i) null);

    /* renamed from: A */
    private Stack<Integer> f7774A;

    /* renamed from: B */
    private boolean f7775B;

    /* renamed from: C */
    private ResumeMacroInfo f7776C;

    /* renamed from: D */
    private TriggerContextInfo f7777D;

    /* renamed from: E */
    private boolean f7778E;

    /* renamed from: F */
    private boolean f7779F = true;

    /* renamed from: G */
    public Map<Integer, View> f7780G = new LinkedHashMap();

    /* renamed from: o */
    private Trigger f7781o;

    /* renamed from: p */
    private Macro f7782p;

    /* renamed from: s */
    private boolean f7783s;

    /* renamed from: z */
    private int f7784z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.IfThenConfirmDialogActivity$a */
    /* compiled from: IfThenConfirmDialogActivity.kt */
    public static final class C2823a {
        private C2823a() {
        }

        public /* synthetic */ C2823a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: O1 */
    private final void m13923O1() {
        int i;
        Macro macro;
        Stack<Integer> stack;
        int i2;
        Macro macro2 = this.f7782p;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        macro2.setTriggerThatInvoked(this.f7781o);
        Macro macro3 = this.f7782p;
        if (macro3 == null) {
            C13706o.m87945v("macro");
            macro3 = null;
        }
        ArrayList<Action> actions = macro3.getActions();
        int i3 = this.f7784z - 1;
        Stack<Integer> stack2 = this.f7774A;
        if (stack2 == null) {
            C13706o.m87945v("skipEndifIndexStack");
            stack2 = null;
        }
        boolean z = false;
        stack2.push(0);
        int b = C6416p0.m24705b(actions, i3);
        int d = C6416p0.m24707d(actions, i3);
        int a = C6416p0.m24704a(actions, i3);
        if (d >= 0 && d < b) {
            i = d;
        } else {
            if (a >= 0 && a < b) {
                z = true;
            }
            if (z) {
                i2 = a + 1;
                Stack<Integer> stack3 = this.f7774A;
                if (stack3 == null) {
                    C13706o.m87945v("skipEndifIndexStack");
                    stack3 = null;
                }
                if (!stack3.isEmpty()) {
                    Stack<Integer> stack4 = this.f7774A;
                    if (stack4 == null) {
                        C13706o.m87945v("skipEndifIndexStack");
                        stack4 = null;
                    }
                    stack4.pop();
                }
            } else {
                i2 = b + 1;
            }
            i = i2;
        }
        if (i == -1) {
            FirebaseCrashlytics.m6487a().mo22936d(new Exception("No corresponding end if or else for an if"));
        }
        if (d == -1 && a == -1) {
            Stack<Integer> stack5 = this.f7774A;
            if (stack5 == null) {
                C13706o.m87945v("skipEndifIndexStack");
                stack5 = null;
            }
            if (!stack5.isEmpty()) {
                Stack<Integer> stack6 = this.f7774A;
                if (stack6 == null) {
                    C13706o.m87945v("skipEndifIndexStack");
                    stack6 = null;
                }
                Integer peek = stack6.peek();
                if (peek != null && peek.intValue() == 0) {
                    Stack<Integer> stack7 = this.f7774A;
                    if (stack7 == null) {
                        C13706o.m87945v("skipEndifIndexStack");
                        stack7 = null;
                    }
                    stack7.pop();
                }
            }
        }
        if (!this.f7775B) {
            Macro macro4 = this.f7782p;
            if (macro4 == null) {
                C13706o.m87945v("macro");
                macro = null;
            } else {
                macro = macro4;
            }
            Macro macro5 = this.f7782p;
            if (macro5 == null) {
                C13706o.m87945v("macro");
                macro5 = null;
            }
            ArrayList<Action> actions2 = macro5.getActions();
            TriggerContextInfo triggerContextInfo = this.f7777D;
            boolean z2 = this.f7783s;
            Stack<Integer> stack8 = this.f7774A;
            if (stack8 == null) {
                C13706o.m87945v("skipEndifIndexStack");
                stack = null;
            } else {
                stack = stack8;
            }
            macro.invokeActions(actions2, i, triggerContextInfo, z2, stack, this.f7776C);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m13924P1(IfThenConfirmDialogActivity ifThenConfirmDialogActivity, View view) {
        Macro macro;
        Stack<Integer> stack;
        C13706o.m87929f(ifThenConfirmDialogActivity, "this$0");
        ifThenConfirmDialogActivity.f7779F = false;
        Stack<Integer> stack2 = ifThenConfirmDialogActivity.f7774A;
        if (stack2 == null) {
            C13706o.m87945v("skipEndifIndexStack");
            stack2 = null;
        }
        if (!stack2.isEmpty()) {
            Stack<Integer> stack3 = ifThenConfirmDialogActivity.f7774A;
            if (stack3 == null) {
                C13706o.m87945v("skipEndifIndexStack");
                stack3 = null;
            }
            Integer peek = stack3.peek();
            if (peek != null && peek.intValue() == 0) {
                Stack<Integer> stack4 = ifThenConfirmDialogActivity.f7774A;
                if (stack4 == null) {
                    C13706o.m87945v("skipEndifIndexStack");
                    stack4 = null;
                }
                stack4.pop();
            }
        }
        Macro macro2 = ifThenConfirmDialogActivity.f7782p;
        if (macro2 == null) {
            C13706o.m87945v("macro");
            macro2 = null;
        }
        int b = C6416p0.m24705b(macro2.getActions(), ifThenConfirmDialogActivity.f7784z - 1);
        Stack<Integer> stack5 = ifThenConfirmDialogActivity.f7774A;
        if (stack5 == null) {
            C13706o.m87945v("skipEndifIndexStack");
            stack5 = null;
        }
        stack5.push(Integer.valueOf(b));
        ifThenConfirmDialogActivity.finish();
        if (!ifThenConfirmDialogActivity.f7775B) {
            Macro macro3 = ifThenConfirmDialogActivity.f7782p;
            if (macro3 == null) {
                C13706o.m87945v("macro");
                macro3 = null;
            }
            macro3.setTriggerThatInvoked(ifThenConfirmDialogActivity.f7781o);
            Macro macro4 = ifThenConfirmDialogActivity.f7782p;
            if (macro4 == null) {
                C13706o.m87945v("macro");
                macro = null;
            } else {
                macro = macro4;
            }
            Macro macro5 = ifThenConfirmDialogActivity.f7782p;
            if (macro5 == null) {
                C13706o.m87945v("macro");
                macro5 = null;
            }
            ArrayList<Action> actions = macro5.getActions();
            int i = ifThenConfirmDialogActivity.f7784z;
            TriggerContextInfo triggerContextInfo = ifThenConfirmDialogActivity.f7777D;
            boolean z = ifThenConfirmDialogActivity.f7783s;
            Stack<Integer> stack6 = ifThenConfirmDialogActivity.f7774A;
            if (stack6 == null) {
                C13706o.m87945v("skipEndifIndexStack");
                stack = null;
            } else {
                stack = stack6;
            }
            macro.invokeActions(actions, i, triggerContextInfo, z, stack, ifThenConfirmDialogActivity.f7776C);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m13925Q1(IfThenConfirmDialogActivity ifThenConfirmDialogActivity, View view) {
        C13706o.m87929f(ifThenConfirmDialogActivity, "this$0");
        ifThenConfirmDialogActivity.f7779F = false;
        ifThenConfirmDialogActivity.finish();
        ifThenConfirmDialogActivity.m13923O1();
    }

    /* renamed from: N1 */
    public View mo26170N1(int i) {
        Map<Integer, View> map = this.f7780G;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Stack<Integer> stack;
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.confirm_dialog);
        getWindow().setLayout(-1, -2);
        setFinishOnTouchOutside(false);
        Bundle extras = getIntent().getExtras();
        ResumeMacroInfo resumeMacroInfo = null;
        String string = extras != null ? extras.getString("Title") : null;
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString("Message") : null;
        Bundle extras3 = getIntent().getExtras();
        String string3 = extras3 != null ? extras3.getString("positive_text") : null;
        Bundle extras4 = getIntent().getExtras();
        String string4 = extras4 != null ? extras4.getString("negative_text") : null;
        Bundle extras5 = getIntent().getExtras();
        if (extras5 != null) {
            resumeMacroInfo = (ResumeMacroInfo) extras5.getParcelable("resume_macro_info");
        }
        this.f7776C = resumeMacroInfo;
        Bundle extras6 = getIntent().getExtras();
        this.f7775B = extras6 != null ? extras6.getBoolean("IsTest") : false;
        Bundle extras7 = getIntent().getExtras();
        this.f7778E = extras7 != null ? extras7.getBoolean("quit_on_back_pressed", false) : false;
        setTitle(string);
        ((TextView) mo26170N1(C17532R$id.confirmDialogMessage)).setText(string2);
        Bundle extras8 = getIntent().getExtras();
        this.f7784z = extras8 != null ? extras8.getInt("NextActionIndex") : 0;
        if (getIntent().hasExtra("SkipEndifIndex")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("SkipEndifIndex");
            C13706o.m87927d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
            stack = C4061t1.m16017s((ArrayList) serializableExtra);
            C13706o.m87928e(stack, "{\n            Util.deser…ArrayList<Int>)\n        }");
        } else {
            stack = new Stack<>();
        }
        this.f7774A = stack;
        Bundle extras9 = getIntent().getExtras();
        C13706o.m87926c(extras9);
        this.f7777D = (TriggerContextInfo) extras9.getParcelable("TriggerContextInfo");
        Macro Q = C4934n.m18998M().mo29682Q(extras9.getLong("guid"));
        if (Q == null || this.f7777D == null) {
            this.f7779F = false;
            C4878b.m18868g("Could not find macro/context info in Confirm Next Actions");
            finish();
            return;
        }
        this.f7782p = Q;
        this.f7783s = getIntent().getBooleanExtra("force_not_enabled", false);
        this.f7781o = (Trigger) extras9.getParcelable("TriggerThatInvoked");
        int i = C17532R$id.okButton;
        ((Button) mo26170N1(i)).setText(string3);
        ((Button) mo26170N1(i)).setOnClickListener(new C12200f(this));
        int i2 = C17532R$id.cancelButton;
        ((Button) mo26170N1(i2)).setText(string4);
        ((Button) mo26170N1(i2)).setOnClickListener(new C12201g(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!this.f7778E && this.f7779F) {
            m13923O1();
        }
    }
}
