package p360p9;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p226cd.C11179b;
import p226cd.C11188e;
import p369q9.C16236a;
import p369q9.C16240d;
import p369q9.C16252i;

/* renamed from: p9.i */
/* compiled from: OkHttpFrameLogger */
class C16132i {

    /* renamed from: a */
    private final Logger f66237a;

    /* renamed from: b */
    private final Level f66238b;

    /* renamed from: p9.i$a */
    /* compiled from: OkHttpFrameLogger */
    enum C16133a {
        INBOUND,
        OUTBOUND
    }

    /* renamed from: p9.i$b */
    /* compiled from: OkHttpFrameLogger */
    private enum C16134b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        
        private final int bit;

        private C16134b(int i) {
            this.bit = i;
        }

        /* renamed from: b */
        public int mo78517b() {
            return this.bit;
        }
    }

    C16132i(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    /* renamed from: a */
    private boolean m96906a() {
        return this.f66237a.isLoggable(this.f66238b);
    }

    /* renamed from: l */
    private static String m96907l(C11179b bVar) {
        if (bVar.mo62399D() <= 64) {
            return bVar.mo62400E().mo62502m();
        }
        int min = (int) Math.min(bVar.mo62399D(), 64);
        return bVar.mo62402G(min).mo62502m() + "...";
    }

    /* renamed from: m */
    private static String m96908m(C16252i iVar) {
        EnumMap enumMap = new EnumMap(C16134b.class);
        for (C16134b bVar : C16134b.values()) {
            if (iVar.mo78769d(bVar.mo78517b())) {
                enumMap.put(bVar, Integer.valueOf(iVar.mo78766a(bVar.mo78517b())));
            }
        }
        return enumMap.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78507b(C16133a aVar, int i, C11179b bVar, int i2, boolean z) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + m96907l(bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo78508c(C16133a aVar, int i, C16236a aVar2, C11188e eVar) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " GO_AWAY: lastStreamId=" + i + " errorCode=" + aVar2 + " length=" + eVar.mo62485C() + " bytes=" + m96907l(new C11179b().mo62419V(eVar)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo78509d(C16133a aVar, int i, List<C16240d> list, boolean z) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " HEADERS: streamId=" + i + " headers=" + list + " endStream=" + z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo78510e(C16133a aVar, long j) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " PING: ack=false bytes=" + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo78511f(C16133a aVar, long j) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " PING: ack=true bytes=" + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo78512g(C16133a aVar, int i, int i2, List<C16240d> list) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo78513h(C16133a aVar, int i, C16236a aVar2) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " RST_STREAM: streamId=" + i + " errorCode=" + aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo78514i(C16133a aVar, C16252i iVar) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " SETTINGS: ack=false settings=" + m96908m(iVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo78515j(C16133a aVar) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " SETTINGS: ack=true");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo78516k(C16133a aVar, int i, long j) {
        if (m96906a()) {
            Logger logger = this.f66237a;
            Level level = this.f66238b;
            logger.log(level, aVar + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }

    @VisibleForTesting
    C16132i(Level level, Logger logger) {
        this.f66238b = (Level) Preconditions.m5393t(level, "level");
        this.f66237a = (Logger) Preconditions.m5393t(logger, "logger");
    }
}
