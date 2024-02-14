package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings {

    /* renamed from: a */
    private final IUiSettingsDelegate f46214a;

    UiSettings(IUiSettingsDelegate iUiSettingsDelegate) {
        this.f46214a = iUiSettingsDelegate;
    }

    /* renamed from: a */
    public final void mo54563a(boolean z) {
        try {
            this.f46214a.mo54626na(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo54564b(boolean z) {
        try {
            this.f46214a.mo54625j9(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
