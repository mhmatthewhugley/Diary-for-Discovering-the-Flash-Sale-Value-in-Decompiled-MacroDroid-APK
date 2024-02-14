package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzw extends zzbv implements zzdd {
    /* access modifiers changed from: private */
    public static final zzw zzb;
    private int zze;
    private String zzf = "";
    private zzv zzg;
    private byte zzh = 2;

    static {
        zzw zzw = new zzw();
        zzb = zzw;
        zzbv.m64198o(zzw.class, zzw);
    }

    private zzw() {
    }

    /* renamed from: q */
    public static zzo m64609q() {
        return (zzo) zzb.mo53946g();
    }

    /* renamed from: s */
    static /* synthetic */ void m64611s(zzw zzw, String str) {
        str.getClass();
        zzw.zze |= 1;
        zzw.zzf = str;
    }

    /* renamed from: t */
    static /* synthetic */ void m64612t(zzw zzw, zzv zzv) {
        zzv.getClass();
        zzw.zzg = zzv;
        zzw.zze |= 2;
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
            return zzbv.m64197n(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzw();
        } else {
            if (i2 == 4) {
                return new zzo((zzm) null);
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
}
