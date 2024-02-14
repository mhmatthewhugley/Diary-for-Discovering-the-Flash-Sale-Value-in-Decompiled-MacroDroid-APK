package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.g */
/* compiled from: MemberComparator */
public class C14655g implements Comparator<C14064m> {

    /* renamed from: a */
    public static final C14655g f63652a = new C14655g();

    private C14655g() {
    }

    /* renamed from: b */
    private static Integer m91647b(C14064m mVar, C14064m mVar2) {
        int c = m91648c(mVar2) - m91648c(mVar);
        if (c != 0) {
            return Integer.valueOf(c);
        }
        if (C14650d.m91602B(mVar) && C14650d.m91602B(mVar2)) {
            return 0;
        }
        int e = mVar.getName().compareTo(mVar2.getName());
        if (e != 0) {
            return Integer.valueOf(e);
        }
        return null;
    }

    /* renamed from: c */
    private static int m91648c(C14064m mVar) {
        if (C14650d.m91602B(mVar)) {
            return 8;
        }
        if (mVar instanceof C14052l) {
            return 7;
        }
        if (mVar instanceof C14140t0) {
            return ((C14140t0) mVar).mo72232P() == null ? 6 : 5;
        }
        if (mVar instanceof C14154y) {
            return ((C14154y) mVar).mo72232P() == null ? 4 : 3;
        }
        if (mVar instanceof C13948e) {
            return 2;
        }
        return mVar instanceof C13947d1 ? 1 : 0;
    }

    /* renamed from: a */
    public int compare(C14064m mVar, C14064m mVar2) {
        Integer b = m91647b(mVar, mVar2);
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }
}
