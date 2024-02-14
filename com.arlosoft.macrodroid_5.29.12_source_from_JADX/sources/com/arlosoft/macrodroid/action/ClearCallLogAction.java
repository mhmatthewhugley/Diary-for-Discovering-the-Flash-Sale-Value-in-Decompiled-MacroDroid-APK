package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.Contact;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p112j2.C7439d0;
import p128m0.C7820q;
import p148q0.C8151a;

public class ClearCallLogAction extends Action {
    public static final Parcelable.Creator<ClearCallLogAction> CREATOR = new C2353a();
    private static final int TYPE_ALL = 0;
    private static final int TYPE_BLOCKED = 6;
    private static final int TYPE_INCOMING = 1;
    private static final int TYPE_MISSED = 3;
    private static final int TYPE_OUTGOING = 2;
    private static final int TYPE_REJECTED = 5;
    private static final int TYPE_VOICEMAIL = 4;
    private Contact m_contact;
    private boolean m_nonContact;
    private boolean m_specificContact;
    private int m_type;

    /* renamed from: com.arlosoft.macrodroid.action.ClearCallLogAction$a */
    class C2353a implements Parcelable.Creator<ClearCallLogAction> {
        C2353a() {
        }

        /* renamed from: a */
        public ClearCallLogAction createFromParcel(Parcel parcel) {
            return new ClearCallLogAction(parcel, (C2353a) null);
        }

        /* renamed from: b */
        public ClearCallLogAction[] newArray(int i) {
            return new ClearCallLogAction[i];
        }
    }

    /* synthetic */ ClearCallLogAction(Parcel parcel, C2353a aVar) {
        this(parcel);
    }

    /* renamed from: q3 */
    private void m9986q3() {
        if (!this.m_specificContact) {
            mo24689O1();
            return;
        }
        List<Contact> D = C4061t1.m15950D(mo27827K0());
        String[] strArr = new String[D.size()];
        int i = 0;
        for (int i2 = 0; i2 < D.size(); i2++) {
            strArr[i2] = D.get(i2).mo27713g();
            Contact contact = this.m_contact;
            if (contact != null && contact.mo27713g().equals(D.get(i2).mo27713g())) {
                i = i2;
            }
        }
        if (i == 0 && D.size() > 0) {
            this.m_contact = D.get(0);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo27827K0().getString(C17541R$string.action_clear_call_log_clear_log_for_contact));
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) new C3328p1(this, D));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3298o1(this));
        AlertDialog create = builder.create();
        create.show();
        create.getListView().setFastScrollEnabled(true);
    }

    /* renamed from: r3 */
    private String[] m9987r3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.call_type_all), SelectableItem.m15535j1(C17541R$string.call_type_incoming), SelectableItem.m15535j1(C17541R$string.call_type_outgoing), SelectableItem.m15535j1(C17541R$string.call_type_missed), SelectableItem.m15535j1(C17541R$string.call_type_voicemail), SelectableItem.m15535j1(C17541R$string.call_type_rejected), SelectableItem.m15535j1(C17541R$string.call_type_blocked)};
    }

    /* renamed from: s3 */
    private String[] m9988s3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_clear_call_log_specific_contact), SelectableItem.m15535j1(C17541R$string.action_clear_call_log_all_entries), SelectableItem.m15535j1(C17541R$string.non_contact)};
    }

    /* renamed from: t3 */
    private boolean m9989t3(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Cursor query = mo27827K0().getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_ID}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (query.getCount() > 0) {
                    z = true;
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public /* synthetic */ void m9990u3(DialogInterface dialogInterface, int i) {
        boolean z = true;
        this.m_specificContact = i == 0;
        if (i != 2) {
            z = false;
        }
        this.m_nonContact = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m9991v3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m9992w3(DialogInterface dialogInterface, int i) {
        m9986q3();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m9993x3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m9994y3(List list, DialogInterface dialogInterface, int i) {
        if (list.size() > 0) {
            this.m_contact = (Contact) list.get(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m9995z3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_type;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        if (!this.m_specificContact) {
            return true;
        }
        Contact contact = this.m_contact;
        if (contact == null) {
            return false;
        }
        if (contact.mo27713g() != null) {
            return !this.m_contact.mo27713g().equals(Contact.m15400i());
        }
        C8151a.m33873n(new RuntimeException("The contact name is null? The id is: " + this.m_contact.mo27709b() + " The number is: " + this.m_contact.mo27714h()));
        return false;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = "(" + m9987r3()[this.m_type] + ") ";
        if (this.m_nonContact) {
            return str + SelectableItem.m15535j1(C17541R$string.non_contacts);
        } else if (!this.m_specificContact) {
            return str + mo27827K0().getString(C17541R$string.action_clear_call_log_contact_all_entries);
        } else if (this.m_contact != null) {
            return str + SelectableItem.m15535j1(C17541R$string.action_clear_call_log_contact) + " " + this.m_contact.mo27713g();
        } else {
            return str + SelectableItem.m15535j1(C17541R$string.action_clear_call_log_contact) + " " + SelectableItem.m15535j1(C17541R$string.invalid_contact);
        }
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7820q.m32685u();
    }

    /* renamed from: a0 */
    public boolean mo24825a0() {
        List<Contact> D = C4061t1.m15950D(mo27827K0());
        boolean z = false;
        D.add(0, new Contact("-1", C4061t1.f10624d, "-1"));
        D.add(0, new Contact("-2", C4061t1.f10625e, "-2"));
        D.add(0, new Contact("-3", C4061t1.f10626f, "-3"));
        if (D.size() <= 0) {
            return true;
        }
        Iterator<Contact> it = D.iterator();
        while (true) {
            if (it.hasNext()) {
                Contact next = it.next();
                if (next != null && this.m_contact != null && next.mo27713g() != null && next.mo27713g().equals(this.m_contact.mo27713g())) {
                    this.m_contact = next;
                    z = true;
                    break;
                }
            } else {
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
        if (this.m_nonContact) {
            try {
                Cursor query = mo27827K0().getContentResolver().query(CallLog.Calls.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null);
                List<Contact> D = C4061t1.m15950D(mo27827K0());
                if (D == null || D.size() == 0) {
                    C4878b.m18869h("No contacts found", mo27840Y0().longValue());
                    return;
                }
                HashSet<String> hashSet = new HashSet<>();
                while (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex("number"));
                    if (!m9989t3(string)) {
                        hashSet.add(string);
                    }
                }
                query.close();
                for (String str : hashSet) {
                    try {
                        if (this.m_type == 0) {
                            ContentResolver contentResolver = mo27827K0().getContentResolver();
                            Uri uri = CallLog.Calls.CONTENT_URI;
                            contentResolver.delete(uri, "number='" + str + "'", (String[]) null);
                        } else {
                            ContentResolver contentResolver2 = mo27827K0().getContentResolver();
                            Uri uri2 = CallLog.Calls.CONTENT_URI;
                            contentResolver2.delete(uri2, "number='" + str + "' AND " + "type" + "=" + this.m_type, (String[]) null);
                        }
                    } catch (Exception e) {
                        C4878b.m18869h("Clear call log failed: " + e.toString(), mo27840Y0().longValue());
                    }
                }
            } catch (Exception e2) {
                C4878b.m18869h("Clear call log failed: " + e2.toString(), mo27840Y0().longValue());
            }
        } else if (!this.m_specificContact) {
            if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.WRITE_CALL_LOG") != 0) {
                C7439d0.m30909o0(mo27827K0(), "android.permission.WRITE_CALL_LOG", SelectableItem.m15535j1(C17541R$string.action_clear_call_log), true, false);
                return;
            }
            try {
                if (this.m_type == 0) {
                    mo27827K0().getContentResolver().delete(CallLog.Calls.CONTENT_URI, (String) null, (String[]) null);
                    return;
                }
                ContentResolver contentResolver3 = mo27827K0().getContentResolver();
                Uri uri3 = CallLog.Calls.CONTENT_URI;
                contentResolver3.delete(uri3, "type=" + this.m_type, (String[]) null);
            } catch (Exception e3) {
                C4878b.m18869h("Clear call log failed: " + e3.toString(), mo27840Y0().longValue());
            }
        } else if (this.m_contact != null) {
            List<String> S = C4061t1.m15973S(mo27827K0(), this.m_contact);
            Cursor query2 = mo27827K0().getContentResolver().query(CallLog.Calls.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query2 != null) {
                while (true) {
                    if (!query2.moveToNext()) {
                        break;
                    }
                    String string2 = query2.getString(query2.getColumnIndex("number"));
                    if (C4061t1.m16011p(string2, S)) {
                        try {
                            if (this.m_type == 0) {
                                ContentResolver contentResolver4 = mo27827K0().getContentResolver();
                                Uri uri4 = CallLog.Calls.CONTENT_URI;
                                contentResolver4.delete(uri4, "number='" + string2 + "'", (String[]) null);
                            } else {
                                ContentResolver contentResolver5 = mo27827K0().getContentResolver();
                                Uri uri5 = CallLog.Calls.CONTENT_URI;
                                contentResolver5.delete(uri5, "number='" + string2 + "' AND " + "type" + "=" + this.m_type, (String[]) null);
                            }
                        } catch (Exception e4) {
                            C4878b.m18869h("Clear call log failed: " + e4.toString(), mo27840Y0().longValue());
                        }
                    }
                }
                query2.close();
            }
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG"};
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[]{"android.permission.READ_CONTACTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9987r3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.action_clear_call_log_clear_logs_for);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p3 */
    public AlertDialog mo24827p3() {
        String[] g1 = mo24676g1();
        if (g1 == null || g1.length == 0) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.action_clear_call_log_clear_logs_for);
        builder.setSingleChoiceItems((CharSequence[]) m9988s3(), this.m_specificContact ? 0 : this.m_nonContact ? 2 : 1, (DialogInterface.OnClickListener) new C3214l1(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3242m1(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3270n1(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3186k1(this));
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo24827p3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_specificContact ? 1 : 0);
        parcel.writeParcelable(this.m_contact, i);
        parcel.writeInt(this.m_nonContact ? 1 : 0);
        parcel.writeInt(this.m_type);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_type = i;
    }

    public ClearCallLogAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ClearCallLogAction() {
        this.m_specificContact = true;
    }

    private ClearCallLogAction(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.m_specificContact = parcel.readInt() != 0;
        this.m_contact = (Contact) parcel.readParcelable(Contact.class.getClassLoader());
        this.m_nonContact = parcel.readInt() == 0 ? false : z;
        this.m_type = parcel.readInt();
    }
}
