package com.arlosoft.macrodroid.variables;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: VariableWithDictionaryKeys.kt */
public final class VariableWithDictionaryKeys implements Parcelable {
    public static final Parcelable.Creator<VariableWithDictionaryKeys> CREATOR = new C6486a();
    @SerializedName(alternate = {"b"}, value = "keys")
    private final DictionaryKeys keys;
    @SerializedName(alternate = {"a"}, value = "variableName")
    private final String variableName;

    /* renamed from: com.arlosoft.macrodroid.variables.VariableWithDictionaryKeys$a */
    /* compiled from: VariableWithDictionaryKeys.kt */
    public static final class C6486a implements Parcelable.Creator<VariableWithDictionaryKeys> {
        /* renamed from: a */
        public final VariableWithDictionaryKeys createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new VariableWithDictionaryKeys(parcel.readString(), DictionaryKeys.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final VariableWithDictionaryKeys[] newArray(int i) {
            return new VariableWithDictionaryKeys[i];
        }
    }

    public VariableWithDictionaryKeys(String str, DictionaryKeys dictionaryKeys) {
        C13706o.m87929f(str, "variableName");
        C13706o.m87929f(dictionaryKeys, "keys");
        this.variableName = str;
        this.keys = dictionaryKeys;
    }

    public static /* synthetic */ VariableWithDictionaryKeys copy$default(VariableWithDictionaryKeys variableWithDictionaryKeys, String str, DictionaryKeys dictionaryKeys, int i, Object obj) {
        if ((i & 1) != 0) {
            str = variableWithDictionaryKeys.variableName;
        }
        if ((i & 2) != 0) {
            dictionaryKeys = variableWithDictionaryKeys.keys;
        }
        return variableWithDictionaryKeys.copy(str, dictionaryKeys);
    }

    public final String component1() {
        return this.variableName;
    }

    public final DictionaryKeys component2() {
        return this.keys;
    }

    public final VariableWithDictionaryKeys copy(String str, DictionaryKeys dictionaryKeys) {
        C13706o.m87929f(str, "variableName");
        C13706o.m87929f(dictionaryKeys, "keys");
        return new VariableWithDictionaryKeys(str, dictionaryKeys);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariableWithDictionaryKeys)) {
            return false;
        }
        VariableWithDictionaryKeys variableWithDictionaryKeys = (VariableWithDictionaryKeys) obj;
        return C13706o.m87924a(this.variableName, variableWithDictionaryKeys.variableName) && C13706o.m87924a(this.keys, variableWithDictionaryKeys.keys);
    }

    public final DictionaryKeys getKeys() {
        return this.keys;
    }

    public final String getVariableName() {
        return this.variableName;
    }

    public int hashCode() {
        return (this.variableName.hashCode() * 31) + this.keys.hashCode();
    }

    public String toString() {
        return "VariableWithDictionaryKeys(variableName=" + this.variableName + ", keys=" + this.keys + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.variableName);
        this.keys.writeToParcel(parcel, i);
    }
}
