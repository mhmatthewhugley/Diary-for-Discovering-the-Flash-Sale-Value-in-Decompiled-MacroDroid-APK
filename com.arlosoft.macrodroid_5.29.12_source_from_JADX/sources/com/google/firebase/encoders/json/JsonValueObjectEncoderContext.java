package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* renamed from: a */
    private JsonValueObjectEncoderContext f5577a = null;

    /* renamed from: b */
    private boolean f5578b = true;

    /* renamed from: c */
    private final JsonWriter f5579c;

    /* renamed from: d */
    private final Map<Class<?>, ObjectEncoder<?>> f5580d;

    /* renamed from: e */
    private final Map<Class<?>, ValueEncoder<?>> f5581e;

    /* renamed from: f */
    private final ObjectEncoder<Object> f5582f;

    /* renamed from: g */
    private final boolean f5583g;

    JsonValueObjectEncoderContext(@NonNull Writer writer, @NonNull Map<Class<?>, ObjectEncoder<?>> map, @NonNull Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z) {
        this.f5579c = new JsonWriter(writer);
        this.f5580d = map;
        this.f5581e = map2;
        this.f5582f = objectEncoder;
        this.f5583g = z;
    }

    /* renamed from: q */
    private boolean m7766q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: t */
    private JsonValueObjectEncoderContext m7767t(@NonNull String str, @Nullable Object obj) throws IOException, EncodingException {
        m7769v();
        this.f5579c.name(str);
        if (obj != null) {
            return mo23621i(obj, false);
        }
        this.f5579c.nullValue();
        return this;
    }

    /* renamed from: u */
    private JsonValueObjectEncoderContext m7768u(@NonNull String str, @Nullable Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        m7769v();
        this.f5579c.name(str);
        return mo23621i(obj, false);
    }

    /* renamed from: v */
    private void m7769v() throws IOException {
        if (this.f5578b) {
            JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.f5577a;
            if (jsonValueObjectEncoderContext != null) {
                jsonValueObjectEncoderContext.m7769v();
                this.f5577a.f5578b = false;
                this.f5577a = null;
                this.f5579c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @NonNull
    /* renamed from: a */
    public ObjectEncoderContext mo23605a(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return mo23626n(fieldDescriptor.mo23598b(), z);
    }

    @NonNull
    /* renamed from: b */
    public ObjectEncoderContext mo23606b(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        return mo23624l(fieldDescriptor.mo23598b(), j);
    }

    @NonNull
    /* renamed from: c */
    public ObjectEncoderContext mo23607c(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        return mo23623k(fieldDescriptor.mo23598b(), i);
    }

    @NonNull
    /* renamed from: e */
    public ObjectEncoderContext mo23608e(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return mo23625m(fieldDescriptor.mo23598b(), obj);
    }

    @NonNull
    /* renamed from: g */
    public JsonValueObjectEncoderContext mo23619g(int i) throws IOException {
        m7769v();
        this.f5579c.value((long) i);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public JsonValueObjectEncoderContext mo23620h(long j) throws IOException {
        m7769v();
        this.f5579c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public JsonValueObjectEncoderContext mo23621i(@Nullable Object obj, boolean z) throws IOException {
        Class<?> cls;
        int i = 0;
        if (z && m7766q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f5579c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f5579c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo23628p((byte[]) obj);
            }
            this.f5579c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f5579c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo23620h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f5579c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f5579c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo23621i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo23621i(i3, false);
                }
            }
            this.f5579c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f5579c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo23621i(i4, false);
            }
            this.f5579c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f5579c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo23625m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f5579c.endObject();
            return this;
        } else {
            ObjectEncoder objectEncoder = this.f5580d.get(obj.getClass());
            if (objectEncoder != null) {
                return mo23630s(objectEncoder, obj, z);
            }
            ValueEncoder valueEncoder = this.f5581e.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.mo23609a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo23630s(this.f5582f, obj, z);
            } else {
                mo23610d(((Enum) obj).name());
                return this;
            }
        }
    }

    @NonNull
    /* renamed from: j */
    public JsonValueObjectEncoderContext mo23610d(@Nullable String str) throws IOException {
        m7769v();
        this.f5579c.value(str);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public JsonValueObjectEncoderContext mo23623k(@NonNull String str, int i) throws IOException {
        m7769v();
        this.f5579c.name(str);
        return mo23619g(i);
    }

    @NonNull
    /* renamed from: l */
    public JsonValueObjectEncoderContext mo23624l(@NonNull String str, long j) throws IOException {
        m7769v();
        this.f5579c.name(str);
        return mo23620h(j);
    }

    @NonNull
    /* renamed from: m */
    public JsonValueObjectEncoderContext mo23625m(@NonNull String str, @Nullable Object obj) throws IOException {
        if (this.f5583g) {
            return m7768u(str, obj);
        }
        return m7767t(str, obj);
    }

    @NonNull
    /* renamed from: n */
    public JsonValueObjectEncoderContext mo23626n(@NonNull String str, boolean z) throws IOException {
        m7769v();
        this.f5579c.name(str);
        return mo23611f(z);
    }

    @NonNull
    /* renamed from: o */
    public JsonValueObjectEncoderContext mo23611f(boolean z) throws IOException {
        m7769v();
        this.f5579c.value(z);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public JsonValueObjectEncoderContext mo23628p(@Nullable byte[] bArr) throws IOException {
        m7769v();
        if (bArr == null) {
            this.f5579c.nullValue();
        } else {
            this.f5579c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo23629r() throws IOException {
        m7769v();
        this.f5579c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public JsonValueObjectEncoderContext mo23630s(ObjectEncoder<Object> objectEncoder, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f5579c.beginObject();
        }
        objectEncoder.mo19314a(obj, this);
        if (!z) {
            this.f5579c.endObject();
        }
        return this;
    }
}
