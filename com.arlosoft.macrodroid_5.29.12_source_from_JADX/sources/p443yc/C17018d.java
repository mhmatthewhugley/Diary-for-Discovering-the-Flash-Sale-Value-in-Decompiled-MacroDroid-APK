package p443yc;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, mo71668d2 = {"Lyc/d;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lja/u;", "publish", "flush", "close", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: yc.d */
/* compiled from: AndroidLog.kt */
public final class C17018d extends Handler {

    /* renamed from: a */
    public static final C17018d f68402a = new C17018d();

    private C17018d() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        C13706o.m87929f(logRecord, "record");
        C17017c cVar = C17017c.f68401c;
        String loggerName = logRecord.getLoggerName();
        C13706o.m87928e(loggerName, "record.loggerName");
        int a = C17019e.m100299b(logRecord);
        String message = logRecord.getMessage();
        C13706o.m87928e(message, "record.message");
        cVar.mo80255a(loggerName, a, message, logRecord.getThrown());
    }
}
