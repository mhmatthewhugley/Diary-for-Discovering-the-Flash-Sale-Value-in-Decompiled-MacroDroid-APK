package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfe implements zzex {

    /* renamed from: a */
    private final Context f35595a;

    /* renamed from: b */
    private final List f35596b = new ArrayList();

    /* renamed from: c */
    private final zzex f35597c;
    @Nullable

    /* renamed from: d */
    private zzex f35598d;
    @Nullable

    /* renamed from: e */
    private zzex f35599e;
    @Nullable

    /* renamed from: f */
    private zzex f35600f;
    @Nullable

    /* renamed from: g */
    private zzex f35601g;
    @Nullable

    /* renamed from: h */
    private zzex f35602h;
    @Nullable

    /* renamed from: i */
    private zzex f35603i;
    @Nullable

    /* renamed from: j */
    private zzex f35604j;
    @Nullable

    /* renamed from: k */
    private zzex f35605k;

    public zzfe(Context context, zzex zzex) {
        this.f35595a = context.getApplicationContext();
        this.f35597c = zzex;
    }

    /* renamed from: o */
    private final zzex m49950o() {
        if (this.f35599e == null) {
            zzeq zzeq = new zzeq(this.f35595a);
            this.f35599e = zzeq;
            m49951p(zzeq);
        }
        return this.f35599e;
    }

    /* renamed from: p */
    private final void m49951p(zzex zzex) {
        for (int i = 0; i < this.f35596b.size(); i++) {
            zzex.mo43952k((zzfz) this.f35596b.get(i));
        }
    }

    /* renamed from: q */
    private static final void m49952q(@Nullable zzex zzex, zzfz zzfz) {
        if (zzex != null) {
            zzex.mo43952k(zzfz);
        }
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        zzex zzex = this.f35605k;
        if (zzex == null) {
            return null;
        }
        return zzex.mo43924a();
    }

    /* renamed from: b */
    public final Map mo43925b() {
        zzex zzex = this.f35605k;
        return zzex == null ? Collections.emptyMap() : zzex.mo43925b();
    }

    /* renamed from: d */
    public final void mo43926d() throws IOException {
        zzex zzex = this.f35605k;
        if (zzex != null) {
            try {
                zzex.mo43926d();
            } finally {
                this.f35605k = null;
            }
        }
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws IOException {
        zzex zzex = this.f35605k;
        Objects.requireNonNull(zzex);
        return zzex.mo43927e(bArr, i, i2);
    }

    /* renamed from: g */
    public final long mo43928g(zzfc zzfc) throws IOException {
        zzex zzex;
        zzdd.m47212f(this.f35605k == null);
        String scheme = zzfc.f35396a.getScheme();
        if (zzen.m49184w(zzfc.f35396a)) {
            String path = zzfc.f35396a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f35598d == null) {
                    zzfn zzfn = new zzfn();
                    this.f35598d = zzfn;
                    m49951p(zzfn);
                }
                this.f35605k = this.f35598d;
            } else {
                this.f35605k = m49950o();
            }
        } else if ("asset".equals(scheme)) {
            this.f35605k = m49950o();
        } else if ("content".equals(scheme)) {
            if (this.f35600f == null) {
                zzeu zzeu = new zzeu(this.f35595a);
                this.f35600f = zzeu;
                m49951p(zzeu);
            }
            this.f35605k = this.f35600f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f35601g == null) {
                try {
                    zzex zzex2 = (zzex) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f35601g = zzex2;
                    m49951p(zzex2);
                } catch (ClassNotFoundException unused) {
                    zzdw.m48255e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.f35601g == null) {
                    this.f35601g = this.f35597c;
                }
            }
            this.f35605k = this.f35601g;
        } else if ("udp".equals(scheme)) {
            if (this.f35602h == null) {
                zzgb zzgb = new zzgb(2000);
                this.f35602h = zzgb;
                m49951p(zzgb);
            }
            this.f35605k = this.f35602h;
        } else if (Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA.equals(scheme)) {
            if (this.f35603i == null) {
                zzev zzev = new zzev();
                this.f35603i = zzev;
                m49951p(zzev);
            }
            this.f35605k = this.f35603i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f35604j == null) {
                    zzfx zzfx = new zzfx(this.f35595a);
                    this.f35604j = zzfx;
                    m49951p(zzfx);
                }
                zzex = this.f35604j;
            } else {
                zzex = this.f35597c;
            }
            this.f35605k = zzex;
        }
        return this.f35605k.mo43928g(zzfc);
    }

    /* renamed from: k */
    public final void mo43952k(zzfz zzfz) {
        Objects.requireNonNull(zzfz);
        this.f35597c.mo43952k(zzfz);
        this.f35596b.add(zzfz);
        m49952q(this.f35598d, zzfz);
        m49952q(this.f35599e, zzfz);
        m49952q(this.f35600f, zzfz);
        m49952q(this.f35601g, zzfz);
        m49952q(this.f35602h, zzfz);
        m49952q(this.f35603i, zzfz);
        m49952q(this.f35604j, zzfz);
    }
}
