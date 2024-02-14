package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzfpu extends zzfpi {

    /* renamed from: a */
    private zzftn<Integer> f36246a;

    /* renamed from: c */
    private zzftn<Integer> f36247c;
    @Nullable

    /* renamed from: d */
    private zzfpt f36248d;
    @Nullable

    /* renamed from: f */
    private HttpURLConnection f36249f;

    zzfpu() {
        this(zzfpr.f36244a, zzfps.f36245a, (zzfpt) null);
    }

    zzfpu(zzftn<Integer> zzftn, zzftn<Integer> zzftn2, @Nullable zzfpt zzfpt) {
        this.f36246a = zzftn;
        this.f36247c = zzftn2;
        this.f36248d = zzfpt;
    }

    /* renamed from: f */
    static /* synthetic */ Integer m50746f() {
        return -1;
    }

    /* renamed from: g */
    static /* synthetic */ Integer m50747g() {
        return -1;
    }

    /* renamed from: v */
    public static void m50755v(@Nullable HttpURLConnection httpURLConnection) {
        zzfpj.m50744a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        m50755v(this.f36249f);
    }

    /* renamed from: p */
    public HttpURLConnection mo46072p() throws IOException {
        zzfpj.m50745b(((Integer) this.f36246a.zza()).intValue(), ((Integer) this.f36247c.zza()).intValue());
        zzfpt zzfpt = this.f36248d;
        Objects.requireNonNull(zzfpt);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfpt.zza();
        this.f36249f = httpURLConnection;
        return httpURLConnection;
    }

    /* renamed from: r */
    public HttpURLConnection mo46073r(zzfpt zzfpt, int i, int i2) throws IOException {
        this.f36246a = new zzfpk(i);
        this.f36247c = new zzfpl(i2);
        this.f36248d = zzfpt;
        return mo46072p();
    }
}
