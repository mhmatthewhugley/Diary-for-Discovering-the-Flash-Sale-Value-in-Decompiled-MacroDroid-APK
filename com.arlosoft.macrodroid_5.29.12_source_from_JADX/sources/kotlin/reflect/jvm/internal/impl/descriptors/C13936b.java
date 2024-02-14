package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b */
/* compiled from: CallableMemberDescriptor */
public interface C13936b extends C13908a, C13941c0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b$a */
    /* compiled from: CallableMemberDescriptor */
    public enum C13937a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: b */
        public boolean mo72265b() {
            return this != FAKE_OVERRIDE;
        }
    }

    /* renamed from: D0 */
    void mo72262D0(Collection<? extends C13936b> collection);

    /* renamed from: O */
    C13936b mo72263O(C14064m mVar, C13945d0 d0Var, C14141u uVar, C13937a aVar, boolean z);

    /* renamed from: a */
    C13936b mo72233a();

    /* renamed from: d */
    Collection<? extends C13936b> mo72234d();

    /* renamed from: h */
    C13937a mo72264h();
}
