package com.arlosoft.macrodroid.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;

public class Contact implements Parcelable {
    public static final Parcelable.Creator<Contact> CREATOR = new C3981a();
    private final String m_id;
    private final String m_lookupKey;
    private final String m_name;
    private String m_number;

    /* renamed from: com.arlosoft.macrodroid.common.Contact$a */
    class C3981a implements Parcelable.Creator<Contact> {
        C3981a() {
        }

        /* renamed from: a */
        public Contact createFromParcel(Parcel parcel) {
            return new Contact(parcel, (C3981a) null);
        }

        /* renamed from: b */
        public Contact[] newArray(int i) {
            return new Contact[i];
        }
    }

    /* synthetic */ Contact(Parcel parcel, C3981a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static String m15396a() {
        return "[" + MacroDroidApplication.m14845u().getString(C17541R$string.select_number) + "]";
    }

    /* renamed from: c */
    public static String m15397c() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.select_incoming_call_num);
    }

    /* renamed from: d */
    public static String m15398d() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.select_incoming_sms_num);
    }

    /* renamed from: e */
    public static String m15399e() {
        return MacroDroidApplication.m14845u().getString(C17541R$string.last_number_called);
    }

    /* renamed from: i */
    public static String m15400i() {
        return "[" + MacroDroidApplication.m14845u().getString(C17541R$string.select_contact) + "]";
    }

    /* renamed from: b */
    public String mo27709b() {
        return this.m_id;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        if (!this.m_name.equals(contact.mo27713g()) || !this.m_id.equals(contact.mo27709b()) || !this.m_lookupKey.equals(contact.mo27712f())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo27712f() {
        return this.m_lookupKey;
    }

    /* renamed from: g */
    public String mo27713g() {
        return this.m_name;
    }

    /* renamed from: h */
    public String mo27714h() {
        return this.m_number;
    }

    /* renamed from: j */
    public void mo27715j(String str) {
        this.m_number = str;
    }

    public String toString() {
        return this.m_name;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m_name);
        parcel.writeString(this.m_id);
        parcel.writeString(this.m_number);
        parcel.writeString(this.m_lookupKey);
    }

    public Contact(String str, String str2, String str3) {
        this.m_id = str;
        this.m_name = str2;
        this.m_lookupKey = str3;
    }

    public Contact(String str, String str2, String str3, String str4) {
        this.m_id = str;
        this.m_name = str2;
        this.m_lookupKey = str3;
        this.m_number = str4;
    }

    private Contact(Parcel parcel) {
        this.m_name = parcel.readString();
        this.m_id = parcel.readString();
        this.m_number = parcel.readString();
        this.m_lookupKey = parcel.readString();
    }
}
