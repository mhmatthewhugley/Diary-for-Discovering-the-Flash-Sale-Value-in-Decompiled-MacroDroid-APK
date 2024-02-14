package androidx.core.util;

import android.util.AtomicFile;
import androidx.annotation.RequiresApi;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C13705n;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\bø\u0001\u0000\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007\u001a\r\u0010\u000e\u001a\u00020\u0006*\u00020\u0000H\b\u001a\u0016\u0010\u000f\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0010"}, mo71668d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lja/u;", "block", "tryWrite", "", "array", "writeBytes", "", "text", "Ljava/nio/charset/Charset;", "charset", "writeText", "readBytes", "readText", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: AtomicFile.kt */
public final class AtomicFileKt {
    @RequiresApi(17)
    public static final byte[] readBytes(AtomicFile atomicFile) {
        C13706o.m87929f(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        C13706o.m87928e(readFully, "readFully()");
        return readFully;
    }

    @RequiresApi(17)
    public static final String readText(AtomicFile atomicFile, Charset charset) {
        C13706o.m87929f(atomicFile, "<this>");
        C13706o.m87929f(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        C13706o.m87928e(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String readText$default(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C15147d.f64349b;
        }
        return readText(atomicFile, charset);
    }

    @RequiresApi(17)
    public static final void tryWrite(AtomicFile atomicFile, C16265l<? super FileOutputStream, C13339u> lVar) {
        C13706o.m87929f(atomicFile, "<this>");
        C13706o.m87929f(lVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            C13706o.m87928e(startWrite, "stream");
            lVar.invoke(startWrite);
            C13705n.m87922b(1);
            atomicFile.finishWrite(startWrite);
            C13705n.m87921a(1);
        } catch (Throwable th) {
            C13705n.m87922b(1);
            atomicFile.failWrite(startWrite);
            C13705n.m87921a(1);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeBytes(AtomicFile atomicFile, byte[] bArr) {
        C13706o.m87929f(atomicFile, "<this>");
        C13706o.m87929f(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            C13706o.m87928e(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeText(AtomicFile atomicFile, String str, Charset charset) {
        C13706o.m87929f(atomicFile, "<this>");
        C13706o.m87929f(str, "text");
        C13706o.m87929f(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C15147d.f64349b;
        }
        writeText(atomicFile, str, charset);
    }
}
