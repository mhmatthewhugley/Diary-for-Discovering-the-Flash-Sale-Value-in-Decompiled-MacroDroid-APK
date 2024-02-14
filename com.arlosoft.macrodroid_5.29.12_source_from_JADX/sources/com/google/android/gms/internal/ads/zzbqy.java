package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.p027h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

@RequiresApi(api = 21)
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbqy {

    /* renamed from: a */
    private final Context f27662a;

    /* renamed from: b */
    private final OnH5AdsEventListener f27663b;
    @Nullable

    /* renamed from: c */
    private zzbqu f27664c;

    /* renamed from: b */
    public static final boolean m43997b(String str) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27120f8)).booleanValue()) {
            return false;
        }
        Preconditions.m4488k(str);
        if (str.length() > ((Integer) zzay.m1924c().mo42663b(zzbjc.f27140h8)).intValue()) {
            zzcgp.m45224b("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m43998c() {
        if (this.f27664c == null) {
            this.f27664c = zzaw.m1916a().mo19879j(this.f27662a, new zzbvh(), this.f27663b);
        }
    }

    /* renamed from: a */
    public final boolean mo42919a(String str) {
        if (!m43997b(str)) {
            return false;
        }
        m43998c();
        zzbqu zzbqu = this.f27664c;
        if (zzbqu == null) {
            return false;
        }
        try {
            zzbqu.mo42916W(str);
            return true;
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            return true;
        }
    }
}
