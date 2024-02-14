package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C13604o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/jvm/internal/a;", "Lkotlin/collections/o;", "", "hasNext", "nextBoolean", "", "a", "[Z", "array", "", "c", "I", "index", "<init>", "([Z)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.jvm.internal.a */
/* compiled from: ArrayIterators.kt */
final class C13677a extends C13604o {

    /* renamed from: a */
    private final boolean[] f61915a;

    /* renamed from: c */
    private int f61916c;

    public C13677a(boolean[] zArr) {
        C13706o.m87929f(zArr, "array");
        this.f61915a = zArr;
    }

    public boolean hasNext() {
        return this.f61916c < this.f61915a.length;
    }

    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.f61915a;
            int i = this.f61916c;
            this.f61916c = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f61916c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
