package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MoreObjects {

    public static final class ToStringHelper {

        /* renamed from: a */
        private final String f4175a;

        /* renamed from: b */
        private final ValueHolder f4176b;

        /* renamed from: c */
        private ValueHolder f4177c;

        /* renamed from: d */
        private boolean f4178d;

        /* renamed from: e */
        private boolean f4179e;

        private static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
                super();
            }
        }

        private static class ValueHolder {

            /* renamed from: a */
            String f4180a;

            /* renamed from: b */
            Object f4181b;

            /* renamed from: c */
            ValueHolder f4182c;

            private ValueHolder() {
            }
        }

        /* renamed from: f */
        private ValueHolder m5335f() {
            ValueHolder valueHolder = new ValueHolder();
            this.f4177c.f4182c = valueHolder;
            this.f4177c = valueHolder;
            return valueHolder;
        }

        /* renamed from: g */
        private ToStringHelper m5336g(Object obj) {
            m5335f().f4181b = obj;
            return this;
        }

        /* renamed from: h */
        private ToStringHelper m5337h(String str, Object obj) {
            ValueHolder f = m5335f();
            f.f4181b = obj;
            f.f4180a = (String) Preconditions.m5392s(str);
            return this;
        }

        /* renamed from: i */
        private UnconditionalValueHolder m5338i() {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.f4177c.f4182c = unconditionalValueHolder;
            this.f4177c = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        /* renamed from: j */
        private ToStringHelper m5339j(String str, Object obj) {
            UnconditionalValueHolder i = m5338i();
            i.f4181b = obj;
            i.f4180a = (String) Preconditions.m5392s(str);
            return this;
        }

        /* renamed from: l */
        private static boolean m5340l(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof Optional) {
                    return !((Optional) obj).mo22080c();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public ToStringHelper mo22191a(String str, double d) {
            return m5339j(str, String.valueOf(d));
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public ToStringHelper mo22192b(String str, int i) {
            return m5339j(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public ToStringHelper mo22193c(String str, long j) {
            return m5339j(str, String.valueOf(j));
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public ToStringHelper mo22194d(String str, Object obj) {
            return m5337h(str, obj);
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public ToStringHelper mo22195e(String str, boolean z) {
            return m5339j(str, String.valueOf(z));
        }

        @CanIgnoreReturnValue
        /* renamed from: k */
        public ToStringHelper mo22196k(Object obj) {
            return m5336g(obj);
        }

        @CanIgnoreReturnValue
        /* renamed from: m */
        public ToStringHelper mo22197m() {
            this.f4178d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f4178d;
            boolean z2 = this.f4179e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f4175a);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.f4176b.f4182c; valueHolder != null; valueHolder = valueHolder.f4182c) {
                Object obj = valueHolder.f4181b;
                if (!(valueHolder instanceof UnconditionalValueHolder)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && m5340l(obj)) {
                    }
                }
                sb.append(str);
                String str2 = valueHolder.f4180a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f4176b = valueHolder;
            this.f4177c = valueHolder;
            this.f4178d = false;
            this.f4179e = false;
            this.f4175a = (String) Preconditions.m5392s(str);
        }
    }

    private MoreObjects() {
    }

    /* renamed from: a */
    public static <T> T m5332a(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    /* renamed from: b */
    public static ToStringHelper m5333b(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    /* renamed from: c */
    public static ToStringHelper m5334c(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}
