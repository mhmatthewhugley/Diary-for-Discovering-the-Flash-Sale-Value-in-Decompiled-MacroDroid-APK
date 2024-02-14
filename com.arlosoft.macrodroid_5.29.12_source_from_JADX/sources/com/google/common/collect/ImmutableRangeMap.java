package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public class ImmutableRangeMap<K extends Comparable<?>, V> implements RangeMap<K, V>, Serializable {

    /* renamed from: d */
    private static final ImmutableRangeMap<Comparable<?>, Object> f16696d = new ImmutableRangeMap<>(ImmutableList.m27301D(), ImmutableList.m27301D());
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final transient ImmutableList<Range<K>> f16697a;

    /* renamed from: c */
    private final transient ImmutableList<V> f16698c;

    /* renamed from: com.google.common.collect.ImmutableRangeMap$1 */
    class C69751 extends ImmutableList<Range<Comparable<?>>> {
        final /* synthetic */ ImmutableRangeMap this$0;
        final /* synthetic */ int val$len;
        final /* synthetic */ int val$off;
        final /* synthetic */ Range val$range;

        /* renamed from: P */
        public Range<Comparable<?>> get(int i) {
            Preconditions.m5390q(i, this.val$len);
            if (i == 0 || i == this.val$len - 1) {
                return ((Range) this.this$0.f16697a.get(i + this.val$off)).mo36280n(this.val$range);
            }
            return (Range) this.this$0.f16697a.get(i + this.val$off);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo34781j() {
            return true;
        }

        public int size() {
            return this.val$len;
        }
    }

    /* renamed from: com.google.common.collect.ImmutableRangeMap$2 */
    class C69762 extends ImmutableRangeMap<Comparable<?>, Object> {
        final /* synthetic */ ImmutableRangeMap val$outer;
        final /* synthetic */ Range val$range;

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo35481a() {
            return ImmutableRangeMap.super.mo35481a();
        }
    }

    @DoNotMock
    public static final class Builder<K extends Comparable<?>, V> {

        /* renamed from: a */
        private final List<Map.Entry<Range<K>, V>> f16699a = Lists.m27832h();

        /* renamed from: a */
        public ImmutableRangeMap<K, V> mo35490a() {
            Collections.sort(this.f16699a, Range.m28554x().mo36267h());
            ImmutableList.Builder builder = new ImmutableList.Builder(this.f16699a.size());
            ImmutableList.Builder builder2 = new ImmutableList.Builder(this.f16699a.size());
            for (int i = 0; i < this.f16699a.size(); i++) {
                Range range = (Range) this.f16699a.get(i).getKey();
                if (i > 0) {
                    Range range2 = (Range) this.f16699a.get(i - 1).getKey();
                    if (range.mo36281p(range2) && !range.mo36280n(range2).mo36282q()) {
                        String valueOf = String.valueOf(range2);
                        String valueOf2 = String.valueOf(range);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 47 + valueOf2.length());
                        sb.append("Overlapping ranges: range ");
                        sb.append(valueOf);
                        sb.append(" overlaps with entry ");
                        sb.append(valueOf2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                builder.mo35365e(range);
                builder2.mo35365e(this.f16699a.get(i).getValue());
            }
            return new ImmutableRangeMap<>(builder.mo35398k(), builder2.mo35398k());
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder<K, V> mo35491b(Range<K> range, V v) {
            Preconditions.m5392s(range);
            Preconditions.m5392s(v);
            Preconditions.m5385l(!range.mo36282q(), "Range must not be empty, but was %s", range);
            this.f16699a.add(Maps.m28105t(range, v));
            return this;
        }
    }

    private static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final ImmutableMap<Range<K>, V> mapOfRanges;

        SerializedForm(ImmutableMap<Range<K>, V> immutableMap) {
            this.mapOfRanges = immutableMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Object mo35492a() {
            Builder builder = new Builder();
            UnmodifiableIterator<Map.Entry<Range<K>, V>> k = this.mapOfRanges.entrySet().iterator();
            while (k.hasNext()) {
                Map.Entry next = k.next();
                builder.mo35491b((Range) next.getKey(), next.getValue());
            }
            return builder.mo35490a();
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            if (this.mapOfRanges.isEmpty()) {
                return ImmutableRangeMap.m27465d();
            }
            return mo35492a();
        }
    }

    ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.f16697a = immutableList;
        this.f16698c = immutableList2;
    }

    /* renamed from: d */
    public static <K extends Comparable<?>, V> ImmutableRangeMap<K, V> m27465d() {
        return f16696d;
    }

    /* renamed from: c */
    public ImmutableMap<Range<K>, V> mo35481a() {
        if (this.f16697a.isEmpty()) {
            return ImmutableMap.m27352m();
        }
        return new ImmutableSortedMap(new RegularImmutableSortedSet(this.f16697a, Range.m28554x()), this.f16698c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof RangeMap) {
            return mo35481a().equals(((RangeMap) obj).mo35481a());
        }
        return false;
    }

    public int hashCode() {
        return mo35481a().hashCode();
    }

    public String toString() {
        return mo35481a().toString();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(mo35481a());
    }
}
