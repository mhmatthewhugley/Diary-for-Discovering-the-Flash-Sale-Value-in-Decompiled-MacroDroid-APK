package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13678a0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p057a2.C2221j;
import p128m0.C7850u;
import p370qa.C16265l;

/* compiled from: ClearVariablesAction.kt */
public final class ClearVariablesAction extends Action implements C2221j {
    public static final Parcelable.Creator<ClearVariablesAction> CREATOR = new C2364a();

    /* renamed from: d */
    public static final C2365b f7181d = new C2365b((C13695i) null);
    private List<String> variableNames;

    /* renamed from: com.arlosoft.macrodroid.action.ClearVariablesAction$a */
    /* compiled from: ClearVariablesAction.kt */
    public static final class C2364a implements Parcelable.Creator<ClearVariablesAction> {
        C2364a() {
        }

        /* renamed from: a */
        public ClearVariablesAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ClearVariablesAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ClearVariablesAction[] newArray(int i) {
            return new ClearVariablesAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ClearVariablesAction$b */
    /* compiled from: ClearVariablesAction.kt */
    public static final class C2365b {
        private C2365b() {
        }

        public /* synthetic */ C2365b(C13695i iVar) {
            this();
        }
    }

    public ClearVariablesAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ClearVariablesAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m10094l3(boolean[] zArr, C13678a0 a0Var, DialogInterface dialogInterface, int i, boolean z) {
        C13706o.m87929f(zArr, "$selections");
        C13706o.m87929f(a0Var, "$anyChecked");
        C13706o.m87929f(dialogInterface, "dialog");
        zArr[i] = z;
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < length) {
                boolean z3 = zArr[i2];
                if (!z3) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(Boolean.valueOf(z3));
                }
                i2++;
            } else {
                a0Var.element = !arrayList.isEmpty();
                ((AlertDialog) dialogInterface).getButton(-1).setEnabled(a0Var.element);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m10095m3(String[] strArr, ClearVariablesAction clearVariablesAction, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(strArr, "$allVarNames");
        C13706o.m87929f(clearVariablesAction, "this$0");
        C13706o.m87927d(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getListView().getCheckedItemPositions();
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        ArrayList arrayList = new ArrayList();
        int size = checkedItemPositions.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                arrayList.add(strArr[checkedItemPositions.keyAt(i2)]);
            }
        }
        clearVariablesAction.variableNames = C13566b0.m87402F0(arrayList);
        clearVariablesAction.mo24677v2();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return C13566b0.m87432g0(this.variableNames, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7850u.f18902j.mo37772a();
    }

    /* renamed from: a */
    public String[] mo24435a() {
        Object[] array = this.variableNames.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        for (String q : this.variableNames) {
            MacroDroidVariable q2 = mo27861q(q);
            if (q2 != null) {
                C13706o.m87928e(q2, "variable");
                mo27828K2(q2);
            }
        }
    }

    /* renamed from: e */
    public void mo24436e(String[] strArr) {
        C13706o.m87929f(strArr, "varNames");
        this.variableNames = C13596m.m87610i0(strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        ArrayList<MacroDroidVariable> A0 = mo27814A0();
        C13706o.m87928e(A0, "allVariables");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(A0, 10));
        for (MacroDroidVariable name : A0) {
            arrayList.add(name.getName());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        ArrayList arrayList2 = new ArrayList(strArr.length);
        for (String contains : strArr) {
            arrayList2.add(Boolean.valueOf(this.variableNames.contains(contains)));
        }
        boolean[] B0 = C13566b0.m87398B0(arrayList2);
        C13678a0 a0Var = new C13678a0();
        ArrayList arrayList3 = new ArrayList();
        int length = B0.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                boolean z2 = B0[i];
                if (!z2) {
                    z = false;
                }
                if (z) {
                    arrayList3.add(Boolean.valueOf(z2));
                }
                i++;
            } else {
                a0Var.element = !arrayList3.isEmpty();
                AlertDialog.Builder positiveButton = new AlertDialog.Builder(mo27850j0(), mo24705l0()).setTitle((int) C17541R$string.action_clear_variables).setMultiChoiceItems((CharSequence[]) strArr, B0, (DialogInterface.OnMultiChoiceClickListener) new C3047f2(B0, a0Var)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3018e2(strArr, this));
                C13706o.m87928e(positiveButton, "Builder(activity, alertD…onfirmed()\n            })");
                AlertDialog create = positiveButton.create();
                C13706o.m87928e(create, "builder.create()");
                create.show();
                create.getButton(-1).setEnabled(a0Var.element);
                return;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeStringList(this.variableNames);
    }

    public ClearVariablesAction() {
        this.variableNames = new ArrayList();
    }

    private ClearVariablesAction(Parcel parcel) {
        super(parcel);
        this.variableNames = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.variableNames = arrayList;
        parcel.readStringList(arrayList);
    }
}
