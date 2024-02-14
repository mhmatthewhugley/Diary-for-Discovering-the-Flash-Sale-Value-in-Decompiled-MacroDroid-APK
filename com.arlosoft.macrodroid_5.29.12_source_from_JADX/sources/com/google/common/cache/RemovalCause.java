package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum RemovalCause {
    EXPLICIT {
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22547d() {
            return false;
        }
    },
    REPLACED {
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22547d() {
            return false;
        }
    },
    COLLECTED {
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22547d() {
            return true;
        }
    },
    EXPIRED {
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22547d() {
            return true;
        }
    },
    SIZE {
        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22547d() {
            return true;
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo22547d();
}
