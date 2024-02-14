package com.arlosoft.macrodroid.logcat;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C13706o;

/* compiled from: LogcatMessage.kt */
public final class LogcatMessage implements Parcelable {
    public static final Parcelable.Creator<LogcatMessage> CREATOR = new C4838a();

    /* renamed from: a */
    private final String f12183a;

    /* renamed from: c */
    private final String f12184c;

    /* renamed from: com.arlosoft.macrodroid.logcat.LogcatMessage$a */
    /* compiled from: LogcatMessage.kt */
    public static final class C4838a implements Parcelable.Creator<LogcatMessage> {
        /* renamed from: a */
        public final LogcatMessage createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new LogcatMessage(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final LogcatMessage[] newArray(int i) {
            return new LogcatMessage[i];
        }
    }

    public LogcatMessage(String str, String str2) {
        C13706o.m87929f(str, "component");
        C13706o.m87929f(str2, "message");
        this.f12183a = str;
        this.f12184c = str2;
    }

    /* renamed from: a */
    public final String mo29367a() {
        return this.f12183a;
    }

    /* renamed from: b */
    public final String mo29368b() {
        return this.f12184c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogcatMessage)) {
            return false;
        }
        LogcatMessage logcatMessage = (LogcatMessage) obj;
        return C13706o.m87924a(this.f12183a, logcatMessage.f12183a) && C13706o.m87924a(this.f12184c, logcatMessage.f12184c);
    }

    public int hashCode() {
        return (this.f12183a.hashCode() * 31) + this.f12184c.hashCode();
    }

    public String toString() {
        return "LogcatMessage(component=" + this.f12183a + ", message=" + this.f12184c + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.f12183a);
        parcel.writeString(this.f12184c);
    }
}
