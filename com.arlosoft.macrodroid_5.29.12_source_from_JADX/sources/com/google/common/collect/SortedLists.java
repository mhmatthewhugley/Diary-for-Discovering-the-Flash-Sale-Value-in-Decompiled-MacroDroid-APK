package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
final class SortedLists {

    enum KeyAbsentBehavior {
        NEXT_LOWER {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public int mo36418d(int i) {
                return i - 1;
            }
        },
        NEXT_HIGHER {
            /* renamed from: d */
            public int mo36418d(int i) {
                return i;
            }
        },
        INVERTED_INSERTION_INDEX {
            /* renamed from: d */
            public int mo36418d(int i) {
                return ~i;
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract int mo36418d(int i);
    }

    enum KeyPresentBehavior {
        ANY_PRESENT {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public <E> int mo36419d(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
                return i;
            }
        },
        LAST_PRESENT {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public <E> int mo36419d(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        },
        FIRST_PRESENT {
            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public <E> int mo36419d(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER {
            /* renamed from: d */
            public <E> int mo36419d(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
                return KeyPresentBehavior.LAST_PRESENT.mo36419d(comparator, e, list, i) + 1;
            }
        },
        LAST_BEFORE {
            /* renamed from: d */
            public <E> int mo36419d(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i) {
                return KeyPresentBehavior.FIRST_PRESENT.mo36419d(comparator, e, list, i) - 1;
            }
        };

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract <E> int mo36419d(Comparator<? super E> comparator, @ParametricNullness E e, List<? extends E> list, int i);
    }

    private SortedLists() {
    }

    /* renamed from: a */
    public static <E, K extends Comparable> int m28780a(List<E> list, Function<? super E, K> function, K k, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.m5392s(k);
        return m28781b(list, function, k, Ordering.m28521e(), keyPresentBehavior, keyAbsentBehavior);
    }

    /* renamed from: b */
    public static <E, K> int m28781b(List<E> list, Function<? super E, K> function, @ParametricNullness K k, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return m28782c(Lists.m27838n(list, function), k, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    /* renamed from: c */
    public static <E> int m28782c(List<? extends E> list, @ParametricNullness E e, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        Preconditions.m5392s(comparator);
        Preconditions.m5392s(list);
        Preconditions.m5392s(keyPresentBehavior);
        Preconditions.m5392s(keyAbsentBehavior);
        boolean z = list instanceof RandomAccess;
        ArrayList<? extends E> arrayList = list;
        if (!z) {
            arrayList = Lists.m27833i(list);
        }
        int i = 0;
        int size = arrayList.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, arrayList.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return i + keyPresentBehavior.mo36419d(comparator, e, arrayList.subList(i, size + 1), i2 - i);
            } else {
                i = i2 + 1;
            }
        }
        return keyAbsentBehavior.mo36418d(i);
    }
}
