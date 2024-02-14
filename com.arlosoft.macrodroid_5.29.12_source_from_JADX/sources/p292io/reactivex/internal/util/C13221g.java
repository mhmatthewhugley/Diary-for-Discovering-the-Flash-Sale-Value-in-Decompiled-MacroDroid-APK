package p292io.reactivex.internal.util;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p292io.reactivex.exceptions.CompositeException;

/* renamed from: io.reactivex.internal.util.g */
/* compiled from: ExceptionHelper */
public final class C13221g {

    /* renamed from: a */
    public static final Throwable f61115a = new C13222a();

    /* renamed from: io.reactivex.internal.util.g$a */
    /* compiled from: ExceptionHelper */
    static final class C13222a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        C13222a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m85547a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f61115a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m85548b(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f61115a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: c */
    public static String m85549c(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* renamed from: d */
    public static RuntimeException m85550d(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
