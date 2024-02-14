package p245de;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: de.a */
/* compiled from: ArrayIterator */
class C12015a implements Iterator<Object> {

    /* renamed from: a */
    private final Object f58217a;

    /* renamed from: c */
    private int f58218c = 0;

    public C12015a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Expected array instance but got null");
        } else if (obj.getClass().isArray()) {
            this.f58217a = obj;
        } else {
            throw new IllegalArgumentException("Expected array but got object of type: " + obj.getClass() + ", the object: " + obj.toString());
        }
    }

    public boolean hasNext() {
        return this.f58218c < Array.getLength(this.f58217a);
    }

    public Object next() {
        if (hasNext()) {
            Object obj = this.f58217a;
            int i = this.f58218c;
            this.f58218c = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
