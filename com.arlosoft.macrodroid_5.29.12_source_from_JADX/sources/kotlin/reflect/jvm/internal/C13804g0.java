package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo71668d2 = {"Ljava/lang/reflect/Method;", "", "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.g0 */
/* compiled from: RuntimeTypeMapper.kt */
public final class C13804g0 {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.g0$a */
    /* compiled from: RuntimeTypeMapper.kt */
    static final class C13805a extends C13708q implements C16265l<Class<?>, CharSequence> {

        /* renamed from: a */
        public static final C13805a f62021a = new C13805a();

        C13805a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Class<?> cls) {
            C13706o.m87928e(cls, "it");
            return C14088d.m89398b(cls);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m88112b(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C13706o.m87928e(parameterTypes, "parameterTypes");
        sb.append(C13596m.m87590O(parameterTypes, "", "(", ")", 0, (CharSequence) null, C13805a.f62021a, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        C13706o.m87928e(returnType, "returnType");
        sb.append(C14088d.m89398b(returnType));
        return sb.toString();
    }
}
