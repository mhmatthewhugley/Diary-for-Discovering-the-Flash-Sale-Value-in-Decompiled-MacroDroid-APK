package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2220i;
import p119k3.C7578z0;
import p319lc.C15626c;
import p370qa.C16265l;

public class ModeEnterExitTrigger extends Trigger implements C2220i {
    public static final Parcelable.Creator<ModeEnterExitTrigger> CREATOR = new C5701b();
    private static final String FROM_VARIABLE_TEXT = ("[" + SelectableItem.m15535j1(C17541R$string.string) + " " + SelectableItem.m15535j1(C17541R$string.variable_short_name) + "]");
    private boolean m_anyChange;
    private String m_mode;
    private boolean m_modeEntered;
    private transient List<String> m_modeList;
    /* access modifiers changed from: private */
    public String m_variableName;
    /* access modifiers changed from: private */
    public DictionaryKeys varDictionaryKeys;

    /* renamed from: com.arlosoft.macrodroid.triggers.ModeEnterExitTrigger$a */
    class C5700a implements C6520o0.C6521a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f13651a;

        /* renamed from: b */
        final /* synthetic */ MacroDroidVariable f13652b;

        /* renamed from: c */
        final /* synthetic */ int f13653c;

        C5700a(ArrayList arrayList, MacroDroidVariable macroDroidVariable, int i) {
            this.f13651a = arrayList;
            this.f13652b = macroDroidVariable;
            this.f13653c = i;
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
            this.f13651a.add(dictionaryEntry.getKey());
            if (dictionaryEntry.getVariable() instanceof VariableValue.Dictionary) {
                ModeEnterExitTrigger.this.m22725y3(this.f13652b, (VariableValue.Dictionary) dictionaryEntry.getVariable(), this.f13651a, this.f13653c + 1);
                return;
            }
            DictionaryKeys unused = ModeEnterExitTrigger.this.varDictionaryKeys = new DictionaryKeys(this.f13651a);
            String unused2 = ModeEnterExitTrigger.this.m_variableName = this.f13652b.getName();
            ModeEnterExitTrigger.this.mo24689O1();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.ModeEnterExitTrigger$b */
    class C5701b implements Parcelable.Creator<ModeEnterExitTrigger> {
        C5701b() {
        }

        /* renamed from: a */
        public ModeEnterExitTrigger createFromParcel(Parcel parcel) {
            return new ModeEnterExitTrigger(parcel, (C5700a) null);
        }

        /* renamed from: b */
        public ModeEnterExitTrigger[] newArray(int i) {
            return new ModeEnterExitTrigger[i];
        }
    }

    /* synthetic */ ModeEnterExitTrigger(Parcel parcel, C5700a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m22711D1() {
        this.m_modeList = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
        this.m_modeEntered = true;
        this.m_mode = SelectableItem.m15535j1(C17541R$string.mode_standard);
    }

    /* renamed from: n3 */
    private void m22719n3() {
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
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C5922f5(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5946h5(this, x0, strArr));
        builder.create().show();
    }

    /* renamed from: q3 */
    private String[] m22720q3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_mode_enter_exit_enter), SelectableItem.m15535j1(C17541R$string.trigger_mode_enter_exit_exit), SelectableItem.m15535j1(C17541R$string.trigger_mode_enter_exit_any_change)};
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m22721s3(DialogInterface dialogInterface, int i) {
        mo24679x2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m22722t3(List list, String[] strArr, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        MacroDroidVariable macroDroidVariable = (MacroDroidVariable) list.get(checkedItemPosition);
        if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
            m22725y3(macroDroidVariable, macroDroidVariable.mo27770n(), new ArrayList(), 0);
            return;
        }
        this.varDictionaryKeys = null;
        this.m_variableName = strArr[checkedItemPosition];
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m22723u3(DialogInterface dialogInterface, int i) {
        this.m_mode = this.m_modeList.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m22724v3(DialogInterface dialogInterface, int i) {
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            m22719n3();
            return;
        }
        this.m_variableName = null;
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public void m22725y3(MacroDroidVariable macroDroidVariable, VariableValue.Dictionary dictionary, ArrayList<String> arrayList, int i) {
        int i2 = i;
        if (dictionary.getEntries().isEmpty()) {
            C15626c.makeText(mo27827K0(), C17541R$string.variable_multi_entry_no_entries, 1).show();
            return;
        }
        C6520o0.m24884K0(mo27850j0(), C17542R$style.Theme_App_Dialog_Action, dictionary, (C16265l<? super VariableValue, Boolean>) null, arrayList.size() > i2 ? arrayList.get(i) : null, false, new C6520o0.C6525c(true, (List<String>) null), false, C6520o0.C6538e.DONT_SHOW, true, new C5700a(arrayList, macroDroidVariable, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.m_anyChange) {
            return 2;
        }
        return this.m_modeEntered ? 0 : 1;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return this.m_anyChange ? m22720q3()[2] : this.m_modeEntered ? m22720q3()[0] : m22720q3()[1];
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return this.m_variableName != null || C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0())).contains(this.m_mode);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_variableName != null) {
            return this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys);
        }
        String str = this.m_mode;
        return str != null ? str : "";
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7578z0.m31555u();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
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
        return m22720q3();
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.m_variableName;
    }

    /* renamed from: o3 */
    public boolean mo31333o3() {
        return this.m_modeEntered;
    }

    /* renamed from: p3 */
    public String mo31334p3() {
        return this.m_mode;
    }

    /* renamed from: r3 */
    public boolean mo31335r3() {
        return this.m_anyChange;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (mo27836X()) {
            if (this.m_anyChange) {
                mo24689O1();
                return;
            }
            List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
            this.m_modeList = Q;
            int i = 0;
            Q.add(0, FROM_VARIABLE_TEXT);
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
            builder.setTitle((int) C17541R$string.select_mode);
            builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C5910e5(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C5934g5(this));
            builder.create().show();
        }
    }

    /* renamed from: w3 */
    public boolean mo31336w3(String str) {
        String str2 = this.m_variableName;
        if (str2 == null) {
            return this.m_mode.equals(str);
        }
        MacroDroidVariable q = mo27861q(str2);
        if (q == null) {
            C4878b.m18869h("Mode trigger check failed, variable does not exist (" + this.m_variableName + ")", mo27840Y0().longValue());
            return false;
        }
        String K = q.mo27737K(this.varDictionaryKeys);
        if (K != null) {
            return str.equals(K);
        }
        C4878b.m18869h("Mode trigger check failed, variable does not exist (" + this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys) + ")", mo27840Y0().longValue());
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_modeEntered ? 1 : 0);
        parcel.writeInt(this.m_anyChange ? 1 : 0);
        parcel.writeString(this.m_mode);
        parcel.writeString(this.m_variableName);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        this.m_modeEntered = i == 0;
        if (i != 2) {
            z = false;
        }
        this.m_anyChange = z;
    }

    /* renamed from: x3 */
    public void mo31337x3(String str) {
        this.m_mode = str;
    }

    public ModeEnterExitTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private ModeEnterExitTrigger() {
        m22711D1();
    }

    private ModeEnterExitTrigger(Parcel parcel) {
        super(parcel);
        m22711D1();
        boolean z = true;
        this.m_modeEntered = parcel.readInt() != 0;
        this.m_anyChange = parcel.readInt() == 0 ? false : z;
        this.m_mode = parcel.readString();
        this.m_variableName = parcel.readString();
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
