package com.arlosoft.macrodroid.variables;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: DictionaryKeys.kt */
public final class DictionaryKeys implements Parcelable {
    public static final Parcelable.Creator<DictionaryKeys> CREATOR = new C6465a();
    @SerializedName(alternate = {"a"}, value = "keys")
    private final List<String> keys;

    /* renamed from: com.arlosoft.macrodroid.variables.DictionaryKeys$a */
    /* compiled from: DictionaryKeys.kt */
    public static final class C6465a implements Parcelable.Creator<DictionaryKeys> {
        /* renamed from: a */
        public final DictionaryKeys createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new DictionaryKeys(parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final DictionaryKeys[] newArray(int i) {
            return new DictionaryKeys[i];
        }
    }

    public DictionaryKeys(List<String> list) {
        C13706o.m87929f(list, "keys");
        this.keys = list;
    }

    public static /* synthetic */ DictionaryKeys copy$default(DictionaryKeys dictionaryKeys, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dictionaryKeys.keys;
        }
        return dictionaryKeys.copy(list);
    }

    public final List<String> component1() {
        return this.keys;
    }

    public final DictionaryKeys copy(List<String> list) {
        C13706o.m87929f(list, "keys");
        return new DictionaryKeys(list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DictionaryKeys) && C13706o.m87924a(this.keys, ((DictionaryKeys) obj).keys);
    }

    public final List<String> getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    public String toString() {
        return "DictionaryKeys(keys=" + this.keys + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeStringList(this.keys);
    }
}
