package p307ka;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C13580f;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001b\b\u0000\u0012\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001e¢\u0006\u0004\b \u0010!B\t\b\u0016¢\u0006\u0004\b \u0010\"B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\u001a¢\u0006\u0004\b \u0010$J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0018\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, mo71668d2 = {"Lka/j;", "E", "", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "d", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lja/u;", "clear", "add", "remove", "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "", "c", "()I", "size", "Lka/d;", "backing", "<init>", "(Lka/d;)V", "()V", "initialCapacity", "(I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.j */
/* compiled from: SetBuilder.kt */
public final class C13442j<E> extends C13580f<E> implements Serializable {
    private final C13428d<E, ?> backing;

    public C13442j(C13428d<E, ?> dVar) {
        C13706o.m87929f(dVar, "backing");
        this.backing = dVar;
    }

    private final Object writeReplace() {
        if (this.backing.mo70915C()) {
            return new C13438h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(E e) {
        return this.backing.mo70926g(e) >= 0;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C13706o.m87929f(collection, "elements");
        this.backing.mo70931j();
        return super.addAll(collection);
    }

    /* renamed from: c */
    public int mo70967c() {
        return this.backing.size();
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    /* renamed from: d */
    public final Set<E> mo71002d() {
        this.backing.mo70929i();
        return this;
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.backing.mo70916D();
    }

    public boolean remove(Object obj) {
        return this.backing.mo70918N(obj) >= 0;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.backing.mo70931j();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        this.backing.mo70931j();
        return super.retainAll(collection);
    }

    public C13442j() {
        this(new C13428d());
    }

    public C13442j(int i) {
        this(new C13428d(i));
    }
}
