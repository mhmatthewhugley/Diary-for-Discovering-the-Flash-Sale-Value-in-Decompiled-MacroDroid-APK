package androidx.window.embedding;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.core.util.Preconditions;
import androidx.paging.C0956a;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001!B[\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0002\b R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u0006¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\""}, mo71668d2 = {"Landroidx/window/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/SplitPairFilter;", "finishPrimaryWithSecondary", "", "finishSecondaryWithPrimary", "clearTop", "", "minWidth", "minSmallestWidth", "splitRatio", "", "layoutDir", "(Ljava/util/Set;IIZIIFI)V", "getClearTop", "()Z", "getFilters", "()Ljava/util/Set;", "getFinishPrimaryWithSecondary$annotations", "()V", "getFinishPrimaryWithSecondary", "()I", "getFinishSecondaryWithPrimary$annotations", "getFinishSecondaryWithPrimary", "equals", "other", "", "hashCode", "plus", "filter", "plus$window_release", "Builder", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@ExperimentalWindowApi
/* compiled from: SplitPairRule.kt */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final int finishPrimaryWithSecondary;
    private final int finishSecondaryWithPrimary;

    @Metadata(mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\rR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo71668d2 = {"Landroidx/window/embedding/SplitPairRule$Builder;", "", "filters", "", "Landroidx/window/embedding/SplitPairFilter;", "minWidth", "", "minSmallestWidth", "(Ljava/util/Set;II)V", "clearTop", "", "finishPrimaryWithSecondary", "getFinishPrimaryWithSecondary$annotations", "()V", "finishSecondaryWithPrimary", "getFinishSecondaryWithPrimary$annotations", "layoutDir", "getLayoutDir$annotations", "splitRatio", "", "build", "Landroidx/window/embedding/SplitPairRule;", "setClearTop", "setFinishPrimaryWithSecondary", "setFinishSecondaryWithPrimary", "setLayoutDir", "setSplitRatio", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SplitPairRule.kt */
    public static final class Builder {
        private boolean clearTop;
        private final Set<SplitPairFilter> filters;
        private int finishPrimaryWithSecondary;
        private int finishSecondaryWithPrimary = 1;
        private int layoutDir = 3;
        private final int minSmallestWidth;
        private final int minWidth;
        @FloatRange(from = 0.0d, mo592to = 1.0d)
        private float splitRatio = 0.5f;

        public Builder(Set<SplitPairFilter> set, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            C13706o.m87929f(set, "filters");
            this.filters = set;
            this.minWidth = i;
            this.minSmallestWidth = i2;
        }

        private static /* synthetic */ void getFinishPrimaryWithSecondary$annotations() {
        }

        private static /* synthetic */ void getFinishSecondaryWithPrimary$annotations() {
        }

        private static /* synthetic */ void getLayoutDir$annotations() {
        }

        public final SplitPairRule build() {
            return new SplitPairRule(this.filters, this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, this.minWidth, this.minSmallestWidth, this.splitRatio, this.layoutDir);
        }

        public final Builder setClearTop(boolean z) {
            this.clearTop = z;
            return this;
        }

        public final Builder setFinishPrimaryWithSecondary(int i) {
            this.finishPrimaryWithSecondary = i;
            return this;
        }

        public final Builder setFinishSecondaryWithPrimary(int i) {
            this.finishSecondaryWithPrimary = i;
            return this;
        }

        public final Builder setLayoutDir(int i) {
            this.layoutDir = i;
            return this;
        }

        public final Builder setSplitRatio(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
            this.splitRatio = f;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SplitPairRule(java.util.Set r13, int r14, int r15, boolean r16, int r17, int r18, float r19, int r20, int r21, kotlin.jvm.internal.C13695i r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = 0
            goto L_0x000a
        L_0x0009:
            r5 = r14
        L_0x000a:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r1 = 1
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = r15
        L_0x0012:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0018
            r7 = 0
            goto L_0x001a
        L_0x0018:
            r7 = r16
        L_0x001a:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0023
            r1 = 1056964608(0x3f000000, float:0.5)
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0025
        L_0x0023:
            r10 = r19
        L_0x0025:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002c
            r0 = 3
            r11 = 3
            goto L_0x002e
        L_0x002c:
            r11 = r20
        L_0x002e:
            r3 = r12
            r4 = r13
            r8 = r17
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairRule.<init>(java.util.Set, int, int, boolean, int, int, float, int, int, kotlin.jvm.internal.i):void");
    }

    public static /* synthetic */ void getFinishPrimaryWithSecondary$annotations() {
    }

    public static /* synthetic */ void getFinishSecondaryWithPrimary$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return C13706o.m87924a(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final int getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final int getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.finishPrimaryWithSecondary) * 31) + this.finishSecondaryWithPrimary) * 31) + C0956a.m550a(this.clearTop);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter splitPairFilter) {
        C13706o.m87929f(splitPairFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(splitPairFilter);
        return new SplitPairRule(C13566b0.m87407K0(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> set, int i, int i2, boolean z, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, int i5) {
        super(i3, i4, f, i5);
        C13706o.m87929f(set, "filters");
        Preconditions.checkArgumentNonnegative(i3, "minWidth must be non-negative");
        Preconditions.checkArgumentNonnegative(i4, "minSmallestWidth must be non-negative");
        double d = (double) f;
        boolean z2 = false;
        if (0.0d <= d && d <= 1.0d) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "splitRatio must be in 0.0..1.0 range");
        this.filters = C13566b0.m87407K0(set);
        this.clearTop = z;
        this.finishPrimaryWithSecondary = i;
        this.finishSecondaryWithPrimary = i2;
    }
}
