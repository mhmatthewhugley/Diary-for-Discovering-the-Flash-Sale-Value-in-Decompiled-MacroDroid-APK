package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;

public class NumericIncrementTransformOperation implements TransformOperation {

    /* renamed from: a */
    private Value f54491a;

    public NumericIncrementTransformOperation(Value value) {
        Assert.m76443d(Values.m75937x(value), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f54491a = value;
    }

    /* renamed from: e */
    private double m75983e() {
        if (Values.m75932s(this.f54491a)) {
            return this.f54491a.mo63919j0();
        }
        if (Values.m75933t(this.f54491a)) {
            return (double) this.f54491a.mo63921l0();
        }
        throw Assert.m76440a("Expected 'operand' to be of Number type, but was " + this.f54491a.getClass().getCanonicalName(), new Object[0]);
    }

    /* renamed from: f */
    private long m75984f() {
        if (Values.m75932s(this.f54491a)) {
            return (long) this.f54491a.mo63919j0();
        }
        if (Values.m75933t(this.f54491a)) {
            return this.f54491a.mo63921l0();
        }
        throw Assert.m76440a("Expected 'operand' to be of Number type, but was " + this.f54491a.getClass().getCanonicalName(), new Object[0]);
    }

    /* renamed from: g */
    private long m75985g(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) >= 0) {
            return j3;
        }
        if (j3 >= 0) {
            return Long.MIN_VALUE;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }

    /* renamed from: a */
    public Value mo62880a(@Nullable Value value, Timestamp timestamp) {
        Value b = mo62881b(value);
        if (Values.m75933t(b) && Values.m75933t(this.f54491a)) {
            return (Value) Value.m78180r0().mo63933U(m75985g(b.mo63921l0(), m75984f())).build();
        } else if (Values.m75933t(b)) {
            return (Value) Value.m78180r0().mo63931S(((double) b.mo63921l0()) + m75983e()).build();
        } else {
            Assert.m76443d(Values.m75932s(b), "Expected NumberValue to be of type DoubleValue, but was ", value.getClass().getCanonicalName());
            return (Value) Value.m78180r0().mo63931S(b.mo63919j0() + m75983e()).build();
        }
    }

    /* renamed from: b */
    public Value mo62881b(@Nullable Value value) {
        return Values.m75937x(value) ? value : (Value) Value.m78180r0().mo63933U(0).build();
    }

    /* renamed from: c */
    public Value mo62882c(@Nullable Value value, Value value2) {
        return value2;
    }

    /* renamed from: d */
    public Value mo62928d() {
        return this.f54491a;
    }
}
