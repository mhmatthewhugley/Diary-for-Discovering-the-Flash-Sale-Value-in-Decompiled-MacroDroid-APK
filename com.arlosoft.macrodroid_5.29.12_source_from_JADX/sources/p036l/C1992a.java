package p036l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, mo71668d2 = {"Ll/a;", "", "Ljava/util/concurrent/Executor;", "a", "diskIO", "networkIO", "mainThread", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "()V", "maildroidx_release"}, mo71669k = 1, mo71670mv = {1, 4, 2})
/* renamed from: l.a */
/* compiled from: AppExecutors.kt */
public class C1992a {

    /* renamed from: a */
    private final Executor f6071a;

    /* renamed from: b */
    private final Executor f6072b;

    /* renamed from: c */
    private final Executor f6073c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo71668d2 = {"Ll/a$a;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lja/u;", "execute", "<init>", "()V", "maildroidx_release"}, mo71669k = 1, mo71670mv = {1, 4, 2})
    /* renamed from: l.a$a */
    /* compiled from: AppExecutors.kt */
    private static final class C1993a implements Executor {

        /* renamed from: a */
        private final Handler f6074a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            C13706o.m87929f(runnable, "command");
            this.f6074a.post(runnable);
        }
    }

    public C1992a(Executor executor, Executor executor2, Executor executor3) {
        C13706o.m87929f(executor, "diskIO");
        C13706o.m87929f(executor2, "networkIO");
        C13706o.m87929f(executor3, "mainThread");
        this.f6071a = executor;
        this.f6072b = executor2;
        this.f6073c = executor3;
    }

    /* renamed from: a */
    public final Executor mo24000a() {
        return this.f6071a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1992a() {
        /*
            r3 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r1 = "Executors.newSingleThreadExecutor()"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            r1 = 3
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            java.lang.String r2 = "Executors.newFixedThreadPool(3)"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            l.a$a r2 = new l.a$a
            r2.<init>()
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p036l.C1992a.<init>():void");
    }
}
