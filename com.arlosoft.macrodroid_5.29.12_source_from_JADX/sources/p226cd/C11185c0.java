package p226cd;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000*\n\u0010\u0005\"\u00020\u00042\u00020\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006*\n\u0010\t\"\u00020\b2\u00020\b*\n\u0010\u000b\"\u00020\n2\u00020\n*\n\u0010\r\"\u00020\f2\u00020\f¨\u0006\u000e"}, mo71668d2 = {"", "", "b", "a", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/Closeable;", "Closeable", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/IOException;", "IOException", "okio"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* renamed from: cd.c0 */
/* compiled from: -JvmPlatform.kt */
public final class C11185c0 {
    /* renamed from: a */
    public static final byte[] m75078a(String str) {
        C13706o.m87929f(str, "<this>");
        byte[] bytes = str.getBytes(C15147d.f64349b);
        C13706o.m87928e(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m75079b(byte[] bArr) {
        C13706o.m87929f(bArr, "<this>");
        return new String(bArr, C15147d.f64349b);
    }
}
