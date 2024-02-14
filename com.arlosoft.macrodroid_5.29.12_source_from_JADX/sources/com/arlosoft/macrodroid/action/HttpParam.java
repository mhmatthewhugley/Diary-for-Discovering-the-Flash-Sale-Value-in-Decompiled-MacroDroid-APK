package com.arlosoft.macrodroid.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: HttpRequestAction.kt */
public final class HttpParam implements Parcelable {
    public static final Parcelable.Creator<HttpParam> CREATOR = new C2475a();
    private final String paramName;
    private final String paramValue;

    /* renamed from: com.arlosoft.macrodroid.action.HttpParam$a */
    /* compiled from: HttpRequestAction.kt */
    public static final class C2475a implements Parcelable.Creator<HttpParam> {
        /* renamed from: a */
        public final HttpParam createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new HttpParam(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final HttpParam[] newArray(int i) {
            return new HttpParam[i];
        }
    }

    public HttpParam(String str, String str2) {
        C13706o.m87929f(str, "paramName");
        C13706o.m87929f(str2, "paramValue");
        this.paramName = str;
        this.paramValue = str2;
    }

    public static /* synthetic */ HttpParam copy$default(HttpParam httpParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpParam.paramName;
        }
        if ((i & 2) != 0) {
            str2 = httpParam.paramValue;
        }
        return httpParam.copy(str, str2);
    }

    public final String component1() {
        return this.paramName;
    }

    public final String component2() {
        return this.paramValue;
    }

    public final HttpParam copy(String str, String str2) {
        C13706o.m87929f(str, "paramName");
        C13706o.m87929f(str2, "paramValue");
        return new HttpParam(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpParam)) {
            return false;
        }
        HttpParam httpParam = (HttpParam) obj;
        return C13706o.m87924a(this.paramName, httpParam.paramName) && C13706o.m87924a(this.paramValue, httpParam.paramValue);
    }

    public final String getParamName() {
        return this.paramName;
    }

    public final String getParamValue() {
        return this.paramValue;
    }

    public int hashCode() {
        return (this.paramName.hashCode() * 31) + this.paramValue.hashCode();
    }

    public String toString() {
        return "HttpParam(paramName=" + this.paramName + ", paramValue=" + this.paramValue + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.paramName);
        parcel.writeString(this.paramValue);
    }
}
