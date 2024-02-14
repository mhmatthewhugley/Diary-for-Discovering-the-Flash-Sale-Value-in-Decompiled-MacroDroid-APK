package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
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
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6414o1;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.ArrayList;
import java.util.List;
import p057a2.C2216e;
import p057a2.C2220i;
import p057a2.C2224m;
import p128m0.C7856u4;
import p148q0.C8151a;
import p319lc.C15626c;

public class UDPCommandAction extends Action implements C2224m, C2220i, C2216e {
    public static final Parcelable.Creator<UDPCommandAction> CREATOR = new C2741c();
    private String m_destination;
    private String m_message;
    private int m_port;
    private String m_portVariableName;
    private DictionaryKeys varDictionaryKeys;
    /* access modifiers changed from: private */
    public transient DictionaryKeys workingDictionaryKeys;
    /* access modifiers changed from: private */
    public transient String workingVariableName;

    /* renamed from: com.arlosoft.macrodroid.action.UDPCommandAction$a */
    class C2739a implements C6520o0.C6540f {

        /* renamed from: a */
        final /* synthetic */ EditText f7667a;

        /* renamed from: b */
        final /* synthetic */ Button f7668b;

        /* renamed from: c */
        final /* synthetic */ EditText f7669c;

        /* renamed from: d */
        final /* synthetic */ EditText f7670d;

        C2739a(EditText editText, Button button, EditText editText2, EditText editText3) {
            this.f7667a = editText;
            this.f7668b = button;
            this.f7669c = editText2;
            this.f7670d = editText3;
        }

        /* renamed from: a */
        public void mo24722a(int i, @NonNull String str) {
            boolean z = false;
            this.f7667a.setVisibility(0);
            String unused = UDPCommandAction.this.workingVariableName = null;
            DictionaryKeys unused2 = UDPCommandAction.this.workingDictionaryKeys = null;
            Button button = this.f7668b;
            if (this.f7669c.length() > 0 && this.f7667a.length() > 0 && this.f7670d.length() > 0) {
                z = true;
            }
            button.setEnabled(z);
        }

        /* renamed from: b */
        public void mo24723b(@NonNull MacroDroidVariable macroDroidVariable, List<String> list) {
            this.f7667a.setVisibility(8);
            String unused = UDPCommandAction.this.workingVariableName = macroDroidVariable.getName();
            DictionaryKeys unused2 = UDPCommandAction.this.workingDictionaryKeys = list != null ? new DictionaryKeys(list) : null;
            this.f7668b.setEnabled(this.f7669c.length() > 0 && this.f7670d.length() > 0);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UDPCommandAction$b */
    class C2740b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7672a;

        /* renamed from: c */
        final /* synthetic */ EditText f7673c;

        /* renamed from: d */
        final /* synthetic */ EditText f7674d;

        /* renamed from: f */
        final /* synthetic */ Spinner f7675f;

        /* renamed from: g */
        final /* synthetic */ EditText f7676g;

        C2740b(Button button, EditText editText, EditText editText2, Spinner spinner, EditText editText3) {
            this.f7672a = button;
            this.f7673c = editText;
            this.f7674d = editText2;
            this.f7675f = spinner;
            this.f7676g = editText3;
        }

        public void afterTextChanged(Editable editable) {
            this.f7672a.setEnabled(this.f7673c.length() > 0 && (this.f7674d.length() > 0 || this.f7675f.getSelectedItemPosition() > 0) && this.f7676g.length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UDPCommandAction$c */
    class C2741c implements Parcelable.Creator<UDPCommandAction> {
        C2741c() {
        }

        /* renamed from: a */
        public UDPCommandAction createFromParcel(Parcel parcel) {
            return new UDPCommandAction(parcel, (C2739a) null);
        }

        /* renamed from: b */
        public UDPCommandAction[] newArray(int i) {
            return new UDPCommandAction[i];
        }
    }

    /* synthetic */ UDPCommandAction(Parcel parcel, C2739a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ boolean m13472s3(Spinner spinner, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || spinner.getCount() != 0) {
            return false;
        }
        C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_integer_variables_defined, 0).show();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m13473t3(EditText editText, EditText editText2, EditText editText3, Spinner spinner, AppCompatDialog appCompatDialog, View view) {
        this.m_message = editText.getText().toString();
        this.m_destination = editText2.getText().toString();
        try {
            this.m_port = Integer.valueOf(editText3.getText().toString()).intValue();
        } catch (Exception unused) {
            this.m_port = 0;
        }
        spinner.getSelectedItemPosition();
        this.m_portVariableName = this.workingVariableName;
        this.varDictionaryKeys = this.workingDictionaryKeys;
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static /* synthetic */ void m13475v3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m13476w3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static /* synthetic */ void m13477x3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m13478y3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_message, this.m_destination};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_message = strArr[0];
            this.m_destination = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.m_destination);
        sb.append(":");
        if (this.m_portVariableName != null) {
            obj = this.m_portVariableName + C6520o0.m24912e0(this.varDictionaryKeys);
        } else {
            obj = Integer.valueOf(this.m_port);
        }
        sb.append(obj);
        sb.append(" - ");
        sb.append(this.m_message);
        return sb.toString();
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7856u4.m32858u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            String v0 = C4023j0.m15764v0(mo27827K0(), this.m_message, triggerContextInfo, false, mo27837X0());
            String v02 = C4023j0.m15764v0(mo27827K0(), this.m_destination, triggerContextInfo, true, mo27837X0());
            int i = this.m_port;
            String str = this.m_portVariableName;
            if (str != null) {
                MacroDroidVariable q = mo27861q(str);
                if (q == null) {
                    C4878b.m18869h("UDP action, variable for port does not exist (" + this.m_portVariableName + ")", mo27840Y0().longValue());
                    return;
                }
                Long C = q.mo27732C(this.varDictionaryKeys);
                if (C != null) {
                    i = C.intValue();
                } else {
                    C4878b.m18869h("UDP action, variable for port does not exist (" + this.m_portVariableName + C6520o0.m24912e0(this.varDictionaryKeys) + ")", mo27840Y0().longValue());
                    return;
                }
            }
            new C6414o1().mo32451b(mo27827K0(), v02, i, v0);
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Could not send UDP command: " + this.m_message + " Exception:" + e.getMessage()));
        }
    }

    @Nullable
    /* renamed from: b */
    public DictionaryKeys mo24426b() {
        return this.varDictionaryKeys;
    }

    /* renamed from: f */
    public void mo24433f(String str) {
        this.m_portVariableName = str;
    }

    /* renamed from: k */
    public void mo24427k(@Nullable DictionaryKeys dictionaryKeys) {
        this.varDictionaryKeys = dictionaryKeys;
    }

    /* renamed from: m */
    public String mo24434m() {
        return this.m_portVariableName;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String str;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.dialog_udp_configure);
        appCompatDialog.setTitle((int) C17541R$string.action_udp_command);
        this.workingVariableName = this.m_portVariableName;
        this.workingDictionaryKeys = this.varDictionaryKeys;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_udp_destination);
        EditText editText2 = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_udp_port);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText3 = (EditText) appCompatDialog.findViewById(C17532R$id.dialog_udp_message);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.dialog_udp_magic_text_button);
        Button button4 = (Button) appCompatDialog.findViewById(C17532R$id.dialog_udp_magic_text_destination);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.variablesSpinner);
        String str2 = this.m_message;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        editText3.setText(str2);
        editText3.setSelection(editText3.length());
        int i = this.m_port;
        editText2.setText(i != 0 ? String.valueOf(i) : str3);
        editText2.setSelection(editText2.length());
        String str4 = this.m_destination;
        if (str4 != null) {
            str3 = str4;
        }
        editText.setText(str3);
        editText.setSelection(editText.length());
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectableItem.m15535j1(C17541R$string.enter_value));
        Activity j02 = mo27850j0();
        Macro X0 = mo27837X0();
        if (this.workingVariableName != null) {
            str = this.workingVariableName + C6520o0.m24912e0(this.workingDictionaryKeys);
        } else {
            str = null;
        }
        Spinner spinner2 = spinner;
        Button button5 = button4;
        Button button6 = button3;
        EditText editText4 = editText3;
        Activity activity = j0;
        Button button7 = button2;
        C6520o0.m24879I(j02, C17542R$style.Theme_App_Dialog_Action, this, spinner2, X0, arrayList, str, "", false, new C2739a(editText2, button, editText, editText3));
        Spinner spinner3 = spinner2;
        spinner3.setOnTouchListener(new C3012do(this, spinner3));
        boolean z = false;
        if (this.workingVariableName == null) {
            editText2.setVisibility(0);
        } else {
            editText2.setVisibility(8);
        }
        if (editText.length() > 0 && ((editText2.length() > 0 || spinner3.getSelectedItemPosition() > 0) && editText4.length() > 0)) {
            z = true;
        }
        button.setEnabled(z);
        EditText editText5 = editText;
        EditText editText6 = editText2;
        Spinner spinner4 = spinner3;
        C2740b bVar = new C2740b(button, editText5, editText6, spinner4, editText4);
        EditText editText7 = editText4;
        editText7.addTextChangedListener(bVar);
        editText.addTextChangedListener(bVar);
        editText2.addTextChangedListener(bVar);
        button.setOnClickListener(new C2983co(this, editText7, editText5, editText6, spinner4, appCompatDialog));
        button7.setOnClickListener(new C3661zn(appCompatDialog));
        Activity activity2 = activity;
        button6.setOnClickListener(new C2927ao(this, activity2, new C3069fo(editText7)));
        button5.setOnClickListener(new C2955bo(this, activity2, new C3041eo(editText)));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_message);
        parcel.writeString(this.m_destination);
        parcel.writeInt(this.m_port);
        parcel.writeString(this.m_portVariableName);
        parcel.writeParcelable(this.varDictionaryKeys, i);
    }

    public UDPCommandAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private UDPCommandAction() {
    }

    private UDPCommandAction(Parcel parcel) {
        super(parcel);
        this.m_message = parcel.readString();
        this.m_destination = parcel.readString();
        this.m_port = parcel.readInt();
        this.m_portVariableName = parcel.readString();
        this.varDictionaryKeys = (DictionaryKeys) parcel.readParcelable(DictionaryKeys.class.getClassLoader());
    }
}
