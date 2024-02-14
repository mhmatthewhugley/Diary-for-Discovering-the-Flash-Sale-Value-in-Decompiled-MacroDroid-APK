package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import java.util.List;

public final class zzl extends zzbc<zzl, zzb> implements zzcm {
    /* access modifiers changed from: private */
    public static final zzl zzdr;
    private static volatile zzct<zzl> zzds;
    private zzbh<String> zzdo = zzbc.m63317r();
    private zzbi zzdp = zzbc.m63316q();
    private zzbh<zzw> zzdq = zzbc.m63317r();

    public static final class zzb extends zzbc.zzb<zzl, zzb> implements zzcm {
        private zzb() {
            super(zzl.zzdr);
        }

        /* synthetic */ zzb(zzk zzk) {
            this();
        }
    }

    static {
        zzl zzl = new zzl();
        zzdr = zzl;
        zzbc.m63314o(zzl.class, zzl);
    }

    private zzl() {
    }

    /* renamed from: t */
    public static zzl m63823t(byte[] bArr) throws zzbk {
        return (zzl) zzbc.m63310j(zzdr, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Object mo53456l(int i, Object obj, Object obj2) {
        switch (zzk.f45459a[i - 1]) {
            case 1:
                return new zzl();
            case 2:
                return new zzb((zzk) null);
            case 3:
                return zzbc.m63312m(zzdr, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u0016\u0003\u001c", new Object[]{"zzdo", "zzdp", "zzdq"});
            case 4:
                return zzdr;
            case 5:
                zzct<zzl> zzct = zzds;
                if (zzct == null) {
                    synchronized (zzl.class) {
                        zzct = zzds;
                        if (zzct == null) {
                            zzct = new zzbc.zzd<>(zzdr);
                            zzds = zzct;
                        }
                    }
                }
                return zzct;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u */
    public final List<Integer> mo53662u() {
        return this.zzdp;
    }

    /* renamed from: v */
    public final int mo53663v() {
        return this.zzdp.size();
    }
}
