package kotlin.p312io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo71668d2 = {"Ljava/io/File;", "", "a", "(Ljava/io/File;)Ljava/lang/String;", "nameWithoutExtension", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.g */
/* compiled from: Utils.kt */
class C13672g extends C13671f {
    /* renamed from: a */
    public static String m87855a(File file) {
        C13706o.m87929f(file, "<this>");
        String name = file.getName();
        C13706o.m87928e(name, "name");
        return C15177w.m93670Q0(name, ".", (String) null, 2, (Object) null);
    }
}
