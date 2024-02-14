package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;
import java.util.List;

public final class Bound {

    /* renamed from: a */
    private final boolean f5818a;

    /* renamed from: b */
    private final List<Value> f5819b;

    public Bound(List<Value> list, boolean z) {
        this.f5819b = list;
        this.f5818a = z;
    }

    /* renamed from: a */
    public String mo23810a() {
        StringBuilder sb = new StringBuilder();
        if (this.f5818a) {
            sb.append("b:");
        } else {
            sb.append("a:");
        }
        boolean z = true;
        for (Value next : this.f5819b) {
            if (!z) {
                sb.append(",");
            }
            z = false;
            sb.append(Values.m75915b(next));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public List<Value> mo23811b() {
        return this.f5819b;
    }

    /* renamed from: c */
    public boolean mo23812c() {
        return this.f5818a;
    }

    /* renamed from: d */
    public boolean mo23813d(List<OrderBy> list, Document document) {
        int i;
        Assert.m76443d(this.f5819b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f5819b.size(); i3++) {
            OrderBy orderBy = list.get(i3);
            Value value = this.f5819b.get(i3);
            if (orderBy.f5944b.equals(FieldPath.f54449c)) {
                Assert.m76443d(Values.m75938y(value), "Bound has a non-key value where the key path is being used %s", value);
                i = DocumentKey.m75848g(value.mo63923n0()).compareTo(document.getKey());
            } else {
                Value f = document.mo62823f(orderBy.mo23906c());
                Assert.m76443d(f != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                i = Values.m75922i(value, f);
            }
            if (orderBy.mo23905b().equals(OrderBy.Direction.DESCENDING)) {
                i *= -1;
            }
            i2 = i;
            if (i2 != 0) {
                break;
            }
        }
        if (this.f5818a) {
            if (i2 <= 0) {
                return true;
            }
        } else if (i2 < 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Bound.class != obj.getClass()) {
            return false;
        }
        Bound bound = (Bound) obj;
        if (this.f5818a != bound.f5818a || !this.f5819b.equals(bound.f5819b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f5818a ? 1 : 0) * true) + this.f5819b.hashCode();
    }

    public String toString() {
        return "Bound{before=" + this.f5818a + ", position=" + this.f5819b + '}';
    }
}
