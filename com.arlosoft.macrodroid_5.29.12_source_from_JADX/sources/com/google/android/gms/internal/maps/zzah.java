package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

public final class zzah extends zza implements zzaf {
    zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: E0 */
    public final Tile mo50660E0(int i, int i2, int i3) throws RemoteException {
        Parcel y = mo50655y();
        y.writeInt(i);
        y.writeInt(i2);
        y.writeInt(i3);
        Parcel t1 = mo50654t1(1, y);
        Tile tile = (Tile) zzc.m59345b(t1, Tile.CREATOR);
        t1.recycle();
        return tile;
    }
}
