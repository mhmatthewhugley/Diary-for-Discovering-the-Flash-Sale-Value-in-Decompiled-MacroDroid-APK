package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.util.Objects;
import javax.mail.UIDFolder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzoc {

    /* renamed from: A */
    private long f37993A;

    /* renamed from: B */
    private long f37994B;

    /* renamed from: C */
    private long f37995C;

    /* renamed from: D */
    private boolean f37996D;

    /* renamed from: E */
    private long f37997E;

    /* renamed from: F */
    private long f37998F;

    /* renamed from: a */
    private final zzob f37999a;

    /* renamed from: b */
    private final long[] f38000b;
    @Nullable

    /* renamed from: c */
    private AudioTrack f38001c;

    /* renamed from: d */
    private int f38002d;

    /* renamed from: e */
    private int f38003e;
    @Nullable

    /* renamed from: f */
    private zzoa f38004f;

    /* renamed from: g */
    private int f38005g;

    /* renamed from: h */
    private boolean f38006h;

    /* renamed from: i */
    private long f38007i;

    /* renamed from: j */
    private float f38008j;

    /* renamed from: k */
    private boolean f38009k;

    /* renamed from: l */
    private long f38010l;

    /* renamed from: m */
    private long f38011m;
    @Nullable

    /* renamed from: n */
    private Method f38012n;

    /* renamed from: o */
    private long f38013o;

    /* renamed from: p */
    private boolean f38014p;

    /* renamed from: q */
    private boolean f38015q;

    /* renamed from: r */
    private long f38016r;

    /* renamed from: s */
    private long f38017s;

    /* renamed from: t */
    private long f38018t;

    /* renamed from: u */
    private long f38019u;

    /* renamed from: v */
    private int f38020v;

    /* renamed from: w */
    private int f38021w;

    /* renamed from: x */
    private long f38022x;

    /* renamed from: y */
    private long f38023y;

    /* renamed from: z */
    private long f38024z;

    public zzoc(zzob zzob) {
        this.f37999a = zzob;
        int i = zzen.f34500a;
        try {
            this.f38012n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.f38000b = new long[10];
    }

    /* renamed from: l */
    private final long m54374l(long j) {
        return (j * 1000000) / ((long) this.f38005g);
    }

    /* renamed from: m */
    private final long m54375m() {
        AudioTrack audioTrack = this.f38001c;
        Objects.requireNonNull(audioTrack);
        if (this.f38022x != -9223372036854775807L) {
            return Math.min(this.f37993A, this.f38024z + ((((SystemClock.elapsedRealtime() * 1000) - this.f38022x) * ((long) this.f38005g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & UIDFolder.MAXUID;
        if (this.f38006h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f38019u = this.f38017s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f38019u;
        }
        if (zzen.f34500a <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.f38017s > 0 && playState == 3) {
                if (this.f38023y == -9223372036854775807L) {
                    this.f38023y = SystemClock.elapsedRealtime();
                }
                return this.f38017s;
            }
            this.f38023y = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.f38017s > playbackHeadPosition) {
            this.f38018t++;
        }
        this.f38017s = playbackHeadPosition;
        return playbackHeadPosition + (this.f38018t << 32);
    }

    /* renamed from: n */
    private final void m54376n() {
        this.f38010l = 0;
        this.f38021w = 0;
        this.f38020v = 0;
        this.f38011m = 0;
        this.f37995C = 0;
        this.f37998F = 0;
        this.f38009k = false;
    }

    /* renamed from: a */
    public final int mo47945a(long j) {
        return this.f38003e - ((int) (j - (m54375m() * ((long) this.f38002d))));
    }

    /* renamed from: b */
    public final long mo47946b(boolean z) {
        long j;
        Method method;
        zzoc zzoc = this;
        AudioTrack audioTrack = zzoc.f38001c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long l = zzoc.m54374l(m54375m());
            if (l != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zzoc.f38011m >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zzoc.f38000b;
                    int i = zzoc.f38020v;
                    jArr[i] = l - nanoTime;
                    zzoc.f38020v = (i + 1) % 10;
                    int i2 = zzoc.f38021w;
                    if (i2 < 10) {
                        zzoc.f38021w = i2 + 1;
                    }
                    zzoc.f38011m = nanoTime;
                    zzoc.f38010l = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = zzoc.f38021w;
                        if (i3 >= i4) {
                            break;
                        }
                        zzoc.f38010l += zzoc.f38000b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzoc.f38006h) {
                    zzoa zzoa = zzoc.f38004f;
                    Objects.requireNonNull(zzoa);
                    if (zzoa.mo47944g(nanoTime)) {
                        long b = zzoa.mo47939b();
                        long a = zzoa.mo47938a();
                        if (Math.abs(b - nanoTime) > 5000000) {
                            zzop zzop = (zzop) zzoc.f37999a;
                            zzdw.m48255e("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + a + ", " + b + ", " + nanoTime + ", " + l + ", " + zzop.f38058a.m54445y() + ", " + zzop.f38058a.m54446z());
                            zzoa.mo47941d();
                        } else {
                            zzoa zzoa2 = zzoa;
                            if (Math.abs(zzoc.m54374l(a) - l) > 5000000) {
                                zzop zzop2 = (zzop) zzoc.f37999a;
                                zzdw.m48255e("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + a + ", " + b + ", " + nanoTime + ", " + l + ", " + zzop2.f38058a.m54445y() + ", " + zzop2.f38058a.m54446z());
                                zzoa2.mo47941d();
                            } else {
                                zzoa2.mo47940c();
                            }
                        }
                        zzoc = this;
                    }
                    if (zzoc.f38015q && (method = zzoc.f38012n) != null && nanoTime - zzoc.f38016r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zzoc.f38001c;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = zzen.f34500a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - zzoc.f38007i;
                            zzoc.f38013o = intValue;
                            long max = Math.max(intValue, 0);
                            zzoc.f38013o = max;
                            if (max > 5000000) {
                                zzdw.m48255e("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                zzoc.f38013o = 0;
                            }
                        } catch (Exception unused) {
                            zzoc.f38012n = null;
                        }
                        zzoc.f38016r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzoa zzoa3 = zzoc.f38004f;
        Objects.requireNonNull(zzoa3);
        boolean f = zzoa3.mo47943f();
        if (f) {
            j = zzoc.m54374l(zzoa3.mo47938a()) + zzen.m49157c0(nanoTime2 - zzoa3.mo47939b(), zzoc.f38008j);
        } else {
            if (zzoc.f38021w == 0) {
                j = zzoc.m54374l(m54375m());
            } else {
                j = zzoc.f38010l + nanoTime2;
            }
            if (!z) {
                j = Math.max(0, j - zzoc.f38013o);
            }
        }
        if (zzoc.f37996D != f) {
            zzoc.f37998F = zzoc.f37995C;
            zzoc.f37997E = zzoc.f37994B;
        }
        long j2 = nanoTime2 - zzoc.f37998F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (zzoc.f37997E + zzen.m49157c0(j2, zzoc.f38008j)))) / 1000;
        }
        if (!zzoc.f38009k) {
            long j4 = zzoc.f37994B;
            if (j > j4) {
                zzoc.f38009k = true;
                long currentTimeMillis = System.currentTimeMillis() - zzen.m49171j0(zzen.m49161e0(zzen.m49171j0(j - j4), zzoc.f38008j));
                zzou zzou = ((zzop) zzoc.f37999a).f38058a;
                if (zzou.f38103n != null) {
                    ((zzoz) zzou.f38103n).f38117a.f38120T0.mo47908r(currentTimeMillis);
                }
            }
        }
        zzoc.f37995C = nanoTime2;
        zzoc.f37994B = j;
        zzoc.f37996D = f;
        return j;
    }

    /* renamed from: c */
    public final void mo47947c(long j) {
        this.f38024z = m54375m();
        this.f38022x = SystemClock.elapsedRealtime() * 1000;
        this.f37993A = j;
    }

    /* renamed from: d */
    public final void mo47948d() {
        m54376n();
        this.f38001c = null;
        this.f38004f = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47949e(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.f38001c = r4
            r3.f38002d = r7
            r3.f38003e = r8
            com.google.android.gms.internal.ads.zzoa r0 = new com.google.android.gms.internal.ads.zzoa
            r0.<init>(r4)
            r3.f38004f = r0
            int r4 = r4.getSampleRate()
            r3.f38005g = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0025
            int r5 = com.google.android.gms.internal.ads.zzen.f34500a
            r2 = 23
            if (r5 >= r2) goto L_0x0025
            r5 = 5
            if (r6 == r5) goto L_0x0026
            if (r6 != r4) goto L_0x0025
            r6 = 6
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.f38006h = r0
            boolean r4 = com.google.android.gms.internal.ads.zzen.m49183v(r6)
            r3.f38015q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x003c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.m54374l(r7)
            goto L_0x003d
        L_0x003c:
            r7 = r5
        L_0x003d:
            r3.f38007i = r7
            r7 = 0
            r3.f38017s = r7
            r3.f38018t = r7
            r3.f38019u = r7
            r3.f38014p = r1
            r3.f38022x = r5
            r3.f38023y = r5
            r3.f38016r = r7
            r3.f38013o = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f38008j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoc.mo47949e(android.media.AudioTrack, boolean, int, int, int):void");
    }

    /* renamed from: f */
    public final void mo47950f() {
        zzoa zzoa = this.f38004f;
        Objects.requireNonNull(zzoa);
        zzoa.mo47942e();
    }

    /* renamed from: g */
    public final boolean mo47951g(long j) {
        if (j > m54375m()) {
            return true;
        }
        if (!this.f38006h) {
            return false;
        }
        AudioTrack audioTrack = this.f38001c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && m54375m() == 0;
    }

    /* renamed from: h */
    public final boolean mo47952h() {
        AudioTrack audioTrack = this.f38001c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: i */
    public final boolean mo47953i(long j) {
        return this.f38023y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f38023y >= 200;
    }

    /* renamed from: j */
    public final boolean mo47954j(long j) {
        AudioTrack audioTrack = this.f38001c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f38006h) {
            if (playState == 2) {
                this.f38014p = false;
                return false;
            } else if (playState == 1) {
                if (m54375m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f38014p;
        boolean g = mo47951g(j);
        this.f38014p = g;
        if (z && !g && playState != 1) {
            zzob zzob = this.f37999a;
            int i = this.f38003e;
            long j0 = zzen.m49171j0(this.f38007i);
            zzop zzop = (zzop) zzob;
            if (zzop.f38058a.f38103n != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzou zzou = zzop.f38058a;
                ((zzoz) zzou.f38103n).f38117a.f38120T0.mo47910t(i, j0, elapsedRealtime - zzou.f38086S);
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo47955k() {
        m54376n();
        if (this.f38022x != -9223372036854775807L) {
            return false;
        }
        zzoa zzoa = this.f38004f;
        Objects.requireNonNull(zzoa);
        zzoa.mo47942e();
        return true;
    }
}
