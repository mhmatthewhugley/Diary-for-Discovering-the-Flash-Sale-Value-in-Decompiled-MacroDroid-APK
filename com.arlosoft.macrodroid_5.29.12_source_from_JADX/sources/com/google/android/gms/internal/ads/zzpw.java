package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzpw implements zzqk {

    /* renamed from: b */
    private final zzftn f38198b;

    /* renamed from: c */
    private final zzftn f38199c;

    public zzpw(int i, boolean z) {
        zzpu zzpu = new zzpu(i);
        zzpv zzpv = new zzpv(i);
        this.f38198b = zzpu;
        this.f38199c = zzpv;
    }

    /* renamed from: a */
    static /* synthetic */ HandlerThread m54560a(int i) {
        return new HandlerThread(zzpy.m54566e(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* renamed from: b */
    static /* synthetic */ HandlerThread m54561b(int i) {
        return new HandlerThread(zzpy.m54566e(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzpy mo48017c(com.google.android.gms.internal.ads.zzqj r11) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzqn r0 = r11.f38251a
            java.lang.String r0 = r0.f38257a
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r2.<init>()     // Catch:{ Exception -> 0x004d }
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch:{ Exception -> 0x004d }
            r2.append(r0)     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004d }
            int r3 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ Exception -> 0x004d }
            android.os.Trace.beginSection(r2)     // Catch:{ Exception -> 0x004d }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x004d }
            com.google.android.gms.internal.ads.zzpy r2 = new com.google.android.gms.internal.ads.zzpy     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.zzftn r3 = r10.f38198b     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.zzpu r3 = (com.google.android.gms.internal.ads.zzpu) r3     // Catch:{ Exception -> 0x004b }
            int r3 = r3.f38196a     // Catch:{ Exception -> 0x004b }
            android.os.HandlerThread r6 = m54560a(r3)     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.zzftn r3 = r10.f38199c     // Catch:{ Exception -> 0x004b }
            com.google.android.gms.internal.ads.zzpv r3 = (com.google.android.gms.internal.ads.zzpv) r3     // Catch:{ Exception -> 0x004b }
            int r3 = r3.f38197a     // Catch:{ Exception -> 0x004b }
            android.os.HandlerThread r7 = m54561b(r3)     // Catch:{ Exception -> 0x004b }
            r8 = 0
            r9 = 0
            r4 = r2
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004b }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0048 }
            android.media.MediaFormat r3 = r11.f38252b     // Catch:{ Exception -> 0x0048 }
            android.view.Surface r11 = r11.f38254d     // Catch:{ Exception -> 0x0048 }
            r4 = 0
            com.google.android.gms.internal.ads.zzpy.m54565d(r2, r3, r11, r1, r4)     // Catch:{ Exception -> 0x0048 }
            return r2
        L_0x0048:
            r11 = move-exception
            r1 = r2
            goto L_0x004f
        L_0x004b:
            r11 = move-exception
            goto L_0x004f
        L_0x004d:
            r11 = move-exception
            r0 = r1
        L_0x004f:
            if (r1 != 0) goto L_0x0057
            if (r0 == 0) goto L_0x005a
            r0.release()
            goto L_0x005a
        L_0x0057:
            r1.mo48023j()
        L_0x005a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpw.mo48017c(com.google.android.gms.internal.ads.zzqj):com.google.android.gms.internal.ads.zzpy");
    }
}
