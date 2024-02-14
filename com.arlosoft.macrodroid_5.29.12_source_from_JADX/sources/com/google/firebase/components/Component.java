package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Component<T> {

    /* renamed from: a */
    private final String f4750a;

    /* renamed from: b */
    private final Set<Class<? super T>> f4751b;

    /* renamed from: c */
    private final Set<Dependency> f4752c;

    /* renamed from: d */
    private final int f4753d;

    /* renamed from: e */
    private final int f4754e;

    /* renamed from: f */
    private final ComponentFactory<T> f4755f;

    /* renamed from: g */
    private final Set<Class<?>> f4756g;

    public static class Builder<T> {

        /* renamed from: a */
        private String f4757a;

        /* renamed from: b */
        private final Set<Class<? super T>> f4758b;

        /* renamed from: c */
        private final Set<Dependency> f4759c;

        /* renamed from: d */
        private int f4760d;

        /* renamed from: e */
        private int f4761e;

        /* renamed from: f */
        private ComponentFactory<T> f4762f;

        /* renamed from: g */
        private Set<Class<?>> f4763g;

        /* access modifiers changed from: private */
        @CanIgnoreReturnValue
        /* renamed from: g */
        public Builder<T> m6360g() {
            this.f4761e = 1;
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: i */
        private Builder<T> m6361i(int i) {
            Preconditions.m6459d(this.f4760d == 0, "Instantiation type has already been set.");
            this.f4760d = i;
            return this;
        }

        /* renamed from: j */
        private void m6362j(Class<?> cls) {
            Preconditions.m6456a(!this.f4758b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder<T> mo22880b(Dependency dependency) {
            Preconditions.m6458c(dependency, "Null dependency");
            m6362j(dependency.mo22909c());
            this.f4759c.add(dependency);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder<T> mo22881c() {
            return m6361i(1);
        }

        /* renamed from: d */
        public Component<T> mo22882d() {
            Preconditions.m6459d(this.f4762f != null, "Missing required property: factory.");
            return new Component(this.f4757a, new HashSet(this.f4758b), new HashSet(this.f4759c), this.f4760d, this.f4761e, this.f4762f, this.f4763g);
        }

        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder<T> mo22883e() {
            return m6361i(2);
        }

        @CanIgnoreReturnValue
        /* renamed from: f */
        public Builder<T> mo22884f(ComponentFactory<T> componentFactory) {
            this.f4762f = (ComponentFactory) Preconditions.m6458c(componentFactory, "Null factory");
            return this;
        }

        /* renamed from: h */
        public Builder<T> mo22885h(@NonNull String str) {
            this.f4757a = str;
            return this;
        }

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.f4757a = null;
            HashSet hashSet = new HashSet();
            this.f4758b = hashSet;
            this.f4759c = new HashSet();
            this.f4760d = 0;
            this.f4761e = 0;
            this.f4763g = new HashSet();
            Preconditions.m6458c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c : clsArr) {
                Preconditions.m6458c(c, "Null interface");
            }
            Collections.addAll(this.f4758b, clsArr);
        }
    }

    /* renamed from: c */
    public static <T> Builder<T> m6343c(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> Builder<T> m6344d(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    /* renamed from: j */
    public static <T> Component<T> m6345j(T t, Class<T> cls) {
        return m6346k(cls).mo22884f(new C1818a(t)).mo22882d();
    }

    /* renamed from: k */
    public static <T> Builder<T> m6346k(Class<T> cls) {
        return m6343c(cls).m6360g();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m6347o(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ Object m6348p(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: q */
    public static <T> Component<T> m6349q(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m6344d(cls, clsArr).mo22884f(new C1819b(t)).mo22882d();
    }

    /* renamed from: e */
    public Set<Dependency> mo22870e() {
        return this.f4752c;
    }

    /* renamed from: f */
    public ComponentFactory<T> mo22871f() {
        return this.f4755f;
    }

    @Nullable
    /* renamed from: g */
    public String mo22872g() {
        return this.f4750a;
    }

    /* renamed from: h */
    public Set<Class<? super T>> mo22873h() {
        return this.f4751b;
    }

    /* renamed from: i */
    public Set<Class<?>> mo22874i() {
        return this.f4756g;
    }

    /* renamed from: l */
    public boolean mo22875l() {
        return this.f4753d == 1;
    }

    /* renamed from: m */
    public boolean mo22876m() {
        return this.f4753d == 2;
    }

    /* renamed from: n */
    public boolean mo22877n() {
        return this.f4754e == 0;
    }

    /* renamed from: r */
    public Component<T> mo22878r(ComponentFactory<T> componentFactory) {
        return new Component(this.f4750a, this.f4751b, this.f4752c, this.f4753d, this.f4754e, componentFactory, this.f4756g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f4751b.toArray()) + ">{" + this.f4753d + ", type=" + this.f4754e + ", deps=" + Arrays.toString(this.f4752c.toArray()) + "}";
    }

    private Component(@Nullable String str, Set<Class<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.f4750a = str;
        this.f4751b = Collections.unmodifiableSet(set);
        this.f4752c = Collections.unmodifiableSet(set2);
        this.f4753d = i;
        this.f4754e = i2;
        this.f4755f = componentFactory;
        this.f4756g = Collections.unmodifiableSet(set3);
    }
}
