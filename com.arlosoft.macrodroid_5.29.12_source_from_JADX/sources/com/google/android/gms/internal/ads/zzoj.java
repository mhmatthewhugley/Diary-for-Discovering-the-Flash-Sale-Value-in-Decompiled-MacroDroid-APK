package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzoj {

    /* renamed from: a */
    public final zzaf f38040a;

    /* renamed from: b */
    public final int f38041b;

    /* renamed from: c */
    public final int f38042c;

    /* renamed from: d */
    public final int f38043d;

    /* renamed from: e */
    public final int f38044e;

    /* renamed from: f */
    public final int f38045f;

    /* renamed from: g */
    public final int f38046g;

    /* renamed from: h */
    public final int f38047h;

    /* renamed from: i */
    public final zzng[] f38048i;

    public zzoj(zzaf zzaf, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzng[] zzngArr) {
        this.f38040a = zzaf;
        this.f38041b = i;
        this.f38042c = i2;
        this.f38043d = i3;
        this.f38044e = i4;
        this.f38045f = i5;
        this.f38046g = i6;
        this.f38047h = i7;
        this.f38048i = zzngArr;
    }

    /* renamed from: a */
    public final long mo47967a(long j) {
        return (j * 1000000) / ((long) this.f38044e);
    }

    /* renamed from: b */
    public final AudioTrack mo47968b(boolean z, zzk zzk, int i) throws zznu {
        AudioTrack audioTrack;
        try {
            int i2 = zzen.f34500a;
            if (i2 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzk.mo47767a().f37480a).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f38044e).setChannelMask(this.f38045f).setEncoding(this.f38046g).build()).setTransferMode(1).setBufferSizeInBytes(this.f38047h).setSessionId(i).setOffloadedPlayback(this.f38042c == 1).build();
            } else if (i2 >= 21) {
                audioTrack = new AudioTrack(zzk.mo47767a().f37480a, new AudioFormat.Builder().setSampleRate(this.f38044e).setChannelMask(this.f38045f).setEncoding(this.f38046g).build(), this.f38047h, 1, i);
            } else {
                int i3 = zzk.f37730a;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.f38044e, this.f38045f, this.f38046g, this.f38047h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f38044e, this.f38045f, this.f38046g, this.f38047h, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zznu(state, this.f38044e, this.f38045f, this.f38047h, this.f38040a, mo47969c(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zznu(0, this.f38044e, this.f38045f, this.f38047h, this.f38040a, mo47969c(), e);
        }
    }

    /* renamed from: c */
    public final boolean mo47969c() {
        return this.f38042c == 1;
    }
}
