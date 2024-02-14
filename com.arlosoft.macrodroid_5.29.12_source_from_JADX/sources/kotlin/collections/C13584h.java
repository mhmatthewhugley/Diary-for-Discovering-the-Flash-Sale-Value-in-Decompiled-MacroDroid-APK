package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00013B\t\b\u0016¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010\u001f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010!\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010(\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010 J\u0016\u0010)\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010*\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J)\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010-\"\u0004\b\u0001\u0010,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010-H\u0016¢\u0006\u0004\b/\u00102R\u0016\u00105\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u0010;\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b6\u0010:¨\u0006>"}, mo71668d2 = {"Lkotlin/collections/h;", "E", "Lkotlin/collections/e;", "", "minCapacity", "Lja/u;", "j", "newCapacity", "h", "index", "m", "l", "k", "i", "internalIndex", "", "elements", "f", "", "isEmpty", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "()Ljava/lang/Object;", "removeLast", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "d", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "a", "I", "head", "c", "[Ljava/lang/Object;", "elementData", "<set-?>", "()I", "size", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.h */
/* compiled from: ArrayDeque.kt */
public final class C13584h<E> extends C13578e<E> {

    /* renamed from: f */
    public static final C13585a f61876f = new C13585a((C13695i) null);

    /* renamed from: g */
    private static final Object[] f61877g = new Object[0];

    /* renamed from: a */
    private int f61878a;

    /* renamed from: c */
    private Object[] f61879c = f61877g;

    /* renamed from: d */
    private int f61880d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, mo71668d2 = {"Lkotlin/collections/h$a;", "", "", "oldCapacity", "minCapacity", "a", "(II)I", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.collections.h$a */
    /* compiled from: ArrayDeque.kt */
    public static final class C13585a {
        private C13585a() {
        }

        public /* synthetic */ C13585a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final int mo71841a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    /* renamed from: f */
    private final void m87485f(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f61879c.length;
        while (i < length && it.hasNext()) {
            this.f61879c[i] = it.next();
            i++;
        }
        int i2 = this.f61878a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f61879c[i3] = it.next();
        }
        this.f61880d = size() + collection.size();
    }

    /* renamed from: h */
    private final void m87486h(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f61879c;
        Object[] unused = C13593l.m87559f(objArr2, objArr, 0, this.f61878a, objArr2.length);
        Object[] objArr3 = this.f61879c;
        int length = objArr3.length;
        int i2 = this.f61878a;
        Object[] unused2 = C13593l.m87559f(objArr3, objArr, length - i2, 0, i2);
        this.f61878a = 0;
        this.f61879c = objArr;
    }

    /* renamed from: i */
    private final int m87487i(int i) {
        return i == 0 ? C13596m.m87581F(this.f61879c) : i - 1;
    }

    /* renamed from: j */
    private final void m87488j(int i) {
        if (i >= 0) {
            Object[] objArr = this.f61879c;
            if (i > objArr.length) {
                if (objArr == f61877g) {
                    this.f61879c = new Object[C16792h.m99540b(i, 10)];
                } else {
                    m87486h(f61876f.mo71841a(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    /* renamed from: k */
    private final int m87489k(int i) {
        if (i == C13596m.m87581F(this.f61879c)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: l */
    private final int m87490l(int i) {
        return i < 0 ? i + this.f61879c.length : i;
    }

    /* renamed from: m */
    private final int m87491m(int i) {
        Object[] objArr = this.f61879c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C13706o.m87929f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m87488j(size() + collection.size());
        m87485f(m87491m(this.f61878a + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        m87488j(size() + 1);
        int i = m87487i(this.f61878a);
        this.f61878a = i;
        this.f61879c[i] = e;
        this.f61880d = size() + 1;
    }

    public final void addLast(E e) {
        m87488j(size() + 1);
        this.f61879c[m87491m(this.f61878a + size())] = e;
        this.f61880d = size() + 1;
    }

    /* renamed from: c */
    public int mo70884c() {
        return this.f61880d;
    }

    public void clear() {
        int m = m87491m(this.f61878a + size());
        int i = this.f61878a;
        if (i < m) {
            C13593l.m87565l(this.f61879c, null, i, m);
        } else if (!isEmpty()) {
            Object[] objArr = this.f61879c;
            C13593l.m87565l(objArr, null, this.f61878a, objArr.length);
            C13593l.m87565l(this.f61879c, null, 0, m);
        }
        this.f61878a = 0;
        this.f61880d = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public E mo70886d(int i) {
        C13570c.Companion.mo71705b(i, size());
        if (i == C13614t.m87750l(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int m = m87491m(this.f61878a + i);
        E e = this.f61879c[m];
        if (i < (size() >> 1)) {
            int i2 = this.f61878a;
            if (m >= i2) {
                Object[] objArr = this.f61879c;
                Object[] unused = C13593l.m87559f(objArr, objArr, i2 + 1, i2, m);
            } else {
                Object[] objArr2 = this.f61879c;
                Object[] unused2 = C13593l.m87559f(objArr2, objArr2, 1, 0, m);
                Object[] objArr3 = this.f61879c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f61878a;
                Object[] unused3 = C13593l.m87559f(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f61879c;
            int i4 = this.f61878a;
            objArr4[i4] = null;
            this.f61878a = m87489k(i4);
        } else {
            int m2 = m87491m(this.f61878a + C13614t.m87750l(this));
            if (m <= m2) {
                Object[] objArr5 = this.f61879c;
                Object[] unused4 = C13593l.m87559f(objArr5, objArr5, m, m + 1, m2 + 1);
            } else {
                Object[] objArr6 = this.f61879c;
                Object[] unused5 = C13593l.m87559f(objArr6, objArr6, m, m + 1, objArr6.length);
                Object[] objArr7 = this.f61879c;
                objArr7[objArr7.length - 1] = objArr7[0];
                Object[] unused6 = C13593l.m87559f(objArr7, objArr7, 0, 1, m2 + 1);
            }
            this.f61879c[m2] = null;
        }
        this.f61880d = size() - 1;
        return e;
    }

    public E get(int i) {
        C13570c.Companion.mo71705b(i, size());
        return this.f61879c[m87491m(this.f61878a + i)];
    }

    public int indexOf(Object obj) {
        int i;
        int m = m87491m(this.f61878a + size());
        int i2 = this.f61878a;
        if (i2 < m) {
            while (i2 < m) {
                if (C13706o.m87924a(obj, this.f61879c[i2])) {
                    i = this.f61878a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < m) {
            return -1;
        } else {
            int length = this.f61879c.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < m) {
                        if (C13706o.m87924a(obj, this.f61879c[i3])) {
                            i2 = i3 + this.f61879c.length;
                            i = this.f61878a;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (C13706o.m87924a(obj, this.f61879c[i2])) {
                    i = this.f61878a;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        int m = m87491m(this.f61878a + size());
        int i3 = this.f61878a;
        if (i3 < m) {
            i = m - 1;
            if (i3 <= i) {
                while (!C13706o.m87924a(obj, this.f61879c[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f61878a;
            }
            return -1;
        }
        if (i3 > m) {
            int i4 = m - 1;
            while (true) {
                if (-1 >= i4) {
                    int F = C13596m.m87581F(this.f61879c);
                    int i5 = this.f61878a;
                    if (i5 <= F) {
                        while (!C13706o.m87924a(obj, this.f61879c[i])) {
                            if (i != i5) {
                                F = i - 1;
                            }
                        }
                        i2 = this.f61878a;
                    }
                } else if (C13706o.m87924a(obj, this.f61879c[i4])) {
                    i = i4 + this.f61879c.length;
                    i2 = this.f61878a;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f61879c
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f61878a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m87491m(r0)
            int r3 = r11.f61878a
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f61879c
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f61879c
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f61879c
            kotlin.collections.C13593l.m87565l(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f61879c
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f61879c
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f61879c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.m87491m(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f61879c
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f61879c
            r3[r5] = r6
            int r5 = r11.m87489k(r5)
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f61878a
            int r5 = r5 - r12
            int r12 = r11.m87490l(r5)
            r11.f61880d = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C13584h.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.f61879c;
            int i = this.f61878a;
            E e = eArr[i];
            eArr[i] = null;
            this.f61878a = m87489k(i);
            this.f61880d = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int m = m87491m(this.f61878a + C13614t.m87750l(this));
            E[] eArr = this.f61879c;
            E e = eArr[m];
            eArr[m] = null;
            this.f61880d = size() - 1;
            return e;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f61879c
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f61878a
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m87491m(r0)
            int r3 = r11.f61878a
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f61879c
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f61879c
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f61879c
            kotlin.collections.C13593l.m87565l(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f61879c
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f61879c
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f61879c
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = 1
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.m87491m(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f61879c
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f61879c
            r3[r5] = r6
            int r5 = r11.m87489k(r5)
            goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f61878a
            int r5 = r5 - r12
            int r12 = r11.m87490l(r5)
            r11.f61880d = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C13584h.retainAll(java.util.Collection):boolean");
    }

    public E set(int i, E e) {
        C13570c.Companion.mo71705b(i, size());
        int m = m87491m(this.f61878a + i);
        E[] eArr = this.f61879c;
        E e2 = eArr[m];
        eArr[m] = e;
        return e2;
    }

    public <T> T[] toArray(T[] tArr) {
        C13706o.m87929f(tArr, "array");
        if (tArr.length < size()) {
            tArr = C13589j.m87550a(tArr, size());
        }
        C13706o.m87927d(tArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        int m = m87491m(this.f61878a + size());
        int i = this.f61878a;
        if (i < m) {
            Object[] unused = C13593l.m87561h(this.f61879c, tArr, 0, i, m, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f61879c;
            Object[] unused2 = C13593l.m87559f(objArr, tArr, 0, this.f61878a, objArr.length);
            Object[] objArr2 = this.f61879c;
            Object[] unused3 = C13593l.m87559f(objArr2, tArr, objArr2.length - this.f61878a, 0, m);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public void add(int i, E e) {
        C13570c.Companion.mo71706c(i, size());
        if (i == size()) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            m87488j(size() + 1);
            int m = m87491m(this.f61878a + i);
            if (i < ((size() + 1) >> 1)) {
                int i2 = m87487i(m);
                int i3 = m87487i(this.f61878a);
                int i4 = this.f61878a;
                if (i2 >= i4) {
                    Object[] objArr = this.f61879c;
                    objArr[i3] = objArr[i4];
                    Object[] unused = C13593l.m87559f(objArr, objArr, i4, i4 + 1, i2 + 1);
                } else {
                    Object[] objArr2 = this.f61879c;
                    Object[] unused2 = C13593l.m87559f(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                    Object[] objArr3 = this.f61879c;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    Object[] unused3 = C13593l.m87559f(objArr3, objArr3, 0, 1, i2 + 1);
                }
                this.f61879c[i2] = e;
                this.f61878a = i3;
            } else {
                int m2 = m87491m(this.f61878a + size());
                if (m < m2) {
                    Object[] objArr4 = this.f61879c;
                    Object[] unused4 = C13593l.m87559f(objArr4, objArr4, m + 1, m, m2);
                } else {
                    Object[] objArr5 = this.f61879c;
                    Object[] unused5 = C13593l.m87559f(objArr5, objArr5, 1, 0, m2);
                    Object[] objArr6 = this.f61879c;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    Object[] unused6 = C13593l.m87559f(objArr6, objArr6, m + 1, m, objArr6.length - 1);
                }
                this.f61879c[m] = e;
            }
            this.f61880d = size() + 1;
        }
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        C13706o.m87929f(collection, "elements");
        C13570c.Companion.mo71706c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m87488j(size() + collection.size());
        int m = m87491m(this.f61878a + size());
        int m2 = m87491m(this.f61878a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f61878a;
            int i3 = i2 - size;
            if (m2 < i2) {
                Object[] objArr = this.f61879c;
                Object[] unused = C13593l.m87559f(objArr, objArr, i3, i2, objArr.length);
                if (size >= m2) {
                    Object[] objArr2 = this.f61879c;
                    Object[] unused2 = C13593l.m87559f(objArr2, objArr2, objArr2.length - size, 0, m2);
                } else {
                    Object[] objArr3 = this.f61879c;
                    Object[] unused3 = C13593l.m87559f(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f61879c;
                    Object[] unused4 = C13593l.m87559f(objArr4, objArr4, 0, size, m2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f61879c;
                Object[] unused5 = C13593l.m87559f(objArr5, objArr5, i3, i2, m2);
            } else {
                Object[] objArr6 = this.f61879c;
                i3 += objArr6.length;
                int i4 = m2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    Object[] unused6 = C13593l.m87559f(objArr6, objArr6, i3, i2, m2);
                } else {
                    Object[] unused7 = C13593l.m87559f(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f61879c;
                    Object[] unused8 = C13593l.m87559f(objArr7, objArr7, 0, this.f61878a + length, m2);
                }
            }
            this.f61878a = i3;
            m87485f(m87490l(m2 - size), collection);
        } else {
            int i5 = m2 + size;
            if (m2 < m) {
                int i6 = size + m;
                Object[] objArr8 = this.f61879c;
                if (i6 <= objArr8.length) {
                    Object[] unused9 = C13593l.m87559f(objArr8, objArr8, i5, m2, m);
                } else if (i5 >= objArr8.length) {
                    Object[] unused10 = C13593l.m87559f(objArr8, objArr8, i5 - objArr8.length, m2, m);
                } else {
                    int length2 = m - (i6 - objArr8.length);
                    Object[] unused11 = C13593l.m87559f(objArr8, objArr8, 0, length2, m);
                    Object[] objArr9 = this.f61879c;
                    Object[] unused12 = C13593l.m87559f(objArr9, objArr9, i5, m2, length2);
                }
            } else {
                Object[] objArr10 = this.f61879c;
                Object[] unused13 = C13593l.m87559f(objArr10, objArr10, size, 0, m);
                Object[] objArr11 = this.f61879c;
                if (i5 >= objArr11.length) {
                    Object[] unused14 = C13593l.m87559f(objArr11, objArr11, i5 - objArr11.length, m2, objArr11.length);
                } else {
                    Object[] unused15 = C13593l.m87559f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f61879c;
                    Object[] unused16 = C13593l.m87559f(objArr12, objArr12, i5, m2, objArr12.length - size);
                }
            }
            m87485f(m2, collection);
        }
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
