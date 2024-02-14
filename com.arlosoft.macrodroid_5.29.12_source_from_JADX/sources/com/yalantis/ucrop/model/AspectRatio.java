package com.yalantis.ucrop.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new C11915a();
    @Nullable

    /* renamed from: a */
    private final String f57989a;

    /* renamed from: c */
    private final float f57990c;

    /* renamed from: d */
    private final float f57991d;

    /* renamed from: com.yalantis.ucrop.model.AspectRatio$a */
    static class C11915a implements Parcelable.Creator<AspectRatio> {
        C11915a() {
        }

        /* renamed from: a */
        public AspectRatio createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }

        /* renamed from: b */
        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    }

    public AspectRatio(@Nullable String str, float f, float f2) {
        this.f57989a = str;
        this.f57990c = f;
        this.f57991d = f2;
    }

    @Nullable
    /* renamed from: a */
    public String mo67216a() {
        return this.f57989a;
    }

    /* renamed from: b */
    public float mo67217b() {
        return this.f57990c;
    }

    /* renamed from: c */
    public float mo67218c() {
        return this.f57991d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57989a);
        parcel.writeFloat(this.f57990c);
        parcel.writeFloat(this.f57991d);
    }

    protected AspectRatio(Parcel parcel) {
        this.f57989a = parcel.readString();
        this.f57990c = parcel.readFloat();
        this.f57991d = parcel.readFloat();
    }
}
