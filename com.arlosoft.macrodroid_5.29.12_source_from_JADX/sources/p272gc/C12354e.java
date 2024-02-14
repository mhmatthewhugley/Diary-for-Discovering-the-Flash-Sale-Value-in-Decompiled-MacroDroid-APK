package p272gc;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: gc.e */
/* compiled from: SmartList */
public class C12354e<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a */
    private int f59038a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Object f59039c;

    /* renamed from: gc.e$b */
    /* compiled from: SmartList */
    private static class C12356b<T> implements Iterator<T> {

        /* renamed from: a */
        private static final C12356b f59040a = new C12356b();

        private C12356b() {
        }

        /* renamed from: a */
        public static <T> C12356b<T> m83108a() {
            return f59040a;
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: gc.e$c */
    /* compiled from: SmartList */
    private class C12357c extends C12358d<E> {

        /* renamed from: c */
        private final int f59041c;

        public C12357c() {
            super();
            this.f59041c = C12354e.this.modCount;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo68690a() {
            if (C12354e.this.modCount != this.f59041c) {
                throw new ConcurrentModificationException("ModCount: " + C12354e.this.modCount + "; expected: " + this.f59041c);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public E mo68691b() {
            return C12354e.this.f59039c;
        }

        public void remove() {
            mo68690a();
            C12354e.this.clear();
        }
    }

    /* renamed from: gc.e$d */
    /* compiled from: SmartList */
    private static abstract class C12358d<T> implements Iterator<T> {

        /* renamed from: a */
        private boolean f59043a;

        private C12358d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo68690a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract T mo68691b();

        public final boolean hasNext() {
            return !this.f59043a;
        }

        public final T next() {
            if (!this.f59043a) {
                this.f59043a = true;
                mo68690a();
                return mo68691b();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c */
    private static /* synthetic */ void m83103c(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean add(E e) {
        int i = this.f59038a;
        if (i == 0) {
            this.f59039c = e;
        } else if (i == 1) {
            this.f59039c = new Object[]{this.f59039c, e};
        } else {
            Object[] objArr = (Object[]) this.f59039c;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f59039c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f59038a] = e;
        }
        this.f59038a++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f59039c = null;
        this.f59038a = 0;
        this.modCount++;
    }

    public E get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f59038a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f59038a);
        } else if (i2 == 1) {
            return this.f59039c;
        } else {
            return ((Object[]) this.f59039c)[i];
        }
    }

    public Iterator<E> iterator() {
        int i = this.f59038a;
        if (i == 0) {
            C12356b a = C12356b.m83108a();
            if (a == null) {
                m83103c(2);
            }
            return a;
        } else if (i == 1) {
            return new C12357c();
        } else {
            Iterator<E> it = super.iterator();
            if (it == null) {
                m83103c(3);
            }
            return it;
        }
    }

    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f59038a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f59038a);
        }
        if (i2 == 1) {
            e = this.f59039c;
            this.f59039c = null;
        } else {
            E[] eArr = (Object[]) this.f59039c;
            E e2 = eArr[i];
            if (i2 == 2) {
                this.f59039c = eArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(eArr, i + 1, eArr, i, i3);
                }
                eArr[this.f59038a - 1] = null;
            }
            e = e2;
        }
        this.f59038a--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f59038a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f59038a);
        } else if (i2 == 1) {
            E e2 = this.f59039c;
            this.f59039c = e;
            return e2;
        } else {
            E[] eArr = (Object[]) this.f59039c;
            E e3 = eArr[i];
            eArr[i] = e;
            return e3;
        }
    }

    public int size() {
        return this.f59038a;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr == null) {
            m83103c(4);
        }
        int length = tArr.length;
        int i = this.f59038a;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.f59039c;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                tArr2[0] = this.f59039c;
                return tArr2;
            }
        } else if (length < i) {
            T[] copyOf = Arrays.copyOf((Object[]) this.f59039c, i, tArr.getClass());
            if (copyOf == null) {
                m83103c(6);
            }
            return copyOf;
        } else if (i != 0) {
            System.arraycopy(this.f59039c, 0, tArr, 0, i);
        }
        int i2 = this.f59038a;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f59038a)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f59038a);
        }
        if (i2 == 0) {
            this.f59039c = e;
        } else if (i2 == 1 && i == 0) {
            this.f59039c = new Object[]{e, this.f59039c};
        } else {
            Object[] objArr = new Object[(i2 + 1)];
            if (i2 == 1) {
                objArr[0] = this.f59039c;
            } else {
                Object[] objArr2 = (Object[]) this.f59039c;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f59038a - i);
            }
            objArr[i] = e;
            this.f59039c = objArr;
        }
        this.f59038a++;
        this.modCount++;
    }
}
