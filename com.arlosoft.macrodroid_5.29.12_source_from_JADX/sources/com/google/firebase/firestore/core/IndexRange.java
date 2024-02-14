package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;

public class IndexRange {
    @Nullable

    /* renamed from: a */
    private final Value f5920a;
    @Nullable

    /* renamed from: b */
    private final Value f5921b;

    /* renamed from: c */
    private final FieldPath f5922c;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public FieldPath f5923a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Value f5924b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Value f5925c;

        /* renamed from: d */
        public IndexRange mo23888d() {
            Assert.m76443d(this.f5923a != null, "Field path must be specified", new Object[0]);
            return new IndexRange(this);
        }

        /* renamed from: e */
        public Builder mo23889e(Value value) {
            this.f5925c = value;
            return this;
        }

        /* renamed from: f */
        public Builder mo23890f(FieldPath fieldPath) {
            this.f5923a = fieldPath;
            return this;
        }

        /* renamed from: g */
        public Builder mo23891g(Value value) {
            this.f5924b = value;
            return this;
        }
    }

    /* renamed from: a */
    public static Builder m8104a() {
        return new Builder();
    }

    private IndexRange(Builder builder) {
        this.f5922c = builder.f5923a;
        this.f5920a = builder.f5924b;
        this.f5921b = builder.f5925c;
    }
}
