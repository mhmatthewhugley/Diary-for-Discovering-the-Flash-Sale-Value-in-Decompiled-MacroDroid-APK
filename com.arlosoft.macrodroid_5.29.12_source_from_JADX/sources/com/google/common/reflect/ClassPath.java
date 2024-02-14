package com.google.common.reflect;

import com.google.common.base.Splitter;
import java.io.File;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public final class ClassPath {

    /* renamed from: a */
    private static final Logger f53269a = Logger.getLogger(ClassPath.class.getName());

    /* renamed from: b */
    private static final Splitter f53270b = Splitter.m5430i(" ").mo22235e();

    public static final class ClassInfo extends ResourceInfo {

        /* renamed from: c */
        private final String f53271c;

        public String toString() {
            return this.f53271c;
        }
    }

    static final class LocationInfo {

        /* renamed from: a */
        final File f53272a;

        /* renamed from: b */
        private final ClassLoader f53273b;

        public boolean equals(Object obj) {
            if (!(obj instanceof LocationInfo)) {
                return false;
            }
            LocationInfo locationInfo = (LocationInfo) obj;
            if (!this.f53272a.equals(locationInfo.f53272a) || !this.f53273b.equals(locationInfo.f53273b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f53272a.hashCode();
        }

        public String toString() {
            return this.f53272a.toString();
        }
    }

    public static class ResourceInfo {

        /* renamed from: a */
        private final String f53274a;

        /* renamed from: b */
        final ClassLoader f53275b;

        public boolean equals(Object obj) {
            if (!(obj instanceof ResourceInfo)) {
                return false;
            }
            ResourceInfo resourceInfo = (ResourceInfo) obj;
            if (!this.f53274a.equals(resourceInfo.f53274a) || this.f53275b != resourceInfo.f53275b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f53274a.hashCode();
        }

        public String toString() {
            return this.f53274a;
        }
    }
}
