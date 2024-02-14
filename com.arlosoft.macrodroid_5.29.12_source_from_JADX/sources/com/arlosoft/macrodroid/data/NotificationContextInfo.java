package com.arlosoft.macrodroid.data;

import android.os.Parcel;
import android.os.Parcelable;

public class NotificationContextInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationContextInfo> CREATOR = new C4361a();

    /* renamed from: a */
    private final String f11092a;

    /* renamed from: c */
    private String f11093c;

    /* renamed from: d */
    private final String f11094d;

    /* renamed from: f */
    private final String f11095f;

    /* renamed from: g */
    private String f11096g;

    /* renamed from: o */
    private String f11097o;

    /* renamed from: p */
    private String f11098p;

    /* renamed from: s */
    private String f11099s;

    /* renamed from: z */
    private String f11100z;

    /* renamed from: com.arlosoft.macrodroid.data.NotificationContextInfo$a */
    class C4361a implements Parcelable.Creator<NotificationContextInfo> {
        C4361a() {
        }

        /* renamed from: a */
        public NotificationContextInfo createFromParcel(Parcel parcel) {
            return new NotificationContextInfo(parcel, (C4361a) null);
        }

        /* renamed from: b */
        public NotificationContextInfo[] newArray(int i) {
            return new NotificationContextInfo[i];
        }
    }

    /* synthetic */ NotificationContextInfo(Parcel parcel, C4361a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public String mo28537a() {
        return this.f11099s;
    }

    /* renamed from: b */
    public String mo28538b() {
        return this.f11094d;
    }

    /* renamed from: c */
    public String mo28539c() {
        return this.f11095f;
    }

    /* renamed from: d */
    public String mo28540d() {
        return this.f11097o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo28542e() {
        return this.f11092a;
    }

    /* renamed from: f */
    public String mo28543f() {
        return this.f11093c;
    }

    /* renamed from: g */
    public String mo28544g() {
        return this.f11100z;
    }

    /* renamed from: h */
    public String mo28545h() {
        return this.f11098p;
    }

    /* renamed from: i */
    public String mo28546i() {
        return this.f11096g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11092a);
        parcel.writeString(this.f11093c);
        parcel.writeString(this.f11094d);
        parcel.writeString(this.f11095f);
        parcel.writeString(this.f11096g);
        parcel.writeString(this.f11097o);
        parcel.writeString(this.f11098p);
        parcel.writeString(this.f11099s);
        parcel.writeString(this.f11100z);
    }

    public NotificationContextInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f11092a = str;
        this.f11094d = str2;
        this.f11095f = str3;
        this.f11093c = str4;
        this.f11096g = str5;
        this.f11097o = str6;
        this.f11098p = str7;
        this.f11099s = str8;
        this.f11100z = str9;
    }

    private NotificationContextInfo(Parcel parcel) {
        this.f11092a = parcel.readString();
        this.f11093c = parcel.readString();
        this.f11094d = parcel.readString();
        this.f11095f = parcel.readString();
        this.f11096g = parcel.readString();
        this.f11097o = parcel.readString();
        this.f11098p = parcel.readString();
        this.f11099s = parcel.readString();
        this.f11100z = parcel.readString();
    }
}
