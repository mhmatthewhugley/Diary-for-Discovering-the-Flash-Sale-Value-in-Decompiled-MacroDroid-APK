package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.SelectModeActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import com.arlosoft.macrodroid.variables.VariableValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import p057a2.C2212a;
import p057a2.C2220i;
import p128m0.C7848t3;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16265l;

public class SetModeAction extends Action implements C2220i, C2212a {
    public static final Parcelable.Creator<SetModeAction> CREATOR = new C2644b();
    private static final String FROM_VARIABLE_TEXT = ("[" + SelectableItem.m15535j1(C17541R$string.string) + " " + SelectableItem.m15535j1(C17541R$string.variable_short_name) + "]");
    private static final String USER_PROMPT_TEXT = SelectableItem.m15535j1(C17541R$string.user_prompt);
    private boolean blockNextAction;
    private String m_mode;
    private transient List<String> m_modeList;
    /* access modifiers changed from: private */
    public String m_variableName;
    /* access modifiers changed from: private */
    public DictionaryKeys varDictionaryKeys;
    private transient boolean variableSelected;

    /* renamed from: com.arlosoft.macrodroid.action.SetModeAction$a */
    class C2643a implements C16265l<List<String>, C13339u> {

        /* renamed from: a */
        final /* synthetic */ MacroDroidVariable f7510a;

        C2643a(MacroDroidVariable macroDroidVariable) {
            this.f7510a = macroDroidVariable;
        }

        /* renamed from: a */
        public C13339u invoke(List<String> list) {
            String unused = SetModeAction.this.m_variableName = this.f7510a.getName();
            DictionaryKeys unused2 = SetModeAction.this.varDictionaryKeys = new DictionaryKeys(list);
            SetModeAction.this.mo24689O1();
            return null;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SetModeAction$b */
    class C2644b implements Parcelable.Creator<SetModeAction> {
        C2644b() {
        }

        /* renamed from: a */
        public SetModeAction createFromParcel(Parcel parcel) {
            return new SetModeAction(parcel, (C2643a) null);
        }

        /* renamed from: b */
        public SetModeAction[] newArray(int i) {
            return new SetModeAction[i];
        }
    }

    /* synthetic */ SetModeAction(Parcel parcel, C2643a aVar) {
        this(parcel);
    }

    /* renamed from: m3 */
    private void m12512m3() {
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
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3118hh(this, x0));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m12513o3(List list, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        if (checkedItemPosition > list.size()) {
            C15626c.makeText(mo27827K0(), C17541R$string.variable_does_not_exit, 0).show();
            return;
        }
        MacroDroidVariable macroDroidVariable = (MacroDroidVariable) list.get(checkedItemPosition);
        if (macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
            C6520o0.m24882J0(mo27850j0(), C17542R$style.Theme_App_Dialog_Action, macroDroidVariable, mo27837X0(), macroDroidVariable.mo27770n(), (C16265l<? super VariableValue, Boolean>) null, new ArrayList(), 0, C6520o0.C6538e.DONT_SHOW, false, this, new C2643a(macroDroidVariable));
            return;
        }
        this.varDictionaryKeys = null;
        this.m_variableName = macroDroidVariable.getName();
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.m_variableName != null) {
            return 1;
        }
        return this.m_modeList.indexOf(this.m_mode);
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(SelectableItem.m15535j1(C17541R$string.action_set_mode_set_mode));
        sb.append(": ");
        if (this.m_variableName != null) {
            str = this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys);
        } else {
            str = this.m_mode;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return this.m_variableName != null || this.m_mode.equals(USER_PROMPT_TEXT) || C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0())).contains(this.m_mode);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7848t3.m32817u();
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        this.variableSelected = this.m_variableName != null;
        super.mo25540W1();
    }

    /* renamed from: a0 */
    public boolean mo24825a0() {
        List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
        if (!this.m_mode.equals(mo27827K0().getString(C17541R$string.user_prompt)) && this.m_variableName == null && !Q.contains(this.m_mode)) {
            Q.add(this.m_mode);
        }
        C5163j2.m20017M4(mo27827K0(), C4061t1.m15972R(Q));
        return true;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.m_variableName = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
        this.m_modeList = Q;
        Q.add(0, FROM_VARIABLE_TEXT);
        this.m_modeList.add(0, USER_PROMPT_TEXT);
        String[] strArr = new String[this.m_modeList.size()];
        this.m_modeList.toArray(strArr);
        return strArr;
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        String str = this.m_variableName;
        if (str != null) {
            MacroDroidVariable q = mo27861q(str);
            if (q == null) {
                C4878b.m18869h("Set mode failed, variable does not exist (" + this.m_variableName + ")", mo27840Y0().longValue());
                return;
            }
            String K = q.mo27737K(this.varDictionaryKeys);
            if (K != null) {
                C4061t1.m15955F0(mo27827K0(), C4023j0.m15760t0(mo27827K0().getApplicationContext(), K, triggerContextInfo, mo27837X0()));
                if (!z2) {
                    mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
                    return;
                }
                return;
            }
            C4878b.m18869h("Set mode failed, variable does not exist (" + this.m_variableName + C6520o0.m24912e0(this.varDictionaryKeys) + ")", mo27840Y0().longValue());
        } else if (this.m_mode.equals(USER_PROMPT_TEXT)) {
            Intent intent = new Intent(mo27827K0(), SelectModeActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("guid", this.m_macro.getGUID());
            intent.putExtra("TriggerThatInvoked", this.m_macro.getTriggerThatInvoked());
            intent.putExtra("TriggerContextInfo", triggerContextInfo);
            intent.putExtra("NextActionIndex", i);
            intent.putExtra("SkipEndifIndex", stack);
            intent.putExtra("force_not_enabled", z);
            intent.putExtra("IsTest", z2);
            intent.putExtra("resume_macro_info", resumeMacroInfo);
            intent.putExtra("block_next_action", this.blockNextAction);
            mo27827K0().startActivity(intent);
        } else {
            C4061t1.m15955F0(mo27827K0(), this.m_mode);
            if (!z2) {
                mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z, stack, resumeMacroInfo);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.action_set_mode_select);
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.m_variableName;
    }

    /* renamed from: n3 */
    public String mo25647n3() {
        return this.m_mode;
    }

    /* renamed from: p3 */
    public void mo25648p3(String str) {
        this.m_mode = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (!this.variableSelected) {
            this.m_variableName = null;
            super.mo24677v2();
            return;
        }
        m12512m3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_mode);
        parcel.writeString(this.m_variableName);
        parcel.writeInt(this.blockNextAction ? 1 : 0);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.variableSelected = z;
        this.m_mode = this.m_modeList.get(i);
    }

    public SetModeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SetModeAction() {
        this.blockNextAction = true;
        List<String> Q = C4061t1.m15971Q(C5163j2.m20090X0(mo27827K0()));
        this.m_modeList = Q;
        Q.add(0, USER_PROMPT_TEXT);
        this.m_mode = this.m_modeList.get(0);
    }

    private SetModeAction(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.blockNextAction = true;
        this.m_mode = parcel.readString();
        this.m_variableName = parcel.readString();
        this.blockNextAction = parcel.readInt() == 0 ? false : z;
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
