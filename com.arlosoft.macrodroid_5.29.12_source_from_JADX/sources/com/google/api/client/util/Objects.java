package com.google.api.client.util;

public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a */
        private final String f52825a;

        /* renamed from: b */
        private ValueHolder f52826b;

        /* renamed from: c */
        private ValueHolder f52827c;

        /* renamed from: d */
        private boolean f52828d;

        private static final class ValueHolder {

            /* renamed from: a */
            String f52829a;

            /* renamed from: b */
            Object f52830b;

            /* renamed from: c */
            ValueHolder f52831c;

            private ValueHolder() {
            }
        }

        ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f52826b = valueHolder;
            this.f52827c = valueHolder;
            this.f52825a = str;
        }

        /* renamed from: b */
        private ValueHolder m72710b() {
            ValueHolder valueHolder = new ValueHolder();
            this.f52827c.f52831c = valueHolder;
            this.f52827c = valueHolder;
            return valueHolder;
        }

        /* renamed from: c */
        private ToStringHelper m72711c(String str, Object obj) {
            ValueHolder b = m72710b();
            b.f52830b = obj;
            b.f52829a = (String) Preconditions.m72716d(str);
            return this;
        }

        /* renamed from: a */
        public ToStringHelper mo60778a(String str, Object obj) {
            return m72711c(str, obj);
        }

        public String toString() {
            boolean z = this.f52828d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f52825a);
            sb.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.f52826b.f52831c; valueHolder != null; valueHolder = valueHolder.f52831c) {
                if (!z || valueHolder.f52830b != null) {
                    sb.append(str);
                    String str2 = valueHolder.f52829a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(valueHolder.f52830b);
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
    public static boolean m72708a(Object obj, Object obj2) {
        return com.google.api.client.repackaged.com.google.common.base.Objects.m72464a(obj, obj2);
    }

    /* renamed from: b */
    public static ToStringHelper m72709b(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }
}
