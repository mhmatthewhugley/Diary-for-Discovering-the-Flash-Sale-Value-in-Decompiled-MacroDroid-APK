package com.arlosoft.macrodroid.action.sms;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class SMSMessage implements Parcelable, Comparable<SMSMessage> {
    public static final Parcelable.Creator<SMSMessage> CREATOR = new C3460a();

    /* renamed from: p */
    private static int f9222p;

    /* renamed from: a */
    private final String f9223a;

    /* renamed from: c */
    private final String f9224c;

    /* renamed from: d */
    private final boolean f9225d;

    /* renamed from: f */
    private final int f9226f;

    /* renamed from: g */
    private int f9227g;

    /* renamed from: o */
    private final int f9228o;

    /* renamed from: com.arlosoft.macrodroid.action.sms.SMSMessage$a */
    class C3460a implements Parcelable.Creator<SMSMessage> {
        C3460a() {
        }

        /* renamed from: a */
        public SMSMessage createFromParcel(Parcel parcel) {
            return new SMSMessage(parcel, (C3460a) null);
        }

        /* renamed from: b */
        public SMSMessage[] newArray(int i) {
            return new SMSMessage[i];
        }
    }

    /* synthetic */ SMSMessage(Parcel parcel, C3460a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    public int compareTo(@NonNull SMSMessage sMSMessage) {
        if (this.f9226f < sMSMessage.mo26854e()) {
            return -1;
        }
        return this.f9226f > sMSMessage.mo26854e() ? 1 : 0;
    }

    /* renamed from: d */
    public String mo26852d() {
        return this.f9224c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo26854e() {
        return this.f9226f;
    }

    /* renamed from: f */
    public String mo26855f() {
        return this.f9223a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9223a);
        parcel.writeString(this.f9224c);
        parcel.writeInt(this.f9226f);
        parcel.writeInt(this.f9227g);
        parcel.writeInt(this.f9225d ^ true ? 1 : 0);
        parcel.writeInt(this.f9228o);
    }

    private SMSMessage(Parcel parcel) {
        this.f9223a = parcel.readString();
        this.f9224c = parcel.readString();
        this.f9226f = parcel.readInt();
        this.f9227g = parcel.readInt();
        this.f9225d = parcel.readInt() == 0;
        this.f9228o = parcel.readInt();
    }

    public SMSMessage(String str, String str2, boolean z, int i) {
        int i2 = f9222p + 1;
        f9222p = i2;
        this.f9226f = i2;
        this.f9223a = str;
        this.f9224c = str2;
        this.f9227g = 1;
        this.f9225d = z;
        this.f9228o = i;
    }
}
