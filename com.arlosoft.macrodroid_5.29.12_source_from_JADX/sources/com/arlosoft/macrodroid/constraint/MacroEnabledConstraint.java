package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p099h1.C7363c;
import p123l1.C7619i0;

public class MacroEnabledConstraint extends Constraint implements C7363c {
    public static final Parcelable.Creator<MacroEnabledConstraint> CREATOR = new C4168a();
    private boolean m_enabled;
    private List<Long> m_macroIds;
    private transient List<Macro> m_macroList;
    private List<String> m_macroNames;
    private transient int m_selectedCount;

    /* renamed from: com.arlosoft.macrodroid.constraint.MacroEnabledConstraint$a */
    class C4168a implements Parcelable.Creator<MacroEnabledConstraint> {
        C4168a() {
        }

        /* renamed from: a */
        public MacroEnabledConstraint createFromParcel(Parcel parcel) {
            return new MacroEnabledConstraint(parcel, (C4168a) null);
        }

        /* renamed from: b */
        public MacroEnabledConstraint[] newArray(int i) {
            return new MacroEnabledConstraint[i];
        }
    }

    /* synthetic */ MacroEnabledConstraint(Parcel parcel, C4168a aVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private void m16772i3() {
        boolean z = true;
        List<Macro> B = C4934n.m18998M().mo29672B(true);
        this.m_macroList = B;
        Iterator<Macro> it = B.iterator();
        while (it.hasNext()) {
            if (mo27837X0().getGUID() == it.next().getGUID()) {
                it.remove();
            }
        }
        int size = this.m_macroList.size() + 1;
        String[] strArr = new String[size];
        this.m_selectedCount = 0;
        boolean[] zArr = new boolean[size];
        int i = 0;
        while (i < this.m_macroList.size()) {
            int i2 = i + 1;
            strArr[i2] = this.m_macroList.get(i).getName();
            if (this.m_macroList.get(i).getIsFavourite()) {
                strArr[i2] = "⭐ " + strArr[i2];
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.m_macroIds.size()) {
                    break;
                } else if (this.m_macroIds.get(i3).equals(Long.valueOf(this.m_macroList.get(i).getGUID()))) {
                    zArr[i2] = true;
                    this.m_selectedCount++;
                    break;
                } else {
                    i3++;
                }
            }
            i = i2;
        }
        strArr[0] = m16774k3();
        int i4 = 0;
        while (true) {
            if (i4 >= this.m_macroIds.size()) {
                break;
            } else if (this.m_macroIds.get(i4).equals(Long.valueOf(mo27837X0().getGUID()))) {
                zArr[0] = true;
                this.m_selectedCount++;
                break;
            } else {
                i4++;
            }
        }
        String string = mo27827K0().getString(C17541R$string.constraint_last_run_time_select_macros);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) string);
        builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) new C4229b2(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4223a2(this));
        AlertDialog create = builder.create();
        create.show();
        Button button = create.getButton(-1);
        if (this.m_selectedCount <= 0) {
            z = false;
        }
        button.setEnabled(z);
    }

    /* renamed from: j3 */
    private String[] m16773j3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_macro_enabled_macros_enabled), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_macro_enabled_macros_disabled)};
    }

    /* renamed from: k3 */
    private static final String m16774k3() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.constraint_last_run_time_this_macro);
    }

    /* renamed from: l3 */
    private boolean m16775l3(Macro macro) {
        return macro != null && C5163j2.m19991J(MacroDroidApplication.m14845u()).contains(macro.getCategory());
    }

    /* renamed from: m3 */
    private boolean m16776m3(Macro macro) {
        return macro != null && macro.isEnabled() && !m16775l3(macro);
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m16777n3(DialogInterface dialogInterface, int i, boolean z) {
        boolean z2 = true;
        if (z) {
            this.m_selectedCount++;
        } else {
            this.m_selectedCount--;
        }
        Button button = ((AlertDialog) dialogInterface).getButton(-1);
        if (this.m_selectedCount <= 0) {
            z2 = false;
        }
        button.setEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m16778o3(DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getListView().getCheckedItemPositions();
        SparseBooleanArray checkedItemPositions = alertDialog.getListView().getCheckedItemPositions();
        this.m_macroNames.clear();
        this.m_macroIds.clear();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                if (checkedItemPositions.keyAt(i2) == 0) {
                    this.m_macroNames.add(m16774k3());
                    this.m_macroIds.add(Long.valueOf(mo27837X0().getGUID()));
                } else {
                    this.m_macroNames.add(this.m_macroList.get(checkedItemPositions.keyAt(i2) - 1).getName());
                    this.m_macroIds.add(Long.valueOf(this.m_macroList.get(checkedItemPositions.keyAt(i2) - 1).getGUID()));
                }
            }
        }
        mo24689O1();
    }

    /* renamed from: D */
    public List<String> mo28198D() {
        return this.m_macroNames;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_enabled ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m16773j3()[!this.m_enabled];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_macroNames.toString();
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        C4934n M = C4934n.m18998M();
        for (Long longValue : this.m_macroIds) {
            if (m16776m3(M.mo29682Q(longValue.longValue())) != this.m_enabled) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7619i0.m31732u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + ": " + this.m_macroNames.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16773j3();
    }

    /* renamed from: l */
    public void mo28199l(List<String> list) {
        this.m_macroNames = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        m16772i3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_enabled ? 1 : 0);
        parcel.writeList(this.m_macroIds);
        parcel.writeStringList(this.m_macroNames);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_enabled = i == 0;
    }

    public MacroEnabledConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MacroEnabledConstraint() {
        this.m_enabled = true;
        this.m_macroIds = new ArrayList();
        this.m_macroNames = new ArrayList();
    }

    private MacroEnabledConstraint(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_enabled = true;
        this.m_enabled = parcel.readInt() == 0 ? false : z;
        ArrayList arrayList = new ArrayList();
        this.m_macroIds = arrayList;
        parcel.readList(arrayList, (ClassLoader) null);
        ArrayList arrayList2 = new ArrayList();
        this.m_macroNames = arrayList2;
        parcel.readStringList(arrayList2);
    }
}
