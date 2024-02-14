package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;

@GwtCompatible
public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a */
        private final String f52625a;

        /* renamed from: b */
        private ValueHolder f52626b;

        /* renamed from: c */
        private boolean f52627c;

        private static final class ValueHolder {

            /* renamed from: a */
            String f52628a;

            /* renamed from: b */
            Object f52629b;

            /* renamed from: c */
            ValueHolder f52630c;

            private ValueHolder() {
            }
        }

        public String toString() {
            boolean z = this.f52627c;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f52625a);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.f52626b.f52630c; valueHolder != null; valueHolder = valueHolder.f52630c) {
                if (!z || valueHolder.f52629b != null) {
                    sb.append(str);
                    String str2 = valueHolder.f52628a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(valueHolder.f52629b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
    }

    /* renamed from: a */
    public static boolean m72464a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
