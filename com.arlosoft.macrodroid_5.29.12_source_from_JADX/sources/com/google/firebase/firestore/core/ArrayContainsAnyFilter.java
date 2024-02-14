package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;

public class ArrayContainsAnyFilter extends FieldFilter {
    ArrayContainsAnyFilter(FieldPath fieldPath, Value value) {
        super(fieldPath, Filter.Operator.ARRAY_CONTAINS_ANY, value);
        Assert.m76443d(Values.m75931r(value), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    /* renamed from: c */
    public boolean mo23807c(Document document) {
        Value f = document.mo62823f(mo23859b());
        if (!Values.m75931r(f)) {
            return false;
        }
        for (Value p : f.mo63916f0().mo63762l()) {
            if (Values.m75929p(mo23862f().mo63916f0(), p)) {
                return true;
            }
        }
        return false;
    }
}
