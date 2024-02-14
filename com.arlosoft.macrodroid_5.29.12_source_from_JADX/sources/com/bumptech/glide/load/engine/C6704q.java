package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.C6683i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p090f5.C7315j;
import p102h4.C7384g;
import p108i4.C7403e;
import p120k4.C7587c;

/* renamed from: com.bumptech.glide.load.engine.q */
/* compiled from: LoadPath */
public class C6704q<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f15671a;

    /* renamed from: b */
    private final Pools.Pool<List<Throwable>> f15672b;

    /* renamed from: c */
    private final List<? extends C6683i<Data, ResourceType, Transcode>> f15673c;

    /* renamed from: d */
    private final String f15674d;

    public C6704q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C6683i<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f15671a = cls;
        this.f15672b = pool;
        this.f15673c = (List) C7315j.m30203c(list);
        this.f15674d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private C7587c<Transcode> m25396b(C7403e<Data> eVar, @NonNull C7384g gVar, int i, int i2, C6683i.C6684a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        List<Throwable> list2 = list;
        int size = this.f15673c.size();
        C7587c<Transcode> cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                cVar = ((C6683i) this.f15673c.get(i3)).mo33062a(eVar, i, i2, gVar, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f15674d, (List<Throwable>) new ArrayList(list2));
    }

    /* renamed from: a */
    public C7587c<Transcode> mo33115a(C7403e<Data> eVar, @NonNull C7384g gVar, int i, int i2, C6683i.C6684a<ResourceType> aVar) throws GlideException {
        List list = (List) C7315j.m30204d(this.f15672b.acquire());
        try {
            return m25396b(eVar, gVar, i, i2, aVar, list);
        } finally {
            this.f15672b.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f15673c.toArray()) + '}';
    }
}
