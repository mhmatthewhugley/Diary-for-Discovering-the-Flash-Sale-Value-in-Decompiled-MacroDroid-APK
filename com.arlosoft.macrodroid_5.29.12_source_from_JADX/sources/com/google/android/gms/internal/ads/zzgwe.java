package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgwe extends zzgre implements zzgsp {
    /* access modifiers changed from: private */
    public static final zzgwe zzb;
    private zzgwd zzA;
    private zzgrn zzB = zzgre.m52995v();
    private zzgvf zzC;
    private String zzD = "";
    private zzgux zzE;
    private byte zzF = 2;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzgvb zzk;
    private zzgrn zzl = zzgre.m52995v();
    private zzgrn zzm = zzgre.m52995v();
    private String zzn = "";
    private zzgvs zzo;
    private boolean zzp;
    private zzgrn zzq = zzgre.m52995v();
    private String zzr = "";
    private boolean zzs;
    private boolean zzt;
    private zzgpw zzu = zzgpw.f37012a;
    private zzgwa zzv;
    private boolean zzw;
    private String zzx = "";
    private zzgrn zzy = zzgre.m52995v();
    private zzgrn zzz = zzgre.m52995v();

    static {
        zzgwe zzgwe = new zzgwe();
        zzb = zzgwe;
        zzgre.m52983A(zzgwe.class, zzgwe);
    }

    private zzgwe() {
    }

    /* renamed from: F */
    public static zzguz m53588F() {
        return (zzguz) zzb.mo47345C();
    }

    /* renamed from: K */
    static /* synthetic */ void m53590K(zzgwe zzgwe, String str) {
        str.getClass();
        zzgwe.zze |= 4;
        zzgwe.zzh = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m53591L(zzgwe zzgwe, String str) {
        str.getClass();
        zzgwe.zze |= 8;
        zzgwe.zzi = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m53592M(zzgwe zzgwe, zzgvb zzgvb) {
        zzgvb.getClass();
        zzgwe.zzk = zzgvb;
        zzgwe.zze |= 32;
    }

    /* renamed from: N */
    static /* synthetic */ void m53593N(zzgwe zzgwe, zzgvy zzgvy) {
        zzgvy.getClass();
        zzgrn zzgrn = zzgwe.zzl;
        if (!zzgrn.mo47052a()) {
            zzgwe.zzl = zzgre.m52996w(zzgrn);
        }
        zzgwe.zzl.add(zzgvy);
    }

    /* renamed from: O */
    static /* synthetic */ void m53594O(zzgwe zzgwe, String str) {
        zzgwe.zze |= 64;
        zzgwe.zzn = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m53595P(zzgwe zzgwe) {
        zzgwe.zze &= -65;
        zzgwe.zzn = zzb.zzn;
    }

    /* renamed from: Q */
    static /* synthetic */ void m53596Q(zzgwe zzgwe, zzgvs zzgvs) {
        zzgvs.getClass();
        zzgwe.zzo = zzgvs;
        zzgwe.zze |= 128;
    }

    /* renamed from: R */
    static /* synthetic */ void m53597R(zzgwe zzgwe, zzgwa zzgwa) {
        zzgwa.getClass();
        zzgwe.zzv = zzgwa;
        zzgwe.zze |= 8192;
    }

    /* renamed from: S */
    static /* synthetic */ void m53598S(zzgwe zzgwe, Iterable iterable) {
        zzgrn zzgrn = zzgwe.zzy;
        if (!zzgrn.mo47052a()) {
            zzgwe.zzy = zzgre.m52996w(zzgrn);
        }
        zzgpf.m52507c(iterable, zzgwe.zzy);
    }

    /* renamed from: T */
    static /* synthetic */ void m53599T(zzgwe zzgwe, Iterable iterable) {
        zzgrn zzgrn = zzgwe.zzz;
        if (!zzgrn.mo47052a()) {
            zzgwe.zzz = zzgre.m52996w(zzgrn);
        }
        zzgpf.m52507c(iterable, zzgwe.zzz);
    }

    /* renamed from: U */
    static /* synthetic */ void m53600U(zzgwe zzgwe, int i) {
        zzgwe.zzf = i - 1;
        zzgwe.zze |= 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final Object mo41649D(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzF);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzgre.m52998y(zzb, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgvy.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", zzgvt.f37355a, "zzg", zzguy.f37339a, "zzk", "zzn", "zzo", "zzu", "zzm", zzgwi.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzgwo.class, "zzC", "zzD", "zzE"});
        } else if (i2 == 3) {
            return new zzgwe();
        } else {
            if (i2 == 4) {
                return new zzguz((zzguq) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzF = b;
            return null;
        }
    }

    /* renamed from: H */
    public final String mo47572H() {
        return this.zzn;
    }

    /* renamed from: I */
    public final String mo47573I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final List mo47574J() {
        return this.zzl;
    }
}
