package p292io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p292io.grpc.C12544c0;
import p292io.grpc.C12554e;
import p292io.grpc.C12560f0;

/* renamed from: io.grpc.internal.o */
/* compiled from: ChannelTracer */
final class C12746o {

    /* renamed from: f */
    static final Logger f60021f = Logger.getLogger(C12554e.class.getName());

    /* renamed from: a */
    private final Object f60022a = new Object();

    /* renamed from: b */
    private final C12560f0 f60023b;

    /* renamed from: c */
    private final Collection<C12544c0> f60024c;

    /* renamed from: d */
    private final long f60025d;

    /* renamed from: e */
    private int f60026e;

    /* renamed from: io.grpc.internal.o$a */
    /* compiled from: ChannelTracer */
    class C12747a extends ArrayDeque<C12544c0> {
        final /* synthetic */ int val$maxEvents;

        C12747a(int i) {
            this.val$maxEvents = i;
        }

        /* renamed from: c */
        public boolean add(C12544c0 c0Var) {
            if (size() == this.val$maxEvents) {
                removeFirst();
            }
            C12746o.m84352a(C12746o.this);
            return super.add(c0Var);
        }
    }

    /* renamed from: io.grpc.internal.o$b */
    /* compiled from: ChannelTracer */
    static /* synthetic */ class C12748b {

        /* renamed from: a */
        static final /* synthetic */ int[] f60027a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.grpc.c0$b[] r0 = p292io.grpc.C12544c0.C12546b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60027a = r0
                io.grpc.c0$b r1 = p292io.grpc.C12544c0.C12546b.CT_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60027a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.c0$b r1 = p292io.grpc.C12544c0.C12546b.CT_WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p292io.grpc.internal.C12746o.C12748b.<clinit>():void");
        }
    }

    C12746o(C12560f0 f0Var, int i, long j, String str) {
        Preconditions.m5393t(str, "description");
        this.f60023b = (C12560f0) Preconditions.m5393t(f0Var, "logId");
        if (i > 0) {
            this.f60024c = new C12747a(i);
        } else {
            this.f60024c = null;
        }
        this.f60025d = j;
        C12544c0.C12545a aVar = new C12544c0.C12545a();
        mo69477e(aVar.mo69101b(str + " created").mo69102c(C12544c0.C12546b.CT_INFO).mo69104e(j).mo69100a());
    }

    /* renamed from: a */
    static /* synthetic */ int m84352a(C12746o oVar) {
        int i = oVar.f60026e;
        oVar.f60026e = i + 1;
        return i;
    }

    /* renamed from: d */
    static void m84353d(C12560f0 f0Var, Level level, String str) {
        Logger logger = f60021f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + f0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C12560f0 mo69475b() {
        return this.f60023b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo69476c() {
        boolean z;
        synchronized (this.f60022a) {
            z = this.f60024c != null;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo69477e(C12544c0 c0Var) {
        Level level;
        int i = C12748b.f60027a[c0Var.f59463b.ordinal()];
        if (i == 1) {
            level = Level.FINE;
        } else if (i != 2) {
            level = Level.FINEST;
        } else {
            level = Level.FINER;
        }
        mo69478f(c0Var);
        m84353d(this.f60023b, level, c0Var.f59462a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo69478f(C12544c0 c0Var) {
        synchronized (this.f60022a) {
            Collection<C12544c0> collection = this.f60024c;
            if (collection != null) {
                collection.add(c0Var);
            }
        }
    }
}
