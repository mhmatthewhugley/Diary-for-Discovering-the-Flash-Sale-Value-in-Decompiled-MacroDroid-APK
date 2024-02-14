package com.arlosoft.macrodroid.common;

import android.os.Parcel;
import android.os.Parcelable;

public class IncomingSMS implements Parcelable {
    public static final Parcelable.Creator<IncomingSMS> CREATOR = new C3982a();

    /* renamed from: a */
    private final String f10323a;

    /* renamed from: c */
    private final String f10324c;

    /* renamed from: d */
    private final String f10325d;

    /* renamed from: com.arlosoft.macrodroid.common.IncomingSMS$a */
    class C3982a implements Parcelable.Creator<IncomingSMS> {
        C3982a() {
        }

        /* renamed from: a */
        public IncomingSMS createFromParcel(Parcel parcel) {
            return new IncomingSMS(parcel, (C3982a) null);
        }

        /* renamed from: b */
        public IncomingSMS[] newArray(int i) {
            return new IncomingSMS[i];
        }
    }

    /* synthetic */ IncomingSMS(Parcel parcel, C3982a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public String mo27722a() {
        return this.f10323a;
    }

    /* renamed from: b */
    public String mo27723b() {
        return this.f10325d;
    }

    /* renamed from: c */
    public String mo27724c() {
        return this.f10324c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10323a);
        parcel.writeString(this.f10324c);
        parcel.writeString(this.f10325d);
    }

    public IncomingSMS(String str, String str2, String str3) {
        this.f10323a = str;
        this.f10324c = str2;
        this.f10325d = str3;
    }

    private IncomingSMS(Parcel parcel) {
        this.f10323a = parcel.readString();
        this.f10324c = parcel.readString();
        this.f10325d = parcel.readString();
    }
}
