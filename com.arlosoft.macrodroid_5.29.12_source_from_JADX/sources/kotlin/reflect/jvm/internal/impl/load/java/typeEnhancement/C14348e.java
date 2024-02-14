package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.C13695i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e */
/* compiled from: typeQualifiers.kt */
public final class C14348e {

    /* renamed from: e */
    public static final C14349a f63126e = new C14349a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C14348e f63127f = new C14348e((C14352h) null, (C14350f) null, false, false, 8, (C13695i) null);

    /* renamed from: a */
    private final C14352h f63128a;

    /* renamed from: b */
    private final C14350f f63129b;

    /* renamed from: c */
    private final boolean f63130c;

    /* renamed from: d */
    private final boolean f63131d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.e$a */
    /* compiled from: typeQualifiers.kt */
    public static final class C14349a {
        private C14349a() {
        }

        public /* synthetic */ C14349a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14348e mo73019a() {
            return C14348e.f63127f;
        }
    }

    public C14348e(C14352h hVar, C14350f fVar, boolean z, boolean z2) {
        this.f63128a = hVar;
        this.f63129b = fVar;
        this.f63130c = z;
        this.f63131d = z2;
    }

    /* renamed from: b */
    public final boolean mo73015b() {
        return this.f63130c;
    }

    /* renamed from: c */
    public final C14350f mo73016c() {
        return this.f63129b;
    }

    /* renamed from: d */
    public final C14352h mo73017d() {
        return this.f63128a;
    }

    /* renamed from: e */
    public final boolean mo73018e() {
        return this.f63131d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14348e(C14352h hVar, C14350f fVar, boolean z, boolean z2, int i, C13695i iVar) {
        this(hVar, fVar, z, (i & 8) != 0 ? false : z2);
    }
}
