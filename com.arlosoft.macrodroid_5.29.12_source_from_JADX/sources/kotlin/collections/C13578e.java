package kotlin.collections;

import java.util.AbstractList;
import kotlin.Metadata;
import p379ra.C16371d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo71668d2 = {"Lkotlin/collections/e;", "E", "", "Ljava/util/AbstractList;", "", "index", "d", "(I)Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.e */
/* compiled from: AbstractMutableList.kt */
public abstract class C13578e<E> extends AbstractList<E> implements C16371d {
    protected C13578e() {
    }

    /* renamed from: c */
    public abstract int mo70884c();

    /* renamed from: d */
    public abstract E mo70886d(int i);

    public final /* bridge */ E remove(int i) {
        return mo70886d(i);
    }

    public final /* bridge */ int size() {
        return mo70884c();
    }
}
