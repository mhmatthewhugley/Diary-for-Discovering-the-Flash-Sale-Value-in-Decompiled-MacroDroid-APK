package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;
import org.apache.commons.cli.HelpFormatter;

public class OrderBy {

    /* renamed from: a */
    private final Direction f5943a;

    /* renamed from: b */
    final FieldPath f5944b;

    public enum Direction {
        ASCENDING(1),
        DESCENDING(-1);
        
        private final int comparisonModifier;

        private Direction(int i) {
            this.comparisonModifier = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo23910b() {
            return this.comparisonModifier;
        }
    }

    private OrderBy(Direction direction, FieldPath fieldPath) {
        this.f5943a = direction;
        this.f5944b = fieldPath;
    }

    /* renamed from: d */
    public static OrderBy m8134d(Direction direction, FieldPath fieldPath) {
        return new OrderBy(direction, fieldPath);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo23904a(Document document, Document document2) {
        int b;
        int i;
        if (this.f5944b.equals(FieldPath.f54449c)) {
            b = this.f5943a.mo23910b();
            i = document.getKey().compareTo(document2.getKey());
        } else {
            Value f = document.mo62823f(this.f5944b);
            Value f2 = document2.mo62823f(this.f5944b);
            Assert.m76443d((f == null || f2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            b = this.f5943a.mo23910b();
            i = Values.m75922i(f, f2);
        }
        return b * i;
    }

    /* renamed from: b */
    public Direction mo23905b() {
        return this.f5943a;
    }

    /* renamed from: c */
    public FieldPath mo23906c() {
        return this.f5944b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OrderBy)) {
            return false;
        }
        OrderBy orderBy = (OrderBy) obj;
        if (this.f5943a != orderBy.f5943a || !this.f5944b.equals(orderBy.f5944b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((899 + this.f5943a.hashCode()) * 31) + this.f5944b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5943a == Direction.ASCENDING ? "" : HelpFormatter.DEFAULT_OPT_PREFIX);
        sb.append(this.f5944b.mo62797e());
        return sb.toString();
    }
}
