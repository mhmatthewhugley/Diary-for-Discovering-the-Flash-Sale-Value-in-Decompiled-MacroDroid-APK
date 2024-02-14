package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbbb implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: o */
    private static final zzbbb f26476o = new zzbbb();

    /* renamed from: a */
    public volatile long f26477a;

    /* renamed from: c */
    private final Handler f26478c;

    /* renamed from: d */
    private final HandlerThread f26479d;

    /* renamed from: f */
    private Choreographer f26480f;

    /* renamed from: g */
    private int f26481g;

    private zzbbb() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f26479d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f26478c = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static zzbbb m43038a() {
        return f26476o;
    }

    /* renamed from: b */
    public final void mo42364b() {
        this.f26478c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo42365c() {
        this.f26478c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f26477a = j;
        this.f26480f.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f26480f = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f26481g + 1;
            this.f26481g = i2;
            if (i2 == 1) {
                this.f26480f.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f26481g - 1;
            this.f26481g = i3;
            if (i3 == 0) {
                this.f26480f.removeFrameCallback(this);
                this.f26477a = 0;
            }
            return true;
        }
    }
}
