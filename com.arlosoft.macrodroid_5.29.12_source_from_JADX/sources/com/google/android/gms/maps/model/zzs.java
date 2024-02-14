package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;

final class zzs implements TileProvider {

    /* renamed from: b */
    private final zzaf f46353b;

    /* renamed from: c */
    private final /* synthetic */ TileOverlayOptions f46354c;

    zzs(TileOverlayOptions tileOverlayOptions) {
        this.f46354c = tileOverlayOptions;
        this.f46353b = tileOverlayOptions.f46339a;
    }

    /* renamed from: E0 */
    public final Tile mo54804E0(int i, int i2, int i3) {
        try {
            return this.f46353b.mo50660E0(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
