package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.activities.VariableValuePrompt;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4064u;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.C6451w;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.arlosoft.macrodroid.variables.VariableWithDictionaryKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2215d;
import p057a2.C2216e;
import p057a2.C2221j;
import p057a2.C2222k;
import p057a2.C2224m;
import p128m0.C7708b4;
import p148q0.C8151a;
import p297ja.C13328m;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

public class SetVariableAction extends Action implements C2222k, C2221j, C2224m, C2215d, C2216e {
    public static final Parcelable.Creator<SetVariableAction> CREATOR = new C2665g();
    private static final int DARK_MODE_NOT_SET = -1;
    private static final int DARK_MODE_OFF = 1;
    private static final int DARK_MODE_ON = 0;
    private static final int DICTIONARY_OR_ARRAY_TYPE_NOT_SET = -1;
    private VariableWithDictionaryKeys copyDictionaryLocation;
    /* access modifiers changed from: private */
    public boolean createVar;

    /* renamed from: d */
    transient C4083b f7516d;
    private ArrayList<String> dictionaryKeys;
    private int dictionaryOrArrayType;
    private boolean m_booleanInvert;
    private int m_darkMode;
    private double m_doubleRandomMax;
    private double m_doubleRandomMin;
    private String m_expression;
    private String m_falseLabel;
    private boolean m_intExpression;
    private boolean m_intRandom;
    private int m_intRandomMax;
    private int m_intRandomMin;
    private boolean m_intValueDecrement;
    private boolean m_intValueIncrement;
    private boolean m_newBooleanValue;
    private double m_newDoubleValue;
    private long m_newIntValue;
    private String m_newStringValue;
    private MacroDroidVariable m_otherBooleanVariable;
    private transient int m_selectedIndex;
    private transient String m_selectedVarName;
    private String m_trueLabel;
    private boolean m_userPrompt;
    private boolean m_userPromptEmptyAtStart;
    private String m_userPromptMessage;
    private boolean m_userPromptPassword;
    private boolean m_userPromptShowCancel;
    private boolean m_userPromptStopAfterCancel;
    private String m_userPromptTitle;
    private MacroDroidVariable m_variable;

    /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$a */
    class C2658a implements C6520o0.C6530d {
        C2658a() {
        }

        /* renamed from: a */
        public void mo25509a(@NonNull MacroDroidVariable macroDroidVariable, boolean z) {
            macroDroidVariable.mo27761i0(false);
            if (z) {
                SetVariableAction.this.mo27835S(macroDroidVariable);
            }
            boolean unused = SetVariableAction.this.createVar = true;
            SetVariableAction.this.m12654F4(macroDroidVariable);
        }

        /* renamed from: b */
        public boolean mo25510b(@NonNull String str) {
            return SetVariableAction.this.mo27837X0().findLocalVariableByName(str) == null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$b */
    class C2659b implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariable f7518a;

        /* renamed from: b */
        final /* synthetic */ VariableValue.Dictionary f7519b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f7520c;

        /* renamed from: d */
        final /* synthetic */ int f7521d;

        /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$b$a */
        class C2660a implements C16265l<C6520o0.C6523b, C13339u> {
            C2660a() {
            }

            /* renamed from: a */
            public C13339u invoke(C6520o0.C6523b bVar) {
                C2659b.this.f7520c.clear();
                C2659b.this.f7520c.addAll(bVar.mo32708c());
                C2659b bVar2 = C2659b.this;
                SetVariableAction.this.m12656G4(bVar2.f7518a, bVar2.f7520c, bVar.mo32709d().intValue());
                return null;
            }
        }

        C2659b(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList arrayList, int i) {
            this.f7518a = macroDroidVariable;
            this.f7519b = dictionary;
            this.f7520c = arrayList;
            this.f7521d = i;
        }

        /* renamed from: a */
        public void mo24836a() {
        }

        /* renamed from: b */
        public void mo24837b(@Nullable List<String> list) {
            C6520o0.m24902Z(SetVariableAction.this.mo27850j0(), C17542R$style.Theme_App_Dialog_Action, this.f7518a, this.f7519b, SetVariableAction.this.m_macro, this.f7520c, list, true, SetVariableAction.this, new C2660a());
        }

        /* renamed from: c */
        public void mo24838c() {
            SetVariableAction.this.m12658H4(this.f7518a, this.f7520c, this.f7519b);
        }

        /* renamed from: d */
        public void mo24839d() {
            SetVariableAction.this.m12660I4(this.f7518a, this.f7520c, this.f7519b, this.f7521d);
        }

        /* renamed from: e */
        public void mo24840e(@NonNull VariableValue.DictionaryEntry dictionaryEntry) {
            this.f7520c.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                SetVariableAction.this.m12662J4(this.f7518a, (VariableValue.Dictionary) dictionaryEntry.getVariable(), this.f7520c, this.f7521d + 1);
            } else {
                SetVariableAction.this.m12656G4(this.f7518a, this.f7520c, dictionaryEntry.getVariable().getVariableType());
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$c */
    class C2661c implements C16265l<C13328m<String, Integer>, C13339u> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f7524a;

        /* renamed from: c */
        final /* synthetic */ MacroDroidVariable f7525c;

        /* renamed from: d */
        final /* synthetic */ int f7526d;

        C2661c(ArrayList arrayList, MacroDroidVariable macroDroidVariable, int i) {
            this.f7524a = arrayList;
            this.f7525c = macroDroidVariable;
            this.f7526d = i;
        }

        /* renamed from: a */
        public C13339u invoke(C13328m<String, Integer> mVar) {
            String c = mVar.mo70154c();
            Integer d = mVar.mo70155d();
            if (d.intValue() == 5) {
                ArrayList arrayList = this.f7524a;
                arrayList.add("_A_" + c);
            } else {
                this.f7524a.add(c);
            }
            VariableValue.DictionaryEntry dictionaryEntry = new VariableValue.DictionaryEntry(c, VariableValue.createForType(mVar.mo70155d().intValue()), (List<String>) null);
            this.f7525c.mo27767l0(dictionaryEntry, false, (VariableValue) null, (Macro) null);
            if (d.intValue() == 4 || d.intValue() == 5) {
                SetVariableAction.this.m12662J4(this.f7525c, (VariableValue.Dictionary) dictionaryEntry.getVariable(), this.f7524a, this.f7526d);
            } else {
                SetVariableAction.this.m12656G4(this.f7525c, this.f7524a, d.intValue());
            }
            return null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$d */
    class C2662d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7528a;

        /* renamed from: c */
        final /* synthetic */ RadioButton f7529c;

        C2662d(Button button, RadioButton radioButton) {
            this.f7528a = button;
            this.f7529c = radioButton;
        }

        public void afterTextChanged(Editable editable) {
            this.f7528a.setEnabled(editable.length() > 0 || this.f7529c.isChecked());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$e */
    class C2663e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7531a;

        /* renamed from: c */
        final /* synthetic */ EditText f7532c;

        /* renamed from: d */
        final /* synthetic */ EditText f7533d;

        C2663e(Button button, EditText editText, EditText editText2) {
            this.f7531a = button;
            this.f7532c = editText;
            this.f7533d = editText2;
        }

        public void afterTextChanged(Editable editable) {
            this.f7531a.setEnabled(this.f7532c.getText().length() > 0 && this.f7533d.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$f */
    class C2664f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7535a;

        C2664f(Button button) {
            this.f7535a = button;
        }

        public void afterTextChanged(Editable editable) {
            Trigger trigger = null;
            try {
                if (SetVariableAction.this.m_macro != null && SetVariableAction.this.m_macro.getTriggerList().size() > 0) {
                    trigger = SetVariableAction.this.m_macro.getTriggerList().get(0);
                }
                C6451w.m24766b(SetVariableAction.this.mo27827K0(), SetVariableAction.this.mo27837X0(), editable.toString(), new TriggerContextInfo(trigger));
                this.f7535a.setEnabled(true);
            } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                this.f7535a.setEnabled(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetVariableAction$g */
    class C2665g implements Parcelable.Creator<SetVariableAction> {
        C2665g() {
        }

        /* renamed from: a */
        public SetVariableAction createFromParcel(Parcel parcel) {
            return new SetVariableAction(parcel, (C2658a) null);
        }

        /* renamed from: b */
        public SetVariableAction[] newArray(int i) {
            return new SetVariableAction[i];
        }
    }

    /* synthetic */ SetVariableAction(Parcel parcel, C2658a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public /* synthetic */ boolean m12643A4(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 0) {
            return false;
        }
        ((InputMethodManager) mo27827K0().getSystemService("input_method")).toggleSoftInput(2, 0);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public /* synthetic */ void m12645B4(RadioButton radioButton, Button button, LinearLayout linearLayout, EditText editText, LinearLayout linearLayout2, LinearLayout linearLayout3, RadioButton radioButton2, RadioButton radioButton3, EditText editText2, EditText editText3, RadioButton radioButton4, EditText editText4, CompoundButton compoundButton, boolean z) {
        boolean z2 = true;
        if (radioButton.isChecked()) {
            button.setEnabled(true);
            linearLayout.setVisibility(8);
            editText.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout3.setVisibility(8);
        } else if (radioButton2.isChecked()) {
            if (editText.getText().length() <= 0) {
                z2 = false;
            }
            button.setEnabled(z2);
            editText.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout3.setVisibility(8);
        } else if (radioButton3.isChecked()) {
            if (editText2.getText().length() <= 0 || editText3.getText().length() <= 0) {
                z2 = false;
            }
            button.setEnabled(z2);
            linearLayout.setVisibility(0);
            editText.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout3.setVisibility(8);
        } else if (radioButton4.isChecked()) {
            linearLayout.setVisibility(8);
            editText.setVisibility(8);
            linearLayout2.setVisibility(0);
            linearLayout3.setVisibility(0);
            Trigger trigger = null;
            try {
                if (this.m_macro.getTriggerList().size() > 0) {
                    trigger = this.m_macro.getTriggerList().get(0);
                }
                C6451w.m24766b(mo27827K0(), mo27837X0(), editText4.getText().toString(), new TriggerContextInfo(trigger));
                button.setEnabled(true);
            } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                button.setEnabled(false);
            }
        } else {
            button.setEnabled(true);
            editText.setVisibility(8);
            linearLayout.setVisibility(8);
            linearLayout2.setVisibility(8);
            linearLayout3.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static /* synthetic */ void m12647C4(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: D1 */
    private void m12648D1() {
        MacroDroidApplication.f9885K.mo38302g(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public /* synthetic */ void m12650D4(DialogInterface dialogInterface, int i) {
        mo24706w1();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public /* synthetic */ void m12652E4(MacroDroidVariable macroDroidVariable, ArrayList arrayList, List list, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.m_variable = macroDroidVariable;
        dialogInterface.dismiss();
        this.dictionaryOrArrayType = -1;
        this.dictionaryKeys = arrayList;
        this.copyDictionaryLocation = (VariableWithDictionaryKeys) list.get(checkedItemPosition);
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public void m12654F4(@NonNull MacroDroidVariable macroDroidVariable) {
        int S = macroDroidVariable.mo27743S();
        if (S == 4 || S == 5) {
            m12662J4(macroDroidVariable, macroDroidVariable.mo27770n(), new ArrayList(), 0);
        } else {
            m12656G4(macroDroidVariable, new ArrayList(), -1);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12656G4(@androidx.annotation.NonNull com.arlosoft.macrodroid.common.MacroDroidVariable r56, @androidx.annotation.NonNull java.util.ArrayList<java.lang.String> r57, int r58) {
        /*
            r55 = this;
            r15 = r55
            boolean r0 = r55.mo27836X()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            android.app.Activity r14 = r55.mo27850j0()
            androidx.appcompat.app.AppCompatDialog r13 = new androidx.appcompat.app.AppCompatDialog
            int r0 = r55.mo24688L0()
            r13.<init>(r14, r0)
            r0 = 2131559065(0x7f0d0299, float:1.8743464E38)
            r13.setContentView((int) r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2131952228(0x7f130264, float:1.9540893E38)
            java.lang.String r1 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r1)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r56.getName()
            r0.append(r1)
            java.lang.String r1 = ""
            if (r57 == 0) goto L_0x0040
            java.lang.String r2 = com.arlosoft.macrodroid.variables.C6520o0.m24914f0(r57)
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r13.setTitle((java.lang.CharSequence) r0)
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            android.view.Window r2 = r13.getWindow()
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()
            r0.copyFrom(r2)
            r2 = -1
            r0.width = r2
            android.view.Window r3 = r13.getWindow()
            r3.setAttributes(r0)
            r0 = 2131363406(0x7f0a064e, float:1.834662E38)
            android.view.View r0 = r13.findViewById(r0)
            r12 = r0
            android.widget.Button r12 = (android.widget.Button) r12
            r0 = 2131362173(0x7f0a017d, float:1.834412E38)
            android.view.View r0 = r13.findViewById(r0)
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131364259(0x7f0a09a3, float:1.834835E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r3 = 2131364268(0x7f0a09ac, float:1.8348368E38)
            android.view.View r3 = r13.findViewById(r3)
            r10 = r3
            android.widget.RadioButton r10 = (android.widget.RadioButton) r10
            r3 = 2131364262(0x7f0a09a6, float:1.8348356E38)
            android.view.View r3 = r13.findViewById(r3)
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r4 = 2131364264(0x7f0a09a8, float:1.834836E38)
            android.view.View r4 = r13.findViewById(r4)
            r9 = r4
            android.widget.RadioButton r9 = (android.widget.RadioButton) r9
            r4 = 2131364258(0x7f0a09a2, float:1.8348348E38)
            android.view.View r4 = r13.findViewById(r4)
            r8 = r4
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            r4 = 2131364257(0x7f0a09a1, float:1.8348346E38)
            android.view.View r4 = r13.findViewById(r4)
            r7 = r4
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            r4 = 2131362075(0x7f0a011b, float:1.834392E38)
            android.view.View r4 = r13.findViewById(r4)
            r6 = r4
            android.widget.Spinner r6 = (android.widget.Spinner) r6
            r4 = 2131364252(0x7f0a099c, float:1.8348336E38)
            android.view.View r4 = r13.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5 = 2131364263(0x7f0a09a7, float:1.8348358E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            r2 = 2131364260(0x7f0a09a4, float:1.8348352E38)
            android.view.View r2 = r13.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r17 = r11
            r11 = 2131364267(0x7f0a09ab, float:1.8348366E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.RadioButton r11 = (android.widget.RadioButton) r11
            r18 = r14
            r14 = 2131364266(0x7f0a09aa, float:1.8348364E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.RadioButton r14 = (android.widget.RadioButton) r14
            r19 = r14
            r14 = 2131364265(0x7f0a09a9, float:1.8348362E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.RadioButton r14 = (android.widget.RadioButton) r14
            r20 = r2
            r2 = 2131364261(0x7f0a09a5, float:1.8348354E38)
            android.view.View r2 = r13.findViewById(r2)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r21 = r2
            r2 = 2131364254(0x7f0a099e, float:1.834834E38)
            android.view.View r2 = r13.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r22 = r5
            r5 = 2131364270(0x7f0a09ae, float:1.8348372E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r23 = r5
            r5 = 2131364256(0x7f0a09a0, float:1.8348344E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r24 = r5
            r5 = 2131364255(0x7f0a099f, float:1.8348342E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r25 = r5
            r5 = 2131364250(0x7f0a099a, float:1.8348332E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r26 = r5
            r5 = 2131364274(0x7f0a09b2, float:1.834838E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r27 = r5
            r5 = 2131364251(0x7f0a099b, float:1.8348334E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r28 = r5
            r5 = 2131362753(0x7f0a03c1, float:1.8345295E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r29 = r14
            r14 = 2131364269(0x7f0a09ad, float:1.834837E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r30 = r14
            r14 = 2131364273(0x7f0a09b1, float:1.8348378E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.RadioButton r14 = (android.widget.RadioButton) r14
            r31 = r14
            r14 = 2131364272(0x7f0a09b0, float:1.8348376E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.RadioButton r14 = (android.widget.RadioButton) r14
            r32 = r14
            r14 = 2131364271(0x7f0a09af, float:1.8348374E38)
            android.view.View r14 = r13.findViewById(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r33 = r11
            r11 = 2131364275(0x7f0a09b3, float:1.8348382E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.Button r11 = (android.widget.Button) r11
            r34 = r11
            r11 = 2131362007(0x7f0a00d7, float:1.8343782E38)
            android.view.View r11 = r13.findViewById(r11)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r11 = 2131362006(0x7f0a00d6, float:1.834378E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.EditText r11 = (android.widget.EditText) r11
            r11 = 8
            r5.setVisibility(r11)
            java.util.ArrayList r11 = r55.mo27855n0()
            r16 = r5
            r35 = r13
            r5 = -1
            r13 = r58
            if (r13 == r5) goto L_0x01bb
            r5 = r13
            goto L_0x01bf
        L_0x01bb:
            int r5 = r56.mo27743S()
        L_0x01bf:
            if (r5 != 0) goto L_0x028e
            r13 = 8
            r14.setVisibility(r13)
            r4.setVisibility(r13)
            r0 = 1
            r12.setEnabled(r0)
            boolean r1 = r15.m_userPrompt
            if (r1 == 0) goto L_0x01d5
            r8.setChecked(r0)
            goto L_0x01f0
        L_0x01d5:
            boolean r1 = r15.m_booleanInvert
            if (r1 == 0) goto L_0x01dd
            r9.setChecked(r0)
            goto L_0x01f0
        L_0x01dd:
            com.arlosoft.macrodroid.common.MacroDroidVariable r1 = r15.m_otherBooleanVariable
            if (r1 == 0) goto L_0x01e5
            r7.setChecked(r0)
            goto L_0x01f0
        L_0x01e5:
            boolean r1 = r15.m_newBooleanValue
            r10.setChecked(r1)
            boolean r1 = r15.m_newBooleanValue
            r0 = r0 ^ r1
            r3.setChecked(r0)
        L_0x01f0:
            boolean r0 = r7.isChecked()
            if (r0 == 0) goto L_0x01f8
            r0 = 0
            goto L_0x01fa
        L_0x01f8:
            r0 = 8
        L_0x01fa:
            r6.setVisibility(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r13 = 0
        L_0x0204:
            int r3 = r11.size()
            if (r13 >= r3) goto L_0x0235
            com.arlosoft.macrodroid.common.MacroDroidVariable r3 = r15.m_otherBooleanVariable
            if (r3 == 0) goto L_0x0225
            java.lang.Object r3 = r11.get(r13)
            com.arlosoft.macrodroid.common.MacroDroidVariable r3 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r3
            java.lang.String r3 = r3.getName()
            com.arlosoft.macrodroid.common.MacroDroidVariable r4 = r15.m_otherBooleanVariable
            java.lang.String r4 = r4.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0225
            r1 = r13
        L_0x0225:
            java.lang.Object r3 = r11.get(r13)
            com.arlosoft.macrodroid.common.MacroDroidVariable r3 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r3
            java.lang.String r3 = r3.getName()
            r0.add(r3)
            int r13 = r13 + 1
            goto L_0x0204
        L_0x0235:
            r3 = 2131954393(0x7f130ad9, float:1.9545284E38)
            java.lang.String r3 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r3)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0245
            r0.add(r3)
        L_0x0245:
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            android.app.Activity r4 = r55.mo27850j0()
            r13 = 2131559007(0x7f0d025f, float:1.8743346E38)
            r3.<init>(r4, r13, r0)
            r0 = 2131559004(0x7f0d025c, float:1.874334E38)
            r3.setDropDownViewResource(r0)
            r6.setAdapter(r3)
            r6.setSelection(r1)
            com.arlosoft.macrodroid.action.bi r0 = new com.arlosoft.macrodroid.action.bi
            r0.<init>(r6)
            r7.setOnCheckedChangeListener(r0)
            r4 = r23
            r1 = r25
            r14 = r29
            r3 = r32
            r13 = r34
            r25 = r8
            r23 = r16
            r8 = r28
            r16 = r6
            r6 = r21
            r21 = r7
            r7 = r26
            r26 = r9
            r9 = r20
            r20 = r22
            r22 = r5
            r5 = r2
            r2 = r24
            r24 = r11
            r11 = r33
            goto L_0x03f8
        L_0x028e:
            r3 = 1
            if (r5 != r3) goto L_0x0480
            r3 = 8
            r14.setVisibility(r3)
            r0.setVisibility(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            long r3 = r15.m_newIntValue
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
            boolean r0 = r33.isChecked()
            if (r0 == 0) goto L_0x02c0
            android.text.Editable r0 = r2.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x02be
            goto L_0x02c0
        L_0x02be:
            r0 = 0
            goto L_0x02c1
        L_0x02c0:
            r0 = 1
        L_0x02c1:
            r12.setEnabled(r0)
            android.app.Activity r0 = r55.mo27850j0()
            r13 = r16
            com.arlosoft.macrodroid.utils.C6451w.m24765a(r0, r13)
            boolean r0 = r15.m_userPrompt
            if (r0 == 0) goto L_0x0315
            r0 = 8
            r2.setVisibility(r0)
            r3 = r30
            r3.setVisibility(r0)
            r4 = r29
            r14 = 1
            r4.setChecked(r14)
            r1 = r28
            r1.setVisibility(r0)
            r14 = r4
            r16 = r6
            r6 = r21
            r4 = r23
            r3 = r32
            r21 = r7
            r23 = r13
            r7 = r26
            r13 = r34
            r26 = r9
            r9 = r20
            r20 = r22
            r22 = r5
            r5 = r2
            r2 = r24
            r24 = r11
            r11 = r33
        L_0x0306:
            r53 = r8
            r8 = r1
            r1 = r25
            r25 = r53
            r54 = r19
            r19 = r10
            r10 = r54
            goto L_0x0607
        L_0x0315:
            r36 = r28
            r4 = r29
            r3 = r30
            r0 = 8
            boolean r14 = r15.m_intValueIncrement
            if (r14 == 0) goto L_0x0355
            r2.setVisibility(r0)
            r14 = r22
            r1 = 1
            r14.setChecked(r1)
            r3.setVisibility(r0)
            r1 = r36
            r1.setVisibility(r0)
            r30 = r3
            r22 = r5
            r16 = r6
            r6 = r21
            r3 = r32
            r5 = r2
            r21 = r7
            r2 = r24
            r7 = r26
            r26 = r9
            r24 = r11
            r9 = r20
            r11 = r33
            r20 = r14
            r14 = r4
        L_0x034e:
            r4 = r23
            r23 = r13
            r13 = r34
            goto L_0x0306
        L_0x0355:
            r29 = r4
            r14 = r22
            r37 = r36
            boolean r4 = r15.m_intValueDecrement
            if (r4 == 0) goto L_0x038d
            r2.setVisibility(r0)
            r4 = r20
            r1 = 1
            r4.setChecked(r1)
            r3.setVisibility(r0)
            r1 = r37
            r1.setVisibility(r0)
            r30 = r3
            r22 = r5
            r16 = r6
            r20 = r14
            r6 = r21
            r14 = r29
            r3 = r32
            r5 = r2
            r21 = r7
            r2 = r24
            r7 = r26
            r26 = r9
            r24 = r11
            r11 = r33
            r9 = r4
            goto L_0x034e
        L_0x038d:
            r38 = r37
            boolean r4 = r15.m_intRandom
            if (r4 == 0) goto L_0x0400
            r2.setVisibility(r0)
            r0 = r19
            r4 = 1
            r0.setChecked(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            int r0 = r15.m_intRandomMin
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r4 = r24
            r4.setText(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            int r1 = r15.m_intRandomMax
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r25
            r1.setText(r0)
            r0 = 0
            r3.setVisibility(r0)
            r16 = r6
            r0 = r38
            r6 = 8
            r0.setVisibility(r6)
            r30 = r3
            r22 = r5
            r25 = r8
            r24 = r11
            r6 = r21
            r3 = r32
            r11 = r33
            r8 = r0
            r5 = r2
            r2 = r4
            r21 = r7
            r4 = r23
            r7 = r26
            r26 = r9
            r23 = r13
            r9 = r20
            r13 = r34
            r20 = r14
            r14 = r29
        L_0x03f8:
            r53 = r19
            r19 = r10
            r10 = r53
            goto L_0x0607
        L_0x0400:
            r16 = r6
            r4 = r24
            r1 = r25
            r39 = r38
            r6 = 8
            boolean r0 = r15.m_intExpression
            if (r0 == 0) goto L_0x0448
            r0 = r21
            r6 = 1
            r0.setChecked(r6)
            java.lang.String r6 = r15.m_expression
            r21 = r7
            r7 = r26
            r7.setText(r6)
            r6 = 8
            r3.setVisibility(r6)
            r2.setVisibility(r6)
            r22 = r0
            r6 = r39
            r0 = 0
            r6.setVisibility(r0)
            r13.setVisibility(r0)
            r30 = r3
            r25 = r8
            r26 = r9
            r24 = r11
            r9 = r20
            r3 = r32
            r11 = r33
            r8 = r6
            r20 = r14
            r6 = r22
            r14 = r29
            r22 = r5
            goto L_0x0476
        L_0x0448:
            r25 = r8
            r24 = r11
            r22 = r21
            r11 = r33
            r8 = r39
            r0 = 0
            r6 = 1
            r21 = r7
            r7 = r26
            r26 = r9
            r9 = 8
            r11.setChecked(r6)
            r2.setVisibility(r0)
            r3.setVisibility(r9)
            r8.setVisibility(r9)
            r30 = r3
            r9 = r20
            r6 = r22
            r3 = r32
            r22 = r5
            r20 = r14
            r14 = r29
        L_0x0476:
            r5 = r2
            r2 = r4
            r4 = r23
            r23 = r13
            r13 = r34
            goto L_0x03f8
        L_0x0480:
            r13 = r16
            r41 = r19
            r40 = r20
            r43 = r21
            r44 = r24
            r45 = r25
            r42 = r29
            r3 = r30
            r16 = r6
            r21 = r7
            r25 = r8
            r19 = r10
            r24 = r11
            r6 = r22
            r7 = r26
            r8 = r28
            r11 = r33
            r26 = r9
            r9 = 8
            r10 = 3
            if (r5 != r10) goto L_0x05c1
            r14.setVisibility(r9)
            r0.setVisibility(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            double r9 = r15.m_newDoubleValue
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r2.setText(r0)
            r0 = 8194(0x2002, float:1.1482E-41)
            r2.setInputType(r0)
            boolean r1 = r11.isChecked()
            if (r1 == 0) goto L_0x04db
            android.text.Editable r1 = r2.getText()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x04d9
            goto L_0x04db
        L_0x04d9:
            r1 = 0
            goto L_0x04dc
        L_0x04db:
            r1 = 1
        L_0x04dc:
            r12.setEnabled(r1)
            android.app.Activity r1 = r55.mo27850j0()
            com.arlosoft.macrodroid.utils.C6451w.m24765a(r1, r13)
            r1 = 8
            r6.setVisibility(r1)
            r9 = r40
            r9.setVisibility(r1)
            boolean r4 = r15.m_userPrompt
            if (r4 == 0) goto L_0x051c
            r2.setVisibility(r1)
            r3.setVisibility(r1)
            r14 = r42
            r4 = 1
            r14.setChecked(r4)
            r8.setVisibility(r1)
            r30 = r3
            r22 = r5
            r20 = r6
            r4 = r23
            r3 = r32
            r10 = r41
            r6 = r43
            r1 = r45
            r5 = r2
            r23 = r13
            r13 = r34
            r2 = r44
            goto L_0x0607
        L_0x051c:
            r14 = r42
            r4 = 1
            boolean r10 = r15.m_intRandom
            if (r10 == 0) goto L_0x0568
            r2.setVisibility(r1)
            r10 = r41
            r10.setChecked(r4)
            r20 = r2
            double r1 = r15.m_doubleRandomMin
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = r44
            r2.setText(r1)
            double r0 = r15.m_doubleRandomMax
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r45
            r1.setText(r0)
            r0 = 8194(0x2002, float:1.1482E-41)
            r2.setInputType(r0)
            r1.setInputType(r0)
            r0 = 0
            r3.setVisibility(r0)
            r4 = 8
            r8.setVisibility(r4)
            r30 = r3
            r22 = r5
            r5 = r20
            r4 = r23
            r3 = r32
            r20 = r6
            r23 = r13
            r13 = r34
            r6 = r43
            goto L_0x0607
        L_0x0568:
            r20 = r2
            r10 = r41
            r2 = r44
            r1 = r45
            r4 = 8
            boolean r0 = r15.m_intExpression
            if (r0 == 0) goto L_0x059e
            r0 = r43
            r4 = 1
            r0.setChecked(r4)
            java.lang.String r4 = r15.m_expression
            r7.setText(r4)
            r4 = 8
            r3.setVisibility(r4)
            r22 = r5
            r5 = r20
            r5.setVisibility(r4)
            r4 = 0
            r8.setVisibility(r4)
            r13.setVisibility(r4)
            r30 = r3
            r20 = r6
            r4 = r23
            r3 = r32
            r6 = r0
            goto L_0x05bc
        L_0x059e:
            r22 = r5
            r5 = r20
            r0 = 0
            r4 = 1
            r20 = r6
            r6 = 8
            r11.setChecked(r4)
            r5.setVisibility(r0)
            r3.setVisibility(r6)
            r8.setVisibility(r6)
            r30 = r3
            r4 = r23
            r3 = r32
            r6 = r43
        L_0x05bc:
            r23 = r13
            r13 = r34
            goto L_0x0607
        L_0x05c1:
            r30 = r3
            r22 = r5
            r20 = r6
            r9 = r40
            r10 = r41
            r14 = r42
            r6 = r43
            r1 = r45
            r3 = 8
            r5 = r2
            r2 = r44
            r0.setVisibility(r3)
            r4.setVisibility(r3)
            java.lang.String r0 = r15.m_newStringValue
            r4 = r23
            r4.setText(r0)
            boolean r0 = r15.m_userPrompt
            r3 = 1
            r0 = r0 ^ r3
            r3 = r31
            r3.setChecked(r0)
            boolean r0 = r15.m_userPrompt
            r3 = r32
            r3.setChecked(r0)
            boolean r0 = r15.m_userPrompt
            r23 = 1
            r0 = r0 ^ 1
            r4.setEnabled(r0)
            boolean r0 = r15.m_userPrompt
            r0 = r0 ^ 1
            r23 = r13
            r13 = r34
            r13.setEnabled(r0)
        L_0x0607:
            com.arlosoft.macrodroid.action.SetVariableAction$d r0 = new com.arlosoft.macrodroid.action.SetVariableAction$d
            r0.<init>(r12, r14)
            r43 = r6
            com.arlosoft.macrodroid.action.SetVariableAction$e r6 = new com.arlosoft.macrodroid.action.SetVariableAction$e
            r6.<init>(r12, r2, r1)
            r28 = r8
            com.arlosoft.macrodroid.action.SetVariableAction$f r8 = new com.arlosoft.macrodroid.action.SetVariableAction$f
            r8.<init>(r12)
            r40 = r9
            com.arlosoft.macrodroid.action.ai r9 = new com.arlosoft.macrodroid.action.ai
            r9.<init>(r4, r3, r13)
            r3.setOnCheckedChangeListener(r9)
            r5.addTextChangedListener(r0)
            r7.addTextChangedListener(r8)
            r2.addTextChangedListener(r6)
            r1.addTextChangedListener(r6)
            com.arlosoft.macrodroid.action.di r0 = new com.arlosoft.macrodroid.action.di
            r0.<init>(r15)
            r7.setOnEditorActionListener(r0)
            com.arlosoft.macrodroid.action.ci r9 = new com.arlosoft.macrodroid.action.ci
            r0 = r9
            r6 = r1
            r1 = r55
            r31 = r2
            r29 = r5
            r8 = r40
            r5 = r43
            r2 = r14
            r32 = r3
            r3 = r12
            r33 = r4
            r4 = r30
            r30 = r22
            r46 = r27
            r22 = r6
            r27 = r7
            r7 = r20
            r20 = r31
            r6 = r5
            r53 = r28
            r28 = r23
            r23 = r53
            r5 = r29
            r43 = r6
            r6 = r23
            r15 = r7
            r7 = r28
            r42 = r14
            r23 = r25
            r14 = r8
            r8 = r11
            r40 = r14
            r25 = r26
            r14 = r9
            r9 = r10
            r47 = r10
            r10 = r20
            r48 = r11
            r49 = r13
            r13 = r17
            r17 = r24
            r11 = r22
            r50 = r12
            r12 = r43
            r51 = r13
            r13 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.setOnCheckedChangeListener(r14)
            r11 = r40
            r11.setOnCheckedChangeListener(r14)
            r13 = r48
            r13.setOnCheckedChangeListener(r14)
            r12 = r47
            r12.setOnCheckedChangeListener(r14)
            r9 = r42
            r9.setOnCheckedChangeListener(r14)
            r10 = r43
            r10.setOnCheckedChangeListener(r14)
            com.arlosoft.macrodroid.action.oi r14 = new com.arlosoft.macrodroid.action.oi
            r0 = r14
            r2 = r30
            r3 = r23
            r4 = r25
            r5 = r19
            r6 = r21
            r7 = r17
            r8 = r16
            r16 = r10
            r10 = r15
            r15 = r13
            r13 = r16
            r52 = r14
            r26 = r18
            r21 = r32
            r14 = r15
            r15 = r29
            r16 = r20
            r17 = r22
            r18 = r27
            r19 = r26
            r20 = r21
            r21 = r33
            r22 = r56
            r23 = r35
            r24 = r58
            r25 = r57
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = r50
            r1 = r52
            r0.setOnClickListener(r1)
            com.arlosoft.macrodroid.action.mi r0 = new com.arlosoft.macrodroid.action.mi
            r1 = r35
            r0.<init>(r1)
            r2 = r51
            r2.setOnClickListener(r0)
            com.arlosoft.macrodroid.action.hi r0 = new com.arlosoft.macrodroid.action.hi
            r5 = r33
            r0.<init>(r5)
            com.arlosoft.macrodroid.action.wh r2 = new com.arlosoft.macrodroid.action.wh
            r3 = r55
            r4 = r26
            r2.<init>(r3, r4, r0)
            r11 = r49
            r11.setOnClickListener(r2)
            com.arlosoft.macrodroid.action.ji r0 = new com.arlosoft.macrodroid.action.ji
            r2 = r27
            r0.<init>(r2)
            com.arlosoft.macrodroid.action.si r2 = new com.arlosoft.macrodroid.action.si
            r2.<init>(r3, r4, r0)
            r0 = r46
            r0.setOnClickListener(r2)
            r1.show()
            r0 = 2
            r13 = r30
            if (r13 != r0) goto L_0x0726
            com.arlosoft.macrodroid.extensions.C4666m.m18141i(r5)
        L_0x0726:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetVariableAction.m12656G4(com.arlosoft.macrodroid.common.MacroDroidVariable, java.util.ArrayList, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: H4 */
    public void m12658H4(MacroDroidVariable macroDroidVariable, ArrayList<String> arrayList, VariableValue.Dictionary dictionary) {
        if (mo27836X()) {
            ArrayList<MacroDroidVariable> p0 = mo27859p0();
            VariableWithDictionaryKeys variableWithDictionaryKeys = new VariableWithDictionaryKeys(macroDroidVariable.getName(), new DictionaryKeys(arrayList));
            List<VariableWithDictionaryKeys> d0 = C6520o0.m24910d0(p0, dictionary.isArray());
            d0.remove(variableWithDictionaryKeys);
            int size = d0.size();
            String[] strArr = new String[size];
            int i = 0;
            for (int i2 = 0; i2 < d0.size(); i2++) {
                VariableWithDictionaryKeys variableWithDictionaryKeys2 = this.copyDictionaryLocation;
                if (variableWithDictionaryKeys2 != null && variableWithDictionaryKeys2.equals(d0.get(i2))) {
                    i = i2;
                }
                strArr[i2] = d0.get(i2).getVariableName() + C6520o0.m24912e0(d0.get(i2).getKeys());
            }
            if (size == 0) {
                C15626c.makeText(mo27850j0(), C17541R$string.no_variables, 1).show();
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            if (dictionary.isArray()) {
                builder.setTitle((int) C17541R$string.variable_select_array);
            } else {
                builder.setTitle((int) C17541R$string.variable_select_dictionary);
            }
            builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) C3231li.f8661a);
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3546vh(this));
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3091gi(this, macroDroidVariable, arrayList, d0));
            AlertDialog create = builder.create();
            create.show();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(create.getWindow().getAttributes());
            layoutParams.width = -1;
            create.getWindow().setAttributes(layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I4 */
    public void m12660I4(MacroDroidVariable macroDroidVariable, ArrayList<String> arrayList, VariableValue.Dictionary dictionary, int i) {
        C6520o0.m24954z0(mo27850j0(), C17542R$style.Theme_App_Dialog_Action, macroDroidVariable, dictionary, mo27837X0(), mo24686E1(), new C2661c(arrayList, macroDroidVariable, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: J4 */
    public void m12662J4(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        int i2 = i;
        C6520o0.m24884K0(mo27850j0(), C17542R$style.Theme_App_Dialog_Action, dictionary, (C16265l<? super VariableValue, Boolean>) null, this.dictionaryKeys.size() > i2 ? this.dictionaryKeys.get(i2) : null, true, new C6520o0.C6525c(true, this.dictionaryKeys), true, C6520o0.C6538e.DONT_SHOW, true, new C2659b(macroDroidVariable, dictionary, arrayList, i));
    }

    /* renamed from: K4 */
    private void m12664K4(MacroDroidVariable macroDroidVariable, TriggerContextInfo triggerContextInfo, ArrayList<String> arrayList) {
        if (macroDroidVariable.mo27743S() != 4 && macroDroidVariable.mo27743S() != 5) {
            mo27832M2(macroDroidVariable, m12680f4(macroDroidVariable, macroDroidVariable.mo27743S(), (List<String>) null, triggerContextInfo));
        } else if (this.copyDictionaryLocation != null) {
            m12671R3(macroDroidVariable, triggerContextInfo, arrayList);
        } else {
            mo27832M2(macroDroidVariable, m12680f4(macroDroidVariable, this.dictionaryOrArrayType, arrayList, triggerContextInfo));
        }
    }

    /* renamed from: R3 */
    private void m12671R3(MacroDroidVariable macroDroidVariable, TriggerContextInfo triggerContextInfo, ArrayList<String> arrayList) {
        VariableValue.Dictionary q = macroDroidVariable.mo27772q(arrayList, true);
        if (q != null) {
            MacroDroidVariable q2 = mo27861q(this.copyDictionaryLocation.getVariableName());
            if (q2 == null) {
                C4878b.m18868g("Could not copy from: " + macroDroidVariable.getName() + C6520o0.m24912e0(this.copyDictionaryLocation.getKeys()));
                return;
            }
            VariableValue.Dictionary q3 = q2.mo27772q(this.copyDictionaryLocation.getKeys().getKeys(), false);
            if (q3 != null) {
                C6520o0.m24892P(q, q3);
                if (macroDroidVariable.mo27754c0()) {
                    C4934n.m18998M().mo29688f0(mo27837X0());
                    mo27837X0().notifyVariableListenersOnCorrectThread(macroDroidVariable, q3, q);
                    return;
                }
                C4064u.m16048t().mo27974H();
                return;
            }
            C4878b.m18868g("Could not copy from: " + this.copyDictionaryLocation.getVariableName() + C6520o0.m24912e0(this.copyDictionaryLocation.getKeys()));
            return;
        }
        C4878b.m18868g("Could not update variable: " + macroDroidVariable.getName() + C6520o0.m24914f0(arrayList));
    }

    /* renamed from: S3 */
    private void m12672S3() {
        C6520o0.m24897U(mo27850j0(), this.f7516d.mo28009e().mo28008a(), true, C17542R$style.Theme_App_Dialog_Action, true, true, C17535R$layout.simple_spinner_dropdown_item_2_lines, "#999999", true, mo27837X0(), (Integer) null, new C2658a());
    }

    /* renamed from: T3 */
    private void m12673T3() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.dialog_variable_user_prompt_options);
            appCompatDialog.setTitle((int) C17541R$string.user_prompt_text);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.user_prompt_title);
            EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.user_prompt_description);
            EditText editText3 = (EditText) appCompatDialog.findViewById(C17532R$id.true_label);
            ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.true_label_layout);
            ViewGroup viewGroup2 = (ViewGroup) appCompatDialog.findViewById(C17532R$id.false_label_layout);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.title_magic_text_button);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.description_magic_text_button);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.true_label_magic_text_button);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.password_field);
            Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.existing_value);
            Button button5 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.allow_cancel_checkbox);
            Button button6 = (Button) appCompatDialog.findViewById(C17532R$id.false_label_magic_text_button);
            CheckBox checkBox4 = (CheckBox) appCompatDialog.findViewById(C17532R$id.cancel_stops_running_checkbox);
            EditText editText4 = (EditText) appCompatDialog.findViewById(C17532R$id.false_label);
            CheckBox checkBox5 = (CheckBox) appCompatDialog.findViewById(C17532R$id.dark_mode_checkbox);
            AppCompatDialog appCompatDialog2 = appCompatDialog;
            checkBox5.setChecked(m12674U3());
            checkBox3.setChecked(this.m_userPromptShowCancel);
            checkBox4.setChecked(this.m_userPromptStopAfterCancel);
            checkBox4.setEnabled(this.m_userPromptShowCancel);
            checkBox.setChecked(this.m_userPromptPassword);
            checkBox2.setChecked(!this.m_userPromptEmptyAtStart);
            viewGroup.setVisibility(this.m_variable.mo27749Y() ? 0 : 8);
            viewGroup2.setVisibility(this.m_variable.mo27749Y() ? 0 : 8);
            checkBox3.setOnCheckedChangeListener(new C3655zh(checkBox4));
            button.setOnClickListener(new C3402ri(this, j0, new C3034ei(editText)));
            button2.setOnClickListener(new C3345pi(this, j0, new C3063fi(editText2)));
            button3.setOnClickListener(new C3373qi(this, j0, new C3203ki(editText3)));
            EditText editText5 = editText4;
            button6.setOnClickListener(new C3601xh(this, j0, new C3147ii(editText5)));
            editText.setText(this.m_userPromptTitle);
            editText.setSelection(editText.length());
            editText2.setText(this.m_userPromptMessage);
            editText2.setSelection(editText2.length());
            editText3.setText(this.m_trueLabel);
            editText3.setSelection(editText3.length());
            editText5.setText(this.m_falseLabel);
            editText5.setSelection(editText5.length());
            AppCompatDialog appCompatDialog3 = appCompatDialog2;
            button5.setOnClickListener(new C3287ni(appCompatDialog3));
            CheckBox checkBox6 = checkBox;
            C3628yh yhVar = r0;
            C3628yh yhVar2 = new C3628yh(this, editText, editText2, checkBox3, checkBox4, checkBox6, checkBox2, editText3, editText5, checkBox5, appCompatDialog3);
            button4.setOnClickListener(yhVar);
            appCompatDialog3.show();
        }
    }

    /* renamed from: U3 */
    private boolean m12674U3() {
        int parseInt;
        int i = this.m_darkMode;
        if (i == 0) {
            return true;
        }
        if (i == 1 || (parseInt = Integer.parseInt(C5163j2.m19977H(mo27827K0()))) == 1) {
            return false;
        }
        if (parseInt == 2 || (mo27827K0().getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: V3 */
    private String m12675V3(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "";
                    }
                    if (this.m_userPrompt) {
                        return SelectableItem.m15535j1(C17541R$string.user_prompt);
                    }
                    if (this.m_intExpression) {
                        return this.m_expression;
                    }
                    if (!this.m_intRandom) {
                        return String.valueOf(this.m_newDoubleValue);
                    }
                    return SelectableItem.m15535j1(C17541R$string.action_set_variable_random) + " " + this.m_doubleRandomMin + " -> " + this.m_doubleRandomMax;
                } else if (this.m_userPrompt) {
                    return SelectableItem.m15535j1(C17541R$string.user_prompt);
                } else {
                    if (!TextUtils.isEmpty(this.m_newStringValue)) {
                        return this.m_newStringValue;
                    }
                    return "(" + SelectableItem.m15535j1(C17541R$string.empty) + ")";
                }
            } else if (this.m_userPrompt) {
                return SelectableItem.m15535j1(C17541R$string.user_prompt);
            } else {
                if (this.m_intValueIncrement) {
                    return "(+1)";
                }
                if (this.m_intValueDecrement) {
                    return "(-1)";
                }
                if (this.m_intRandom) {
                    return SelectableItem.m15535j1(C17541R$string.action_set_variable_random) + " " + this.m_intRandomMin + " -> " + this.m_intRandomMax;
                } else if (this.m_intExpression) {
                    return this.m_expression;
                } else {
                    return String.valueOf(this.m_newIntValue);
                }
            }
        } else if (this.m_userPrompt) {
            return SelectableItem.m15535j1(C17541R$string.user_prompt);
        } else {
            if (this.m_booleanInvert) {
                return "(" + SelectableItem.m15535j1(C17541R$string.action_set_variable_invert) + ")";
            } else if (this.m_intRandom) {
                return SelectableItem.m15535j1(C17541R$string.action_set_variable_random) + " " + this.m_doubleRandomMin + " -> " + this.m_doubleRandomMax;
            } else {
                MacroDroidVariable macroDroidVariable = this.m_otherBooleanVariable;
                if (macroDroidVariable != null) {
                    return macroDroidVariable.getName();
                }
                return SelectableItem.m15535j1(this.m_newBooleanValue ? C17541R$string.true_label : C17541R$string.false_label);
            }
        }
    }

    /* renamed from: X3 */
    private VariableValue.BooleanValue m12676X3(boolean z, @Nullable List<String> list) {
        boolean z2;
        if (this.m_booleanInvert) {
            z2 = !z;
        } else {
            MacroDroidVariable macroDroidVariable = this.m_otherBooleanVariable;
            if (macroDroidVariable != null) {
                MacroDroidVariable q = mo27861q(macroDroidVariable.getName());
                if (q != null) {
                    z2 = q.mo27762j();
                } else {
                    C4878b.m18869h(this.m_otherBooleanVariable.getName() + " does not exist", mo27840Y0().longValue());
                    z2 = false;
                }
            } else {
                z2 = this.m_newBooleanValue;
            }
        }
        return new VariableValue.BooleanValue(z2, list);
    }

    /* renamed from: Y3 */
    private VariableValue.DecimalValue m12677Y3(TriggerContextInfo triggerContextInfo, @Nullable List<String> list) {
        double d;
        if (this.m_intRandom) {
            double nextDouble = new Random().nextDouble();
            double d2 = this.m_doubleRandomMax;
            double d3 = this.m_doubleRandomMin;
            d = ((d2 - d3) * nextDouble) + d3;
        } else if (this.m_intExpression) {
            try {
                d = C6451w.m24766b(mo27827K0(), mo27837X0(), this.m_expression, triggerContextInfo);
            } catch (IllegalArgumentException unused) {
                d = 0.0d;
            }
        } else {
            d = this.m_newDoubleValue;
        }
        return new VariableValue.DecimalValue(d, list);
    }

    /* renamed from: Z3 */
    private VariableValue.IntegerValue m12678Z3(long j, TriggerContextInfo triggerContextInfo, @Nullable List<String> list) {
        long j2;
        if (this.m_intRandom) {
            j2 = (long) (new Random().nextInt(Math.max(1, (this.m_intRandomMax - this.m_intRandomMin) + 1)) + this.m_intRandomMin);
        } else if (this.m_intValueIncrement) {
            j2 = j + 1;
        } else if (this.m_intValueDecrement) {
            j2 = j - 1;
        } else if (this.m_intExpression) {
            try {
                j2 = C6451w.m24768d(mo27827K0(), mo27837X0(), this.m_expression, triggerContextInfo);
            } catch (IllegalArgumentException unused) {
                j2 = 0;
            }
        } else {
            j2 = this.m_newIntValue;
        }
        return new VariableValue.IntegerValue(j2, list);
    }

    /* renamed from: a4 */
    private VariableValue.StringValue m12679a4(TriggerContextInfo triggerContextInfo, @Nullable List<String> list) {
        return new VariableValue.StringValue(this.m_newStringValue != null ? C4023j0.m15760t0(mo27827K0(), this.m_newStringValue, triggerContextInfo, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX) : "", list);
    }

    /* renamed from: f4 */
    private VariableValue m12680f4(MacroDroidVariable macroDroidVariable, int i, @Nullable List<String> list, TriggerContextInfo triggerContextInfo) {
        boolean z = false;
        if (i == 0) {
            VariableValue.DictionaryEntry R = macroDroidVariable.mo27742R(list, false);
            if (R instanceof VariableValue.DictionaryEntry) {
                VariableValue variable = R.getVariable();
                if (variable instanceof VariableValue.BooleanValue) {
                    z = ((VariableValue.BooleanValue) variable).getBooleanValue();
                }
            } else {
                z = macroDroidVariable.mo27762j();
            }
            return m12676X3(z, list);
        } else if (i == 1) {
            VariableValue.DictionaryEntry R2 = macroDroidVariable.mo27742R(list, false);
            long j = 0;
            if (R2 instanceof VariableValue.DictionaryEntry) {
                VariableValue variable2 = R2.getVariable();
                if (variable2 instanceof VariableValue.IntegerValue) {
                    j = ((VariableValue.IntegerValue) variable2).getIntValue();
                }
            } else {
                j = macroDroidVariable.mo27731A();
            }
            return m12678Z3(j, triggerContextInfo, list);
        } else if (i == 2) {
            return m12679a4(triggerContextInfo, list);
        } else {
            if (i == 3) {
                return m12677Y3(triggerContextInfo, list);
            }
            C4878b.m18868g("Variable type undefined for variable: " + macroDroidVariable + " (Defaulting to String)");
            return m12679a4(triggerContextInfo, list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static /* synthetic */ void m12682i4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public /* synthetic */ void m12684j4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), false, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static /* synthetic */ void m12686k4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public /* synthetic */ void m12688l4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static /* synthetic */ void m12690m4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public /* synthetic */ void m12692n4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public static /* synthetic */ void m12694o4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public /* synthetic */ void m12696p4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public /* synthetic */ void m12700r4(EditText editText, EditText editText2, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, EditText editText3, EditText editText4, CheckBox checkBox5, AppCompatDialog appCompatDialog, View view) {
        this.m_userPromptTitle = editText.getText().toString();
        this.m_userPromptMessage = editText2.getText().toString();
        this.m_userPromptShowCancel = checkBox.isChecked();
        this.m_userPromptStopAfterCancel = checkBox2.isChecked();
        this.m_userPromptPassword = checkBox3.isChecked();
        this.m_userPromptEmptyAtStart = !checkBox4.isChecked();
        this.m_trueLabel = editText3.getText().toString();
        this.m_falseLabel = editText4.getText().toString();
        this.m_darkMode = checkBox5.isChecked() ^ true ? 1 : 0;
        this.copyDictionaryLocation = null;
        mo24689O1();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public /* synthetic */ void m12702s4(int i, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, List list, Spinner spinner, RadioButton radioButton5, RadioButton radioButton6, RadioButton radioButton7, RadioButton radioButton8, RadioButton radioButton9, RadioButton radioButton10, EditText editText, EditText editText2, EditText editText3, EditText editText4, Activity activity, RadioButton radioButton11, EditText editText5, MacroDroidVariable macroDroidVariable, AppCompatDialog appCompatDialog, int i2, ArrayList arrayList, View view) {
        int i3 = i;
        if (i3 == 0) {
            this.m_userPrompt = radioButton.isChecked();
            this.m_booleanInvert = radioButton2.isChecked();
            this.m_newBooleanValue = radioButton3.isChecked();
            if (!radioButton4.isChecked()) {
                this.m_otherBooleanVariable = null;
            } else if (list.size() == 0) {
                C15626c.makeText(mo27827K0(), C17541R$string.action_set_bluetooth_invalid, 0).show();
                return;
            } else {
                List list2 = list;
                this.m_otherBooleanVariable = (MacroDroidVariable) list.get(spinner.getSelectedItemPosition());
            }
        } else if (i3 == 1) {
            this.m_userPrompt = radioButton5.isChecked();
            this.m_intValueIncrement = radioButton6.isChecked();
            this.m_intValueDecrement = radioButton7.isChecked();
            this.m_intRandom = radioButton8.isChecked();
            this.m_intExpression = radioButton9.isChecked();
            this.m_expression = null;
            try {
                if (radioButton10.isChecked()) {
                    this.m_newIntValue = Long.parseLong(editText.getText().toString());
                } else if (radioButton8.isChecked()) {
                    this.m_intRandomMin = Integer.valueOf(editText2.getText().toString()).intValue();
                    this.m_intRandomMax = Integer.valueOf(editText3.getText().toString()).intValue();
                } else if (radioButton9.isChecked()) {
                    this.m_expression = editText4.getText().toString();
                }
            } catch (Exception unused) {
                C15626c.makeText(activity.getApplicationContext(), C17541R$string.invalid_value, 0).show();
                return;
            }
        } else if (i3 == 2) {
            this.m_userPrompt = radioButton11.isChecked();
            this.m_newStringValue = editText5.getText().toString();
        } else if (i3 == 3) {
            this.m_userPrompt = radioButton5.isChecked();
            this.m_intExpression = radioButton9.isChecked();
            this.m_intRandom = radioButton8.isChecked();
            this.m_expression = null;
            try {
                if (radioButton10.isChecked()) {
                    this.m_newDoubleValue = Double.valueOf(editText.getText().toString()).doubleValue();
                } else if (radioButton8.isChecked()) {
                    this.m_doubleRandomMin = Double.valueOf(editText2.getText().toString()).doubleValue();
                    this.m_doubleRandomMax = Double.valueOf(editText3.getText().toString()).doubleValue();
                } else if (radioButton9.isChecked()) {
                    this.m_expression = editText4.getText().toString();
                }
            } catch (Exception unused2) {
                C15626c.makeText(activity.getApplicationContext(), C17541R$string.invalid_value, 0).show();
                return;
            }
        }
        this.m_variable = macroDroidVariable;
        appCompatDialog.dismiss();
        this.dictionaryOrArrayType = i2;
        this.dictionaryKeys = arrayList;
        if (this.m_userPrompt) {
            m12673T3();
            return;
        }
        this.copyDictionaryLocation = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static /* synthetic */ void m12706u4(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public /* synthetic */ void m12708v4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static /* synthetic */ void m12710w4(EditText editText, C4023j0.C4029f fVar) {
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
    /* renamed from: x4 */
    public /* synthetic */ void m12712x4(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15693A(activity, mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static /* synthetic */ void m12714y4(Spinner spinner, CompoundButton compoundButton, boolean z) {
        spinner.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static /* synthetic */ void m12716z4(EditText editText, RadioButton radioButton, Button button, CompoundButton compoundButton, boolean z) {
        editText.setEnabled(!radioButton.isChecked());
        button.setEnabled(!radioButton.isChecked());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        ArrayList<MacroDroidVariable> w0 = mo27872w0();
        if (this.m_variable != null) {
            for (int i = 0; i < w0.size(); i++) {
                if (w0.get(i).getName().equals(this.m_variable.getName())) {
                    int i2 = i + 1;
                    this.m_selectedIndex = i2;
                    return i2;
                }
            }
        }
        this.m_selectedIndex = 0;
        return 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{this.m_newStringValue, this.m_expression, this.m_userPromptTitle, this.m_userPromptMessage, this.m_trueLabel, this.m_falseLabel}));
        arrayList.addAll(this.dictionaryKeys);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length >= 6) {
            this.m_newStringValue = strArr[0];
            this.m_expression = strArr[1];
            this.m_userPromptTitle = strArr[2];
            this.m_userPromptMessage = strArr[3];
            this.m_trueLabel = strArr[4];
            this.m_falseLabel = strArr[5];
            this.dictionaryKeys = new ArrayList<>();
            for (int i = 6; i < strArr.length; i++) {
                this.dictionaryKeys.add(strArr[i]);
            }
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        MacroDroidVariable macroDroidVariable = this.m_variable;
        if (macroDroidVariable == null) {
            return "";
        }
        int S = macroDroidVariable.mo27743S();
        if (S != 4 && S != 5) {
            return this.m_variable.getName() + ": " + m12675V3(this.m_variable.mo27743S());
        } else if (this.copyDictionaryLocation != null) {
            return this.m_variable.getName() + C6520o0.m24914f0(this.dictionaryKeys) + ": " + this.copyDictionaryLocation.getVariableName() + C6520o0.m24912e0(this.copyDictionaryLocation.getKeys());
        } else {
            return this.m_variable.getName() + C6520o0.m24914f0(this.dictionaryKeys) + ": " + m12675V3(this.dictionaryOrArrayType);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7708b4.m32140u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: W3 */
    public String mo25690W3() {
        return C4023j0.m15760t0(mo27827K0(), this.m_falseLabel, (TriggerContextInfo) null, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* renamed from: a */
    public String[] mo24435a() {
        String[] strArr = new String[1];
        VariableWithDictionaryKeys variableWithDictionaryKeys = this.copyDictionaryLocation;
        strArr[0] = variableWithDictionaryKeys != null ? variableWithDictionaryKeys.getVariableName() : "";
        return strArr;
    }

    /* renamed from: a1 */
    public String mo25559a1() {
        return SelectableItem.m15535j1(C17541R$string.action_set_variable);
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_variable.getName(), triggerContextInfo, mo27837X0());
        MacroDroidVariable q = mo27861q(t0);
        if (q == null) {
            if (this.createVar) {
                MacroDroidVariable macroDroidVariable = this.m_variable;
                macroDroidVariable.mo27765k0(t0);
                mo27835S(macroDroidVariable);
                q = mo27861q(t0);
            } else {
                C4878b.m18868g("Variable not found: " + t0);
                return;
            }
        }
        if (this.m_userPrompt) {
            mo25695g4(triggerContextInfo, -1, new Stack(), true, (ResumeMacroInfo) null);
            return;
        }
        m12664K4(q, triggerContextInfo, C6520o0.m24868C(mo27827K0(), this.dictionaryKeys, triggerContextInfo, mo27837X0()));
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        VariableWithDictionaryKeys variableWithDictionaryKeys = this.copyDictionaryLocation;
        if (variableWithDictionaryKeys != null) {
            return variableWithDictionaryKeys.getKeys();
        }
        return null;
    }

    /* renamed from: b4 */
    public String mo25691b4() {
        return C4023j0.m15760t0(mo27827K0(), this.m_trueLabel, (TriggerContextInfo) null, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* renamed from: c4 */
    public boolean mo25692c4() {
        return this.m_userPrompt;
    }

    /* renamed from: d4 */
    public String mo25693d4() {
        return C4023j0.m15760t0(mo27827K0(), this.m_userPromptMessage, (TriggerContextInfo) null, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* renamed from: e */
    public void mo24436e(String[] strArr) {
        if (!TextUtils.isEmpty(strArr[0])) {
            this.copyDictionaryLocation = new VariableWithDictionaryKeys(strArr[0], this.copyDictionaryLocation.getKeys());
        }
    }

    /* renamed from: e4 */
    public String mo25694e4() {
        String replace = C4023j0.m15760t0(mo27827K0(), this.m_userPromptTitle, (TriggerContextInfo) null, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
        if (!TextUtils.isEmpty(replace)) {
            return replace;
        }
        return SelectableItem.m15535j1(C17541R$string.action_set_variable_set) + " " + this.m_variable.getName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        ArrayList<MacroDroidVariable> w0 = mo27872w0();
        String[] strArr = new String[(w0.size() + 1)];
        int i = 0;
        strArr[0] = SelectableItem.m15535j1(C17541R$string.new_variable);
        while (i < w0.size()) {
            int i2 = i + 1;
            strArr[i2] = w0.get(i).getName();
            i = i2;
        }
        return strArr;
    }

    /* renamed from: g4 */
    public void mo25695g4(@NonNull TriggerContextInfo triggerContextInfo, int i, Stack<Integer> stack, boolean z, @Nullable ResumeMacroInfo resumeMacroInfo) {
        Intent intent = new Intent(MacroDroidApplication.m14845u(), VariableValuePrompt.class);
        intent.putExtra("variableName", this.m_variable.getName());
        intent.putExtra("MacroId", this.m_macro.getId());
        intent.putExtra("TriggerContextInfo", triggerContextInfo);
        intent.putExtra("NextActionIndex", i);
        intent.putExtra("force_not_enabled", z);
        intent.putExtra("title", mo25694e4());
        intent.putExtra("SkipEndifIndex", stack);
        intent.putExtra("message", mo25693d4());
        intent.putExtra("trueLabel", mo25691b4());
        intent.putExtra("falseLabel", mo25690W3());
        intent.putExtra("showCancel", this.m_userPromptShowCancel);
        intent.putExtra("stopAfterCancel", this.m_userPromptStopAfterCancel);
        intent.putExtra("darkMode", m12674U3());
        intent.putExtra("passwordMask", this.m_userPromptPassword);
        intent.putExtra("initialiseEmpty", this.m_userPromptEmptyAtStart);
        intent.putExtra("dictionaryKeys", this.dictionaryKeys);
        intent.putExtra("dictionaryOrArrayType", this.dictionaryOrArrayType);
        intent.putExtra("resume_macro_info", resumeMacroInfo);
        intent.addFlags(268435456);
        MacroDroidApplication.m14845u().startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_set_variable_select);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return this.m_userPrompt && Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: j */
    public List<MacroDroidVariable> mo24437j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.m_variable);
        MacroDroidVariable macroDroidVariable = this.m_otherBooleanVariable;
        if (macroDroidVariable != null) {
            arrayList.add(macroDroidVariable);
        }
        return arrayList;
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys2) {
        if (dictionaryKeys2 != null) {
            this.copyDictionaryLocation = new VariableWithDictionaryKeys(this.copyDictionaryLocation.getVariableName(), dictionaryKeys2);
        }
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        MacroDroidVariable macroDroidVariable = this.m_variable;
        if (macroDroidVariable == null || macroDroidVariable.mo27743S() != 2) {
            return mo25559a1() + " (" + mo24672O0() + ")";
        } else if (this.m_userPrompt) {
            return mo25559a1() + " (" + this.m_variable.getName() + ": " + SelectableItem.m15535j1(C17541R$string.user_prompt) + ")";
        } else if (TextUtils.isEmpty(this.m_newStringValue)) {
            return mo25559a1() + " (" + this.m_variable.getName() + ": " + SelectableItem.m15535j1(C17541R$string.empty) + ")";
        } else {
            String str = this.m_newStringValue;
            if (str.length() > 2000) {
                str = this.m_newStringValue.substring(0, 2000);
            }
            return mo25559a1() + " (" + this.m_variable.getName() + ": " + mo24690R2(str, triggerContextInfo) + ")";
        }
    }

    /* renamed from: n */
    public void mo24424n(@Nullable List<String> list) {
        if (list != null) {
            this.dictionaryKeys = new ArrayList<>(list);
        } else {
            this.dictionaryKeys = new ArrayList<>();
        }
    }

    @Nullable
    /* renamed from: u */
    public List<String> mo24425u() {
        return this.dictionaryKeys;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_selectedIndex == 0) {
            m12672S3();
            return;
        }
        ArrayList<MacroDroidVariable> w0 = mo27872w0();
        if (this.m_selectedIndex > w0.size()) {
            C15626c.makeText(mo27827K0(), C17541R$string.variable_does_not_exit, 0).show();
        } else {
            m12654F4(w0.get(this.m_selectedIndex - 1));
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeParcelable(this.m_otherBooleanVariable, i);
        parcel.writeLong(this.m_newIntValue);
        parcel.writeInt(this.m_newBooleanValue ? 1 : 0);
        parcel.writeString(this.m_newStringValue);
        parcel.writeInt(this.m_intValueIncrement ? 1 : 0);
        parcel.writeInt(this.m_intValueDecrement ? 1 : 0);
        parcel.writeInt(this.m_booleanInvert ? 1 : 0);
        parcel.writeInt(this.m_intRandom ? 1 : 0);
        parcel.writeInt(this.m_intRandomMin);
        parcel.writeInt(this.m_intRandomMax);
        parcel.writeInt(this.m_userPrompt ? 1 : 0);
        parcel.writeInt(this.m_intExpression ? 1 : 0);
        parcel.writeString(this.m_expression);
        parcel.writeDouble(this.m_newDoubleValue);
        parcel.writeDouble(this.m_doubleRandomMin);
        parcel.writeDouble(this.m_doubleRandomMax);
        parcel.writeString(this.m_userPromptTitle);
        parcel.writeString(this.m_userPromptMessage);
        parcel.writeInt(this.m_userPromptShowCancel ? 1 : 0);
        parcel.writeInt(this.m_userPromptStopAfterCancel ? 1 : 0);
        parcel.writeString(this.m_trueLabel);
        parcel.writeString(this.m_falseLabel);
        parcel.writeInt(this.m_darkMode);
        parcel.writeInt(this.m_userPromptPassword ? 1 : 0);
        parcel.writeInt(this.m_userPromptEmptyAtStart ? 1 : 0);
        parcel.writeInt(this.dictionaryOrArrayType);
        parcel.writeStringList(this.dictionaryKeys);
        parcel.writeParcelable(this.copyDictionaryLocation, i);
        parcel.writeInt(this.createVar ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectedIndex = i;
    }

    public SetVariableAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
        this.m_selectedIndex = 0;
        this.m_userPrompt = false;
    }

    private SetVariableAction() {
        this.m_trueLabel = SelectableItem.m15535j1(C17541R$string.true_label);
        this.m_falseLabel = SelectableItem.m15535j1(C17541R$string.false_label);
        this.m_darkMode = -1;
        this.dictionaryOrArrayType = -1;
        this.createVar = true;
        this.dictionaryKeys = new ArrayList<>();
        m12648D1();
        this.m_intValueIncrement = false;
        this.m_intValueDecrement = false;
        this.m_booleanInvert = false;
        this.m_userPromptShowCancel = true;
        this.m_userPromptStopAfterCancel = C5163j2.m20273u2(mo27827K0());
    }

    private SetVariableAction(Parcel parcel) {
        super(parcel);
        this.m_trueLabel = SelectableItem.m15535j1(C17541R$string.true_label);
        this.m_falseLabel = SelectableItem.m15535j1(C17541R$string.false_label);
        this.m_darkMode = -1;
        this.dictionaryOrArrayType = -1;
        boolean z = true;
        this.createVar = true;
        this.dictionaryKeys = new ArrayList<>();
        m12648D1();
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_otherBooleanVariable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_newIntValue = parcel.readLong();
        this.m_newBooleanValue = parcel.readInt() != 0;
        this.m_newStringValue = parcel.readString();
        this.m_intValueIncrement = parcel.readInt() != 0;
        this.m_intValueDecrement = parcel.readInt() != 0;
        this.m_booleanInvert = parcel.readInt() != 0;
        this.m_intRandom = parcel.readInt() != 0;
        this.m_intRandomMin = parcel.readInt();
        this.m_intRandomMax = parcel.readInt();
        this.m_userPrompt = parcel.readInt() != 0;
        this.m_intExpression = parcel.readInt() != 0;
        this.m_expression = parcel.readString();
        this.m_newDoubleValue = parcel.readDouble();
        this.m_doubleRandomMin = parcel.readDouble();
        this.m_doubleRandomMax = parcel.readDouble();
        this.m_userPromptTitle = parcel.readString();
        this.m_userPromptMessage = parcel.readString();
        this.m_userPromptShowCancel = parcel.readInt() != 0;
        this.m_userPromptStopAfterCancel = parcel.readInt() != 0;
        this.m_trueLabel = parcel.readString();
        this.m_falseLabel = parcel.readString();
        this.m_darkMode = parcel.readInt();
        this.m_userPromptPassword = parcel.readInt() != 0;
        this.m_userPromptEmptyAtStart = parcel.readInt() != 0;
        this.dictionaryOrArrayType = parcel.readInt();
        ArrayList<String> arrayList = new ArrayList<>();
        this.dictionaryKeys = arrayList;
        parcel.readStringList(arrayList);
        this.copyDictionaryLocation = (VariableWithDictionaryKeys) parcel.readParcelable(VariableWithDictionaryKeys.class.getClassLoader());
        this.createVar = parcel.readInt() == 0 ? false : z;
    }
}
