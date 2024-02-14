package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zze;

public final class zzf extends zza implements zze {
    zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate mo54651J9(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.maps.StreetViewPanoramaOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo50655y()
            com.google.android.gms.internal.maps.zzc.m59346c(r0, r3)
            com.google.android.gms.internal.maps.zzc.m59347d(r0, r4)
            r3 = 7
            android.os.Parcel r3 = r2.mo50654t1(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate r4 = (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.zzbw r0 = new com.google.android.gms.maps.internal.zzbw
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.mo54651J9(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions):com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    /* renamed from: Ja */
    public final void mo54652Ja(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel y = mo50655y();
        zzc.m59346c(y, iObjectWrapper);
        y.writeInt(i);
        mo50652A1(6, y);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IMapFragmentDelegate mo54653Y0(com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo50655y()
            com.google.android.gms.internal.maps.zzc.m59346c(r0, r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo50654t1(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.IMapFragmentDelegate
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.maps.internal.IMapFragmentDelegate r0 = (com.google.android.gms.maps.internal.IMapFragmentDelegate) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.maps.internal.zzj r1 = new com.google.android.gms.maps.internal.zzj
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.mo54653Y0(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate mo54654b() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo50655y()
            r1 = 4
            android.os.Parcel r0 = r4.mo50654t1(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r1 = (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.internal.zzb r2 = new com.google.android.gms.maps.internal.zzb
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.mo54654b():com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: c */
    public final zze mo54655c() throws RemoteException {
        Parcel t1 = mo50654t1(5, mo50655y());
        zze t12 = com.google.android.gms.internal.maps.zzf.m59351t1(t1.readStrongBinder());
        t1.recycle();
        return t12;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate mo54656d0(com.google.android.gms.dynamic.IObjectWrapper r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo50655y()
            com.google.android.gms.internal.maps.zzc.m59346c(r0, r4)
            r4 = 8
            android.os.Parcel r4 = r3.mo50654t1(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            if (r2 == 0) goto L_0x0023
            r0 = r1
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate r0 = (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) r0
            goto L_0x0029
        L_0x0023:
            com.google.android.gms.maps.internal.zzbv r1 = new com.google.android.gms.maps.internal.zzbv
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.mo54656d0(com.google.android.gms.dynamic.IObjectWrapper):com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.internal.IMapViewDelegate mo54657n8(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.android.gms.maps.GoogleMapOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo50655y()
            com.google.android.gms.internal.maps.zzc.m59346c(r0, r3)
            com.google.android.gms.internal.maps.zzc.m59347d(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.mo50654t1(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.internal.IMapViewDelegate
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.internal.IMapViewDelegate r4 = (com.google.android.gms.maps.internal.IMapViewDelegate) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.internal.zzk r0 = new com.google.android.gms.maps.internal.zzk
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzf.mo54657n8(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.maps.GoogleMapOptions):com.google.android.gms.maps.internal.IMapViewDelegate");
    }
}
