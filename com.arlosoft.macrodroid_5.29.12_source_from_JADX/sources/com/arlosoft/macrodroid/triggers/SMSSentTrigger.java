package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.services.SMSSentDetectService;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.util.ArrayList;
import java.util.List;
import p119k3.C7538o1;
import p129m1.C7893a;
import p129m1.C7897h;

public class SMSSentTrigger extends Trigger {
    public static final Parcelable.Creator<SMSSentTrigger> CREATOR = new C5730c();
    private static int s_triggerCounter;
    /* access modifiers changed from: private */
    public boolean isExcludeContact;
    /* access modifiers changed from: private */
    public Contact m_contact;
    /* access modifiers changed from: private */
    public List<Contact> m_contactList;
    private boolean m_exactMatch;
    private boolean m_excludes;
    private String m_smsContent;

    /* renamed from: com.arlosoft.macrodroid.triggers.SMSSentTrigger$a */
    class C5728a implements C7893a {
        C5728a() {
        }

        /* renamed from: a */
        public void mo31007a(@NonNull List<? extends Contact> list, boolean z) {
            SMSSentTrigger.this.mo31441C3((Contact) null);
            boolean unused = SMSSentTrigger.this.isExcludeContact = z;
            SMSSentTrigger.this.m_contactList.clear();
            SMSSentTrigger.this.m_contactList.addAll(list);
            Contact unused2 = SMSSentTrigger.this.m_contact = null;
            SMSSentTrigger.this.m23047B3();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.SMSSentTrigger$b */
    class C5729b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f13674a;

        /* renamed from: c */
        final /* synthetic */ EditText f13675c;

        C5729b(Button button, EditText editText) {
            this.f13674a = button;
            this.f13675c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f13674a.setEnabled(this.f13675c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.SMSSentTrigger$c */
    class C5730c implements Parcelable.Creator<SMSSentTrigger> {
        C5730c() {
        }

        /* renamed from: a */
        public SMSSentTrigger createFromParcel(Parcel parcel) {
            return new SMSSentTrigger(parcel, (C5728a) null);
        }

        /* renamed from: b */
        public SMSSentTrigger[] newArray(int i) {
            return new SMSSentTrigger[i];
        }
    }

    /* synthetic */ SMSSentTrigger(Parcel parcel, C5728a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public void m23047B3() {
        if (mo27836X()) {
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
            editText.setEnabled(false);
            String str = this.m_smsContent;
            if (str == null || str.length() <= 0) {
                radioButton.setChecked(true);
            } else {
                radioButton.setChecked(false);
                editText.setText(this.m_smsContent);
                editText.setSelection(editText.length());
                editText.setEnabled(true);
                if (this.m_excludes) {
                    radioButton4.setChecked(true);
                } else if (this.m_exactMatch) {
                    radioButton2.setChecked(true);
                } else {
                    radioButton3.setChecked(true);
                }
            }
            radioButton.setOnCheckedChangeListener(new C6152u6(editText, button, radioButton2, radioButton3, radioButton4));
            radioButton2.setOnCheckedChangeListener(new C6164v6(radioButton, radioButton3, radioButton4));
            radioButton3.setOnCheckedChangeListener(new C6176w6(radioButton2, radioButton, radioButton4));
            radioButton4.setOnCheckedChangeListener(new C6188x6(radioButton2, radioButton3, radioButton));
            editText.addTextChangedListener(new C5729b(button, editText));
            button.setOnClickListener(new C6140t6(this, radioButton, editText, radioButton4, radioButton2, appCompatDialog));
            button2.setOnClickListener(new C6088s6(appCompatDialog));
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static /* synthetic */ void m23058v3(EditText editText, Button button, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        editText.setEnabled(!z);
        boolean z2 = true;
        if (!z) {
            if (editText.getText().length() <= 0) {
                z2 = false;
            }
            button.setEnabled(z2);
            return;
        }
        button.setEnabled(true);
        radioButton.setChecked(false);
        radioButton2.setChecked(false);
        radioButton3.setChecked(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static /* synthetic */ void m23059w3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static /* synthetic */ void m23060x3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static /* synthetic */ void m23061y3(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, CompoundButton compoundButton, boolean z) {
        if (z) {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m23062z3(RadioButton radioButton, EditText editText, RadioButton radioButton2, RadioButton radioButton3, AppCompatDialog appCompatDialog, View view) {
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
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* renamed from: C3 */
    public void mo31441C3(Contact contact) {
        this.m_contact = contact;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        String str = ")";
        String str2 = " !(";
        if (this.m_contactList.size() == 0 && this.m_contact != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(SelectableItem.m15535j1(C17541R$string.trigger_sms_sent_to));
            if (!this.isExcludeContact) {
                str2 = " ";
            }
            sb.append(str2);
            sb.append(this.m_contact.mo27713g());
            if (!this.isExcludeContact) {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        } else if (this.m_contactList.size() == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SelectableItem.m15535j1(C17541R$string.trigger_sms_sent_to));
            if (!this.isExcludeContact) {
                str2 = " ";
            }
            sb2.append(str2);
            sb2.append(this.m_contactList.get(0).mo27713g());
            if (!this.isExcludeContact) {
                str = "";
            }
            sb2.append(str);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(SelectableItem.m15535j1(C17541R$string.trigger_sms_sent_to));
            if (!this.isExcludeContact) {
                str2 = " ";
            }
            sb3.append(str2);
            sb3.append(this.m_contactList.size());
            sb3.append(" ");
            sb3.append(SelectableItem.m15535j1(C17541R$string.contacts));
            if (!this.isExcludeContact) {
                str = "";
            }
            sb3.append(str);
            return sb3.toString();
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
            MacroDroidApplication.m14845u().stopService(new Intent(mo27827K0(), SMSSentDetectService.class));
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7538o1.m31371u();
    }

    @CallSuper
    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        ArrayList arrayList = new ArrayList();
        this.m_contact = null;
        for (Contact next : this.m_contactList) {
            if (next.mo27709b().equals("-1")) {
                arrayList.add(0, new Contact("-1", C4061t1.f10624d, "-1"));
            } else if (next.mo27709b().equals("-2")) {
                arrayList.add(0, new Contact("-2", C4061t1.f10625e, "-2"));
            } else if (next.mo27709b().equals("-3")) {
                arrayList.add(0, new Contact("-3", C4061t1.f10626f, "-3"));
            }
        }
        this.m_contactList = arrayList;
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + C6413o0.m24693b(mo24672O0(), 20) + ")";
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (s_triggerCounter == 0) {
            MacroDroidApplication.m14845u().startService(new Intent(mo27827K0(), SMSSentDetectService.class));
        }
        s_triggerCounter++;
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_SMS"};
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: q3 */
    public List<Contact> mo31442q3() {
        Contact contact;
        if (this.m_contactList.size() == 0 && (contact = this.m_contact) != null) {
            this.m_contactList.add(contact);
        }
        return this.m_contactList;
    }

    /* renamed from: r3 */
    public String mo31443r3() {
        return this.m_smsContent;
    }

    /* renamed from: s3 */
    public boolean mo31444s3() {
        return this.m_exactMatch;
    }

    /* renamed from: t3 */
    public boolean mo31445t3() {
        return this.isExcludeContact;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        C7897h.m33052c(mo27850j0(), mo24705l0(), mo31442q3(), this.m_contact, this.isExcludeContact, false, true, new C5728a());
    }

    /* renamed from: u3 */
    public boolean mo31446u3() {
        return this.m_excludes;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_contact, i);
        parcel.writeString(this.m_smsContent);
        parcel.writeInt(this.m_exactMatch ? 1 : 0);
        parcel.writeInt(this.m_excludes ? 1 : 0);
        parcel.writeList(this.m_contactList);
        parcel.writeInt(this.isExcludeContact ? 1 : 0);
    }

    public SMSSentTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SMSSentTrigger() {
        this.m_contactList = new ArrayList();
    }

    private SMSSentTrigger(Parcel parcel) {
        super(parcel);
        this.m_contact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.m_smsContent = parcel.readString();
        boolean z = true;
        this.m_exactMatch = parcel.readInt() != 0;
        this.m_excludes = parcel.readInt() != 0;
        ArrayList arrayList = new ArrayList();
        this.m_contactList = arrayList;
        parcel.readList(arrayList, Contact.class.getClassLoader());
        this.isExcludeContact = parcel.readInt() == 0 ? false : z;
    }
}
