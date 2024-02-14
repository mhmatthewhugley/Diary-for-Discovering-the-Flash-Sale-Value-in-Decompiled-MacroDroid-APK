package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB/\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, mo71668d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(IIFI)V", "getLayoutDirection", "()I", "getMinSmallestWidth", "getMinWidth", "getSplitRatio", "()F", "checkParentBounds", "", "bounds", "Landroid/graphics/Rect;", "checkParentBounds$window_release", "checkParentMetrics", "parentMetrics", "Landroid/view/WindowMetrics;", "checkParentMetrics$window_release", "equals", "other", "", "hashCode", "Api30Impl", "Companion", "LayoutDir", "SplitFinishBehavior", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@ExperimentalWindowApi
/* compiled from: SplitRule.kt */
public class SplitRule extends EmbeddingRule {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int FINISH_ADJACENT = 2;
    public static final int FINISH_ALWAYS = 1;
    public static final int FINISH_NEVER = 0;
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    @RequiresApi(30)
    @Metadata(mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo71668d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "()V", "getBounds", "Landroid/graphics/Rect;", "windowMetrics", "Landroid/view/WindowMetrics;", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SplitRule.kt */
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final Rect getBounds(WindowMetrics windowMetrics) {
            C13706o.m87929f(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            C13706o.m87928e(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @Metadata(mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo71668d2 = {"Landroidx/window/embedding/SplitRule$Companion;", "", "()V", "FINISH_ADJACENT", "", "FINISH_ALWAYS", "FINISH_NEVER", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SplitRule.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }
    }

    @Metadata(mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo71668d2 = {"Landroidx/window/embedding/SplitRule$LayoutDir;", "", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: SplitRule.kt */
    public @interface LayoutDir {
    }

    @Metadata(mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo71668d2 = {"Landroidx/window/embedding/SplitRule$SplitFinishBehavior;", "", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: SplitRule.kt */
    public @interface SplitFinishBehavior {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitRule(int i, int i2, float f, int i3, int i4, C13695i iVar) {
        this(i, i2, (i4 & 4) != 0 ? 0.5f : f, (i4 & 8) != 0 ? 3 : i3);
    }

    public final boolean checkParentBounds$window_release(Rect rect) {
        C13706o.m87929f(rect, "bounds");
        boolean z = this.minWidth == 0 || rect.width() >= this.minWidth;
        boolean z2 = this.minSmallestWidth == 0 || Math.min(rect.width(), rect.height()) >= this.minSmallestWidth;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean checkParentMetrics$window_release(WindowMetrics windowMetrics) {
        C13706o.m87929f(windowMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        return checkParentBounds$window_release(Api30Impl.INSTANCE.getBounds(windowMetrics));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        if (this.minWidth != splitRule.minWidth || this.minSmallestWidth != splitRule.minSmallestWidth) {
            return false;
        }
        return ((this.splitRatio > splitRule.splitRatio ? 1 : (this.splitRatio == splitRule.splitRatio ? 0 : -1)) == 0) && this.layoutDirection == splitRule.layoutDirection;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + Float.floatToIntBits(this.splitRatio)) * 31) + this.layoutDirection;
    }

    public SplitRule(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, int i3) {
        this.minWidth = i;
        this.minSmallestWidth = i2;
        this.splitRatio = f;
        this.layoutDirection = i3;
    }
}
