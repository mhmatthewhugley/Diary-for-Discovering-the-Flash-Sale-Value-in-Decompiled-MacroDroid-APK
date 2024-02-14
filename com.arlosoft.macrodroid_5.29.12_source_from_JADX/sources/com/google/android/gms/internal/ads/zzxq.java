package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzxq implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: o */
    private static final zzxq f38905o = new zzxq();

    /* renamed from: a */
    public volatile long f38906a = -9223372036854775807L;

    /* renamed from: c */
    private final Handler f38907c;

    /* renamed from: d */
    private final HandlerThread f38908d;

    /* renamed from: f */
    private Choreographer f38909f;

    /* renamed from: g */
    private int f38910g;

    private zzxq() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f38908d = handlerThread;
        handlerThread.start();
        Handler c = zzen.m49156c(handlerThread.getLooper(), this);
        this.f38907c = c;
        c.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static zzxq m55374a() {
        return f38905o;
    }

    /* renamed from: b */
    public final void mo48398b() {
        this.f38907c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo48399c() {
        this.f38907c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f38906a = j;
        Choreographer choreographer = this.f38909f;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.f38909f = Choreographer.getInstance();
            } catch (RuntimeException e) {
                zzdw.m48256f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.f38909f;
            if (choreographer != null) {
                int i2 = this.f38910g + 1;
                this.f38910g = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.f38909f;
            if (choreographer2 != null) {
                int i3 = this.f38910g - 1;
                this.f38910g = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f38906a = -9223372036854775807L;
                }
            }
            return true;
        }
    }
}
