package p431x8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import p245de.greenrobot.event.EventBusException;

/* renamed from: x8.e */
/* compiled from: HandlerPoster */
final class C16862e extends Handler {

    /* renamed from: a */
    private final C16865h f68091a = new C16865h();

    /* renamed from: b */
    private final int f68092b;

    /* renamed from: c */
    private final C16857c f68093c;

    /* renamed from: d */
    private boolean f68094d;

    C16862e(C16857c cVar, Looper looper, int i) {
        super(looper);
        this.f68093c = cVar;
        this.f68092b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo80026a(C16869l lVar, Object obj) {
        C16864g a = C16864g.m99914a(lVar, obj);
        synchronized (this) {
            this.f68091a.mo80028a(a);
            if (!this.f68094d) {
                this.f68094d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C16864g b = this.f68091a.mo80029b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f68091a.mo80029b();
                        if (b == null) {
                            this.f68094d = false;
                            return;
                        }
                    }
                }
                this.f68093c.mo80015e(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f68092b));
            if (sendMessage(obtainMessage())) {
                this.f68094d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f68094d = false;
            throw th;
        }
    }
}
