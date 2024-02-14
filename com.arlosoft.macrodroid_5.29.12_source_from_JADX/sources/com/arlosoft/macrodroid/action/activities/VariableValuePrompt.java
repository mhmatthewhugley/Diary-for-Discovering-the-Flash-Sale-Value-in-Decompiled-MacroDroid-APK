package com.arlosoft.macrodroid.action.activities;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6405m1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class VariableValuePrompt extends NonAppActivity {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f7867A;

    /* renamed from: B */
    private boolean f7868B;

    /* renamed from: C */
    private boolean f7869C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public ResumeMacroInfo f7870D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public EditText f7871E;

    /* renamed from: F */
    private RadioButton f7872F;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Macro f7873o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f7874p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Stack<Integer> f7875s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public TriggerContextInfo f7876z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.VariableValuePrompt$a */
    class C2833a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariable f7877a;

        /* renamed from: c */
        final /* synthetic */ Button f7878c;

        C2833a(MacroDroidVariable macroDroidVariable, Button button) {
            this.f7877a = macroDroidVariable;
            this.f7878c = button;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z = true;
            if (this.f7877a.mo27743S() == 3 || this.f7877a.mo27743S() == 1) {
                Button button = this.f7878c;
                if (charSequence.length() <= 0) {
                    z = false;
                }
                button.setEnabled(z);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.VariableValuePrompt$b */
    class C2834b implements Runnable {
        C2834b() {
        }

        public void run() {
            VariableValuePrompt variableValuePrompt = VariableValuePrompt.this;
            variableValuePrompt.m14014W1(variableValuePrompt.f7873o, VariableValuePrompt.this.f7874p, VariableValuePrompt.this.f7876z, VariableValuePrompt.this.f7867A, VariableValuePrompt.this.f7875s, VariableValuePrompt.this.f7870D);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.VariableValuePrompt$c */
    class C2835c implements Runnable {
        C2835c() {
        }

        public void run() {
            VariableValuePrompt variableValuePrompt = VariableValuePrompt.this;
            variableValuePrompt.m14014W1(variableValuePrompt.f7873o, VariableValuePrompt.this.f7874p, VariableValuePrompt.this.f7876z, VariableValuePrompt.this.f7867A, VariableValuePrompt.this.f7875s, VariableValuePrompt.this.f7870D);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.VariableValuePrompt$d */
    class C2836d implements Runnable {
        C2836d() {
        }

        public void run() {
            ((InputMethodManager) VariableValuePrompt.this.getSystemService("input_method")).showSoftInput(VariableValuePrompt.this.f7871E, 1);
        }
    }

    /* renamed from: V1 */
    private MacroDroidVariable m14013V1(Macro macro, String str) {
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariables()) {
                if (next.getName().equals(str)) {
                    return next;
                }
            }
        }
        return C4064u.m16048t().mo27996w(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m14014W1(Macro macro, int i, TriggerContextInfo triggerContextInfo, boolean z, Stack<Integer> stack, @Nullable ResumeMacroInfo resumeMacroInfo) {
        if (triggerContextInfo != null && macro != null && i != -1) {
            macro.invokeActions(macro.getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m14015X1(MacroDroidVariable macroDroidVariable, int i, ArrayList arrayList, int i2, View view) {
        finish();
        if (macroDroidVariable.mo27743S() == 0) {
            this.f7873o.variableUpdate(macroDroidVariable, new VariableValue.BooleanValue(this.f7872F.isChecked(), (List<String>) null));
        } else if (macroDroidVariable.mo27743S() == 1 || macroDroidVariable.mo27743S() == 3 || macroDroidVariable.mo27743S() == 2) {
            this.f7873o.variableUpdate(macroDroidVariable, VariableValue.fromTextValueForType(this.f7871E.getText().toString(), i, (List<String>) null));
        } else if (macroDroidVariable.mo27743S() == 4 || macroDroidVariable.mo27743S() == 5) {
            macroDroidVariable.mo27771o(arrayList);
            MacroDroidVariable macroDroidVariable2 = macroDroidVariable;
            int i3 = i2;
            m14017Z1(this.f7873o, macroDroidVariable2, i3, C6520o0.m24868C(this, arrayList, this.f7876z, this.f7873o), this.f7876z);
        }
        new Handler(Looper.getMainLooper()).post(new C2834b());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m14016Y1(View view) {
        finish();
        if (!this.f7869C) {
            new Handler(Looper.getMainLooper()).post(new C2835c());
        }
    }

    /* renamed from: Z1 */
    private void m14017Z1(Macro macro, MacroDroidVariable macroDroidVariable, int i, List<String> list, TriggerContextInfo triggerContextInfo) {
        if (i == 0) {
            macro.variableUpdate(macroDroidVariable, new VariableValue.BooleanValue(this.f7872F.isChecked(), list));
        } else {
            macro.variableUpdate(macroDroidVariable, VariableValue.fromTextValueForType(this.f7871E.getText().toString(), i, list));
        }
    }

    public void onBackPressed() {
        if (this.f7868B) {
            if (!this.f7869C) {
                m14014W1(this.f7873o, this.f7874p, this.f7876z, this.f7867A, this.f7875s, this.f7870D);
            }
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r6 = r17
            super.onCreate(r18)
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r1 = "variableName"
            java.lang.String r0 = r0.getStringExtra(r1)
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r2 = "title"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r17.getIntent()
            java.lang.String r3 = "message"
            java.lang.String r2 = r2.getStringExtra(r3)
            android.content.Intent r3 = r17.getIntent()
            java.lang.String r4 = "showCancel"
            r5 = 1
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r6.f7868B = r3
            android.content.Intent r3 = r17.getIntent()
            java.lang.String r4 = "stopAfterCancel"
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r6.f7869C = r3
            android.content.Intent r3 = r17.getIntent()
            java.lang.String r4 = "darkMode"
            r7 = 0
            boolean r3 = r3.getBooleanExtra(r4, r7)
            android.content.Intent r4 = r17.getIntent()
            android.os.Bundle r4 = r4.getExtras()
            java.lang.String r8 = "MacroId"
            r9 = -1
            int r4 = r4.getInt(r8, r9)
            android.content.Intent r8 = r17.getIntent()
            java.lang.String r9 = "passwordMask"
            boolean r8 = r8.getBooleanExtra(r9, r7)
            android.content.Intent r9 = r17.getIntent()
            java.lang.String r10 = "initialiseEmpty"
            boolean r9 = r9.getBooleanExtra(r10, r7)
            android.content.Intent r10 = r17.getIntent()
            java.lang.String r11 = "dictionaryKeys"
            java.util.ArrayList r10 = r10.getStringArrayListExtra(r11)
            android.content.Intent r11 = r17.getIntent()
            java.lang.String r12 = "dictionaryOrArrayType"
            int r11 = r11.getIntExtra(r12, r7)
            com.arlosoft.macrodroid.macro.n r12 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            com.arlosoft.macrodroid.macro.Macro r12 = r12.mo29683R(r4)
            r6.f7873o = r12
            if (r12 != 0) goto L_0x00a2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Macro not found when prompting for variable: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            r17.finish()
            return
        L_0x00a2:
            r4 = 32
            if (r3 == 0) goto L_0x00bb
            android.content.res.Resources r12 = r17.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            int r12 = r12.uiMode
            r12 = r12 & 48
            if (r12 == r4) goto L_0x00bb
            r12 = 2132017908(0x7f1402f4, float:1.9674108E38)
            r6.setTheme(r12)
            goto L_0x00d1
        L_0x00bb:
            if (r3 != 0) goto L_0x00d1
            android.content.res.Resources r12 = r17.getResources()
            android.content.res.Configuration r12 = r12.getConfiguration()
            int r12 = r12.uiMode
            r12 = r12 & 48
            if (r12 != r4) goto L_0x00d1
            r12 = 2132017918(0x7f1402fe, float:1.9674128E38)
            r6.setTheme(r12)
        L_0x00d1:
            com.arlosoft.macrodroid.macro.Macro r12 = r6.f7873o
            com.arlosoft.macrodroid.common.MacroDroidVariable r12 = r6.m14013V1(r12, r0)
            if (r12 != 0) goto L_0x0104
            android.content.Context r1 = r17.getApplicationContext()
            r2 = 2131955775(0x7f13103f, float:1.9548087E38)
            android.widget.Toast r1 = p319lc.C15626c.makeText(r1, r2, r7)
            r1.show()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Variable value prompt failed '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "' does not exist"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            r17.finish()
            return
        L_0x0104:
            android.content.Intent r0 = r17.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r13 = "NextActionIndex"
            int r0 = r0.getInt(r13)
            r6.f7874p = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r13 = "SkipEndifIndex"
            boolean r0 = r0.hasExtra(r13)
            if (r0 == 0) goto L_0x0139
            android.content.Intent r0 = r17.getIntent()     // Catch:{ Exception -> 0x0131 }
            java.io.Serializable r0 = r0.getSerializableExtra(r13)     // Catch:{ Exception -> 0x0131 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0131 }
            java.util.Stack r0 = com.arlosoft.macrodroid.common.C4061t1.m16017s(r0)     // Catch:{ Exception -> 0x0131 }
            r6.f7875s = r0     // Catch:{ Exception -> 0x0131 }
            goto L_0x0140
        L_0x0131:
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r6.f7875s = r0
            goto L_0x0140
        L_0x0139:
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r6.f7875s = r0
        L_0x0140:
            android.content.Intent r0 = r17.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r13 = "TriggerContextInfo"
            android.os.Parcelable r0 = r0.getParcelable(r13)
            com.arlosoft.macrodroid.triggers.TriggerContextInfo r0 = (com.arlosoft.macrodroid.triggers.TriggerContextInfo) r0
            r6.f7876z = r0
            android.content.Intent r0 = r17.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r13 = "force_not_enabled"
            boolean r0 = r0.getBoolean(r13, r7)
            r6.f7867A = r0
            android.content.Intent r0 = r17.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r13 = "resume_macro_info"
            android.os.Parcelable r0 = r0.getParcelable(r13)
            com.arlosoft.macrodroid.data.ResumeMacroInfo r0 = (com.arlosoft.macrodroid.data.ResumeMacroInfo) r0
            r6.f7870D = r0
            android.content.Intent r0 = r17.getIntent()
            java.lang.String r13 = "trueLabel"
            java.lang.String r0 = r0.getStringExtra(r13)
            android.content.Intent r13 = r17.getIntent()
            java.lang.String r14 = "falseLabel"
            java.lang.String r13 = r13.getStringExtra(r14)
            r6.setFinishOnTouchOutside(r7)
            r14 = 2131559067(0x7f0d029b, float:1.8743468E38)
            r6.setContentView((int) r14)
            r6.setTitle(r1)
            r1 = 2131364279(0x7f0a09b7, float:1.834839E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r14 = 2131364283(0x7f0a09bb, float:1.8348399E38)
            android.view.View r14 = r6.findViewById(r14)
            android.widget.EditText r14 = (android.widget.EditText) r14
            r6.f7871E = r14
            r14 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r14 = r6.findViewById(r14)
            android.widget.Button r14 = (android.widget.Button) r14
            r15 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r15 = r6.findViewById(r15)
            android.widget.Button r15 = (android.widget.Button) r15
            r7 = 2131364281(0x7f0a09b9, float:1.8348395E38)
            android.view.View r7 = r6.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r4 = 2131364282(0x7f0a09ba, float:1.8348397E38)
            android.view.View r4 = r6.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            r6.f7872F = r4
            r4 = 2131364280(0x7f0a09b8, float:1.8348393E38)
            android.view.View r4 = r6.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            boolean r5 = r6.f7868B
            r16 = r11
            r11 = 8
            if (r5 == 0) goto L_0x01e1
            r5 = 0
            goto L_0x01e3
        L_0x01e1:
            r5 = 8
        L_0x01e3:
            r15.setVisibility(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L_0x01f0
            r1.setVisibility(r11)
            goto L_0x01f3
        L_0x01f0:
            r1.setText(r2)
        L_0x01f3:
            boolean r2 = r12.mo27748X()
            if (r2 != 0) goto L_0x0206
            boolean r2 = r12.mo27751a0()
            if (r2 == 0) goto L_0x0200
            goto L_0x0206
        L_0x0200:
            int r2 = r12.mo27743S()
            r5 = r2
            goto L_0x0208
        L_0x0206:
            r5 = r16
        L_0x0208:
            if (r5 != 0) goto L_0x0241
            android.widget.EditText r2 = r6.f7871E
            r2.setVisibility(r11)
            boolean r2 = r12.mo27764k(r10)
            android.widget.RadioButton r7 = r6.f7872F
            r7.setChecked(r2)
            android.widget.RadioButton r7 = r6.f7872F
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L_0x0227
            r0 = 2131955598(0x7f130f8e, float:1.9547728E38)
            java.lang.String r0 = r6.getString(r0)
        L_0x0227:
            r7.setText(r0)
            r0 = 1
            r0 = r0 ^ r2
            r4.setChecked(r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x023c
            r0 = 2131953616(0x7f1307d0, float:1.9543708E38)
            java.lang.String r13 = r6.getString(r0)
        L_0x023c:
            r4.setText(r13)
            goto L_0x02cc
        L_0x0241:
            r0 = 1
            r2 = 16
            if (r5 != r0) goto L_0x0272
            android.widget.EditText r0 = r6.f7871E
            if (r8 == 0) goto L_0x024b
            goto L_0x024c
        L_0x024b:
            r2 = 0
        L_0x024c:
            r2 = r2 | 4098(0x1002, float:5.743E-42)
            r0.setInputType(r2)
            if (r9 != 0) goto L_0x0260
            android.widget.EditText r0 = r6.f7871E
            java.lang.Long r2 = r12.mo27733E(r10)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setText(r2)
        L_0x0260:
            r7.setVisibility(r11)
            android.widget.EditText r0 = r6.f7871E
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x026d
            r0 = 1
            goto L_0x026e
        L_0x026d:
            r0 = 0
        L_0x026e:
            r14.setEnabled(r0)
            goto L_0x02cc
        L_0x0272:
            r0 = 3
            if (r5 != r0) goto L_0x02a6
            android.widget.EditText r0 = r6.f7871E
            if (r8 == 0) goto L_0x027a
            goto L_0x027b
        L_0x027a:
            r2 = 0
        L_0x027b:
            r2 = r2 | 12290(0x3002, float:1.7222E-41)
            r0.setInputType(r2)
            if (r9 != 0) goto L_0x0294
            java.lang.Double r0 = r12.mo27768m(r10)
            android.widget.EditText r2 = r6.f7871E
            if (r0 == 0) goto L_0x028f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0291
        L_0x028f:
            java.lang.String r0 = "0.0"
        L_0x0291:
            r2.setText(r0)
        L_0x0294:
            r7.setVisibility(r11)
            android.widget.EditText r0 = r6.f7871E
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02a1
            r0 = 1
            goto L_0x02a2
        L_0x02a1:
            r0 = 0
        L_0x02a2:
            r14.setEnabled(r0)
            goto L_0x02cc
        L_0x02a6:
            r0 = 2
            if (r5 != r0) goto L_0x02cc
            android.widget.EditText r0 = r6.f7871E
            if (r8 == 0) goto L_0x02b0
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x02b1
        L_0x02b0:
            r2 = 0
        L_0x02b1:
            r4 = 1
            r2 = r2 | r4
            r0.setInputType(r2)
            if (r9 != 0) goto L_0x02c1
            android.widget.EditText r0 = r6.f7871E
            java.lang.String r2 = r12.mo27738L(r10)
            r0.setText(r2)
        L_0x02c1:
            android.widget.EditText r0 = r6.f7871E
            r2 = 2131953943(0x7f130917, float:1.9544371E38)
            r0.setHint(r2)
            r7.setVisibility(r11)
        L_0x02cc:
            android.widget.EditText r0 = r6.f7871E
            com.arlosoft.macrodroid.action.activities.VariableValuePrompt$a r2 = new com.arlosoft.macrodroid.action.activities.VariableValuePrompt$a
            r2.<init>(r12, r14)
            r0.addTextChangedListener(r2)
            int r0 = r12.mo27743S()
            if (r0 == 0) goto L_0x02ed
            android.widget.EditText r0 = r6.f7871E
            int r2 = r0.length()
            r0.setSelection(r2)
            android.view.Window r0 = r17.getWindow()
            r2 = 4
            r0.setSoftInputMode(r2)
        L_0x02ed:
            r0 = 2131099873(0x7f0600e1, float:1.7812111E38)
            if (r3 == 0) goto L_0x030a
            android.content.res.Resources r2 = r17.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            r4 = 32
            if (r2 == r4) goto L_0x030c
            int r0 = androidx.core.content.ContextCompat.getColor(r6, r0)
            r1.setTextColor(r0)
            goto L_0x0323
        L_0x030a:
            r4 = 32
        L_0x030c:
            if (r3 != 0) goto L_0x0323
            android.content.res.Resources r2 = r17.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r2 != r4) goto L_0x0323
            int r0 = androidx.core.content.ContextCompat.getColor(r6, r0)
            r1.setTextColor(r0)
        L_0x0323:
            f0.v r7 = new f0.v
            r0 = r7
            r1 = r17
            r2 = r12
            r3 = r5
            r4 = r10
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r14.setOnClickListener(r7)
            f0.u r0 = new f0.u
            r0.<init>(r6)
            r15.setOnClickListener(r0)
            int r0 = r12.mo27743S()
            if (r0 == 0) goto L_0x0352
            android.widget.EditText r0 = r6.f7871E
            r0.requestFocus()
            android.widget.EditText r0 = r6.f7871E
            com.arlosoft.macrodroid.action.activities.VariableValuePrompt$d r1 = new com.arlosoft.macrodroid.action.activities.VariableValuePrompt$d
            r1.<init>()
            r2 = 50
            r0.postDelayed(r1, r2)
        L_0x0352:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.activities.VariableValuePrompt.onCreate(android.os.Bundle):void");
    }

    public void onStop() {
        C6405m1.m24662b(this);
        super.onStop();
    }
}
