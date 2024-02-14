package com.google.android.gms.location.places;

import android.os.RemoteException;
import com.google.android.gms.location.places.internal.zzy;

public final class zzf extends zzy {

    /* renamed from: a */
    private final zzg f46040a;

    /* renamed from: c */
    private final zze f46041c;

    public zzf(zzg zzg) {
        this.f46040a = zzg;
        this.f46041c = null;
    }

    /* renamed from: L9 */
    public final void mo54340L9(PlacePhotoResult placePhotoResult) throws RemoteException {
        this.f46041c.mo21329l(placePhotoResult);
    }

    /* renamed from: k6 */
    public final void mo54341k6(PlacePhotoMetadataResult placePhotoMetadataResult) throws RemoteException {
        this.f46040a.mo21329l(placePhotoMetadataResult);
    }

    public zzf(zze zze) {
        this.f46040a = null;
        this.f46041c = zze;
    }
}
