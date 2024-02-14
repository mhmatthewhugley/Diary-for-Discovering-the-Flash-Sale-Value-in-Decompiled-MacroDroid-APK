package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zznz {

    /* renamed from: a */
    private final AudioTrack f37977a;

    /* renamed from: b */
    private final AudioTimestamp f37978b = new AudioTimestamp();

    /* renamed from: c */
    private long f37979c;

    /* renamed from: d */
    private long f37980d;

    /* renamed from: e */
    private long f37981e;

    public zznz(AudioTrack audioTrack) {
        this.f37977a = audioTrack;
    }

    /* renamed from: a */
    public final long mo47935a() {
        return this.f37981e;
    }

    /* renamed from: b */
    public final long mo47936b() {
        return this.f37978b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final boolean mo47937c() {
        boolean timestamp = this.f37977a.getTimestamp(this.f37978b);
        if (timestamp) {
            long j = this.f37978b.framePosition;
            if (this.f37980d > j) {
                this.f37979c++;
            }
            this.f37980d = j;
            this.f37981e = j + (this.f37979c << 32);
        }
        return timestamp;
    }
}
