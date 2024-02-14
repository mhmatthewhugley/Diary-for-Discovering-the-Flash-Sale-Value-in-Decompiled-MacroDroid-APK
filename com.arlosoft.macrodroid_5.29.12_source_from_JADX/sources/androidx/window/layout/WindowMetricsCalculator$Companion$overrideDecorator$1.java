package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: WindowMetricsCalculator.kt */
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends C13704m implements C16265l<WindowMetricsCalculator, WindowMetricsCalculator> {
    WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        C13706o.m87929f(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
