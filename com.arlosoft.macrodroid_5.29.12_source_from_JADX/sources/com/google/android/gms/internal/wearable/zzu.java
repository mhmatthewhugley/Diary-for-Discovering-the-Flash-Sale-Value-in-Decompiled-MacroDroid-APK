package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzu extends zzbv implements zzdd {
    /* access modifiers changed from: private */
    public static final zzu zzb;
    private int zze;
    private zzaw zzf = zzaw.f45541a;
    private String zzg = "";
    private double zzh;
    private float zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private zzcc zzn = zzbv.m64194k();
    private zzcc zzo = zzbv.m64194k();
    private zzcc zzp = zzbv.m64194k();
    private zzcb zzq = zzbv.m64193j();
    private zzca zzr = zzbv.m64192i();
    private long zzs;
    private byte zzt = 2;

    static {
        zzu zzu = new zzu();
        zzb = zzu;
        zzbv.m64198o(zzu.class, zzu);
    }

    private zzu() {
    }

    /* renamed from: A */
    static /* synthetic */ void m64586A(zzu zzu, int i) {
        zzu.zze |= 32;
        zzu.zzk = i;
    }

    /* renamed from: B */
    static /* synthetic */ void m64587B(zzu zzu, int i) {
        zzu.zze |= 64;
        zzu.zzl = i;
    }

    /* renamed from: C */
    static /* synthetic */ void m64588C(zzu zzu, boolean z) {
        zzu.zze |= 128;
        zzu.zzm = z;
    }

    /* renamed from: E */
    static /* synthetic */ void m64589E(zzu zzu, Iterable iterable) {
        zzcc zzcc = zzu.zzn;
        if (!zzcc.mo53802a()) {
            zzu.zzn = zzbv.m64195l(zzcc);
        }
        zzag.m64027c(iterable, zzu.zzn);
    }

    /* renamed from: F */
    static /* synthetic */ void m64590F(zzu zzu, zzv zzv) {
        zzv.getClass();
        zzcc zzcc = zzu.zzo;
        if (!zzcc.mo53802a()) {
            zzu.zzo = zzbv.m64195l(zzcc);
        }
        zzu.zzo.add(zzv);
    }

    /* renamed from: H */
    static /* synthetic */ void m64591H(zzu zzu, String str) {
        zzu.zze |= 2;
        zzu.zzg = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m64592I(zzu zzu, Iterable iterable) {
        zzcc zzcc = zzu.zzp;
        if (!zzcc.mo53802a()) {
            zzu.zzp = zzbv.m64195l(zzcc);
        }
        zzag.m64027c(iterable, zzu.zzp);
    }

    /* renamed from: q */
    static /* synthetic */ void m64593q(zzu zzu, Iterable iterable) {
        zzcb zzcb = zzu.zzq;
        if (!zzcb.mo53802a()) {
            int size = zzcb.size();
            zzu.zzq = zzcb.mo53957v(size == 0 ? 10 : size + size);
        }
        zzag.m64027c(iterable, zzu.zzq);
    }

    /* renamed from: r */
    static /* synthetic */ void m64594r(zzu zzu, Iterable iterable) {
        zzca zzca = zzu.zzr;
        if (!zzca.mo53802a()) {
            int size = zzca.size();
            zzu.zzr = zzca.mo53931y(size == 0 ? 10 : size + size);
        }
        zzag.m64027c(iterable, zzu.zzr);
    }

    /* renamed from: s */
    static /* synthetic */ void m64595s(zzu zzu, long j) {
        zzu.zze |= 256;
        zzu.zzs = j;
    }

    /* renamed from: t */
    static /* synthetic */ void m64596t(zzu zzu, double d) {
        zzu.zze |= 4;
        zzu.zzh = d;
    }

    /* renamed from: u */
    static /* synthetic */ void m64597u(zzu zzu, float f) {
        zzu.zze |= 8;
        zzu.zzi = f;
    }

    /* renamed from: v */
    public static zzt m64598v() {
        return (zzt) zzb.mo53946g();
    }

    /* renamed from: y */
    static /* synthetic */ void m64600y(zzu zzu, zzaw zzaw) {
        zzu.zze |= 1;
        zzu.zzf = zzaw;
    }

    /* renamed from: z */
    static /* synthetic */ void m64601z(zzu zzu, long j) {
        zzu.zze |= 16;
        zzu.zzj = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Object mo53945f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzt);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzbv.m64197n(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzw.class, "zzo", zzv.class, "zzp", "zzq", "zzs", "zzr"});
        } else if (i2 == 3) {
            return new zzu();
        } else {
            if (i2 == 4) {
                return new zzt((zzm) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzt = b;
            return null;
        }
    }
}
