package p426wc;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, mo71668d2 = {"Lwc/a;", "", "", "httpCode", "I", "b", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "NO_ERROR", "PROTOCOL_ERROR", "INTERNAL_ERROR", "FLOW_CONTROL_ERROR", "SETTINGS_TIMEOUT", "STREAM_CLOSED", "FRAME_SIZE_ERROR", "REFUSED_STREAM", "CANCEL", "COMPRESSION_ERROR", "CONNECT_ERROR", "ENHANCE_YOUR_CALM", "INADEQUATE_SECURITY", "HTTP_1_1_REQUIRED", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.a */
/* compiled from: ErrorCode.kt */
public enum C16794a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: G */
    public static final C16795a f67789G = null;
    private final int httpCode;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo71668d2 = {"Lwc/a$a;", "", "", "code", "Lwc/a;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.a$a */
    /* compiled from: ErrorCode.kt */
    public static final class C16795a {
        private C16795a() {
        }

        public /* synthetic */ C16795a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16794a mo79792a(int i) {
            for (C16794a aVar : C16794a.values()) {
                if (aVar.mo79791b() == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f67789G = new C16795a((C13695i) null);
    }

    private C16794a(int i) {
        this.httpCode = i;
    }

    /* renamed from: b */
    public final int mo79791b() {
        return this.httpCode;
    }
}