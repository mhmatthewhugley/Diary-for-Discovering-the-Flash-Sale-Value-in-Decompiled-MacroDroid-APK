package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.l */
/* compiled from: ClassTypeConstructorImpl */
public class C14943l extends C14832b {

    /* renamed from: d */
    private final C13948e f64063d;

    /* renamed from: e */
    private final List<C13950e1> f64064e;

    /* renamed from: f */
    private final Collection<C14900e0> f64065f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14943l(C13948e eVar, List<? extends C13950e1> list, Collection<C14900e0> collection, C17012n nVar) {
        super(nVar);
        if (eVar == null) {
            m92927u(0);
        }
        if (list == null) {
            m92927u(1);
        }
        if (collection == null) {
            m92927u(2);
        }
        if (nVar == null) {
            m92927u(3);
        }
        this.f64063d = eVar;
        this.f64064e = Collections.unmodifiableList(new ArrayList(list));
        this.f64065f = Collections.unmodifiableCollection(collection);
    }

    /* renamed from: u */
    private static /* synthetic */ void m92927u(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: d */
    public boolean mo62184d() {
        return true;
    }

    public List<C13950e1> getParameters() {
        List<C13950e1> list = this.f64064e;
        if (list == null) {
            m92927u(4);
        }
        return list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Collection<C14900e0> mo62186j() {
        Collection<C14900e0> collection = this.f64065f;
        if (collection == null) {
            m92927u(6);
        }
        return collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C13942c1 mo62187p() {
        C13942c1.C13943a aVar = C13942c1.C13943a.f62415a;
        if (aVar == null) {
            m92927u(7);
        }
        return aVar;
    }

    public String toString() {
        return C14650d.m91626m(this.f64063d).mo78568b();
    }

    /* renamed from: v */
    public C13948e mo62183c() {
        C13948e eVar = this.f64063d;
        if (eVar == null) {
            m92927u(5);
        }
        return eVar;
    }
}
