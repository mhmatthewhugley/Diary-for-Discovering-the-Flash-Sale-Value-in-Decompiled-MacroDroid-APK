package kotlin.p312io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007¨\u0006\t"}, mo71668d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "a", "", "c", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.io.a */
/* compiled from: IOStreams.kt */
public final class C13666a {
    /* renamed from: a */
    public static final long m87850a(InputStream inputStream, OutputStream outputStream, int i) {
        C13706o.m87929f(inputStream, "<this>");
        C13706o.m87929f(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m87851b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m87850a(inputStream, outputStream, i);
    }

    /* renamed from: c */
    public static final byte[] m87852c(InputStream inputStream) {
        C13706o.m87929f(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m87851b(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C13706o.m87928e(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
