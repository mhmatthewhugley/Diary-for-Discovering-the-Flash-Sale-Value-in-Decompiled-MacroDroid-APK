package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

public interface ObjectEncoderContext {
    @NonNull
    /* renamed from: a */
    ObjectEncoderContext mo23605a(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException;

    @NonNull
    /* renamed from: b */
    ObjectEncoderContext mo23606b(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException;

    @NonNull
    /* renamed from: c */
    ObjectEncoderContext mo23607c(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException;

    @NonNull
    /* renamed from: e */
    ObjectEncoderContext mo23608e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException;
}
