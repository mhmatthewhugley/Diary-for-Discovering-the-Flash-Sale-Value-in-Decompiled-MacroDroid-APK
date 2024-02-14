package com.google.firebase.firestore;

public abstract class FieldValue {

    /* renamed from: a */
    private static final DeleteFieldValue f5652a = new DeleteFieldValue();

    /* renamed from: b */
    private static final ServerTimestampFieldValue f5653b = new ServerTimestampFieldValue();

    static class ArrayRemoveFieldValue extends FieldValue {
    }

    static class ArrayUnionFieldValue extends FieldValue {
    }

    static class DeleteFieldValue extends FieldValue {
        DeleteFieldValue() {
        }
    }

    static class NumericIncrementFieldValue extends FieldValue {
    }

    static class ServerTimestampFieldValue extends FieldValue {
        ServerTimestampFieldValue() {
        }
    }

    FieldValue() {
    }
}
