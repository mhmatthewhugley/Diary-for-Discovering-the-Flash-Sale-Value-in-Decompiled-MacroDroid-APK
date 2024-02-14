package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.internal.a1 */
/* compiled from: LogExceptionRunnable */
public final class C12595a1 implements Runnable {

    /* renamed from: c */
    private static final Logger f59579c = Logger.getLogger(C12595a1.class.getName());

    /* renamed from: a */
    private final Runnable f59580a;

    public C12595a1(Runnable runnable) {
        this.f59580a = (Runnable) Preconditions.m5393t(runnable, "task");
    }

    public void run() {
        try {
            this.f59580a.run();
        } catch (Throwable th) {
            Logger logger = f59579c;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + this.f59580a, th);
            Throwables.m5493p(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f59580a + ")";
    }
}
