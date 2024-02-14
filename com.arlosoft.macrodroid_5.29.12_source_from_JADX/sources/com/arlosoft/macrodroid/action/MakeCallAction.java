package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.CallLog;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.Iterator;
import java.util.List;
import p057a2.C2224m;
import p112j2.C7439d0;
import p128m0.C7724d2;
import p148q0.C8151a;

public class MakeCallAction extends Action implements C2224m {
    public static final Parcelable.Creator<MakeCallAction> CREATOR = new C2539b();
    private Contact m_contact;
    private transient List<Contact> m_contactsList;
    private String m_number;

    /* renamed from: com.arlosoft.macrodroid.action.MakeCallAction$a */
    class C2538a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7364a;

        /* renamed from: c */
        final /* synthetic */ EditText f7365c;

        C2538a(Button button, EditText editText) {
            this.f7364a = button;
            this.f7365c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7364a.setEnabled(this.f7365c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.MakeCallAction$b */
    class C2539b implements Parcelable.Creator<MakeCallAction> {
        C2539b() {
        }

        /* renamed from: a */
        public MakeCallAction createFromParcel(Parcel parcel) {
            return new MakeCallAction(parcel, (C2538a) null);
        }

        /* renamed from: b */
        public MakeCallAction[] newArray(int i) {
            return new MakeCallAction[i];
        }
    }

    /* synthetic */ MakeCallAction(Parcel parcel, C2538a aVar) {
        this(parcel);
    }

    /* renamed from: q3 */
    private void m11480q3() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
            appCompatDialog.setContentView((int) C17535R$layout.enter_number_dialog);
            appCompatDialog.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.trigger_dial_number_title));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
            layoutParams.width = -1;
            appCompatDialog.getWindow().setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_phone_number);
            Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.enter_number_dialog_magic_text_button);
            String str = this.m_number;
            if (str != null) {
                editText.setText(str);
                editText.setSelection(editText.length());
            }
            editText.addTextChangedListener(new C2538a(button, editText));
            button.setOnClickListener(new C3111ha(this, editText, appCompatDialog));
            button.setEnabled(editText.getText().length() > 0);
            button2.setOnClickListener(new C3055fa(appCompatDialog));
            button3.setOnClickListener(new C3083ga(this, j0, new C3139ia(editText)));
            appCompatDialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m11481r3(EditText editText, AppCompatDialog appCompatDialog, View view) {
        this.m_number = editText.getText().toString();
        appCompatDialog.cancel();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static /* synthetic */ void m11483t3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m11484u3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15700F(activity, eVar, mo27837X0(), true, true, true, C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m11485v3(List list, DialogInterface dialogInterface, int i) {
        this.m_number = (String) list.get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static /* synthetic */ void m11486w3(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m11487x3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* renamed from: y3 */
    private void m11488y3(List<String> list) {
        int i = 0;
        if (this.m_number == null) {
            this.m_number = list.get(0);
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (this.m_number.equals(list.get(i2))) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_number);
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C2997da(this, list));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3026ea.f8241a);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2969ca(this));
        builder.create().show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        Contact contact = this.m_contact;
        if (contact != null) {
            if (contact.mo27709b().equals("Last_Number_Called")) {
                return 1;
            }
            for (int i = 0; i < this.m_contactsList.size(); i++) {
                if (this.m_contactsList.get(i).mo27713g().equals(this.m_contact.mo27713g())) {
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_number};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        Contact contact = this.m_contact;
        if (contact == null || contact.mo27709b() == null) {
            C8151a.m33873n(new RuntimeException("Make Call Action: Contact is invalid"));
            return SelectableItem.m15535j1(C17541R$string.action_make_call_call) + " " + SelectableItem.m15535j1(C17541R$string.invalid_contact);
        } else if (this.m_contact.mo27709b().equals("Hardwired_Number")) {
            return SelectableItem.m15535j1(C17541R$string.action_make_call_call) + " " + this.m_number;
        } else {
            return SelectableItem.m15535j1(C17541R$string.action_make_call_call) + " " + this.m_contact.mo27713g();
        }
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_number = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        Contact contact = this.m_contact;
        if (contact == null) {
            return false;
        }
        if (!contact.mo27709b().equals("Incoming_Contact") || this.m_macro.hasOnlyTrigger(IncomingSMSTrigger.class)) {
            return !this.m_contact.mo27709b().equals("Select_Contact");
        }
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7724d2.m32208u();
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        if (!this.m_contact.mo27709b().equals("Incoming_Contact") && !this.m_contact.mo27709b().equals("Last_Number_Called")) {
            this.m_contact = new Contact("Select_Contact", Contact.m15400i(), "Select_Contact");
            String str = this.m_number;
            if (str == null || !str.startsWith("[")) {
                this.m_number = null;
            }
        }
    }

    /* renamed from: a0 */
    public boolean mo24825a0() {
        boolean z = true;
        if (this.m_contact.mo27713g().equals(Contact.m15398d()) || this.m_contact.mo27709b().equals("Hardwired_Number")) {
            return true;
        }
        List<Contact> E = C4061t1.m15952E(mo27827K0(), false);
        if (E.size() > 0) {
            Iterator<Contact> it = E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Contact next = it.next();
                if (next.mo27713g().equals(this.m_contact.mo27713g())) {
                    this.m_contact = next;
                    break;
                }
            }
            if (!z) {
                this.m_contact = new Contact("Select_Contact", Contact.m15400i(), "Select_Contact");
            }
        }
        return z;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String str = null;
        String t0 = this.m_number != null ? C4023j0.m15760t0(mo27827K0(), this.m_number, triggerContextInfo, mo27837X0()) : null;
        Contact contact = this.m_contact;
        if (contact == null || contact.mo27709b().equals("Select_Contact")) {
            C4878b.m18868g("Make Call Action: Contact is invalid");
            return;
        }
        if (this.m_contact.mo27709b().equals("Incoming_Contact") && triggerContextInfo != null) {
            if (triggerContextInfo.mo31561n() != null) {
                t0 = triggerContextInfo.mo31561n().mo27723b();
            } else if (triggerContextInfo.mo31563p() != null) {
                t0 = triggerContextInfo.mo31563p();
            } else if (triggerContextInfo.mo31560m() != null) {
                t0 = triggerContextInfo.mo31560m().mo27714h();
            }
        }
        if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.CALL_PHONE") != 0) {
            C7439d0.m30909o0(mo27827K0(), "android.permission.CALL_PHONE", mo25559a1(), true, false);
        } else if (this.m_contact.mo27709b().equals("Last_Number_Called")) {
            try {
                str = CallLog.Calls.getLastOutgoingCall(mo27827K0().getApplicationContext());
            } catch (SecurityException unused) {
                C4878b.m18869h("Could not access last outgoing called, requires READ_CALL_LOG permission", mo27840Y0().longValue());
            }
            if (str != null) {
                String encode = Uri.encode(str);
                Intent intent = new Intent("android.intent.action.CALL", Uri.parse("tel:" + encode));
                intent.addFlags(268435456);
                mo27827K0().startActivity(intent);
            }
        } else if (t0 != null) {
            String encode2 = Uri.encode(t0);
            Intent intent2 = new Intent("android.intent.action.CALL", Uri.parse("tel:" + encode2));
            intent2.addFlags(268435456);
            mo27827K0().startActivity(intent2);
        } else {
            String U = C4061t1.m15975U(mo27827K0(), this.m_contact);
            if (U != null) {
                String encode3 = Uri.encode(U);
                Intent intent3 = new Intent("android.intent.action.CALL", Uri.parse("tel:" + encode3));
                intent3.addFlags(268435456);
                mo27827K0().startActivity(intent3);
            }
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        if (Build.VERSION.SDK_INT >= 26) {
            return new String[]{"android.permission.READ_CONTACTS", "android.permission.CALL_PHONE", "android.permission.WRITE_CALL_LOG", "android.permission.READ_CALL_LOG"};
        }
        return new String[]{"android.permission.READ_CONTACTS", "android.permission.CALL_PHONE"};
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        this.m_contactsList = C4061t1.m15950D(mo27827K0());
        this.m_contactsList.add(0, new Contact("Last_Number_Called", Contact.m15399e(), "Last_Number_Called"));
        this.m_contactsList.add(0, new Contact("Hardwired_Number", Contact.m15396a(), "Hardwired_Number"));
        if (this.m_macro.hasOnlyTrigger(IncomingSMSTrigger.class)) {
            this.m_contactsList.add(0, new Contact("Incoming_Contact", Contact.m15398d(), "Incoming_Contact"));
        }
        if (this.m_contact == null) {
            this.m_contact = this.m_contactsList.get(0);
        }
        try {
            Contact[] contactArr = new Contact[this.m_contactsList.size()];
            this.m_contactsList.toArray(contactArr);
            int size = this.m_contactsList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = contactArr[i].mo27713g();
            }
            return strArr;
        } catch (IndexOutOfBoundsException unused) {
            return new String[0];
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.select_contact);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Contact contact = this.m_contact;
        if (contact == null) {
            super.mo24677v2();
        } else if (contact.mo27709b().equals("Hardwired_Number") || this.m_contact.mo27709b().equals("Select_Contact")) {
            this.m_contact = new Contact("Hardwired_Number", Contact.m15396a(), "Hardwired_Number");
            m11480q3();
        } else {
            this.m_number = null;
            if (this.m_contact.mo27709b().equals("Incoming_Contact") || this.m_contact.mo27709b().equals("Last_Number_Called")) {
                mo24689O1();
                return;
            }
            List<String> S = C4061t1.m15973S(mo27827K0(), this.m_contact);
            if (S.size() > 1) {
                m11488y3(S);
            } else {
                mo24689O1();
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_contact, i);
        parcel.writeString(this.m_number);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        try {
            this.m_contact = this.m_contactsList.get(i);
        } catch (IndexOutOfBoundsException unused) {
            Log.w(this.m_classType, "No contacts on device");
        }
    }

    public MakeCallAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MakeCallAction() {
    }

    private MakeCallAction(Parcel parcel) {
        super(parcel);
        this.m_contact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.m_number = parcel.readString();
    }
}
