package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import org.json.JSONArray;
import org.json.JSONObject;
import p057a2.C2217f;
import p057a2.C2221j;
import p128m0.C7815p1;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16254a;
import p370qa.C16270q;

/* compiled from: JsonOutputAction.kt */
public final class JsonOutputAction extends Action implements C2221j, C2217f {
    public static final Parcelable.Creator<JsonOutputAction> CREATOR = new C2495a();

    /* renamed from: d */
    public static final C2496b f7314d = new C2496b((C13695i) null);
    private DictionaryKeys dictionaryKeys;
    private String dictionaryVarName;
    private DictionaryKeys stringDictionaryKeys;
    private String stringVarName;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient String workingDictionaryVariableName;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingStringDictionaryKeys;
    /* access modifiers changed from: private */
    public transient String workingStringVariableName;

    /* renamed from: com.arlosoft.macrodroid.action.JsonOutputAction$a */
    /* compiled from: JsonOutputAction.kt */
    public static final class C2495a implements Parcelable.Creator<JsonOutputAction> {
        C2495a() {
        }

        /* renamed from: a */
        public JsonOutputAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new JsonOutputAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public JsonOutputAction[] newArray(int i) {
            return new JsonOutputAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonOutputAction$b */
    /* compiled from: JsonOutputAction.kt */
    public static final class C2496b {
        private C2496b() {
        }

        public /* synthetic */ C2496b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonOutputAction$c */
    /* compiled from: JsonOutputAction.kt */
    static final class C2497c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Button $okButton;
        final /* synthetic */ Spinner $stringVarSpinner;
        int label;
        final /* synthetic */ JsonOutputAction this$0;

        /* renamed from: com.arlosoft.macrodroid.action.JsonOutputAction$c$a */
        /* compiled from: JsonOutputAction.kt */
        static final class C2498a extends C13708q implements C16254a<C13339u> {
            final /* synthetic */ Button $okButton;
            final /* synthetic */ JsonOutputAction this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2498a(JsonOutputAction jsonOutputAction, Button button) {
                super(0);
                this.this$0 = jsonOutputAction;
                this.$okButton = button;
            }

            public final void invoke() {
                this.this$0.m11076x3(this.$okButton);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2497c(JsonOutputAction jsonOutputAction, Spinner spinner, Button button, C13635d<? super C2497c> dVar) {
            super(3, dVar);
            this.this$0 = jsonOutputAction;
            this.$stringVarSpinner = spinner;
            this.$okButton = button;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m11088r(JsonOutputAction jsonOutputAction, Spinner spinner, Button button, MacroDroidVariable macroDroidVariable) {
            jsonOutputAction.workingStringVariableName = macroDroidVariable.getName();
            jsonOutputAction.workingDictionaryKeys = null;
            jsonOutputAction.m11075w3(spinner, new C2498a(jsonOutputAction, button));
            jsonOutputAction.m11076x3(button);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                Activity j0 = this.this$0.mo27850j0();
                Spinner spinner = this.$stringVarSpinner;
                JsonOutputAction jsonOutputAction = this.this$0;
                C6440u1.m24747d(j0, spinner, jsonOutputAction, C17542R$style.Theme_App_Dialog_Action, 2, new C3052f7(jsonOutputAction, spinner, this.$okButton));
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2497c(this.this$0, this.$stringVarSpinner, this.$okButton, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonOutputAction$d */
    /* compiled from: JsonOutputAction.kt */
    public static final class C2499d implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ JsonOutputAction f7315a;

        /* renamed from: b */
        final /* synthetic */ Button f7316b;

        C2499d(JsonOutputAction jsonOutputAction, Button button) {
            this.f7315a = jsonOutputAction;
            this.f7316b = button;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7315a.workingStringVariableName = macroDroidVariable.getName();
            this.f7315a.workingStringDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
            this.f7315a.m11076x3(this.f7316b);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonOutputAction$e */
    /* compiled from: JsonOutputAction.kt */
    public static final class C2500e implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ JsonOutputAction f7317a;

        C2500e(JsonOutputAction jsonOutputAction) {
            this.f7317a = jsonOutputAction;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7317a.workingDictionaryVariableName = macroDroidVariable.getName();
            this.f7317a.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonOutputAction$f */
    /* compiled from: JsonOutputAction.kt */
    public static final class C2501f implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ JsonOutputAction f7318a;

        /* renamed from: b */
        final /* synthetic */ C16254a<C13339u> f7319b;

        C2501f(JsonOutputAction jsonOutputAction, C16254a<C13339u> aVar) {
            this.f7318a = jsonOutputAction;
            this.f7319b = aVar;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7318a.workingStringVariableName = macroDroidVariable.getName();
            this.f7318a.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
            this.f7319b.invoke();
        }
    }

    public JsonOutputAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ JsonOutputAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: r3 */
    private final JSONObject m11070r3(List<VariableValue.DictionaryEntry> list) {
        Object obj;
        HashMap hashMap = new HashMap();
        for (VariableValue.DictionaryEntry next : list) {
            VariableValue variable = next.getVariable();
            String key = next.getKey();
            if (variable instanceof VariableValue.StringValue) {
                obj = ((VariableValue.StringValue) variable).getTextValue();
            } else if (variable instanceof VariableValue.IntegerValue) {
                obj = Long.valueOf(((VariableValue.IntegerValue) variable).getIntValue());
            } else if (variable instanceof VariableValue.DecimalValue) {
                obj = Double.valueOf(((VariableValue.DecimalValue) variable).getDecimalValue());
            } else if (variable instanceof VariableValue.BooleanValue) {
                obj = Boolean.valueOf(((VariableValue.BooleanValue) variable).getBooleanValue());
            } else if (variable instanceof VariableValue.Dictionary) {
                VariableValue.Dictionary dictionary = (VariableValue.Dictionary) variable;
                obj = dictionary.isArray() ? m11071s3(dictionary.getEntries()) : m11070r3(dictionary.getEntries());
            } else {
                obj = "";
            }
            hashMap.put(key, obj);
        }
        return new JSONObject(hashMap);
    }

    /* renamed from: s3 */
    private final JSONArray m11071s3(List<VariableValue.DictionaryEntry> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (VariableValue.DictionaryEntry variable : list) {
            VariableValue variable2 = variable.getVariable();
            if (variable2 instanceof VariableValue.StringValue) {
                obj = ((VariableValue.StringValue) variable2).getTextValue();
            } else if (variable2 instanceof VariableValue.IntegerValue) {
                obj = Long.valueOf(((VariableValue.IntegerValue) variable2).getIntValue());
            } else if (variable2 instanceof VariableValue.DecimalValue) {
                obj = Double.valueOf(((VariableValue.DecimalValue) variable2).getDecimalValue());
            } else if (variable2 instanceof VariableValue.BooleanValue) {
                obj = Boolean.valueOf(((VariableValue.BooleanValue) variable2).getBooleanValue());
            } else if (variable2 instanceof VariableValue.Dictionary) {
                VariableValue.Dictionary dictionary = (VariableValue.Dictionary) variable2;
                obj = dictionary.isArray() ? m11071s3(dictionary.getEntries()) : m11070r3(dictionary.getEntries());
            } else {
                obj = "";
            }
            arrayList.add(obj);
        }
        return new JSONArray(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m11072t3(Spinner spinner, Spinner spinner2, JsonOutputAction jsonOutputAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(spinner, "$stringVarSpinner");
        C13706o.m87929f(spinner2, "$dictionaryVarSpinner");
        C13706o.m87929f(jsonOutputAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        if (spinner.getSelectedItem() != null && spinner2.getSelectedItem() != null) {
            jsonOutputAction.stringVarName = jsonOutputAction.workingStringVariableName;
            jsonOutputAction.stringDictionaryKeys = jsonOutputAction.workingStringDictionaryKeys;
            jsonOutputAction.dictionaryVarName = jsonOutputAction.workingDictionaryVariableName;
            jsonOutputAction.dictionaryKeys = jsonOutputAction.workingDictionaryKeys;
            jsonOutputAction.mo24689O1();
            appCompatDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m11073u3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: v3 */
    private final void m11074v3(Spinner spinner) {
        String str;
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        Macro X0 = mo27837X0();
        List j = C13614t.m87748j();
        if (this.workingDictionaryVariableName != null) {
            str = this.workingDictionaryVariableName + C6520o0.m24912e0(this.dictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24876G(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, j, str, new C2500e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final void m11075w3(Spinner spinner, C16254a<C13339u> aVar) {
        String str;
        List e = mo27875y0().isEmpty() ? C13612s.m87736e(SelectableItem.m15535j1(C17541R$string.action_set_variable_select)) : C13614t.m87748j();
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        Macro X0 = mo27837X0();
        if (this.workingStringVariableName != null) {
            str = this.workingStringVariableName + C6520o0.m24912e0(this.dictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24881J(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, e, str, true, new C2501f(this, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m11076x3(Button button) {
        button.setEnabled(this.workingStringVariableName != null);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        String str = this.dictionaryVarName;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(C6520o0.m24912e0(this.dictionaryKeys));
        sb.append(" -> ");
        String str3 = this.stringVarName;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        sb.append(C6520o0.m24912e0(this.stringDictionaryKeys));
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7815p1.f18845j.mo37765a();
    }

    /* renamed from: a */
    public String[] mo24435a() {
        return new String[]{this.stringVarName, this.dictionaryVarName};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String str;
        MacroDroidVariable q = mo27861q(this.stringVarName);
        MacroDroidVariable q2 = mo27861q(this.dictionaryVarName);
        if (q == null) {
            C4878b.m18868g("Could not get string variable: " + this.stringVarName);
            return;
        }
        q.mo27737K(this.stringDictionaryKeys);
        if (q2 == null) {
            C4878b.m18868g("Could not output to dictionary variable: " + this.dictionaryVarName);
            return;
        }
        try {
            if (q2.mo27770n().isArray()) {
                str = m11071s3(q2.mo27770n().getEntries()).toString();
            } else {
                str = m11070r3(q2.mo27770n().getEntries()).toString();
            }
            C13706o.m87928e(str, "if (dictionaryVariable.d…g()\n                    }");
            mo27832M2(q, new VariableValue.StringValue(str, (List) null, 2, (C13695i) null));
        } catch (Exception e) {
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h("Could not parse JSON string: " + e, Y0.longValue());
        }
    }

    /* renamed from: b */
    public DictionaryKeys[] mo24428b() {
        return new DictionaryKeys[]{this.stringDictionaryKeys, this.dictionaryKeys};
    }

    /* renamed from: e */
    public void mo24436e(String[] strArr) {
        C13706o.m87929f(strArr, "varNames");
        if (strArr.length == 2) {
            this.stringVarName = strArr[0];
            this.dictionaryVarName = strArr[1];
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_json_output);
        appCompatDialog.setTitle((int) C17541R$string.action_json_parse);
        C4656c.m18114c(appCompatDialog, 0);
        this.workingStringVariableName = this.stringVarName;
        this.workingStringDictionaryKeys = this.stringDictionaryKeys;
        this.workingDictionaryVariableName = this.dictionaryVarName;
        this.workingDictionaryKeys = this.dictionaryKeys;
        View findViewById = appCompatDialog.findViewById(C17532R$id.okButton);
        C13706o.m87926c(findViewById);
        Button button = (Button) findViewById;
        View findViewById2 = appCompatDialog.findViewById(C17532R$id.cancelButton);
        C13706o.m87926c(findViewById2);
        Button button2 = (Button) findViewById2;
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.dictionaryVariableSpinner);
        C13706o.m87926c(findViewById3);
        Spinner spinner = (Spinner) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.stringVariableSpinner);
        C13706o.m87926c(findViewById4);
        Spinner spinner2 = (Spinner) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.addStringVariableButton);
        C13706o.m87926c(findViewById5);
        String str = null;
        C4666m.m18147o((Button) findViewById5, (C13640g) null, new C2497c(this, spinner2, button, (C13635d<? super C2497c>) null), 1, (Object) null);
        List e = mo27875y0().isEmpty() ? C13612s.m87736e(SelectableItem.m15535j1(C17541R$string.action_set_variable_select)) : C13614t.m87748j();
        m11076x3(button);
        Activity j02 = mo27850j0();
        C13706o.m87928e(j02, "activity");
        Macro X0 = mo27837X0();
        if (this.dictionaryVarName != null) {
            str = this.stringVarName + C6520o0.m24912e0(this.dictionaryKeys);
        }
        C6520o0.m24881J(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner2, X0, e, str, true, new C2499d(this, button));
        m11074v3(spinner);
        if (spinner.getCount() == 0) {
            C15626c.makeText(mo27850j0(), C17541R$string.no_dictionary_or_array_variables_defined, 1).show();
            return;
        }
        button.setOnClickListener(new C2994d7(spinner2, spinner, this, appCompatDialog));
        button2.setOnClickListener(new C3023e7(appCompatDialog));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.stringVarName);
        parcel.writeString(this.dictionaryVarName);
        parcel.writeParcelable(this.stringDictionaryKeys, i);
        parcel.writeParcelable(this.dictionaryKeys, i);
    }

    /* renamed from: z */
    public void mo24429z(DictionaryKeys[] dictionaryKeysArr) {
        C13706o.m87929f(dictionaryKeysArr, "dictionaryKeys");
        if (dictionaryKeysArr.length >= 2) {
            this.stringDictionaryKeys = dictionaryKeysArr[0];
            this.dictionaryKeys = dictionaryKeysArr[1];
        }
    }

    public JsonOutputAction() {
    }

    private JsonOutputAction(Parcel parcel) {
        super(parcel);
        this.stringVarName = parcel.readString();
        this.dictionaryVarName = parcel.readString();
        this.stringDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
