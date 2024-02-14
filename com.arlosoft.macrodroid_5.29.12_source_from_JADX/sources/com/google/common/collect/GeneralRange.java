package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final T lowerEndpoint;
    private final BoundType upperBoundType;
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator2, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        this.comparator = (Comparator) Preconditions.m5392s(comparator2);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) Preconditions.m5392s(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (BoundType) Preconditions.m5392s(boundType2);
        if (z) {
            comparator2.compare(NullnessCasts.m28457a(t), NullnessCasts.m28457a(t));
        }
        if (z2) {
            comparator2.compare(NullnessCasts.m28457a(t2), NullnessCasts.m28457a(t2));
        }
        if (z && z2) {
            int compare = comparator2.compare(NullnessCasts.m28457a(t), NullnessCasts.m28457a(t2));
            boolean z3 = true;
            Preconditions.m5387n(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z3 = false;
                }
                Preconditions.m5377d(z3);
            }
        }
    }

    /* renamed from: a */
    static <T> GeneralRange<T> m27166a(Comparator<? super T> comparator2) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange(comparator2, false, (Object) null, boundType, false, (Object) null, boundType);
    }

    /* renamed from: d */
    static <T> GeneralRange<T> m27167d(Comparator<? super T> comparator2, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange(comparator2, true, t, boundType, false, (T) null, BoundType.OPEN);
    }

    /* renamed from: n */
    static <T> GeneralRange<T> m27168n(Comparator<? super T> comparator2, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange(comparator2, false, (Object) null, BoundType.OPEN, true, t, boundType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Comparator<? super T> mo35254b() {
        return this.comparator;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo35255c(@ParametricNullness T t) {
        return !mo35266m(t) && !mo35265l(t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public BoundType mo35256e() {
        return this.lowerBoundType;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        if (!this.comparator.equals(generalRange.comparator) || this.hasLowerBound != generalRange.hasLowerBound || this.hasUpperBound != generalRange.hasUpperBound || !mo35256e().equals(generalRange.mo35256e()) || !mo35259g().equals(generalRange.mo35259g()) || !Objects.m5349a(mo35258f(), generalRange.mo35258f()) || !Objects.m5349a(mo35260h(), generalRange.mo35260h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public T mo35258f() {
        return this.lowerEndpoint;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public BoundType mo35259g() {
        return this.upperBoundType;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public T mo35260h() {
        return this.upperEndpoint;
    }

    public int hashCode() {
        return Objects.m5350b(this.comparator, mo35258f(), mo35256e(), mo35260h(), mo35259g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo35262i() {
        return this.hasLowerBound;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo35263j() {
        return this.hasUpperBound;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public GeneralRange<T> mo35264k(GeneralRange<T> generalRange) {
        BoundType boundType;
        BoundType boundType2;
        T t;
        int compare;
        BoundType boundType3;
        int compare2;
        int compare3;
        Preconditions.m5392s(generalRange);
        Preconditions.m5377d(this.comparator.equals(generalRange.comparator));
        boolean z = this.hasLowerBound;
        T f = mo35258f();
        BoundType e = mo35256e();
        if (!mo35262i()) {
            z = generalRange.hasLowerBound;
            f = generalRange.mo35258f();
            e = generalRange.mo35256e();
        } else if (generalRange.mo35262i() && ((compare3 = this.comparator.compare(mo35258f(), generalRange.mo35258f())) < 0 || (compare3 == 0 && generalRange.mo35256e() == BoundType.OPEN))) {
            f = generalRange.mo35258f();
            e = generalRange.mo35256e();
        }
        boolean z2 = z;
        boolean z3 = this.hasUpperBound;
        T h = mo35260h();
        BoundType g = mo35259g();
        if (!mo35263j()) {
            z3 = generalRange.hasUpperBound;
            h = generalRange.mo35260h();
            g = generalRange.mo35259g();
        } else if (generalRange.mo35263j() && ((compare2 = this.comparator.compare(mo35260h(), generalRange.mo35260h())) > 0 || (compare2 == 0 && generalRange.mo35259g() == BoundType.OPEN))) {
            h = generalRange.mo35260h();
            g = generalRange.mo35259g();
        }
        boolean z4 = z3;
        T t2 = h;
        if (!z2 || !z4 || ((compare = this.comparator.compare(f, t2)) <= 0 && !(compare == 0 && e == (boundType3 = BoundType.OPEN) && g == boundType3))) {
            t = f;
            boundType2 = e;
            boundType = g;
        } else {
            boundType2 = BoundType.OPEN;
            boundType = BoundType.CLOSED;
            t = t2;
        }
        return new GeneralRange(this.comparator, z2, t, boundType2, z4, t2, boundType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo35265l(@ParametricNullness T t) {
        boolean z = false;
        if (!mo35263j()) {
            return false;
        }
        int compare = this.comparator.compare(t, NullnessCasts.m28457a(mo35260h()));
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (mo35259g() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo35266m(@ParametricNullness T t) {
        boolean z = false;
        if (!mo35262i()) {
            return false;
        }
        int compare = this.comparator.compare(t, NullnessCasts.m28457a(mo35258f()));
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (mo35256e() == BoundType.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public String toString() {
        String valueOf = String.valueOf(this.comparator);
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c = boundType == boundType2 ? '[' : '(';
        String valueOf2 = String.valueOf(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        String valueOf3 = String.valueOf(this.hasUpperBound ? this.upperEndpoint : "∞");
        char c2 = this.upperBoundType == boundType2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(valueOf.length() + 4 + valueOf2.length() + valueOf3.length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(c);
        sb.append(valueOf2);
        sb.append(',');
        sb.append(valueOf3);
        sb.append(c2);
        return sb.toString();
    }
}
