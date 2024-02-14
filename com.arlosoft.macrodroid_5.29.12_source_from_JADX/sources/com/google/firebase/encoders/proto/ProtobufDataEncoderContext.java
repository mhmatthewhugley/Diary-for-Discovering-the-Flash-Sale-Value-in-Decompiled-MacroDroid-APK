package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

final class ProtobufDataEncoderContext implements ObjectEncoderContext {

    /* renamed from: f */
    private static final Charset f5596f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final FieldDescriptor f5597g = FieldDescriptor.m7731a("key").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

    /* renamed from: h */
    private static final FieldDescriptor f5598h = FieldDescriptor.m7731a("value").mo23604b(AtProtobuf.m7791b().mo23632c(2).mo23631a()).mo23603a();

    /* renamed from: i */
    private static final ObjectEncoder<Map.Entry<Object, Object>> f5599i = C1942a.f5617a;

    /* renamed from: a */
    private OutputStream f5600a;

    /* renamed from: b */
    private final Map<Class<?>, ObjectEncoder<?>> f5601b;

    /* renamed from: c */
    private final Map<Class<?>, ValueEncoder<?>> f5602c;

    /* renamed from: d */
    private final ObjectEncoder<Object> f5603d;

    /* renamed from: e */
    private final ProtobufValueEncoderContext f5604e = new ProtobufValueEncoderContext(this);

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1 */
    static /* synthetic */ class C19411 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5605a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5605a = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5605a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5605a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.proto.ProtobufDataEncoderContext.C19411.<clinit>():void");
        }
    }

    ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.f5600a = outputStream;
        this.f5601b = map;
        this.f5602c = map2;
        this.f5603d = objectEncoder;
    }

    /* renamed from: o */
    private static ByteBuffer m7797o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private <T> long m7798p(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        OutputStream outputStream;
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            outputStream = this.f5600a;
            this.f5600a = lengthCountingOutputStream;
            objectEncoder.mo19314a(t, this);
            this.f5600a = outputStream;
            long b = lengthCountingOutputStream.mo23639b();
            lengthCountingOutputStream.close();
            return b;
        } catch (Throwable th) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: q */
    private <T> ProtobufDataEncoderContext m7799q(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        long p = m7798p(objectEncoder, t);
        if (z && p == 0) {
            return this;
        }
        m7804w((m7802u(fieldDescriptor) << 3) | 2);
        m7805x(p);
        objectEncoder.mo19314a(t, this);
        return this;
    }

    /* renamed from: r */
    private <T> ProtobufDataEncoderContext m7800r(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        this.f5604e.mo23658b(fieldDescriptor, z);
        valueEncoder.mo23609a(t, this.f5604e);
        return this;
    }

    /* renamed from: t */
    private static Protobuf m7801t(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.mo23599c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    private static int m7802u(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.mo23599c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m7803v(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.mo23608e(f5597g, entry.getKey());
        objectEncoderContext.mo23608e(f5598h, entry.getValue());
    }

    /* renamed from: w */
    private void m7804w(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f5600a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f5600a.write(i & 127);
    }

    /* renamed from: x */
    private void m7805x(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f5600a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f5600a.write(((int) j) & 127);
    }

    @NonNull
    /* renamed from: e */
    public ObjectEncoderContext mo23608e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return mo23645h(fieldDescriptor, obj, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ObjectEncoderContext mo23643f(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m7804w((m7802u(fieldDescriptor) << 3) | 1);
        this.f5600a.write(m7797o(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ObjectEncoderContext mo23644g(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m7804w((m7802u(fieldDescriptor) << 3) | 5);
        this.f5600a.write(m7797o(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ObjectEncoderContext mo23645h(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m7804w((m7802u(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f5596f);
            m7804w(bytes.length);
            this.f5600a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object h : (Collection) obj) {
                mo23645h(fieldDescriptor, h, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry q : ((Map) obj).entrySet()) {
                m7799q(f5599i, fieldDescriptor, q, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo23643f(fieldDescriptor, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo23644g(fieldDescriptor, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo23649l(fieldDescriptor, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo23651n(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m7804w((m7802u(fieldDescriptor) << 3) | 2);
                m7804w(bArr.length);
                this.f5600a.write(bArr);
                return this;
            }
            ObjectEncoder objectEncoder = this.f5601b.get(obj.getClass());
            if (objectEncoder != null) {
                return m7799q(objectEncoder, fieldDescriptor, obj, z);
            }
            ValueEncoder valueEncoder = this.f5602c.get(obj.getClass());
            if (valueEncoder != null) {
                return m7800r(valueEncoder, fieldDescriptor, obj, z);
            }
            if (obj instanceof ProtoEnum) {
                return mo23607c(fieldDescriptor, ((ProtoEnum) obj).mo19517c());
            }
            if (obj instanceof Enum) {
                return mo23607c(fieldDescriptor, ((Enum) obj).ordinal());
            }
            return m7799q(this.f5603d, fieldDescriptor, obj, z);
        }
    }

    @NonNull
    /* renamed from: i */
    public ProtobufDataEncoderContext mo23607c(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        return mo23647j(fieldDescriptor, i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ProtobufDataEncoderContext mo23647j(@NonNull FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        Protobuf t = m7801t(fieldDescriptor);
        int i2 = C19411.f5605a[t.intEncoding().ordinal()];
        if (i2 == 1) {
            m7804w(t.tag() << 3);
            m7804w(i);
        } else if (i2 == 2) {
            m7804w(t.tag() << 3);
            m7804w((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m7804w((t.tag() << 3) | 5);
            this.f5600a.write(m7797o(4).putInt(i).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: k */
    public ProtobufDataEncoderContext mo23606b(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        return mo23649l(fieldDescriptor, j, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ProtobufDataEncoderContext mo23649l(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        Protobuf t = m7801t(fieldDescriptor);
        int i = C19411.f5605a[t.intEncoding().ordinal()];
        if (i == 1) {
            m7804w(t.tag() << 3);
            m7805x(j);
        } else if (i == 2) {
            m7804w(t.tag() << 3);
            m7805x((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m7804w((t.tag() << 3) | 1);
            this.f5600a.write(m7797o(8).putLong(j).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: m */
    public ProtobufDataEncoderContext mo23605a(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return mo23651n(fieldDescriptor, z, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public ProtobufDataEncoderContext mo23651n(@NonNull FieldDescriptor fieldDescriptor, boolean z, boolean z2) throws IOException {
        return mo23647j(fieldDescriptor, z ? 1 : 0, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public ProtobufDataEncoderContext mo23652s(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = this.f5601b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.mo19314a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
