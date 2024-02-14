package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\f"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/a;", "Ljava/lang/StackTraceElement;", "d", "(Lkotlin/coroutines/jvm/internal/a;)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/f;", "b", "", "c", "expected", "actual", "Lja/u;", "a", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.jvm.internal.g */
/* compiled from: DebugMetadata.kt */
public final class C13659g {
    /* renamed from: a */
    private static final void m87841a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C13658f m87842b(C13653a aVar) {
        return (C13658f) aVar.getClass().getAnnotation(C13658f.class);
    }

    /* renamed from: c */
    private static final int m87843c(C13653a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m87844d(C13653a aVar) {
        int i;
        String str;
        C13706o.m87929f(aVar, "<this>");
        C13658f b = m87842b(aVar);
        if (b == null) {
            return null;
        }
        m87841a(1, b.mo71897v());
        int c = m87843c(aVar);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo71895l()[c];
        }
        String b2 = C13661i.f61905a.mo71898b(aVar);
        if (b2 == null) {
            str = b.mo71893c();
        } else {
            str = b2 + '/' + b.mo71893c();
        }
        return new StackTraceElement(str, b.mo71896m(), b.mo71894f(), i);
    }
}
