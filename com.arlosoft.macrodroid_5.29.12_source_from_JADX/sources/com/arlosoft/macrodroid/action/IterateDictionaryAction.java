package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p057a2.C2220i;
import p128m0.C7809o1;
import p319lc.C15626c;
import p370qa.C16265l;

/* compiled from: IterateDictionaryAction.kt */
public final class IterateDictionaryAction extends LoopAction implements C2220i {
    public static final Parcelable.Creator<IterateDictionaryAction> CREATOR = new C2491a();

    /* renamed from: d */
    public static final C2492b f7307d = new C2492b((C13695i) null);
    private transient int arrayIndex;
    private transient String currentKey;
    /* access modifiers changed from: private */
    public DictionaryKeys dictionaryKeys;
    private transient int elementIndex;
    /* access modifiers changed from: private */
    public boolean isArray;
    private transient int selectedIndex;
    /* access modifiers changed from: private */
    public String variableName;

    /* renamed from: com.arlosoft.macrodroid.action.IterateDictionaryAction$a */
    /* compiled from: IterateDictionaryAction.kt */
    public static final class C2491a implements Parcelable.Creator<IterateDictionaryAction> {
        C2491a() {
        }

        /* renamed from: a */
        public IterateDictionaryAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new IterateDictionaryAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public IterateDictionaryAction[] newArray(int i) {
            return new IterateDictionaryAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.IterateDictionaryAction$b */
    /* compiled from: IterateDictionaryAction.kt */
    public static final class C2492b {
        private C2492b() {
        }

        public /* synthetic */ C2492b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.IterateDictionaryAction$c */
    /* compiled from: IterateDictionaryAction.kt */
    static final class C2493c extends C13708q implements C16265l<VariableValue, Boolean> {

        /* renamed from: a */
        public static final C2493c f7308a = new C2493c();

        C2493c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(VariableValue variableValue) {
            C13706o.m87929f(variableValue, "variableValue");
            return Boolean.valueOf(variableValue instanceof VariableValue.Dictionary);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.IterateDictionaryAction$d */
    /* compiled from: IterateDictionaryAction.kt */
    public static final class C2494d implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f7309a;

        /* renamed from: b */
        final /* synthetic */ IterateDictionaryAction f7310b;

        /* renamed from: c */
        final /* synthetic */ MacroDroidVariable f7311c;

        /* renamed from: d */
        final /* synthetic */ int f7312d;

        /* renamed from: e */
        final /* synthetic */ VariableValue.Dictionary f7313e;

        C2494d(ArrayList<String> arrayList, IterateDictionaryAction iterateDictionaryAction, MacroDroidVariable macroDroidVariable, int i, VariableValue.Dictionary dictionary) {
            this.f7309a = arrayList;
            this.f7310b = iterateDictionaryAction;
            this.f7311c = macroDroidVariable;
            this.f7312d = i;
            this.f7313e = dictionary;
        }

        /* renamed from: a */
        public void mo24836a() {
            this.f7310b.variableName = this.f7311c.getName();
            this.f7310b.dictionaryKeys = new DictionaryKeys(this.f7309a);
            this.f7310b.isArray = this.f7313e.isArray();
            this.f7310b.mo24689O1();
        }

        /* renamed from: b */
        public void mo24837b(List<String> list) {
        }

        /* renamed from: c */
        public void mo24838c() {
        }

        /* renamed from: d */
        public void mo24839d() {
        }

        /* renamed from: e */
        public void mo24840e(VariableValue.DictionaryEntry dictionaryEntry) {
            C13706o.m87929f(dictionaryEntry, "dictionaryEntry");
            this.f7309a.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                VariableValue variable2 = dictionaryEntry.getVariable();
                C13706o.m87927d(variable2, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                if (((VariableValue.Dictionary) variable).hasDictionaryChildren((VariableValue.Dictionary) variable2)) {
                    IterateDictionaryAction iterateDictionaryAction = this.f7310b;
                    MacroDroidVariable macroDroidVariable = this.f7311c;
                    VariableValue variable3 = dictionaryEntry.getVariable();
                    C13706o.m87927d(variable3, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                    iterateDictionaryAction.m11032i4(macroDroidVariable, (VariableValue.Dictionary) variable3, this.f7309a, this.f7312d + 1);
                    return;
                }
            }
            IterateDictionaryAction iterateDictionaryAction2 = this.f7310b;
            VariableValue variable4 = dictionaryEntry.getVariable();
            C13706o.m87927d(variable4, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
            iterateDictionaryAction2.isArray = ((VariableValue.Dictionary) variable4).isArray();
            this.f7310b.variableName = this.f7311c.getName();
            this.f7310b.dictionaryKeys = new DictionaryKeys(this.f7309a);
            this.f7310b.mo24689O1();
        }
    }

    public IterateDictionaryAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        mo25154D1();
        this.m_macro = macro;
    }

    public /* synthetic */ IterateDictionaryAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public final void m11032i4(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        int i2 = i;
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        String str = (dictionaryKeys2 == null || dictionaryKeys2.getKeys().size() <= i2) ? null : dictionaryKeys2.getKeys().get(i2);
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        C6520o0.m24884K0(j0, C17542R$style.Theme_App_Dialog_Action, dictionary, C2493c.f7308a, str, false, new C6520o0.C6525c(false, (List<String>) null), false, C6520o0.C6538e.SHOW_DICTIONARIES_AND_ARRAYS, true, new C2494d(arrayList, this, macroDroidVariable, i, dictionary));
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        ArrayList<MacroDroidVariable> p0 = mo27859p0();
        C13706o.m87928e(p0, "variables");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(p0, 10));
        for (MacroDroidVariable name : p0) {
            arrayList.add(name.getName());
        }
        int b0 = C13566b0.m87427b0(arrayList, this.variableName);
        if (b0 < 0) {
            b0 = 0;
        }
        this.selectedIndex = b0;
        return b0;
    }

    /* renamed from: D1 */
    public final void mo25154D1() {
        this.m_option = 100;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String a1 = mo25559a1();
        C13706o.m87928e(a1, "name");
        return a1;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        String str = this.variableName;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(C6520o0.m24912e0(this.dictionaryKeys));
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7809o1.m32627u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.dictionaryKeys;
    }

    /* renamed from: c4 */
    public final int mo25244c4() {
        return this.arrayIndex;
    }

    /* renamed from: d4 */
    public final String mo25245d4() {
        return this.currentKey;
    }

    /* renamed from: e4 */
    public final boolean mo25246e4() {
        return this.isArray;
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.variableName = str;
    }

    /* renamed from: f4 */
    public final String mo25247f4() {
        List<String> list;
        MacroDroidVariable q = mo27861q(this.variableName);
        C13706o.m87928e(q, "variable");
        DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
        if (dictionaryKeys2 == null || (list = dictionaryKeys2.getKeys()) == null) {
            list = C13614t.m87748j();
        }
        VariableValue.Dictionary r = MacroDroidVariable.m15420r(q, list, false, 2, (Object) null);
        if (this.elementIndex >= r.getEntries().size()) {
            return "?";
        }
        try {
            return r.getEntriesSorted().get(this.elementIndex).getVariable().getValueAsText();
        } catch (Exception unused) {
            return "?";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        ArrayList<MacroDroidVariable> p0 = mo27859p0();
        if (p0.isEmpty()) {
            C15626c.makeText(mo27827K0(), C17541R$string.no_variables_configured, 0).show();
        }
        C13706o.m87928e(p0, "variables");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(p0, 10));
        for (MacroDroidVariable name : p0) {
            arrayList.add(name.getName());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: g4 */
    public final void mo25248g4() {
        this.elementIndex = -1;
        this.arrayIndex = -1;
        this.currentKey = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        String string = mo27827K0().getString(C17541R$string.action_set_variable_select);
        C13706o.m87928e(string, "context.getString(R.stri…tion_set_variable_select)");
        return string;
    }

    /* renamed from: h4 */
    public final boolean mo25249h4() {
        List<String> list;
        int i;
        MacroDroidVariable q = mo27861q(this.variableName);
        if (q != null) {
            DictionaryKeys dictionaryKeys2 = this.dictionaryKeys;
            if (dictionaryKeys2 == null || (list = dictionaryKeys2.getKeys()) == null) {
                list = C13614t.m87748j();
            }
            VariableValue.Dictionary r = MacroDroidVariable.m15420r(q, list, false, 2, (Object) null);
            int i2 = this.elementIndex + 1;
            this.elementIndex = i2;
            if (i2 >= r.getEntries().size()) {
                return false;
            }
            List<VariableValue.DictionaryEntry> entriesSorted = r.getEntriesSorted();
            if (r.isArray()) {
                try {
                    i = Integer.parseInt(entriesSorted.get(this.elementIndex).getKey());
                } catch (Exception unused) {
                    i = -1;
                }
                this.arrayIndex = i;
            } else {
                this.currentKey = entriesSorted.get(this.elementIndex).getKey();
            }
            entriesSorted.get(this.elementIndex);
            return true;
        }
        C4878b.m18868g("Could not iterate over variable " + this.variableName + " (The variable could not be found)");
        return false;
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
        ArrayList<MacroDroidVariable> p0 = mo27859p0();
        MacroDroidVariable macroDroidVariable = p0.get(this.selectedIndex);
        if (macroDroidVariable.mo27773s() || macroDroidVariable.mo27776v()) {
            MacroDroidVariable macroDroidVariable2 = p0.get(this.selectedIndex);
            C13706o.m87928e(macroDroidVariable2, "variables[selectedIndex]");
            m11032i4(macroDroidVariable2, macroDroidVariable.mo27770n(), new ArrayList(), 0);
            return;
        }
        this.dictionaryKeys = null;
        this.variableName = macroDroidVariable.getName();
        this.isArray = macroDroidVariable.mo27748X();
        mo24689O1();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.variableName);
        parcel.writeParcelable(this.dictionaryKeys, i);
        parcel.writeInt(this.isArray ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.selectedIndex = i;
    }

    public IterateDictionaryAction() {
        this.elementIndex = -1;
        this.arrayIndex = -1;
        mo25154D1();
    }

    private IterateDictionaryAction(Parcel parcel) {
        super(parcel);
        this.elementIndex = -1;
        this.arrayIndex = -1;
        mo25154D1();
        this.variableName = parcel.readString();
        this.dictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
        this.isArray = parcel.readInt() != 0;
    }
}
