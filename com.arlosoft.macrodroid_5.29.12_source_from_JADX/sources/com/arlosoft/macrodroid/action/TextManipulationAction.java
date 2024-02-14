package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.textmanipulation.TextManipulation;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.C6585q0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p057a2.C2216e;
import p057a2.C2219h;
import p057a2.C2224m;
import p128m0.C7826q4;
import p277h9.C12408a;
import p319lc.C15626c;

public class TextManipulationAction extends Action implements C2219h, C2224m, C2216e {
    public static final Parcelable.Creator<TextManipulationAction> CREATOR = new C2728h();
    private int m_option;
    private String m_text;
    private TextManipulation m_textManipulation;
    private MacroDroidVariable m_variable;
    private DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$a */
    class C2720a implements C2729i {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7618a;

        /* renamed from: b */
        final /* synthetic */ EditText f7619b;

        /* renamed from: c */
        final /* synthetic */ List f7620c;

        /* renamed from: d */
        final /* synthetic */ Spinner f7621d;

        C2720a(AlertDialog alertDialog, EditText editText, List list, Spinner spinner) {
            this.f7618a = alertDialog;
            this.f7619b = editText;
            this.f7620c = list;
            this.f7621d = spinner;
        }

        /* renamed from: a */
        public void mo25849a() {
            TextManipulationAction.this.m13352U3(this.f7618a.getButton(-1), this.f7619b, this.f7620c, this.f7621d, TextManipulationAction.this.workingVariable);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$b */
    class C2721b implements C2729i {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7623a;

        /* renamed from: b */
        final /* synthetic */ EditText f7624b;

        /* renamed from: c */
        final /* synthetic */ List f7625c;

        /* renamed from: d */
        final /* synthetic */ Spinner f7626d;

        C2721b(AlertDialog alertDialog, EditText editText, List list, Spinner spinner) {
            this.f7623a = alertDialog;
            this.f7624b = editText;
            this.f7625c = list;
            this.f7626d = spinner;
        }

        /* renamed from: a */
        public void mo25849a() {
            TextManipulationAction.this.m13352U3(this.f7623a.getButton(-1), this.f7624b, this.f7625c, this.f7626d, TextManipulationAction.this.workingVariable);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$c */
    class C2722c implements C6440u1.C6442b {

        /* renamed from: a */
        final /* synthetic */ Spinner f7628a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f7629b;

        /* renamed from: c */
        final /* synthetic */ EditText f7630c;

        /* renamed from: d */
        final /* synthetic */ List f7631d;

        /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$c$a */
        class C2723a implements C2729i {
            C2723a() {
            }

            /* renamed from: a */
            public void mo25849a() {
                C2722c cVar = C2722c.this;
                TextManipulationAction textManipulationAction = TextManipulationAction.this;
                Button button = cVar.f7629b.getButton(-1);
                C2722c cVar2 = C2722c.this;
                textManipulationAction.m13352U3(button, cVar2.f7630c, cVar2.f7631d, cVar2.f7628a, TextManipulationAction.this.workingVariable);
            }
        }

        C2722c(Spinner spinner, AlertDialog alertDialog, EditText editText, List list) {
            this.f7628a = spinner;
            this.f7629b = alertDialog;
            this.f7630c = editText;
            this.f7631d = list;
        }

        /* renamed from: a */
        public void mo25850a(MacroDroidVariable macroDroidVariable) {
            MacroDroidVariable unused = TextManipulationAction.this.workingVariable = macroDroidVariable;
            DictionaryKeys unused2 = TextManipulationAction.this.workingDictionaryKeys = null;
            TextManipulationAction.this.m13336E3(this.f7628a, new C2723a());
            TextManipulationAction.this.m13352U3(this.f7629b.getButton(-1), this.f7630c, this.f7631d, this.f7628a, TextManipulationAction.this.workingVariable);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$d */
    class C2724d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7634a;

        /* renamed from: c */
        final /* synthetic */ EditText f7635c;

        /* renamed from: d */
        final /* synthetic */ List f7636d;

        /* renamed from: f */
        final /* synthetic */ Spinner f7637f;

        C2724d(AlertDialog alertDialog, EditText editText, List list, Spinner spinner) {
            this.f7634a = alertDialog;
            this.f7635c = editText;
            this.f7636d = list;
            this.f7637f = spinner;
        }

        public void afterTextChanged(Editable editable) {
            TextManipulationAction.this.m13352U3(this.f7634a.getButton(-1), this.f7635c, this.f7636d, this.f7637f, TextManipulationAction.this.workingVariable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$e */
    class C2725e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f7639a;

        /* renamed from: c */
        final /* synthetic */ EditText f7640c;

        /* renamed from: d */
        final /* synthetic */ List f7641d;

        /* renamed from: f */
        final /* synthetic */ Spinner f7642f;

        C2725e(AlertDialog alertDialog, EditText editText, List list, Spinner spinner) {
            this.f7639a = alertDialog;
            this.f7640c = editText;
            this.f7641d = list;
            this.f7642f = spinner;
        }

        public void afterTextChanged(Editable editable) {
            TextManipulationAction.this.m13352U3(this.f7639a.getButton(-1), this.f7640c, this.f7641d, this.f7642f, TextManipulationAction.this.workingVariable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$f */
    class C2726f implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ C2729i f7644a;

        C2726f(C2729i iVar) {
            this.f7644a = iVar;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            DictionaryKeys unused = TextManipulationAction.this.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            MacroDroidVariable unused = TextManipulationAction.this.workingVariable = macroDroidVariable;
            DictionaryKeys unused2 = TextManipulationAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
            this.f7644a.mo25849a();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$g */
    class C2727g implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ C2729i f7646a;

        C2727g(C2729i iVar) {
            this.f7646a = iVar;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            DictionaryKeys unused = TextManipulationAction.this.workingDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            MacroDroidVariable unused = TextManipulationAction.this.workingVariable = macroDroidVariable;
            DictionaryKeys unused2 = TextManipulationAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
            this.f7646a.mo25849a();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$h */
    class C2728h implements Parcelable.Creator<TextManipulationAction> {
        C2728h() {
        }

        /* renamed from: a */
        public TextManipulationAction createFromParcel(Parcel parcel) {
            return new TextManipulationAction(parcel, (C2720a) null);
        }

        /* renamed from: b */
        public TextManipulationAction[] newArray(int i) {
            return new TextManipulationAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TextManipulationAction$i */
    interface C2729i {
        /* renamed from: a */
        void mo25849a();
    }

    /* synthetic */ TextManipulationAction(Parcel parcel, C2720a aVar) {
        this(parcel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0208  */
    /* renamed from: B3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13333B3(int r25, com.arlosoft.macrodroid.action.textmanipulation.TextManipulation r26) {
        /*
            r24 = this;
            r7 = r24
            r6 = r26
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r7.m_variable
            r7.workingVariable = r0
            com.arlosoft.macrodroid.variables.DictionaryKeys r0 = r7.varDictionaryKeys
            r7.workingDictionaryKeys = r0
            android.content.Context r0 = r24.mo27827K0()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165589(0x7f070195, float:1.79454E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.app.Activity r2 = r24.mo27850j0()
            int r3 = r24.mo24705l0()
            r1.<init>(r2, r3)
            int r2 = r24.mo24705l0()
            r1.setTheme(r2)
            android.widget.ScrollView r2 = new android.widget.ScrollView
            r2.<init>(r1)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r1)
            r3 = 1
            r8.setOrientation(r3)
            r8.setPadding(r0, r0, r0, r0)
            r2.addView(r8)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r10 = -2
            r5.<init>(r9, r10)
            r4.setLayoutParams(r5)
            int r5 = r26.getDescription()
            r4.setText(r5)
            r5 = 0
            r4.setPadding(r5, r5, r5, r0)
            r8.addView(r4)
            int[] r0 = r26.getParamNames()
            java.util.List r4 = r26.getParams()
            com.arlosoft.macrodroid.action.textmanipulation.TextManipulation$a[] r11 = r26.getParamTypes()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r1)
            r13 = 2131558795(0x7f0d018b, float:1.8742916E38)
            r14 = 0
            android.view.View r15 = r12.inflate(r13, r14)
            r5 = 2131363455(0x7f0a067f, float:1.834672E38)
            android.view.View r16 = r15.findViewById(r5)
            r9 = r16
            android.widget.EditText r9 = (android.widget.EditText) r9
            java.lang.String r10 = r7.m_text
            r9.setText(r10)
            r10 = 2131363454(0x7f0a067e, float:1.8346717E38)
            android.view.View r17 = r15.findViewById(r10)
            r10 = r17
            android.widget.Button r10 = (android.widget.Button) r10
            r5 = 2131363999(0x7f0a089f, float:1.8347823E38)
            android.view.View r18 = r15.findViewById(r5)
            r5 = r18
            com.google.android.material.textfield.TextInputLayout r5 = (com.google.android.material.textfield.TextInputLayout) r5
            r18 = 2131955070(0x7f130d7e, float:1.9546657E38)
            java.lang.String r13 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r18)
            r5.setHint((java.lang.CharSequence) r13)
            r5 = 524288(0x80000, float:7.34684E-40)
            r9.setInputType(r5)
            com.arlosoft.macrodroid.action.xm r13 = new com.arlosoft.macrodroid.action.xm
            r13.<init>(r9)
            com.arlosoft.macrodroid.action.gn r5 = new com.arlosoft.macrodroid.action.gn
            r5.<init>(r7, r13)
            r10.setOnClickListener(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8.addView(r15)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r13 = 0
        L_0x00c8:
            int r15 = r11.length
            if (r13 >= r15) goto L_0x021d
            r15 = r11[r13]
            com.arlosoft.macrodroid.action.textmanipulation.TextManipulation$a r3 = com.arlosoft.macrodroid.action.textmanipulation.TextManipulation.C3486a.ENUM
            if (r15 != r3) goto L_0x017e
            int[] r3 = r6.getEnumNames(r13)
            int r15 = r3.length
            if (r15 <= 0) goto L_0x016c
            android.content.res.Resources r15 = r1.getResources()
            r14 = 2131165595(0x7f07019b, float:1.7945412E38)
            int r14 = r15.getDimensionPixelOffset(r14)
            java.util.List r15 = r26.getParams()
            int r15 = r15.size()
            if (r15 <= r13) goto L_0x0102
            java.util.List r15 = r26.getParams()
            java.lang.Object r15 = r15.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            int r15 = r15.intValue()
            r19 = r2
            goto L_0x0105
        L_0x0102:
            r19 = r2
            r15 = 0
        L_0x0105:
            r2 = 2131558793(0x7f0d0189, float:1.8742912E38)
            r6 = 0
            android.view.View r2 = r12.inflate(r2, r6)
            r6 = 2131364038(0x7f0a08c6, float:1.8347902E38)
            android.view.View r6 = r2.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r20 = r9
            r9 = 2131363575(0x7f0a06f7, float:1.8346963E38)
            android.view.View r9 = r2.findViewById(r9)
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9
            int[] r21 = r26.getParamNames()
            r22 = r21[r13]
            if (r22 != 0) goto L_0x0131
            r22 = r4
            r4 = 8
            r6.setVisibility(r4)
            goto L_0x013c
        L_0x0131:
            r22 = r4
            r4 = r21[r13]
            java.lang.String r4 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r4)
            r6.setText(r4)
        L_0x013c:
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x013f:
            if (r6 >= r4) goto L_0x0164
            r21 = r4
            r4 = r3[r6]
            r23 = r3
            android.widget.RadioButton r3 = new android.widget.RadioButton
            r3.<init>(r1)
            r3.setText(r4)
            r3.setPadding(r14, r14, r14, r14)
            r9.addView(r3)
            r4 = 1
            if (r15 != r7) goto L_0x015b
            r3.setChecked(r4)
        L_0x015b:
            int r7 = r7 + 1
            int r6 = r6 + 1
            r4 = r21
            r3 = r23
            goto L_0x013f
        L_0x0164:
            r4 = 1
            r5.add(r9)
            r8.addView(r2)
            goto L_0x0173
        L_0x016c:
            r19 = r2
            r22 = r4
            r20 = r9
            r4 = 1
        L_0x0173:
            r2 = 524288(0x80000, float:7.34684E-40)
            r9 = 2131363999(0x7f0a089f, float:1.8347823E38)
            r3 = r24
            r4 = r22
            goto L_0x0210
        L_0x017e:
            r19 = r2
            r22 = r4
            r20 = r9
            r3 = r14
            r2 = 2131558795(0x7f0d018b, float:1.8742916E38)
            r4 = 1
            android.view.View r6 = r12.inflate(r2, r3)
            r3 = 2131363455(0x7f0a067f, float:1.834672E38)
            android.view.View r7 = r6.findViewById(r3)
            android.widget.EditText r7 = (android.widget.EditText) r7
            r9 = r11[r13]
            com.arlosoft.macrodroid.action.textmanipulation.TextManipulation$a r14 = com.arlosoft.macrodroid.action.textmanipulation.TextManipulation.C3486a.STRING_OPTIONAL
            if (r9 == r14) goto L_0x019f
            r10.add(r7)
        L_0x019f:
            r9 = 2131363999(0x7f0a089f, float:1.8347823E38)
            android.view.View r15 = r6.findViewById(r9)
            com.google.android.material.textfield.TextInputLayout r15 = (com.google.android.material.textfield.TextInputLayout) r15
            r17 = r0[r13]
            java.lang.String r2 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r17)
            r15.setHint((java.lang.CharSequence) r2)
            r2 = 2131363454(0x7f0a067e, float:1.8346717E38)
            android.view.View r15 = r6.findViewById(r2)
            android.widget.Button r15 = (android.widget.Button) r15
            r2 = r11[r13]
            com.arlosoft.macrodroid.action.textmanipulation.TextManipulation$a r3 = com.arlosoft.macrodroid.action.textmanipulation.TextManipulation.C3486a.INTEGER
            if (r2 != r3) goto L_0x01d8
            r2 = 8192(0x2000, float:1.14794E-41)
            r7.setInputType(r2)
            com.arlosoft.macrodroid.action.zm r2 = new com.arlosoft.macrodroid.action.zm
            r2.<init>(r7)
            com.arlosoft.macrodroid.action.fn r3 = new com.arlosoft.macrodroid.action.fn
            r14 = r24
            r3.<init>(r14, r2)
            r15.setOnClickListener(r3)
            r3 = r14
        L_0x01d5:
            r2 = 524288(0x80000, float:7.34684E-40)
            goto L_0x01f6
        L_0x01d8:
            r3 = r24
            r2 = r11[r13]
            com.arlosoft.macrodroid.action.textmanipulation.TextManipulation$a r4 = com.arlosoft.macrodroid.action.textmanipulation.TextManipulation.C3486a.STRING
            if (r2 == r4) goto L_0x01e4
            r2 = r11[r13]
            if (r2 != r14) goto L_0x01d5
        L_0x01e4:
            r2 = 524288(0x80000, float:7.34684E-40)
            r7.setInputType(r2)
            com.arlosoft.macrodroid.action.ym r4 = new com.arlosoft.macrodroid.action.ym
            r4.<init>(r7)
            com.arlosoft.macrodroid.action.hn r14 = new com.arlosoft.macrodroid.action.hn
            r14.<init>(r3, r4)
            r15.setOnClickListener(r14)
        L_0x01f6:
            int r4 = r22.size()
            if (r4 <= r13) goto L_0x0208
            r4 = r22
            java.lang.Object r14 = r4.get(r13)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r7.setText(r14)
            goto L_0x020a
        L_0x0208:
            r4 = r22
        L_0x020a:
            r5.add(r7)
            r8.addView(r6)
        L_0x0210:
            int r13 = r13 + 1
            r6 = r26
            r7 = r3
            r2 = r19
            r9 = r20
            r3 = 1
            r14 = 0
            goto L_0x00c8
        L_0x021d:
            r19 = r2
            r3 = r7
            r20 = r9
            r0 = 2131558796(0x7f0d018c, float:1.8742918E38)
            r2 = 0
            android.view.View r6 = r12.inflate(r0, r2)
            r0 = 2131364278(0x7f0a09b6, float:1.8348389E38)
            android.view.View r0 = r6.findViewById(r0)
            r7 = r0
            android.widget.Spinner r7 = (android.widget.Spinner) r7
            r0 = 2131361924(0x7f0a0084, float:1.8343614E38)
            android.view.View r0 = r6.findViewById(r0)
            r9 = r0
            android.widget.Button r9 = (android.widget.Button) r9
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r4 = -1
            r1.<init>(r4, r2)
            r0.setLayoutParams(r1)
            r1 = 2131955054(0x7f130d6e, float:1.9546625E38)
            r0.setText(r1)
            android.app.Activity r1 = r24.mo27850j0()
            r2 = 2131099873(0x7f0600e1, float:1.7812111E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            r0.setTextColor(r1)
            android.app.Activity r1 = r24.mo27850j0()
            r2 = 2131099684(0x7f060024, float:1.7811728E38)
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            androidx.core.view.ViewCompat.setBackgroundTintList(r0, r1)
            com.arlosoft.macrodroid.action.in r1 = new com.arlosoft.macrodroid.action.in
            r11 = r26
            r12 = r20
            r1.<init>(r3, r5, r11, r12)
            r0.setOnClickListener(r1)
            r8.addView(r0)
            androidx.appcompat.app.AlertDialog$Builder r13 = new androidx.appcompat.app.AlertDialog$Builder
            android.app.Activity r0 = r24.mo27850j0()
            int r1 = r24.mo24705l0()
            r13.<init>(r0, r1)
            int r0 = r26.getName()
            java.lang.String r0 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r0)
            r13.setTitle((java.lang.CharSequence) r0)
            r0 = r19
            r13.setView((android.view.View) r0)
            r0 = 17039360(0x1040000, float:2.424457E-38)
            com.arlosoft.macrodroid.action.dn r1 = com.arlosoft.macrodroid.action.C3011dn.f8211a
            r13.setNegativeButton((int) r0, (android.content.DialogInterface.OnClickListener) r1)
            r14 = 17039370(0x104000a, float:2.42446E-38)
            com.arlosoft.macrodroid.action.bn r15 = new com.arlosoft.macrodroid.action.bn
            r0 = r15
            r1 = r24
            r2 = r25
            r4 = r3
            r3 = r5
            r5 = r4
            r4 = r26
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r13.setPositiveButton((int) r14, (android.content.DialogInterface.OnClickListener) r15)
            androidx.appcompat.app.AlertDialog r13 = r13.show()
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            android.view.Window r1 = r13.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r0.copyFrom(r1)
            r1 = -1
            r0.width = r1
            android.view.Window r1 = r13.getWindow()
            r1.setAttributes(r0)
            r8.addView(r6)
            boolean r0 = r26.isArray()
            if (r0 == 0) goto L_0x02f8
            r24.mo27853m0()
            com.arlosoft.macrodroid.action.TextManipulationAction$a r6 = new com.arlosoft.macrodroid.action.TextManipulationAction$a
            r0 = r6
            r1 = r24
            r2 = r13
            r3 = r12
            r4 = r10
            r5 = r7
            r0.<init>(r2, r3, r4, r5)
            r8 = r24
            r8.m13335D3(r7, r6)
            goto L_0x030c
        L_0x02f8:
            r8 = r24
            r24.mo27870v0()
            com.arlosoft.macrodroid.action.TextManipulationAction$b r6 = new com.arlosoft.macrodroid.action.TextManipulationAction$b
            r0 = r6
            r1 = r24
            r2 = r13
            r3 = r12
            r4 = r10
            r5 = r7
            r0.<init>(r2, r3, r4, r5)
            r8.m13336E3(r7, r6)
        L_0x030c:
            com.arlosoft.macrodroid.action.en r14 = new com.arlosoft.macrodroid.action.en
            r0 = r14
            r1 = r24
            r2 = r7
            r3 = r26
            r4 = r13
            r5 = r12
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.setOnClickListener(r14)
            com.arlosoft.macrodroid.action.TextManipulationAction$d r6 = new com.arlosoft.macrodroid.action.TextManipulationAction$d
            r0 = r6
            r2 = r13
            r3 = r12
            r4 = r10
            r5 = r7
            r0.<init>(r2, r3, r4, r5)
            r12.addTextChangedListener(r6)
            java.util.Iterator r6 = r10.iterator()
        L_0x032e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x034b
            java.lang.Object r0 = r6.next()
            r9 = r0
            android.widget.EditText r9 = (android.widget.EditText) r9
            com.arlosoft.macrodroid.action.TextManipulationAction$e r11 = new com.arlosoft.macrodroid.action.TextManipulationAction$e
            r0 = r11
            r1 = r24
            r2 = r13
            r3 = r12
            r4 = r10
            r5 = r7
            r0.<init>(r2, r3, r4, r5)
            r9.addTextChangedListener(r11)
            goto L_0x032e
        L_0x034b:
            r0 = -1
            android.widget.Button r1 = r13.getButton(r0)
            com.arlosoft.macrodroid.common.MacroDroidVariable r5 = r8.workingVariable
            r0 = r24
            r2 = r12
            r3 = r10
            r4 = r7
            r0.m13352U3(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.TextManipulationAction.m13333B3(int, com.arlosoft.macrodroid.action.textmanipulation.TextManipulation):void");
    }

    /* renamed from: C3 */
    private void m13334C3() {
        List<TextManipulation> allTextManipulations = TextManipulation.getAllTextManipulations();
        String[] strArr = new String[allTextManipulations.size()];
        for (int i = 0; i < allTextManipulations.size(); i++) {
            strArr[i] = SelectableItem.m15535j1(allTextManipulations.get(i).getName());
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) strArr, this.m_option, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C2926an(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2982cn(this, allTextManipulations));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3579wm(this));
    }

    /* renamed from: D3 */
    private void m13335D3(Spinner spinner, C2729i iVar) {
        ArrayList arrayList;
        String str;
        if (mo27853m0().isEmpty()) {
            arrayList = new ArrayList(Arrays.asList(new String[]{SelectableItem.m15535j1(C17541R$string.action_set_variable_select)}));
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        Activity j0 = mo27850j0();
        Macro X0 = mo27837X0();
        if (this.workingVariable != null) {
            str = this.workingVariable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24872E(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, arrayList2, str, new C2727g(iVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public void m13336E3(Spinner spinner, C2729i iVar) {
        ArrayList arrayList;
        String str;
        if (mo27875y0().isEmpty()) {
            arrayList = new ArrayList(Arrays.asList(new String[]{SelectableItem.m15535j1(C17541R$string.action_set_variable_select)}));
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        Activity j0 = mo27850j0();
        Macro X0 = mo27837X0();
        if (this.workingVariable != null) {
            str = this.workingVariable.getName() + C6520o0.m24912e0(this.varDictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24881J(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, arrayList2, str, true, new C2726f(iVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static /* synthetic */ void m13337F3(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m13338G3(int i, List list, TextManipulation textManipulation, EditText editText, DialogInterface dialogInterface, int i2) {
        this.m_option = i;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3) instanceof EditText) {
                arrayList.add(((EditText) list.get(i3)).getText().toString());
            } else if (list.get(i3) instanceof ViewGroup) {
                RadioGroup radioGroup = (RadioGroup) list.get(i3);
                arrayList.add(String.valueOf(radioGroup.indexOfChild(radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()))));
            }
        }
        this.varDictionaryKeys = this.workingDictionaryKeys;
        this.m_variable = this.workingVariable;
        textManipulation.setParams(arrayList);
        this.m_textManipulation = textManipulation;
        this.m_text = editText.getText().toString();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public /* synthetic */ void m13339H3(Spinner spinner, TextManipulation textManipulation, AlertDialog alertDialog, EditText editText, List list, View view) {
        C6440u1.m24747d(mo27850j0(), spinner, this, C17542R$style.Theme_App_Dialog_Action, textManipulation.isArray() ? 5 : 2, new C2722c(spinner, alertDialog, editText, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static /* synthetic */ void m13340I3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public /* synthetic */ void m13341J3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(mo27850j0(), eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public static /* synthetic */ void m13342K3(EditText editText, C4023j0.C4029f fVar) {
        editText.setKeyListener((KeyListener) null);
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
        editText.setInputType(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public /* synthetic */ void m13343L3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15693A(mo27850j0(), mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static /* synthetic */ void m13344M3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public /* synthetic */ void m13345N3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(mo27850j0(), eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m13346O3(List list, TextManipulation textManipulation, EditText editText, View view) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof EditText) {
                arrayList.add(((EditText) list.get(i)).getText().toString());
            } else if (list.get(i) instanceof ViewGroup) {
                RadioGroup radioGroup = (RadioGroup) list.get(i);
                arrayList.add(String.valueOf(radioGroup.indexOfChild(radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()))));
            }
        }
        textManipulation.setParams(arrayList);
        try {
            if (textManipulation.isArray()) {
                VariableValue.Dictionary T3 = m13351T3(editText.getText().toString(), textManipulation, (TriggerContextInfo) null, mo27837X0());
                T3.toString();
                C12408a.m83285s(mo27827K0(), T3.toString(), (Drawable) null, 1, false).show();
                return;
            }
            C15626c.m94876a(mo27827K0().getApplicationContext(), m13350S3(editText.getText().toString(), textManipulation, (TriggerContextInfo) null, mo27837X0()), 1).show();
        } catch (Exception e) {
            Context applicationContext = mo27827K0().getApplicationContext();
            C15626c.m94876a(applicationContext, SelectableItem.m15535j1(C17541R$string.error) + ": " + e.toString(), 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public /* synthetic */ void m13347P3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public /* synthetic */ void m13348Q3(List list, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        TextManipulation textManipulation = this.m_textManipulation;
        if (textManipulation == null || !textManipulation.getClass().equals(((TextManipulation) list.get(checkedItemPosition)).getClass())) {
            m13333B3(checkedItemPosition, (TextManipulation) list.get(checkedItemPosition));
        } else {
            m13333B3(checkedItemPosition, this.m_textManipulation);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m13349R3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: S3 */
    private String m13350S3(String str, TextManipulation textManipulation, TriggerContextInfo triggerContextInfo, Macro macro) {
        return textManipulation.apply(C4023j0.m15760t0(MacroDroidApplication.m14845u(), str, triggerContextInfo, macro), macro, triggerContextInfo);
    }

    /* renamed from: T3 */
    private VariableValue.Dictionary m13351T3(String str, TextManipulation textManipulation, TriggerContextInfo triggerContextInfo, Macro macro) {
        return textManipulation.applyArray(C4023j0.m15760t0(MacroDroidApplication.m14845u(), str, triggerContextInfo, macro), macro, triggerContextInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public void m13352U3(Button button, EditText editText, List<EditText> list, Spinner spinner, MacroDroidVariable macroDroidVariable) {
        boolean z;
        boolean z2;
        Iterator<EditText> it = list.iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (it.next().getText().length() == 0) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        boolean z3 = (spinner.getSelectedItem() == null ? null : (C6585q0) spinner.getSelectedItem()) instanceof C6585q0.C6587b;
        if (z2 && editText.length() > 0 && (z3 || macroDroidVariable != null)) {
            z = true;
        }
        button.setEnabled(z);
    }

    /* renamed from: F */
    public String[] mo24440F() {
        if (this.m_textManipulation == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList(this.m_textManipulation.getParams());
        arrayList.add(0, this.m_text);
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (this.m_textManipulation != null) {
            this.m_text = strArr[0];
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(Arrays.asList(strArr).subList(1, strArr.length));
            this.m_textManipulation.setParams(arrayList);
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        TextManipulation textManipulation = this.m_textManipulation;
        return textManipulation != null ? textManipulation.getExtendedInfo(this.m_text) : "";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7826q4.m32718u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        TextManipulation textManipulation = this.m_textManipulation;
        if (textManipulation != null) {
            return SelectableItem.m15535j1(textManipulation.getName());
        }
        return mo24738G0();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        TextManipulation textManipulation = this.m_textManipulation;
        if (textManipulation != null) {
            try {
                if (textManipulation.isArray()) {
                    VariableValue.Dictionary T3 = m13351T3(this.m_text, this.m_textManipulation, triggerContextInfo, mo27837X0());
                    MacroDroidVariable q = mo27861q(this.m_variable.getName());
                    if (q != null) {
                        mo27832M2(q, T3);
                        return;
                    }
                    C4878b.m18868g("Text manipulation failed variable does not exist: " + this.m_variable.getName());
                    return;
                }
                String S3 = m13350S3(this.m_text, this.m_textManipulation, triggerContextInfo, mo27837X0());
                MacroDroidVariable q2 = mo27861q(this.m_variable.getName());
                if (q2 != null) {
                    DictionaryKeys dictionaryKeys = this.varDictionaryKeys;
                    mo27832M2(q2, new VariableValue.StringValue(S3, dictionaryKeys == null ? null : dictionaryKeys.getKeys()));
                    return;
                }
                C4878b.m18868g("Text manipulation failed variable does not exist: " + this.m_variable.getName());
            } catch (Exception e) {
                C4878b.m18868g("Error with text manipulation: " + e.toString());
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_variable;
    }

    /* renamed from: u1 */
    public void mo24714u1() {
        m13334C3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeParcelable(this.m_textManipulation, i);
        parcel.writeString(this.m_text);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public TextManipulationAction() {
    }

    public TextManipulationAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private TextManipulationAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_textManipulation = (TextManipulation) parcel.readParcelable(TextManipulation.class.getClassLoader());
        this.m_text = parcel.readString();
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
