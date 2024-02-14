package p244dd;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p226cd.C11209v;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¨\u0006\t"}, mo71668d2 = {"", "", "value", "fromIndex", "toIndex", "a", "Lcd/v;", "pos", "b", "okio"}, mo71669k = 2, mo71670mv = {1, 5, 1})
/* renamed from: dd.c */
/* compiled from: -SegmentedByteString.kt */
public final class C12014c {
    /* renamed from: a */
    public static final int m82462a(int[] iArr, int i, int i2, int i3) {
        C13706o.m87929f(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m82463b(C11209v vVar, int i) {
        C13706o.m87929f(vVar, "<this>");
        int a = m82462a(vVar.mo62567J(), i + 1, 0, vVar.mo62568L().length);
        return a >= 0 ? a : ~a;
    }
}
