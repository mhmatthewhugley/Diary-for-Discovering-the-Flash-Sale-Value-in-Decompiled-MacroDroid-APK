package com.firebase.p073ui.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.firebase.ui.auth.AuthMethodPickerLayout */
public class AuthMethodPickerLayout implements Parcelable {
    public static final Parcelable.Creator<AuthMethodPickerLayout> CREATOR = new C6833a();
    @LayoutRes

    /* renamed from: a */
    private int f15904a;
    @IdRes

    /* renamed from: c */
    private int f15905c;

    /* renamed from: d */
    private Map<String, Integer> f15906d;

    /* renamed from: com.firebase.ui.auth.AuthMethodPickerLayout$a */
    static class C6833a implements Parcelable.Creator<AuthMethodPickerLayout> {
        C6833a() {
        }

        /* renamed from: a */
        public AuthMethodPickerLayout createFromParcel(Parcel parcel) {
            return new AuthMethodPickerLayout(parcel, (C6833a) null);
        }

        /* renamed from: b */
        public AuthMethodPickerLayout[] newArray(int i) {
            return new AuthMethodPickerLayout[i];
        }
    }

    /* synthetic */ AuthMethodPickerLayout(Parcel parcel, C6833a aVar) {
        this(parcel);
    }

    @LayoutRes
    /* renamed from: a */
    public int mo34040a() {
        return this.f15904a;
    }

    /* renamed from: b */
    public Map<String, Integer> mo34041b() {
        return this.f15906d;
    }

    @IdRes
    /* renamed from: c */
    public int mo34042c() {
        return this.f15905c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15904a);
        parcel.writeInt(this.f15905c);
        Bundle bundle = new Bundle();
        for (String next : this.f15906d.keySet()) {
            bundle.putInt(next, this.f15906d.get(next).intValue());
        }
        parcel.writeBundle(bundle);
    }

    private AuthMethodPickerLayout() {
        this.f15905c = -1;
    }

    private AuthMethodPickerLayout(@NonNull Parcel parcel) {
        this.f15905c = -1;
        this.f15904a = parcel.readInt();
        this.f15905c = parcel.readInt();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f15906d = new HashMap();
        for (String str : readBundle.keySet()) {
            this.f15906d.put(str, Integer.valueOf(readBundle.getInt(str)));
        }
    }
}
