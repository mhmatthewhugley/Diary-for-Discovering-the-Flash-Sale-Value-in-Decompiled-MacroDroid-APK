package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfy implements zzex {

    /* renamed from: a */
    private final zzex f36572a;

    /* renamed from: b */
    private long f36573b;

    /* renamed from: c */
    private Uri f36574c = Uri.EMPTY;

    /* renamed from: d */
    private Map f36575d = Collections.emptyMap();

    public zzfy(zzex zzex) {
        Objects.requireNonNull(zzex);
        this.f36572a = zzex;
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        return this.f36572a.mo43924a();
    }

    /* renamed from: b */
    public final Map mo43925b() {
        return this.f36572a.mo43925b();
    }

    /* renamed from: d */
    public final void mo43926d() throws IOException {
        this.f36572a.mo43926d();
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws IOException {
        int e = this.f36572a.mo43927e(bArr, i, i2);
        if (e != -1) {
            this.f36573b += (long) e;
        }
        return e;
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws IOException {
        this.f36574c = zzfc.f35396a;
        this.f36575d = Collections.emptyMap();
        long g = this.f36572a.mo43928g(zzfc);
        Uri a = mo43924a();
        Objects.requireNonNull(a);
        this.f36574c = a;
        this.f36575d = mo43925b();
        return g;
    }

    /* renamed from: k */
    public final void mo43952k(zzfz zzfz) {
        Objects.requireNonNull(zzfz);
        this.f36572a.mo43952k(zzfz);
    }

    /* renamed from: o */
    public final long mo46576o() {
        return this.f36573b;
    }

    /* renamed from: p */
    public final Uri mo46577p() {
        return this.f36574c;
    }

    /* renamed from: q */
    public final Map mo46578q() {
        return this.f36575d;
    }
}
