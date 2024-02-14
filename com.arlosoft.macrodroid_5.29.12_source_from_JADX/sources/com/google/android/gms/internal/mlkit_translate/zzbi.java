package com.google.android.gms.internal.mlkit_translate;

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

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzbi implements ObjectEncoderContext {

    /* renamed from: f */
    private static final Charset f43139f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final FieldDescriptor f43140g;

    /* renamed from: h */
    private static final FieldDescriptor f43141h;

    /* renamed from: i */
    private static final ObjectEncoder f43142i = zzbh.f43138a;

    /* renamed from: a */
    private OutputStream f43143a;

    /* renamed from: b */
    private final Map f43144b;

    /* renamed from: c */
    private final Map f43145c;

    /* renamed from: d */
    private final ObjectEncoder f43146d;

    /* renamed from: e */
    private final zzbm f43147e = new zzbm(this);

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("key");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43140g = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("value");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43141h = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
    }

    zzbi(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f43143a = outputStream;
        this.f43144b = map;
        this.f43145c = map2;
        this.f43146d = objectEncoder;
    }

    /* renamed from: k */
    static /* synthetic */ void m61614k(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.mo23608e(f43140g, entry.getKey());
        objectEncoderContext.mo23608e(f43141h, entry.getValue());
    }

    /* renamed from: l */
    private static int m61615l(FieldDescriptor fieldDescriptor) {
        zzbg zzbg = (zzbg) fieldDescriptor.mo23599c(zzbg.class);
        if (zzbg != null) {
            return zzbg.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final long m61616m(ObjectEncoder objectEncoder, Object obj) throws IOException {
        OutputStream outputStream;
        zzbd zzbd = new zzbd();
        try {
            outputStream = this.f43143a;
            this.f43143a = zzbd;
            objectEncoder.mo19314a(obj, this);
            this.f43143a = outputStream;
            long b = zzbd.mo52083b();
            zzbd.close();
            return b;
        } catch (Throwable th) {
            try {
                zzbd.close();
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
    private static zzbg m61617n(FieldDescriptor fieldDescriptor) {
        zzbg zzbg = (zzbg) fieldDescriptor.mo23599c(zzbg.class);
        if (zzbg != null) {
            return zzbg;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final zzbi m61618o(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        long m = m61616m(objectEncoder, obj);
        if (z && m == 0) {
            return this;
        }
        m61621r((m61615l(fieldDescriptor) << 3) | 2);
        m61622s(m);
        objectEncoder.mo19314a(obj, this);
        return this;
    }

    /* renamed from: p */
    private final zzbi m61619p(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        this.f43147e.mo52096a(fieldDescriptor, z);
        valueEncoder.mo23609a(obj, this.f43147e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m61620q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m61621r(int i) throws IOException {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.f43143a;
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
    private final void m61622s(long j) throws IOException {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.f43143a;
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
        mo52091h(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final /* synthetic */ ObjectEncoderContext mo23606b(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        mo52092i(fieldDescriptor, j, true);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final /* synthetic */ ObjectEncoderContext mo23607c(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        mo52091h(fieldDescriptor, i, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ObjectEncoderContext mo52088d(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m61621r((m61615l(fieldDescriptor) << 3) | 1);
        this.f43143a.write(m61620q(8).putDouble(d).array());
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final ObjectEncoderContext mo23608e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        mo52090g(fieldDescriptor, obj, true);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final ObjectEncoderContext mo52089f(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m61621r((m61615l(fieldDescriptor) << 3) | 5);
        this.f43143a.write(m61620q(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final ObjectEncoderContext mo52090g(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m61621r((m61615l(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f43139f);
            m61621r(bytes.length);
            this.f43143a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo52090g(fieldDescriptor, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m61618o(f43142i, fieldDescriptor, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo52088d(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo52089f(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo52092i(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo52091h(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m61621r((m61615l(fieldDescriptor) << 3) | 2);
            m61621r(bArr.length);
            this.f43143a.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f43144b.get(obj.getClass());
            if (objectEncoder != null) {
                m61618o(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f43145c.get(obj.getClass());
            if (valueEncoder != null) {
                m61619p(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof zzbe) {
                mo52091h(fieldDescriptor, ((zzbe) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                mo52091h(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m61618o(this.f43146d, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final zzbi mo52091h(@NonNull FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        zzbg n = m61617n(fieldDescriptor);
        zzbf zzbf = zzbf.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m61621r(n.zza() << 3);
            m61621r(i);
        } else if (ordinal == 1) {
            m61621r(n.zza() << 3);
            m61621r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m61621r((n.zza() << 3) | 5);
            this.f43143a.write(m61620q(4).putInt(i).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final zzbi mo52092i(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        zzbg n = m61617n(fieldDescriptor);
        zzbf zzbf = zzbf.DEFAULT;
        int ordinal = n.zzb().ordinal();
        if (ordinal == 0) {
            m61621r(n.zza() << 3);
            m61622s(j);
        } else if (ordinal == 1) {
            m61621r(n.zza() << 3);
            m61622s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m61621r((n.zza() << 3) | 1);
            this.f43143a.write(m61620q(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final zzbi mo52093j(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f43144b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.mo19314a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
