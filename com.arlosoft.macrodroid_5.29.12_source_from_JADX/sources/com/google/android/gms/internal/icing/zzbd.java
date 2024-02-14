package com.google.android.gms.internal.icing;

import android.content.Context;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzbd extends zzbh {

    /* renamed from: a */
    private final Context f40771a;

    /* renamed from: b */
    private final zzbm f40772b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo50173a() {
        return this.f40771a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzbm mo50174b() {
        return this.f40772b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbh) {
            zzbh zzbh = (zzbh) obj;
            return this.f40771a.equals(zzbh.mo50173a()) && this.f40772b.equals(zzbh.mo50174b());
        }
    }

    public final int hashCode() {
        return ((this.f40771a.hashCode() ^ 1000003) * 1000003) ^ this.f40772b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f40771a);
        String valueOf2 = String.valueOf(this.f40772b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
