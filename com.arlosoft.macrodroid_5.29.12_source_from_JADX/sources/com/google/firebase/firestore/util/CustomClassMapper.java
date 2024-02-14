package com.google.firebase.firestore.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CustomClassMapper {

    /* renamed from: a */
    private static final ConcurrentMap<Class<?>, BeanMapper<?>> f54764a = new ConcurrentHashMap();

    private static class BeanMapper<T> {
    }

    static class DeserializeContext {
    }

    static class ErrorPath {

        /* renamed from: d */
        static final ErrorPath f54765d = new ErrorPath((ErrorPath) null, (String) null, 0);

        /* renamed from: a */
        private final int f54766a;

        /* renamed from: b */
        private final ErrorPath f54767b;

        /* renamed from: c */
        private final String f54768c;

        ErrorPath(ErrorPath errorPath, String str, int i) {
            this.f54767b = errorPath;
            this.f54768c = str;
            this.f54766a = i;
        }

        public String toString() {
            int i = this.f54766a;
            if (i == 0) {
                return "";
            }
            if (i == 1) {
                return this.f54768c;
            }
            return this.f54767b.toString() + "." + this.f54768c;
        }
    }
}
