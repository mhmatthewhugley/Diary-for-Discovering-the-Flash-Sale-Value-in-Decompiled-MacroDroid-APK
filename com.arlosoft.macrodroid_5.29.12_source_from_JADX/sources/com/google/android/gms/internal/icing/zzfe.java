package com.google.android.gms.internal.icing;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzfe {

    /* renamed from: e */
    private static final zzfe f40967e = new zzfe(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f40968a;

    /* renamed from: b */
    private int[] f40969b;

    /* renamed from: c */
    private Object[] f40970c;

    /* renamed from: d */
    private int f40971d;

    private zzfe() {
        this(0, new int[8], new Object[8], true);
    }

    private zzfe(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f40971d = -1;
        this.f40968a = 0;
        this.f40969b = iArr;
        this.f40970c = objArr;
    }

    /* renamed from: a */
    public static zzfe m59017a() {
        return f40967e;
    }

    /* renamed from: b */
    static zzfe m59018b(zzfe zzfe, zzfe zzfe2) {
        int i = zzfe.f40968a;
        int i2 = zzfe2.f40968a;
        int[] copyOf = Arrays.copyOf(zzfe.f40969b, 0);
        System.arraycopy(zzfe2.f40969b, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzfe.f40970c, 0);
        System.arraycopy(zzfe2.f40970c, 0, copyOf2, 0, 0);
        return new zzfe(0, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public final int mo50410c() {
        int i = this.f40971d;
        if (i != -1) {
            return i;
        }
        this.f40971d = 0;
        return 0;
    }

    /* renamed from: d */
    public final int mo50411d() {
        int i = this.f40971d;
        if (i != -1) {
            return i;
        }
        this.f40971d = 0;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo50412e(StringBuilder sb, int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzfe)) {
            return false;
        }
        zzfe zzfe = (zzfe) obj;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}
