package p226cd;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0007H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH&J\b\u0010!\u001a\u00020 H&J\u0010\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007H&J\u0010\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020$H&J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0014H&J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0014H&J\b\u0010+\u001a\u00020\u0000H&J\b\u0010-\u001a\u00020,H&R\u0014\u00100\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, mo71668d2 = {"Lcd/d;", "Lcd/y;", "Ljava/nio/channels/ReadableByteChannel;", "Lcd/b;", "T", "", "x1", "", "byteCount", "Lja/u;", "W0", "request", "", "readByte", "", "readShort", "", "readInt", "j2", "skip", "Lcd/e;", "S1", "i1", "Lcd/o;", "options", "U1", "", "v1", "H0", "Lcd/w;", "sink", "L0", "", "F0", "limit", "i0", "Ljava/nio/charset/Charset;", "charset", "L1", "bytes", "a0", "targetBytes", "o0", "peek", "Ljava/io/InputStream;", "k2", "getBuffer", "()Lcd/b;", "buffer", "okio"}, mo71669k = 1, mo71670mv = {1, 5, 1})
/* renamed from: cd.d */
/* compiled from: BufferedSource.kt */
public interface C11186d extends C11212y, ReadableByteChannel {
    /* renamed from: F0 */
    String mo62401F0() throws IOException;

    /* renamed from: H0 */
    byte[] mo62404H0(long j) throws IOException;

    /* renamed from: L0 */
    long mo62408L0(C11210w wVar) throws IOException;

    /* renamed from: L1 */
    String mo62409L1(Charset charset) throws IOException;

    /* renamed from: S1 */
    C11188e mo62415S1() throws IOException;

    /* renamed from: T */
    C11179b mo62416T();

    /* renamed from: U1 */
    int mo62418U1(C11199o oVar) throws IOException;

    /* renamed from: W0 */
    void mo62420W0(long j) throws IOException;

    /* renamed from: a0 */
    long mo62422a0(C11188e eVar) throws IOException;

    C11179b getBuffer();

    /* renamed from: i0 */
    String mo62437i0(long j) throws IOException;

    /* renamed from: i1 */
    C11188e mo62438i1(long j) throws IOException;

    /* renamed from: j2 */
    long mo62441j2() throws IOException;

    /* renamed from: k2 */
    InputStream mo62442k2();

    /* renamed from: o0 */
    long mo62444o0(C11188e eVar) throws IOException;

    C11186d peek();

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: v1 */
    byte[] mo62461v1() throws IOException;

    /* renamed from: x1 */
    boolean mo62469x1() throws IOException;
}
