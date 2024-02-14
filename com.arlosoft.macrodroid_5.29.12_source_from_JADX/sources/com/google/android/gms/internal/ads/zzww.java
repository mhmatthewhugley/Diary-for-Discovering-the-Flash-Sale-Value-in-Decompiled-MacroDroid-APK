package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzww {

    /* renamed from: d */
    public static final zzwq f38817d = new zzwq(0, -9223372036854775807L, (zzwp) null);

    /* renamed from: e */
    public static final zzwq f38818e = new zzwq(1, -9223372036854775807L, (zzwp) null);

    /* renamed from: f */
    public static final zzwq f38819f = new zzwq(2, -9223372036854775807L, (zzwp) null);

    /* renamed from: g */
    public static final zzwq f38820g = new zzwq(3, -9223372036854775807L, (zzwp) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f38821a = zzen.m49178q("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public zzwr f38822b;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: c */
    public IOException f38823c;

    public zzww(String str) {
    }

    /* renamed from: b */
    public static zzwq m55290b(boolean z, long j) {
        return new zzwq(z ? 1 : 0, j, (zzwp) null);
    }

    /* renamed from: a */
    public final long mo48352a(zzws zzws, zzwo zzwo, int i) {
        Looper myLooper = Looper.myLooper();
        zzdd.m47208b(myLooper);
        this.f38823c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzwr(this, myLooper, zzws, zzwo, i, elapsedRealtime).mo48348c(0);
        return elapsedRealtime;
    }

    /* renamed from: g */
    public final void mo48353g() {
        zzwr zzwr = this.f38822b;
        zzdd.m47208b(zzwr);
        zzwr.mo48346a(false);
    }

    /* renamed from: h */
    public final void mo48354h() {
        this.f38823c = null;
    }

    /* renamed from: i */
    public final void mo48355i(int i) throws IOException {
        IOException iOException = this.f38823c;
        if (iOException == null) {
            zzwr zzwr = this.f38822b;
            if (zzwr != null) {
                zzwr.mo48347b(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: j */
    public final void mo48356j(@Nullable zzwt zzwt) {
        zzwr zzwr = this.f38822b;
        if (zzwr != null) {
            zzwr.mo48346a(true);
        }
        this.f38821a.execute(new zzwu(zzwt));
        this.f38821a.shutdown();
    }

    /* renamed from: k */
    public final boolean mo48357k() {
        return this.f38823c != null;
    }

    /* renamed from: l */
    public final boolean mo48358l() {
        return this.f38822b != null;
    }
}
