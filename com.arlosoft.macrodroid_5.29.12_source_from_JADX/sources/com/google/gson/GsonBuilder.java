package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GsonBuilder {

    /* renamed from: a */
    private Excluder f55795a = Excluder.f55847p;

    /* renamed from: b */
    private LongSerializationPolicy f55796b = LongSerializationPolicy.DEFAULT;

    /* renamed from: c */
    private FieldNamingStrategy f55797c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d */
    private final Map<Type, InstanceCreator<?>> f55798d = new HashMap();

    /* renamed from: e */
    private final List<TypeAdapterFactory> f55799e = new ArrayList();

    /* renamed from: f */
    private final List<TypeAdapterFactory> f55800f = new ArrayList();

    /* renamed from: g */
    private boolean f55801g = false;

    /* renamed from: h */
    private String f55802h;

    /* renamed from: i */
    private int f55803i = 2;

    /* renamed from: j */
    private int f55804j = 2;

    /* renamed from: k */
    private boolean f55805k = false;

    /* renamed from: l */
    private boolean f55806l = false;

    /* renamed from: m */
    private boolean f55807m = true;

    /* renamed from: n */
    private boolean f55808n = false;

    /* renamed from: o */
    private boolean f55809o = false;

    /* renamed from: p */
    private boolean f55810p = false;

    /* renamed from: b */
    private void m78344b(String str, int i, int i2, List<TypeAdapterFactory> list) {
        DefaultDateTypeAdapter defaultDateTypeAdapter;
        DefaultDateTypeAdapter defaultDateTypeAdapter2;
        DefaultDateTypeAdapter defaultDateTypeAdapter3;
        if (str != null && !"".equals(str.trim())) {
            defaultDateTypeAdapter2 = new DefaultDateTypeAdapter(Date.class, str);
            defaultDateTypeAdapter = new DefaultDateTypeAdapter(Timestamp.class, str);
            defaultDateTypeAdapter3 = new DefaultDateTypeAdapter(java.sql.Date.class, str);
        } else if (i != 2 && i2 != 2) {
            DefaultDateTypeAdapter defaultDateTypeAdapter4 = new DefaultDateTypeAdapter(Date.class, i, i2);
            DefaultDateTypeAdapter defaultDateTypeAdapter5 = new DefaultDateTypeAdapter(Timestamp.class, i, i2);
            DefaultDateTypeAdapter defaultDateTypeAdapter6 = new DefaultDateTypeAdapter(java.sql.Date.class, i, i2);
            defaultDateTypeAdapter2 = defaultDateTypeAdapter4;
            defaultDateTypeAdapter = defaultDateTypeAdapter5;
            defaultDateTypeAdapter3 = defaultDateTypeAdapter6;
        } else {
            return;
        }
        list.add(TypeAdapters.m78586b(Date.class, defaultDateTypeAdapter2));
        list.add(TypeAdapters.m78586b(Timestamp.class, defaultDateTypeAdapter));
        list.add(TypeAdapters.m78586b(java.sql.Date.class, defaultDateTypeAdapter3));
    }

    /* renamed from: a */
    public GsonBuilder mo64003a(ExclusionStrategy exclusionStrategy) {
        this.f55795a = this.f55795a.mo64086p(exclusionStrategy, true, false);
        return this;
    }

    /* renamed from: c */
    public Gson mo64004c() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f55799e.size() + this.f55800f.size() + 3);
        arrayList2.addAll(this.f55799e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f55800f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m78344b(this.f55802h, this.f55803i, this.f55804j, arrayList2);
        return new Gson(this.f55795a, this.f55797c, this.f55798d, this.f55801g, this.f55805k, this.f55809o, this.f55807m, this.f55808n, this.f55810p, this.f55806l, this.f55796b, this.f55802h, this.f55803i, this.f55804j, this.f55799e, this.f55800f, arrayList);
    }

    /* renamed from: d */
    public GsonBuilder mo64005d(int... iArr) {
        this.f55795a = this.f55795a.mo64087q(iArr);
        return this;
    }

    /* renamed from: e */
    public GsonBuilder mo64006e(Type type, Object obj) {
        boolean z = obj instanceof JsonSerializer;
        C$Gson$Preconditions.m78399a(z || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter));
        if (obj instanceof InstanceCreator) {
            this.f55798d.put(type, (InstanceCreator) obj);
        }
        if (z || (obj instanceof JsonDeserializer)) {
            this.f55799e.add(TreeTypeAdapter.m78576g(TypeToken.m78731b(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f55799e.add(TypeAdapters.m78585a(TypeToken.m78731b(type), (TypeAdapter) obj));
        }
        return this;
    }

    /* renamed from: f */
    public GsonBuilder mo64007f(TypeAdapterFactory typeAdapterFactory) {
        this.f55799e.add(typeAdapterFactory);
        return this;
    }

    /* renamed from: g */
    public GsonBuilder mo64008g() {
        this.f55806l = true;
        return this;
    }

    /* renamed from: h */
    public GsonBuilder mo64009h(String str) {
        this.f55802h = str;
        return this;
    }

    /* renamed from: i */
    public GsonBuilder mo64010i() {
        this.f55810p = true;
        return this;
    }

    /* renamed from: j */
    public GsonBuilder mo64011j() {
        this.f55808n = true;
        return this;
    }
}
