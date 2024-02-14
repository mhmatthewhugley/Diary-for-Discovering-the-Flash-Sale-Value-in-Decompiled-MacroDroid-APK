package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Modifier;
import kotlin.reflect.jvm.internal.impl.descriptors.C14054l1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14068m1;
import p224cb.C11167a;
import p224cb.C11168b;
import p224cb.C11169c;
import p288ib.C12505s;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v */
/* compiled from: ReflectJavaModifierListOwner.kt */
public interface C14118v extends C12505s {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v$a */
    /* compiled from: ReflectJavaModifierListOwner.kt */
    public static final class C14119a {
        /* renamed from: a */
        public static C14068m1 m89496a(C14118v vVar) {
            int modifiers = vVar.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                return C14054l1.C14062h.f62681c;
            }
            if (Modifier.isPrivate(modifiers)) {
                return C14054l1.C14059e.f62678c;
            }
            if (!Modifier.isProtected(modifiers)) {
                return C11167a.f54074c;
            }
            if (Modifier.isStatic(modifiers)) {
                return C11169c.f54076c;
            }
            return C11168b.f54075c;
        }

        /* renamed from: b */
        public static boolean m89497b(C14118v vVar) {
            return Modifier.isAbstract(vVar.getModifiers());
        }

        /* renamed from: c */
        public static boolean m89498c(C14118v vVar) {
            return Modifier.isFinal(vVar.getModifiers());
        }

        /* renamed from: d */
        public static boolean m89499d(C14118v vVar) {
            return Modifier.isStatic(vVar.getModifiers());
        }
    }

    int getModifiers();
}
