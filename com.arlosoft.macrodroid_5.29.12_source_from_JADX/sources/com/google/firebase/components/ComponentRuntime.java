package com.google.firebase.components;

import android.util.Log;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class ComponentRuntime extends AbstractComponentContainer implements ComponentLoader {

    /* renamed from: h */
    private static final Provider<Set<Object>> f4768h = C1823f.f4815a;

    /* renamed from: a */
    private final Map<Component<?>, Provider<?>> f4769a;

    /* renamed from: b */
    private final Map<Class<?>, Provider<?>> f4770b;

    /* renamed from: c */
    private final Map<Class<?>, LazySet<?>> f4771c;

    /* renamed from: d */
    private final List<Provider<ComponentRegistrar>> f4772d;

    /* renamed from: e */
    private final EventBus f4773e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f4774f;

    /* renamed from: g */
    private final ComponentRegistrarProcessor f4775g;

    public static final class Builder {

        /* renamed from: a */
        private final Executor f4776a;

        /* renamed from: b */
        private final List<Provider<ComponentRegistrar>> f4777b = new ArrayList();

        /* renamed from: c */
        private final List<Component<?>> f4778c = new ArrayList();

        /* renamed from: d */
        private ComponentRegistrarProcessor f4779d = ComponentRegistrarProcessor.f4767a;

        Builder(Executor executor) {
            this.f4776a = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m6406f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder mo22895b(Component<?> component) {
            this.f4778c.add(component);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder mo22896c(ComponentRegistrar componentRegistrar) {
            this.f4777b.add(new C1826i(componentRegistrar));
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder mo22897d(Collection<Provider<ComponentRegistrar>> collection) {
            this.f4777b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public ComponentRuntime mo22898e() {
            return new ComponentRuntime(this.f4776a, this.f4777b, this.f4778c, this.f4779d);
        }

        @CanIgnoreReturnValue
        /* renamed from: g */
        public Builder mo22899g(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.f4779d = componentRegistrarProcessor;
            return this;
        }
    }

    /* renamed from: i */
    public static Builder m6388i(Executor executor) {
        return new Builder(executor);
    }

    /* renamed from: j */
    private void m6389j(List<Component<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<Provider<ComponentRegistrar>> it = this.f4772d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f4775g.mo22893a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f4769a.isEmpty()) {
                CycleDetector.m6412a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f4769a.keySet());
                arrayList2.addAll(list);
                CycleDetector.m6412a(arrayList2);
            }
            for (Component next : list) {
                this.f4769a.put(next, new Lazy(new C1822e(this, next)));
            }
            arrayList.addAll(m6397s(list));
            arrayList.addAll(m6398t());
            m6396r();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        m6395q();
    }

    /* renamed from: k */
    private void m6390k(Map<Component<?>, Provider<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            Component component = (Component) next.getKey();
            Provider provider = (Provider) next.getValue();
            if (component.mo22875l() || (component.mo22876m() && z)) {
                provider.get();
            }
        }
        this.f4773e.mo22919d();
    }

    /* renamed from: m */
    private static <T> List<T> m6391m(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m6392n(Component component) {
        return component.mo22871f().mo16829a(new RestrictedComponentContainer(component, this));
    }

    /* renamed from: q */
    private void m6395q() {
        Boolean bool = this.f4774f.get();
        if (bool != null) {
            m6390k(this.f4769a, bool.booleanValue());
        }
    }

    /* renamed from: r */
    private void m6396r() {
        for (Component next : this.f4769a.keySet()) {
            Iterator<Dependency> it = next.mo22870e().iterator();
            while (true) {
                if (it.hasNext()) {
                    Dependency next2 = it.next();
                    if (next2.mo22914g() && !this.f4771c.containsKey(next2.mo22909c())) {
                        this.f4771c.put(next2.mo22909c(), LazySet.m6442b(Collections.emptySet()));
                    } else if (this.f4770b.containsKey(next2.mo22909c())) {
                        continue;
                    } else if (next2.mo22913f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo22909c()}));
                    } else if (!next2.mo22914g()) {
                        this.f4770b.put(next2.mo22909c(), OptionalProvider.m6449e());
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private List<Runnable> m6397s(List<Component<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (Component next : list) {
            if (next.mo22877n()) {
                Provider provider = this.f4769a.get(next);
                for (Class cls : next.mo22873h()) {
                    if (!this.f4770b.containsKey(cls)) {
                        this.f4770b.put(cls, provider);
                    } else {
                        arrayList.add(new C1825h((OptionalProvider) this.f4770b.get(cls), provider));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private List<Runnable> m6398t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f4769a.entrySet()) {
            Component component = (Component) next.getKey();
            if (!component.mo22877n()) {
                Provider provider = (Provider) next.getValue();
                for (Class cls : component.mo22873h()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(provider);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f4771c.containsKey(entry.getKey())) {
                this.f4771c.put((Class) entry.getKey(), LazySet.m6442b((Collection) entry.getValue()));
            } else {
                LazySet lazySet = this.f4771c.get(entry.getKey());
                for (Provider gVar : (Set) entry.getValue()) {
                    arrayList.add(new C1824g(lazySet, gVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo22868a(Class cls) {
        return super.mo22868a(cls);
    }

    /* renamed from: b */
    public synchronized <T> Provider<Set<T>> mo22886b(Class<T> cls) {
        LazySet lazySet = this.f4771c.get(cls);
        if (lazySet != null) {
            return lazySet;
        }
        return f4768h;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo22869c(Class cls) {
        return super.mo22869c(cls);
    }

    /* renamed from: d */
    public synchronized <T> Provider<T> mo22887d(Class<T> cls) {
        Preconditions.m6458c(cls, "Null interface requested.");
        return this.f4770b.get(cls);
    }

    /* renamed from: e */
    public <T> Deferred<T> mo22888e(Class<T> cls) {
        Provider<T> d = mo22887d(cls);
        if (d == null) {
            return OptionalProvider.m6449e();
        }
        if (d instanceof OptionalProvider) {
            return (OptionalProvider) d;
        }
        return OptionalProvider.m6453i(d);
    }

    /* renamed from: l */
    public void mo22894l(boolean z) {
        HashMap hashMap;
        if (this.f4774f.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f4769a);
            }
            m6390k(hashMap, z);
        }
    }

    private ComponentRuntime(Executor executor, Iterable<Provider<ComponentRegistrar>> iterable, Collection<Component<?>> collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.f4769a = new HashMap();
        this.f4770b = new HashMap();
        this.f4771c = new HashMap();
        this.f4774f = new AtomicReference<>();
        EventBus eventBus = new EventBus(executor);
        this.f4773e = eventBus;
        this.f4775g = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.m6349q(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.m6349q(this, ComponentLoader.class, new Class[0]));
        for (Component next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f4772d = m6391m(iterable);
        m6389j(arrayList);
    }
}
