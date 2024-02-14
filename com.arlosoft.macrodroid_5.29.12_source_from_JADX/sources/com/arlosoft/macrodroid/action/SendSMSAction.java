package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.sms.SMSActivity;
import com.arlosoft.macrodroid.action.sms.SMSOutputService2;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.IncomingCallTrigger;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p057a2.C2224m;
import p128m0.C7717c3;
import p148q0.C8151a;
import p149q1.C8157f;

public class SendSMSAction extends Action implements C2224m {
    public static final Parcelable.Creator<SendSMSAction> CREATOR = new C2618a();
    private static final int SMS_ACTIVITY_REQUEST = 499;
    private boolean m_addToMessageLog;
    private Contact m_contact;
    private String m_messageContent;
    private String m_number;
    private boolean m_prePopulate;
    private int m_simId;

    /* renamed from: com.arlosoft.macrodroid.action.SendSMSAction$a */
    class C2618a implements Parcelable.Creator<SendSMSAction> {
        C2618a() {
        }

        /* renamed from: a */
        public SendSMSAction createFromParcel(Parcel parcel) {
            return new SendSMSAction(parcel, (C2618a) null);
        }

        /* renamed from: b */
        public SendSMSAction[] newArray(int i) {
            return new SendSMSAction[i];
        }
    }

    /* synthetic */ SendSMSAction(Parcel parcel, C2618a aVar) {
        this(parcel);
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_number, this.m_messageContent};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (this.m_prePopulate) {
            return SelectableItem.m15535j1(C17541R$string.action_send_sms_pre_populate);
        }
        return mo25559a1();
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_number = strArr[0];
            this.m_messageContent = strArr[1];
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
        if (contact.mo27713g() == null) {
            C8151a.m33873n(new RuntimeException("SendSMSAction: he contact name is null? The id is: " + this.m_contact.mo27709b() + " The number is: " + this.m_contact.mo27714h()));
            return false;
        } else if ((!this.m_contact.mo27709b().equals("Incoming_Contact") || this.m_macro.hasOnlyTrigger(IncomingSMSTrigger.class) || this.m_macro.hasOnlyTrigger(IncomingCallTrigger.class)) && this.m_contact.mo27709b() != null && !this.m_contact.mo27709b().equals("Select_Contact")) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        Contact contact = this.m_contact;
        if (contact == null) {
            return "[" + SelectableItem.m15535j1(C17541R$string.invalid_contact) + ": " + this.m_messageContent + "]";
        } else if (contact.mo27709b().equals("Hardwired_Number")) {
            return this.m_number + ": " + this.m_messageContent;
        } else {
            return "[" + this.m_contact.mo27713g() + "]: " + this.m_messageContent;
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7717c3.m32176u();
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        String str = this.m_number;
        if (str == null || !str.startsWith("[")) {
            this.m_number = "01234987654";
            this.m_contact = new Contact("Hardwired_Number", Contact.m15396a(), "Hardwired_Number");
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String str;
        String str2;
        Contact contact = this.m_contact;
        if (this.m_number != null) {
            str = C4023j0.m15764v0(mo27827K0(), this.m_number, triggerContextInfo, false, mo27837X0());
            if (str == null || str.equals("[sms_number]")) {
                C4878b.m18869h("No number available to send SMS to - [sms_number] must be set by the trigger", mo27840Y0().longValue());
                return;
            }
        } else {
            if (contact.mo27709b().equals("Incoming_Contact")) {
                if (triggerContextInfo != null) {
                    if (triggerContextInfo.mo31561n() != null) {
                        str2 = triggerContextInfo.mo31561n().mo27723b();
                    } else if (triggerContextInfo.mo31563p() != null) {
                        str2 = triggerContextInfo.mo31563p();
                    } else {
                        str2 = triggerContextInfo.mo31560m() != null ? triggerContextInfo.mo31560m().mo27714h() : "";
                    }
                    contact.mo27715j(str2);
                } else {
                    C8151a.m33873n(new RuntimeException("SendSMSAction: contextInfo is null in ShareLocationAction"));
                }
            }
            str = null;
        }
        String str3 = str;
        String R2 = mo24690R2(this.m_messageContent, triggerContextInfo);
        if (this.m_prePopulate) {
            if (str3 == null) {
                if (contact.mo27714h() != null) {
                    str3 = contact.mo27714h();
                } else {
                    str3 = C4061t1.m15975U(mo27827K0(), contact);
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str3));
            intent.putExtra("sms_body", R2);
            intent.addFlags(268435456);
            mo27827K0().startActivity(intent);
            return;
        }
        SMSOutputService2.m14459c(mo27827K0(), R2, contact, str3, this.m_addToMessageLog, 1, this.m_simId);
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.SEND_SMS", "android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE"};
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return null;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " '" + mo24690R2(this.m_messageContent, triggerContextInfo) + "'";
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == SMS_ACTIVITY_REQUEST && i2 == -1) {
            this.m_contact = (Contact) intent.getExtras().getParcelable("ContactExtra");
            this.m_messageContent = intent.getExtras().getString("MessageExtra");
            this.m_addToMessageLog = intent.getExtras().getBoolean("AddToMessageLogExtra");
            this.m_prePopulate = intent.getExtras().getBoolean("PrePopulate");
            this.m_number = intent.getExtras().getString("Number");
            this.m_simId = intent.getExtras().getInt("SimId");
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, SMSActivity.class);
        intent.putParcelableArrayListExtra("Trigger", this.m_macro.getTriggerList());
        intent.putExtra("Message", this.m_messageContent);
        intent.putExtra("Destination", this.m_contact);
        intent.putExtra("AddToMessageLogExtra", this.m_addToMessageLog);
        intent.putExtra("PrePopulate", this.m_prePopulate);
        intent.putExtra("SimId", this.m_simId);
        intent.putExtra(C8157f.ITEM_TYPE, mo27837X0());
        String str = this.m_number;
        if (str == null) {
            String str2 = null;
            Contact contact = this.m_contact;
            if (contact != null) {
                str2 = C4061t1.m15975U(j0, contact);
            }
            intent.putExtra("Number", str2);
        } else {
            intent.putExtra("Number", str);
        }
        j0.startActivityForResult(intent, SMS_ACTIVITY_REQUEST);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_contact, i);
        parcel.writeString(this.m_messageContent);
        parcel.writeInt(this.m_addToMessageLog ^ true ? 1 : 0);
        parcel.writeString(this.m_number);
        parcel.writeInt(this.m_prePopulate ^ true ? 1 : 0);
        parcel.writeInt(this.m_simId);
    }

    public SendSMSAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public SendSMSAction() {
    }

    private SendSMSAction(Parcel parcel) {
        super(parcel);
        this.m_contact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.m_messageContent = parcel.readString();
        boolean z = true;
        this.m_addToMessageLog = parcel.readInt() == 0;
        this.m_number = parcel.readString();
        this.m_prePopulate = parcel.readInt() != 0 ? false : z;
        this.m_simId = parcel.readInt();
    }
}
