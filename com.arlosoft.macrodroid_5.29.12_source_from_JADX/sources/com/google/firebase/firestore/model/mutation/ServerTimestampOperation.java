package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firestore.p228v1.Value;

public class ServerTimestampOperation implements TransformOperation {

    /* renamed from: a */
    private static final ServerTimestampOperation f54497a = new ServerTimestampOperation();

    private ServerTimestampOperation() {
    }

    /* renamed from: d */
    public static ServerTimestampOperation m76001d() {
        return f54497a;
    }

    /* renamed from: a */
    public Value mo62880a(@Nullable Value value, Timestamp timestamp) {
        return ServerTimestamps.m75909c(timestamp, value);
    }

    @Nullable
    /* renamed from: b */
    public Value mo62881b(@Nullable Value value) {
        return null;
    }

    /* renamed from: c */
    public Value mo62882c(@Nullable Value value, Value value2) {
        return value2;
    }
}
