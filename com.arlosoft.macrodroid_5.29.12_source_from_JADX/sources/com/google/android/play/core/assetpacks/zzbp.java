package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbp extends zzem {

    /* renamed from: a */
    private final int f51304a;

    /* renamed from: b */
    private final String f51305b;

    /* renamed from: c */
    private final long f51306c;

    /* renamed from: d */
    private final long f51307d;

    /* renamed from: e */
    private final int f51308e;

    zzbp(int i, @Nullable String str, long j, long j2, int i2) {
        this.f51304a = i;
        this.f51305b = str;
        this.f51306c = j;
        this.f51307d = j2;
        this.f51308e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo59670a() {
        return this.f51304a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo59671b() {
        return this.f51308e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo59672c() {
        return this.f51306c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo59673d() {
        return this.f51307d;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: e */
    public final String mo59674e() {
        return this.f51305b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f51305b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.zzem
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.zzem r8 = (com.google.android.play.core.assetpacks.zzem) r8
            int r1 = r7.f51304a
            int r3 = r8.mo59670a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f51305b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo59674e()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo59674e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f51306c
            long r5 = r8.mo59672c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f51307d
            long r5 = r8.mo59673d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f51308e
            int r8 = r8.mo59671b()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzbp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f51304a ^ 1000003) * 1000003;
        String str = this.f51305b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f51306c;
        long j2 = this.f51307d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f51308e;
    }

    public final String toString() {
        int i = this.f51304a;
        String str = this.f51305b;
        long j = this.f51306c;
        long j2 = this.f51307d;
        int i2 = this.f51308e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
