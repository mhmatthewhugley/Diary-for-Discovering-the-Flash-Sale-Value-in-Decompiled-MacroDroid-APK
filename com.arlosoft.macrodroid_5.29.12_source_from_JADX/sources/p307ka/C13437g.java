package p307ka;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C13576d;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, mo71668d2 = {"Lka/g;", "V", "", "Lkotlin/collections/d;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "Lja/u;", "clear", "", "iterator", "remove", "removeAll", "retainAll", "", "c", "()I", "size", "Lka/d;", "backing", "<init>", "(Lka/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.g */
/* compiled from: MapBuilder.kt */
public final class C13437g<V> extends C13576d<V> {

    /* renamed from: a */
    private final C13428d<?, V> f61513a;

    public C13437g(C13428d<?, V> dVar) {
        C13706o.m87929f(dVar, "backing");
        this.f61513a = dVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends V> collection) {
        C13706o.m87929f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public int mo70986c() {
        return this.f61513a.size();
    }

    public void clear() {
        this.f61513a.clear();
    }

    public boolean contains(Object obj) {
        return this.f61513a.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f61513a.isEmpty();
    }

    public Iterator<V> iterator() {
        return this.f61513a.mo70920Q();
    }

    public boolean remove(Object obj) {
        return this.f61513a.mo70919P(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.f61513a.mo70931j();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.f61513a.mo70931j();
        return super.retainAll(collection);
    }
}
