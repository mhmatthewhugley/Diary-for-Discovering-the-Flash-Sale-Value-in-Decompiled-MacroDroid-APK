package p452zd;

import java.io.Serializable;
import org.mockito.internal.exceptions.stacktrace.C16077c;
import p301je.C13377c;

/* renamed from: zd.a */
/* compiled from: LocationImpl */
public class C17091a implements C13377c, Serializable {
    private static final long serialVersionUID = -9054861157390980624L;
    private final C16077c stackTraceFilter;
    private final Throwable stackTraceHolder;

    public C17091a() {
        this(new C16077c());
    }

    public String toString() {
        StackTraceElement[] a = this.stackTraceFilter.mo78409a(this.stackTraceHolder.getStackTrace(), false);
        if (a.length == 0) {
            return "-> at <<unknown line>>";
        }
        return "-> at " + a[0].toString();
    }

    public C17091a(C16077c cVar) {
        this(cVar, new Throwable());
    }

    private C17091a(C16077c cVar, Throwable th) {
        this.stackTraceFilter = cVar;
        this.stackTraceHolder = th;
    }
}
