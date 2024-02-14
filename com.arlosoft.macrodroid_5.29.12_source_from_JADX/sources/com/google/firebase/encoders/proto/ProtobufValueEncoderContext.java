package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;

class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* renamed from: a */
    private boolean f5613a = false;

    /* renamed from: b */
    private boolean f5614b = false;

    /* renamed from: c */
    private FieldDescriptor f5615c;

    /* renamed from: d */
    private final ProtobufDataEncoderContext f5616d;

    ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.f5616d = protobufDataEncoderContext;
    }

    /* renamed from: a */
    private void m7829a() {
        if (!this.f5613a) {
            this.f5613a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo23658b(FieldDescriptor fieldDescriptor, boolean z) {
        this.f5613a = false;
        this.f5615c = fieldDescriptor;
        this.f5614b = z;
    }

    @NonNull
    /* renamed from: d */
    public ValueEncoderContext mo23610d(@Nullable String str) throws IOException {
        m7829a();
        this.f5616d.mo23645h(this.f5615c, str, this.f5614b);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public ValueEncoderContext mo23611f(boolean z) throws IOException {
        m7829a();
        this.f5616d.mo23651n(this.f5615c, z, this.f5614b);
        return this;
    }
}
