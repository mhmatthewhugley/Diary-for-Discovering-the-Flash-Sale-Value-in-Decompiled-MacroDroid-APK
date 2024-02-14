package p307ka;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C13580f;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, mo71668d2 = {"Lka/f;", "E", "", "Lkotlin/collections/f;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lja/u;", "clear", "add", "", "elements", "addAll", "remove", "", "iterator", "removeAll", "retainAll", "", "c", "()I", "size", "Lka/d;", "backing", "<init>", "(Lka/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.f */
/* compiled from: MapBuilder.kt */
public final class C13436f<E> extends C13580f<E> {

    /* renamed from: a */
    private final C13428d<E, ?> f61512a;

    public C13436f(C13428d<E, ?> dVar) {
        C13706o.m87929f(dVar, "backing");
        this.f61512a = dVar;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        C13706o.m87929f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public int mo70967c() {
        return this.f61512a.size();
    }

    public void clear() {
        this.f61512a.clear();
    }

    public boolean contains(Object obj) {
        return this.f61512a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f61512a.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f61512a.mo70916D();
    }

    public boolean remove(Object obj) {
        return this.f61512a.mo70918N(obj) >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.f61512a.mo70931j();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.f61512a.mo70931j();
        return super.retainAll(collection);
    }
}
