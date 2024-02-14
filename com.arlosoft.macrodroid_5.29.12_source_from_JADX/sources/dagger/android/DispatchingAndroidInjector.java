package dagger.android;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.android.C11986a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p287ia.C12478a;
import p422w8.C16779b;

public final class DispatchingAndroidInjector<T> implements C11986a<T> {

    /* renamed from: a */
    private final Map<Class<? extends T>, C12478a<C11986a.C11988b<? extends T>>> f58185a;

    public static final class InvalidInjectorBindingException extends RuntimeException {
        InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    DispatchingAndroidInjector(Map<Class<? extends T>, C12478a<C11986a.C11988b<? extends T>>> map) {
        this.f58185a = map;
    }

    /* renamed from: b */
    private String m82378b(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f58185a.keySet()) {
            if (next.isInstance(t)) {
                arrayList.add(next.getCanonicalName());
            }
        }
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return String.format("No injector factory bound for Class<%s>", new Object[]{t.getClass().getCanonicalName()});
        }
        return String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", new Object[]{t.getClass().getCanonicalName(), arrayList});
    }

    /* renamed from: a */
    public void mo38318a(T t) {
        if (!mo67415c(t)) {
            throw new IllegalArgumentException(m82378b(t));
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public boolean mo67415c(T t) {
        C12478a aVar = this.f58185a.get(t.getClass());
        if (aVar == null) {
            return false;
        }
        C11986a.C11988b bVar = (C11986a.C11988b) aVar.get();
        try {
            ((C11986a) C16779b.m99515c(bVar.mo67416a(t), "%s.create(I) should not return null.", bVar.getClass())).mo38318a(t);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(String.format("%s does not implement AndroidInjector.Factory<%s>", new Object[]{bVar.getClass().getCanonicalName(), t.getClass().getCanonicalName()}), e);
        }
    }
}
