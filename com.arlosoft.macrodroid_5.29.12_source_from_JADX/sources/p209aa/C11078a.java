package p209aa;

import p292io.reactivex.internal.util.C13221g;

/* renamed from: aa.a */
/* compiled from: Exceptions */
public final class C11078a {
    /* renamed from: a */
    public static RuntimeException m74638a(Throwable th) {
        throw C13221g.m85550d(th);
    }

    /* renamed from: b */
    public static void m74639b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
