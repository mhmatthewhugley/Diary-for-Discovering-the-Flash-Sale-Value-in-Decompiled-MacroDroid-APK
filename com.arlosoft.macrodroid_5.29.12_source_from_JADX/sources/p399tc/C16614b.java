package p399tc;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, mo71668d2 = {"Ltc/a;", "task", "Ltc/d;", "queue", "", "message", "Lja/u;", "c", "", "ns", "b", "okhttp"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: tc.b */
/* compiled from: TaskLogger.kt */
public final class C16614b {
    /* renamed from: b */
    public static final String m98954b(long j) {
        String str;
        if (j <= ((long) -999500000)) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= ((long) -999500)) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < ((long) 999500)) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < ((long) 999500000)) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        C13696i0 i0Var = C13696i0.f61931a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C13706o.m87928e(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m98955c(C16613a aVar, C16616d dVar, String str) {
        Logger a = C16617e.f67467j.mo79497a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.mo79479f());
        sb.append(' ');
        C13696i0 i0Var = C13696i0.f61931a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C13706o.m87928e(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.mo79468b());
        a.fine(sb.toString());
    }
}
