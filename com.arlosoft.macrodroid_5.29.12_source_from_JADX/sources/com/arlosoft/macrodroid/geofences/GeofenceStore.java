package com.arlosoft.macrodroid.geofences;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.arlosoft.macrodroid.common.DontObfuscate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: GeofenceStore.kt */
public final class GeofenceStore implements Parcelable {
    public static final Parcelable.Creator<GeofenceStore> CREATOR = new C4706a();
    private final Map<String, GeofenceInfo> geofenceMap;

    /* renamed from: com.arlosoft.macrodroid.geofences.GeofenceStore$a */
    /* compiled from: GeofenceStore.kt */
    public static final class C4706a implements Parcelable.Creator<GeofenceStore> {
        /* renamed from: a */
        public final GeofenceStore createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), GeofenceInfo.CREATOR.createFromParcel(parcel));
            }
            return new GeofenceStore(linkedHashMap);
        }

        /* renamed from: b */
        public final GeofenceStore[] newArray(int i) {
            return new GeofenceStore[i];
        }
    }

    public GeofenceStore() {
        this((Map) null, 1, (C13695i) null);
    }

    public GeofenceStore(Map<String, GeofenceInfo> map) {
        C13706o.m87929f(map, "geofenceMap");
        this.geofenceMap = map;
    }

    public static /* synthetic */ GeofenceStore copy$default(GeofenceStore geofenceStore, Map<String, GeofenceInfo> map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = geofenceStore.geofenceMap;
        }
        return geofenceStore.copy(map);
    }

    public final Map<String, GeofenceInfo> component1() {
        return this.geofenceMap;
    }

    public final GeofenceStore copy(Map<String, GeofenceInfo> map) {
        C13706o.m87929f(map, "geofenceMap");
        return new GeofenceStore(map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GeofenceStore) && C13706o.m87924a(this.geofenceMap, ((GeofenceStore) obj).geofenceMap);
    }

    public final List<GeofenceInfo> getGeofenceList() {
        ArrayList arrayList = new ArrayList(this.geofenceMap.values());
        C13622x.m87780x(arrayList);
        return arrayList;
    }

    public final Map<String, GeofenceInfo> getGeofenceMap() {
        return this.geofenceMap;
    }

    public int hashCode() {
        return this.geofenceMap.hashCode();
    }

    public final void removeGeofence(String str) {
        C13706o.m87929f(str, "id");
        this.geofenceMap.remove(str);
    }

    public final void setGeofence(String str, GeofenceInfo geofenceInfo) {
        C13706o.m87929f(str, "id");
        C13706o.m87929f(geofenceInfo, "geofence");
        this.geofenceMap.put(str, geofenceInfo);
    }

    public String toString() {
        return "GeofenceStore(geofenceMap=" + this.geofenceMap + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        Map<String, GeofenceInfo> map = this.geofenceMap;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            ((GeofenceInfo) next.getValue()).writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GeofenceStore(Map map, int i, C13695i iVar) {
        this((i & 1) != 0 ? new ArrayMap() : map);
    }
}
