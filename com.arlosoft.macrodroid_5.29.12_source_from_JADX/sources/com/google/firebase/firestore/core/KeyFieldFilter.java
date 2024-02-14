package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;

public class KeyFieldFilter extends FieldFilter {

    /* renamed from: d */
    private final DocumentKey f5926d = DocumentKey.m75848g(mo23862f().mo63923n0());

    KeyFieldFilter(FieldPath fieldPath, Filter.Operator operator, Value value) {
        super(fieldPath, operator, value);
        Assert.m76443d(Values.m75938y(value), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
    }

    /* renamed from: c */
    public boolean mo23807c(Document document) {
        return mo23864h(document.getKey().compareTo(this.f5926d));
    }
}
