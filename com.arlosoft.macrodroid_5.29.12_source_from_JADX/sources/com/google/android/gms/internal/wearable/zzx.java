package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzx extends zzbv implements zzdd {
    /* access modifiers changed from: private */
    public static final zzx zzb;
    private zzcc zze = zzbv.m64194k();
    private byte zzf = 2;

    static {
        zzx zzx = new zzx();
        zzb = zzx;
        zzbv.m64198o(zzx.class, zzx);
    }

    private zzx() {
    }

    /* renamed from: q */
    public static zzn m64614q() {
        return (zzn) zzb.mo53946g();
    }

    /* renamed from: s */
    static /* synthetic */ void m64616s(zzx zzx, Iterable iterable) {
        zzcc zzcc = zzx.zze;
        if (!zzcc.mo53802a()) {
            zzx.zze = zzbv.m64195l(zzcc);
        }
        zzag.m64027c(iterable, zzx.zze);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Object mo53945f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzbv.m64197n(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", zzw.class});
        } else if (i2 == 3) {
            return new zzx();
        } else {
            if (i2 == 4) {
                return new zzn((zzm) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzf = b;
            return null;
        }
    }
}
