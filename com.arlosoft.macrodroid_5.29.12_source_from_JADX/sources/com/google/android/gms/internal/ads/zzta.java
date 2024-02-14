package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzta extends zzrr {

    /* renamed from: t */
    private static final zzbg f38468t;

    /* renamed from: k */
    private final zzsk[] f38469k;

    /* renamed from: l */
    private final zzcn[] f38470l;

    /* renamed from: m */
    private final ArrayList f38471m;

    /* renamed from: n */
    private final Map f38472n;

    /* renamed from: o */
    private final zzfwj f38473o;

    /* renamed from: p */
    private int f38474p = -1;

    /* renamed from: q */
    private long[][] f38475q;
    @Nullable

    /* renamed from: r */
    private zzsz f38476r;

    /* renamed from: s */
    private final zzrt f38477s;

    static {
        zzaj zzaj = new zzaj();
        zzaj.mo41523a("MergingMediaSource");
        f38468t = zzaj.mo41525c();
    }

    public zzta(boolean z, boolean z2, zzsk... zzskArr) {
        zzrt zzrt = new zzrt();
        this.f38469k = zzskArr;
        this.f38477s = zzrt;
        this.f38471m = new ArrayList(Arrays.asList(zzskArr));
        this.f38470l = new zzcn[zzskArr.length];
        this.f38475q = new long[0][];
        this.f38472n = new HashMap();
        this.f38473o = zzfwq.m51199a(8).mo46507b(2).mo46506c();
    }

    /* renamed from: I */
    public final zzbg mo48158I() {
        zzsk[] zzskArr = this.f38469k;
        return zzskArr.length > 0 ? zzskArr[0].mo48158I() : f38468t;
    }

    /* renamed from: K */
    public final void mo48143K() throws IOException {
        zzsz zzsz = this.f38476r;
        if (zzsz == null) {
            super.mo48143K();
            return;
        }
        throw zzsz;
    }

    /* renamed from: c */
    public final void mo48159c(zzsg zzsg) {
        zzsy zzsy = (zzsy) zzsg;
        int i = 0;
        while (true) {
            zzsk[] zzskArr = this.f38469k;
            if (i < zzskArr.length) {
                zzskArr[i].mo48159c(zzsy.mo48188h(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final zzsg mo48160g(zzsi zzsi, zzwi zzwi, long j) {
        int length = this.f38469k.length;
        zzsg[] zzsgArr = new zzsg[length];
        int a = this.f38470l[0].mo43599a(zzsi.f27569a);
        for (int i = 0; i < length; i++) {
            zzsgArr[i] = this.f38469k[i].mo48160g(zzsi.mo48161c(this.f38470l[i].mo43604f(a)), zzwi, j - this.f38475q[a][i]);
        }
        return new zzsy(this.f38477s, this.f38475q[a], zzsgArr, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo48112s(@Nullable zzfz zzfz) {
        super.mo48112s(zzfz);
        for (int i = 0; i < this.f38469k.length; i++) {
            mo48146z(Integer.valueOf(i), this.f38469k[i]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo48115v() {
        super.mo48115v();
        Arrays.fill(this.f38470l, (Object) null);
        this.f38474p = -1;
        this.f38476r = null;
        this.f38471m.clear();
        Collections.addAll(this.f38471m, this.f38469k);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ zzsi mo48144x(Object obj, zzsi zzsi) {
        if (((Integer) obj).intValue() == 0) {
            return zzsi;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final /* bridge */ /* synthetic */ void mo48145y(Object obj, zzsk zzsk, zzcn zzcn) {
        int i;
        if (this.f38476r == null) {
            if (this.f38474p == -1) {
                i = zzcn.mo43600b();
                this.f38474p = i;
            } else {
                int b = zzcn.mo43600b();
                int i2 = this.f38474p;
                if (b == i2) {
                    i = i2;
                } else {
                    this.f38476r = new zzsz(0);
                    return;
                }
            }
            if (this.f38475q.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.f38470l.length;
                iArr[0] = i;
                this.f38475q = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.f38471m.remove(zzsk);
            this.f38470l[((Integer) obj).intValue()] = zzcn;
            if (this.f38471m.isEmpty()) {
                mo48113t(this.f38470l[0]);
            }
        }
    }
}
