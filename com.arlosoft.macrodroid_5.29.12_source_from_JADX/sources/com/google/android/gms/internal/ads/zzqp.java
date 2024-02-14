package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzqp extends Exception {
    public final String zza;
    public final boolean zzb;
    @Nullable
    public final zzqn zzc;
    @Nullable
    public final String zzd;
    @Nullable
    public final zzqp zze;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzqp(com.google.android.gms.internal.ads.zzaf r11, @androidx.annotation.Nullable java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r5 = r11.f24213l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r0.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqp.<init>(com.google.android.gms.internal.ads.zzaf, java.lang.Throwable, boolean, int):void");
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ zzqp m54648a(zzqp zzqp, zzqp zzqp2) {
        return new zzqp(zzqp.getMessage(), zzqp.getCause(), zzqp.zza, false, zzqp.zzc, zzqp.zzd, zzqp2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzqp(com.google.android.gms.internal.ads.zzaf r11, @androidx.annotation.Nullable java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzqn r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.f38257a
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.f24213l
            int r11 = com.google.android.gms.internal.ads.zzen.f34500a
            r13 = 0
            r0 = 21
            if (r11 < r0) goto L_0x0035
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L_0x0035
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            r8 = r11
            goto L_0x0036
        L_0x0035:
            r8 = r13
        L_0x0036:
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqp.<init>(com.google.android.gms.internal.ads.zzaf, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzqn):void");
    }

    private zzqp(String str, @Nullable Throwable th, String str2, boolean z, @Nullable zzqn zzqn, @Nullable String str3, @Nullable zzqp zzqp) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqn;
        this.zzd = str3;
        this.zze = zzqp;
    }
}
