package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class ProtobufEncoder {

    /* renamed from: a */
    private final Map<Class<?>, ObjectEncoder<?>> f5606a;

    /* renamed from: b */
    private final Map<Class<?>, ValueEncoder<?>> f5607b;

    /* renamed from: c */
    private final ObjectEncoder<Object> f5608c;

    public static final class Builder implements EncoderConfig<Builder> {

        /* renamed from: d */
        private static final ObjectEncoder<Object> f5609d = C1943b.f5618a;

        /* renamed from: a */
        private final Map<Class<?>, ObjectEncoder<?>> f5610a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, ValueEncoder<?>> f5611b = new HashMap();

        /* renamed from: c */
        private ObjectEncoder<Object> f5612c = f5609d;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m7824e(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public ProtobufEncoder mo23655c() {
            return new ProtobufEncoder(new HashMap(this.f5610a), new HashMap(this.f5611b), this.f5612c);
        }

        @NonNull
        /* renamed from: d */
        public Builder mo23656d(@NonNull Configurator configurator) {
            configurator.mo19313a(this);
            return this;
        }

        @NonNull
        /* renamed from: f */
        public <U> Builder mo23612a(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.f5610a.put(cls, objectEncoder);
            this.f5611b.remove(cls);
            return this;
        }
    }

    ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.f5606a = map;
        this.f5607b = map2;
        this.f5608c = objectEncoder;
    }

    /* renamed from: a */
    public static Builder m7820a() {
        return new Builder();
    }

    /* renamed from: b */
    public void mo23653b(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new ProtobufDataEncoderContext(outputStream, this.f5606a, this.f5607b, this.f5608c).mo23652s(obj);
    }

    @NonNull
    /* renamed from: c */
    public byte[] mo23654c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo23653b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
