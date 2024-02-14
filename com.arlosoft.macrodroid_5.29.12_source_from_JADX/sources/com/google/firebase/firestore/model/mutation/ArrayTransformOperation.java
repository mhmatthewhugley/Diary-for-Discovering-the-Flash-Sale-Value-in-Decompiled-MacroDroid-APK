package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.p228v1.ArrayValue;
import com.google.firestore.p228v1.Value;
import java.util.Collections;
import java.util.List;

public abstract class ArrayTransformOperation implements TransformOperation {

    /* renamed from: a */
    private final List<Value> f54473a;

    public static class Remove extends ArrayTransformOperation {
        public Remove(List<Value> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public Value mo62883d(@Nullable Value value) {
            ArrayValue.Builder e = ArrayTransformOperation.m75940e(value);
            for (Value next : mo62885f()) {
                int i = 0;
                while (i < e.mo63766R()) {
                    if (Values.m75930q(e.mo63765P(i), next)) {
                        e.mo63767S(i);
                    } else {
                        i++;
                    }
                }
            }
            return (Value) Value.m78180r0().mo63928O(e).build();
        }
    }

    public static class Union extends ArrayTransformOperation {
        public Union(List<Value> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public Value mo62883d(@Nullable Value value) {
            ArrayValue.Builder e = ArrayTransformOperation.m75940e(value);
            for (Value next : mo62885f()) {
                if (!Values.m75929p(e, next)) {
                    e.mo63764O(next);
                }
            }
            return (Value) Value.m78180r0().mo63928O(e).build();
        }
    }

    ArrayTransformOperation(List<Value> list) {
        this.f54473a = Collections.unmodifiableList(list);
    }

    /* renamed from: e */
    static ArrayValue.Builder m75940e(@Nullable Value value) {
        if (Values.m75931r(value)) {
            return (ArrayValue.Builder) value.mo63916f0().mo65173b();
        }
        return ArrayValue.m77721d0();
    }

    /* renamed from: a */
    public Value mo62880a(@Nullable Value value, Timestamp timestamp) {
        return mo62883d(value);
    }

    @Nullable
    /* renamed from: b */
    public Value mo62881b(@Nullable Value value) {
        return null;
    }

    /* renamed from: c */
    public Value mo62882c(@Nullable Value value, Value value2) {
        return mo62883d(value);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Value mo62883d(@Nullable Value value);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f54473a.equals(((ArrayTransformOperation) obj).f54473a);
    }

    /* renamed from: f */
    public List<Value> mo62885f() {
        return this.f54473a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f54473a.hashCode();
    }
}
