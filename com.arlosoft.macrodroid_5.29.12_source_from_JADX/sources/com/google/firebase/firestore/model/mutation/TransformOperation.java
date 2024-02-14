package com.google.firebase.firestore.model.mutation;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firestore.p228v1.Value;

public interface TransformOperation {
    /* renamed from: a */
    Value mo62880a(@Nullable Value value, Timestamp timestamp);

    @Nullable
    /* renamed from: b */
    Value mo62881b(@Nullable Value value);

    /* renamed from: c */
    Value mo62882c(@Nullable Value value, Value value2);
}
