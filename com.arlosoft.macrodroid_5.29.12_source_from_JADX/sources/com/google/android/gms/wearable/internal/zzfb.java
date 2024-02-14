package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.internal.wearable.zza;
import com.google.android.gms.internal.wearable.zzc;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzfb extends zza {
    zzfb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* renamed from: Ib */
    public final void mo56421Ib(zzex zzex, String str) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        mo53771y(46, A1);
    }

    /* renamed from: Jb */
    public final void mo56422Jb(zzex zzex, String str) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        mo53771y(32, A1);
    }

    /* renamed from: Kb */
    public final void mo56423Kb(zzex zzex, String str, int i) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        A1.writeInt(i);
        mo53771y(33, A1);
    }

    /* renamed from: Lb */
    public final void mo56424Lb(zzex zzex, Uri uri, int i) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64216d(A1, uri);
        A1.writeInt(i);
        mo53771y(41, A1);
    }

    /* renamed from: Mb */
    public final void mo56425Mb(zzex zzex, int i) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeInt(i);
        mo53771y(43, A1);
    }

    /* renamed from: Nb */
    public final void mo56426Nb(zzex zzex, String str, int i) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        A1.writeInt(i);
        mo53771y(42, A1);
    }

    /* renamed from: Ob */
    public final void mo56427Ob(zzex zzex, zzeu zzeu, String str) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64217e(A1, zzeu);
        A1.writeString(str);
        mo53771y(34, A1);
    }

    /* renamed from: Pb */
    public final void mo56428Pb(zzex zzex, zzeu zzeu, String str) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64217e(A1, zzeu);
        A1.writeString(str);
        mo53771y(35, A1);
    }

    /* renamed from: Qb */
    public final void mo56429Qb(zzex zzex, String str) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        mo53771y(63, A1);
    }

    /* renamed from: Rb */
    public final void mo56430Rb(zzex zzex) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        mo53771y(15, A1);
    }

    /* renamed from: Sb */
    public final void mo56431Sb(zzex zzex, Uri uri) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64216d(A1, uri);
        mo53771y(7, A1);
    }

    /* renamed from: Tb */
    public final void mo56432Tb(zzex zzex) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        mo53771y(8, A1);
    }

    /* renamed from: Ub */
    public final void mo56433Ub(zzex zzex, Uri uri, int i) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64216d(A1, uri);
        A1.writeInt(i);
        mo53771y(40, A1);
    }

    /* renamed from: Vb */
    public final void mo56434Vb(zzex zzex, Asset asset) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64216d(A1, asset);
        mo53771y(13, A1);
    }

    /* renamed from: Wb */
    public final void mo56435Wb(zzex zzex) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        mo53771y(14, A1);
    }

    /* renamed from: Xb */
    public final void mo56436Xb(zzex zzex, String str) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        mo53771y(67, A1);
    }

    /* renamed from: Yb */
    public final void mo56437Yb(zzex zzex, String str, String str2) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        A1.writeString(str2);
        mo53771y(31, A1);
    }

    /* renamed from: Z8 */
    public final void mo56438Z8(zzex zzex, String str, String str2, byte[] bArr) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        A1.writeString(str2);
        A1.writeByteArray(bArr);
        mo53771y(58, A1);
    }

    /* renamed from: Zb */
    public final void mo56439Zb(zzex zzex, PutDataRequest putDataRequest) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64216d(A1, putDataRequest);
        mo53771y(6, A1);
    }

    /* renamed from: ac */
    public final void mo56440ac(zzex zzex, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        zzc.m64216d(A1, parcelFileDescriptor);
        A1.writeLong(j);
        A1.writeLong(j2);
        mo53771y(39, A1);
    }

    /* renamed from: bc */
    public final void mo56441bc(zzex zzex, zzgw zzgw) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64216d(A1, zzgw);
        mo53771y(17, A1);
    }

    /* renamed from: cc */
    public final void mo56442cc(zzex zzex, String str) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        mo53771y(47, A1);
    }

    /* renamed from: dc */
    public final void mo56443dc(zzex zzex, String str, String str2, byte[] bArr) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        A1.writeString(str2);
        A1.writeByteArray(bArr);
        mo53771y(12, A1);
    }

    /* renamed from: g8 */
    public final void mo56444g8(zzex zzex, String str, String str2, byte[] bArr, MessageOptions messageOptions) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        A1.writeString(str2);
        A1.writeByteArray(bArr);
        zzc.m64216d(A1, messageOptions);
        mo53771y(59, A1);
    }

    /* renamed from: ia */
    public final void mo56445ia(zzex zzex, String str, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        A1.writeString(str);
        zzc.m64216d(A1, parcelFileDescriptor);
        mo53771y(38, A1);
    }

    /* renamed from: sb */
    public final void mo56446sb(zzex zzex, zzd zzd) throws RemoteException {
        Parcel A1 = mo53768A1();
        zzc.m64217e(A1, zzex);
        zzc.m64216d(A1, zzd);
        mo53771y(16, A1);
    }
}
