package com.arlosoft.macrodroid.common;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.events.VariableUpdatedEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import org.apache.commons.p353io.IOUtils;
import p161s1.C10180a;
import p181w0.C10327b;
import p370qa.C16265l;

/* compiled from: MacroDroidVariable.kt */
public final class MacroDroidVariable implements Parcelable, Comparable<MacroDroidVariable> {
    public static final Parcelable.Creator<MacroDroidVariable> CREATOR = new C3983a();
    private static final int MAX_CHARS_STRING = 500000;

    /* renamed from: c */
    public static final C3984b f10326c = new C3984b((C13695i) null);
    @C10327b

    /* renamed from: a */
    private int f10327a;
    @C10327b

    /* renamed from: b */
    private int f10328b;
    private VariableValue.Dictionary dictionary;
    private boolean isActionBlockWorkingVar;
    @SerializedName(alternate = {"isLocal"}, value = "isLocalVar")
    private boolean isLocalVar;
    private boolean m_booleanValue;
    private double m_decimalValue;
    private long m_intValue;
    private String m_name;
    private String m_stringValue;
    private int m_type;
    private boolean supportsInput;
    @SerializedName(alternate = {"supportOutput"}, value = "supportsOutput")
    private boolean supportsOutput;

    /* renamed from: com.arlosoft.macrodroid.common.MacroDroidVariable$a */
    /* compiled from: MacroDroidVariable.kt */
    public static final class C3983a implements Parcelable.Creator<MacroDroidVariable> {
        C3983a() {
        }

        /* renamed from: a */
        public MacroDroidVariable createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new MacroDroidVariable(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public MacroDroidVariable[] newArray(int i) {
            return new MacroDroidVariable[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.MacroDroidVariable$b */
    /* compiled from: MacroDroidVariable.kt */
    public static final class C3984b {
        private C3984b() {
        }

        public /* synthetic */ C3984b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final String mo27785a(String str) {
            C13706o.m87929f(str, "keyName");
            if (C15176v.m93634I(str, "<[_array_]>", false, 2, (Object) null)) {
                String substring = str.substring(11);
                C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            } else if (!C15176v.m93634I(str, "_A_", false, 2, (Object) null)) {
                return str;
            } else {
                String substring2 = str.substring(3);
                C13706o.m87928e(substring2, "this as java.lang.String).substring(startIndex)");
                return substring2;
            }
        }

        /* renamed from: b */
        public final String mo27786b(Context context, int i) {
            C13706o.m87929f(context, "context");
            if (i < 0) {
                return "";
            }
            return C6520o0.m24920i0(context).get(i);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.MacroDroidVariable$c */
    /* compiled from: MacroDroidVariable.kt */
    static final class C3985c extends C13708q implements C16265l<VariableValue.DictionaryEntry, CharSequence> {

        /* renamed from: a */
        public static final C3985c f10329a = new C3985c();

        C3985c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "it");
            return '[' + dictionaryEntry.getKey() + "]: " + dictionaryEntry.getVariable().getValueAsText();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.common.MacroDroidVariable$d */
    /* compiled from: MacroDroidVariable.kt */
    static final class C3986d extends C13708q implements C16265l<VariableValue.DictionaryEntry, CharSequence> {

        /* renamed from: a */
        public static final C3986d f10330a = new C3986d();

        C3986d() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "it");
            return '[' + dictionaryEntry.getKey() + "]: " + dictionaryEntry.getVariable().getValueAsText();
        }
    }

    public MacroDroidVariable() {
        this.m_stringValue = "";
        this.m_name = "";
        this.dictionary = new VariableValue.Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null);
        this.supportsInput = true;
        this.supportsOutput = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MacroDroidVariable(int i, String str) {
        this(i, str, false, 4, (C13695i) null);
        C13706o.m87929f(str, "name");
    }

    public /* synthetic */ MacroDroidVariable(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: G */
    private final Double m15413G(List<String> list) {
        if (list == null || list.isEmpty()) {
            return Double.valueOf(mo27766l());
        }
        VariableValue.DictionaryEntry R = mo27742R(list, false);
        if (R != null && (R.getVariable() instanceof VariableValue.DecimalValue)) {
            VariableValue variable = R.getVariable();
            C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.DecimalValue");
            return Double.valueOf(((VariableValue.DecimalValue) variable).getDecimalValue());
        } else if (R == null || !(R.getVariable() instanceof VariableValue.IntegerValue)) {
            return null;
        } else {
            VariableValue variable2 = R.getVariable();
            C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.IntegerValue");
            return Double.valueOf((double) ((VariableValue.IntegerValue) variable2).getIntValue());
        }
    }

    /* renamed from: d */
    private final boolean m15414d(VariableValue.Dictionary dictionary2) {
        for (VariableValue.DictionaryEntry dictionaryEntry : dictionary2.getEntries()) {
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                if (((VariableValue.Dictionary) variable).isArray()) {
                    return true;
                }
            }
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable2 = dictionaryEntry.getVariable();
                C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                if (m15414d((VariableValue.Dictionary) variable2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m15415e(VariableValue.Dictionary dictionary2) {
        for (VariableValue.DictionaryEntry dictionaryEntry : dictionary2.getEntries()) {
            if (dictionaryEntry.getVariable() instanceof VariableValue.BooleanValue) {
                return true;
            }
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                if (m15415e((VariableValue.Dictionary) variable)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m15416f(VariableValue.Dictionary dictionary2) {
        for (VariableValue.DictionaryEntry dictionaryEntry : dictionary2.getEntries()) {
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                if (!((VariableValue.Dictionary) variable).isArray()) {
                    return true;
                }
            }
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable2 = dictionaryEntry.getVariable();
                C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                if (m15416f((VariableValue.Dictionary) variable2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private final boolean m15417g(VariableValue.Dictionary dictionary2) {
        for (VariableValue.DictionaryEntry dictionaryEntry : dictionary2.getEntries()) {
            if (!(dictionaryEntry.getVariable() instanceof VariableValue.IntegerValue) && !(dictionaryEntry.getVariable() instanceof VariableValue.DecimalValue)) {
                if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                    VariableValue variable = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    if (m15417g((VariableValue.Dictionary) variable)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private final void m15418g0(VariableValue variableValue, VariableValue.DictionaryEntry dictionaryEntry) {
        if (variableValue.getParentKeys() != null && dictionaryEntry != null) {
            if (variableValue instanceof VariableValue.BooleanValue) {
                dictionaryEntry.setVariable(new VariableValue.BooleanValue(((VariableValue.BooleanValue) variableValue).getBooleanValue(), (List) null, 2, (C13695i) null));
            } else if (variableValue instanceof VariableValue.IntegerValue) {
                dictionaryEntry.setVariable(new VariableValue.IntegerValue(((VariableValue.IntegerValue) variableValue).getIntValue(), (List) null, 2, (C13695i) null));
            } else if (variableValue instanceof VariableValue.StringValue) {
                dictionaryEntry.setVariable(new VariableValue.StringValue(((VariableValue.StringValue) variableValue).getTextValue(), (List) null, 2, (C13695i) null));
            } else if (variableValue instanceof VariableValue.DecimalValue) {
                dictionaryEntry.setVariable(new VariableValue.DecimalValue(((VariableValue.DecimalValue) variableValue).getDecimalValue(), (List) null, 2, (C13695i) null));
            } else if (variableValue instanceof VariableValue.Dictionary) {
                dictionaryEntry.setVariable(new VariableValue.Dictionary(((VariableValue.Dictionary) variableValue).getEntries(), false, (List) null, 6, (C13695i) null));
            }
        }
    }

    /* renamed from: i */
    private final boolean m15419i(VariableValue.Dictionary dictionary2) {
        for (VariableValue.DictionaryEntry dictionaryEntry : dictionary2.getEntries()) {
            if (dictionaryEntry.getVariable() instanceof VariableValue.StringValue) {
                return true;
            }
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                if (m15419i((VariableValue.Dictionary) variable)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public static /* synthetic */ VariableValue.Dictionary m15420r(MacroDroidVariable macroDroidVariable, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return macroDroidVariable.mo27772q(list, z);
    }

    /* renamed from: A */
    public final long mo27731A() {
        if (this.m_type == 3) {
            return (long) this.m_decimalValue;
        }
        return this.m_intValue;
    }

    /* renamed from: C */
    public final Long mo27732C(DictionaryKeys dictionaryKeys) {
        if (dictionaryKeys == null) {
            return Long.valueOf(mo27731A());
        }
        return mo27733E(dictionaryKeys.getKeys());
    }

    /* renamed from: E */
    public final Long mo27733E(List<String> list) {
        if (list == null || list.isEmpty()) {
            return Long.valueOf(mo27731A());
        }
        VariableValue.DictionaryEntry R = mo27742R(list, false);
        if ((R != null ? R.getVariable() : null) == null) {
            C4878b.m18868g("No entry for keys: " + list);
        } else if (R.getVariable() instanceof VariableValue.IntegerValue) {
            VariableValue variable = R.getVariable();
            C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.IntegerValue");
            return Long.valueOf(((VariableValue.IntegerValue) variable).getIntValue());
        } else if (R.getVariable() instanceof VariableValue.DecimalValue) {
            VariableValue variable2 = R.getVariable();
            C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.DecimalValue");
            return Long.valueOf((long) ((VariableValue.DecimalValue) variable2).getDecimalValue());
        }
        return null;
    }

    /* renamed from: F */
    public final Double mo27734F(DictionaryKeys dictionaryKeys) {
        return m15413G(dictionaryKeys != null ? dictionaryKeys.getKeys() : null);
    }

    /* renamed from: H */
    public final String mo27735H() {
        if (this.m_type != 0) {
            return toString();
        }
        return "" + this.m_booleanValue;
    }

    /* renamed from: I */
    public final String mo27736I() {
        String str = this.m_stringValue;
        if (!C15177w.m93663N(str, "[lv=" + this.m_name + ']', false, 2, (Object) null)) {
            String str2 = this.m_stringValue;
            if (!C15177w.m93663N(str2, "[v=" + getName() + ']', false, 2, (Object) null)) {
                String t0 = C4023j0.m15760t0(MacroDroidApplication.f9883I.mo27303b(), this.m_stringValue, (TriggerContextInfo) null, (Macro) null);
                C13706o.m87928e(t0, "{\n            MagicText.…ue, null, null)\n        }");
                return t0;
            }
        }
        return this.m_stringValue;
    }

    /* renamed from: K */
    public final String mo27737K(DictionaryKeys dictionaryKeys) {
        if (dictionaryKeys == null) {
            return mo27736I();
        }
        return mo27738L(dictionaryKeys.getKeys());
    }

    /* renamed from: L */
    public final String mo27738L(List<String> list) {
        if (list == null || list.isEmpty()) {
            return mo27736I();
        }
        VariableValue.DictionaryEntry R = mo27742R(list, false);
        if (R == null || !(R.getVariable() instanceof VariableValue.StringValue)) {
            return null;
        }
        VariableValue variable = R.getVariable();
        C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.StringValue");
        return ((VariableValue.StringValue) variable).getTextValue();
    }

    /* renamed from: N */
    public final String mo27739N() {
        return this.m_stringValue;
    }

    /* renamed from: P */
    public final boolean mo27740P() {
        return this.supportsInput;
    }

    /* renamed from: Q */
    public final boolean mo27741Q() {
        return this.supportsOutput;
    }

    /* renamed from: R */
    public final VariableValue.DictionaryEntry mo27742R(List<String> list, boolean z) {
        List<String> list2 = list;
        if (list2 == null || list.isEmpty()) {
            return null;
        }
        VariableValue.Dictionary dictionary2 = this.dictionary;
        VariableValue.DictionaryEntry dictionaryEntry = null;
        for (int i = 0; i < list.size(); i++) {
            C3984b bVar = f10326c;
            VariableValue.DictionaryEntry entry = dictionary2.getEntry(bVar.mo27785a(list2.get(i)));
            if (entry != null) {
                dictionaryEntry = entry;
            } else if (!z) {
                return null;
            } else {
                if (C15176v.m93634I(list2.get(i), "<[_array_]>", false, 2, (Object) null) || C15176v.m93634I(list2.get(i), "_A_", false, 2, (Object) null)) {
                    dictionaryEntry = new VariableValue.DictionaryEntry(bVar.mo27785a(list2.get(i)), new VariableValue.Dictionary(new ArrayList(), true, (List) null, 4, (C13695i) null), (List) null, 4, (C13695i) null);
                } else {
                    dictionaryEntry = new VariableValue.DictionaryEntry(list2.get(i), new VariableValue.Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null), (List) null, 4, (C13695i) null);
                }
                dictionary2.setEntry(dictionaryEntry);
            }
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                dictionary2 = (VariableValue.Dictionary) variable;
            }
        }
        return dictionaryEntry;
    }

    /* renamed from: S */
    public final int mo27743S() {
        int i = this.f10327a;
        if (i != 0) {
            this.m_type = i;
            this.f10327a = 0;
        } else {
            int i2 = this.f10328b;
            if (i2 != 0) {
                this.m_type = i2;
                this.f10328b = 0;
            }
        }
        return this.m_type;
    }

    /* renamed from: T */
    public final String mo27744T(Context context) {
        C13706o.m87929f(context, "context");
        return C6520o0.m24920i0(context).get(mo27743S());
    }

    /* renamed from: U */
    public final int mo27745U() {
        return (int) mo27731A();
    }

    /* renamed from: V */
    public final VariableValue mo27746V() {
        int S = mo27743S();
        if (S == 0) {
            return new VariableValue.BooleanValue(mo27762j(), (List) null, 2, (C13695i) null);
        }
        if (S == 1) {
            return new VariableValue.IntegerValue(mo27731A(), (List) null, 2, (C13695i) null);
        }
        if (S == 2) {
            return new VariableValue.StringValue(mo27736I(), (List) null, 2, (C13695i) null);
        }
        if (S == 3) {
            return new VariableValue.DecimalValue(mo27766l(), (List) null, 2, (C13695i) null);
        }
        if (S == 4 || S == 5) {
            return this.dictionary;
        }
        throw new IllegalArgumentException("Invalid variable type: " + mo27743S());
    }

    /* renamed from: W */
    public final boolean mo27747W() {
        return this.isActionBlockWorkingVar;
    }

    /* renamed from: X */
    public final boolean mo27748X() {
        return this.m_type == 5;
    }

    /* renamed from: Y */
    public final boolean mo27749Y() {
        return this.m_type == 0;
    }

    /* renamed from: Z */
    public final boolean mo27750Z() {
        return this.m_type == 3;
    }

    /* renamed from: a0 */
    public final boolean mo27751a0() {
        return this.m_type == 4;
    }

    /* renamed from: b */
    public int compareTo(MacroDroidVariable macroDroidVariable) {
        C13706o.m87929f(macroDroidVariable, "other");
        return this.m_name.compareTo(macroDroidVariable.getName());
    }

    /* renamed from: b0 */
    public final boolean mo27753b0() {
        return this.m_type == 1;
    }

    /* renamed from: c0 */
    public final boolean mo27754c0() {
        return this.isLocalVar;
    }

    /* renamed from: d0 */
    public final boolean mo27756d0() {
        return this.m_type == 2;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public final void mo27758e0(VariableValue.Dictionary dictionary2) {
        C13706o.m87929f(dictionary2, "<set-?>");
        this.dictionary = dictionary2;
    }

    public final String getName() {
        return this.m_name;
    }

    /* renamed from: h0 */
    public final void mo27760h0(boolean z) {
        this.isActionBlockWorkingVar = z;
    }

    /* renamed from: i0 */
    public final void mo27761i0(boolean z) {
        this.supportsInput = z;
        this.supportsOutput = !z;
    }

    /* renamed from: j */
    public final boolean mo27762j() {
        return this.m_booleanValue;
    }

    /* renamed from: j0 */
    public final void mo27763j0(boolean z) {
        this.isLocalVar = z;
    }

    /* renamed from: k */
    public final boolean mo27764k(List<String> list) {
        if (list == null || list.isEmpty()) {
            return mo27762j();
        }
        VariableValue.DictionaryEntry R = mo27742R(list, false);
        if (R == null || !(R.getVariable() instanceof VariableValue.BooleanValue)) {
            return false;
        }
        VariableValue variable = R.getVariable();
        C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.BooleanValue");
        return ((VariableValue.BooleanValue) variable).getBooleanValue();
    }

    /* renamed from: k0 */
    public final void mo27765k0(String str) {
        C13706o.m87929f(str, "newName");
        this.m_name = str;
    }

    /* renamed from: l */
    public final double mo27766l() {
        if (this.m_type == 1) {
            return (double) this.m_intValue;
        }
        return this.m_decimalValue;
    }

    /* renamed from: l0 */
    public final void mo27767l0(VariableValue variableValue, boolean z, VariableValue variableValue2, Macro macro) {
        C13706o.m87929f(variableValue, "variableValue");
        String name = getName();
        List<String> parentKeys = variableValue.getParentKeys();
        if (!(parentKeys == null || parentKeys.isEmpty())) {
            List<String> parentKeys2 = variableValue.getParentKeys();
            C13706o.m87926c(parentKeys2);
            VariableValue.DictionaryEntry R = mo27742R(parentKeys2, true);
            List<String> parentKeys3 = variableValue.getParentKeys();
            C13706o.m87926c(parentKeys3);
            for (String str : parentKeys3) {
                name = name + '[' + str + ']';
            }
            m15418g0(variableValue, R);
        } else if (variableValue instanceof VariableValue.BooleanValue) {
            this.m_booleanValue = ((VariableValue.BooleanValue) variableValue).getBooleanValue();
        } else if (variableValue instanceof VariableValue.IntegerValue) {
            this.m_intValue = ((VariableValue.IntegerValue) variableValue).getIntValue();
        } else if (variableValue instanceof VariableValue.StringValue) {
            this.m_stringValue = ((VariableValue.StringValue) variableValue).getTextValue();
        } else if (variableValue instanceof VariableValue.DecimalValue) {
            this.m_decimalValue = ((VariableValue.DecimalValue) variableValue).getDecimalValue();
        } else if (variableValue instanceof VariableValue.Dictionary) {
            this.dictionary = (VariableValue.Dictionary) variableValue;
        }
        String str2 = name;
        if (z && variableValue2 != null) {
            C4878b.m18878q(str2, variableValue2.getValueAsText(), variableValue.getValueAsText(), macro != null ? macro.getGUID() : 0, this.isLocalVar);
        }
        C10180a.m40075a().mo80018i(new VariableUpdatedEvent());
    }

    /* renamed from: m */
    public final Double mo27768m(List<String> list) {
        if (list == null || list.isEmpty()) {
            return Double.valueOf(mo27766l());
        }
        VariableValue.DictionaryEntry R = mo27742R(list, false);
        if (R == null || !(R.getVariable() instanceof VariableValue.DecimalValue)) {
            return null;
        }
        VariableValue variable = R.getVariable();
        C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.DecimalValue");
        return Double.valueOf(((VariableValue.DecimalValue) variable).getDecimalValue());
    }

    /* renamed from: m0 */
    public final String mo27769m0() {
        int i = this.m_type;
        if (i == 0) {
            String string = MacroDroidApplication.f9883I.mo27303b().getString(this.m_booleanValue ? C17541R$string.true_label : C17541R$string.false_label);
            C13706o.m87928e(string, "MacroDroidApplication.in…lse R.string.false_label)");
            return string;
        } else if (i == 1) {
            return "" + this.m_intValue;
        } else if (i == 2) {
            return mo27739N();
        } else {
            if (i == 3) {
                return "" + this.m_decimalValue;
            } else if (i == 4 || i == 5) {
                return C13566b0.m87432g0(this.dictionary.getEntriesSorted(), IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C3986d.f10330a, 30, (Object) null);
            } else {
                return "";
            }
        }
    }

    /* renamed from: n */
    public final VariableValue.Dictionary mo27770n() {
        return this.dictionary;
    }

    /* renamed from: o */
    public final VariableValue.DictionaryEntry mo27771o(List<String> list) {
        C13706o.m87929f(list, "keyList");
        VariableValue.Dictionary dictionary2 = this.dictionary;
        for (String entry : list) {
            VariableValue.DictionaryEntry entry2 = dictionary2.getEntry(entry);
            if (entry2 == null || !(entry2.getVariable() instanceof VariableValue.Dictionary)) {
                return entry2;
            }
            VariableValue variable = entry2.getVariable();
            C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
            dictionary2 = (VariableValue.Dictionary) variable;
        }
        return null;
    }

    /* renamed from: q */
    public final VariableValue.Dictionary mo27772q(List<String> list, boolean z) {
        C13706o.m87929f(list, "keyList");
        if (list.isEmpty()) {
            return this.dictionary;
        }
        VariableValue.DictionaryEntry R = mo27742R(list, z);
        if (R == null || !(R.getVariable() instanceof VariableValue.Dictionary)) {
            return new VariableValue.Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null);
        }
        VariableValue variable = R.getVariable();
        C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
        return (VariableValue.Dictionary) variable;
    }

    /* renamed from: s */
    public final boolean mo27773s() {
        int i = this.m_type;
        if (i == 4 || i == 5) {
            return m15414d(this.dictionary);
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo27774t() {
        int i = this.m_type;
        if (i == 4 || i == 5) {
            return m15415e(this.dictionary);
        }
        return false;
    }

    public String toString() {
        int i = this.m_type;
        if (i == 0) {
            String string = MacroDroidApplication.f9883I.mo27303b().getString(this.m_booleanValue ? C17541R$string.true_label : C17541R$string.false_label);
            C13706o.m87928e(string, "MacroDroidApplication.in…lse R.string.false_label)");
            return string;
        } else if (i == 1) {
            return "" + this.m_intValue;
        } else if (i == 2) {
            return mo27736I();
        } else {
            if (i == 3) {
                return "" + this.m_decimalValue;
            } else if (i == 4 || i == 5) {
                return C13566b0.m87432g0(this.dictionary.getEntriesSorted(), IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C3985c.f10329a, 30, (Object) null);
            } else {
                return "";
            }
        }
    }

    /* renamed from: v */
    public final boolean mo27776v() {
        int i = this.m_type;
        if (i == 4 || i == 5) {
            return m15416f(this.dictionary);
        }
        return false;
    }

    /* renamed from: w */
    public final boolean mo27777w() {
        int i = this.m_type;
        if (i == 4 || i == 5) {
            return m15417g(this.dictionary);
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeInt(this.m_type);
        parcel.writeLong(this.m_intValue);
        parcel.writeInt(this.m_booleanValue ? 1 : 0);
        parcel.writeString(this.m_stringValue);
        parcel.writeString(this.m_name);
        parcel.writeDouble(this.m_decimalValue);
        parcel.writeInt(this.isLocalVar ? 1 : 0);
        parcel.writeInt(this.supportsInput ? 1 : 0);
        parcel.writeInt(this.supportsOutput ? 1 : 0);
        parcel.writeInt(this.isActionBlockWorkingVar ? 1 : 0);
        parcel.writeParcelable(this.dictionary, i);
    }

    /* renamed from: x */
    public final boolean mo27779x() {
        int i = this.m_type;
        return i == 1 || i == 3;
    }

    /* renamed from: y */
    public final boolean mo27780y() {
        int i = this.m_type;
        if (i == 4 || i == 5) {
            return m15419i(this.dictionary);
        }
        return false;
    }

    public MacroDroidVariable(int i, String str, boolean z) {
        C13706o.m87929f(str, "name");
        this.m_stringValue = "";
        this.m_name = "";
        this.dictionary = new VariableValue.Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null);
        this.supportsInput = true;
        this.supportsOutput = true;
        this.m_type = i;
        this.m_name = str;
        this.m_stringValue = "";
        this.isLocalVar = z;
        this.dictionary = new VariableValue.Dictionary(new ArrayList(), i == 5, (List) null, 4, (C13695i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MacroDroidVariable(int i, String str, boolean z, int i2, C13695i iVar) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }

    private MacroDroidVariable(Parcel parcel) {
        String str = "";
        this.m_stringValue = str;
        this.m_name = str;
        this.dictionary = new VariableValue.Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null);
        boolean z = true;
        this.supportsInput = true;
        this.supportsOutput = true;
        this.m_type = parcel.readInt();
        this.m_intValue = parcel.readLong();
        this.m_booleanValue = parcel.readInt() != 0;
        String readString = parcel.readString();
        this.m_stringValue = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.m_name = readString2 != null ? readString2 : str;
        this.m_decimalValue = parcel.readDouble();
        this.isLocalVar = parcel.readInt() != 0;
        this.supportsInput = parcel.readInt() != 0;
        this.supportsOutput = parcel.readInt() != 0;
        this.isActionBlockWorkingVar = parcel.readInt() == 0 ? false : z;
        VariableValue.Dictionary dictionary2 = (VariableValue.Dictionary) parcel.readParcelable(VariableValue.Dictionary.class.getClassLoader());
        this.dictionary = dictionary2 == null ? new VariableValue.Dictionary(new ArrayList(), false, (List) null, 6, (C13695i) null) : dictionary2;
    }
}
