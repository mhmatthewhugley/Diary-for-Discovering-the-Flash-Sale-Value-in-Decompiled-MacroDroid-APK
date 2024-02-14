package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.Value;

public class InFilter extends FieldFilter {
    InFilter(FieldPath fieldPath, Value value) {
        super(fieldPath, Filter.Operator.IN, value);
        Assert.m76443d(Values.m75931r(value), "InFilter expects an ArrayValue", new Object[0]);
    }

    /* renamed from: c */
    public boolean mo23807c(Document document) {
        Value f = document.mo62823f(mo23859b());
        return f != null && Values.m75929p(mo23862f().mo63916f0(), f);
    }
}
