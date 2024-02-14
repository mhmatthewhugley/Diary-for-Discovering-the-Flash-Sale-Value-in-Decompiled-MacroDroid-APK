package com.google.android.gms.wearable.internal;

import com.google.android.gms.internal.wearable.zzb;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class zzez extends zzb implements zzfa {
    public zzez() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53847y(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r4 = 13
            if (r2 == r4) goto L_0x00a3
            r4 = 14
            if (r2 == r4) goto L_0x0097
            switch(r2) {
                case 1: goto L_0x0088;
                case 2: goto L_0x0079;
                case 3: goto L_0x006a;
                case 4: goto L_0x005b;
                case 5: goto L_0x004d;
                case 6: goto L_0x003d;
                case 7: goto L_0x002d;
                case 8: goto L_0x001d;
                case 9: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r2 = 0
            return r2
        L_0x000d:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzi> r2 = com.google.android.gms.wearable.internal.zzi.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzi r2 = (com.google.android.gms.wearable.internal.zzi) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56415a7(r2)
            goto L_0x00cd
        L_0x001d:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzao> r2 = com.google.android.gms.wearable.internal.zzao.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzao r2 = (com.google.android.gms.wearable.internal.zzao) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56420ua(r2)
            goto L_0x00cd
        L_0x002d:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzbf> r2 = com.google.android.gms.wearable.internal.zzbf.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzbf r2 = (com.google.android.gms.wearable.internal.zzbf) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56411Ba(r2)
            goto L_0x00cd
        L_0x003d:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzl> r2 = com.google.android.gms.wearable.internal.zzl.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzl r2 = (com.google.android.gms.wearable.internal.zzl) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56418ra(r2)
            goto L_0x00cd
        L_0x004d:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzgm> r2 = com.google.android.gms.wearable.internal.zzgm.CREATOR
            java.util.ArrayList r2 = r3.createTypedArrayList(r2)
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56416b1(r2)
            goto L_0x00cd
        L_0x005b:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzgm> r2 = com.google.android.gms.wearable.internal.zzgm.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzgm r2 = (com.google.android.gms.wearable.internal.zzgm) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56413Ta(r2)
            goto L_0x00cd
        L_0x006a:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzgm> r2 = com.google.android.gms.wearable.internal.zzgm.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzgm r2 = (com.google.android.gms.wearable.internal.zzgm) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56417jb(r2)
            goto L_0x00cd
        L_0x0079:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzfx> r2 = com.google.android.gms.wearable.internal.zzfx.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzfx r2 = (com.google.android.gms.wearable.internal.zzfx) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56412G1(r2)
            goto L_0x00cd
        L_0x0088:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r2 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.common.data.DataHolder r2 = (com.google.android.gms.common.data.DataHolder) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56414V0(r2)
            goto L_0x00cd
        L_0x0097:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzcf> r2 = com.google.android.gms.wearable.internal.zzcf.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzcf r2 = (com.google.android.gms.wearable.internal.zzcf) r2
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            goto L_0x00cd
        L_0x00a3:
            android.os.Parcelable$Creator<com.google.android.gms.wearable.internal.zzfx> r2 = com.google.android.gms.wearable.internal.zzfx.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.wearable.zzc.m64213a(r3, r2)
            com.google.android.gms.wearable.internal.zzfx r2 = (com.google.android.gms.wearable.internal.zzfx) r2
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x00b3
            r4 = 0
            goto L_0x00c7
        L_0x00b3:
            java.lang.String r5 = "com.google.android.gms.wearable.internal.IRpcResponseCallback"
            android.os.IInterface r5 = r4.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.wearable.internal.zzev
            if (r0 == 0) goto L_0x00c1
            r4 = r5
            com.google.android.gms.wearable.internal.zzev r4 = (com.google.android.gms.wearable.internal.zzev) r4
            goto L_0x00c7
        L_0x00c1:
            com.google.android.gms.wearable.internal.zzev r5 = new com.google.android.gms.wearable.internal.zzev
            r5.<init>(r4)
            r4 = r5
        L_0x00c7:
            com.google.android.gms.internal.wearable.zzc.m64214b(r3)
            r1.mo56419u5(r2, r4)
        L_0x00cd:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zzez.mo53847y(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
