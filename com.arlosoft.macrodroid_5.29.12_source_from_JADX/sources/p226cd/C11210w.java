package p226cd;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, mo71668d2 = {"Lcd/w;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lcd/b;", "source", "", "byteCount", "Lja/u;", "X", "flush", "Lcd/z;", "q", "close", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.w */
/* compiled from: Sink.kt */
public interface C11210w extends Closeable, Flushable {
    /* renamed from: X */
    void mo62384X(C11179b bVar, long j) throws IOException;

    void close() throws IOException;

    void flush() throws IOException;

    /* renamed from: q */
    C11213z mo62388q();
}
