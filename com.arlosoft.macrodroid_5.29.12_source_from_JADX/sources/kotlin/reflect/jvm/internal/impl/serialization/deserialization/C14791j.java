package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import p297ja.C13328m;
import p308kb.C13481i;
import p327mb.C15724g;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.j */
/* compiled from: ContractDeserializer.kt */
public interface C14791j {

    /* renamed from: a */
    public static final C14792a f63889a = C14792a.f63890a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.j$a */
    /* compiled from: ContractDeserializer.kt */
    public static final class C14792a {

        /* renamed from: a */
        static final /* synthetic */ C14792a f63890a = new C14792a();

        /* renamed from: b */
        private static final C14791j f63891b = new C14793a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.j$a$a */
        /* compiled from: ContractDeserializer.kt */
        public static final class C14793a implements C14791j {
            C14793a() {
            }

            /* renamed from: a */
            public C13328m mo73957a(C13481i iVar, C14154y yVar, C15724g gVar, C14720d0 d0Var) {
                C13706o.m87929f(iVar, "proto");
                C13706o.m87929f(yVar, "ownerFunction");
                C13706o.m87929f(gVar, "typeTable");
                C13706o.m87929f(d0Var, "typeDeserializer");
                return null;
            }
        }

        private C14792a() {
        }

        /* renamed from: a */
        public final C14791j mo73958a() {
            return f63891b;
        }
    }

    /* renamed from: a */
    C13328m<C13908a.C13909a<?>, Object> mo73957a(C13481i iVar, C14154y yVar, C15724g gVar, C14720d0 d0Var);
}
