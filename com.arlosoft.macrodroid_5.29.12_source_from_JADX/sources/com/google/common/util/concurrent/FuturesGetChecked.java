package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class FuturesGetChecked {

    /* renamed from: a */
    private static final Ordering<Constructor<?>> f53587a = Ordering.m28521e().mo36268i(new Function<Constructor<?>, Boolean>() {
        /* renamed from: a */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }).mo34739j();

    @VisibleForTesting
    interface GetCheckedTypeValidator {
    }

    @VisibleForTesting
    static class GetCheckedTypeValidatorHolder {

        /* renamed from: a */
        static final GetCheckedTypeValidator f53588a = m74228a();

        enum WeakSetValidator implements GetCheckedTypeValidator {
            INSTANCE;
            

            /* renamed from: c */
            private static final Set<WeakReference<Class<? extends Exception>>> f53590c = null;

            static {
                f53590c = new CopyOnWriteArraySet();
            }
        }

        GetCheckedTypeValidatorHolder() {
        }

        /* renamed from: a */
        static GetCheckedTypeValidator m74228a() {
            return FuturesGetChecked.m74226a();
        }
    }

    private FuturesGetChecked() {
    }

    @VisibleForTesting
    /* renamed from: a */
    static GetCheckedTypeValidator m74226a() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }
}
