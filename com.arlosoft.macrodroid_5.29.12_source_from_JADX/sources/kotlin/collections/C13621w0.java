package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0006J \u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo71668d2 = {"Lkotlin/collections/w0;", "T", "Lkotlin/collections/e;", "", "index", "get", "(I)Ljava/lang/Object;", "Lja/u;", "clear", "d", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "", "a", "Ljava/util/List;", "delegate", "c", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.w0 */
/* compiled from: ReversedViews.kt */
final class C13621w0<T> extends C13578e<T> {

    /* renamed from: a */
    private final List<T> f61891a;

    public C13621w0(List<T> list) {
        C13706o.m87929f(list, "delegate");
        this.f61891a = list;
    }

    public void add(int i, T t) {
        this.f61891a.add(C13626z.m87805J(this, i), t);
    }

    /* renamed from: c */
    public int mo70884c() {
        return this.f61891a.size();
    }

    public void clear() {
        this.f61891a.clear();
    }

    /* renamed from: d */
    public T mo70886d(int i) {
        return this.f61891a.remove(C13626z.m87804I(this, i));
    }

    public T get(int i) {
        return this.f61891a.get(C13626z.m87804I(this, i));
    }

    public T set(int i, T t) {
        return this.f61891a.set(C13626z.m87804I(this, i), t);
    }
}
