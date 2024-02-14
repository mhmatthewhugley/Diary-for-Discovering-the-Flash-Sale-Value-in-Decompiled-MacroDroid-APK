package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzj implements Parcelable.Creator<SafeBrowsingData> {
    /* renamed from: a */
    static void m66572a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, safeBrowsingData.mo56069o2(), false);
        SafeParcelWriter.m4584v(parcel, 3, safeBrowsingData.mo56066l2(), i, false);
        SafeParcelWriter.m4584v(parcel, 4, safeBrowsingData.mo56067m2(), i, false);
        SafeParcelWriter.m4581s(parcel, 5, safeBrowsingData.mo56068n2());
        SafeParcelWriter.m4569g(parcel, 6, safeBrowsingData.mo56070p2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4528O(r12)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r10 = r7
            r8 = r2
        L_0x000c:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0050
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4518E(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4553w(r1)
            r3 = 2
            if (r2 == r3) goto L_0x004b
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r3 = 4
            if (r2 == r3) goto L_0x0037
            r3 = 5
            if (r2 == r3) goto L_0x0032
            r3 = 6
            if (r2 == r3) goto L_0x002d
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4527N(r12, r1)
            goto L_0x000c
        L_0x002d:
            byte[] r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4537g(r12, r1)
            goto L_0x000c
        L_0x0032:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4523J(r12, r1)
            goto L_0x000c
        L_0x0037:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4546p(r12, r1, r2)
            r7 = r1
            android.os.ParcelFileDescriptor r7 = (android.os.ParcelFileDescriptor) r7
            goto L_0x000c
        L_0x0041:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r2 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4546p(r12, r1, r2)
            r6 = r1
            com.google.android.gms.common.data.DataHolder r6 = (com.google.android.gms.common.data.DataHolder) r6
            goto L_0x000c
        L_0x004b:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4547q(r12, r1)
            goto L_0x000c
        L_0x0050:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m4552v(r12, r0)
            com.google.android.gms.safetynet.SafeBrowsingData r12 = new com.google.android.gms.safetynet.SafeBrowsingData
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.zzj.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
