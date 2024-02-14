package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p090f5.C7315j;
import p102h4.C7384g;
import p102h4.C7385h;
import p108i4.C7403e;
import p120k4.C7587c;
import p191x4.C10383e;

/* renamed from: com.bumptech.glide.load.engine.i */
/* compiled from: DecodePath */
public class C6683i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f15592a;

    /* renamed from: b */
    private final List<? extends C7385h<DataType, ResourceType>> f15593b;

    /* renamed from: c */
    private final C10383e<ResourceType, Transcode> f15594c;

    /* renamed from: d */
    private final Pools.Pool<List<Throwable>> f15595d;

    /* renamed from: e */
    private final String f15596e;

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    /* compiled from: DecodePath */
    interface C6684a<ResourceType> {
        @NonNull
        /* renamed from: a */
        C7587c<ResourceType> mo33052a(@NonNull C7587c<ResourceType> cVar);
    }

    public C6683i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C7385h<DataType, ResourceType>> list, C10383e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.f15592a = cls;
        this.f15593b = list;
        this.f15594c = eVar;
        this.f15595d = pool;
        this.f15596e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    /* renamed from: b */
    private C7587c<ResourceType> m25336b(C7403e<DataType> eVar, int i, int i2, @NonNull C7384g gVar) throws GlideException {
        List list = (List) C7315j.m30204d(this.f15595d.acquire());
        try {
            return m25337c(eVar, i, i2, gVar, list);
        } finally {
            this.f15595d.release(list);
        }
    }

    @NonNull
    /* renamed from: c */
    private C7587c<ResourceType> m25337c(C7403e<DataType> eVar, int i, int i2, @NonNull C7384g gVar, List<Throwable> list) throws GlideException {
        int size = this.f15593b.size();
        C7587c<ResourceType> cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C7385h hVar = (C7385h) this.f15593b.get(i3);
            try {
                if (hVar.mo37383a(eVar.mo37446a(), gVar)) {
                    cVar = hVar.mo37384b(eVar.mo37446a(), i, i2, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(hVar);
                }
                list.add(e);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f15596e, (List<Throwable>) new ArrayList(list));
    }

    /* renamed from: a */
    public C7587c<Transcode> mo33062a(C7403e<DataType> eVar, int i, int i2, @NonNull C7384g gVar, C6684a<ResourceType> aVar) throws GlideException {
        return this.f15594c.mo41060a(aVar.mo33052a(m25336b(eVar, i, i2, gVar)), gVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f15592a + ", decoders=" + this.f15593b + ", transcoder=" + this.f15594c + '}';
    }
}
