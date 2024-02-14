package androidx.window.layout;

import androidx.annotation.RestrictTo;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.layout.WindowMetricsCalculator;

/* renamed from: androidx.window.layout.d */
/* compiled from: WindowMetricsCalculator.kt */
public final /* synthetic */ class C1313d {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
    }

    /* renamed from: a */
    public static WindowMetricsCalculator m606a() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: b */
    public static void m607b(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @ExperimentalWindowApi
    @RestrictTo({RestrictTo.Scope.TESTS})
    /* renamed from: c */
    public static void m608c() {
        WindowMetricsCalculator.Companion.reset();
    }
}
