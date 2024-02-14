package com.arlosoft.macrodroid.geofences;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: GeofenceInfo.kt */
public final class GeofenceInfo implements Parcelable, Comparable<GeofenceInfo> {
    public static final Parcelable.Creator<GeofenceInfo> CREATOR = new C4704b();
    public static final C4703a Companion = new C4703a((C13695i) null);
    public static final String GEOFENCE_CACHE = "GeofenceInfo";
    public static final String GEOFENCE_GENERIC_ID = "generic";
    public static final String GEOFENCE_KEY = "GeofenceInfo";
    public static final int STATUS_INSIDE = 1;
    public static final int STATUS_OUTSIDE = 2;
    public static final int STATUS_UNKNOWN = 0;

    /* renamed from: id */
    private final String f11822id;
    private final int insideStatus;
    private final double latitude;
    private final double longitude;
    private final String name;
    private final int radius;

    /* renamed from: com.arlosoft.macrodroid.geofences.GeofenceInfo$a */
    /* compiled from: GeofenceInfo.kt */
    public static final class C4703a {
        private C4703a() {
        }

        public /* synthetic */ C4703a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.geofences.GeofenceInfo$b */
    /* compiled from: GeofenceInfo.kt */
    public static final class C4704b implements Parcelable.Creator<GeofenceInfo> {
        /* renamed from: a */
        public final GeofenceInfo createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new GeofenceInfo(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final GeofenceInfo[] newArray(int i) {
            return new GeofenceInfo[i];
        }
    }

    public GeofenceInfo(String str, String str2, double d, double d2, int i, int i2) {
        C13706o.m87929f(str, "id");
        C13706o.m87929f(str2, "name");
        this.f11822id = str;
        this.name = str2;
        this.latitude = d;
        this.longitude = d2;
        this.radius = i;
        this.insideStatus = i2;
    }

    public static /* synthetic */ GeofenceInfo copy$default(GeofenceInfo geofenceInfo, String str, String str2, double d, double d2, int i, int i2, int i3, Object obj) {
        GeofenceInfo geofenceInfo2 = geofenceInfo;
        return geofenceInfo.copy((i3 & 1) != 0 ? geofenceInfo2.f11822id : str, (i3 & 2) != 0 ? geofenceInfo2.name : str2, (i3 & 4) != 0 ? geofenceInfo2.latitude : d, (i3 & 8) != 0 ? geofenceInfo2.longitude : d2, (i3 & 16) != 0 ? geofenceInfo2.radius : i, (i3 & 32) != 0 ? geofenceInfo2.insideStatus : i2);
    }

    public final String component1() {
        return this.f11822id;
    }

    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.latitude;
    }

    public final double component4() {
        return this.longitude;
    }

    public final int component5() {
        return this.radius;
    }

    public final int component6() {
        return this.insideStatus;
    }

    public final GeofenceInfo copy(String str, String str2, double d, double d2, int i, int i2) {
        C13706o.m87929f(str, "id");
        C13706o.m87929f(str2, "name");
        return new GeofenceInfo(str, str2, d, d2, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeofenceInfo)) {
            return false;
        }
        GeofenceInfo geofenceInfo = (GeofenceInfo) obj;
        return C13706o.m87924a(this.f11822id, geofenceInfo.f11822id) && C13706o.m87924a(this.name, geofenceInfo.name) && C13706o.m87924a(Double.valueOf(this.latitude), Double.valueOf(geofenceInfo.latitude)) && C13706o.m87924a(Double.valueOf(this.longitude), Double.valueOf(geofenceInfo.longitude)) && this.radius == geofenceInfo.radius && this.insideStatus == geofenceInfo.insideStatus;
    }

    public final String getId() {
        return this.f11822id;
    }

    public final int getInsideStatus() {
        return this.insideStatus;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((((((this.f11822id.hashCode() * 31) + this.name.hashCode()) * 31) + Double.doubleToLongBits(this.latitude)) * 31) + Double.doubleToLongBits(this.longitude)) * 31) + this.radius) * 31) + this.insideStatus;
    }

    public String toString() {
        return "GeofenceInfo(id=" + this.f11822id + ", name=" + this.name + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", radius=" + this.radius + ", insideStatus=" + this.insideStatus + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.f11822id);
        parcel.writeString(this.name);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeInt(this.radius);
        parcel.writeInt(this.insideStatus);
    }

    public int compareTo(GeofenceInfo geofenceInfo) {
        C13706o.m87929f(geofenceInfo, "otherGroup");
        return this.name.compareTo(geofenceInfo.name);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GeofenceInfo(java.lang.String r12, java.lang.String r13, double r14, double r16, int r18, int r19, int r20, kotlin.jvm.internal.C13695i r21) {
        /*
            r11 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L_0x0013
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r12
        L_0x0014:
            r0 = r20 & 2
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = ""
            r4 = r0
            goto L_0x001d
        L_0x001c:
            r4 = r13
        L_0x001d:
            r0 = r20 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0025
            r5 = r1
            goto L_0x0026
        L_0x0025:
            r5 = r14
        L_0x0026:
            r0 = r20 & 8
            if (r0 == 0) goto L_0x002c
            r7 = r1
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r0 = r20 & 16
            if (r0 == 0) goto L_0x0035
            r0 = 0
            r9 = 0
            goto L_0x0037
        L_0x0035:
            r9 = r18
        L_0x0037:
            r2 = r11
            r10 = r19
            r2.<init>(r3, r4, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.geofences.GeofenceInfo.<init>(java.lang.String, java.lang.String, double, double, int, int, int, kotlin.jvm.internal.i):void");
    }
}
