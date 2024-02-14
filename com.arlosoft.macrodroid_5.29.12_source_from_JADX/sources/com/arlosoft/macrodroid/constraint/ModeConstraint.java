package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2220i;
import p123l1.C7623j0;
import p319lc.C15626c;
import p370qa.C16265l;

public class ModeConstraint extends Constraint implements C2220i {
    public static final Parcelable.Creator<ModeConstraint> CREATOR = new C4170b();
    private static final String FROM_VARIABLE_TEXT = ("[" + SelectableItem.m15535j1(C17541R$string.string) + " " + SelectableItem.m15535j1(C17541R$string.variable_short_name) + "]");
    private String m_mode;
    private transient List<String> m_modeList;
    private boolean m_modeSelected;
    /* access modifiers changed from: private */
    public String m_variableName;
    /* access modifiers changed from: private */
    public DictionaryKeys varDictionaryKeys;

    /* renamed from: com.arlosoft.macrodroid.constraint.ModeConstraint$a */
    class C4169a implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f10740a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f10741b;

        /* renamed from: c */
        final /* synthetic */ int f10742c;

        C4169a(ArrayList arrayList, MacroDroidVariable macroDroidVariable, int i) {
            this.f10740a = arrayList;
            this.f10741b = macroDroidVariable;
            this.f10742c = i;
        }

        /* renamed from: a */
        public void mo24836a() {
        }

        /* renamed from: b */
        public void mo24837b(@Nullable List<String> list) {
        }

        /* renamed from: c */
        public void mo24838c() {
        }

        /* renamed from: d */
        public void mo24839d() {
        }

        /* renamed from: e */
        public void mo24840e(@NonNull VariableValue.DictionaryEntry dictionaryEntry) {
            this.f10740a.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                ModeConstraint.this.m16804t3(this.f10741b, (VariableValue.Dictionary) dictionaryEntry.getVariable(), this.f10740a, this.f10742c + 1);
                return;
            }
            DictionaryKeys unused = ModeConstraint.this.varDictionaryKeys = new DictionaryKeys(this.f10740a);
            String unused2 = ModeConstraint.this.m_variableName = this.f10741b.getName();
            ModeConstraint.this.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.ModeConstraint$b */
    class C4170b implements Parcelable.Creator<ModeConstraint> {
        C4170b() {
        }

        /* renamed from: a */
        public ModeConstraint createFromParcel(Parcel parcel) {
            return new ModeConstraint(parcel, (C4169a) null);
        }

        /* renamed from: b */
        public ModeConstraint[] newArray(int i) {
            return new ModeConstraint[i];
        }
    }

    /* synthetic */ ModeConstraint(Parcel parcel, C4169a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m16792D1() {
        List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
        this.m_modeList = Q;
        this.m_modeSelected = true;
        if (Q.size() > 0) {
            this.m_mode = this.m_modeList.get(0);
        } else {
            this.m_mode = "";
        }
    }

    /* renamed from: m3 */
    private void m16799m3() {
        ArrayList<MacroDroidVariable> x0 = mo27874x0();
        if (x0.size() == 0) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_string_variables_defined, 0).show();
            return;
        }
        String[] strArr = new String[x0.size()];
        int i = 0;
        for (int i2 = 0; i2 < x0.size(); i2++) {
            strArr[i2] = x0.get(i2).getName();
            String str = this.m_variableName;
            if (str != null && str.equals(strArr[i2])) {
                i = i2;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_set_variable_select);
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4247e2(this, x0, strArr));
        builder.create().show();
    }

    /* renamed from: o3 */
    private String[] m16800o3() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.constraint_mode_current_mode), MacroDroidApplication.m14845u().getString(C17541R$string.constraint_mode_not_in_mode)};
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m16801p3(List list, String[] strArr, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        MacroDroidVariable macroDroidVariable = (MacroDroidVariable) list.get(checkedItemPosition);
        if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
            m16804t3(macroDroidVariable, macroDroidVariable.mo27770n(), new ArrayList(), 0);
            return;
        }
        this.varDictionaryKeys = null;
        this.m_variableName = strArr[checkedItemPosition];
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m16802q3(DialogInterface dialogInterface, int i) {
        this.m_mode = this.m_modeList.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m16803r3(DialogInterface dialogInterface, int i) {
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            m16799m3();
            return;
        }
        this.m_variableName = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public void m16804t3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        int i2 = i;
        if (dictionary.getEntries().isEmpty()) {
            C15626c.makeText(mo27827K0(), C17541R$string.variable_multi_entry_no_entries, 1).show();
            return;
        }
        MacroDroidVariable macroDroidVariable2 = macroDroidVariable;
        C6520o0.m24884K0(mo27850j0(), C17542R$style.Theme_App_Dialog_Action, dictionary, (C16265l<? super VariableValue, Boolean>) null, arrayList.size() > i2 ? arrayList.get(i) : null, false, new C6520o0.C6525c(false, (List<String>) null), false, C6520o0.C6538e.DONT_SHOW, true, new C4169a(arrayList, macroDroidVariable, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_modeSelected ^ true ? 1 : 0;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String str;
        String str2;
        if (this.m_modeSelected) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo27827K0().getString(C17541R$string.constraint_mode_mode));
            sb.append(" = ");
            if (this.m_variableName != null) {
                str2 = this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys);
            } else {
                str2 = this.m_mode;
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo27827K0().getString(C17541R$string.constraint_mode_mode));
        sb2.append(" != ");
        if (this.m_variableName != null) {
            str = this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys);
        } else {
            str = this.m_mode;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return this.m_variableName != null || C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0())).contains(this.m_mode);
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        String W0 = C5163j2.m20083W0(mo27827K0());
        String str = this.m_variableName;
        if (str != null) {
            MacroDroidVariable q = mo27861q(str);
            if (q == null) {
                C4878b.m18869h("Mode constraint check failed, variable does not exist (" + this.m_variableName + ")", mo27840Y0().longValue());
                return false;
            }
            String K = q.mo27737K(this.varDictionaryKeys);
            if (K == null) {
                C4878b.m18869h("Mode constraint check failed, variable does not exist (" + this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys) + ")", mo27840Y0().longValue());
                return false;
            }
            String t0 = C4023j0.m15760t0(mo27827K0().getApplicationContext(), K, triggerContextInfo, mo27837X0());
            if (this.m_modeSelected) {
                return t0.equals(W0);
            }
            return !t0.equals(W0);
        } else if (this.m_modeSelected) {
            return this.m_mode.equals(W0);
        } else {
            return !this.m_mode.equals(W0);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7623j0.m31749u();
    }

    /* renamed from: a0 */
    public boolean mo24825a0() {
        List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
        if (!Q.contains(this.m_mode)) {
            Q.add(this.m_mode);
        }
        C5163j2.m20017M4(mo27827K0(), C4061t1.m15972R(Q));
        return true;
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.m_variableName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m16800o3();
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.m_variableName;
    }

    /* renamed from: n3 */
    public String mo28242n3() {
        return this.m_mode;
    }

    /* renamed from: s3 */
    public void mo28243s3(String str) {
        this.m_mode = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (mo27836X()) {
            List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
            this.m_modeList = Q;
            int i = 0;
            Q.add(0, FROM_VARIABLE_TEXT);
            if (this.m_modeList.size() == 0) {
                C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_modes_configured, 0).show();
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.m_modeList.size(); i3++) {
                if (this.m_mode.equals(this.m_modeList.get(i3))) {
                    i2 = i3;
                }
            }
            if (this.m_variableName == null) {
                i = i2;
            }
            String[] strArr = new String[this.m_modeList.size()];
            this.m_modeList.toArray(strArr);
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setTitle((int) C17541R$string.constraint_mode_select);
            builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C4241d2(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4235c2(this));
            builder.create().show();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_mode);
        parcel.writeInt(this.m_modeSelected ? 1 : 0);
        parcel.writeString(this.m_variableName);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_modeSelected = i == 0;
    }

    public ModeConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ModeConstraint() {
        m16792D1();
    }

    private ModeConstraint(Parcel parcel) {
        super(parcel);
        this.m_mode = parcel.readString();
        this.m_modeSelected = parcel.readInt() != 0;
        this.m_variableName = parcel.readString();
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
