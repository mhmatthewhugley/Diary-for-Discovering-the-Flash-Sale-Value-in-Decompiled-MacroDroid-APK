package p419ve;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/* renamed from: ve.c */
/* compiled from: IOUtils */
public class C16773c {

    /* renamed from: a */
    public static final char f67729a = File.separatorChar;

    /* renamed from: b */
    public static final String f67730b;

    static {
        C16774d dVar = new C16774d(4);
        PrintWriter printWriter = new PrintWriter(dVar);
        printWriter.println();
        f67730b = dVar.toString();
        printWriter.close();
    }

    /* renamed from: a */
    public static void m99482a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m99483b(InputStream inputStream) {
        m99482a(inputStream);
    }

    /* renamed from: c */
    public static void m99484c(OutputStream outputStream) {
        m99482a(outputStream);
    }

    /* renamed from: d */
    public static int m99485d(InputStream inputStream, OutputStream outputStream) throws IOException {
        long e = m99486e(inputStream, outputStream);
        if (e > 2147483647L) {
            return -1;
        }
        return (int) e;
    }

    /* renamed from: e */
    public static long m99486e(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m99487f(inputStream, outputStream, new byte[4096]);
    }

    /* renamed from: f */
    public static long m99487f(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
