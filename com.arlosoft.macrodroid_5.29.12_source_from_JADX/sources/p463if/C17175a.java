package p463if;

import java.util.HashSet;
import java.util.List;
import p459ef.C17156d;
import p473rx.exceptions.CompositeException;
import p473rx.exceptions.OnCompletedFailedException;
import p473rx.exceptions.OnErrorFailedException;
import p473rx.exceptions.OnErrorNotImplementedException;
import p473rx.exceptions.OnErrorThrowable;

/* renamed from: if.a */
/* compiled from: Exceptions */
public final class C17175a {
    /* renamed from: a */
    public static void m100681a(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i < 25) {
                th = th.getCause();
                if (!hashSet.contains(th.getCause())) {
                    hashSet.add(th.getCause());
                    i = i2;
                }
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static Throwable m100682b(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    /* renamed from: c */
    public static void m100683c(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            } else {
                throw new CompositeException(list);
            }
        }
    }

    /* renamed from: d */
    public static void m100684d(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        } else if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        } else if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: e */
    public static void m100685e(Throwable th, C17156d<?> dVar) {
        m100684d(th);
        dVar.onError(th);
    }

    /* renamed from: f */
    public static void m100686f(Throwable th, C17156d<?> dVar, Object obj) {
        m100684d(th);
        dVar.onError(OnErrorThrowable.m101032a(th, obj));
    }
}
