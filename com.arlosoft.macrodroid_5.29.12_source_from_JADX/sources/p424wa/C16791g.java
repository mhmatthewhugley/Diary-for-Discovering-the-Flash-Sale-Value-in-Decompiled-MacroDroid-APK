package p424wa;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, mo71668d2 = {"", "isPositive", "", "step", "Lja/u;", "a", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/ranges/RangesKt")
/* renamed from: wa.g */
/* compiled from: Ranges.kt */
class C16791g {
    /* renamed from: a */
    public static final void m99539a(boolean z, Number number) {
        C13706o.m87929f(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + FilenameUtils.EXTENSION_SEPARATOR);
        }
    }
}
