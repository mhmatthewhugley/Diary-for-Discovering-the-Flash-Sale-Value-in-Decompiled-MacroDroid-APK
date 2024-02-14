package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import javax.mail.UIDFolder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzatw {

    /* renamed from: a */
    protected AudioTrack f25566a;

    /* renamed from: b */
    private boolean f25567b;

    /* renamed from: c */
    private int f25568c;

    /* renamed from: d */
    private long f25569d;

    /* renamed from: e */
    private long f25570e;

    /* renamed from: f */
    private long f25571f;

    /* renamed from: g */
    private long f25572g;

    /* renamed from: h */
    private long f25573h;

    /* renamed from: i */
    private long f25574i;

    private zzatw() {
    }

    /* synthetic */ zzatw(zzatv zzatv) {
    }

    /* renamed from: a */
    public final long mo42020a() {
        if (this.f25572g != -9223372036854775807L) {
            return Math.min(this.f25574i, this.f25573h + ((((SystemClock.elapsedRealtime() * 1000) - this.f25572g) * ((long) this.f25568c)) / 1000000));
        }
        int playState = this.f25566a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) this.f25566a.getPlaybackHeadPosition()) & UIDFolder.MAXUID;
        if (this.f25567b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f25571f = this.f25569d;
            }
            playbackHeadPosition += this.f25571f;
        }
        if (this.f25569d > playbackHeadPosition) {
            this.f25570e++;
        }
        this.f25569d = playbackHeadPosition;
        return playbackHeadPosition + (this.f25570e << 32);
    }

    /* renamed from: b */
    public final long mo42021b() {
        return (mo42020a() * 1000000) / ((long) this.f25568c);
    }

    /* renamed from: c */
    public long mo42022c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public long mo42023d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo42024e(long j) {
        this.f25573h = mo42020a();
        this.f25572g = SystemClock.elapsedRealtime() * 1000;
        this.f25574i = j;
        this.f25566a.stop();
    }

    /* renamed from: f */
    public final void mo42025f() {
        if (this.f25572g == -9223372036854775807L) {
            this.f25566a.pause();
        }
    }

    /* renamed from: g */
    public void mo42026g(AudioTrack audioTrack, boolean z) {
        this.f25566a = audioTrack;
        this.f25567b = z;
        this.f25572g = -9223372036854775807L;
        this.f25569d = 0;
        this.f25570e = 0;
        this.f25571f = 0;
        if (audioTrack != null) {
            this.f25568c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: h */
    public boolean mo42027h() {
        return false;
    }
}
