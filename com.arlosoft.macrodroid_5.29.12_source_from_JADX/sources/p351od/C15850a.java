package p351od;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: od.a */
/* compiled from: ChangeNotifyingArrayList */
public abstract class C15850a<E> extends ArrayList<E> {
    public C15850a(int i) {
        super(i);
    }

    public boolean add(E e) {
        mo75627c();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo75627c();
        return super.addAll(collection);
    }

    /* renamed from: c */
    public abstract void mo75627c();

    public void clear() {
        mo75627c();
        super.clear();
    }

    public E remove(int i) {
        mo75627c();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo75627c();
        return super.removeAll(collection);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo75627c();
        super.removeRange(i, i2);
    }

    public boolean retainAll(Collection<?> collection) {
        mo75627c();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo75627c();
        return super.set(i, e);
    }

    public void add(int i, E e) {
        mo75627c();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo75627c();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        mo75627c();
        return super.remove(obj);
    }
}
