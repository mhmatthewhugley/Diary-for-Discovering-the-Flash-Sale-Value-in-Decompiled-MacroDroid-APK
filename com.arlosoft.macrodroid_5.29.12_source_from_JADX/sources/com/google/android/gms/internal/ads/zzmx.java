package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.apache.commons.cli.HelpFormatter;

@RequiresApi(31)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzmx implements zzkr, zzmy {
    @Nullable

    /* renamed from: A */
    private PlaybackMetrics.Builder f37908A;

    /* renamed from: B */
    private int f37909B;

    /* renamed from: C */
    private int f37910C = 0;

    /* renamed from: D */
    private int f37911D = 0;
    @Nullable

    /* renamed from: E */
    private zzbw f37912E;
    @Nullable

    /* renamed from: F */
    private zzmw f37913F;
    @Nullable

    /* renamed from: G */
    private zzmw f37914G;
    @Nullable

    /* renamed from: H */
    private zzmw f37915H;
    @Nullable

    /* renamed from: I */
    private zzaf f37916I;
    @Nullable

    /* renamed from: J */
    private zzaf f37917J;
    @Nullable

    /* renamed from: K */
    private zzaf f37918K;

    /* renamed from: L */
    private boolean f37919L;

    /* renamed from: M */
    private boolean f37920M;

    /* renamed from: N */
    private int f37921N;

    /* renamed from: O */
    private int f37922O;

    /* renamed from: P */
    private int f37923P;

    /* renamed from: Q */
    private boolean f37924Q;

    /* renamed from: a */
    private final Context f37925a;

    /* renamed from: c */
    private final zzmz f37926c;

    /* renamed from: d */
    private final PlaybackSession f37927d;

    /* renamed from: f */
    private final long f37928f = SystemClock.elapsedRealtime();

    /* renamed from: g */
    private final zzcm f37929g = new zzcm();

    /* renamed from: o */
    private final zzck f37930o = new zzck();

    /* renamed from: p */
    private final HashMap f37931p = new HashMap();

    /* renamed from: s */
    private final HashMap f37932s = new HashMap();
    @Nullable

    /* renamed from: z */
    private String f37933z;

    private zzmx(Context context, PlaybackSession playbackSession) {
        this.f37925a = context.getApplicationContext();
        this.f37927d = playbackSession;
        zzmv zzmv = new zzmv(zzmv.f37896h);
        this.f37926c = zzmv;
        zzmv.mo47858c(this);
    }

    @Nullable
    /* renamed from: f */
    public static zzmx m54263f(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmx(context, mediaMetricsManager.createPlaybackSession());
    }

    /* renamed from: h */
    private static int m54264h(int i) {
        switch (zzen.m49147V(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: j */
    private final void m54265j() {
        long j;
        long j2;
        PlaybackMetrics.Builder builder = this.f37908A;
        if (builder != null && this.f37924Q) {
            builder.setAudioUnderrunCount(this.f37923P);
            this.f37908A.setVideoFramesDropped(this.f37921N);
            this.f37908A.setVideoFramesPlayed(this.f37922O);
            Long l = (Long) this.f37931p.get(this.f37933z);
            PlaybackMetrics.Builder builder2 = this.f37908A;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.f37932s.get(this.f37933z);
            PlaybackMetrics.Builder builder3 = this.f37908A;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(j2);
            this.f37908A.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f37927d.reportPlaybackMetrics(this.f37908A.build());
        }
        this.f37908A = null;
        this.f37933z = null;
        this.f37923P = 0;
        this.f37921N = 0;
        this.f37922O = 0;
        this.f37916I = null;
        this.f37917J = null;
        this.f37918K = null;
        this.f37924Q = false;
    }

    /* renamed from: n */
    private final void m54266n(long j, @Nullable zzaf zzaf, int i) {
        if (!zzen.m49181t(this.f37917J, zzaf)) {
            int i2 = this.f37917J == null ? 1 : 0;
            this.f37917J = zzaf;
            m54270s(0, j, zzaf, i2);
        }
    }

    /* renamed from: o */
    private final void m54267o(long j, @Nullable zzaf zzaf, int i) {
        if (!zzen.m49181t(this.f37918K, zzaf)) {
            int i2 = this.f37918K == null ? 1 : 0;
            this.f37918K = zzaf;
            m54270s(2, j, zzaf, i2);
        }
    }

    /* renamed from: p */
    private final void m54268p(zzcn zzcn, @Nullable zzsi zzsi) {
        int a;
        PlaybackMetrics.Builder builder = this.f37908A;
        if (zzsi != null && (a = zzcn.mo43599a(zzsi.f27569a)) != -1) {
            int i = 0;
            zzcn.mo43602d(a, this.f37930o, false);
            zzcn.mo43603e(this.f37930o.f28721c, this.f37929g, 0);
            zzay zzay = this.f37929g.f28936b.f26759b;
            int i2 = 2;
            if (zzay != null) {
                int Z = zzen.m49151Z(zzay.f26234a);
                i = Z != 0 ? Z != 1 ? Z != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            zzcm zzcm = this.f37929g;
            if (zzcm.f28946l != -9223372036854775807L && !zzcm.f28944j && !zzcm.f28941g && !zzcm.mo43957b()) {
                builder.setMediaDurationMillis(zzen.m49171j0(this.f37929g.f28946l));
            }
            if (true != this.f37929g.mo43957b()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.f37924Q = true;
        }
    }

    /* renamed from: q */
    private final void m54269q(long j, @Nullable zzaf zzaf, int i) {
        if (!zzen.m49181t(this.f37916I, zzaf)) {
            int i2 = this.f37916I == null ? 1 : 0;
            this.f37916I = zzaf;
            m54270s(1, j, zzaf, i2);
        }
    }

    /* renamed from: s */
    private final void m54270s(int i, long j, @Nullable zzaf zzaf, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f37928f);
        if (zzaf != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzaf.f24212k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzaf.f24213l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzaf.f24210i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzaf.f24209h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzaf.f24218q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzaf.f24219r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzaf.f24226y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzaf.f24227z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzaf.f24204c;
            if (str4 != null) {
                String[] H = zzen.m49133H(str4, HelpFormatter.DEFAULT_OPT_PREFIX);
                Pair create = Pair.create(H[0], H.length >= 2 ? H[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = zzaf.f24220s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f37924Q = true;
        this.f37927d.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* renamed from: v */
    private final boolean m54271v(@Nullable zzmw zzmw) {
        return zzmw != null && zzmw.f37907c.equals(this.f37926c.mo47859d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:178:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43962a(com.google.android.gms.internal.ads.zzcg r21, com.google.android.gms.internal.ads.zzkq r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.mo47833b()
            if (r2 == 0) goto L_0x03ea
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r22.mo47833b()
            r5 = 11
            if (r3 >= r4) goto L_0x0036
            int r4 = r1.mo47832a(r3)
            com.google.android.gms.internal.ads.zzkp r6 = r1.mo47834c(r4)
            if (r4 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzmz r4 = r0.f37926c
            r4.mo47856a(r6)
            goto L_0x0033
        L_0x0024:
            if (r4 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.zzmz r4 = r0.f37926c
            int r5 = r0.f37909B
            r4.mo47861f(r6, r5)
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.zzmz r4 = r0.f37926c
            r4.mo47862g(r6)
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0036:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.mo47835d(r2)
            if (r6 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzkp r6 = r1.mo47834c(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.f37908A
            if (r7 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.zzcn r7 = r6.f37761b
            com.google.android.gms.internal.ads.zzsi r6 = r6.f37763d
            r0.m54268p(r7, r6)
        L_0x004f:
            r6 = 2
            boolean r7 = r1.mo47835d(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.f37908A
            if (r7 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.zzcy r7 = r21.mo43523l()
            com.google.android.gms.internal.ads.zzfvn r7 = r7.mo44475a()
            int r12 = r7.size()
            r13 = 0
        L_0x006a:
            if (r13 >= r12) goto L_0x008f
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.zzcx r14 = (com.google.android.gms.internal.ads.zzcx) r14
            r15 = 0
        L_0x0073:
            int r5 = r14.f31763a
            int r5 = r13 + 1
            if (r15 > 0) goto L_0x008b
            boolean r5 = r14.mo44448d(r15)
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzaf r5 = r14.mo44446b(r15)
            com.google.android.gms.internal.ads.zzx r5 = r5.f24216o
            if (r5 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008b:
            r13 = r5
            r5 = 11
            goto L_0x006a
        L_0x008f:
            r5 = r10
        L_0x0090:
            if (r5 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.f37908A
            int r12 = com.google.android.gms.internal.ads.zzen.f34500a
            r12 = 0
        L_0x0097:
            int r13 = r5.f38829f
            if (r12 >= r13) goto L_0x00c2
            com.google.android.gms.internal.ads.zzw r13 = r5.mo48361a(r12)
            java.util.UUID r13 = r13.f38757c
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.f37985d
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00ab
            r5 = 3
            goto L_0x00c3
        L_0x00ab:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.f37986e
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b5
            r5 = 2
            goto L_0x00c3
        L_0x00b5:
            java.util.UUID r14 = com.google.android.gms.internal.ads.zzo.f37984c
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00bf
            r5 = 6
            goto L_0x00c3
        L_0x00bf:
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00c2:
            r5 = 1
        L_0x00c3:
            r7.setDrmType(r5)
        L_0x00c6:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.mo47835d(r5)
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.f37923P
            int r5 = r5 + r11
            r0.f37923P = r5
        L_0x00d3:
            com.google.android.gms.internal.ads.zzbw r5 = r0.f37912E
            r16 = 9
            if (r5 != 0) goto L_0x00db
            goto L_0x0294
        L_0x00db:
            android.content.Context r7 = r0.f37925a
            int r8 = r5.zzb
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 14
            r18 = 35
            r19 = 31
            r13 = 21
            r14 = 23
            if (r8 != r12) goto L_0x00f3
            r17 = 20
            r14 = 20
            goto L_0x026e
        L_0x00f3:
            r8 = r5
            com.google.android.gms.internal.ads.zzha r8 = (com.google.android.gms.internal.ads.zzha) r8
            int r12 = r8.zze
            int r8 = r8.zzi
            java.lang.Throwable r15 = r5.getCause()
            java.util.Objects.requireNonNull(r15)
            boolean r2 = r15 instanceof java.io.IOException
            if (r2 == 0) goto L_0x01fd
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfs
            if (r2 == 0) goto L_0x0110
            com.google.android.gms.internal.ads.zzfs r15 = (com.google.android.gms.internal.ads.zzfs) r15
            int r2 = r15.zzd
            r14 = 5
            goto L_0x026e
        L_0x0110:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfr
            if (r2 != 0) goto L_0x01f8
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzbu
            if (r2 == 0) goto L_0x011a
            goto L_0x01f8
        L_0x011a:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfq
            if (r2 != 0) goto L_0x01c5
            boolean r8 = r15 instanceof com.google.android.gms.internal.ads.zzga
            if (r8 == 0) goto L_0x0124
            goto L_0x01c5
        L_0x0124:
            int r2 = r5.zzb
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r7) goto L_0x012f
            r2 = 0
            r14 = 21
            goto L_0x026e
        L_0x012f:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzpi
            if (r2 == 0) goto L_0x018d
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            int r7 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r7 < r13) goto L_0x0152
            boolean r8 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0152
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = com.google.android.gms.internal.ads.zzen.m49148W(r2)
            int r17 = m54264h(r2)
            goto L_0x0266
        L_0x0152:
            if (r7 < r14) goto L_0x015f
            boolean r7 = r2 instanceof android.media.MediaDrmResetException
            if (r7 == 0) goto L_0x015f
            r17 = 27
            r2 = 0
            r14 = 27
            goto L_0x026e
        L_0x015f:
            boolean r7 = r2 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x016a
            r17 = 24
            r2 = 0
            r14 = 24
            goto L_0x026e
        L_0x016a:
            boolean r7 = r2 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x0175
            r17 = 29
            r2 = 0
            r14 = 29
            goto L_0x026e
        L_0x0175:
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzpt
            if (r7 == 0) goto L_0x017b
            goto L_0x0216
        L_0x017b:
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.zzpg
            if (r2 == 0) goto L_0x0186
            r17 = 28
            r2 = 0
            r14 = 28
            goto L_0x026e
        L_0x0186:
            r17 = 30
            r2 = 0
            r14 = 30
            goto L_0x026e
        L_0x018d:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzfm
            if (r2 == 0) goto L_0x01c0
            java.lang.Throwable r2 = r15.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01c0
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            java.lang.Throwable r2 = r2.getCause()
            int r7 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r7 < r13) goto L_0x01bb
            boolean r7 = r2 instanceof android.system.ErrnoException
            if (r7 == 0) goto L_0x01bb
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r7 = android.system.OsConstants.EACCES
            if (r2 != r7) goto L_0x01bb
            r17 = 32
            r2 = 0
            r14 = 32
            goto L_0x026e
        L_0x01bb:
            r2 = 0
            r14 = 31
            goto L_0x026e
        L_0x01c0:
            r2 = 0
            r14 = 9
            goto L_0x026e
        L_0x01c5:
            com.google.android.gms.internal.ads.zzed r7 = com.google.android.gms.internal.ads.zzed.m48601b(r7)
            int r7 = r7.mo45178a()
            if (r7 != r11) goto L_0x01d3
            r2 = 0
            r14 = 3
            goto L_0x026e
        L_0x01d3:
            java.lang.Throwable r7 = r15.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01df
            r2 = 0
            r14 = 6
            goto L_0x026e
        L_0x01df:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01e7
            r2 = 0
            r14 = 7
            goto L_0x026e
        L_0x01e7:
            if (r2 == 0) goto L_0x01f3
            com.google.android.gms.internal.ads.zzfq r15 = (com.google.android.gms.internal.ads.zzfq) r15
            int r2 = r15.zzc
            if (r2 != r11) goto L_0x01f3
            r2 = 0
            r14 = 4
            goto L_0x026e
        L_0x01f3:
            r2 = 0
            r14 = 8
            goto L_0x026e
        L_0x01f8:
            r2 = 0
            r14 = 11
            goto L_0x026e
        L_0x01fd:
            if (r12 != r11) goto L_0x0208
            if (r8 == 0) goto L_0x0203
            if (r8 != r11) goto L_0x0208
        L_0x0203:
            r2 = 0
            r14 = 35
            goto L_0x026e
        L_0x0208:
            if (r12 != r11) goto L_0x0212
            if (r8 != r9) goto L_0x0212
            r17 = 15
            r2 = 0
            r14 = 15
            goto L_0x026e
        L_0x0212:
            if (r12 != r11) goto L_0x0218
            if (r8 != r6) goto L_0x0218
        L_0x0216:
            r2 = 0
            goto L_0x026e
        L_0x0218:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqp
            if (r2 == 0) goto L_0x0227
            com.google.android.gms.internal.ads.zzqp r15 = (com.google.android.gms.internal.ads.zzqp) r15
            java.lang.String r2 = r15.zzd
            int r2 = com.google.android.gms.internal.ads.zzen.m49148W(r2)
            r14 = 13
            goto L_0x026e
        L_0x0227:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zzqm
            if (r2 == 0) goto L_0x0236
            com.google.android.gms.internal.ads.zzqm r15 = (com.google.android.gms.internal.ads.zzqm) r15
            java.lang.String r2 = r15.zzb
            int r2 = com.google.android.gms.internal.ads.zzen.m49148W(r2)
        L_0x0233:
            r14 = 14
            goto L_0x026e
        L_0x0236:
            boolean r2 = r15 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x023c
            r2 = 0
            goto L_0x0233
        L_0x023c:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zznu
            if (r2 == 0) goto L_0x0249
            com.google.android.gms.internal.ads.zznu r15 = (com.google.android.gms.internal.ads.zznu) r15
            int r2 = r15.zza
            r17 = 17
            r14 = 17
            goto L_0x026e
        L_0x0249:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.zznx
            if (r2 == 0) goto L_0x0256
            com.google.android.gms.internal.ads.zznx r15 = (com.google.android.gms.internal.ads.zznx) r15
            int r2 = r15.zza
            r17 = 18
            r14 = 18
            goto L_0x026e
        L_0x0256:
            int r2 = com.google.android.gms.internal.ads.zzen.f34500a
            boolean r2 = r15 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x0269
            android.media.MediaCodec$CryptoException r15 = (android.media.MediaCodec.CryptoException) r15
            int r2 = r15.getErrorCode()
            int r17 = m54264h(r2)
        L_0x0266:
            r14 = r17
            goto L_0x026e
        L_0x0269:
            r17 = 22
            r2 = 0
            r14 = 22
        L_0x026e:
            android.media.metrics.PlaybackSession r7 = r0.f37927d
            android.media.metrics.PlaybackErrorEvent$Builder r8 = new android.media.metrics.PlaybackErrorEvent$Builder
            r8.<init>()
            long r12 = r0.f37928f
            long r12 = r3 - r12
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r7.reportPlaybackErrorEvent(r2)
            r0.f37924Q = r11
            r0.f37912E = r10
        L_0x0294:
            boolean r2 = r1.mo47835d(r6)
            if (r2 == 0) goto L_0x02c3
            com.google.android.gms.internal.ads.zzcy r2 = r21.mo43523l()
            boolean r5 = r2.mo44476b(r6)
            boolean r7 = r2.mo44476b(r11)
            boolean r2 = r2.mo44476b(r9)
            if (r5 != 0) goto L_0x02b1
            if (r7 != 0) goto L_0x02b1
            if (r2 == 0) goto L_0x02c3
            r2 = 1
        L_0x02b1:
            if (r5 != 0) goto L_0x02b8
            r5 = 0
            r0.m54269q(r3, r10, r5)
            goto L_0x02b9
        L_0x02b8:
            r5 = 0
        L_0x02b9:
            if (r7 != 0) goto L_0x02be
            r0.m54266n(r3, r10, r5)
        L_0x02be:
            if (r2 != 0) goto L_0x02c3
            r0.m54267o(r3, r10, r5)
        L_0x02c3:
            com.google.android.gms.internal.ads.zzmw r2 = r0.f37913F
            boolean r2 = r0.m54271v(r2)
            if (r2 == 0) goto L_0x02db
            com.google.android.gms.internal.ads.zzmw r2 = r0.f37913F
            com.google.android.gms.internal.ads.zzaf r2 = r2.f37905a
            int r5 = r2.f24219r
            r7 = -1
            if (r5 == r7) goto L_0x02db
            r5 = 0
            r0.m54269q(r3, r2, r5)
            r0.f37913F = r10
            goto L_0x02dc
        L_0x02db:
            r5 = 0
        L_0x02dc:
            com.google.android.gms.internal.ads.zzmw r2 = r0.f37914G
            boolean r2 = r0.m54271v(r2)
            if (r2 == 0) goto L_0x02ed
            com.google.android.gms.internal.ads.zzmw r2 = r0.f37914G
            com.google.android.gms.internal.ads.zzaf r2 = r2.f37905a
            r0.m54266n(r3, r2, r5)
            r0.f37914G = r10
        L_0x02ed:
            com.google.android.gms.internal.ads.zzmw r2 = r0.f37915H
            boolean r2 = r0.m54271v(r2)
            if (r2 == 0) goto L_0x02fe
            com.google.android.gms.internal.ads.zzmw r2 = r0.f37915H
            com.google.android.gms.internal.ads.zzaf r2 = r2.f37905a
            r0.m54267o(r3, r2, r5)
            r0.f37915H = r10
        L_0x02fe:
            android.content.Context r2 = r0.f37925a
            com.google.android.gms.internal.ads.zzed r2 = com.google.android.gms.internal.ads.zzed.m48601b(r2)
            int r2 = r2.mo45178a()
            switch(r2) {
                case 0: goto L_0x031f;
                case 1: goto L_0x031c;
                case 2: goto L_0x031a;
                case 3: goto L_0x0318;
                case 4: goto L_0x0316;
                case 5: goto L_0x0314;
                case 6: goto L_0x030b;
                case 7: goto L_0x0312;
                case 8: goto L_0x030b;
                case 9: goto L_0x030f;
                case 10: goto L_0x030d;
                default: goto L_0x030b;
            }
        L_0x030b:
            r13 = 1
            goto L_0x0320
        L_0x030d:
            r13 = 7
            goto L_0x0320
        L_0x030f:
            r13 = 8
            goto L_0x0320
        L_0x0312:
            r13 = 3
            goto L_0x0320
        L_0x0314:
            r13 = 6
            goto L_0x0320
        L_0x0316:
            r13 = 5
            goto L_0x0320
        L_0x0318:
            r13 = 4
            goto L_0x0320
        L_0x031a:
            r13 = 2
            goto L_0x0320
        L_0x031c:
            r13 = 9
            goto L_0x0320
        L_0x031f:
            r13 = 0
        L_0x0320:
            int r2 = r0.f37911D
            if (r13 == r2) goto L_0x0340
            r0.f37911D = r13
            android.media.metrics.PlaybackSession r2 = r0.f37927d
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.f37928f
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x0340:
            int r2 = r21.mo43516e()
            if (r2 == r6) goto L_0x034a
            r2 = 0
            r0.f37919L = r2
            goto L_0x034b
        L_0x034a:
            r2 = 0
        L_0x034b:
            r5 = r21
            com.google.android.gms.internal.ads.zzkf r5 = (com.google.android.gms.internal.ads.zzkf) r5
            com.google.android.gms.internal.ads.zzha r5 = r5.mo47784B()
            r7 = 10
            if (r5 != 0) goto L_0x035a
            r0.f37920M = r2
            goto L_0x0362
        L_0x035a:
            boolean r2 = r1.mo47835d(r7)
            if (r2 == 0) goto L_0x0362
            r0.f37920M = r11
        L_0x0362:
            int r2 = r21.mo43516e()
            boolean r5 = r0.f37919L
            if (r5 == 0) goto L_0x036c
            r5 = 5
            goto L_0x03b6
        L_0x036c:
            boolean r5 = r0.f37920M
            if (r5 == 0) goto L_0x0373
            r5 = 13
            goto L_0x03b6
        L_0x0373:
            r5 = 4
            if (r2 != r5) goto L_0x0379
            r5 = 11
            goto L_0x03b6
        L_0x0379:
            if (r2 != r6) goto L_0x0397
            int r2 = r0.f37910C
            if (r2 == 0) goto L_0x0395
            if (r2 != r6) goto L_0x0382
            goto L_0x0395
        L_0x0382:
            boolean r2 = r21.mo43528s()
            if (r2 != 0) goto L_0x038a
            r5 = 7
            goto L_0x03b6
        L_0x038a:
            int r2 = r21.mo43518g()
            if (r2 == 0) goto L_0x0393
            r5 = 10
            goto L_0x03b6
        L_0x0393:
            r5 = 6
            goto L_0x03b6
        L_0x0395:
            r5 = 2
            goto L_0x03b6
        L_0x0397:
            if (r2 != r9) goto L_0x03ab
            boolean r2 = r21.mo43528s()
            if (r2 != 0) goto L_0x03a0
            goto L_0x03b6
        L_0x03a0:
            int r2 = r21.mo43518g()
            if (r2 == 0) goto L_0x03a9
            r5 = 9
            goto L_0x03b6
        L_0x03a9:
            r5 = 3
            goto L_0x03b6
        L_0x03ab:
            if (r2 != r11) goto L_0x03b4
            int r2 = r0.f37910C
            if (r2 == 0) goto L_0x03b4
            r5 = 12
            goto L_0x03b6
        L_0x03b4:
            int r5 = r0.f37910C
        L_0x03b6:
            int r2 = r0.f37910C
            if (r2 == r5) goto L_0x03d9
            r0.f37910C = r5
            r0.f37924Q = r11
            android.media.metrics.PlaybackSession r2 = r0.f37927d
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.f37910C
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.f37928f
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03d9:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.mo47835d(r2)
            if (r3 == 0) goto L_0x03ea
            com.google.android.gms.internal.ads.zzmz r3 = r0.f37926c
            com.google.android.gms.internal.ads.zzkp r1 = r1.mo47834c(r2)
            r3.mo47860e(r1)
        L_0x03ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmx.mo43962a(com.google.android.gms.internal.ads.zzcg, com.google.android.gms.internal.ads.zzkq):void");
    }

    /* renamed from: b */
    public final void mo47863b(zzkp zzkp, String str, boolean z) {
        zzsi zzsi = zzkp.f37763d;
        if ((zzsi == null || !zzsi.mo42817b()) && str.equals(this.f37933z)) {
            m54265j();
        }
        this.f37931p.remove(str);
        this.f37932s.remove(str);
    }

    /* renamed from: c */
    public final void mo47864c(zzkp zzkp, String str) {
        zzsi zzsi = zzkp.f37763d;
        if (zzsi == null || !zzsi.mo42817b()) {
            m54265j();
            this.f37933z = str;
            this.f37908A = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            m54268p(zzkp.f37761b, zzkp.f37763d);
        }
    }

    /* renamed from: d */
    public final void mo43963d(zzkp zzkp, zzse zzse) {
        zzsi zzsi = zzkp.f37763d;
        if (zzsi != null) {
            zzaf zzaf = zzse.f38420b;
            Objects.requireNonNull(zzaf);
            zzmw zzmw = new zzmw(zzaf, 0, this.f37926c.mo47857b(zzkp.f37761b, zzsi));
            int i = zzse.f38419a;
            if (i != 0) {
                if (i == 1) {
                    this.f37914G = zzmw;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.f37915H = zzmw;
                        return;
                    }
                    return;
                }
            }
            this.f37913F = zzmw;
        }
    }

    /* renamed from: e */
    public final LogSessionId mo47865e() {
        return this.f37927d.getSessionId();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo43965g(zzkp zzkp, zzaf zzaf, zzgt zzgt) {
    }

    /* renamed from: i */
    public final void mo43967i(zzkp zzkp, int i, long j, long j2) {
        long j3;
        zzsi zzsi = zzkp.f37763d;
        if (zzsi != null) {
            String b = this.f37926c.mo47857b(zzkp.f37761b, zzsi);
            Long l = (Long) this.f37932s.get(b);
            Long l2 = (Long) this.f37931p.get(b);
            HashMap hashMap = this.f37932s;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(b, Long.valueOf(j3 + j));
            HashMap hashMap2 = this.f37931p;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(b, Long.valueOf(j4 + ((long) i)));
        }
    }

    /* renamed from: k */
    public final void mo43971k(zzkp zzkp, zzcf zzcf, zzcf zzcf2, int i) {
        if (i == 1) {
            this.f37919L = true;
            i = 1;
        }
        this.f37909B = i;
    }

    /* renamed from: l */
    public final /* synthetic */ void mo43973l(zzkp zzkp, zzaf zzaf, zzgt zzgt) {
    }

    /* renamed from: m */
    public final /* synthetic */ void mo43975m(zzkp zzkp, Object obj, long j) {
    }

    /* renamed from: r */
    public final void mo43978r(zzkp zzkp, zzda zzda) {
        zzmw zzmw = this.f37913F;
        if (zzmw != null) {
            zzaf zzaf = zzmw.f37905a;
            if (zzaf.f24219r == -1) {
                zzad b = zzaf.mo41422b();
                b.mo41348x(zzda.f31941a);
                b.mo41327f(zzda.f31942b);
                this.f37913F = new zzmw(b.mo41349y(), 0, zzmw.f37907c);
            }
        }
    }

    /* renamed from: t */
    public final void mo43979t(zzkp zzkp, zzgs zzgs) {
        this.f37921N += zzgs.f37200g;
        this.f37922O += zzgs.f37198e;
    }

    /* renamed from: u */
    public final void mo43980u(zzkp zzkp, zzbw zzbw) {
        this.f37912E = zzbw;
    }

    /* renamed from: w */
    public final /* synthetic */ void mo43981w(zzkp zzkp, int i, long j) {
    }

    /* renamed from: x */
    public final void mo43982x(zzkp zzkp, zzrz zzrz, zzse zzse, IOException iOException, boolean z) {
    }

    /* renamed from: z */
    public final /* synthetic */ void mo43984z(zzkp zzkp, int i) {
    }
}
