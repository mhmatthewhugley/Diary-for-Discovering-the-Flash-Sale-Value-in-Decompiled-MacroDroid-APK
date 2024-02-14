package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;
import java.util.ArrayList;
import java.util.List;

public class KeyFieldInFilter extends FieldFilter {

    /* renamed from: d */
    private final List<DocumentKey> f5927d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    KeyFieldInFilter(com.google.firebase.firestore.model.FieldPath r2, com.google.firestore.p228v1.Value r3) {
        /*
            r1 = this;
            com.google.firebase.firestore.core.Filter$Operator r0 = com.google.firebase.firestore.core.Filter.Operator.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5927d = r2
            java.util.List r3 = m8113i(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.KeyFieldInFilter.<init>(com.google.firebase.firestore.model.FieldPath, com.google.firestore.v1.Value):void");
    }

    /* renamed from: i */
    static List<DocumentKey> m8113i(Filter.Operator operator, Value value) {
        Assert.m76443d(operator == Filter.Operator.IN || operator == Filter.Operator.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        Assert.m76443d(Values.m75931r(value), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (Value next : value.mo63916f0().mo63762l()) {
            boolean y = Values.m75938y(next);
            Assert.m76443d(y, "Comparing on key with " + operator.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(DocumentKey.m75848g(next.mo63923n0()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public boolean mo23807c(Document document) {
        return this.f5927d.contains(document.getKey());
    }
}
