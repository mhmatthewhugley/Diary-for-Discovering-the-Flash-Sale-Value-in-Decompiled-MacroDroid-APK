package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;

public abstract class Filter {

    public enum Operator {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");
        
        private final String text;

        private Operator(String str) {
            this.text = str;
        }

        public String toString() {
            return this.text;
        }
    }

    /* renamed from: a */
    public abstract String mo23858a();

    /* renamed from: b */
    public abstract FieldPath mo23859b();

    /* renamed from: c */
    public abstract boolean mo23807c(Document document);
}
