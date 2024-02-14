package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.MapValue;
import com.google.firestore.p228v1.Value;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class ObjectValue implements Cloneable {

    /* renamed from: a */
    private Value f54465a;

    /* renamed from: c */
    private Map<String, Object> f54466c;

    public ObjectValue(Value value) {
        this.f54466c = new HashMap();
        Assert.m76443d(value.mo63926q0() == Value.ValueTypeCase.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        Assert.m76443d(!ServerTimestamps.m75908b(value), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f54465a = value;
    }

    @Nullable
    /* renamed from: a */
    private MapValue m75889a(FieldPath fieldPath, Map<String, Object> map) {
        MapValue.Builder builder;
        Value f = m75892f(this.f54465a, fieldPath);
        if (Values.m75934u(f)) {
            builder = (MapValue.Builder) f.mo63922m0().mo65173b();
        } else {
            builder = MapValue.m77924d0();
        }
        boolean z = false;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Map) {
                MapValue a = m75889a((FieldPath) fieldPath.mo62796d(str), (Map) value);
                if (a != null) {
                    builder.mo63837P(str, (Value) Value.m78180r0().mo63935X(a).build());
                }
            } else if (value instanceof Value) {
                builder.mo63837P(str, (Value) value);
            } else if (builder.mo63835N(str)) {
                Assert.m76443d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                builder.mo63838R(str);
            }
            z = true;
        }
        if (z) {
            return (MapValue) builder.build();
        }
        return null;
    }

    /* renamed from: b */
    private Value m75890b() {
        MapValue a = m75889a(FieldPath.f54450d, this.f54466c);
        if (a != null) {
            this.f54465a = (Value) Value.m78180r0().mo63935X(a).build();
            this.f54466c.clear();
        }
        return this.f54465a;
    }

    /* renamed from: e */
    private FieldMask m75891e(MapValue mapValue) {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : mapValue.mo63832X().entrySet()) {
            FieldPath t = FieldPath.m75865t((String) next.getKey());
            if (Values.m75934u((Value) next.getValue())) {
                Set<FieldPath> b = m75891e(((Value) next.getValue()).mo63922m0()).mo62892b();
                if (b.isEmpty()) {
                    hashSet.add(t);
                } else {
                    for (FieldPath b2 : b) {
                        hashSet.add((FieldPath) t.mo62794b(b2));
                    }
                }
            } else {
                hashSet.add(t);
            }
        }
        return FieldMask.m75950a(hashSet);
    }

    @Nullable
    /* renamed from: f */
    private Value m75892f(Value value, FieldPath fieldPath) {
        if (fieldPath.mo62804k()) {
            return value;
        }
        for (int i = 0; i < fieldPath.mo62807n() - 1; i++) {
            value = value.mo63922m0().mo63833Y(fieldPath.mo62803j(i), (Value) null);
            if (!Values.m75934u(value)) {
                return null;
            }
        }
        return value.mo63922m0().mo63833Y(fieldPath.mo62802i(), (Value) null);
    }

    /* renamed from: g */
    public static ObjectValue m75893g(Map<String, Value> map) {
        return new ObjectValue((Value) Value.m78180r0().mo63934V(MapValue.m77924d0().mo63836O(map)).build());
    }

    /* renamed from: p */
    private void m75894p(FieldPath fieldPath, @Nullable Value value) {
        Map<String, Object> hashMap;
        Map<String, Object> map = this.f54466c;
        for (int i = 0; i < fieldPath.mo62807n() - 1; i++) {
            String j = fieldPath.mo62803j(i);
            Object obj = map.get(j);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof Value) {
                    Value value2 = (Value) obj;
                    if (value2.mo63926q0() == Value.ValueTypeCase.MAP_VALUE) {
                        HashMap hashMap2 = new HashMap(value2.mo63922m0().mo63832X());
                        map.put(j, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap<>();
                map.put(j, hashMap);
            }
            map = hashMap;
        }
        map.put(fieldPath.mo62802i(), value);
    }

    @NonNull
    /* renamed from: c */
    public ObjectValue clone() {
        return new ObjectValue(m75890b());
    }

    /* renamed from: d */
    public void mo62864d(FieldPath fieldPath) {
        Assert.m76443d(!fieldPath.mo62804k(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        m75894p(fieldPath, (Value) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ObjectValue) {
            return Values.m75930q(m75890b(), ((ObjectValue) obj).m75890b());
        }
        return false;
    }

    @Nullable
    /* renamed from: h */
    public Value mo62866h(FieldPath fieldPath) {
        return m75892f(m75890b(), fieldPath);
    }

    public int hashCode() {
        return m75890b().hashCode();
    }

    /* renamed from: k */
    public FieldMask mo62868k() {
        return m75891e(m75890b().mo63922m0());
    }

    /* renamed from: l */
    public Map<String, Value> mo62869l() {
        return m75890b().mo63922m0().mo63832X();
    }

    /* renamed from: n */
    public void mo62870n(FieldPath fieldPath, Value value) {
        Assert.m76443d(!fieldPath.mo62804k(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        m75894p(fieldPath, value);
    }

    /* renamed from: o */
    public void mo62871o(Map<FieldPath, Value> map) {
        for (Map.Entry next : map.entrySet()) {
            FieldPath fieldPath = (FieldPath) next.getKey();
            if (next.getValue() == null) {
                mo62864d(fieldPath);
            } else {
                mo62870n(fieldPath, (Value) next.getValue());
            }
        }
    }

    @NonNull
    public String toString() {
        return "ObjectValue{internalValue=" + m75890b() + '}';
    }

    public ObjectValue() {
        this((Value) Value.m78180r0().mo63935X(MapValue.m77920V()).build());
    }
}
