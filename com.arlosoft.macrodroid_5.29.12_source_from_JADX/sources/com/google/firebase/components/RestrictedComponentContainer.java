package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class RestrictedComponentContainer extends AbstractComponentContainer {

    /* renamed from: a */
    private final Set<Class<?>> f4800a;

    /* renamed from: b */
    private final Set<Class<?>> f4801b;

    /* renamed from: c */
    private final Set<Class<?>> f4802c;

    /* renamed from: d */
    private final Set<Class<?>> f4803d;

    /* renamed from: e */
    private final Set<Class<?>> f4804e;

    /* renamed from: f */
    private final Set<Class<?>> f4805f;

    /* renamed from: g */
    private final ComponentContainer f4806g;

    private static class RestrictedPublisher implements Publisher {

        /* renamed from: a */
        private final Set<Class<?>> f4807a;

        /* renamed from: b */
        private final Publisher f4808b;

        public RestrictedPublisher(Set<Class<?>> set, Publisher publisher) {
            this.f4807a = set;
            this.f4808b = publisher;
        }
    }

    RestrictedComponentContainer(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency next : component.mo22870e()) {
            if (next.mo22911e()) {
                if (next.mo22914g()) {
                    hashSet4.add(next.mo22909c());
                } else {
                    hashSet.add(next.mo22909c());
                }
            } else if (next.mo22910d()) {
                hashSet3.add(next.mo22909c());
            } else if (next.mo22914g()) {
                hashSet5.add(next.mo22909c());
            } else {
                hashSet2.add(next.mo22909c());
            }
        }
        if (!component.mo22874i().isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.f4800a = Collections.unmodifiableSet(hashSet);
        this.f4801b = Collections.unmodifiableSet(hashSet2);
        this.f4802c = Collections.unmodifiableSet(hashSet3);
        this.f4803d = Collections.unmodifiableSet(hashSet4);
        this.f4804e = Collections.unmodifiableSet(hashSet5);
        this.f4805f = component.mo22874i();
        this.f4806g = componentContainer;
    }

    /* renamed from: a */
    public <T> T mo22868a(Class<T> cls) {
        if (this.f4800a.contains(cls)) {
            T a = this.f4806g.mo22868a(cls);
            if (!cls.equals(Publisher.class)) {
                return a;
            }
            return new RestrictedPublisher(this.f4805f, (Publisher) a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> Provider<Set<T>> mo22886b(Class<T> cls) {
        if (this.f4804e.contains(cls)) {
            return this.f4806g.mo22886b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> Set<T> mo22869c(Class<T> cls) {
        if (this.f4803d.contains(cls)) {
            return this.f4806g.mo22869c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Provider<T> mo22887d(Class<T> cls) {
        if (this.f4801b.contains(cls)) {
            return this.f4806g.mo22887d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: e */
    public <T> Deferred<T> mo22888e(Class<T> cls) {
        if (this.f4802c.contains(cls)) {
            return this.f4806g.mo22888e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}
