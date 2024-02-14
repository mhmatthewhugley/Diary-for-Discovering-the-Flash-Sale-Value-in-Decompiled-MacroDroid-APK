package com.firebase.p073ui.auth.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import java.text.Collator;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.firebase.ui.auth.data.model.CountryInfo */
public final class CountryInfo implements Comparable<CountryInfo>, Parcelable {
    public static final Parcelable.Creator<CountryInfo> CREATOR = new C6850a();

    /* renamed from: a */
    private final Collator f15975a;

    /* renamed from: c */
    private final Locale f15976c;

    /* renamed from: d */
    private final int f15977d;

    /* renamed from: com.firebase.ui.auth.data.model.CountryInfo$a */
    static class C6850a implements Parcelable.Creator<CountryInfo> {
        C6850a() {
        }

        /* renamed from: a */
        public CountryInfo createFromParcel(Parcel parcel) {
            return new CountryInfo(parcel);
        }

        /* renamed from: b */
        public CountryInfo[] newArray(int i) {
            return new CountryInfo[i];
        }
    }

    public CountryInfo(Locale locale, int i) {
        Collator instance = Collator.getInstance(Locale.getDefault());
        this.f15975a = instance;
        instance.setStrength(0);
        this.f15976c = locale;
        this.f15977d = i;
    }

    /* renamed from: f */
    public static String m25794f(Locale locale) {
        String country = locale.getCountry();
        return new String(Character.toChars((Character.codePointAt(country, 0) - 65) + 127462)) + new String(Character.toChars((Character.codePointAt(country, 1) - 65) + 127462));
    }

    /* renamed from: b */
    public int compareTo(CountryInfo countryInfo) {
        return this.f15975a.compare(this.f15976c.getDisplayCountry(), countryInfo.f15976c.getDisplayCountry());
    }

    /* renamed from: d */
    public int mo34128d() {
        return this.f15977d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Locale mo34130e() {
        return this.f15976c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CountryInfo.class != obj.getClass()) {
            return false;
        }
        CountryInfo countryInfo = (CountryInfo) obj;
        if (this.f15977d == countryInfo.f15977d) {
            Locale locale = this.f15976c;
            if (locale != null) {
                if (locale.equals(countryInfo.f15976c)) {
                    return true;
                }
            } else if (countryInfo.f15976c == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Locale locale = this.f15976c;
        return ((locale != null ? locale.hashCode() : 0) * 31) + this.f15977d;
    }

    public String toString() {
        return m25794f(this.f15976c) + " " + this.f15976c.getDisplayCountry() + " +" + this.f15977d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f15976c);
        parcel.writeInt(this.f15977d);
    }

    protected CountryInfo(Parcel parcel) {
        Collator instance = Collator.getInstance(Locale.getDefault());
        this.f15975a = instance;
        instance.setStrength(0);
        this.f15976c = (Locale) parcel.readSerializable();
        this.f15977d = parcel.readInt();
    }
}
