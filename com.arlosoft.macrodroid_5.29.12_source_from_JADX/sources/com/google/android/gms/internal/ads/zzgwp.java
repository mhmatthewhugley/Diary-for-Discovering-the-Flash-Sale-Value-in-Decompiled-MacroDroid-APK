package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgwp implements zzalq {

    /* renamed from: A */
    private static final zzgxa f37369A = zzgxa.m53636b(zzgwp.class);

    /* renamed from: a */
    protected final String f37370a;

    /* renamed from: c */
    private zzalr f37371c;

    /* renamed from: d */
    boolean f37372d;

    /* renamed from: f */
    boolean f37373f;

    /* renamed from: g */
    private ByteBuffer f37374g;

    /* renamed from: o */
    long f37375o;

    /* renamed from: p */
    long f37376p = -1;

    /* renamed from: s */
    zzgwu f37377s;

    /* renamed from: z */
    private ByteBuffer f37378z = null;

    protected zzgwp(String str) {
        this.f37370a = str;
        this.f37373f = true;
        this.f37372d = true;
    }

    /* renamed from: a */
    private final synchronized void m53615a() {
        String str;
        if (!this.f37373f) {
            try {
                zzgxa zzgxa = f37369A;
                String str2 = this.f37370a;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzgxa.mo47584a(str);
                this.f37374g = this.f37377s.mo43873b1(this.f37375o, this.f37376p);
                this.f37373f = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    public final void mo41635b(zzgwu zzgwu, ByteBuffer byteBuffer, long j, zzaln zzaln) throws IOException {
        this.f37375o = zzgwu.zzb();
        byteBuffer.remaining();
        this.f37376p = j;
        this.f37377s = zzgwu;
        zzgwu.mo43876n(zzgwu.zzb() + j);
        this.f37373f = false;
        this.f37372d = false;
        mo47575e();
    }

    /* renamed from: c */
    public final void mo41636c(zzalr zzalr) {
        this.f37371c = zzalr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo41638d(ByteBuffer byteBuffer);

    /* renamed from: e */
    public final synchronized void mo47575e() {
        String str;
        m53615a();
        zzgxa zzgxa = f37369A;
        String str2 = this.f37370a;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzgxa.mo47584a(str);
        ByteBuffer byteBuffer = this.f37374g;
        if (byteBuffer != null) {
            this.f37372d = true;
            byteBuffer.rewind();
            mo41638d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f37378z = byteBuffer.slice();
            }
            this.f37374g = null;
        }
    }

    public final String zza() {
        return this.f37370a;
    }
}
