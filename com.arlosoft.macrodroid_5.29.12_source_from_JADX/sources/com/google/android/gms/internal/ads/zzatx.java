package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzatx extends zzatw {

    /* renamed from: j */
    private final AudioTimestamp f25575j = new AudioTimestamp();

    /* renamed from: k */
    private long f25576k;

    /* renamed from: l */
    private long f25577l;

    /* renamed from: m */
    private long f25578m;

    public zzatx() {
        super((zzatv) null);
    }

    /* renamed from: c */
    public final long mo42022c() {
        return this.f25578m;
    }

    /* renamed from: d */
    public final long mo42023d() {
        return this.f25575j.nanoTime;
    }

    /* renamed from: g */
    public final void mo42026g(AudioTrack audioTrack, boolean z) {
        super.mo42026g(audioTrack, z);
        this.f25576k = 0;
        this.f25577l = 0;
        this.f25578m = 0;
    }

    /* renamed from: h */
    public final boolean mo42027h() {
        boolean timestamp = this.f25566a.getTimestamp(this.f25575j);
        if (timestamp) {
            long j = this.f25575j.framePosition;
            if (this.f25577l > j) {
                this.f25576k++;
            }
            this.f25577l = j;
            this.f25578m = j + (this.f25576k << 32);
        }
        return timestamp;
    }
}
