package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.Immutable;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@Immutable
@Beta
public final class ElementOrder<T> {

    /* renamed from: a */
    private final Type f17420a;

    /* renamed from: b */
    private final Comparator<T> f17421b;

    /* renamed from: com.google.common.graph.ElementOrder$1 */
    static /* synthetic */ class C71791 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17422a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.common.graph.ElementOrder$Type[] r0 = com.google.common.graph.ElementOrder.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17422a = r0
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.UNORDERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17422a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.INSERTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17422a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.STABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17422a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.common.graph.ElementOrder$Type r1 = com.google.common.graph.ElementOrder.Type.SORTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.graph.ElementOrder.C71791.<clinit>():void");
        }
    }

    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ElementOrder elementOrder = (ElementOrder) obj;
        if (this.f17420a != elementOrder.f17420a || !Objects.m5349a(this.f17421b, elementOrder.f17421b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.m5350b(this.f17420a, this.f17421b);
    }

    public String toString() {
        MoreObjects.ToStringHelper d = MoreObjects.m5334c(this).mo22194d("type", this.f17420a);
        Comparator<T> comparator = this.f17421b;
        if (comparator != null) {
            d.mo22194d("comparator", comparator);
        }
        return d.toString();
    }
}
