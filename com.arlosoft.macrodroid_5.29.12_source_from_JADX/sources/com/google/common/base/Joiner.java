package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class Joiner {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f4166a;

    /* renamed from: com.google.common.base.Joiner$2 */
    class C17542 extends Joiner {

        /* renamed from: b */
        final /* synthetic */ Joiner f4169b;

        /* renamed from: b */
        public <A extends Appendable> A mo22177b(A a, Iterator<? extends Object> it) throws IOException {
            Preconditions.m5393t(a, "appendable");
            Preconditions.m5393t(it, "parts");
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        a.append(this.f4169b.mo22183j(next));
                        break;
                    }
                } else {
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a.append(this.f4169b.f4166a);
                    a.append(this.f4169b.mo22183j(next2));
                }
            }
            return a;
        }

        /* renamed from: k */
        public Joiner mo22184k(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }

        /* renamed from: l */
        public MapJoiner mo22185l(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    /* renamed from: com.google.common.base.Joiner$3 */
    class C17553 extends AbstractList<Object> {

        /* renamed from: a */
        final /* synthetic */ Object[] f4170a;

        /* renamed from: c */
        final /* synthetic */ Object f4171c;

        /* renamed from: d */
        final /* synthetic */ Object f4172d;

        public Object get(int i) {
            if (i == 0) {
                return this.f4171c;
            }
            if (i != 1) {
                return this.f4170a[i - 2];
            }
            return this.f4172d;
        }

        public int size() {
            return this.f4170a.length + 2;
        }
    }

    public static final class MapJoiner {

        /* renamed from: a */
        private final Joiner f4173a;

        /* renamed from: b */
        private final String f4174b;

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: a */
        public <A extends Appendable> A mo22188a(A a, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.m5392s(a);
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                a.append(this.f4173a.mo22183j(entry.getKey()));
                a.append(this.f4174b);
                a.append(this.f4173a.mo22183j(entry.getValue()));
                while (it.hasNext()) {
                    a.append(this.f4173a.f4166a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    a.append(this.f4173a.mo22183j(entry2.getKey()));
                    a.append(this.f4174b);
                    a.append(this.f4173a.mo22183j(entry2.getValue()));
                }
            }
            return a;
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: b */
        public StringBuilder mo22189b(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return mo22190c(sb, iterable.iterator());
        }

        @CanIgnoreReturnValue
        @Beta
        /* renamed from: c */
        public StringBuilder mo22190c(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                mo22188a(sb, it);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        private MapJoiner(Joiner joiner, String str) {
            this.f4173a = joiner;
            this.f4174b = (String) Preconditions.m5392s(str);
        }
    }

    /* renamed from: h */
    public static Joiner m5313h(char c) {
        return new Joiner(String.valueOf(c));
    }

    /* renamed from: i */
    public static Joiner m5314i(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public <A extends Appendable> A mo22177b(A a, Iterator<? extends Object> it) throws IOException {
        Preconditions.m5392s(a);
        if (it.hasNext()) {
            a.append(mo22183j(it.next()));
            while (it.hasNext()) {
                a.append(this.f4166a);
                a.append(mo22183j(it.next()));
            }
        }
        return a;
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public final StringBuilder mo22178c(StringBuilder sb, Iterable<? extends Object> iterable) {
        return mo22179d(sb, iterable.iterator());
    }

    @CanIgnoreReturnValue
    /* renamed from: d */
    public final StringBuilder mo22179d(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            mo22177b(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public final String mo22180e(Iterable<? extends Object> iterable) {
        return mo22181f(iterable.iterator());
    }

    /* renamed from: f */
    public final String mo22181f(Iterator<? extends Object> it) {
        return mo22179d(new StringBuilder(), it).toString();
    }

    /* renamed from: g */
    public final String mo22182g(Object[] objArr) {
        return mo22180e(Arrays.asList(objArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public CharSequence mo22183j(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: k */
    public Joiner mo22184k(final String str) {
        Preconditions.m5392s(str);
        return new Joiner(this) {
            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public CharSequence mo22183j(Object obj) {
                return obj == null ? str : Joiner.this.mo22183j(obj);
            }

            /* renamed from: k */
            public Joiner mo22184k(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    /* renamed from: l */
    public MapJoiner mo22185l(String str) {
        return new MapJoiner(str);
    }

    private Joiner(String str) {
        this.f4166a = (String) Preconditions.m5392s(str);
    }

    private Joiner(Joiner joiner) {
        this.f4166a = joiner.f4166a;
    }
}
