package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgra;
import com.google.android.gms.internal.ads.zzgre;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzgra<MessageType extends zzgre<MessageType, BuilderType>, BuilderType extends zzgra<MessageType, BuilderType>> extends zzgpe<MessageType, BuilderType> {

    /* renamed from: a */
    private final zzgre f37153a;

    /* renamed from: c */
    protected zzgre f37154c;

    /* renamed from: d */
    protected boolean f37155d = false;

    protected zzgra(MessageType messagetype) {
        this.f37153a = messagetype;
        this.f37154c = (zzgre) messagetype.mo41649D(4, (Object) null, (Object) null);
    }

    /* renamed from: d */
    private static final void m52971d(zzgre zzgre, zzgre zzgre2) {
        zzgsw.m53178a().mo47422b(zzgre.getClass()).mo47417f(zzgre, zzgre2);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo47337b() {
        return this.f37153a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ zzgpe mo47044c(zzgpf zzgpf) {
        mo47339f((zzgre) zzgpf);
        return this;
    }

    /* renamed from: e */
    public final zzgra clone() {
        zzgra zzgra = (zzgra) this.f37153a.mo41649D(5, (Object) null, (Object) null);
        zzgra.mo47339f(mo47336D1());
        return zzgra;
    }

    /* renamed from: f */
    public final zzgra mo47339f(zzgre zzgre) {
        if (this.f37155d) {
            mo47343l();
            this.f37155d = false;
        }
        m52971d(this.f37154c, zzgre);
        return this;
    }

    /* renamed from: g */
    public final zzgra mo47340g(byte[] bArr, int i, int i2, zzgqq zzgqq) throws zzgrq {
        if (this.f37155d) {
            mo47343l();
            this.f37155d = false;
        }
        try {
            zzgsw.m53178a().mo47422b(this.f37154c.getClass()).mo47421j(this.f37154c, bArr, 0, i2, new zzgpi(zzgqq));
            return this;
        } catch (zzgrq e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzgrq.m53040j();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: h */
    public final MessageType mo47341h() {
        MessageType k = mo47336D1();
        if (k.mo47344B()) {
            return k;
        }
        throw new zzgtx(k);
    }

    /* renamed from: k */
    public MessageType mo47336D1() {
        if (this.f37155d) {
            return this.f37154c;
        }
        zzgre zzgre = this.f37154c;
        zzgsw.m53178a().mo47422b(zzgre.getClass()).mo47415d(zzgre);
        this.f37155d = true;
        return this.f37154c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo47343l() {
        zzgre zzgre = (zzgre) this.f37154c.mo41649D(4, (Object) null, (Object) null);
        m52971d(zzgre, this.f37154c);
        this.f37154c = zzgre;
    }
}
