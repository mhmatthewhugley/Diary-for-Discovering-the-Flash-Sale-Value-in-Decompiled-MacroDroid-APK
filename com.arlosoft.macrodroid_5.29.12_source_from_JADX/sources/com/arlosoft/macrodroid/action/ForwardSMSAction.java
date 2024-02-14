package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.sms.SMSOutputService2;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.IncomingSMS;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p128m0.C7755h1;
import p148q0.C8151a;
import p319lc.C15626c;

public class ForwardSMSAction extends Action {
    public static final Parcelable.Creator<ForwardSMSAction> CREATOR = new C2473a();
    private Contact m_contact;
    private transient List<Contact> m_contactsList;
    private int m_simId;

    /* renamed from: com.arlosoft.macrodroid.action.ForwardSMSAction$a */
    class C2473a implements Parcelable.Creator<ForwardSMSAction> {
        C2473a() {
        }

        /* renamed from: a */
        public ForwardSMSAction createFromParcel(Parcel parcel) {
            return new ForwardSMSAction(parcel, (C2473a) null);
        }

        /* renamed from: b */
        public ForwardSMSAction[] newArray(int i) {
            return new ForwardSMSAction[i];
        }
    }

    /* synthetic */ ForwardSMSAction(Parcel parcel, C2473a aVar) {
        this(parcel);
    }

    @RequiresApi(api = 22)
    /* renamed from: m3 */
    private void m10921m3(List<SubscriptionInfo> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (SubscriptionInfo next : list) {
            arrayList.add((next.getSimSlotIndex() + 1) + " : " + next.getDisplayName() + " - " + next.getCarrierName());
            if (next.getSubscriptionId() == this.m_simId) {
                i = i2;
            }
            i2++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.sim_card);
        builder.setSingleChoiceItems((CharSequence[]) (String[]) arrayList.toArray(new String[0]), i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3644z6(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2810a7(this, list));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3617y6(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public /* synthetic */ void m10922n3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public /* synthetic */ void m10923o3(List list, DialogInterface dialogInterface, int i) {
        this.m_simId = ((SubscriptionInfo) list.get(((AlertDialog) dialogInterface).getListView().getCheckedItemPosition())).getSubscriptionId();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public /* synthetic */ void m10924p3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        List<Contact> E = C4061t1.m15952E(mo27850j0(), true);
        if (this.m_contact != null) {
            for (int i = 0; i < E.size(); i++) {
                if (E.get(i).mo27713g().equals(this.m_contact.mo27713g())) {
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        Contact contact = this.m_contact;
        if (contact == null) {
            return false;
        }
        if (contact.mo27713g() == null) {
            C8151a.m33873n(new RuntimeException("SendSMSAction: The contact name is null? The id is: " + this.m_contact.mo27709b() + " The number is: " + this.m_contact.mo27714h()));
            return false;
        } else if (this.m_contact.mo27709b() == null || this.m_contact.mo27709b().equals("Select_Contact")) {
            return false;
        } else {
            return this.m_macro.hasOnlyTrigger(IncomingSMSTrigger.class);
        }
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_contact != null) {
            return "[" + this.m_contact.mo27713g() + "]";
        }
        return "[" + mo27827K0().getString(C17541R$string.invalid_contact) + "]";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7755h1.m32363u();
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        this.m_contact = null;
    }

    /* renamed from: a0 */
    public boolean mo24825a0() {
        boolean z = false;
        if (this.m_contact == null) {
            C8151a.m33873n(new RuntimeException("ForwardSMSActon: Contact was null in checkOnImport"));
            return false;
        }
        List<Contact> E = C4061t1.m15952E(mo27827K0(), false);
        if (E.size() <= 0) {
            return true;
        }
        Iterator<Contact> it = E.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Contact next = it.next();
            if (next.mo27713g().equals(this.m_contact.mo27713g())) {
                this.m_contact = next;
                z = true;
                break;
            }
        }
        if (!z) {
            this.m_contact = new Contact("Select_Contact", Contact.m15400i(), "Select_Contact");
        }
        return z;
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Contact contact = this.m_contact;
        IncomingSMS n = triggerContextInfo.mo31561n();
        if (n != null) {
            SMSOutputService2.m14459c(mo27827K0(), n.mo27724c(), contact, (String) null, false, 1, this.m_simId);
            return;
        }
        C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.macro_test_failed, 0).show();
        C8151a.m33860a("Forward SMS action - incoming SMS is null");
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.SEND_SMS"};
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_PHONE_STATE"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<Contact> E = C4061t1.m15952E(mo27850j0(), true);
        this.m_contactsList = E;
        E.size();
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
        return mo27827K0().getString(C17541R$string.select_contact);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_contact == null) {
            this.m_contact = this.m_contactsList.get(0);
        }
        if (Build.VERSION.SDK_INT < 22) {
            mo24689O1();
            return;
        }
        try {
            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) mo27827K0().getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null) {
                if (activeSubscriptionInfoList.size() > 1) {
                    m10921m3(activeSubscriptionInfoList);
                    return;
                }
            }
            mo24689O1();
        } catch (SecurityException unused) {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.m_contact, i);
        parcel.writeInt(this.m_simId);
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

    public ForwardSMSAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ForwardSMSAction() {
    }

    private ForwardSMSAction(Parcel parcel) {
        super(parcel);
        this.m_contact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.m_simId = parcel.readInt();
    }
}
