package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import kotlin.jvm.internal.C13706o;

/* renamed from: androidx.lifecycle.e */
/* compiled from: ViewModelProvider.kt */
public final /* synthetic */ class C0740e {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.Companion;
    }

    /* renamed from: a */
    public static ViewModel m547a(ViewModelProvider.Factory factory, Class cls) {
        C13706o.m87929f(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public static ViewModel m548b(ViewModelProvider.Factory factory, Class cls, CreationExtras creationExtras) {
        C13706o.m87929f(cls, "modelClass");
        C13706o.m87929f(creationExtras, "extras");
        return factory.create(cls);
    }

    /* renamed from: c */
    public static ViewModelProvider.Factory m549c(ViewModelInitializer<?>... viewModelInitializerArr) {
        return ViewModelProvider.Factory.Companion.from(viewModelInitializerArr);
    }
}
