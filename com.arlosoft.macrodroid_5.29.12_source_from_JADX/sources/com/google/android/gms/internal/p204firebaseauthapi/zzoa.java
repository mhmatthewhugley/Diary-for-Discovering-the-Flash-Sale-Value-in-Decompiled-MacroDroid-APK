package com.google.android.gms.internal.p204firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzoa extends zzadf implements zzael {
    /* access modifiers changed from: private */
    public static final zzoa zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzoa zzoa = new zzoa();
        zzb = zzoa;
        zzadf.m56429j(zzoa.class, zzoa);
    }

    private zzoa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo49084t(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzadf.m56428f(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzoa();
        } else {
            if (i2 == 4) {
                return new zznz((zzny) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
