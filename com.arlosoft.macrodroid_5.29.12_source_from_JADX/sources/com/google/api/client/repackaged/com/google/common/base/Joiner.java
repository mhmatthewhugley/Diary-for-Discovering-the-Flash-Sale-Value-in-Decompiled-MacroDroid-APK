package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;

@GwtCompatible
public class Joiner {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f52618a;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Joiner$1 */
    class C108571 extends Joiner {

        /* renamed from: b */
        final /* synthetic */ String f52619b;

        /* renamed from: c */
        final /* synthetic */ Joiner f52620c;

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo60606i(Object obj) {
            return obj == null ? this.f52619b : this.f52620c.mo60606i(obj);
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Joiner$2 */
    class C108582 extends Joiner {

        /* renamed from: b */
        final /* synthetic */ Joiner f52621b;

        /* renamed from: b */
        public <A extends Appendable> A mo60601b(A a, Iterator<?> it) throws IOException {
            Preconditions.m72473f(a, "appendable");
            Preconditions.m72473f(it, "parts");
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        a.append(this.f52621b.mo60606i(next));
                        break;
                    }
                } else {
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a.append(this.f52621b.f52618a);
                    a.append(this.f52621b.mo60606i(next2));
                }
            }
            return a;
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Joiner$3 */
    final class C108593 extends AbstractList<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f52622a;

        /* renamed from: c */
        final /* synthetic */ Object f52623c;

        /* renamed from: d */
        final /* synthetic */ Object f52624d;

        public Object get(int i) {
            if (i == 0) {
                return this.f52623c;
            }
            if (i != 1) {
                return this.f52622a[i - 2];
            }
            return this.f52624d;
        }

        public int size() {
            return this.f52622a.length + 2;
        }
    }

    public static final class MapJoiner {
    }

    private Joiner(String str) {
        this.f52618a = (String) Preconditions.m72472e(str);
    }

    /* renamed from: g */
    public static Joiner m72454g(char c) {
        return new Joiner(String.valueOf(c));
    }

    /* renamed from: h */
    public static Joiner m72455h(String str) {
        return new Joiner(str);
    }

    /* renamed from: b */
    public <A extends Appendable> A mo60601b(A a, Iterator<?> it) throws IOException {
        Preconditions.m72472e(a);
        if (it.hasNext()) {
            a.append(mo60606i(it.next()));
            while (it.hasNext()) {
                a.append(this.f52618a);
                a.append(mo60606i(it.next()));
            }
        }
        return a;
    }

    /* renamed from: c */
    public final StringBuilder mo60602c(StringBuilder sb, Iterable<?> iterable) {
        return mo60603d(sb, iterable.iterator());
    }

    /* renamed from: d */
    public final StringBuilder mo60603d(StringBuilder sb, Iterator<?> it) {
        try {
            mo60601b(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public final String mo60604e(Iterable<?> iterable) {
        return mo60605f(iterable.iterator());
    }

    /* renamed from: f */
    public final String mo60605f(Iterator<?> it) {
        return mo60603d(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo60606i(Object obj) {
        Preconditions.m72472e(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
