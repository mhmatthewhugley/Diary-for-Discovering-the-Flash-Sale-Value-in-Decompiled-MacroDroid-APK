package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.C13695i;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.e */
/* compiled from: DescriptorRenderer.kt */
public enum C14578e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    

    /* renamed from: a */
    public static final C14579a f63518a = null;

    /* renamed from: c */
    public static final Set<C14578e> f63519c = null;

    /* renamed from: d */
    public static final Set<C14578e> f63520d = null;
    private final boolean includeByDefault;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.e$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class C14579a {
        private C14579a() {
        }

        public /* synthetic */ C14579a(C13695i iVar) {
            this();
        }
    }

    static {
        int i;
        f63518a = new C14579a((C13695i) null);
        C14578e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (C14578e eVar : values) {
            if (eVar.includeByDefault) {
                arrayList.add(eVar);
            }
        }
        f63519c = C13566b0.m87407K0(arrayList);
        f63520d = C13596m.m87627v0(values());
    }

    private C14578e(boolean z) {
        this.includeByDefault = z;
    }
}
