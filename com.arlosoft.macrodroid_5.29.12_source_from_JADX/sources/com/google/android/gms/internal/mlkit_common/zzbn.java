package com.google.android.gms.internal.mlkit_common;

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

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzbn implements ObjectEncoderContext {

    /* renamed from: f */
    private static final Charset f41978f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final FieldDescriptor f41979g;

    /* renamed from: h */
    private static final FieldDescriptor f41980h;

    /* renamed from: i */
    private static final ObjectEncoder f41981i = zzbm.f41977a;

    /* renamed from: a */
    private OutputStream f41982a;

    /* renamed from: b */
    private final Map f41983b;

    /* renamed from: c */
    private final Map f41984c;

    /* renamed from: d */
    private final ObjectEncoder f41985d;

    /* renamed from: e */
    private final zzbr f41986e = new zzbr(this);

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("key");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f41979g = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("value");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f41980h = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
    }

    zzbn(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f41982a = outputStream;
        this.f41983b = map;
        this.f41984c = map2;
        this.f41985d = objectEncoder;
    }

    /* renamed from: k */
    static /* synthetic */ void m61203k(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.mo23608e(f41979g, entry.getKey());
        objectEncoderContext.mo23608e(f41980h, entry.getValue());
    }

    /* renamed from: l */
    private static int m61204l(FieldDescriptor fieldDescriptor) {
        zzbl zzbl = (zzbl) fieldDescriptor.mo23599c(zzbl.class);
        if (zzbl != null) {
            return zzbl.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final long m61205m(ObjectEncoder objectEncoder, Object obj) throws IOException {
        OutputStream outputStream;
        zzbi zzbi = new zzbi();
        try {
            outputStream = this.f41982a;
            this.f41982a = zzbi;
            objectEncoder.mo19314a(obj, this);
            this.f41982a = outputStream;
            long b = zzbi.mo51823b();
            zzbi.close();
            return b;
        } catch (Throwable th) {
            try {
                zzbi.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    /* renamed from: n */
    private static zzbl m61206n(FieldDescriptor fieldDescriptor) {
        zzbl zzbl = (zzbl) fieldDescriptor.mo23599c(zzbl.class);
        if (zzbl != null) {
            return zzbl;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final zzbn m61207o(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        long m = m61205m(objectEncoder, obj);
        if (z && m == 0) {
            return this;
        }
        m61210r((m61204l(fieldDescriptor) << 3) | 2);
        m61211s(m);
        objectEncoder.mo19314a(obj, this);
        return this;
    }

    /* renamed from: p */
    private final zzbn m61208p(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        this.f41986e.mo51836a(fieldDescriptor, z);
        valueEncoder.mo23609a(obj, this.f41986e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m61209q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m61210r(int i) throws IOException {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f41982a;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    /* renamed from: s */
    private final void m61211s(long j) throws IOException {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f41982a;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final /* synthetic */ ObjectEncoderContext mo23605a(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        mo51831h(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final /* synthetic */ ObjectEncoderContext mo23606b(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        mo51832i(fieldDescriptor, j, true);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final /* synthetic */ ObjectEncoderContext mo23607c(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        mo51831h(fieldDescriptor, i, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ObjectEncoderContext mo51828d(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m61210r((m61204l(fieldDescriptor) << 3) | 1);
        this.f41982a.write(m61209q(8).putDouble(d).array());
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final ObjectEncoderContext mo23608e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        mo51830g(fieldDescriptor, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final ObjectEncoderContext mo51829f(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m61210r((m61204l(fieldDescriptor) << 3) | 5);
        this.f41982a.write(m61209q(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final ObjectEncoderContext mo51830g(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m61210r((m61204l(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f41978f);
            m61210r(bytes.length);
            this.f41982a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo51830g(fieldDescriptor, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m61207o(f41981i, fieldDescriptor, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo51828d(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo51829f(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo51832i(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo51831h(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m61210r((m61204l(fieldDescriptor) << 3) | 2);
            m61210r(bArr.length);
            this.f41982a.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f41983b.get(obj.getClass());
            if (objectEncoder != null) {
                m61207o(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f41984c.get(obj.getClass());
            if (valueEncoder != null) {
                m61208p(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof zzbj) {
                mo51831h(fieldDescriptor, ((zzbj) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo51831h(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m61207o(this.f41985d, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final zzbn mo51831h(@NonNull FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        zzbl n = m61206n(fieldDescriptor);
        zzbk zzbk = zzbk.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m61210r(n.zza() << 3);
            m61210r(i);
        } else if (ordinal == 1) {
            m61210r(n.zza() << 3);
            m61210r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m61210r((n.zza() << 3) | 5);
            this.f41982a.write(m61209q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final zzbn mo51832i(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        zzbl n = m61206n(fieldDescriptor);
        zzbk zzbk = zzbk.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m61210r(n.zza() << 3);
            m61211s(j);
        } else if (ordinal == 1) {
            m61210r(n.zza() << 3);
            m61211s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m61210r((n.zza() << 3) | 1);
            this.f41982a.write(m61209q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final zzbn mo51833j(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f41983b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.mo19314a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
