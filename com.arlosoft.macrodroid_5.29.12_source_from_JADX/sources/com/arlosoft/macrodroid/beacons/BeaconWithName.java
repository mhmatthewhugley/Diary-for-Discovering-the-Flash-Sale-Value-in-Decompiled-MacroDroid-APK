package com.arlosoft.macrodroid.beacons;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: BeaconWithName.kt */
public final class BeaconWithName implements Parcelable {
    public static final Parcelable.Creator<BeaconWithName> CREATOR = new C3877a();
    @SerializedName(alternate = {"b"}, value = "name")
    private final String name;
    @SerializedName(alternate = {"a"}, value = "uuid")
    private final String uuid;

    /* renamed from: com.arlosoft.macrodroid.beacons.BeaconWithName$a */
    /* compiled from: BeaconWithName.kt */
    public static final class C3877a implements Parcelable.Creator<BeaconWithName> {
        /* renamed from: a */
        public final BeaconWithName createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new BeaconWithName(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BeaconWithName[] newArray(int i) {
            return new BeaconWithName[i];
        }
    }

    public BeaconWithName(String str, String str2) {
        C13706o.m87929f(str, "uuid");
        this.uuid = str;
        this.name = str2;
    }

    public static /* synthetic */ BeaconWithName copy$default(BeaconWithName beaconWithName, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beaconWithName.uuid;
        }
        if ((i & 2) != 0) {
            str2 = beaconWithName.name;
        }
        return beaconWithName.copy(str, str2);
    }

    public final String component1() {
        return this.uuid;
    }

    public final String component2() {
        return this.name;
    }

    public final BeaconWithName copy(String str, String str2) {
        C13706o.m87929f(str, "uuid");
        return new BeaconWithName(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BeaconWithName) {
            return C13706o.m87924a(((BeaconWithName) obj).uuid, this.uuid);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }

    public String toString() {
        return "BeaconWithName(uuid=" + this.uuid + ", name=" + this.name + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.uuid);
        parcel.writeString(this.name);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeaconWithName(String str, String str2, int i, C13695i iVar) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
