package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.activities.VoiceInputActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p057a2.C2212a;
import p057a2.C2216e;
import p057a2.C2220i;
import p057a2.C2224m;
import p128m0.C7709b5;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

/* compiled from: VoiceInputAction.kt */
public final class VoiceInputAction extends Action implements C2220i, C2212a, C2224m, C2216e {
    public static final Parcelable.Creator<VoiceInputAction> CREATOR = new C2780a();

    /* renamed from: d */
    public static final C2781b f7690d = new C2781b((C13695i) null);
    /* access modifiers changed from: private */
    public DictionaryKeys dictionaryKeys;
    private transient int selectedIndex;
    /* access modifiers changed from: private */
    public String variableName;

    /* renamed from: com.arlosoft.macrodroid.action.VoiceInputAction$a */
    /* compiled from: VoiceInputAction.kt */
    public static final class C2780a implements Parcelable.Creator<VoiceInputAction> {
        C2780a() {
        }

        /* renamed from: a */
        public VoiceInputAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new VoiceInputAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public VoiceInputAction[] newArray(int i) {
            return new VoiceInputAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.VoiceInputAction$b */
    /* compiled from: VoiceInputAction.kt */
    public static final class C2781b {
        private C2781b() {
        }

        public /* synthetic */ C2781b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.VoiceInputAction$c */
    /* compiled from: VoiceInputAction.kt */
    static final class C2782c extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ ArrayList<String> $parentKeys;
        final /* synthetic */ MacroDroidVariable $variable;
        final /* synthetic */ VoiceInputAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2782c(VoiceInputAction voiceInputAction, MacroDroidVariable macroDroidVariable, ArrayList<String> arrayList) {
            super(1);
            this.this$0 = voiceInputAction;
            this.$variable = macroDroidVariable;
            this.$parentKeys = arrayList;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "keyName");
            this.this$0.variableName = this.$variable.getName();
            this.this$0.dictionaryKeys = new DictionaryKeys(C13566b0.m87443r0(this.$parentKeys, str));
            this.this$0.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.VoiceInputAction$d */
    /* compiled from: VoiceInputAction.kt */
    public static final class C2783d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7691a;

        /* renamed from: c */
        final /* synthetic */ EditText f7692c;

        C2783d(Button button, EditText editText) {
            this.f7691a = button;
            this.f7692c = editText;
        }

        public void afterTextChanged(Editable editable) {
            C13706o.m87929f(editable, "s");
            Button button = this.f7691a;
            C13706o.m87926c(button);
            Editable text = this.f7692c.getText();
            C13706o.m87928e(text, "varNameEntry.text");
            button.setEnabled(text.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13706o.m87929f(charSequence, "s");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.VoiceInputAction$e */
    /* compiled from: VoiceInputAction.kt */
    static final class C2784e extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C2784e f7693a = new C2784e();

        C2784e() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
            if (r2.hasStringChildren(r2) != false) goto L_0x0018;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(com.arlosoft.macrodroid.variables.VariableValue r2) {
            /*
                r1 = this;
                java.lang.String r0 = "variableValue"
                kotlin.jvm.internal.C13706o.m87929f(r2, r0)
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.StringValue
                if (r0 != 0) goto L_0x0018
                boolean r0 = r2 instanceof com.arlosoft.macrodroid.variables.VariableValue.Dictionary
                if (r0 == 0) goto L_0x0016
                com.arlosoft.macrodroid.variables.VariableValue$Dictionary r2 = (com.arlosoft.macrodroid.variables.VariableValue.Dictionary) r2
                boolean r2 = r2.hasStringChildren(r2)
                if (r2 == 0) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r2 = 0
                goto L_0x0019
            L_0x0018:
                r2 = 1
            L_0x0019:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.VoiceInputAction.C2784e.invoke(com.arlosoft.macrodroid.variables.VariableValue):java.lang.Boolean");
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.VoiceInputAction$f */
    /* compiled from: VoiceInputAction.kt */
    public static final class C2785f implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f7694a;

        /* renamed from: b */
        final /* synthetic */ VoiceInputAction f7695b;

        /* renamed from: c */
        final /* synthetic */ MacroDroidVariable f7696c;

        /* renamed from: d */
        final /* synthetic */ int f7697d;

        /* renamed from: e */
        final /* synthetic */ VariableValue.Dictionary f7698e;

        /* renamed from: com.arlosoft.macrodroid.action.VoiceInputAction$f$a */
        /* compiled from: VoiceInputAction.kt */
        static final class C2786a extends C13708q implements C16265l<C6520o0.C6523b, C13339u> {
            final /* synthetic */ MacroDroidVariable $variable;
            final /* synthetic */ VoiceInputAction this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2786a(VoiceInputAction voiceInputAction, MacroDroidVariable macroDroidVariable) {
                super(1);
                this.this$0 = voiceInputAction;
                this.$variable = macroDroidVariable;
            }

            /* renamed from: a */
            public final void mo26107a(C6520o0.C6523b bVar) {
                C13706o.m87929f(bVar, "<name for destructuring parameter 0>");
                List<String> a = bVar.mo32706a();
                bVar.mo32707b();
                this.this$0.variableName = this.$variable.getName();
                this.this$0.dictionaryKeys = new DictionaryKeys(a);
                this.this$0.mo24689O1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo26107a((C6520o0.C6523b) obj);
                return C13339u.f61331a;
            }
        }

        C2785f(ArrayList<String> arrayList, VoiceInputAction voiceInputAction, MacroDroidVariable macroDroidVariable, int i, VariableValue.Dictionary dictionary) {
            this.f7694a = arrayList;
            this.f7695b = voiceInputAction;
            this.f7696c = macroDroidVariable;
            this.f7697d = i;
            this.f7698e = dictionary;
        }

        /* renamed from: a */
        public void mo24836a() {
        }

        /* renamed from: b */
        public void mo24837b(List<String> list) {
            Activity j0 = this.f7695b.mo27850j0();
            C13706o.m87928e(j0, "activity");
            MacroDroidVariable macroDroidVariable = this.f7696c;
            VariableValue.Dictionary dictionary = this.f7698e;
            Macro o3 = this.f7695b.m_macro;
            DictionaryKeys n3 = this.f7695b.dictionaryKeys;
            List<String> keys = n3 != null ? n3.getKeys() : null;
            VoiceInputAction voiceInputAction = this.f7695b;
            C6520o0.m24902Z(j0, C17542R$style.Theme_App_Dialog_Action, macroDroidVariable, dictionary, o3, keys, list, false, voiceInputAction, new C2786a(voiceInputAction, this.f7696c));
        }

        /* renamed from: c */
        public void mo24838c() {
        }

        /* renamed from: d */
        public void mo24839d() {
            this.f7695b.m13739s3(this.f7696c, this.f7698e, this.f7694a);
        }

        /* renamed from: e */
        public void mo24840e(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "dictionaryEntry");
            this.f7694a.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VoiceInputAction voiceInputAction = this.f7695b;
                MacroDroidVariable macroDroidVariable = this.f7696c;
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                voiceInputAction.m13745y3(macroDroidVariable, (VariableValue.Dictionary) variable, this.f7694a, this.f7697d + 1);
                return;
            }
            this.f7695b.variableName = this.f7696c.getName();
            this.f7695b.dictionaryKeys = new DictionaryKeys(this.f7694a);
            this.f7695b.mo24689O1();
        }
    }

    public VoiceInputAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ VoiceInputAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m13739s3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList) {
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        C6520o0.m24893Q(j0, mo24688L0(), dictionary, mo27837X0(), new C2782c(this, macroDroidVariable, arrayList));
    }

    /* renamed from: t3 */
    private final void m13740t3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.variable_new_variable_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_set_variable_create);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = appCompatDialog.getWindow();
        C13706o.m87926c(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        Window window2 = appCompatDialog.getWindow();
        C13706o.m87926c(window2);
        window2.setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.variable_new_variable_dialog_name);
        ViewGroup viewGroup = (ViewGroup) appCompatDialog.findViewById(C17532R$id.type_container);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.radio_button_local);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.radio_button_global);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.create_now_check_box);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        C13706o.m87926c(editText);
        editText.addTextChangedListener(new C2783d(button, editText));
        C13706o.m87926c(button);
        button.setOnClickListener(new C2957bq(this, editText, radioButton, appCompatDialog));
        C13706o.m87926c(button2);
        button2.setOnClickListener(new C2929aq(appCompatDialog));
        appCompatDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m13741u3(VoiceInputAction voiceInputAction, EditText editText, RadioButton radioButton, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(voiceInputAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        if (voiceInputAction.mo27837X0().findLocalVariableByName(editText.getText().toString()) != null) {
            voiceInputAction.m13743w3();
            return;
        }
        String obj = editText.getText().toString();
        C13706o.m87926c(radioButton);
        MacroDroidVariable macroDroidVariable = new MacroDroidVariable(2, obj, radioButton.isChecked());
        voiceInputAction.mo27835S(macroDroidVariable);
        voiceInputAction.variableName = macroDroidVariable.getName();
        voiceInputAction.mo24689O1();
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m13742v3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: w3 */
    private final void m13743w3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), C17542R$style.Theme_App_Dialog_Variables);
        builder.setTitle((int) C17541R$string.variable_creation_failed);
        builder.setMessage((int) C17541R$string.variable_already_exists);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) C3663zp.f9713a);
        builder.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m13744x3(DialogInterface dialogInterface, int i) {
        C13706o.m87929f(dialogInterface, "dialog");
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m13745y3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        int i2 = i;
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        String str = (dictionaryKeys2 == null || dictionaryKeys2.getKeys().size() <= i2) ? null : dictionaryKeys2.getKeys().get(i2);
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        C6520o0.m24884K0(j0, C17542R$style.Theme_App_Dialog_Action, dictionary, C2784e.f7693a, str, true, new C6520o0.C6525c(true, (List<String>) null), false, C6520o0.C6538e.DONT_SHOW, true, new C2785f(arrayList, this, macroDroidVariable, i, dictionary));
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return true;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        List<String> keys;
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        if (!(dictionaryKeys2 == null || (keys = dictionaryKeys2.getKeys()) == null)) {
            Object[] array = keys.toArray(new String[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            if (strArr != null) {
                return strArr;
            }
        }
        return new String[0];
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (!(strArr.length == 0)) {
            this.dictionaryKeys = new DictionaryKeys(C13596m.m87610i0(strArr));
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return "➔ " + this.variableName + C6520o0.m24912e0(this.dictionaryKeys);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7709b5.f18671j.mo37745a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.dictionaryKeys;
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.variableName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        ArrayList<MacroDroidVariable> x0 = mo27874x0();
        String[] strArr = new String[(x0.size() + 1)];
        int i = 0;
        strArr[0] = SelectableItem.m15535j1(C17541R$string.new_variable);
        int size = x0.size();
        while (i < size) {
            int i2 = i + 1;
            strArr[i2] = x0.get(i).getName();
            i = i2;
        }
        return strArr;
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        C13706o.m87929f(stack, "skipEndifIndexStack");
        Intent intent = new Intent(mo27827K0(), VoiceInputActivity.class);
        intent.addFlags(268435456);
        Long Y0 = mo27840Y0();
        C13706o.m87928e(Y0, "macroGuid");
        intent.putExtra("MacroGuid", Y0.longValue());
        intent.putExtra("TriggerContextInfo", triggerContextInfo);
        intent.putExtra("NextActionIndex", i);
        intent.putExtra("SkipEndifIndex", stack);
        intent.putExtra("TriggerThatInvoked", mo27837X0().getTriggerThatInvoked());
        intent.putExtra("IsTest", z2);
        intent.putExtra("resume_macro_info", resumeMacroInfo);
        intent.putExtra("variable_name", this.variableName);
        intent.putExtra("dictionary_keys", this.dictionaryKeys);
        mo27827K0().startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        String string = mo27827K0().getString(C17541R$string.action_set_variable_select);
        C13706o.m87928e(string, "context.getString(R.stri…tion_set_variable_select)");
        return string;
    }

    /* renamed from: k */
    public void mo24427k(DictionaryKeys dictionaryKeys2) {
        this.dictionaryKeys = dictionaryKeys2;
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.variableName;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.selectedIndex == 0) {
            m13740t3();
            return;
        }
        ArrayList<MacroDroidVariable> x0 = mo27874x0();
        C13706o.m87928e(x0, "allOutputVariablesWithStrings");
        if (this.selectedIndex > x0.size()) {
            C15626c.makeText(mo27827K0(), C17541R$string.variable_does_not_exit, 0).show();
            return;
        }
        MacroDroidVariable macroDroidVariable = x0.get(this.selectedIndex - 1);
        if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
            m13745y3(x0.get(this.selectedIndex - 1), macroDroidVariable.mo27770n(), new ArrayList(), 0);
            return;
        }
        this.dictionaryKeys = null;
        this.variableName = macroDroidVariable.getName();
        mo24689O1();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.variableName);
        parcel.writeParcelable(this.dictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.selectedIndex = i;
    }

    public VoiceInputAction() {
    }

    private VoiceInputAction(Parcel parcel) {
        super(parcel);
        this.variableName = parcel.readString();
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
