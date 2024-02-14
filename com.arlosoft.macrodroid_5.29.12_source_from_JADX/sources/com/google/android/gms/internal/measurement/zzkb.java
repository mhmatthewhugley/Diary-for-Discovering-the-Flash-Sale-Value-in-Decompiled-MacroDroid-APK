package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.internal.measurement.zzkf;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class zzkb<MessageType extends zzkf<MessageType, BuilderType>, BuilderType extends zzkb<MessageType, BuilderType>> extends zzin<MessageType, BuilderType> {

    /* renamed from: a */
    private final zzkf f41629a;

    /* renamed from: c */
    protected zzkf f41630c;

    protected zzkb(MessageType messagetype) {
        this.f41629a = messagetype;
        if (!messagetype.mo51457v()) {
            this.f41630c = messagetype.mo51452j();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: k */
    private static void m60488k(Object obj, Object obj2) {
        zzlu.m60679a().mo51518b(obj.getClass()).mo51514f(obj, obj2);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzin mo51301g(byte[] bArr, int i, int i2) throws zzkp {
        mo51440n(bArr, 0, i2, zzjr.f41560c);
        return this;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ zzin mo51302h(byte[] bArr, int i, int i2, zzjr zzjr) throws zzkp {
        mo51440n(bArr, 0, i2, zzjr);
        return this;
    }

    /* renamed from: l */
    public final zzkb mo51439l(zzkf zzkf) {
        if (!this.f41629a.equals(zzkf)) {
            if (!this.f41630c.mo51457v()) {
                mo51444r();
            }
            m60488k(this.f41630c, zzkf);
        }
        return this;
    }

    /* renamed from: n */
    public final zzkb mo51440n(byte[] bArr, int i, int i2, zzjr zzjr) throws zzkp {
        if (!this.f41630c.mo51457v()) {
            mo51444r();
        }
        try {
            zzlu.m60679a().mo51518b(this.f41630c.getClass()).mo51517i(this.f41630c, bArr, 0, i2, new zzir(zzjr));
            return this;
        } catch (zzkp e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkp.m60551f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo51441o() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzkf r0 = r5.mo51438F()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo50883A(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.gms.internal.measurement.zzlu r3 = com.google.android.gms.internal.measurement.zzlu.m60679a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.zzlx r3 = r3.mo51518b(r4)
            boolean r3 = r3.mo51513e(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo50883A(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.measurement.zzmn r1 = new com.google.android.gms.internal.measurement.zzmn
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkb.mo51441o():com.google.android.gms.internal.measurement.zzkf");
    }

    /* renamed from: p */
    public MessageType mo51438F() {
        if (!this.f41630c.mo51457v()) {
            return this.f41630c;
        }
        this.f41630c.mo51453r();
        return this.f41630c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo51443q() {
        if (!this.f41630c.mo51457v()) {
            mo51444r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo51444r() {
        zzkf j = this.f41629a.mo51452j();
        m60488k(j, this.f41630c);
        this.f41630c = j;
    }

    /* renamed from: s */
    public final zzkb mo51300f() {
        zzkb zzkb = (zzkb) this.f41629a.mo50883A(5, (Object) null, (Object) null);
        zzkb.f41630c = mo51438F();
        return zzkb;
    }
}
