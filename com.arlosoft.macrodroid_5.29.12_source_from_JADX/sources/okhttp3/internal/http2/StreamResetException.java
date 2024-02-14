package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p426wc.C16794a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "Lwc/a;", "errorCode", "<init>", "(Lwc/a;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: StreamResetException.kt */
public final class StreamResetException extends IOException {
    public final C16794a errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(C16794a aVar) {
        super("stream was reset: " + aVar);
        C13706o.m87929f(aVar, "errorCode");
        this.errorCode = aVar;
    }
}
