package com.arlosoft.macrodroid.common;

import android.os.Parcel;
import android.os.Parcelable;

public class AppNotificationState implements Parcelable {
    public static final Parcelable.Creator<AppNotificationState> CREATOR = new C3980a();

    /* renamed from: a */
    private final String f10319a;

    /* renamed from: c */
    private final String f10320c;

    /* renamed from: d */
    private int f10321d;

    /* renamed from: com.arlosoft.macrodroid.common.AppNotificationState$a */
    class C3980a implements Parcelable.Creator<AppNotificationState> {
        C3980a() {
        }

        /* renamed from: a */
        public AppNotificationState createFromParcel(Parcel parcel) {
            return new AppNotificationState(parcel, (C3980a) null);
        }

        /* renamed from: b */
        public AppNotificationState[] newArray(int i) {
            return new AppNotificationState[i];
        }
    }

    /* synthetic */ AppNotificationState(Parcel parcel, C3980a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public String mo27699a() {
        return this.f10320c;
    }

    /* renamed from: b */
    public int mo27700b() {
        return this.f10321d;
    }

    /* renamed from: c */
    public String mo27701c() {
        return this.f10319a;
    }

    /* renamed from: d */
    public void mo27702d(int i) {
        this.f10321d = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10319a);
        parcel.writeString(this.f10320c);
        parcel.writeInt(this.f10321d);
    }

    public AppNotificationState(String str, String str2, int i) {
        this.f10319a = str;
        this.f10320c = str2;
        this.f10321d = i;
    }

    private AppNotificationState(Parcel parcel) {
        this.f10319a = parcel.readString();
        this.f10320c = parcel.readString();
        this.f10321d = parcel.readInt();
    }
}
