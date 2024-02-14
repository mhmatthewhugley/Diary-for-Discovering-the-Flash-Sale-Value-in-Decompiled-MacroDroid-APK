package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Beta
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {
    }

    private static final class NaNLinearTransformation extends LinearTransformation {

        /* renamed from: a */
        static final NaNLinearTransformation f53038a = new NaNLinearTransformation();

        private NaNLinearTransformation() {
        }

        public String toString() {
            return "NaN";
        }
    }

    private static final class RegularLinearTransformation extends LinearTransformation {

        /* renamed from: a */
        final double f53039a;

        /* renamed from: b */
        final double f53040b;

        public String toString() {
            return String.format("y = %g * x + %g", new Object[]{Double.valueOf(this.f53039a), Double.valueOf(this.f53040b)});
        }
    }

    private static final class VerticalLinearTransformation extends LinearTransformation {

        /* renamed from: a */
        final double f53041a;

        public String toString() {
            return String.format("x = %g", new Object[]{Double.valueOf(this.f53041a)});
        }
    }
}
