package com.google.firebase.firestore.bundle;

import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;

public class BundledQuery implements BundleElement {

    /* renamed from: a */
    private final Target f5798a;

    /* renamed from: b */
    private final Query.LimitType f5799b;

    public BundledQuery(Target target, Query.LimitType limitType) {
        this.f5798a = target;
        this.f5799b = limitType;
    }

    /* renamed from: a */
    public Query.LimitType mo23791a() {
        return this.f5799b;
    }

    /* renamed from: b */
    public Target mo23792b() {
        return this.f5798a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BundledQuery bundledQuery = (BundledQuery) obj;
        if (this.f5798a.equals(bundledQuery.f5798a) && this.f5799b == bundledQuery.f5799b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f5798a.hashCode() * 31) + this.f5799b.hashCode();
    }
}
