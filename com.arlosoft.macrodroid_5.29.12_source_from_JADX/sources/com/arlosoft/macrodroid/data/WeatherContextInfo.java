package com.arlosoft.macrodroid.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.data.C4366a;
import java.util.List;

public class WeatherContextInfo implements Parcelable {
    public static final Parcelable.Creator<WeatherContextInfo> CREATOR = new C4364a();

    /* renamed from: a */
    private final double f11108a;

    /* renamed from: c */
    private final double f11109c;

    /* renamed from: d */
    private final double f11110d;

    /* renamed from: f */
    private final int f11111f;

    /* renamed from: g */
    private final int f11112g;

    /* renamed from: o */
    private String f11113o;

    /* renamed from: com.arlosoft.macrodroid.data.WeatherContextInfo$a */
    class C4364a implements Parcelable.Creator<WeatherContextInfo> {
        C4364a() {
        }

        /* renamed from: a */
        public WeatherContextInfo createFromParcel(Parcel parcel) {
            return new WeatherContextInfo(parcel, (C4364a) null);
        }

        /* renamed from: b */
        public WeatherContextInfo[] newArray(int i) {
            return new WeatherContextInfo[i];
        }
    }

    /* synthetic */ WeatherContextInfo(Parcel parcel, C4364a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public String mo28591a() {
        return this.f11113o;
    }

    /* renamed from: b */
    public int mo28592b() {
        return this.f11111f;
    }

    /* renamed from: c */
    public double mo28593c() {
        return this.f11108a;
    }

    /* renamed from: d */
    public double mo28594d() {
        return this.f11109c;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo28596e() {
        return this.f11112g;
    }

    /* renamed from: f */
    public double mo28597f() {
        return this.f11110d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f11108a);
        parcel.writeDouble(this.f11109c);
        parcel.writeDouble(this.f11110d);
        parcel.writeInt(this.f11111f);
        parcel.writeString(this.f11113o);
        parcel.writeInt(this.f11112g);
    }

    public WeatherContextInfo(double d, double d2, double d3, int i, int i2, List<C4366a.C4368b> list) {
        this.f11108a = d;
        this.f11109c = d2;
        this.f11110d = d3;
        this.f11111f = i;
        this.f11112g = i2;
        this.f11113o = "";
        for (C4366a.C4368b a : list) {
            this.f11113o += a.mo28621a() + ", ";
        }
        if (this.f11113o.length() > 2) {
            String str = this.f11113o;
            this.f11113o = str.substring(0, str.length() - 2);
        }
    }

    private WeatherContextInfo(Parcel parcel) {
        this.f11108a = parcel.readDouble();
        this.f11109c = parcel.readDouble();
        this.f11110d = parcel.readDouble();
        this.f11111f = parcel.readInt();
        this.f11113o = parcel.readString();
        this.f11112g = parcel.readInt();
    }
}
