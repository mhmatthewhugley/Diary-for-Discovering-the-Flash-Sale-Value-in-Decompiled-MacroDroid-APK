package p361pa;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13688f;
import kotlin.jvm.internal.C13706o;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0004\"-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018G¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"-\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00028G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"'\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0010*\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, mo71668d2 = {"T", "Lxa/d;", "Ljava/lang/Class;", "b", "(Lxa/d;)Ljava/lang/Class;", "getJavaClass$annotations", "(Lxa/d;)V", "java", "", "d", "javaPrimitiveType", "c", "javaObjectType", "e", "(Ljava/lang/Class;)Lxa/d;", "kotlin", "", "a", "(Ljava/lang/annotation/Annotation;)Lxa/d;", "annotationClass", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: pa.a */
/* compiled from: JvmClassMapping.kt */
public final class C16147a {
    /* renamed from: a */
    public static final <T extends Annotation> C16875d<? extends T> m96967a(T t) {
        C13706o.m87929f(t, "<this>");
        Class<? extends Annotation> annotationType = t.annotationType();
        C13706o.m87928e(annotationType, "this as java.lang.annota…otation).annotationType()");
        C16875d<? extends T> e = m96971e(annotationType);
        C13706o.m87927d(e, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return e;
    }

    /* renamed from: b */
    public static final <T> Class<T> m96968b(C16875d<T> dVar) {
        C13706o.m87929f(dVar, "<this>");
        Class<?> e = ((C13688f) dVar).mo71931e();
        C13706o.m87927d(e, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return e;
    }

    /* renamed from: c */
    public static final <T> Class<T> m96969c(C16875d<T> dVar) {
        C13706o.m87929f(dVar, "<this>");
        Class e = ((C13688f) dVar).mo71931e();
        if (!e.isPrimitive()) {
            C13706o.m87927d(e, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return e;
        }
        String name = e.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    e = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    e = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    e = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    e = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    e = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    e = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    e = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    e = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    e = Short.class;
                    break;
                }
                break;
        }
        C13706o.m87927d(e, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return e;
    }

    /* renamed from: d */
    public static final <T> Class<T> m96970d(C16875d<T> dVar) {
        C13706o.m87929f(dVar, "<this>");
        Class<?> e = ((C13688f) dVar).mo71931e();
        if (e.isPrimitive()) {
            C13706o.m87927d(e, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return e;
        }
        String name = e.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    /* renamed from: e */
    public static final <T> C16875d<T> m96971e(Class<T> cls) {
        C13706o.m87929f(cls, "<this>");
        return C13687e0.m87868b(cls);
    }
}
