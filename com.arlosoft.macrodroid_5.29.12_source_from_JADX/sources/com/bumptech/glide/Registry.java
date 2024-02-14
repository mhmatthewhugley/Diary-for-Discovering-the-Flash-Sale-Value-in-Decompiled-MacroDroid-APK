package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C6683i;
import com.bumptech.glide.load.engine.C6704q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p060a5.C2231a;
import p060a5.C2233b;
import p060a5.C2234c;
import p060a5.C2235d;
import p060a5.C2236e;
import p060a5.C2238f;
import p096g5.C7339a;
import p102h4.C7379d;
import p102h4.C7385h;
import p102h4.C7386i;
import p108i4.C7403e;
import p108i4.C7405f;
import p120k4.C7587c;
import p146p4.C8105n;
import p146p4.C8107o;
import p146p4.C8108p;
import p191x4.C10383e;
import p191x4.C10384f;

public class Registry {

    /* renamed from: a */
    private final C8108p f15481a;

    /* renamed from: b */
    private final C2231a f15482b;

    /* renamed from: c */
    private final C2236e f15483c;

    /* renamed from: d */
    private final C2238f f15484d;

    /* renamed from: e */
    private final C7405f f15485e;

    /* renamed from: f */
    private final C10384f f15486f;

    /* renamed from: g */
    private final C2233b f15487g;

    /* renamed from: h */
    private final C2235d f15488h = new C2235d();

    /* renamed from: i */
    private final C2234c f15489i = new C2234c();

    /* renamed from: j */
    private final Pools.Pool<List<Throwable>> f15490j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> e = C7339a.m30346e();
        this.f15490j = e;
        this.f15481a = new C8108p(e);
        this.f15482b = new C2231a();
        this.f15483c = new C2236e();
        this.f15484d = new C2238f();
        this.f15485e = new C7405f();
        this.f15486f = new C10384f();
        this.f15487g = new C2233b();
        mo32975r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    @NonNull
    /* renamed from: f */
    private <Data, TResource, Transcode> List<C6683i<Data, TResource, Transcode>> m25215f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f15483c.mo24459d(cls, cls2)) {
            for (Class next2 : this.f15486f.mo41062b(next, cls3)) {
                arrayList.add(new C6683i(cls, next, next2, this.f15483c.mo24458b(cls, next), this.f15486f.mo41061a(next, next2), this.f15490j));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public <Data> Registry mo32959a(@NonNull Class<Data> cls, @NonNull C7379d<Data> dVar) {
        this.f15482b.mo24447a(cls, dVar);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public <TResource> Registry mo32960b(@NonNull Class<TResource> cls, @NonNull C7386i<TResource> iVar) {
        this.f15484d.mo24462a(cls, iVar);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public <Data, TResource> Registry mo32961c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull C7385h<Data, TResource> hVar) {
        mo32963e("legacy_append", cls, cls2, hVar);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public <Model, Data> Registry mo32962d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C8107o<Model, Data> oVar) {
        this.f15481a.mo38124a(cls, cls2, oVar);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public <Data, TResource> Registry mo32963e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull C7385h<Data, TResource> hVar) {
        this.f15483c.mo24457a(str, hVar, cls, cls2);
        return this;
    }

    @NonNull
    /* renamed from: g */
    public List<ImageHeaderParser> mo32964g() {
        List<ImageHeaderParser> b = this.f15487g.mo24451b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new NoImageHeaderParserException();
    }

    @Nullable
    /* renamed from: h */
    public <Data, TResource, Transcode> C6704q<Data, TResource, Transcode> mo32965h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        C6704q<Data, TResource, Transcode> a = this.f15489i.mo24452a(cls, cls2, cls3);
        if (this.f15489i.mo24453c(a)) {
            return null;
        }
        if (a == null) {
            List<C6683i<Data, TResource, Transcode>> f = m25215f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C6704q<>(cls, cls2, cls3, f, this.f15490j);
            }
            this.f15489i.mo24454d(cls, cls2, cls3, a);
        }
        return a;
    }

    @NonNull
    /* renamed from: i */
    public <Model> List<C8105n<Model, ?>> mo32966i(@NonNull Model model) {
        List<C8105n<Model, ?>> d = this.f15481a.mo38126d(model);
        if (!d.isEmpty()) {
            return d;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    @NonNull
    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo32967j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> a = this.f15488h.mo24455a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> d : this.f15481a.mo38125c(cls)) {
                for (Class next : this.f15483c.mo24459d(d, cls2)) {
                    if (!this.f15486f.mo41062b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f15488h.mo24456b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    @NonNull
    /* renamed from: k */
    public <X> C7386i<X> mo32968k(@NonNull C7587c<X> cVar) throws NoResultEncoderAvailableException {
        C7386i<X> b = this.f15484d.mo24463b(cVar.mo33103b());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(cVar.mo33103b());
    }

    @NonNull
    /* renamed from: l */
    public <X> C7403e<X> mo32969l(@NonNull X x) {
        return this.f15485e.mo37450a(x);
    }

    @NonNull
    /* renamed from: m */
    public <X> C7379d<X> mo32970m(@NonNull X x) throws NoSourceEncoderAvailableException {
        C7379d<X> b = this.f15482b.mo24448b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean mo32971n(@NonNull C7587c<?> cVar) {
        return this.f15484d.mo24463b(cVar.mo33103b()) != null;
    }

    @NonNull
    /* renamed from: o */
    public Registry mo32972o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f15487g.mo24450a(imageHeaderParser);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public Registry mo32973p(@NonNull C7403e.C7404a<?> aVar) {
        this.f15485e.mo37451b(aVar);
        return this;
    }

    @NonNull
    /* renamed from: q */
    public <TResource, Transcode> Registry mo32974q(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull C10383e<TResource, Transcode> eVar) {
        this.f15486f.mo41063c(cls, cls2, eVar);
        return this;
    }

    @NonNull
    /* renamed from: r */
    public final Registry mo32975r(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f15483c.mo24460e(arrayList);
        return this;
    }
}
