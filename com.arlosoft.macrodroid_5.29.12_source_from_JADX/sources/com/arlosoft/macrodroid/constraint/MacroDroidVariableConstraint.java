package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6413o0;
import com.arlosoft.macrodroid.utils.C6425s0;
import com.arlosoft.macrodroid.utils.C6451w;
import com.arlosoft.macrodroid.utils.C6460y1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2217f;
import p057a2.C2222k;
import p057a2.C2224m;
import p123l1.C7616h0;
import p135n1.C7967d;
import p148q0.C8151a;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

public class MacroDroidVariableConstraint extends Constraint implements C2222k, C2224m, C2217f {
    public static final Parcelable.Creator<MacroDroidVariableConstraint> CREATOR = new C4167e();
    private static final int DICTIONARY_OR_ARRAY_TYPE_NOT_SET = -1;
    private static final int STRING_CONTAINS = 1;
    private static final int STRING_EQUALITY_CHECK = 0;
    private static final int STRING_EXCLUDES = 2;
    private boolean checkCase;
    private DictionaryKeys compareVarDictionaryKeys;
    private DictionaryKeys dictionaryKeys;
    private int dictionaryType;
    private boolean enableRegex;
    private boolean m_booleanValue;
    private double m_doubleValue;
    private String m_expression;
    private boolean m_intCompareVariable;
    private boolean m_intGreaterThan;
    private boolean m_intLessThan;
    private boolean m_intNotEqual;
    private long m_intValue;
    private MacroDroidVariable m_otherValueToCompare;
    private int m_stringComparisonType;
    private boolean m_stringEqual;
    private String m_stringValue;
    private MacroDroidVariable m_variable;
    private transient int selectedIndex;
    /* access modifiers changed from: private */
    public DictionaryKeys workingCompareVarDictionaryKeys;
    /* access modifiers changed from: private */
    public MacroDroidVariable workingOtherVarToCompare;

    /* renamed from: com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$a */
    class C4162a implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariable f10728a;

        /* renamed from: b */
        final /* synthetic */ VariableValue.Dictionary f10729b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f10730c;

        /* renamed from: d */
        final /* synthetic */ int f10731d;

        /* renamed from: com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$a$a */
        class C4163a implements C16265l<C6520o0.C6523b, C13339u> {
            C4163a() {
            }

            /* renamed from: a */
            public C13339u invoke(C6520o0.C6523b bVar) {
                C4162a.this.f10730c.clear();
                C4162a.this.f10730c.addAll(bVar.mo32708c());
                MacroDroidVariableConstraint.this.m16737v3(bVar.mo32709d().intValue(), C4162a.this.f10730c);
                return null;
            }
        }

        C4162a(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList arrayList, int i) {
            this.f10728a = macroDroidVariable;
            this.f10729b = dictionary;
            this.f10730c = arrayList;
            this.f10731d = i;
        }

        /* renamed from: a */
        public void mo24836a() {
        }

        /* renamed from: b */
        public void mo24837b(@Nullable List<String> list) {
            C6520o0.m24902Z(MacroDroidVariableConstraint.this.mo27850j0(), MacroDroidVariableConstraint.this.mo24705l0(), this.f10728a, this.f10729b, MacroDroidVariableConstraint.this.m_macro, this.f10730c, list, true, MacroDroidVariableConstraint.this, new C4163a());
        }

        /* renamed from: c */
        public void mo24838c() {
        }

        /* renamed from: d */
        public void mo24839d() {
        }

        /* renamed from: e */
        public void mo24840e(@NonNull VariableValue.DictionaryEntry dictionaryEntry) {
            this.f10730c.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                MacroDroidVariableConstraint.this.m16721I3(this.f10728a, (VariableValue.Dictionary) dictionaryEntry.getVariable(), this.f10730c, this.f10731d + 1);
            } else {
                MacroDroidVariableConstraint.this.m16737v3(dictionaryEntry.getVariable().getVariableType(), this.f10730c);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$b */
    class C4164b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f10734a;

        C4164b(Button button) {
            this.f10734a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f10734a.setEnabled(editable.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$c */
    class C4165c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EditText f10736a;

        /* renamed from: c */
        final /* synthetic */ Button f10737c;

        C4165c(EditText editText, Button button) {
            this.f10736a = editText;
            this.f10737c = button;
        }

        public void afterTextChanged(Editable editable) {
            try {
                C6451w.m24766b(MacroDroidVariableConstraint.this.mo27827K0(), MacroDroidVariableConstraint.this.mo27837X0(), this.f10736a.getText().toString(), (TriggerContextInfo) null);
                this.f10737c.setEnabled(true);
            } catch (Exception unused) {
                this.f10737c.setEnabled(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$d */
    class C4166d implements C6520o0.C6540f {
        C4166d() {
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            MacroDroidVariable unused = MacroDroidVariableConstraint.this.workingOtherVarToCompare = null;
            DictionaryKeys unused2 = MacroDroidVariableConstraint.this.workingCompareVarDictionaryKeys = null;
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            MacroDroidVariable unused = MacroDroidVariableConstraint.this.workingOtherVarToCompare = macroDroidVariable;
            DictionaryKeys unused2 = MacroDroidVariableConstraint.this.workingCompareVarDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$e */
    class C4167e implements Parcelable.Creator<MacroDroidVariableConstraint> {
        C4167e() {
        }

        /* renamed from: a */
        public MacroDroidVariableConstraint createFromParcel(Parcel parcel) {
            return new MacroDroidVariableConstraint(parcel, (C4162a) null);
        }

        /* renamed from: b */
        public MacroDroidVariableConstraint[] newArray(int i) {
            return new MacroDroidVariableConstraint[i];
        }
    }

    /* synthetic */ MacroDroidVariableConstraint(Parcel parcel, C4162a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m16713A3(int i, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, EditText editText, EditText editText2, RadioButton radioButton6, RadioButton radioButton7, RadioButton radioButton8, RadioButton radioButton9, RadioButton radioButton10, EditText editText3, CheckBox checkBox, CheckBox checkBox2, ArrayList arrayList, AppCompatDialog appCompatDialog, View view) {
        int i2 = i;
        if (i2 != 0) {
            String str = null;
            if (i2 == 1) {
                this.m_intGreaterThan = radioButton2.isChecked();
                this.m_intLessThan = radioButton3.isChecked();
                this.m_intNotEqual = radioButton4.isChecked();
                if (radioButton5.isChecked()) {
                    str = editText.getText().toString();
                }
                this.m_expression = str;
                if (editText2.length() > 0) {
                    try {
                        this.m_intValue = Long.valueOf(editText2.getText().toString()).longValue();
                    } catch (NumberFormatException unused) {
                        C15626c.makeText(mo27827K0(), C17541R$string.invalid_value, 0).show();
                        return;
                    }
                } else {
                    this.m_intValue = 0;
                }
                this.m_intCompareVariable = radioButton6.isChecked();
                this.m_otherValueToCompare = this.workingOtherVarToCompare;
                this.compareVarDictionaryKeys = this.workingCompareVarDictionaryKeys;
            } else if (i2 == 2) {
                if (radioButton7.isChecked() || radioButton8.isChecked()) {
                    this.m_stringComparisonType = 0;
                    this.m_stringEqual = radioButton7.isChecked();
                } else if (radioButton9.isChecked()) {
                    this.m_stringComparisonType = 1;
                } else if (radioButton10.isChecked()) {
                    this.m_stringComparisonType = 2;
                }
                this.m_stringValue = editText3.getText().toString();
            } else if (i2 == 3) {
                this.m_intGreaterThan = radioButton2.isChecked();
                this.m_intLessThan = radioButton3.isChecked();
                this.m_intNotEqual = radioButton4.isChecked();
                if (radioButton5.isChecked()) {
                    str = editText.getText().toString();
                }
                this.m_expression = str;
                if (editText2.length() > 0) {
                    this.m_doubleValue = Double.valueOf(editText2.getText().toString()).doubleValue();
                } else {
                    this.m_doubleValue = 0.0d;
                }
                this.m_intCompareVariable = radioButton6.isChecked();
                this.m_otherValueToCompare = this.workingOtherVarToCompare;
                this.compareVarDictionaryKeys = this.workingCompareVarDictionaryKeys;
            }
        } else {
            this.m_booleanValue = radioButton.isChecked();
        }
        this.checkCase = true ^ checkBox.isChecked();
        this.enableRegex = checkBox2.isChecked();
        this.dictionaryType = i2;
        this.dictionaryKeys = new DictionaryKeys(arrayList);
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public static /* synthetic */ void m16715C3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public /* synthetic */ void m16716D3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Constraint_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m16717E3(Spinner spinner, RadioButton radioButton, RadioButton radioButton2, EditText editText, Button button, LinearLayout linearLayout, EditText editText2, Button button2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            m16736u3(spinner);
            RadioButton radioButton4 = radioButton;
            radioButton.setChecked(false);
            RadioButton radioButton5 = radioButton2;
            radioButton2.setChecked(false);
            EditText editText3 = editText;
            editText.setEnabled(false);
            Button button3 = button;
            button.setEnabled(false);
            LinearLayout linearLayout2 = linearLayout;
            linearLayout.setVisibility(8);
            EditText editText4 = editText2;
            editText2.setEnabled(false);
            Spinner spinner2 = spinner;
            spinner.setVisibility(0);
            Button button4 = button2;
            button2.setEnabled(m16739x3(radioButton.isChecked(), radioButton3.isChecked(), radioButton2.isChecked(), editText2.getText().toString(), editText.getText().toString()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public /* synthetic */ void m16718F3(RadioButton radioButton, EditText editText, RadioButton radioButton2, EditText editText2, Button button, LinearLayout linearLayout, Spinner spinner, Button button2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        EditText editText3 = editText;
        if (z) {
            RadioButton radioButton4 = radioButton;
            radioButton.setChecked(false);
            editText.setEnabled(false);
            RadioButton radioButton5 = radioButton2;
            radioButton2.setChecked(false);
            EditText editText4 = editText2;
            editText2.setEnabled(false);
            Button button3 = button;
            button.setEnabled(false);
            LinearLayout linearLayout2 = linearLayout;
            linearLayout.setVisibility(8);
            Spinner spinner2 = spinner;
            spinner.setVisibility(8);
            editText.setEnabled(true);
            Button button4 = button2;
            button2.setEnabled(m16739x3(radioButton3.isChecked(), radioButton.isChecked(), radioButton2.isChecked(), editText.getText().toString(), editText2.getText().toString()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public /* synthetic */ void m16719G3(RadioButton radioButton, EditText editText, RadioButton radioButton2, Spinner spinner, EditText editText2, Button button, LinearLayout linearLayout, Button button2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            RadioButton radioButton4 = radioButton;
            radioButton.setChecked(false);
            EditText editText3 = editText;
            editText.setEnabled(false);
            RadioButton radioButton5 = radioButton2;
            radioButton2.setChecked(false);
            Spinner spinner2 = spinner;
            spinner.setVisibility(8);
            EditText editText4 = editText2;
            editText2.setEnabled(true);
            Button button3 = button;
            button.setEnabled(true);
            LinearLayout linearLayout2 = linearLayout;
            linearLayout.setVisibility(0);
            Button button4 = button2;
            button2.setEnabled(m16739x3(radioButton.isChecked(), radioButton2.isChecked(), radioButton3.isChecked(), editText.getText().toString(), editText2.getText().toString()));
        }
    }

    /* renamed from: H3 */
    private void m16720H3(@NonNull MacroDroidVariable macroDroidVariable) {
        int S = macroDroidVariable.mo27743S();
        if (S == 4 || S == 5) {
            m16721I3(macroDroidVariable, macroDroidVariable.mo27770n(), new ArrayList(), 0);
        } else {
            m16737v3(macroDroidVariable.mo27743S(), new ArrayList());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public void m16721I3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        List<String> list = null;
        String str = arrayList.size() > i ? arrayList.get(i) : null;
        Activity j0 = mo27850j0();
        int l0 = mo24705l0();
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        if (dictionaryKeys2 != null) {
            list = dictionaryKeys2.getKeys();
        }
        C6520o0.m24884K0(j0, l0, dictionary, (C16265l<? super VariableValue, Boolean>) null, str, false, new C6520o0.C6525c(true, list), false, C6520o0.C6538e.DONT_SHOW, true, new C4162a(macroDroidVariable, dictionary, arrayList, i));
    }

    /* renamed from: u3 */
    private void m16736u3(Spinner spinner) {
        String str;
        Activity j0 = mo27850j0();
        Macro X0 = mo27837X0();
        ArrayList arrayList = new ArrayList();
        if (this.workingOtherVarToCompare != null) {
            str = this.workingOtherVarToCompare.getName() + C6520o0.m24912e0(this.workingCompareVarDictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24879I(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, arrayList, str, "", false, new C4166d());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x047f  */
    /* renamed from: v3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m16737v3(int r49, java.util.ArrayList<java.lang.String> r50) {
        /*
            r48 = this;
            r15 = r48
            r2 = r49
            android.app.Activity r14 = r48.mo27850j0()
            androidx.appcompat.app.AppCompatDialog r13 = new androidx.appcompat.app.AppCompatDialog
            int r0 = r48.mo24688L0()
            r13.<init>(r14, r0)
            r0 = 2131559062(0x7f0d0296, float:1.8743457E38)
            r13.setContentView((int) r0)
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r15.m_variable
            java.lang.String r0 = r0.getName()
            r13.setTitle((java.lang.CharSequence) r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.arlosoft.macrodroid.common.MacroDroidVariable r1 = r15.m_variable
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            if (r50 == 0) goto L_0x0035
            java.lang.String r1 = com.arlosoft.macrodroid.variables.C6520o0.m24914f0(r50)
            goto L_0x0037
        L_0x0035:
            java.lang.String r1 = ""
        L_0x0037:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.setTitle((java.lang.CharSequence) r0)
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r15.m_otherValueToCompare
            r15.workingOtherVarToCompare = r0
            com.arlosoft.macrodroid.variables.DictionaryKeys r0 = r15.compareVarDictionaryKeys
            r15.workingCompareVarDictionaryKeys = r0
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            android.view.Window r1 = r13.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r0.copyFrom(r1)
            r1 = -1
            r0.width = r1
            android.view.Window r1 = r13.getWindow()
            r1.setAttributes(r0)
            r0 = 2131364226(0x7f0a0982, float:1.8348283E38)
            android.view.View r0 = r13.findViewById(r0)
            r12 = r0
            android.widget.Button r12 = (android.widget.Button) r12
            r0 = 2131364225(0x7f0a0981, float:1.8348281E38)
            android.view.View r0 = r13.findViewById(r0)
            r11 = r0
            android.widget.Button r11 = (android.widget.Button) r11
            r0 = 2131364232(0x7f0a0988, float:1.8348295E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r1 = 2131364238(0x7f0a098e, float:1.8348307E38)
            android.view.View r1 = r13.findViewById(r1)
            r3 = r1
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            r1 = 2131364234(0x7f0a098a, float:1.83483E38)
            android.view.View r1 = r13.findViewById(r1)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r4 = 2131364227(0x7f0a0983, float:1.8348285E38)
            android.view.View r4 = r13.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5 = 2131364233(0x7f0a0989, float:1.8348297E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            r6 = 2131364236(0x7f0a098c, float:1.8348303E38)
            android.view.View r6 = r13.findViewById(r6)
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r7 = 2131364235(0x7f0a098b, float:1.8348301E38)
            android.view.View r7 = r13.findViewById(r7)
            android.widget.RadioButton r7 = (android.widget.RadioButton) r7
            r8 = 2131364237(0x7f0a098d, float:1.8348305E38)
            android.view.View r8 = r13.findViewById(r8)
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            r9 = 2131364228(0x7f0a0984, float:1.8348287E38)
            android.view.View r9 = r13.findViewById(r9)
            r10 = r9
            android.widget.EditText r10 = (android.widget.EditText) r10
            r9 = 2131364229(0x7f0a0985, float:1.834829E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.RadioButton r9 = (android.widget.RadioButton) r9
            r16 = r9
            r9 = 2131364230(0x7f0a0986, float:1.8348291E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.RadioButton r9 = (android.widget.RadioButton) r9
            r17 = r9
            r9 = 2131364231(0x7f0a0987, float:1.8348293E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.Spinner r9 = (android.widget.Spinner) r9
            r18 = r9
            r9 = 2131364242(0x7f0a0992, float:1.8348316E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9
            r19 = r11
            r11 = 2131364244(0x7f0a0994, float:1.834832E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.RadioButton r11 = (android.widget.RadioButton) r11
            r20 = r5
            r5 = 2131364246(0x7f0a0996, float:1.8348324E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            r21 = r8
            r8 = 2131364243(0x7f0a0993, float:1.8348318E38)
            android.view.View r8 = r13.findViewById(r8)
            android.widget.RadioButton r8 = (android.widget.RadioButton) r8
            r22 = r6
            r6 = 2131364245(0x7f0a0995, float:1.8348322E38)
            android.view.View r6 = r13.findViewById(r6)
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            r23 = r7
            r7 = 2131364240(0x7f0a0990, float:1.8348311E38)
            android.view.View r7 = r13.findViewById(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            r24 = r10
            r10 = 2131364239(0x7f0a098f, float:1.834831E38)
            android.view.View r10 = r13.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r25 = r7
            r7 = 2131364241(0x7f0a0991, float:1.8348314E38)
            android.view.View r7 = r13.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r26 = r7
            r7 = 2131364247(0x7f0a0997, float:1.8348326E38)
            android.view.View r7 = r13.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r27 = r6
            r6 = 2131362672(0x7f0a0370, float:1.8345131E38)
            android.view.View r6 = r13.findViewById(r6)
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            r28 = r8
            r8 = 2131362926(0x7f0a046e, float:1.8345646E38)
            android.view.View r8 = r13.findViewById(r8)
            android.widget.CheckBox r8 = (android.widget.CheckBox) r8
            r29 = r5
            r5 = 2131362755(0x7f0a03c3, float:1.83453E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.RadioButton r5 = (android.widget.RadioButton) r5
            r30 = r5
            r5 = 2131362752(0x7f0a03c0, float:1.8345293E38)
            android.view.View r5 = r13.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r31 = r11
            r11 = 2131362754(0x7f0a03c2, float:1.8345298E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.Button r11 = (android.widget.Button) r11
            r32 = r0
            r0 = 2131362753(0x7f0a03c1, float:1.8345295E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r33 = r13
            java.util.ArrayList r13 = r48.mo27814A0()
            java.util.Iterator r34 = r13.iterator()
        L_0x0198:
            boolean r35 = r34.hasNext()
            r36 = r7
            if (r35 == 0) goto L_0x01ce
            java.lang.Object r35 = r34.next()
            com.arlosoft.macrodroid.common.MacroDroidVariable r35 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r35
            int r7 = r35.mo27743S()
            r37 = r10
            r10 = 3
            if (r7 == r10) goto L_0x01b6
            int r7 = r35.mo27743S()
            r10 = 1
            if (r7 != r10) goto L_0x01c6
        L_0x01b6:
            java.lang.String r7 = r35.getName()
            com.arlosoft.macrodroid.common.MacroDroidVariable r10 = r15.m_variable
            java.lang.String r10 = r10.getName()
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x01c9
        L_0x01c6:
            r34.remove()
        L_0x01c9:
            r7 = r36
            r10 = r37
            goto L_0x0198
        L_0x01ce:
            r37 = r10
            int r7 = r13.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            r35 = r1
            r10 = 0
        L_0x01d9:
            int r1 = r13.size()
            if (r10 >= r1) goto L_0x01ee
            java.lang.Object r1 = r13.get(r10)
            com.arlosoft.macrodroid.common.MacroDroidVariable r1 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r1
            java.lang.String r1 = r1.getName()
            r7[r10] = r1
            int r10 = r10 + 1
            goto L_0x01d9
        L_0x01ee:
            com.arlosoft.macrodroid.common.MacroDroidVariable r1 = r15.m_otherValueToCompare
            if (r1 != 0) goto L_0x0201
            int r1 = r13.size()
            if (r1 <= 0) goto L_0x0201
            r1 = 0
            java.lang.Object r7 = r13.get(r1)
            com.arlosoft.macrodroid.common.MacroDroidVariable r7 = (com.arlosoft.macrodroid.common.MacroDroidVariable) r7
            r15.m_otherValueToCompare = r7
        L_0x0201:
            java.lang.String r1 = r15.m_expression
            r5.setText(r1)
            com.arlosoft.macrodroid.constraint.y1 r1 = new com.arlosoft.macrodroid.constraint.y1
            r1.<init>(r5)
            com.arlosoft.macrodroid.constraint.t1 r7 = new com.arlosoft.macrodroid.constraint.t1
            r7.<init>(r15, r14, r1)
            r11.setOnClickListener(r7)
            r13 = 8
            r0.setVisibility(r13)
            boolean r1 = r15.enableRegex
            r6.setChecked(r1)
            boolean r1 = r15.checkCase
            r7 = 1
            r1 = r1 ^ r7
            r8.setChecked(r1)
            if (r2 != 0) goto L_0x0263
            r4.setVisibility(r13)
            r9.setVisibility(r13)
            r12.setEnabled(r7)
            boolean r1 = r15.m_booleanValue
            r3.setChecked(r1)
            boolean r1 = r15.m_booleanValue
            r1 = r1 ^ r7
            r4 = r35
            r4.setChecked(r1)
            r10 = r37
            r10.setVisibility(r13)
            r1 = r36
            r1.setVisibility(r13)
            r6.setVisibility(r13)
            r8.setVisibility(r13)
            r20 = r0
            r1 = r22
            r4 = r23
            r9 = r24
            r7 = r25
            r13 = r27
            r27 = r28
            r25 = r29
            r10 = 1
            r29 = r11
        L_0x025f:
            r11 = r21
            goto L_0x0383
        L_0x0263:
            r1 = r36
            r10 = r37
            if (r2 == r7) goto L_0x02d8
            r7 = 3
            if (r2 != r7) goto L_0x026e
            goto L_0x02d8
        L_0x026e:
            r7 = r32
            r7.setVisibility(r13)
            r4.setVisibility(r13)
            int r1 = r15.m_stringComparisonType
            if (r1 != 0) goto L_0x028f
            boolean r1 = r15.m_stringEqual
            r4 = r31
            r4.setChecked(r1)
            boolean r1 = r15.m_stringEqual
            r7 = 1
            r1 = r1 ^ r7
            r9 = r29
            r9.setChecked(r1)
            r13 = r27
            r10 = r28
            goto L_0x02a9
        L_0x028f:
            r9 = r29
            r4 = r31
            r7 = 1
            if (r1 != r7) goto L_0x029c
            r10 = r28
            r10.setChecked(r7)
            goto L_0x02a7
        L_0x029c:
            r10 = r28
            r13 = 2
            if (r1 != r13) goto L_0x02a7
            r13 = r27
            r13.setChecked(r7)
            goto L_0x02a9
        L_0x02a7:
            r13 = r27
        L_0x02a9:
            java.lang.String r1 = r15.m_stringValue
            r7 = r25
            r7.setText(r1)
            android.text.Editable r1 = r7.getText()
            int r1 = r1.length()
            r7.setSelection(r1)
            r1 = 1
            r12.setEnabled(r1)
            r1 = 0
            r8.setVisibility(r1)
            r20 = r0
            r31 = r4
            r25 = r9
            r27 = r10
            r29 = r11
            r11 = r21
            r1 = r22
            r4 = r23
            r9 = r24
            r10 = 1
            goto L_0x0383
        L_0x02d8:
            r7 = r25
            r13 = r27
            r27 = r28
            r25 = r29
            r4 = r32
            r29 = r11
            r11 = 8
            r4.setVisibility(r11)
            r9.setVisibility(r11)
            android.text.Editable r4 = r24.getText()
            int r4 = r4.length()
            r9 = r24
            r9.setSelection(r4)
            r10.setVisibility(r11)
            r1.setVisibility(r11)
            r6.setVisibility(r11)
            r10 = 0
            r0.setVisibility(r10)
            android.content.Context r1 = r48.mo27827K0()
            com.arlosoft.macrodroid.utils.C6451w.m24765a(r1, r0)
            r1 = 3
            if (r2 != r1) goto L_0x031f
            r1 = 8194(0x2002, float:1.1482E-41)
            r9.setInputType(r1)
            double r10 = r15.m_doubleValue
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r9.setText(r1)
            goto L_0x032d
        L_0x031f:
            r1 = 4098(0x1002, float:5.743E-42)
            r9.setInputType(r1)
            long r10 = r15.m_intValue
            java.lang.String r1 = java.lang.String.valueOf(r10)
            r9.setText(r1)
        L_0x032d:
            int r1 = r9.length()
            r9.setSelection(r1)
            android.text.Editable r1 = r9.getText()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0340
            r10 = 1
            goto L_0x0341
        L_0x0340:
            r10 = 0
        L_0x0341:
            r12.setEnabled(r10)
            r11 = 8
            r8.setVisibility(r11)
            boolean r1 = r15.m_intGreaterThan
            if (r1 == 0) goto L_0x035a
            r4 = r23
            r10 = 1
            r4.setChecked(r10)
            r20 = r0
            r11 = r21
            r1 = r22
            goto L_0x0383
        L_0x035a:
            r4 = r23
            r10 = 1
            boolean r1 = r15.m_intLessThan
            if (r1 == 0) goto L_0x036a
            r1 = r22
            r1.setChecked(r10)
            r20 = r0
            goto L_0x025f
        L_0x036a:
            r1 = r22
            boolean r11 = r15.m_intNotEqual
            if (r11 == 0) goto L_0x0378
            r11 = r21
            r11.setChecked(r10)
            r20 = r0
            goto L_0x0383
        L_0x0378:
            r11 = r21
            r47 = r20
            r20 = r0
            r0 = r47
            r0.setChecked(r10)
        L_0x0383:
            com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$b r0 = new com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$b
            r0.<init>(r12)
            r9.addTextChangedListener(r0)
            com.arlosoft.macrodroid.constraint.s1 r0 = new com.arlosoft.macrodroid.constraint.s1
            r38 = r20
            r20 = r0
            r21 = r1
            r1 = r48
            r2 = r49
            r22 = r31
            r49 = r5
            r23 = r25
            r5 = r21
            r24 = r6
            r21 = r13
            r6 = r11
            r13 = r7
            r11 = r26
            r25 = 1
            r7 = r30
            r26 = r27
            r27 = r8
            r8 = r49
            r10 = r9
            r39 = r16
            r31 = r17
            r40 = r18
            r41 = r10
            r32 = 0
            r10 = r31
            r43 = r11
            r42 = r19
            r44 = r29
            r16 = 8
            r11 = r22
            r45 = r12
            r12 = r23
            r23 = r13
            r22 = r33
            r28 = 8
            r13 = r26
            r46 = r14
            r14 = r21
            r15 = r23
            r16 = r27
            r17 = r24
            r18 = r50
            r19 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r11 = r45
            r11.setOnClickListener(r0)
            com.arlosoft.macrodroid.constraint.r1 r0 = new com.arlosoft.macrodroid.constraint.r1
            r12 = r22
            r0.<init>(r12)
            r1 = r42
            r1.setOnClickListener(r0)
            com.arlosoft.macrodroid.constraint.z1 r0 = new com.arlosoft.macrodroid.constraint.z1
            r7 = r23
            r0.<init>(r7)
            com.arlosoft.macrodroid.constraint.u1 r1 = new com.arlosoft.macrodroid.constraint.u1
            r13 = r48
            r2 = r46
            r1.<init>(r13, r2, r0)
            r7 = r43
            r7.setOnClickListener(r1)
            boolean r0 = r13.m_intCompareVariable
            if (r0 != 0) goto L_0x0417
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x0417
            r14 = r39
            r7 = 1
            goto L_0x041a
        L_0x0417:
            r14 = r39
            r7 = 0
        L_0x041a:
            r14.setChecked(r7)
            boolean r0 = r13.m_intCompareVariable
            if (r0 != 0) goto L_0x0429
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x0429
            r15 = r41
            r7 = 1
            goto L_0x042c
        L_0x0429:
            r15 = r41
            r7 = 0
        L_0x042c:
            r15.setEnabled(r7)
            java.lang.String r0 = r13.m_expression
            r10 = r30
            if (r0 == 0) goto L_0x0437
            r7 = 1
            goto L_0x0438
        L_0x0437:
            r7 = 0
        L_0x0438:
            r10.setChecked(r7)
            java.lang.String r0 = r13.m_expression
            r9 = r49
            if (r0 == 0) goto L_0x0443
            r7 = 1
            goto L_0x0444
        L_0x0443:
            r7 = 0
        L_0x0444:
            r9.setEnabled(r7)
            java.lang.String r0 = r13.m_expression
            r8 = r44
            if (r0 == 0) goto L_0x044f
            r7 = 1
            goto L_0x0450
        L_0x044f:
            r7 = 0
        L_0x0450:
            r8.setEnabled(r7)
            java.lang.String r0 = r13.m_expression
            r7 = r38
            if (r0 == 0) goto L_0x045b
            r0 = 0
            goto L_0x045d
        L_0x045b:
            r0 = 8
        L_0x045d:
            r7.setVisibility(r0)
            java.lang.String r0 = r13.m_expression
            r9.setText(r0)
            boolean r0 = r13.m_intCompareVariable
            if (r0 == 0) goto L_0x0471
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x0471
            r6 = r31
            r0 = 1
            goto L_0x0474
        L_0x0471:
            r6 = r31
            r0 = 0
        L_0x0474:
            r6.setChecked(r0)
            boolean r0 = r13.m_intCompareVariable
            if (r0 == 0) goto L_0x0483
            java.lang.String r0 = r13.m_expression
            if (r0 != 0) goto L_0x0483
            r5 = r40
            r0 = 0
            goto L_0x0487
        L_0x0483:
            r5 = r40
            r0 = 8
        L_0x0487:
            r5.setVisibility(r0)
            boolean r0 = r6.isChecked()
            if (r0 == 0) goto L_0x0493
            r13.m16736u3(r5)
        L_0x0493:
            com.arlosoft.macrodroid.constraint.x1 r4 = new com.arlosoft.macrodroid.constraint.x1
            r0 = r4
            r1 = r48
            r2 = r5
            r3 = r14
            r22 = r12
            r12 = r4
            r4 = r10
            r16 = r5
            r5 = r9
            r31 = r6
            r6 = r8
            r17 = r7
            r18 = r8
            r8 = r15
            r49 = r9
            r9 = r11
            r30 = r10
            r10 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r10.setOnCheckedChangeListener(r12)
            com.arlosoft.macrodroid.constraint.v1 r12 = new com.arlosoft.macrodroid.constraint.v1
            r0 = r12
            r2 = r10
            r3 = r15
            r4 = r30
            r5 = r49
            r6 = r18
            r8 = r16
            r19 = r10
            r10 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.setOnCheckedChangeListener(r12)
            com.arlosoft.macrodroid.constraint.w1 r12 = new com.arlosoft.macrodroid.constraint.w1
            r0 = r12
            r2 = r14
            r4 = r19
            r5 = r16
            r6 = r49
            r7 = r18
            r8 = r17
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r5 = r30
            r5.setOnCheckedChangeListener(r12)
            com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$c r0 = new com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint$c
            r5 = r49
            r0.<init>(r5, r11)
            r5.addTextChangedListener(r0)
            r22.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint.m16737v3(int, java.util.ArrayList):void");
    }

    /* renamed from: w3 */
    private String m16738w3(int i) {
        StringBuilder sb;
        StringBuilder sb2;
        if (i == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("= ");
            sb3.append(SelectableItem.m15535j1(this.m_booleanValue ? C17541R$string.true_label : C17541R$string.false_label));
            return sb3.toString();
        } else if (i != 1) {
            if (i == 2) {
                int i2 = this.m_stringComparisonType;
                if (i2 == 0) {
                    if (this.m_stringEqual) {
                        return "= " + this.m_stringValue;
                    }
                    return "!= " + this.m_stringValue;
                } else if (i2 == 1) {
                    return SelectableItem.m15535j1(C17541R$string.contains).toLowerCase() + " " + this.m_stringValue;
                } else if (i2 == 2) {
                    return SelectableItem.m15535j1(C17541R$string.excludes).toLowerCase() + " " + this.m_stringValue;
                }
            } else if (i == 3) {
                String str = this.m_expression;
                if (str == null) {
                    if (this.m_intCompareVariable) {
                        sb2 = new StringBuilder();
                        sb2.append(this.m_otherValueToCompare.getName());
                        sb2.append(C6520o0.m24912e0(this.compareVarDictionaryKeys));
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("");
                        sb2.append(this.m_doubleValue);
                    }
                    str = sb2.toString();
                }
                if (this.m_intGreaterThan) {
                    return "> " + str;
                } else if (this.m_intLessThan) {
                    return "< " + str;
                } else if (this.m_intNotEqual) {
                    return "!= " + str;
                } else {
                    return "= " + str;
                }
            }
            return "";
        } else {
            String str2 = this.m_expression;
            if (str2 == null) {
                if (this.m_intCompareVariable) {
                    sb = new StringBuilder();
                    sb.append(this.m_otherValueToCompare.getName());
                    sb.append(C6520o0.m24912e0(this.compareVarDictionaryKeys));
                } else {
                    sb = new StringBuilder();
                    sb.append("");
                    sb.append(this.m_intValue);
                }
                str2 = sb.toString();
            }
            if (this.m_intGreaterThan) {
                return "> " + str2;
            } else if (this.m_intLessThan) {
                return "< " + str2;
            } else if (this.m_intNotEqual) {
                return "!= " + str2;
            } else {
                return "= " + str2;
            }
        }
    }

    /* renamed from: x3 */
    private boolean m16739x3(boolean z, boolean z2, boolean z3, String str, String str2) {
        if (z2) {
            return true;
        }
        if (z) {
            return !TextUtils.isEmpty(str);
        }
        try {
            C6451w.m24766b(mo27827K0(), mo27837X0(), str2, (TriggerContextInfo) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static /* synthetic */ void m16740y3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m16741z3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15693A(activity, mo27837X0(), eVar, C17542R$style.Theme_App_Dialog_Constraint_SmallText, (C7967d) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        ArrayList<MacroDroidVariable> A0 = mo27814A0();
        if (this.m_variable != null) {
            for (int i = 0; i < A0.size(); i++) {
                if (A0.get(i).getName().equals(this.m_variable.getName())) {
                    this.selectedIndex = i;
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_stringValue, this.m_expression};
    }

    /* renamed from: H0 */
    public String mo27823H0() {
        return mo24672O0();
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_stringValue = strArr[0];
            this.m_expression = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        Macro macro = this.m_macro;
        if (macro != null && macro.isCompleted() && mo27861q(this.m_variable.getName()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        MacroDroidVariable macroDroidVariable = this.m_variable;
        if (macroDroidVariable == null) {
            return "";
        }
        int S = macroDroidVariable.mo27743S();
        if (S == 4 || S == 5) {
            return this.m_variable.getName() + C6520o0.m24912e0(this.dictionaryKeys) + " " + m16738w3(this.dictionaryType);
        }
        return this.m_variable.getName() + " " + m16738w3(this.m_variable.mo27743S());
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        List list;
        VariableValue variableValue;
        MacroDroidVariable macroDroidVariable;
        MacroDroidVariable macroDroidVariable2;
        double intValue;
        MacroDroidVariable q = mo27861q(this.m_variable.getName());
        if (q == null) {
            C4878b.m18869h("Variable constraint failed, variable not found: " + this.m_variable.getName(), mo27840Y0().longValue());
            return false;
        }
        ArrayList<String> arrayList = null;
        if (mo27837X0() == null) {
            C4878b.m18882u("Checking constraint (" + mo24738G0() + "), macro is null");
            list = this.dictionaryKeys.getKeys();
        } else {
            list = this.dictionaryKeys == null ? null : C6520o0.m24868C(mo27827K0(), this.dictionaryKeys.getKeys(), triggerContextInfo, mo27837X0());
        }
        if (list == null) {
            list = null;
        }
        VariableValue.DictionaryEntry R = q.mo27742R(list, false);
        if (R != null) {
            variableValue = R.getVariable();
        } else if (q.mo27743S() == 4 || q.mo27743S() == 5) {
            C4878b.m18869h("Variable constraint failed, variable not found: " + this.m_variable.getName() + C6520o0.m24912e0(this.dictionaryKeys), mo27840Y0().longValue());
            return false;
        } else {
            variableValue = q.mo27746V();
        }
        if (variableValue == null) {
            C4878b.m18869h("Variable constraint failed, variable not found: " + this.m_variable.getName() + C6520o0.m24912e0(this.dictionaryKeys), mo27840Y0().longValue());
            return false;
        }
        int variableType = variableValue.getVariableType();
        if (variableType != 0) {
            if (variableType != 1) {
                if (variableType == 2) {
                    VariableValue.StringValue stringValue = (VariableValue.StringValue) variableValue;
                    String t0 = C4023j0.m15760t0(mo27827K0(), this.m_stringValue, triggerContextInfo, mo27837X0());
                    String c = C6460y1.m24791c(this.checkCase ? t0 : t0.toLowerCase(), this.enableRegex);
                    if (!this.checkCase) {
                        t0 = t0.toLowerCase();
                    }
                    String b = C6460y1.m24790b(t0, this.enableRegex);
                    int i = this.m_stringComparisonType;
                    if (i == 0) {
                        if (this.m_stringEqual) {
                            return C6460y1.m24792d(this.checkCase ? stringValue.getTextValue() : stringValue.getTextValue().toLowerCase(), c, this.enableRegex);
                        }
                        return !C6460y1.m24792d(this.checkCase ? stringValue.getTextValue() : stringValue.getTextValue().toLowerCase(), c, this.enableRegex);
                    } else if (i == 1) {
                        boolean z = this.checkCase;
                        String textValue = stringValue.getTextValue();
                        if (!z) {
                            textValue = textValue.toLowerCase();
                        }
                        return C6460y1.m24792d(textValue, b, this.enableRegex);
                    } else if (i == 2) {
                        boolean z2 = this.checkCase;
                        String textValue2 = stringValue.getTextValue();
                        if (!z2) {
                            textValue2 = textValue2.toLowerCase();
                        }
                        return !C6460y1.m24792d(textValue2, b, this.enableRegex);
                    }
                } else if (variableType == 3) {
                    VariableValue.DecimalValue decimalValue = (VariableValue.DecimalValue) variableValue;
                    double d = this.m_doubleValue;
                    if (this.m_expression != null) {
                        try {
                            d = C6451w.m24766b(mo27827K0(), mo27837X0(), this.m_expression, triggerContextInfo);
                        } catch (IllegalArgumentException unused) {
                            C4878b.m18869h("Variable constraint checking not working, expression evaluation failed", mo27840Y0().longValue());
                            d = 0.0d;
                        }
                    } else if (this.m_intCompareVariable && (macroDroidVariable2 = this.m_otherValueToCompare) != null) {
                        MacroDroidVariable q2 = mo27861q(macroDroidVariable2.getName());
                        if (q2 != null) {
                            VariableValue V = q2.mo27746V();
                            if (this.compareVarDictionaryKeys != null) {
                                arrayList = C6520o0.m24868C(mo27827K0(), this.compareVarDictionaryKeys.getKeys(), triggerContextInfo, mo27837X0());
                            }
                            VariableValue.DictionaryEntry R2 = q2.mo27742R(arrayList, false);
                            if (R2 != null) {
                                V = R2.getVariable();
                            } else if (V instanceof VariableValue.Dictionary) {
                                C4878b.m18869h("Variable constraint failed, variable not found: " + q2.getName() + C6520o0.m24912e0(this.compareVarDictionaryKeys), mo27840Y0().longValue());
                                return false;
                            }
                            if (V instanceof VariableValue.DecimalValue) {
                                intValue = ((VariableValue.DecimalValue) V).getDecimalValue();
                            } else if (V instanceof VariableValue.IntegerValue) {
                                intValue = (double) ((VariableValue.IntegerValue) V).getIntValue();
                            }
                            d = intValue;
                        } else {
                            C4878b.m18869h("Variable constraint failed, variable not found: " + this.m_otherValueToCompare.getName(), mo27840Y0().longValue());
                            return false;
                        }
                    }
                    if (this.m_intGreaterThan) {
                        if (decimalValue.getDecimalValue() > d) {
                            return true;
                        }
                        return false;
                    } else if (this.m_intLessThan) {
                        if (decimalValue.getDecimalValue() < d) {
                            return true;
                        }
                        return false;
                    } else if (this.m_intNotEqual) {
                        return !C6425s0.m24736a(decimalValue.getDecimalValue(), d);
                    } else {
                        return C6425s0.m24736a(decimalValue.getDecimalValue(), d);
                    }
                }
                return true;
            }
            VariableValue.IntegerValue integerValue = (VariableValue.IntegerValue) variableValue;
            long j = this.m_intValue;
            if (this.m_expression != null) {
                try {
                    j = (long) C6451w.m24766b(mo27827K0(), mo27837X0(), this.m_expression, triggerContextInfo);
                } catch (IllegalArgumentException unused2) {
                    C4878b.m18869h("Variable constraint checking not working, expression evaluation failed", mo27840Y0().longValue());
                    j = 0;
                }
            } else if (this.m_intCompareVariable && (macroDroidVariable = this.m_otherValueToCompare) != null) {
                MacroDroidVariable q3 = mo27861q(macroDroidVariable.getName());
                if (q3 != null) {
                    VariableValue V2 = q3.mo27746V();
                    if (this.compareVarDictionaryKeys != null) {
                        arrayList = C6520o0.m24868C(mo27827K0(), this.compareVarDictionaryKeys.getKeys(), triggerContextInfo, mo27837X0());
                    }
                    VariableValue.DictionaryEntry R3 = q3.mo27742R(arrayList, false);
                    if (R3 != null) {
                        V2 = R3.getVariable();
                    } else if (V2 instanceof VariableValue.Dictionary) {
                        C4878b.m18869h("Variable constraint failed, variable not found: " + q3.getName() + C6520o0.m24912e0(this.compareVarDictionaryKeys), mo27840Y0().longValue());
                        return false;
                    }
                    if (V2 instanceof VariableValue.DecimalValue) {
                        if (this.m_intGreaterThan) {
                            if (((double) integerValue.getIntValue()) > ((VariableValue.DecimalValue) V2).getDecimalValue()) {
                                return true;
                            }
                            return false;
                        } else if (this.m_intLessThan) {
                            if (((double) integerValue.getIntValue()) < ((VariableValue.DecimalValue) V2).getDecimalValue()) {
                                return true;
                            }
                            return false;
                        } else if (this.m_intNotEqual) {
                            if (((double) integerValue.getIntValue()) != ((VariableValue.DecimalValue) V2).getDecimalValue()) {
                                return true;
                            }
                            return false;
                        } else if (((double) integerValue.getIntValue()) == ((VariableValue.DecimalValue) V2).getDecimalValue()) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (V2 instanceof VariableValue.IntegerValue) {
                        j = ((VariableValue.IntegerValue) V2).getIntValue();
                    }
                } else {
                    C4878b.m18869h("Variable constraint failed, variable not found: " + this.m_otherValueToCompare.getName(), mo27840Y0().longValue());
                    return false;
                }
            }
            if (this.m_intGreaterThan) {
                if (integerValue.getIntValue() > j) {
                    return true;
                }
                return false;
            } else if (this.m_intLessThan) {
                if (integerValue.getIntValue() < j) {
                    return true;
                }
                return false;
            } else if (this.m_intNotEqual) {
                if (integerValue.getIntValue() != j) {
                    return true;
                }
                return false;
            } else if (integerValue.getIntValue() == j) {
                return true;
            } else {
                return false;
            }
        } else if (((VariableValue.BooleanValue) variableValue).getBooleanValue() == this.m_booleanValue) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7616h0.m31717u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    @NonNull
    /* renamed from: b */
    public DictionaryKeys[] mo24428b() {
        return new DictionaryKeys[]{this.dictionaryKeys, this.compareVarDictionaryKeys};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        ArrayList<MacroDroidVariable> A0 = mo27814A0();
        if (A0.size() > 0) {
            String[] strArr = new String[A0.size()];
            for (int i = 0; i < A0.size(); i++) {
                strArr[i] = A0.get(i).getName();
            }
            return strArr;
        }
        C15626c.m94876a(mo27827K0().getApplicationContext(), mo27827K0().getString(C17541R$string.constraint_macrodroid_variable_no_variables), 1).show();
        return new String[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.constraint_macrodroid_variable_select);
    }

    /* renamed from: j */
    public List<MacroDroidVariable> mo24437j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.m_variable);
        if (this.m_intCompareVariable) {
            arrayList.add(this.m_otherValueToCompare);
        }
        return arrayList;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 200) + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String[] g1 = mo24676g1();
        if (g1 != null && g1.length > 0) {
            mo27848g0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        MacroDroidVariable macroDroidVariable = mo27814A0().get(this.selectedIndex);
        this.m_variable = macroDroidVariable;
        m16720H3(macroDroidVariable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_variable, i);
        parcel.writeLong(this.m_intValue);
        parcel.writeParcelable(this.m_otherValueToCompare, i);
        parcel.writeInt(this.m_intGreaterThan ? 1 : 0);
        parcel.writeInt(this.m_intLessThan ? 1 : 0);
        parcel.writeInt(this.m_intNotEqual ? 1 : 0);
        parcel.writeInt(this.m_intCompareVariable ? 1 : 0);
        parcel.writeInt(this.m_booleanValue ? 1 : 0);
        parcel.writeString(this.m_stringValue);
        parcel.writeInt(this.m_stringEqual ? 1 : 0);
        parcel.writeDouble(this.m_doubleValue);
        parcel.writeInt(this.m_stringComparisonType);
        parcel.writeString(this.m_expression);
        parcel.writeInt(this.enableRegex ? 1 : 0);
        parcel.writeInt(this.checkCase ? 1 : 0);
        parcel.writeInt(this.dictionaryType);
        parcel.writeParcelable(this.dictionaryKeys, i);
        parcel.writeParcelable(this.compareVarDictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.selectedIndex = i;
    }

    /* renamed from: z */
    public void mo24429z(@NonNull DictionaryKeys[] dictionaryKeysArr) {
        if (dictionaryKeysArr.length >= 2) {
            this.dictionaryKeys = dictionaryKeysArr[0];
            this.compareVarDictionaryKeys = dictionaryKeysArr[1];
        }
    }

    public MacroDroidVariableConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MacroDroidVariableConstraint() {
        this.compareVarDictionaryKeys = null;
        this.dictionaryType = -1;
        this.m_stringEqual = true;
    }

    private MacroDroidVariableConstraint(Parcel parcel) {
        super(parcel);
        this.compareVarDictionaryKeys = null;
        this.dictionaryType = -1;
        this.m_variable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_intValue = parcel.readLong();
        this.m_otherValueToCompare = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        boolean z = true;
        this.m_intGreaterThan = parcel.readInt() != 0;
        this.m_intLessThan = parcel.readInt() != 0;
        this.m_intNotEqual = parcel.readInt() != 0;
        this.m_intCompareVariable = parcel.readInt() != 0;
        this.m_booleanValue = parcel.readInt() != 0;
        this.m_stringValue = parcel.readString();
        this.m_stringEqual = parcel.readInt() != 0;
        this.m_doubleValue = parcel.readDouble();
        this.m_stringComparisonType = parcel.readInt();
        this.m_expression = parcel.readString();
        this.enableRegex = parcel.readInt() != 0;
        this.checkCase = parcel.readInt() == 0 ? false : z;
        this.dictionaryType = parcel.readInt();
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
        this.compareVarDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
