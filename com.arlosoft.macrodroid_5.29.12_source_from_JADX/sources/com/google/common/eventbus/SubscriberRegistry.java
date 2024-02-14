package com.google.common.eventbus;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

@ElementTypesAreNonnullByDefault
final class SubscriberRegistry {

    /* renamed from: c */
    private static final LoadingCache<Class<?>, ImmutableList<Method>> f17374c = CacheBuilder.m5516y().mo22286E().mo22289b(new CacheLoader<Class<?>, ImmutableList<Method>>() {
        /* renamed from: c */
        public ImmutableList<Method> mo22319a(Class<?> cls) throws Exception {
            return SubscriberRegistry.m29244b(cls);
        }
    });

    /* renamed from: d */
    private static final LoadingCache<Class<?>, ImmutableSet<Class<?>>> f17375d = CacheBuilder.m5516y().mo22286E().mo22289b(new CacheLoader<Class<?>, ImmutableSet<Class<?>>>() {
        /* renamed from: c */
        public ImmutableSet<Class<?>> mo22319a(Class<?> cls) {
            return ImmutableSet.m27516u(TypeToken.m73762p(cls).mo61493n().mo61498i0());
        }
    });

    /* renamed from: a */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<Subscriber>> f17376a = Maps.m28111z();
    @Weak

    /* renamed from: b */
    private final EventBus f17377b;

    private static final class MethodIdentifier {

        /* renamed from: a */
        private final String f17378a;

        /* renamed from: b */
        private final List<Class<?>> f17379b;

        MethodIdentifier(Method method) {
            this.f17378a = method.getName();
            this.f17379b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MethodIdentifier)) {
                return false;
            }
            MethodIdentifier methodIdentifier = (MethodIdentifier) obj;
            if (!this.f17378a.equals(methodIdentifier.f17378a) || !this.f17379b.equals(methodIdentifier.f17379b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.m5350b(this.f17378a, this.f17379b);
        }
    }

    SubscriberRegistry(EventBus eventBus) {
        this.f17377b = (EventBus) Preconditions.m5392s(eventBus);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static ImmutableList<Method> m29244b(Class<?> cls) {
        Set<Class> i0 = TypeToken.m73762p(cls).mo61493n().mo61498i0();
        HashMap A = Maps.m28058A();
        for (Class declaredMethods : i0) {
            for (Method method : declaredMethods.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                    Class[] parameterTypes = method.getParameterTypes();
                    Preconditions.m5386m(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, parameterTypes.length);
                    Preconditions.m5388o(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), Primitives.m73648b(parameterTypes[0]).getSimpleName());
                    MethodIdentifier methodIdentifier = new MethodIdentifier(method);
                    if (!A.containsKey(methodIdentifier)) {
                        A.put(methodIdentifier, method);
                    }
                }
            }
        }
        return ImmutableList.m27309t(A.values());
    }
}
