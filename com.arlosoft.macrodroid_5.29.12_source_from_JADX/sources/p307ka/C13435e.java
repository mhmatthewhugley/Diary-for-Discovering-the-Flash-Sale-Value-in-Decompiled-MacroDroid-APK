package p307ka;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0002J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo71668d2 = {"Lka/e;", "K", "V", "Lka/a;", "", "", "isEmpty", "", "element", "f", "Lja/u;", "clear", "i", "", "elements", "addAll", "h", "", "iterator", "containsAll", "removeAll", "retainAll", "", "c", "()I", "size", "Lka/d;", "backing", "<init>", "(Lka/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.e */
/* compiled from: MapBuilder.kt */
public final class C13435e<K, V> extends C13424a<Map.Entry<K, V>, K, V> {

    /* renamed from: a */
    private final C13428d<K, V> f61511a;

    public C13435e(C13428d<K, V> dVar) {
        C13706o.m87929f(dVar, "backing");
        this.f61511a = dVar;
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        C13706o.m87929f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public int mo70967c() {
        return this.f61511a.size();
    }

    public void clear() {
        this.f61511a.clear();
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        return this.f61511a.mo70933l(collection);
    }

    /* renamed from: f */
    public boolean mo70877f(Map.Entry<? extends K, ? extends V> entry) {
        C13706o.m87929f(entry, "element");
        return this.f61511a.mo70934m(entry);
    }

    /* renamed from: h */
    public boolean mo70878h(Map.Entry entry) {
        C13706o.m87929f(entry, "element");
        return this.f61511a.mo70917L(entry);
    }

    /* renamed from: i */
    public boolean add(Map.Entry<K, V> entry) {
        C13706o.m87929f(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return this.f61511a.isEmpty();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f61511a.mo70937r();
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.f61511a.mo70931j();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.f61511a.mo70931j();
        return super.retainAll(collection);
    }
}
