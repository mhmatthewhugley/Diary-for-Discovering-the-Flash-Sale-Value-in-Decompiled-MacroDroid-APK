package com.google.android.gms.maps.internal;

import com.google.android.gms.internal.maps.zzb;

public abstract class zzaq extends zzb implements zzap {
    public zzaq() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo50661y(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 1
            if (r2 != r5) goto L_0x0026
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000b
            r2 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r3 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.maps.internal.IGoogleMapDelegate
            if (r0 == 0) goto L_0x0019
            r2 = r3
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = (com.google.android.gms.maps.internal.IGoogleMapDelegate) r2
            goto L_0x001f
        L_0x0019:
            com.google.android.gms.maps.internal.zzg r3 = new com.google.android.gms.maps.internal.zzg
            r3.<init>(r2)
            r2 = r3
        L_0x001f:
            r1.mo54633Ha(r2)
            r4.writeNoException()
            return r5
        L_0x0026:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzaq.mo50661y(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
