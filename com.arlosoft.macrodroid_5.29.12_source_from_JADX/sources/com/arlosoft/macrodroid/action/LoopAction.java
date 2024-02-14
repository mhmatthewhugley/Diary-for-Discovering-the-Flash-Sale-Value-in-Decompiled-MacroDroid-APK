package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2216e;
import p057a2.C2219h;
import p128m0.C7889z1;
import p319lc.C15626c;

public class LoopAction extends ParentAction implements C2219h, C2216e {
    public static final Parcelable.Creator<LoopAction> CREATOR = new C2527c();
    private DictionaryKeys fixedOptionDictionaryKeys;
    private int m_fixedOptionCount = 0;
    private MacroDroidVariable m_fixedOptionVariable;
    private transient int m_loopCount;
    protected int m_option;
    private transient int m_selectionOption;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient MacroDroidVariable workingVariable;

    /* renamed from: com.arlosoft.macrodroid.action.LoopAction$a */
    class C2525a implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ EditText f7354a;

        /* renamed from: b */
        final /* synthetic */ Button f7355b;

        C2525a(EditText editText, Button button) {
            this.f7354a = editText;
            this.f7355b = button;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            this.f7354a.setVisibility(0);
            MacroDroidVariable unused = LoopAction.this.workingVariable = null;
            DictionaryKeys unused2 = LoopAction.this.workingDictionaryKeys = null;
            if (TextUtils.isEmpty(this.f7354a.getText().toString()) || Integer.valueOf(this.f7354a.getText().toString()).intValue() == 0) {
                this.f7355b.setEnabled(false);
            } else {
                this.f7355b.setEnabled(true);
            }
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f7354a.setVisibility(8);
            MacroDroidVariable unused = LoopAction.this.workingVariable = macroDroidVariable;
            DictionaryKeys unused2 = LoopAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
            this.f7355b.setEnabled(true);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LoopAction$b */
    class C2526b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7357a;

        /* renamed from: c */
        final /* synthetic */ EditText f7358c;

        C2526b(Button button, EditText editText) {
            this.f7357a = button;
            this.f7358c = editText;
        }

        public void afterTextChanged(Editable editable) {
            try {
                this.f7357a.setEnabled(!TextUtils.isEmpty(this.f7358c.getText().toString()) && Integer.valueOf(this.f7358c.getText().toString()).intValue() != 0);
            } catch (NumberFormatException unused) {
                this.f7357a.setEnabled(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.LoopAction$c */
    class C2527c implements Parcelable.Creator<LoopAction> {
        C2527c() {
        }

        /* renamed from: a */
        public LoopAction createFromParcel(Parcel parcel) {
            return new LoopAction(parcel);
        }

        /* renamed from: b */
        public LoopAction[] newArray(int i) {
            return new LoopAction[i];
        }
    }

    public LoopAction() {
    }

    /* renamed from: Q3 */
    private void m11331Q3() {
        String str;
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_loop_for_configure);
        appCompatDialog.setTitle((int) C17541R$string.action_loop);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        this.workingVariable = this.m_fixedOptionVariable;
        this.workingDictionaryKeys = this.fixedOptionDictionaryKeys;
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.dialog_loop_for_variable);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_loop_for_use_number_edittext);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        editText.setText(String.valueOf(this.m_fixedOptionCount));
        editText.setSelection(editText.length());
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectableItem.m15535j1(C17541R$string.fixed_count));
        Activity j0 = mo27850j0();
        Macro X0 = mo27837X0();
        if (this.m_fixedOptionVariable != null) {
            str = this.m_fixedOptionVariable.getName() + C6520o0.m24912e0(this.fixedOptionDictionaryKeys);
        } else {
            str = null;
        }
        C6520o0.m24879I(j0, C17542R$style.Theme_App_Dialog_Action, this, spinner, X0, arrayList, str, "", false, new C2525a(editText, button));
        if (this.workingVariable == null) {
            editText.setVisibility(0);
        } else {
            editText.setVisibility(8);
        }
        spinner.setOnTouchListener(new C3592x8(this, spinner));
        editText.addTextChangedListener(new C2526b(button, editText));
        button.setOnClickListener(new C3565w8(this, editText, appCompatDialog));
        button2.setOnClickListener(new C3537v8(appCompatDialog));
        appCompatDialog.show();
    }

    /* renamed from: S3 */
    private String[] m11332S3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_loop_fixed_number), SelectableItem.m15535j1(C17541R$string.action_loop_while_do_option), SelectableItem.m15535j1(C17541R$string.action_loop_do_while_option)};
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ boolean m11333U3(Spinner spinner, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || spinner.getAdapter().getCount() > 1) {
            return false;
        }
        C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_integer_variables_defined, 0).show();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void m11334V3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_fixedOptionCount = Integer.valueOf(editText.getText().toString()).intValue();
        this.m_fixedOptionVariable = this.workingVariable;
        this.fixedOptionDictionaryKeys = this.workingDictionaryKeys;
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        int i = this.m_option;
        this.m_selectionOption = i;
        return i;
    }

    /* renamed from: E0 */
    public String mo25226E0() {
        return mo24738G0() + ": " + mo24672O0();
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        Object obj;
        int i = this.m_option;
        if (i == 1) {
            return mo27827K0().getString(C17541R$string.action_loop_while_do);
        }
        if (i == 2) {
            return SelectableItem.m15535j1(C17541R$string.action_loop_do_while);
        }
        String j1 = SelectableItem.m15535j1(C17541R$string.action_loop_number_times);
        Object[] objArr = new Object[1];
        if (this.m_fixedOptionVariable == null) {
            obj = Integer.valueOf(this.m_fixedOptionCount);
        } else {
            obj = "<" + this.m_fixedOptionVariable.getName() + C6520o0.m24912e0(this.fixedOptionDictionaryKeys) + ">";
        }
        objArr[0] = obj;
        return String.format(j1, objArr);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_option == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (mo27826J0().size() > i) {
                sb.append(mo27826J0().get(i).mo27823H0());
                if (i < mo27826J0().size() - 1 && i < 4) {
                    sb.append(" ");
                    sb.append(SelectableItem.m15535j1(mo27825I0() ? C17541R$string.f7057or : C17541R$string.and));
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        this.m_option = this.m_selectionOption;
        super.mo24689O1();
    }

    /* renamed from: R3 */
    public int mo25325R3() {
        return this.m_option;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7889z1.m33015u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: T3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25326T3() {
        /*
            r5 = this;
            int r0 = r5.m_loopCount
            r1 = 1
            int r0 = r0 + r1
            r5.m_loopCount = r0
            com.arlosoft.macrodroid.common.MacroDroidVariable r2 = r5.m_fixedOptionVariable
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r5.m_fixedOptionCount
            if (r0 > r2) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        L_0x0012:
            java.lang.String r0 = r2.getName()
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r5.mo27861q(r0)
            java.lang.String r2 = "Variable not found: "
            if (r0 == 0) goto L_0x004b
            com.arlosoft.macrodroid.variables.DictionaryKeys r4 = r5.fixedOptionDictionaryKeys
            java.lang.Long r4 = r0.mo27732C(r4)
            if (r4 == 0) goto L_0x002b
            int r2 = r4.intValue()
            goto L_0x0064
        L_0x002b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r0.getName()
            r4.append(r2)
            com.arlosoft.macrodroid.variables.DictionaryKeys r2 = r5.fixedOptionDictionaryKeys
            java.lang.String r2 = com.arlosoft.macrodroid.variables.C6520o0.m24912e0(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r2)
            goto L_0x0063
        L_0x004b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            com.arlosoft.macrodroid.common.MacroDroidVariable r2 = r5.m_fixedOptionVariable
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r2)
        L_0x0063:
            r2 = 0
        L_0x0064:
            if (r0 == 0) goto L_0x006b
            int r0 = r5.m_loopCount
            if (r0 > r2) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.LoopAction.mo25326T3():boolean");
    }

    /* renamed from: X3 */
    public void mo25327X3() {
        this.m_loopCount = 0;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.fixedOptionDictionaryKeys;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m11332S3();
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys) {
        this.fixedOptionDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: s */
    public MacroDroidVariable mo24432s() {
        return this.m_fixedOptionVariable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.m_selectionOption;
        if (i == 0) {
            m11331Q3();
        } else if (i == 1 || i == 2) {
            mo24877t3(true, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w3 */
    public String mo24878w3() {
        return SelectableItem.m15535j1(C17541R$string.enter_condition_loop);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_fixedOptionCount);
        parcel.writeParcelable(this.m_fixedOptionVariable, i);
        parcel.writeParcelable(this.fixedOptionDictionaryKeys, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_selectionOption = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y3 */
    public String mo24880y3() {
        StringBuilder sb = new StringBuilder(mo24738G0());
        if (this.m_option == 0) {
            return sb.toString();
        }
        sb.append(" (");
        int size = mo27826J0().size();
        for (int i = 0; i < size; i++) {
            sb.append(mo27826J0().get(i).mo24738G0());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(") ");
        return sb.toString();
    }

    public LoopAction(Activity activity, Macro macro) {
        super(activity, macro);
        mo27877y2(activity);
        this.m_macro = macro;
    }

    protected LoopAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_fixedOptionCount = parcel.readInt();
        this.m_fixedOptionVariable = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.fixedOptionDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
