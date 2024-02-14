package p090f5;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: f5.e */
/* compiled from: Executors */
public final class C7308e {

    /* renamed from: a */
    private static final Executor f17884a = new C7309a();

    /* renamed from: b */
    private static final Executor f17885b = new C7310b();

    /* renamed from: f5.e$a */
    /* compiled from: Executors */
    class C7309a implements Executor {

        /* renamed from: a */
        private final Handler f17886a = new Handler(Looper.getMainLooper());

        C7309a() {
        }

        public void execute(@NonNull Runnable runnable) {
            this.f17886a.post(runnable);
        }
    }

    /* renamed from: f5.e$b */
    /* compiled from: Executors */
    class C7310b implements Executor {
        C7310b() {
        }

        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m30185a() {
        return f17885b;
    }

    /* renamed from: b */
    public static Executor m30186b() {
        return f17884a;
    }
}
