package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgxx extends CustomTabsServiceConnection {

    /* renamed from: a */
    private final WeakReference f37428a;

    public zzgxx(zzbka zzbka, byte[] bArr) {
        this.f37428a = new WeakReference(zzbka);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbka zzbka = (zzbka) this.f37428a.get();
        if (zzbka != null) {
            zzbka.mo42722c(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbka zzbka = (zzbka) this.f37428a.get();
        if (zzbka != null) {
            zzbka.mo42723d();
        }
    }
}
