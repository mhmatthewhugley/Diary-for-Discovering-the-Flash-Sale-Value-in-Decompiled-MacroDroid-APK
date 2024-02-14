package p295j8;

import android.os.HandlerThread;
import androidx.annotation.NonNull;
import p276h8.C12406a;

/* renamed from: j8.f */
/* compiled from: ThreadUtil */
public final class C13307f {

    /* renamed from: j8.f$a */
    /* compiled from: ThreadUtil */
    public enum C13308a {
        AUDIO(-16),
        BACKGROUND(10),
        DEFAULT(0),
        DISPLAY(-4),
        FOREGROUND(-2),
        LESS_FAVORABLE(1),
        LOWEST(19),
        MORE_FAVORABLE(-1),
        URGENT_AUDIO(-19),
        URGENT_DISPLAY(-8);
        
        private final int mPriority;

        private C13308a(int i) {
            this.mPriority = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo70135b() {
            return this.mPriority;
        }
    }

    @NonNull
    /* renamed from: a */
    public static HandlerThread m85642a(@NonNull String str, @NonNull C13308a aVar) {
        C12406a.m83259c(str, "threadName");
        C12406a.m83260d(aVar, "threadPriority");
        HandlerThread handlerThread = new HandlerThread(str, aVar.mo70135b());
        handlerThread.start();
        return handlerThread;
    }
}
