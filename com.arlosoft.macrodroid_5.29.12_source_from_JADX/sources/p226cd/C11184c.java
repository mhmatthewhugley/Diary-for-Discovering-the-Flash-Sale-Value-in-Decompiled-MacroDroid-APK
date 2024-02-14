package p226cd;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tH&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001f\u001a\u00020\u001eH&R\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, mo71668d2 = {"Lcd/c;", "Lcd/w;", "Ljava/nio/channels/WritableByteChannel;", "Lcd/e;", "byteString", "V", "", "source", "write", "", "offset", "byteCount", "Lcd/y;", "", "A1", "", "string", "s0", "beginIndex", "endIndex", "v0", "b", "writeByte", "s", "writeShort", "i", "writeInt", "v", "a1", "R1", "Lja/u;", "flush", "Lcd/b;", "getBuffer", "()Lcd/b;", "buffer", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.c */
/* compiled from: BufferedSink.kt */
public interface C11184c extends C11210w, WritableByteChannel {
    /* renamed from: A1 */
    long mo62396A1(C11212y yVar) throws IOException;

    /* renamed from: R1 */
    C11184c mo62413R1(long j) throws IOException;

    /* renamed from: V */
    C11184c mo62419V(C11188e eVar) throws IOException;

    /* renamed from: a1 */
    C11184c mo62423a1(long j) throws IOException;

    void flush() throws IOException;

    C11179b getBuffer();

    /* renamed from: s0 */
    C11184c mo62455s0(String str) throws IOException;

    /* renamed from: v0 */
    C11184c mo62460v0(String str, int i, int i2) throws IOException;

    C11184c write(byte[] bArr) throws IOException;

    C11184c write(byte[] bArr, int i, int i2) throws IOException;

    C11184c writeByte(int i) throws IOException;

    C11184c writeInt(int i) throws IOException;

    C11184c writeShort(int i) throws IOException;
}
