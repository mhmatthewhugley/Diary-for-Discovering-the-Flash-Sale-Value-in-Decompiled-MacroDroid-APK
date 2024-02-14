package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzjy extends zzgj {

    /* renamed from: e */
    private final int f37721e;

    /* renamed from: f */
    private final int f37722f;

    /* renamed from: g */
    private final int[] f37723g;

    /* renamed from: h */
    private final int[] f37724h;

    /* renamed from: i */
    private final zzcn[] f37725i;

    /* renamed from: j */
    private final Object[] f37726j;

    /* renamed from: k */
    private final HashMap f37727k = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjy(Collection collection, zzuc zzuc, byte[] bArr) {
        super(false, zzuc, (byte[]) null);
        int i = 0;
        int size = collection.size();
        this.f37723g = new int[size];
        this.f37724h = new int[size];
        this.f37725i = new zzcn[size];
        this.f37726j = new Object[size];
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzjn zzjn = (zzjn) it.next();
            this.f37725i[i3] = zzjn.zza();
            this.f37724h[i3] = i;
            this.f37723g[i3] = i2;
            i += this.f37725i[i3].mo43601c();
            i2 += this.f37725i[i3].mo43600b();
            this.f37726j[i3] = zzjn.zzb();
            this.f37727k.put(this.f37726j[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f37721e = i;
        this.f37722f = i2;
    }

    /* renamed from: b */
    public final int mo43600b() {
        return this.f37722f;
    }

    /* renamed from: c */
    public final int mo43601c() {
        return this.f37721e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo46869p(Object obj) {
        Integer num = (Integer) this.f37727k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo46870q(int i) {
        return zzen.m49138M(this.f37723g, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo46871r(int i) {
        return zzen.m49138M(this.f37724h, i + 1, false, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo46872s(int i) {
        return this.f37723g[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final int mo46873t(int i) {
        return this.f37724h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final zzcn mo46874u(int i) {
        return this.f37725i[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Object mo46875v(int i) {
        return this.f37726j[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final List mo47766y() {
        return Arrays.asList(this.f37725i);
    }
}
