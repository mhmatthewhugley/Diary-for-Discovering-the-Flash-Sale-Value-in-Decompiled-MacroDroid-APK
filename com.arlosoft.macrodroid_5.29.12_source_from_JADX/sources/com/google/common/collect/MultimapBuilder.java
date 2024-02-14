package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class MultimapBuilder<K0, V0> {

    /* renamed from: com.google.common.collect.MultimapBuilder$1 */
    class C70391 extends MultimapBuilderWithKeys<Object> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$2 */
    class C70402 extends MultimapBuilderWithKeys<Object> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$3 */
    class C70413 extends MultimapBuilderWithKeys<Object> {
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$4 */
    class C70424 extends MultimapBuilderWithKeys<Enum<Object>> {
    }

    private static final class ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    private static final class EnumSetSupplier<V extends Enum<V>> implements Supplier<Set<V>>, Serializable {
        private final Class<V> clazz;

        /* renamed from: a */
        public Set<V> get() {
            return EnumSet.noneOf(this.clazz);
        }
    }

    private static final class HashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        /* renamed from: a */
        public Set<V> get() {
            return Platform.m28535d(this.expectedValuesPerKey);
        }
    }

    private static final class LinkedHashSetSupplier<V> implements Supplier<Set<V>>, Serializable {
        private final int expectedValuesPerKey;

        /* renamed from: a */
        public Set<V> get() {
            return Platform.m28537f(this.expectedValuesPerKey);
        }
    }

    private enum LinkedListSupplier implements Supplier<List<?>> {
        INSTANCE;

        /* renamed from: d */
        public List<?> get() {
            return new LinkedList();
        }
    }

    public static abstract class ListMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        ListMultimapBuilder() {
            super((C70391) null);
        }
    }

    public static abstract class MultimapBuilderWithKeys<K0> {

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1 */
        class C70431 extends ListMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2 */
        class C70442 extends ListMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3 */
        class C70453 extends SetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4 */
        class C70464 extends SetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5 */
        class C70475 extends SortedSetMultimapBuilder<Object, Object> {
        }

        /* renamed from: com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6 */
        class C70486 extends SetMultimapBuilder<Object, Enum<Object>> {
        }

        MultimapBuilderWithKeys() {
        }
    }

    public static abstract class SetMultimapBuilder<K0, V0> extends MultimapBuilder<K0, V0> {
        SetMultimapBuilder() {
            super((C70391) null);
        }
    }

    public static abstract class SortedSetMultimapBuilder<K0, V0> extends SetMultimapBuilder<K0, V0> {
        SortedSetMultimapBuilder() {
        }
    }

    private static final class TreeSetSupplier<V> implements Supplier<SortedSet<V>>, Serializable {
        private final Comparator<? super V> comparator;

        /* renamed from: a */
        public SortedSet<V> get() {
            return new TreeSet(this.comparator);
        }
    }

    private MultimapBuilder() {
    }

    /* synthetic */ MultimapBuilder(C70391 r1) {
        this();
    }
}
