package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzv extends zzbv implements zzdd {
    /* access modifiers changed from: private */
    public static final zzv zzb;
    private int zze;
    private int zzf = 1;
    private zzu zzg;
    private byte zzh = 2;

    static {
        zzv zzv = new zzv();
        zzb = zzv;
        zzbv.m64198o(zzv.class, zzv);
    }

    private zzv() {
    }

    /* renamed from: q */
    public static zzp m64603q() {
        return (zzp) zzb.mo53946g();
    }

    /* renamed from: s */
    static /* synthetic */ void m64605s(zzv zzv, zzu zzu) {
        zzu.getClass();
        zzv.zzg = zzu;
        zzv.zze |= 2;
    }

    /* renamed from: u */
    static /* synthetic */ void m64606u(zzv zzv, int i) {
        zzv.zzf = i;
        zzv.zze |= 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Object mo53945f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzbv.m64197n(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᐉ\u0001", new Object[]{"zze", "zzf", zzr.f45779a, "zzg"});
        } else if (i2 == 3) {
            return new zzv();
        } else {
            if (i2 == 4) {
                return new zzp((zzm) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }

    /* renamed from: t */
    public final int mo54115t() {
        int a = zzs.m64571a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
