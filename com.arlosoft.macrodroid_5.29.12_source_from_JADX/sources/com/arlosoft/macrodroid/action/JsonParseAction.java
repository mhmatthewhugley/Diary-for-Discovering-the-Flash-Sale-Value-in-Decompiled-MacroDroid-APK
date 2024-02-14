package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
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
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.upgrade.UpgradeActivity2;
import com.arlosoft.macrodroid.utils.C6440u1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import org.json.JSONArray;
import org.json.JSONObject;
import p057a2.C2217f;
import p057a2.C2221j;
import p128m0.C7822q1;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16270q;

/* compiled from: JsonParseAction.kt */
public final class JsonParseAction extends Action implements C2221j, C2217f {
    public static final Parcelable.Creator<JsonParseAction> CREATOR = new C2502a();

    /* renamed from: f */
    public static final C2503b f7320f = new C2503b((C13695i) null);

    /* renamed from: d */
    public transient C4083b f7321d;
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

    /* renamed from: com.arlosoft.macrodroid.action.JsonParseAction$a */
    /* compiled from: JsonParseAction.kt */
    public static final class C2502a implements Parcelable.Creator<JsonParseAction> {
        C2502a() {
        }

        /* renamed from: a */
        public JsonParseAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new JsonParseAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public JsonParseAction[] newArray(int i) {
            return new JsonParseAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonParseAction$b */
    /* compiled from: JsonParseAction.kt */
    public static final class C2503b {
        private C2503b() {
        }

        public /* synthetic */ C2503b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonParseAction$c */
    /* compiled from: JsonParseAction.kt */
    static final class C2504c extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Spinner $dictionaryVarSpinner;
        int label;
        final /* synthetic */ JsonParseAction this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2504c(JsonParseAction jsonParseAction, Spinner spinner, C13635d<? super C2504c> dVar) {
            super(3, dVar);
            this.this$0 = jsonParseAction;
            this.$dictionaryVarSpinner = spinner;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m11120r(JsonParseAction jsonParseAction, Spinner spinner, MacroDroidVariable macroDroidVariable) {
            jsonParseAction.workingDictionaryVariableName = macroDroidVariable.getName();
            jsonParseAction.workingDictionaryKeys = null;
            jsonParseAction.m11107u3(spinner);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                if (this.this$0.mo25260r3().mo28009e().mo28008a()) {
                    Activity j0 = this.this$0.mo27850j0();
                    Spinner spinner = this.$dictionaryVarSpinner;
                    JsonParseAction jsonParseAction = this.this$0;
                    C6440u1.m24747d(j0, spinner, jsonParseAction, C17542R$style.Theme_App_Dialog_Action, 4, new C3136i7(jsonParseAction, spinner));
                } else {
                    C15626c.makeText(this.this$0.mo27827K0(), C17541R$string.pro_version_required, 1).show();
                    this.this$0.mo27850j0().startActivity(new Intent(this.this$0.mo27850j0(), UpgradeActivity2.class));
                }
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: p */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C2504c(this.this$0, this.$dictionaryVarSpinner, dVar).invokeSuspend(C13339u.f61331a);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonParseAction$d */
    /* compiled from: JsonParseAction.kt */
    public static final class C2505d implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ JsonParseAction f7322a;

        C2505d(JsonParseAction jsonParseAction) {
            this.f7322a = jsonParseAction;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7322a.workingStringVariableName = macroDroidVariable.getName();
            this.f7322a.workingStringDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.JsonParseAction$e */
    /* compiled from: JsonParseAction.kt */
    public static final class C2506e implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ JsonParseAction f7323a;

        C2506e(JsonParseAction jsonParseAction) {
            this.f7323a = jsonParseAction;
        }

        /* renamed from: a */
        public void mo24722a(int i, String str) {
            C13706o.m87929f(str, "value");
        }

        /* renamed from: b */
        public void mo24723b(MacroDroidVariable macroDroidVariable, List<String> list) {
            C13706o.m87929f(macroDroidVariable, "variable");
            this.f7323a.workingDictionaryVariableName = macroDroidVariable.getName();
            this.f7323a.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
        }
    }

    public JsonParseAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ JsonParseAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private final void m11096D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38303h(this);
    }

    /* renamed from: q3 */
    private final VariableValue m11104q3(Object obj) {
        if (obj instanceof JSONArray) {
            VariableValue.Dictionary dictionary = new VariableValue.Dictionary(new ArrayList(), true, (List) null, 4, (C13695i) null);
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                List<VariableValue.DictionaryEntry> entries = dictionary.getEntries();
                String valueOf = String.valueOf(i);
                Object obj2 = jSONArray.get(i);
                C13706o.m87928e(obj2, "jsonObject[i]");
                entries.add(new VariableValue.DictionaryEntry(valueOf, m11104q3(obj2), (List) null, 4, (C13695i) null));
            }
            return dictionary;
        } else if (obj instanceof JSONObject) {
            VariableValue.Dictionary dictionary2 = new VariableValue.Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null);
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            C13706o.m87928e(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj3 = jSONObject.get(next);
                C13706o.m87928e(next, "key");
                C13706o.m87928e(obj3, "value");
                dictionary2.getEntries().add(new VariableValue.DictionaryEntry(next, m11104q3(obj3), (List) null, 4, (C13695i) null));
            }
            return dictionary2;
        } else if (obj instanceof Float) {
            return new VariableValue.DecimalValue((double) ((Number) obj).floatValue(), (List) null, 2, (C13695i) null);
        } else {
            if (obj instanceof Double) {
                return new VariableValue.DecimalValue(((Number) obj).doubleValue(), (List) null, 2, (C13695i) null);
            }
            if (obj instanceof Integer) {
                return new VariableValue.IntegerValue(((Integer) obj).longValue(), (List) null, 2, (C13695i) null);
            }
            if (obj instanceof Long) {
                return new VariableValue.IntegerValue(((Number) obj).longValue(), (List) null, 2, (C13695i) null);
            }
            return new VariableValue.StringValue(obj.toString(), (List) null, 2, (C13695i) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m11105s3(Spinner spinner, Spinner spinner2, JsonParseAction jsonParseAction, AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(spinner, "$stringVarSpinner");
        C13706o.m87929f(spinner2, "$dictionaryVarSpinner");
        C13706o.m87929f(jsonParseAction, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        if (spinner.getSelectedItem() != null && spinner2.getSelectedItem() != null) {
            jsonParseAction.stringVarName = jsonParseAction.workingStringVariableName;
            jsonParseAction.stringDictionaryKeys = jsonParseAction.workingStringDictionaryKeys;
            jsonParseAction.dictionaryVarName = jsonParseAction.workingDictionaryVariableName;
            jsonParseAction.dictionaryKeys = jsonParseAction.workingDictionaryKeys;
            jsonParseAction.mo24689O1();
            appCompatDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m11106t3(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m11107u3(Spinner spinner) {
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
        C6520o0.m24878H(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, j, str, new C2506e(this));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        String str = this.stringVarName;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(C6520o0.m24912e0(this.stringDictionaryKeys));
        sb.append(" -> ");
        String str3 = this.dictionaryVarName;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        sb.append(C6520o0.m24912e0(this.dictionaryKeys));
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7822q1.f18855k.mo37766a();
    }

    /* renamed from: a */
    public String[] mo24435a() {
        return new String[]{this.stringVarName, this.dictionaryVarName};
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        MacroDroidVariable q = mo27861q(this.stringVarName);
        MacroDroidVariable q2 = mo27861q(this.dictionaryVarName);
        if (q == null) {
            C4878b.m18868g("Could not get string variable: " + this.stringVarName);
            return;
        }
        String K = q.mo27737K(this.stringDictionaryKeys);
        if (K == null) {
            K = "";
        }
        if (q2 == null) {
            C4878b.m18868g("Could not output to dictionary variable: " + this.dictionaryVarName);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
            VariableValue.Dictionary dictionary = new VariableValue.Dictionary(arrayList, false, dictionaryKeys2 != null ? dictionaryKeys2.getKeys() : null);
            if (C15176v.m93634I(K, "{", false, 2, (Object) null)) {
                JSONObject jSONObject = new JSONObject(K);
                Iterator<String> keys = jSONObject.keys();
                C13706o.m87928e(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    C13706o.m87928e(next, "key");
                    C13706o.m87928e(obj, "value");
                    dictionary.getEntries().add(new VariableValue.DictionaryEntry(next, m11104q3(obj), (List) null, 4, (C13695i) null));
                }
            } else if (C15176v.m93634I(K, "[", false, 2, (Object) null)) {
                JSONArray jSONArray = new JSONArray(K);
                VariableValue.Dictionary dictionary2 = new VariableValue.Dictionary(new ArrayList(), true, (List) null, 4, (C13695i) null);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    List<VariableValue.DictionaryEntry> entries = dictionary2.getEntries();
                    String valueOf = String.valueOf(i);
                    Object obj2 = jSONArray.get(i);
                    C13706o.m87928e(obj2, "jsonArray[i]");
                    entries.add(new VariableValue.DictionaryEntry(valueOf, m11104q3(obj2), (List) null, 4, (C13695i) null));
                }
                dictionary.getEntries().add(new VariableValue.DictionaryEntry("entries", dictionary2, (List) null, 4, (C13695i) null));
            }
            mo27832M2(q2, dictionary);
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

    /* renamed from: r3 */
    public final C4083b mo25260r3() {
        C4083b bVar = this.f7321d;
        if (bVar != null) {
            return bVar;
        }
        C13706o.m87945v("premiumStatusHandler");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String str;
        Activity j0 = mo27850j0();
        C13706o.m87926c(j0);
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_json_parse);
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
        View findViewById3 = appCompatDialog.findViewById(C17532R$id.stringVariableSpinner);
        C13706o.m87926c(findViewById3);
        Spinner spinner = (Spinner) findViewById3;
        View findViewById4 = appCompatDialog.findViewById(C17532R$id.dictionaryVariableSpinner);
        C13706o.m87926c(findViewById4);
        Spinner spinner2 = (Spinner) findViewById4;
        View findViewById5 = appCompatDialog.findViewById(C17532R$id.addDictionaryVariableButton);
        C13706o.m87926c(findViewById5);
        C4666m.m18147o((Button) findViewById5, (C13640g) null, new C2504c(this, spinner2, (C13635d<? super C2504c>) null), 1, (Object) null);
        Activity j02 = mo27850j0();
        C13706o.m87928e(j02, "activity");
        Macro X0 = mo27837X0();
        List j = C13614t.m87748j();
        if (this.dictionaryVarName != null) {
            str = this.stringVarName + C6520o0.m24912e0(this.dictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24881J(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, j, str, false, new C2505d(this));
        m11107u3(spinner2);
        button.setOnClickListener(new C3080g7(spinner, spinner2, this, appCompatDialog));
        button2.setOnClickListener(new C3108h7(appCompatDialog));
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

    public JsonParseAction() {
        m11096D1();
    }

    private JsonParseAction(Parcel parcel) {
        super(parcel);
        m11096D1();
        this.stringVarName = parcel.readString();
        this.dictionaryVarName = parcel.readString();
        this.stringDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
