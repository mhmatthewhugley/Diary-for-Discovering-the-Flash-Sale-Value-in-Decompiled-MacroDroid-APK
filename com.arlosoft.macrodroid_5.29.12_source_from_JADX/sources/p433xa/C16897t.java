package p433xa;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13327l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0016"}, mo71668d2 = {"Lxa/t;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "", "", "getName", "getGenericDeclaration", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "Lxa/o;", "typeParameter", "<init>", "(Lxa/o;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: xa.t */
/* compiled from: TypesJVM.kt */
final class C16897t implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: a */
    private final C16889o f68147a;

    public C16897t(C16889o oVar) {
        C13706o.m87929f(oVar, "typeParameter");
        this.f68147a = oVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            return C13706o.m87924a(getName(), typeVariable.getName()) && C13706o.m87924a(getGenericDeclaration(), typeVariable.getGenericDeclaration());
        }
    }

    public Type[] getBounds() {
        List<C16888n> upperBounds = this.f68147a.getUpperBounds();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(upperBounds, 10));
        for (C16888n a : upperBounds) {
            arrayList.add(C16898u.m99951c(a, true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Type[]) array;
    }

    public GenericDeclaration getGenericDeclaration() {
        throw new C13327l("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f68147a));
    }

    public String getName() {
        return this.f68147a.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
