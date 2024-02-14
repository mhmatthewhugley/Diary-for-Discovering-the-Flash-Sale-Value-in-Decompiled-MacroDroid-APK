package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.p228v1.Value;

public class ArrayContainsFilter extends FieldFilter {
    ArrayContainsFilter(FieldPath fieldPath, Value value) {
        super(fieldPath, Filter.Operator.ARRAY_CONTAINS, value);
    }

    /* renamed from: c */
    public boolean mo23807c(Document document) {
        Value f = document.mo62823f(mo23859b());
        return Values.m75931r(f) && Values.m75929p(f.mo63916f0(), mo23862f());
    }
}
