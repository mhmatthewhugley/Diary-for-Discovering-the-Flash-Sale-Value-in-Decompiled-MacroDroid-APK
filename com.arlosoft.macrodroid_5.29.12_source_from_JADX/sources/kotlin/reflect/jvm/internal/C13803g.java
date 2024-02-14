package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p280hc.C12416b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¨\u0006\u0006"}, mo71668d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/h;", "a", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.g */
/* compiled from: kClassCache.kt */
public final class C13803g {

    /* renamed from: a */
    private static C12416b<String, Object> f62020a;

    static {
        C12416b<String, Object> b = C12416b.m83306b();
        C13706o.m87928e(b, "empty<String, Any>()");
        f62020a = b;
    }

    /* renamed from: a */
    public static final <T> C13806h<T> m88110a(Class<T> cls) {
        C13706o.m87929f(cls, "jClass");
        String name = cls.getName();
        Object c = f62020a.mo68775c(name);
        Class<T> cls2 = null;
        if (c instanceof WeakReference) {
            C13806h<T> hVar = (C13806h) ((WeakReference) c).get();
            if (hVar != null) {
                cls2 = hVar.mo71931e();
            }
            if (C13706o.m87924a(cls2, cls)) {
                return hVar;
            }
        } else if (c != null) {
            for (WeakReference weakReference : (WeakReference[]) c) {
                C13806h<T> hVar2 = (C13806h) weakReference.get();
                if (C13706o.m87924a(hVar2 != null ? hVar2.mo71931e() : null, cls)) {
                    return hVar2;
                }
            }
            int length = ((Object[]) c).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(c, 0, weakReferenceArr, 0, length);
            C13806h<T> hVar3 = new C13806h<>(cls);
            weakReferenceArr[length] = new WeakReference(hVar3);
            C12416b<String, Object> f = f62020a.mo68776f(name, weakReferenceArr);
            C13706o.m87928e(f, "K_CLASS_CACHE.plus(name, newArray)");
            f62020a = f;
            return hVar3;
        }
        C13806h<T> hVar4 = new C13806h<>(cls);
        C12416b<String, Object> f2 = f62020a.mo68776f(name, new WeakReference(hVar4));
        C13706o.m87928e(f2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        f62020a = f2;
        return hVar4;
    }
}
