package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo71668d2 = {"", "", "k", "(Ljava/lang/String;)Ljava/lang/Float;", "", "j", "(Ljava/lang/String;)Ljava/lang/Double;", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.t */
/* compiled from: StringNumberConversionsJVM.kt */
class C15174t extends C15173s {
    /* renamed from: j */
    public static Double m93620j(String str) {
        C13706o.m87929f(str, "<this>");
        try {
            if (C15164l.f64379b.mo74468c(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static Float m93621k(String str) {
        C13706o.m87929f(str, "<this>");
        try {
            if (C15164l.f64379b.mo74468c(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
