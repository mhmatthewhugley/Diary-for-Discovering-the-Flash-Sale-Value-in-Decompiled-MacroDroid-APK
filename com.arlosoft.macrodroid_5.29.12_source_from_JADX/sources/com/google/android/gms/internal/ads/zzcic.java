package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcic extends zzcie implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: K */
    private static final Map f28489K;

    /* renamed from: A */
    private Uri f28490A;

    /* renamed from: B */
    private int f28491B;

    /* renamed from: C */
    private int f28492C;

    /* renamed from: D */
    private int f28493D;

    /* renamed from: E */
    private zzciw f28494E;

    /* renamed from: F */
    private final boolean f28495F;

    /* renamed from: G */
    private int f28496G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public zzcid f28497H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f28498I = false;

    /* renamed from: J */
    private Integer f28499J = null;

    /* renamed from: f */
    private final zzciy f28500f;

    /* renamed from: g */
    private final zzciz f28501g;

    /* renamed from: o */
    private final boolean f28502o;

    /* renamed from: p */
    private int f28503p = 0;

    /* renamed from: s */
    private int f28504s = 0;

    /* renamed from: z */
    private MediaPlayer f28505z;

    static {
        HashMap hashMap = new HashMap();
        f28489K = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf(TypedValues.Transition.TYPE_DURATION), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(Integer.valueOf(TypedValues.Transition.TYPE_FROM), "MEDIA_INFO_BUFFERING_START");
        hashMap.put(Integer.valueOf(TypedValues.Transition.TYPE_TO), "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(Integer.valueOf(TypedValues.Custom.TYPE_FLOAT), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(Integer.valueOf(TypedValues.Custom.TYPE_COLOR), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcic(Context context, zzciy zzciy, boolean z, boolean z2, zzcix zzcix, zzciz zzciz, @Nullable Integer num) {
        super(context, num);
        setSurfaceTextureListener(this);
        this.f28500f = zzciy;
        this.f28501g = zzciz;
        this.f28495F = z;
        this.f28502o = z2;
        zzciz.mo43770a(this);
    }

    /* renamed from: D */
    private final void m45279D() {
        zze.m2645k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f28490A != null && surfaceTexture != null) {
            m45280E(false);
            try {
                zzt.m2900m();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f28505z = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.f28505z.setOnCompletionListener(this);
                this.f28505z.setOnErrorListener(this);
                this.f28505z.setOnInfoListener(this);
                this.f28505z.setOnPreparedListener(this);
                this.f28505z.setOnVideoSizeChangedListener(this);
                this.f28493D = 0;
                if (this.f28495F) {
                    zzciw zzciw = new zzciw(getContext());
                    this.f28494E = zzciw;
                    zzciw.mo43737c(surfaceTexture, getWidth(), getHeight());
                    this.f28494E.start();
                    SurfaceTexture a = this.f28494E.mo43735a();
                    if (a != null) {
                        surfaceTexture = a;
                    } else {
                        this.f28494E.mo43738d();
                        this.f28494E = null;
                    }
                }
                this.f28505z.setDataSource(getContext(), this.f28490A);
                zzt.m2901n();
                this.f28505z.setSurface(new Surface(surfaceTexture));
                this.f28505z.setAudioStreamType(3);
                this.f28505z.setScreenOnWhilePlaying(true);
                this.f28505z.prepareAsync();
                m45281F(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                zzcgp.m45230h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f28490A)), e);
                onError(this.f28505z, 1, 0);
            }
        }
    }

    /* renamed from: E */
    private final void m45280E(boolean z) {
        zze.m2645k("AdMediaPlayerView release");
        zzciw zzciw = this.f28494E;
        if (zzciw != null) {
            zzciw.mo43738d();
            this.f28494E = null;
        }
        MediaPlayer mediaPlayer = this.f28505z;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f28505z.release();
            this.f28505z = null;
            m45281F(0);
            if (z) {
                this.f28504s = 0;
            }
        }
    }

    /* renamed from: F */
    private final void m45281F(int i) {
        if (i == 3) {
            this.f28501g.mo43772c();
            this.f28507c.mo43780b();
        } else if (this.f28503p == 3) {
            this.f28501g.mo43774e();
            this.f28507c.mo43781c();
        }
        this.f28503p = i;
    }

    /* renamed from: G */
    private final void m45282G(float f) {
        MediaPlayer mediaPlayer = this.f28505z;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzcgp.m45229g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f28503p;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m45283H() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.f28505z
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f28503p
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcic.m45283H():boolean");
    }

    /* renamed from: K */
    static /* bridge */ /* synthetic */ void m45286K(zzcic zzcic, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && zzcic.f28500f != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
            HashMap hashMap = new HashMap();
            for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                if (trackInfo2 != null) {
                    int trackType = trackInfo2.getTrackType();
                    if (trackType == 1) {
                        MediaFormat format2 = trackInfo2.getFormat();
                        if (format2 != null) {
                            if (format2.containsKey("frame-rate")) {
                                try {
                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                } catch (ClassCastException unused) {
                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                }
                            }
                            if (format2.containsKey("bitrate")) {
                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                zzcic.f28499J = valueOf;
                                hashMap.put("bitRate", String.valueOf(valueOf));
                            }
                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                            }
                            if (format2.containsKey("mime")) {
                                hashMap.put("videoMime", format2.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                            }
                        }
                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                        if (format.containsKey("mime")) {
                            hashMap.put("audioMime", format.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                            hashMap.put("audioCodec", format.getString("codecs-string"));
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                zzcic.f28500f.mo42954y("onMetadataEvent", hashMap);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo43607b(int i) {
        zzcid zzcid = this.f28497H;
        if (zzcid != null) {
            zzcid.onWindowVisibilityChanged(i);
        }
    }

    /* renamed from: h */
    public final int mo43608h() {
        if (m45283H()) {
            return this.f28505z.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo43609i() {
        if (Build.VERSION.SDK_INT < 26 || !m45283H()) {
            return -1;
        }
        return this.f28505z.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    /* renamed from: j */
    public final int mo43610j() {
        if (m45283H()) {
            return this.f28505z.getDuration();
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo43611k() {
        MediaPlayer mediaPlayer = this.f28505z;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo43612l() {
        MediaPlayer mediaPlayer = this.f28505z;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    /* renamed from: m */
    public final long mo43613m() {
        return 0;
    }

    /* renamed from: n */
    public final void mo43614n() {
        m45282G(this.f28507c.mo43779a());
    }

    /* renamed from: o */
    public final long mo43615o() {
        if (this.f28499J != null) {
            return (mo43628p() * ((long) this.f28493D)) / 100;
        }
        return -1;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f28493D = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zze.m2645k("AdMediaPlayerView completion");
        m45281F(5);
        this.f28504s = 5;
        zzs.f2304i.post(new zzchv(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f28489K;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        zzcgp.m45229g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        m45281F(-1);
        this.f28504s = -1;
        zzs.f2304i.post(new zzchw(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = f28489K;
        zze.m2645k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r1 > r6) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f28491B
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f28492C
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f28491B
            if (r2 <= 0) goto L_0x007e
            int r2 = r5.f28492C
            if (r2 <= 0) goto L_0x007e
            com.google.android.gms.internal.ads.zzciw r2 = r5.f28494E
            if (r2 != 0) goto L_0x007e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0043
            if (r1 != r2) goto L_0x0041
            int r0 = r5.f28491B
            int r1 = r0 * r7
            int r2 = r5.f28492C
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003c
            int r0 = r1 / r2
        L_0x003a:
            r1 = r7
            goto L_0x007e
        L_0x003c:
            if (r1 <= r3) goto L_0x0063
            int r1 = r3 / r0
            goto L_0x0054
        L_0x0041:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0043:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0056
            int r0 = r5.f28492C
            int r0 = r0 * r6
            int r2 = r5.f28491B
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0053
            if (r0 <= r7) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r1 = r0
        L_0x0054:
            r0 = r6
            goto L_0x007e
        L_0x0056:
            if (r1 != r2) goto L_0x0067
            int r1 = r5.f28491B
            int r1 = r1 * r7
            int r2 = r5.f28492C
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
        L_0x0063:
            r0 = r6
            goto L_0x003a
        L_0x0065:
            r0 = r1
            goto L_0x003a
        L_0x0067:
            int r2 = r5.f28491B
            int r4 = r5.f28492C
            if (r1 != r3) goto L_0x0073
            if (r4 <= r7) goto L_0x0073
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x0075
        L_0x0073:
            r1 = r2
            r7 = r4
        L_0x0075:
            if (r0 != r3) goto L_0x0065
            if (r1 <= r6) goto L_0x0065
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x0054
        L_0x007e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzciw r6 = r5.f28494E
            if (r6 == 0) goto L_0x0088
            r6.mo43736b(r0, r1)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcic.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f A[LOOP:0: B:12:0x005f->B:17:0x007a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPrepared(android.media.MediaPlayer r9) {
        /*
            r8 = this;
            java.lang.String r0 = "AdMediaPlayerView prepared"
            com.google.android.gms.ads.internal.util.zze.m2645k(r0)
            r0 = 2
            r8.m45281F(r0)
            com.google.android.gms.internal.ads.zzciz r0 = r8.f28501g
            r0.mo43771b()
            com.google.android.gms.internal.ads.zzfpz r0 = com.google.android.gms.ads.internal.util.zzs.f2304i
            com.google.android.gms.internal.ads.zzchu r1 = new com.google.android.gms.internal.ads.zzchu
            r1.<init>(r8, r9)
            r0.post(r1)
            int r0 = r9.getVideoWidth()
            r8.f28491B = r0
            int r9 = r9.getVideoHeight()
            r8.f28492C = r9
            int r9 = r8.f28496G
            if (r9 == 0) goto L_0x002b
            r8.mo43632t(r9)
        L_0x002b:
            boolean r9 = r8.f28502o
            r0 = 3
            if (r9 != 0) goto L_0x0031
            goto L_0x0084
        L_0x0031:
            boolean r9 = r8.m45283H()
            if (r9 == 0) goto L_0x0084
            android.media.MediaPlayer r9 = r8.f28505z
            int r9 = r9.getCurrentPosition()
            if (r9 <= 0) goto L_0x0084
            int r9 = r8.f28504s
            if (r9 == r0) goto L_0x0084
            java.lang.String r9 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.ads.internal.util.zze.m2645k(r9)
            r9 = 0
            r8.m45282G(r9)
            android.media.MediaPlayer r9 = r8.f28505z
            r9.start()
            android.media.MediaPlayer r9 = r8.f28505z
            int r9 = r9.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r1 = r1.mo21950a()
        L_0x005f:
            boolean r3 = r8.m45283H()
            if (r3 == 0) goto L_0x007c
            android.media.MediaPlayer r3 = r8.f28505z
            int r3 = r3.getCurrentPosition()
            if (r3 != r9) goto L_0x007c
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.m2889b()
            long r3 = r3.mo21950a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x005f
        L_0x007c:
            android.media.MediaPlayer r9 = r8.f28505z
            r9.pause()
            r8.mo43614n()
        L_0x0084:
            int r9 = r8.f28491B
            int r1 = r8.f28492C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdMediaPlayerView stream dimensions: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = " x "
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = r2.toString()
            com.google.android.gms.internal.ads.zzcgp.m45228f(r9)
            int r9 = r8.f28504s
            if (r9 != r0) goto L_0x00ab
            r8.mo43631s()
        L_0x00ab:
            r8.mo43614n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcic.onPrepared(android.media.MediaPlayer):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.m2645k("AdMediaPlayerView surface created");
        m45279D();
        zzs.f2304i.post(new zzchx(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zze.m2645k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f28505z;
        if (mediaPlayer != null && this.f28496G == 0) {
            this.f28496G = mediaPlayer.getCurrentPosition();
        }
        zzciw zzciw = this.f28494E;
        if (zzciw != null) {
            zzciw.mo43738d();
        }
        zzs.f2304i.post(new zzchz(this));
        m45280E(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zze.m2645k("AdMediaPlayerView surface changed");
        int i3 = this.f28504s;
        boolean z = false;
        if (this.f28491B == i && this.f28492C == i2) {
            z = true;
        }
        if (this.f28505z != null && i3 == 3 && z) {
            int i4 = this.f28496G;
            if (i4 != 0) {
                mo43632t(i4);
            }
            mo43631s();
        }
        zzciw zzciw = this.f28494E;
        if (zzciw != null) {
            zzciw.mo43736b(i, i2);
        }
        zzs.f2304i.post(new zzchy(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f28501g.mo43775f(this);
        this.f28506a.mo43725a(surfaceTexture, this.f28497H);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        zze.m2645k("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.f28491B = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f28492C = videoHeight;
        if (this.f28491B != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.m2645k("AdMediaPlayerView window visibility changed to " + i);
        zzs.f2304i.post(new zzcht(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: p */
    public final long mo43628p() {
        if (this.f28499J != null) {
            return ((long) mo43610j()) * ((long) this.f28499J.intValue());
        }
        return -1;
    }

    /* renamed from: q */
    public final String mo43629q() {
        return "MediaPlayer".concat(true != this.f28495F ? "" : " spherical");
    }

    /* renamed from: r */
    public final void mo43630r() {
        zze.m2645k("AdMediaPlayerView pause");
        if (m45283H() && this.f28505z.isPlaying()) {
            this.f28505z.pause();
            m45281F(4);
            zzs.f2304i.post(new zzcib(this));
        }
        this.f28504s = 4;
    }

    /* renamed from: s */
    public final void mo43631s() {
        zze.m2645k("AdMediaPlayerView play");
        if (m45283H()) {
            this.f28505z.start();
            m45281F(3);
            this.f28506a.mo43726b();
            zzs.f2304i.post(new zzcia(this));
        }
        this.f28504s = 3;
    }

    /* renamed from: t */
    public final void mo43632t(int i) {
        zze.m2645k("AdMediaPlayerView seek " + i);
        if (m45283H()) {
            this.f28505z.seekTo(i);
            this.f28496G = 0;
            return;
        }
        this.f28496G = i;
    }

    public final String toString() {
        String name = zzcic.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return name + "@" + hexString;
    }

    /* renamed from: u */
    public final void mo43634u(zzcid zzcid) {
        this.f28497H = zzcid;
    }

    /* renamed from: v */
    public final void mo43635v(String str) {
        Uri parse = Uri.parse(str);
        zzbeb l2 = zzbeb.m43220l2(parse);
        if (l2 == null || l2.f26680a != null) {
            if (l2 != null) {
                parse = Uri.parse(l2.f26680a);
            }
            this.f28490A = parse;
            this.f28496G = 0;
            m45279D();
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: x */
    public final void mo43636x() {
        zze.m2645k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f28505z;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f28505z.release();
            this.f28505z = null;
            m45281F(0);
            this.f28504s = 0;
        }
        this.f28501g.mo43773d();
    }

    /* renamed from: y */
    public final void mo43637y(float f, float f2) {
        zzciw zzciw = this.f28494E;
        if (zzciw != null) {
            zzciw.mo43739e(f, f2);
        }
    }
}
