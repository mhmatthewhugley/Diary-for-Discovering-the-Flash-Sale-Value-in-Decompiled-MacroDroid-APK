package com.arlosoft.macrodroid.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: LockedCategories.kt */
public final class LockedCategories implements Parcelable {
    public static final Parcelable.Creator<LockedCategories> CREATOR = new C4360a();
    private final Map<String, String> categoryPasswordMap;

    /* renamed from: com.arlosoft.macrodroid.data.LockedCategories$a */
    /* compiled from: LockedCategories.kt */
    public static final class C4360a implements Parcelable.Creator<LockedCategories> {
        /* renamed from: a */
        public final LockedCategories createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new LockedCategories(linkedHashMap);
        }

        /* renamed from: b */
        public final LockedCategories[] newArray(int i) {
            return new LockedCategories[i];
        }
    }

    public LockedCategories(Map<String, String> map) {
        C13706o.m87929f(map, "categoryPasswordMap");
        this.categoryPasswordMap = map;
    }

    public static /* synthetic */ LockedCategories copy$default(LockedCategories lockedCategories, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = lockedCategories.categoryPasswordMap;
        }
        return lockedCategories.copy(map);
    }

    public final Map<String, String> component1() {
        return this.categoryPasswordMap;
    }

    public final LockedCategories copy(Map<String, String> map) {
        C13706o.m87929f(map, "categoryPasswordMap");
        return new LockedCategories(map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LockedCategories) && C13706o.m87924a(this.categoryPasswordMap, ((LockedCategories) obj).categoryPasswordMap);
    }

    public final Map<String, String> getCategoryPasswordMap() {
        return this.categoryPasswordMap;
    }

    public int hashCode() {
        return this.categoryPasswordMap.hashCode();
    }

    public String toString() {
        return "LockedCategories(categoryPasswordMap=" + this.categoryPasswordMap + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        Map<String, String> map = this.categoryPasswordMap;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }
}
