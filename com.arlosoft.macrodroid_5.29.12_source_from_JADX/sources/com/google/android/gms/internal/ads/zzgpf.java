package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgpe;
import com.google.android.gms.internal.ads.zzgpf;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgpf<MessageType extends zzgpf<MessageType, BuilderType>, BuilderType extends zzgpe<MessageType, BuilderType>> implements zzgso {
    protected int zza = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m52507c(java.lang.Iterable r3, java.util.List r4) {
        /*
            com.google.android.gms.internal.ads.zzgro.m53027e(r3)
            boolean r0 = r4 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0016
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.size()
            int r2 = r3.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L_0x0016:
            int r0 = r4.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L_0x0057
            int r3 = r4.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            int r3 = r3 - r0
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L_0x0049:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x0051
            r4.remove(r1)
            goto L_0x0049
        L_0x0051:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L_0x0057:
            r4.add(r1)
            goto L_0x001e
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpf.m52507c(java.lang.Iterable, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo47047a() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo47048d(int i) {
        throw null;
    }

    /* renamed from: e */
    public final void mo47049e(OutputStream outputStream) throws IOException {
        zzgql i = zzgql.m52836i(outputStream, zzgql.m52830c(mo47353z()));
        mo47349q(i);
        i.mo47212m();
    }

    /* renamed from: p */
    public final byte[] mo47050p() {
        try {
            byte[] bArr = new byte[mo47353z()];
            zzgql h = zzgql.m52835h(bArr);
            mo47349q(h);
            h.mo47227j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: t */
    public final zzgpw mo47051t() {
        try {
            int z = mo47353z();
            zzgpw zzgpw = zzgpw.f37012a;
            byte[] bArr = new byte[z];
            zzgql h = zzgql.m52835h(bArr);
            mo47349q(h);
            h.mo47227j();
            return new zzgps(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
