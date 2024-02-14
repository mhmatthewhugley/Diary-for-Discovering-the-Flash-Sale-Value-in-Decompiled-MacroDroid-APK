package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u */
/* compiled from: UnmodifiableLazyStringList */
public class C14535u extends AbstractList<String> implements RandomAccess, C14512m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14512m f63431a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$a */
    /* compiled from: UnmodifiableLazyStringList */
    class C14536a implements ListIterator<String> {

        /* renamed from: a */
        ListIterator<String> f63432a;

        /* renamed from: c */
        final /* synthetic */ int f63433c;

        C14536a(int i) {
            this.f63433c = i;
            this.f63432a = C14535u.this.f63431a.listIterator(i);
        }

        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String next() {
            return this.f63432a.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.f63432a.previous();
        }

        /* renamed from: d */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f63432a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f63432a.hasPrevious();
        }

        public int nextIndex() {
            return this.f63432a.nextIndex();
        }

        public int previousIndex() {
            return this.f63432a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$b */
    /* compiled from: UnmodifiableLazyStringList */
    class C14537b implements Iterator<String> {

        /* renamed from: a */
        Iterator<String> f63435a;

        C14537b() {
            this.f63435a = C14535u.this.f63431a.iterator();
        }

        /* renamed from: a */
        public String next() {
            return this.f63435a.next();
        }

        public boolean hasNext() {
            return this.f63435a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C14535u(C14512m mVar) {
        this.f63431a = mVar;
    }

    /* renamed from: G0 */
    public C14485d mo73422G0(int i) {
        return this.f63431a.mo73422G0(i);
    }

    /* renamed from: L */
    public C14512m mo73423L() {
        return this;
    }

    /* renamed from: Y0 */
    public void mo73424Y0(C14485d dVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public String get(int i) {
        return (String) this.f63431a.get(i);
    }

    public Iterator<String> iterator() {
        return new C14537b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C14536a(i);
    }

    /* renamed from: r */
    public List<?> mo73434r() {
        return this.f63431a.mo73434r();
    }

    public int size() {
        return this.f63431a.size();
    }
}
