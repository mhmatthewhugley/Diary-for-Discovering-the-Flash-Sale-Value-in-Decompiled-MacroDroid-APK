package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13693h;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16265l;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0001\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo71668d2 = {"Lkotlin/collections/a;", "E", "", "", "iterator", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "isEmpty", "", "toString", "", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "getSize", "()I", "size", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.a */
/* compiled from: AbstractCollection.kt */
public abstract class C13560a<E> implements Collection<E>, C16368a {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000 \u00012\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.a$a */
    /* compiled from: AbstractCollection.kt */
    static final class C13561a extends C13708q implements C16265l<E, CharSequence> {
        final /* synthetic */ C13560a<E> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13561a(C13560a<? extends E> aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(E e) {
            return e == this.this$0 ? "(this Collection)" : String.valueOf(e);
        }
    }

    protected C13560a() {
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C13706o.m87924a(a, e)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C13706o.m87929f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int getSize();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract Iterator<E> iterator();

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return C13693h.m87895a(this);
    }

    public String toString() {
        return C13566b0.m87432g0(this, ", ", "[", "]", 0, (CharSequence) null, new C13561a(this), 24, (Object) null);
    }

    public <T> T[] toArray(T[] tArr) {
        C13706o.m87929f(tArr, "array");
        T[] b = C13693h.m87896b(this, tArr);
        C13706o.m87927d(b, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return b;
    }
}
