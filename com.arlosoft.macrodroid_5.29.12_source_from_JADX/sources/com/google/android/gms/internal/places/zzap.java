package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzap {

    /* renamed from: b */
    private static final Class<?> f45177b = m63252a();

    /* renamed from: c */
    private static volatile zzap f45178c;

    /* renamed from: d */
    static final zzap f45179d = new zzap(true);

    /* renamed from: a */
    private final Map<zzb, zzbc.zzf<?, ?>> f45180a;

    static final class zzb {

        /* renamed from: a */
        private final Object f45181a;

        /* renamed from: b */
        private final int f45182b;

        zzb(Object obj, int i) {
            this.f45181a = obj;
            this.f45182b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            if (this.f45181a == zzb.f45181a && this.f45182b == zzb.f45182b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f45181a) * 65535) + this.f45182b;
        }
    }

    zzap() {
        this.f45180a = new HashMap();
    }

    /* renamed from: a */
    private static Class<?> m63252a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static zzap m63253b() {
        zzap zzap = f45178c;
        if (zzap == null) {
            synchronized (zzap.class) {
                zzap = f45178c;
                if (zzap == null) {
                    zzap = zzaq.m63256b();
                    f45178c = zzap;
                }
            }
        }
        return zzap;
    }

    /* renamed from: c */
    public final <ContainingType extends zzck> zzbc.zzf<ContainingType, ?> mo53408c(ContainingType containingtype, int i) {
        return this.f45180a.get(new zzb(containingtype, i));
    }

    private zzap(boolean z) {
        this.f45180a = Collections.emptyMap();
    }
}
