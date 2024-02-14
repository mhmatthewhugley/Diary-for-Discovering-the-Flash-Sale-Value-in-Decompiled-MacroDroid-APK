package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Excluder implements TypeAdapterFactory, Cloneable {

    /* renamed from: p */
    public static final Excluder f55847p = new Excluder();

    /* renamed from: a */
    private double f55848a = -1.0d;

    /* renamed from: c */
    private int f55849c = 136;

    /* renamed from: d */
    private boolean f55850d = true;

    /* renamed from: f */
    private boolean f55851f;

    /* renamed from: g */
    private List<ExclusionStrategy> f55852g = Collections.emptyList();

    /* renamed from: o */
    private List<ExclusionStrategy> f55853o = Collections.emptyList();

    /* renamed from: d */
    private boolean m78440d(Class<?> cls) {
        if (this.f55848a != -1.0d && !m78447o((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if ((this.f55850d || !m78443h(cls)) && !m78442g(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m78441e(Class<?> cls, boolean z) {
        for (ExclusionStrategy b : z ? this.f55852g : this.f55853o) {
            if (b.mo40952b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m78442g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: h */
    private boolean m78443h(Class<?> cls) {
        return cls.isMemberClass() && !m78444k(cls);
    }

    /* renamed from: k */
    private boolean m78444k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: l */
    private boolean m78445l(Since since) {
        return since == null || since.value() <= this.f55848a;
    }

    /* renamed from: n */
    private boolean m78446n(Until until) {
        return until == null || until.value() > this.f55848a;
    }

    /* renamed from: o */
    private boolean m78447o(Since since, Until until) {
        return m78445l(since) && m78446n(until);
    }

    /* renamed from: a */
    public <T> TypeAdapter<T> mo40897a(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> c = typeToken.mo64306c();
        boolean d = m78440d(c);
        final boolean z = d || m78441e(c, true);
        final boolean z2 = d || m78441e(c, false);
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final TypeToken<T> typeToken2 = typeToken;
        return new TypeAdapter<T>() {

            /* renamed from: a */
            private TypeAdapter<T> f55854a;

            /* renamed from: f */
            private TypeAdapter<T> m78454f() {
                TypeAdapter<T> typeAdapter = this.f55854a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter<T> n = gson2.mo63980n(Excluder.this, typeToken2);
                this.f55854a = n;
                return n;
            }

            /* renamed from: c */
            public T mo40900c(JsonReader jsonReader) throws IOException {
                if (!z2) {
                    return m78454f().mo40900c(jsonReader);
                }
                jsonReader.skipValue();
                return null;
            }

            /* renamed from: e */
            public void mo40901e(JsonWriter jsonWriter, T t) throws IOException {
                if (z) {
                    jsonWriter.nullValue();
                } else {
                    m78454f().mo40901e(jsonWriter, t);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean mo64083c(Class<?> cls, boolean z) {
        return m78440d(cls) || m78441e(cls, z);
    }

    /* renamed from: f */
    public boolean mo64085f(Field field, boolean z) {
        Expose expose;
        if ((this.f55849c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f55848a != -1.0d && !m78447o((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f55851f && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? !expose.deserialize() : !expose.serialize()))) {
            return true;
        }
        if ((!this.f55850d && m78443h(field.getType())) || m78442g(field.getType())) {
            return true;
        }
        List<ExclusionStrategy> list = z ? this.f55852g : this.f55853o;
        if (list.isEmpty()) {
            return false;
        }
        FieldAttributes fieldAttributes = new FieldAttributes(field);
        for (ExclusionStrategy a : list) {
            if (a.mo40951a(fieldAttributes)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public Excluder mo64086p(ExclusionStrategy exclusionStrategy, boolean z, boolean z2) {
        Excluder b = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f55852g);
            b.f55852g = arrayList;
            arrayList.add(exclusionStrategy);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f55853o);
            b.f55853o = arrayList2;
            arrayList2.add(exclusionStrategy);
        }
        return b;
    }

    /* renamed from: q */
    public Excluder mo64087q(int... iArr) {
        Excluder b = clone();
        b.f55849c = 0;
        for (int i : iArr) {
            b.f55849c = i | b.f55849c;
        }
        return b;
    }
}
