package p292io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p216ba.C11114e;

/* renamed from: io.reactivex.internal.util.b */
/* compiled from: ArrayListSupplier */
public enum C13216b implements Callable<List<Object>>, C11114e<Object, List<Object>> {
    INSTANCE;

    /* renamed from: d */
    public static <T> Callable<List<T>> m85536d() {
        return INSTANCE;
    }

    /* renamed from: b */
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    /* renamed from: e */
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
