package androidx.window.embedding;

import android.content.Intent;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.core.util.Preconditions;
import androidx.paging.C0956a;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001!BW\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0002\u0010\u0010J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\nH\u0016J\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0002\b R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\u00020\n¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, mo71668d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "placeholderIntent", "Landroid/content/Intent;", "isSticky", "", "finishPrimaryWithSecondary", "", "minWidth", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(Ljava/util/Set;Landroid/content/Intent;ZIIIFI)V", "getFilters", "()Ljava/util/Set;", "getFinishPrimaryWithSecondary$annotations", "()V", "getFinishPrimaryWithSecondary", "()I", "()Z", "getPlaceholderIntent", "()Landroid/content/Intent;", "equals", "other", "", "hashCode", "plus", "filter", "plus$window_release", "Builder", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@ExperimentalWindowApi
/* compiled from: SplitPlaceholderRule.kt */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final int finishPrimaryWithSecondary;
    private final boolean isSticky;
    private final Intent placeholderIntent;

    @Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\rR\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo71668d2 = {"Landroidx/window/embedding/SplitPlaceholderRule$Builder;", "", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "placeholderIntent", "Landroid/content/Intent;", "minWidth", "", "minSmallestWidth", "(Ljava/util/Set;Landroid/content/Intent;II)V", "finishPrimaryWithSecondary", "getFinishPrimaryWithSecondary$annotations", "()V", "isSticky", "", "layoutDir", "getLayoutDir$annotations", "splitRatio", "", "build", "Landroidx/window/embedding/SplitPlaceholderRule;", "setFinishPrimaryWithSecondary", "setLayoutDir", "setSplitRatio", "setSticky", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SplitPlaceholderRule.kt */
    public static final class Builder {
        private final Set<ActivityFilter> filters;
        private int finishPrimaryWithSecondary = 1;
        private boolean isSticky;
        private int layoutDir = 3;
        private final int minSmallestWidth;
        private final int minWidth;
        private final Intent placeholderIntent;
        @FloatRange(from = 0.0d, mo592to = 1.0d)
        private float splitRatio = 0.5f;

        public Builder(Set<ActivityFilter> set, Intent intent, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
            C13706o.m87929f(set, "filters");
            C13706o.m87929f(intent, "placeholderIntent");
            this.filters = set;
            this.placeholderIntent = intent;
            this.minWidth = i;
            this.minSmallestWidth = i2;
        }

        private static /* synthetic */ void getFinishPrimaryWithSecondary$annotations() {
        }

        private static /* synthetic */ void getLayoutDir$annotations() {
        }

        public final SplitPlaceholderRule build() {
            return new SplitPlaceholderRule(this.filters, this.placeholderIntent, this.isSticky, this.finishPrimaryWithSecondary, this.minWidth, this.minSmallestWidth, this.splitRatio, this.layoutDir);
        }

        public final Builder setFinishPrimaryWithSecondary(int i) {
            this.finishPrimaryWithSecondary = i;
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

        public final Builder setSticky(boolean z) {
            this.isSticky = z;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SplitPlaceholderRule(java.util.Set r12, android.content.Intent r13, boolean r14, int r15, int r16, int r17, float r18, int r19, int r20, kotlin.jvm.internal.C13695i r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r6 = 1
            goto L_0x000a
        L_0x0009:
            r6 = r15
        L_0x000a:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0011
            r7 = 0
            goto L_0x0013
        L_0x0011:
            r7 = r16
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r8 = 0
            goto L_0x001b
        L_0x0019:
            r8 = r17
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0024
            r1 = 1056964608(0x3f000000, float:0.5)
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0026
        L_0x0024:
            r9 = r18
        L_0x0026:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002d
            r0 = 3
            r10 = 3
            goto L_0x002f
        L_0x002d:
            r10 = r19
        L_0x002f:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPlaceholderRule.<init>(java.util.Set, android.content.Intent, boolean, int, int, int, float, int, int, kotlin.jvm.internal.i):void");
    }

    public static /* synthetic */ void getFinishPrimaryWithSecondary$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return C13706o.m87924a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent) && this.isSticky == splitPlaceholderRule.isSticky && this.finishPrimaryWithSecondary == splitPlaceholderRule.finishPrimaryWithSecondary && C13706o.m87924a(this.filters, splitPlaceholderRule.filters);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final int getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.placeholderIntent.hashCode()) * 31) + C0956a.m550a(this.isSticky)) * 31) + this.finishPrimaryWithSecondary) * 31) + this.filters.hashCode();
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter activityFilter) {
        C13706o.m87929f(activityFilter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(activityFilter);
        return new SplitPlaceholderRule(C13566b0.m87407K0(linkedHashSet), this.placeholderIntent, this.isSticky, this.finishPrimaryWithSecondary, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> set, Intent intent, boolean z, int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, int i4) {
        super(i2, i3, f, i4);
        C13706o.m87929f(set, "filters");
        C13706o.m87929f(intent, "placeholderIntent");
        Preconditions.checkArgumentNonnegative(i2, "minWidth must be non-negative");
        Preconditions.checkArgumentNonnegative(i3, "minSmallestWidth must be non-negative");
        double d = (double) f;
        boolean z2 = false;
        if (0.0d <= d && d <= 1.0d) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "splitRatio must be in 0.0..1.0 range");
        this.filters = C13566b0.m87407K0(set);
        this.placeholderIntent = intent;
        this.isSticky = z;
        this.finishPrimaryWithSecondary = i;
    }
}
