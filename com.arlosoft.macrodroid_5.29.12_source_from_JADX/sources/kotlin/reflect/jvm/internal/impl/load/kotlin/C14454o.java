package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14811u;
import p288ib.C12492g;
import p362pb.C16151b;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.o */
/* compiled from: KotlinClassFinder.kt */
public interface C14454o extends C14811u {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.o$a */
    /* compiled from: KotlinClassFinder.kt */
    public static abstract class C14455a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.o$a$a */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C14456a extends C14455a {

            /* renamed from: a */
            private final byte[] f63303a;

            /* renamed from: b */
            public final byte[] mo73202b() {
                return this.f63303a;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.o$a$b */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C14457b extends C14455a {

            /* renamed from: a */
            private final C14459q f63304a;

            /* renamed from: b */
            private final byte[] f63305b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14457b(C14459q qVar, byte[] bArr) {
                super((C13695i) null);
                C13706o.m87929f(qVar, "kotlinJvmBinaryClass");
                this.f63304a = qVar;
                this.f63305b = bArr;
            }

            /* renamed from: b */
            public final C14459q mo73203b() {
                return this.f63304a;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C14457b(C14459q qVar, byte[] bArr, int i, C13695i iVar) {
                this(qVar, (i & 2) != 0 ? null : bArr);
            }
        }

        private C14455a() {
        }

        public /* synthetic */ C14455a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14459q mo73201a() {
            C14457b bVar = this instanceof C14457b ? (C14457b) this : null;
            if (bVar != null) {
                return bVar.mo73203b();
            }
            return null;
        }
    }

    /* renamed from: b */
    C14455a mo67437b(C12492g gVar);

    /* renamed from: c */
    C14455a mo67438c(C16151b bVar);
}
