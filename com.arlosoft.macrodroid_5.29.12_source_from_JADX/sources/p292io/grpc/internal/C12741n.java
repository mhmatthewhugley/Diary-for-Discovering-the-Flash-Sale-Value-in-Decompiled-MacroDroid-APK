package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.text.MessageFormat;
import java.util.logging.Level;
import p292io.grpc.C12544c0;
import p292io.grpc.C12554e;
import p292io.grpc.C12560f0;

/* renamed from: io.grpc.internal.n */
/* compiled from: ChannelLoggerImpl */
final class C12741n extends C12554e {

    /* renamed from: a */
    private final C12746o f60009a;

    /* renamed from: b */
    private final C12700h2 f60010b;

    /* renamed from: io.grpc.internal.n$a */
    /* compiled from: ChannelLoggerImpl */
    static /* synthetic */ class C12742a {

        /* renamed from: a */
        static final /* synthetic */ int[] f60011a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.grpc.e$a[] r0 = p292io.grpc.C12554e.C12555a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60011a = r0
                io.grpc.e$a r1 = p292io.grpc.C12554e.C12555a.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60011a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.e$a r1 = p292io.grpc.C12554e.C12555a.WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12741n.C12742a.<clinit>():void");
        }
    }

    C12741n(C12746o oVar, C12700h2 h2Var) {
        this.f60009a = (C12746o) Preconditions.m5393t(oVar, "tracer");
        this.f60010b = (C12700h2) Preconditions.m5393t(h2Var, "time");
    }

    /* renamed from: c */
    private boolean m84340c(C12554e.C12555a aVar) {
        return aVar != C12554e.C12555a.DEBUG && this.f60009a.mo69476c();
    }

    /* renamed from: d */
    static void m84341d(C12560f0 f0Var, C12554e.C12555a aVar, String str) {
        Level f = m84343f(aVar);
        if (C12746o.f60021f.isLoggable(f)) {
            C12746o.m84353d(f0Var, f, str);
        }
    }

    /* renamed from: e */
    static void m84342e(C12560f0 f0Var, C12554e.C12555a aVar, String str, Object... objArr) {
        Level f = m84343f(aVar);
        if (C12746o.f60021f.isLoggable(f)) {
            C12746o.m84353d(f0Var, f, MessageFormat.format(str, objArr));
        }
    }

    /* renamed from: f */
    private static Level m84343f(C12554e.C12555a aVar) {
        int i = C12742a.f60011a[aVar.ordinal()];
        if (i == 1) {
            return Level.FINE;
        }
        if (i != 2) {
            return Level.FINEST;
        }
        return Level.FINER;
    }

    /* renamed from: g */
    private static C12544c0.C12546b m84344g(C12554e.C12555a aVar) {
        int i = C12742a.f60011a[aVar.ordinal()];
        if (i == 1) {
            return C12544c0.C12546b.CT_ERROR;
        }
        if (i != 2) {
            return C12544c0.C12546b.CT_INFO;
        }
        return C12544c0.C12546b.CT_WARNING;
    }

    /* renamed from: h */
    private void m84345h(C12554e.C12555a aVar, String str) {
        if (aVar != C12554e.C12555a.DEBUG) {
            this.f60009a.mo69478f(new C12544c0.C12545a().mo69101b(str).mo69102c(m84344g(aVar)).mo69104e(this.f60010b.mo69418a()).mo69100a());
        }
    }

    /* renamed from: a */
    public void mo69126a(C12554e.C12555a aVar, String str) {
        m84341d(this.f60009a.mo69475b(), aVar, str);
        if (m84340c(aVar)) {
            m84345h(aVar, str);
        }
    }

    /* renamed from: b */
    public void mo69127b(C12554e.C12555a aVar, String str, Object... objArr) {
        String str2;
        Level f = m84343f(aVar);
        if (m84340c(aVar) || C12746o.f60021f.isLoggable(f)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        mo69126a(aVar, str2);
    }
}
