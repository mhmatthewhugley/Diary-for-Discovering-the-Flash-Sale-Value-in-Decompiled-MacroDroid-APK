package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.common.base.Optional$1 */
    class C17571 implements Iterable<Object> {

        /* renamed from: a */
        final /* synthetic */ Iterable f4183a;

        public Iterator<Object> iterator() {
            return new AbstractIterator<Object>() {

                /* renamed from: d */
                private final Iterator<? extends Optional<Object>> f4184d;

                {
                    this.f4184d = (Iterator) Preconditions.m5392s(C17571.this.f4183a.iterator());
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo22086a() {
                    while (this.f4184d.hasNext()) {
                        Optional optional = (Optional) this.f4184d.next();
                        if (optional.mo22080c()) {
                            return optional.mo22079b();
                        }
                    }
                    return mo22087b();
                }
            };
        }
    }

    Optional() {
    }

    /* renamed from: a */
    public static <T> Optional<T> m5351a() {
        return Absent.m5136g();
    }

    /* renamed from: d */
    public static <T> Optional<T> m5352d(T t) {
        return new Present(Preconditions.m5392s(t));
    }

    /* renamed from: b */
    public abstract T mo22079b();

    /* renamed from: c */
    public abstract boolean mo22080c();

    /* renamed from: e */
    public abstract T mo22081e(T t);

    /* renamed from: f */
    public abstract T mo22083f();
}
