package com.arlosoft.macrodroid.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class NotificationButton implements Parcelable {
    public static final Parcelable.Creator<NotificationButton> CREATOR = new C3989a();

    /* renamed from: a */
    private final int f10337a;

    /* renamed from: c */
    private String f10338c;

    /* renamed from: d */
    private String f10339d;

    /* renamed from: f */
    private int f10340f;

    /* renamed from: g */
    private Uri f10341g;

    /* renamed from: com.arlosoft.macrodroid.common.NotificationButton$a */
    class C3989a implements Parcelable.Creator<NotificationButton> {
        C3989a() {
        }

        /* renamed from: a */
        public NotificationButton createFromParcel(Parcel parcel) {
            return new NotificationButton(parcel, (C3989a) null);
        }

        /* renamed from: b */
        public NotificationButton[] newArray(int i) {
            return new NotificationButton[i];
        }
    }

    /* synthetic */ NotificationButton(Parcel parcel, C3989a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public int mo27791a() {
        return this.f10337a;
    }

    /* renamed from: b */
    public int mo27792b() {
        return this.f10340f;
    }

    /* renamed from: c */
    public String mo27793c() {
        return this.f10338c;
    }

    /* renamed from: d */
    public String mo27794d() {
        return this.f10339d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Uri mo27796e() {
        return this.f10341g;
    }

    /* renamed from: f */
    public void mo27797f(int i) {
        this.f10340f = i;
    }

    /* renamed from: g */
    public void mo27798g(String str) {
        this.f10338c = str;
    }

    /* renamed from: h */
    public void mo27799h(String str) {
        this.f10339d = str;
    }

    /* renamed from: i */
    public void mo27800i(Uri uri) {
        this.f10341g = uri;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10337a);
        parcel.writeString(this.f10338c);
        parcel.writeString(this.f10339d);
        parcel.writeInt(this.f10340f);
        parcel.writeString(this.f10341g.toString());
    }

    public NotificationButton(int i, String str, String str2, int i2, Uri uri) {
        this.f10337a = i;
        this.f10338c = str;
        this.f10339d = str2;
        this.f10340f = i2;
        this.f10341g = uri;
    }

    private NotificationButton(Parcel parcel) {
        this.f10337a = parcel.readInt();
        this.f10338c = parcel.readString();
        this.f10339d = parcel.readString();
        this.f10340f = parcel.readInt();
        this.f10341g = Uri.parse(parcel.readString());
    }
}
