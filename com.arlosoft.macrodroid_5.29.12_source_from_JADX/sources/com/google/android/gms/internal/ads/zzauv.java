package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzauv implements Comparator<zzauu>, Parcelable {
    public static final Parcelable.Creator<zzauv> CREATOR = new zzaus();

    /* renamed from: a */
    private final zzauu[] f25716a;

    /* renamed from: c */
    private int f25717c;

    /* renamed from: d */
    public final int f25718d;

    zzauv(Parcel parcel) {
        zzauu[] zzauuArr = (zzauu[]) parcel.createTypedArray(zzauu.CREATOR);
        this.f25716a = zzauuArr;
        this.f25718d = zzauuArr.length;
    }

    /* renamed from: a */
    public final zzauu mo42084a(int i) {
        return this.f25716a[i];
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzauu zzauu = (zzauu) obj;
        zzauu zzauu2 = (zzauu) obj2;
        UUID uuid = zzash.f25407b;
        if (uuid.equals(zzauu.f25712c)) {
            return !uuid.equals(zzauu2.f25712c) ? 1 : 0;
        }
        return zzauu.f25712c.compareTo(zzauu2.f25712c);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzauv.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f25716a, ((zzauv) obj).f25716a);
    }

    public final int hashCode() {
        int i = this.f25717c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f25716a);
        this.f25717c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f25716a, 0);
    }

    public zzauv(List list) {
        this(false, (zzauu[]) list.toArray(new zzauu[list.size()]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.internal.ads.zzauu[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzauv(boolean r3, com.google.android.gms.internal.ads.zzauu... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.zzauu[] r4 = (com.google.android.gms.internal.ads.zzauu[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0040
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f25712c
            r1 = r4[r3]
            java.util.UUID r1 = r1.f25712c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f25712c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Duplicate data for uuid: "
            java.lang.String r3 = r4.concat(r3)
            r0.<init>(r3)
            throw r0
        L_0x0040:
            r2.f25716a = r4
            r2.f25718d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauv.<init>(boolean, com.google.android.gms.internal.ads.zzauu[]):void");
    }

    public zzauv(zzauu... zzauuArr) {
        this(true, zzauuArr);
    }
}
