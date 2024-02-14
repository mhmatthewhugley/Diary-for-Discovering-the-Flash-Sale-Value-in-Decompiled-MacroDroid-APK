package p424wa;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C13603n0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, mo71668d2 = {"Lwa/d;", "Lkotlin/collections/n0;", "", "hasNext", "", "nextInt", "first", "last", "step", "<init>", "(III)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: wa.d */
/* compiled from: ProgressionIterators.kt */
public final class C16787d extends C13603n0 {

    /* renamed from: a */
    private final int f67764a;

    /* renamed from: c */
    private final int f67765c;

    /* renamed from: d */
    private boolean f67766d;

    /* renamed from: f */
    private int f67767f;

    public C16787d(int i, int i2, int i3) {
        this.f67764a = i3;
        this.f67765c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f67766d = z;
        this.f67767f = !z ? i2 : i;
    }

    public boolean hasNext() {
        return this.f67766d;
    }

    public int nextInt() {
        int i = this.f67767f;
        if (i != this.f67765c) {
            this.f67767f = this.f67764a + i;
        } else if (this.f67766d) {
            this.f67766d = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
