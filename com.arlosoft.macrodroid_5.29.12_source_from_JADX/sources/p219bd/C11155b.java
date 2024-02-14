package p219bd;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p226cd.C11179b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, mo71668d2 = {"Lcd/b;", "", "a", "okhttp-logging-interceptor"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: bd.b */
/* compiled from: utf8.kt */
public final class C11155b {
    /* renamed from: a */
    public static final boolean m74906a(C11179b bVar) {
        C13706o.m87929f(bVar, "$this$isProbablyUtf8");
        try {
            C11179b bVar2 = new C11179b();
            bVar.mo62433g(bVar2, 0, C16792h.m99543e(bVar.mo62399D(), 64));
            for (int i = 0; i < 16; i++) {
                if (bVar2.mo62469x1()) {
                    return true;
                }
                int B = bVar2.mo62397B();
                if (Character.isISOControl(B) && !Character.isWhitespace(B)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
