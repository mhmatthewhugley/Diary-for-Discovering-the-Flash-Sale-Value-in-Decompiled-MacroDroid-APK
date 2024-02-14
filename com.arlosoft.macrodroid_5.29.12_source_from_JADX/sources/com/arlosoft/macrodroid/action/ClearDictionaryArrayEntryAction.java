package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p057a2.C2215d;
import p057a2.C2220i;
import p057a2.C2224m;
import p128m0.C7827r;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

/* compiled from: ClearDictionaryArrayEntryAction.kt */
public final class ClearDictionaryArrayEntryAction extends Action implements C2220i, C2224m, C2215d {
    public static final Parcelable.Creator<ClearDictionaryArrayEntryAction> CREATOR = new C2354a();

    /* renamed from: d */
    public static final C2355b f7167d = new C2355b((C13695i) null);
    private int clearOption;
    private ArrayList<String> dictionaryKeys;
    private String variableName;

    /* renamed from: com.arlosoft.macrodroid.action.ClearDictionaryArrayEntryAction$a */
    /* compiled from: ClearDictionaryArrayEntryAction.kt */
    public static final class C2354a implements Parcelable.Creator<ClearDictionaryArrayEntryAction> {
        C2354a() {
        }

        /* renamed from: a */
        public ClearDictionaryArrayEntryAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ClearDictionaryArrayEntryAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ClearDictionaryArrayEntryAction[] newArray(int i) {
            return new ClearDictionaryArrayEntryAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearDictionaryArrayEntryAction$b */
    /* compiled from: ClearDictionaryArrayEntryAction.kt */
    public static final class C2355b {
        private C2355b() {
        }

        public /* synthetic */ C2355b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m10035b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.action_clear_dictionary_array_entry_option_clear_value), SelectableItem.m15535j1(C17541R$string.action_clear_dictionary_array_entry_option_delete_key)};
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearDictionaryArrayEntryAction$c */
    /* compiled from: ClearDictionaryArrayEntryAction.kt */
    public static final class C2356c implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ ClearDictionaryArrayEntryAction f7168a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f7169b;

        /* renamed from: c */
        final /* synthetic */ VariableValue.Dictionary f7170c;

        /* renamed from: d */
        final /* synthetic */ ArrayList<String> f7171d;

        /* renamed from: e */
        final /* synthetic */ int f7172e;

        /* renamed from: com.arlosoft.macrodroid.action.ClearDictionaryArrayEntryAction$c$a */
        /* compiled from: ClearDictionaryArrayEntryAction.kt */
        static final class C2357a extends C13708q implements C16265l<C6520o0.C6523b, C13339u> {
            final /* synthetic */ ArrayList<String> $keyList;
            final /* synthetic */ MacroDroidVariable $variable;
            final /* synthetic */ ClearDictionaryArrayEntryAction this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2357a(ArrayList<String> arrayList, ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction, MacroDroidVariable macroDroidVariable) {
                super(1);
                this.$keyList = arrayList;
                this.this$0 = clearDictionaryArrayEntryAction;
                this.$variable = macroDroidVariable;
            }

            /* renamed from: a */
            public final void mo24841a(C6520o0.C6523b bVar) {
                C13706o.m87929f(bVar, "<name for destructuring parameter 0>");
                List<String> a = bVar.mo32706a();
                bVar.mo32707b();
                this.$keyList.clear();
                this.$keyList.addAll(a);
                this.this$0.m10019r3(this.$variable, this.$keyList);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo24841a((C6520o0.C6523b) obj);
                return C13339u.f61331a;
            }
        }

        C2356c(ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction, MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
            this.f7168a = clearDictionaryArrayEntryAction;
            this.f7169b = macroDroidVariable;
            this.f7170c = dictionary;
            this.f7171d = arrayList;
            this.f7172e = i;
        }

        /* renamed from: a */
        public void mo24836a() {
            this.f7168a.m10019r3(this.f7169b, this.f7171d);
        }

        /* renamed from: b */
        public void mo24837b(List<String> list) {
            Activity j0 = this.f7168a.mo27850j0();
            C13706o.m87928e(j0, "activity");
            MacroDroidVariable macroDroidVariable = this.f7169b;
            VariableValue.Dictionary dictionary = this.f7170c;
            Macro l3 = this.f7168a.m_macro;
            ArrayList<String> arrayList = this.f7171d;
            ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction = this.f7168a;
            C6520o0.m24902Z(j0, C17542R$style.Theme_App_Dialog_Action, macroDroidVariable, dictionary, l3, arrayList, list, false, clearDictionaryArrayEntryAction, new C2357a(arrayList, clearDictionaryArrayEntryAction, this.f7169b));
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
            this.f7171d.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction = this.f7168a;
                MacroDroidVariable macroDroidVariable = this.f7169b;
                VariableValue variable = dictionaryEntry.getVariable();
                C13706o.m87927d(variable, "null cannot be cast to non-null type com.arlosoft.macrodroid.variables.VariableValue.Dictionary");
                clearDictionaryArrayEntryAction.m10021t3(macroDroidVariable, (VariableValue.Dictionary) variable, this.f7171d, C6520o0.C6538e.SHOW_DICTIONARIES_AND_ARRAYS, this.f7172e + 1);
                return;
            }
            this.f7168a.m10019r3(this.f7169b, this.f7171d);
        }
    }

    public ClearDictionaryArrayEntryAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ClearDictionaryArrayEntryAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: p3 */
    private final int m10017p3() {
        int i = this.clearOption;
        if (i > 1) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m10018q3(ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction, ArrayList arrayList, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(clearDictionaryArrayEntryAction, "this$0");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        Object obj = arrayList.get(checkedItemPosition);
        C13706o.m87928e(obj, "allVars[index]");
        clearDictionaryArrayEntryAction.m10021t3((MacroDroidVariable) obj, ((MacroDroidVariable) arrayList.get(checkedItemPosition)).mo27770n(), new ArrayList(), C6520o0.C6538e.DONT_SHOW, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public final void m10019r3(MacroDroidVariable macroDroidVariable, ArrayList<String> arrayList) {
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.action_clear_variables).setSingleChoiceItems((CharSequence[]) f7167d.m10035b(), m10017p3(), (DialogInterface.OnClickListener) null).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3356q1(this, macroDroidVariable, arrayList));
        C13706o.m87928e(positiveButton, "Builder(activity, alertD…rmed()\n                })");
        AlertDialog create = positiveButton.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m10020s3(ClearDictionaryArrayEntryAction clearDictionaryArrayEntryAction, MacroDroidVariable macroDroidVariable, ArrayList arrayList, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(clearDictionaryArrayEntryAction, "this$0");
        C13706o.m87929f(macroDroidVariable, "$variable");
        C13706o.m87929f(arrayList, "$keyList");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        clearDictionaryArrayEntryAction.clearOption = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        clearDictionaryArrayEntryAction.variableName = macroDroidVariable.getName();
        clearDictionaryArrayEntryAction.dictionaryKeys = arrayList;
        clearDictionaryArrayEntryAction.mo24677v2();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m10021t3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, C6520o0.C6538e eVar, int i) {
        int i2 = i;
        String str = this.dictionaryKeys.size() > i2 ? this.dictionaryKeys.get(i2) : null;
        Activity j0 = mo27850j0();
        C13706o.m87928e(j0, "activity");
        C6520o0.m24884K0(j0, C17542R$style.Theme_App_Dialog_Action, dictionary, (C16265l<? super VariableValue, Boolean>) null, str, false, new C6520o0.C6525c(true, this.dictionaryKeys), false, eVar, true, new C2356c(this, macroDroidVariable, dictionary, arrayList, i));
    }

    /* renamed from: F */
    public String[] mo24440F() {
        Object[] array = this.dictionaryKeys.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        this.dictionaryKeys = (ArrayList) C13596m.m87603b0(strArr, new ArrayList());
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        StringBuilder sb = new StringBuilder();
        String str = this.variableName;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(C6520o0.m24914f0(this.dictionaryKeys));
        sb.append(": ");
        sb.append(f7167d.m10035b()[m10017p3()]);
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7827r.f18864j.mo37767a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        MacroDroidVariable q = mo27861q(this.variableName);
        Context K0 = mo27827K0();
        C13706o.m87928e(K0, "context");
        ArrayList<String> arrayList = this.dictionaryKeys;
        Macro X0 = mo27837X0();
        C13706o.m87928e(X0, "macro");
        ArrayList<String> C = C6520o0.m24868C(K0, arrayList, triggerContextInfo, X0);
        if (q == null) {
            return;
        }
        if (m10017p3() == 0) {
            mo27830L2(q, C);
            return;
        }
        VariableValue.DictionaryEntry R = q.mo27742R(C, false);
        if (R == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dictionary entry not found: ");
            String str = this.variableName;
            if (str == null) {
                str = "" + C6520o0.m24914f0(C);
            }
            sb.append(str);
            sb.append(" (Cannot delete)");
            String sb2 = sb.toString();
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18883v(sb2, Y0.longValue());
            return;
        }
        VariableValue.Dictionary r = MacroDroidVariable.m15420r(q, C13566b0.m87417R(C, 1), false, 2, (Object) null);
        r.removeEntry(R);
        mo27837X0().notifyVariableListenersOnCorrectThread(q, r, r);
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.variableName = str;
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.variableName;
    }

    /* renamed from: n */
    public void mo24424n(List<String> list) {
        if (list != null) {
            this.dictionaryKeys = new ArrayList<>(list);
        } else {
            this.dictionaryKeys = new ArrayList<>();
        }
    }

    /* renamed from: u */
    public List<String> mo24425u() {
        return this.dictionaryKeys;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        ArrayList<MacroDroidVariable> p0 = mo27859p0();
        C13706o.m87928e(p0, "allVars");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(p0, 10));
        for (MacroDroidVariable name : p0) {
            arrayList.add(name.getName());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        if (strArr.length == 0) {
            C15626c.makeText(mo27827K0(), C17541R$string.no_variables, 0).show();
            return;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.action_clear_variables).setSingleChoiceItems((CharSequence[]) strArr, C16792h.m99540b(C13596m.m87586K(strArr, this.variableName), 0), (DialogInterface.OnClickListener) null).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3384r1(this, p0));
        C13706o.m87928e(positiveButton, "Builder(activity, alertD…T_SHOW, 0)\n            })");
        AlertDialog create = positiveButton.create();
        C13706o.m87928e(create, "builder.create()");
        create.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.variableName);
        parcel.writeStringList(this.dictionaryKeys);
        parcel.writeInt(this.clearOption);
    }

    public ClearDictionaryArrayEntryAction() {
        this.dictionaryKeys = new ArrayList<>();
    }

    private ClearDictionaryArrayEntryAction(Parcel parcel) {
        super(parcel);
        this.dictionaryKeys = new ArrayList<>();
        this.variableName = parcel.readString();
        ArrayList<String> arrayList = new ArrayList<>();
        this.dictionaryKeys = arrayList;
        parcel.readStringList(arrayList);
        this.clearOption = parcel.readInt();
    }
}
