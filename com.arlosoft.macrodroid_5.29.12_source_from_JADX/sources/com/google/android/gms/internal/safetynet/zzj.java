package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzj extends zza implements zzi {
    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    /* renamed from: B5 */
    public final void mo53754B5(zzg zzg) throws RemoteException {
        Parcel y = mo53741y();
        zzc.m63955b(y, zzg);
        mo53740t1(4, y);
    }

    /* renamed from: I7 */
    public final void mo53755I7(zzg zzg) throws RemoteException {
        Parcel y = mo53741y();
        zzc.m63955b(y, zzg);
        mo53740t1(5, y);
    }

    /* renamed from: J2 */
    public final void mo53756J2(zzg zzg, byte[] bArr, String str) throws RemoteException {
        Parcel y = mo53741y();
        zzc.m63955b(y, zzg);
        y.writeByteArray(bArr);
        y.writeString(str);
        mo53740t1(7, y);
    }

    /* renamed from: P6 */
    public final void mo53757P6(zzg zzg, String str, int[] iArr, int i, String str2) throws RemoteException {
        Parcel y = mo53741y();
        zzc.m63955b(y, zzg);
        y.writeString(str);
        y.writeIntArray(iArr);
        y.writeInt(i);
        y.writeString(str2);
        mo53740t1(3, y);
    }

    /* renamed from: Qa */
    public final void mo53758Qa(zzg zzg, String str) throws RemoteException {
        Parcel y = mo53741y();
        zzc.m63955b(y, zzg);
        y.writeString(str);
        mo53740t1(6, y);
    }

    /* renamed from: Y3 */
    public final void mo53759Y3(zzg zzg) throws RemoteException {
        Parcel y = mo53741y();
        zzc.m63955b(y, zzg);
        mo53740t1(12, y);
    }

    /* renamed from: i6 */
    public final void mo53760i6(zzg zzg) throws RemoteException {
        Parcel y = mo53741y();
        zzc.m63955b(y, zzg);
        mo53740t1(14, y);
    }

    public final void zzb() throws RemoteException {
        mo53740t1(13, mo53741y());
    }
}
