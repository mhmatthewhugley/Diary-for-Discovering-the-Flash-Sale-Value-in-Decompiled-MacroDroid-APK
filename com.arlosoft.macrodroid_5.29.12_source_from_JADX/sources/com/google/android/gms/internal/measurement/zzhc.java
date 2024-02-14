package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhc extends zzhz {

    /* renamed from: a */
    private final Context f41471a;

    /* renamed from: b */
    private final zzii f41472b;

    zzhc(Context context, zzii zzii) {
        Objects.requireNonNull(context, "Null context");
        this.f41471a = context;
        this.f41472b = zzii;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo51258a() {
        return this.f41471a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzii mo51259b() {
        return this.f41472b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f41472b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.zzhz
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.zzhz r5 = (com.google.android.gms.internal.measurement.zzhz) r5
            android.content.Context r1 = r4.f41471a
            android.content.Context r3 = r5.mo51258a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.measurement.zzii r1 = r4.f41472b
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.internal.measurement.zzii r5 = r5.mo51259b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.android.gms.internal.measurement.zzii r5 = r5.mo51259b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f41471a.hashCode() ^ 1000003) * 1000003;
        zzii zzii = this.f41472b;
        if (zzii == null) {
            i = 0;
        } else {
            i = zzii.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f41471a.toString();
        String valueOf = String.valueOf(this.f41472b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
