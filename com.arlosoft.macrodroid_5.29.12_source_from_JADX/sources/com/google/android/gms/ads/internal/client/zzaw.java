package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzaw {

    /* renamed from: f */
    private static final zzaw f1853f = new zzaw();

    /* renamed from: a */
    private final zzcgi f1854a;

    /* renamed from: b */
    private final zzau f1855b;

    /* renamed from: c */
    private final String f1856c;

    /* renamed from: d */
    private final zzcgv f1857d;

    /* renamed from: e */
    private final Random f1858e;

    protected zzaw() {
        zzcgi zzcgi = new zzcgi();
        zzau zzau = new zzau(new zzk(), new zzi(), new zzek(), new zzbod(), new zzccx(), new zzbyz(), new zzboe());
        String d = zzcgi.m45175d();
        zzcgv zzcgv = new zzcgv(0, 223104000, true, false, false);
        Random random = new Random();
        this.f1854a = zzcgi;
        this.f1855b = zzau;
        this.f1856c = d;
        this.f1857d = zzcgv;
        this.f1858e = random;
    }

    /* renamed from: a */
    public static zzau m1916a() {
        return f1853f.f1855b;
    }

    /* renamed from: b */
    public static zzcgi m1917b() {
        return f1853f.f1854a;
    }

    /* renamed from: c */
    public static zzcgv m1918c() {
        return f1853f.f1857d;
    }

    /* renamed from: d */
    public static String m1919d() {
        return f1853f.f1856c;
    }

    /* renamed from: e */
    public static Random m1920e() {
        return f1853f.f1858e;
    }
}
