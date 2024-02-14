package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.IncomingSMS;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.receivers.IncomingSMSTriggerReceiver;
import com.arlosoft.macrodroid.triggers.services.SMSReceivedDetectService;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p119k3.C7537o0;
import p129m1.C7893a;
import p129m1.C7897h;
import p135n1.C7966c;
import p135n1.C7967d;
import p148q0.C8151a;
import p215b8.C11102b;
import p440y9.C16971a;

public class IncomingSMSTrigger extends Trigger implements C2224m {
    public static final Parcelable.Creator<IncomingSMSTrigger> CREATOR = new C5665d();
    private static final String SMS_RECEIVED_ACTION = "android.provider.Telephony.SMS_RECEIVED";
    private static IncomingSMSTriggerReceiver s_incomingSMSTriggerReceiver;
    private static int s_triggerCounter;
    private boolean enableRegex;
    /* access modifiers changed from: private */
    public boolean isExcludeContact;
    private transient boolean lastValidCheck;
    private boolean m_exactMatch;
    private boolean m_excludes;
    private List<String> m_groupIdList;
    private List<String> m_groupNameList;
    private int m_option;
    private String m_smsContent;
    /* access modifiers changed from: private */
    public Contact m_smsFrom;
    /* access modifiers changed from: private */
    public List<Contact> m_smsFromList;
    private String m_smsNumber;
    private boolean m_smsNumberExclude;
    private transient int workingOption;

    /* renamed from: com.arlosoft.macrodroid.triggers.IncomingSMSTrigger$a */
    class C5662a implements C7893a {
        C5662a() {
        }

        /* renamed from: a */
        public void mo31007a(@NonNull List<? extends Contact> list, boolean z) {
            IncomingSMSTrigger.this.mo31215e4((Contact) null);
            boolean unused = IncomingSMSTrigger.this.isExcludeContact = z;
            IncomingSMSTrigger.this.m_smsFromList.clear();
            IncomingSMSTrigger.this.m_smsFromList.addAll(list);
            Contact unused2 = IncomingSMSTrigger.this.m_smsFrom = null;
            IncomingSMSTrigger.this.m22374c4();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.IncomingSMSTrigger$b */
    class C5663b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13627a;

        /* renamed from: c */
        final /* synthetic */ EditText f13628c;

        C5663b(Button button, EditText editText) {
            this.f13627a = button;
            this.f13628c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13627a.setEnabled(this.f13628c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.IncomingSMSTrigger$c */
    class C5664c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13630a;

        /* renamed from: c */
        final /* synthetic */ EditText f13631c;

        C5664c(Button button, EditText editText) {
            this.f13630a = button;
            this.f13631c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13630a.setEnabled(this.f13631c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.IncomingSMSTrigger$d */
    class C5665d implements Parcelable.Creator<IncomingSMSTrigger> {
        C5665d() {
        }

        /* renamed from: a */
        public IncomingSMSTrigger createFromParcel(Parcel parcel) {
            return new IncomingSMSTrigger(parcel, (C5662a) null);
        }

        /* renamed from: b */
        public IncomingSMSTrigger[] newArray(int i) {
            return new IncomingSMSTrigger[i];
        }
    }

    /* synthetic */ IncomingSMSTrigger(Parcel parcel, C5662a aVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private void m22355D1() {
        this.m_smsFromList = new ArrayList();
        this.m_groupIdList = new ArrayList();
        this.m_groupNameList = new ArrayList();
        this.workingOption = m22356F3();
    }

    /* renamed from: F3 */
    private int m22356F3() {
        int i = this.m_option;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: H3 */
    private String[] m22357H3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.select_contacts), SelectableItem.m15535j1(C17541R$string.select_groups), SelectableItem.m15535j1(C17541R$string.select_number), SelectableItem.m15535j1(C17541R$string.any_number)};
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static /* synthetic */ void m22358M3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public static /* synthetic */ void m22359N3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O3 */
    public /* synthetic */ void m22360O3(RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, CheckBox checkBox, CheckBox checkBox2, AppCompatDialog appCompatDialog, View view) {
        if (radioButton.isChecked()) {
            this.m_smsContent = "";
        } else {
            this.m_smsContent = editText.getText().toString().trim();
            if (radioButton2.isChecked()) {
                this.m_excludes = true;
            } else {
                this.m_exactMatch = radioButton3.isChecked();
                this.m_excludes = false;
            }
        }
        this.enableRegex = checkBox.isChecked();
        if (C5163j2.m20249r2(mo27827K0()) != checkBox2.isChecked()) {
            C5163j2.m20173h6(mo27827K0(), checkBox2.isChecked());
            m22375d4();
        }
        this.m_option = this.workingOption;
        appCompatDialog.dismiss();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public static /* synthetic */ void m22362Q3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public /* synthetic */ void m22363R3(C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(mo27850j0(), eVar, mo27837X0(), false, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public static /* synthetic */ void m22364S3(EditText editText, Button button, Button button2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        editText.setEnabled(!z);
        button.setEnabled(!z);
        boolean z2 = false;
        if (!z) {
            if (editText.getText().length() > 0) {
                z2 = true;
            }
            button2.setEnabled(z2);
            return;
        }
        button2.setEnabled(true);
        radioButton.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public static /* synthetic */ void m22365T3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public /* synthetic */ void m22366U3(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            C7897h.m33052c(mo27850j0(), mo24688L0(), mo31205A3(), this.m_smsFrom, this.isExcludeContact, false, false, new C5662a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V3 */
    public /* synthetic */ void m22367V3(List list, DialogInterface dialogInterface, int i, boolean z) {
        if (z) {
            this.m_groupIdList.add(((C7966c) list.get(i)).f19106a);
            this.m_groupNameList.add(((C7966c) list.get(i)).f19107b);
        } else {
            this.m_groupIdList.remove(((C7966c) list.get(i)).f19106a);
            this.m_groupNameList.remove(((C7966c) list.get(i)).f19107b);
        }
        ((AlertDialog) dialogInterface).getButton(-1).setEnabled(this.m_groupIdList.size() > 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public /* synthetic */ void m22368W3(List list, DialogInterface dialogInterface, int i) {
        SparseBooleanArray checkedItemPositions = ((AlertDialog) dialogInterface).getListView().getCheckedItemPositions();
        this.m_groupIdList.clear();
        this.m_groupNameList.clear();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                C7966c cVar = (C7966c) list.get(checkedItemPositions.keyAt(i2));
                this.m_groupIdList.add(cVar.f19106a);
                this.m_groupNameList.add(cVar.f19107b);
            }
        }
        m22374c4();
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public /* synthetic */ void m22369X3(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            m22378g4();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public static /* synthetic */ void m22370Y3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public /* synthetic */ void m22371Z3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, false, true, C17542R$style.Theme_App_Dialog_Trigger_SmallText, C7967d.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public /* synthetic */ void m22372a4(EditText editText, CheckBox checkBox, AppCompatDialog appCompatDialog, View view) {
        this.m_smsNumber = editText.getText().toString();
        this.m_smsNumberExclude = checkBox.isChecked();
        appCompatDialog.dismiss();
        m22374c4();
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public void m22374c4() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.sms_content_dialog);
        appCompatDialog.setTitle((int) C17541R$string.trigger_incoming_sms_title);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.sms_content_dialog_text_content);
        RadioButton radioButton = (RadioButton) appCompatDialog.findViewById(C17532R$id.sms_content_dialog_any_radio_button);
        RadioButton radioButton2 = (RadioButton) appCompatDialog.findViewById(C17532R$id.sms_content_dialog_matches_radio_button);
        RadioButton radioButton3 = (RadioButton) appCompatDialog.findViewById(C17532R$id.sms_content_dialog_contains_radio_button);
        RadioButton radioButton4 = (RadioButton) appCompatDialog.findViewById(C17532R$id.sms_content_dialog_excludes_radio_button);
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.special_text_button);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.enable_regex);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.monitorInboxCheckbox);
        checkBox2.setChecked(C5163j2.m20249r2(mo27827K0()));
        checkBox2.setVisibility(0);
        ((TextView) appCompatDialog.findViewById(C17532R$id.monitorInboxSummary)).setVisibility(0);
        editText.setEnabled(false);
        button3.setEnabled(false);
        checkBox.setChecked(this.enableRegex);
        String str = this.m_smsContent;
        if (str == null || str.length() <= 0) {
            radioButton.setChecked(true);
        } else {
            radioButton.setChecked(false);
            editText.setText(this.m_smsContent);
            editText.setSelection(editText.length());
            editText.setEnabled(true);
            button3.setEnabled(true);
            if (this.m_excludes) {
                radioButton4.setChecked(true);
            } else if (this.m_exactMatch) {
                radioButton2.setChecked(true);
            } else {
                radioButton3.setChecked(true);
            }
        }
        Button button4 = button2;
        C5873b4 b4Var = r1;
        CheckBox checkBox3 = checkBox2;
        RadioButton radioButton5 = radioButton2;
        C5873b4 b4Var2 = new C5873b4(editText, button3, button, radioButton5, radioButton3, radioButton4);
        radioButton.setOnCheckedChangeListener(b4Var);
        radioButton2.setOnCheckedChangeListener(new C5885c4(radioButton, radioButton3, radioButton4));
        radioButton3.setOnCheckedChangeListener(new C6040p3(radioButton2, radioButton, radioButton4));
        radioButton4.setOnCheckedChangeListener(new C6028o3(radioButton2, radioButton3, radioButton));
        editText.addTextChangedListener(new C5664c(button, editText));
        button.setOnClickListener(new C6209z3(this, radioButton, editText, radioButton4, radioButton5, checkBox, checkBox3, appCompatDialog));
        button4.setOnClickListener(new C6173w3(appCompatDialog));
        button3.setOnClickListener(new C5810a4(this, new C6137t3(editText)));
        appCompatDialog.show();
    }

    /* renamed from: d4 */
    private void m22375d4() {
        List<Macro> z = C4934n.m18998M().mo29710z();
        ArrayList<Trigger> arrayList = new ArrayList<>();
        for (Macro triggerList : z) {
            Iterator<Trigger> it = triggerList.getTriggerList().iterator();
            while (it.hasNext()) {
                Trigger next = it.next();
                if ((next instanceof IncomingSMSTrigger) && next.f13696a) {
                    next.mo31543T2();
                    arrayList.add(next);
                }
            }
        }
        for (Trigger V2 : arrayList) {
            V2.mo31544V2();
        }
    }

    /* renamed from: f4 */
    private void m22376f4() {
        new C11102b((FragmentActivity) mo27850j0()).mo62231o("android.permission.READ_CONTACTS").mo79679I(C16971a.m100210a()).mo79685P(new C6064r3(this));
    }

    /* renamed from: g4 */
    private void m22378g4() {
        List<C7966c> B = C4061t1.m15946B(mo27827K0());
        boolean[] zArr = new boolean[B.size()];
        String[] strArr = new String[B.size()];
        boolean z = false;
        for (int i = 0; i < B.size(); i++) {
            strArr[i] = B.get(i).f19107b;
            if (this.m_groupIdList.contains(B.get(i).f19106a)) {
                zArr[i] = true;
                z = true;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.trigger_incoming_sms_from);
        builder.setMultiChoiceItems((CharSequence[]) strArr, zArr, (DialogInterface.OnMultiChoiceClickListener) new C6149u3(this, B));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6016n3(this, B));
        AlertDialog create = builder.create();
        create.show();
        if (!z) {
            create.getButton(-1).setEnabled(false);
        }
    }

    /* renamed from: h4 */
    private void m22380h4() {
        new C11102b((FragmentActivity) mo27850j0()).mo62231o("android.permission.READ_CONTACTS").mo79679I(C16971a.m100210a()).mo79685P(new C6052q3(this));
    }

    /* renamed from: i4 */
    private void m22382i4() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.enter_number_dialog);
            appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.select_number));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_phone_number);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_magic_text_button);
            CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.exclude_number);
            boolean z = false;
            checkBox.setVisibility(0);
            ((TextView) appCompatDialog.findViewById(C17532R$id.wildcard_Text)).setVisibility(0);
            checkBox.setChecked(this.m_smsNumberExclude);
            String str = this.m_smsNumber;
            if (str != null) {
                editText.setText(str);
                editText.setSelection(editText.length());
            }
            editText.addTextChangedListener(new C5663b(button, editText));
            button3.setOnClickListener(new C6185x3(this, j0, new C6085s3(editText)));
            button.setOnClickListener(new C6197y3(this, editText, checkBox, appCompatDialog));
            if (editText.getText().length() > 0) {
                z = true;
            }
            button.setEnabled(z);
            button2.setOnClickListener(new C6161v3(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* renamed from: A3 */
    public List<Contact> mo31205A3() {
        Contact contact;
        if (this.m_smsFromList.size() == 0 && (contact = this.m_smsFrom) != null) {
            this.m_smsFromList.add(contact);
        }
        return this.m_smsFromList;
    }

    /* renamed from: B3 */
    public String mo31206B3() {
        return this.m_smsContent;
    }

    /* renamed from: C3 */
    public boolean mo31207C3() {
        return this.m_smsNumberExclude;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        if (this.workingOption == 0) {
            List<Contact> A3 = mo31205A3();
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= A3.size()) {
                    break;
                } else if (A3.get(i2).mo27709b().equals("-2")) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i >= 0) {
                A3.remove(i);
                this.workingOption = 3;
                return 3;
            }
        }
        return this.workingOption;
    }

    /* renamed from: D3 */
    public List<String> mo31208D3() {
        return this.m_groupIdList;
    }

    /* renamed from: E3 */
    public String mo31209E3() {
        return this.m_smsNumber;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_smsContent};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        int F3 = m22356F3();
        if (F3 == 3) {
            return SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_from) + " " + SelectableItem.m15535j1(C17541R$string.any_number);
        }
        String str = "";
        if (F3 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_from));
            sb.append(" ");
            if (this.m_smsNumberExclude) {
                str = "(" + SelectableItem.m15535j1(C17541R$string.excludes) + ") ";
            }
            sb.append(str);
            sb.append(this.m_smsNumber);
            return sb.toString();
        } else if (F3 != 1) {
            String str2 = "!(";
            if (this.m_smsFrom != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_from));
                sb2.append(" ");
                if (!this.isExcludeContact) {
                    str2 = str;
                }
                sb2.append(str2);
                sb2.append(this.m_smsFrom.mo27713g());
                if (this.isExcludeContact) {
                    str = ")";
                }
                sb2.append(str);
                return sb2.toString();
            } else if (this.m_smsFromList.size() == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_from));
                sb3.append(" ");
                if (!this.isExcludeContact) {
                    str2 = str;
                }
                sb3.append(str2);
                sb3.append(this.m_smsFromList.get(0).mo27713g());
                if (this.isExcludeContact) {
                    str = ")";
                }
                sb3.append(str);
                return sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_from));
                sb4.append(" ");
                if (!this.isExcludeContact) {
                    str2 = str;
                }
                sb4.append(str2);
                sb4.append(this.m_smsFromList.size());
                sb4.append(" ");
                sb4.append(SelectableItem.m15535j1(C17541R$string.contacts));
                if (this.isExcludeContact) {
                    str = ")";
                }
                sb4.append(str);
                return sb4.toString();
            }
        } else if (this.m_groupNameList.size() == 1) {
            return SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_from) + " " + this.m_groupNameList.get(0);
        } else {
            return SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_from) + " " + this.m_groupNameList.size() + " " + SelectableItem.m15535j1(C17541R$string.groups);
        }
    }

    /* renamed from: G3 */
    public int mo31210G3() {
        return this.m_option;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_smsContent = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: I3 */
    public boolean mo31211I3() {
        return this.enableRegex;
    }

    /* renamed from: J3 */
    public boolean mo31212J3() {
        return this.m_exactMatch;
    }

    /* renamed from: K3 */
    public boolean mo31213K3() {
        return this.isExcludeContact;
    }

    /* renamed from: L3 */
    public boolean mo31214L3() {
        return this.m_excludes;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        int F3 = m22356F3();
        if (F3 == 0) {
            if (this.m_smsFrom == null && this.m_smsFromList.size() == 0) {
                return false;
            }
            Contact contact = this.m_smsFrom;
            if (contact == null || !contact.mo27709b().equals("Select_Contact")) {
                return true;
            }
            return false;
        } else if (F3 != 1) {
            return true;
        } else {
            if (this.m_groupIdList.size() == 1) {
                boolean y = C4061t1.m16029y(mo27827K0(), this.m_groupIdList.get(0));
                this.lastValidCheck = y;
                return y;
            } else if (this.m_groupIdList.size() != 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_smsContent;
        if (str == null || str.length() == 0) {
            return SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_any_content);
        }
        if (this.m_excludes) {
            return SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_excludes) + " " + this.m_smsContent;
        } else if (this.m_exactMatch) {
            return SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_matches) + " " + this.m_smsContent;
        } else {
            return SelectableItem.m15535j1(C17541R$string.trigger_incoming_sms_contains) + " " + this.m_smsContent;
        }
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        int i = s_triggerCounter - 1;
        s_triggerCounter = i;
        if (i == 0) {
            MacroDroidApplication.m14845u().stopService(new Intent(mo27827K0(), SMSReceivedDetectService.class));
            try {
                if (s_incomingSMSTriggerReceiver != null) {
                    MacroDroidApplication.m14845u().unregisterReceiver(s_incomingSMSTriggerReceiver);
                    s_incomingSMSTriggerReceiver = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7537o0.m31366u();
    }

    @CallSuper
    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        this.m_groupIdList = new ArrayList();
        this.m_groupNameList = new ArrayList();
        String str = this.m_smsNumber;
        if (str == null || !str.startsWith("[")) {
            this.m_smsNumber = "123456789";
        }
        ArrayList arrayList = new ArrayList();
        for (Contact next : this.m_smsFromList) {
            if (next.mo27709b().equals("-1")) {
                arrayList.add(0, new Contact("-1", C4061t1.f10624d, "-1"));
            } else if (next.mo27709b().equals("-2")) {
                arrayList.add(0, new Contact("-2", C4061t1.f10625e, "-2"));
            } else if (next.mo27709b().equals("-3")) {
                arrayList.add(0, new Contact("-3", C4061t1.f10626f, "-3"));
            }
        }
        this.m_smsFromList = arrayList;
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            if (C5163j2.m20249r2(mo27827K0())) {
                MacroDroidApplication.m14845u().startService(new Intent(mo27827K0(), SMSReceivedDetectService.class));
            } else {
                s_incomingSMSTriggerReceiver = new IncomingSMSTriggerReceiver();
                IntentFilter intentFilter = new IntentFilter(SMS_RECEIVED_ACTION);
                intentFilter.setPriority(Integer.MAX_VALUE);
                MacroDroidApplication.m14845u().registerReceiver(s_incomingSMSTriggerReceiver, intentFilter);
            }
        }
        s_triggerCounter++;
    }

    /* renamed from: Y2 */
    public TriggerContextInfo mo30911Y2() {
        return new TriggerContextInfo((Trigger) this, new IncomingSMS("test contact name", "test message", "test from number"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x003e A[EDGE_INSN: B:48:0x003e->B:44:0x003e ?: BREAK  , SYNTHETIC] */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24825a0() {
        /*
            r9 = this;
            int r0 = r9.m22356F3()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x009e
            android.content.Context r0 = r9.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15950D(r0)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10624d
            java.lang.String r5 = "-1"
            r3.<init>(r5, r4, r5)
            r0.add(r1, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10625e
            java.lang.String r6 = "-2"
            r3.<init>(r6, r4, r6)
            r0.add(r1, r3)
            com.arlosoft.macrodroid.common.Contact r3 = new com.arlosoft.macrodroid.common.Contact
            java.lang.String r4 = com.arlosoft.macrodroid.common.C4061t1.f10626f
            java.lang.String r7 = "-3"
            r3.<init>(r7, r4, r7)
            r0.add(r1, r3)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x009c
            java.util.Iterator r0 = r0.iterator()
        L_0x003e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0090
            java.lang.Object r3 = r0.next()
            com.arlosoft.macrodroid.common.Contact r3 = (com.arlosoft.macrodroid.common.Contact) r3
            com.arlosoft.macrodroid.common.Contact r4 = r9.m_smsFrom
            if (r4 == 0) goto L_0x0062
            java.lang.String r4 = r3.mo27713g()
            com.arlosoft.macrodroid.common.Contact r7 = r9.m_smsFrom
            java.lang.String r7 = r7.mo27713g()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x003e
            r9.m_smsFrom = r3
            r1 = 1
            goto L_0x0090
        L_0x0062:
            java.util.List<com.arlosoft.macrodroid.common.Contact> r4 = r9.m_smsFromList
            java.util.Iterator r4 = r4.iterator()
        L_0x0068:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x003e
            java.lang.Object r7 = r4.next()
            com.arlosoft.macrodroid.common.Contact r7 = (com.arlosoft.macrodroid.common.Contact) r7
            java.lang.String r8 = r3.mo27709b()
            if (r8 == r5) goto L_0x008e
            java.lang.String r8 = r3.mo27709b()
            if (r8 == r6) goto L_0x008e
            java.lang.String r8 = r3.mo27713g()
            java.lang.String r7 = r7.mo27713g()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0068
        L_0x008e:
            r1 = 1
            goto L_0x003e
        L_0x0090:
            if (r1 != 0) goto L_0x009c
            r0 = 0
            r9.m_smsFrom = r0
            java.util.List r0 = r9.mo31205A3()
            r0.clear()
        L_0x009c:
            r2 = r1
            goto L_0x0103
        L_0x009e:
            android.content.Context r0 = r9.mo27827K0()
            java.lang.String r3 = "android.permission.READ_CONTACTS"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r3)
            if (r0 == 0) goto L_0x0103
            android.content.Context r0 = r9.mo27827K0()
            java.util.List r0 = com.arlosoft.macrodroid.common.C4061t1.m15946B(r0)
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0103
            r3 = 0
        L_0x00b9:
            java.util.List<java.lang.String> r4 = r9.m_groupIdList
            int r4 = r4.size()
            if (r1 >= r4) goto L_0x00f6
            java.util.List<java.lang.String> r4 = r9.m_groupIdList
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.util.List<java.lang.String> r5 = r9.m_groupNameList
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Iterator r6 = r0.iterator()
        L_0x00d5:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00f3
            java.lang.Object r7 = r6.next()
            n1.c r7 = (p135n1.C7966c) r7
            java.lang.String r8 = r7.f19106a
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x00d5
            java.lang.String r7 = r7.f19107b
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x00d5
            r3 = 1
            goto L_0x00d5
        L_0x00f3:
            int r1 = r1 + 1
            goto L_0x00b9
        L_0x00f6:
            if (r3 != 0) goto L_0x0102
            java.util.List<java.lang.String> r0 = r9.m_groupNameList
            r0.clear()
            java.util.List<java.lang.String> r0 = r9.m_groupIdList
            r0.clear()
        L_0x0102:
            r2 = r3
        L_0x0103:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.triggers.IncomingSMSTrigger.mo24825a0():boolean");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        int i = this.m_option;
        if (i == 0 || i == 1) {
            return new String[]{"android.permission.RECEIVE_SMS", "android.permission.READ_CONTACTS"};
        }
        return new String[]{"android.permission.RECEIVE_SMS"};
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        int i = this.m_option;
        if (i == 0 || i == 1) {
            return new String[]{"android.permission.READ_CONTACTS"};
        }
        return new String[0];
    }

    /* renamed from: e4 */
    public void mo31215e4(Contact contact) {
        this.m_smsFrom = contact;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m22357H3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: m1 */
    public String mo27854m1() {
        return mo25559a1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.workingOption;
        if (i == 0) {
            m22376f4();
        } else if (i == 1) {
            m22380h4();
        } else if (i == 2) {
            m22382i4();
        } else if (i == 3) {
            m22374c4();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_smsFrom, i);
        parcel.writeString(this.m_smsContent);
        parcel.writeInt(this.m_exactMatch ^ true ? 1 : 0);
        Contact[] contactArr = new Contact[this.m_smsFromList.size()];
        this.m_smsFromList.toArray(contactArr);
        parcel.writeParcelableArray(contactArr, i);
        parcel.writeInt(this.m_excludes ^ true ? 1 : 0);
        parcel.writeInt(m22356F3());
        parcel.writeStringList(this.m_groupIdList);
        parcel.writeStringList(this.m_groupNameList);
        parcel.writeString(this.m_smsNumber);
        parcel.writeInt(this.m_smsNumberExclude ? 1 : 0);
        parcel.writeInt(this.enableRegex ? 1 : 0);
        parcel.writeInt(this.isExcludeContact ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.workingOption = i;
    }

    public IncomingSMSTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public IncomingSMSTrigger() {
        this.workingOption = 0;
        this.m_option = -1;
        this.lastValidCheck = true;
        this.m_smsFrom = null;
        m22355D1();
    }

    private IncomingSMSTrigger(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.workingOption = 0;
        this.m_option = -1;
        this.lastValidCheck = true;
        m22355D1();
        this.m_smsFrom = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.m_smsContent = parcel.readString();
        this.m_exactMatch = parcel.readInt() == 0;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(Contact.class.getClassLoader());
        if (readParcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            this.m_smsFromList = arrayList;
            Collections.addAll(arrayList, (Contact[]) Arrays.copyOf(readParcelableArray, readParcelableArray.length, Contact[].class));
        }
        this.m_excludes = parcel.readInt() == 0;
        this.m_option = parcel.readInt();
        parcel.readStringList(this.m_groupIdList);
        parcel.readStringList(this.m_groupNameList);
        this.m_smsNumber = parcel.readString();
        this.m_smsNumberExclude = parcel.readInt() != 0;
        this.enableRegex = parcel.readInt() != 0;
        this.isExcludeContact = parcel.readInt() != 0 ? true : z;
    }
}
