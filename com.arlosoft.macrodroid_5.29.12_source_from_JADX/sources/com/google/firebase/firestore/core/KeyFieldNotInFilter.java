package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.List;

public class KeyFieldNotInFilter extends FieldFilter {

    /* renamed from: d */
    private final List<DocumentKey> f5928d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    KeyFieldNotInFilter(com.google.firebase.firestore.model.FieldPath r2, com.google.firestore.p228v1.Value r3) {
        /*
            r1 = this;
            com.google.firebase.firestore.core.Filter$Operator r0 = com.google.firebase.firestore.core.Filter.Operator.NOT_IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5928d = r2
            java.util.List r3 = com.google.firebase.firestore.core.KeyFieldInFilter.m8113i(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.KeyFieldNotInFilter.<init>(com.google.firebase.firestore.model.FieldPath, com.google.firestore.v1.Value):void");
    }

    /* renamed from: c */
    public boolean mo23807c(Document document) {
        return !this.f5928d.contains(document.getKey());
    }
}
