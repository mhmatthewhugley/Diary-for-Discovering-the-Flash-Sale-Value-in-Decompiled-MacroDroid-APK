package p433xa;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, mo71668d2 = {"Lxa/a;", "Ljava/lang/reflect/GenericArrayType;", "", "Ljava/lang/reflect/Type;", "getGenericComponentType", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: xa.a */
/* compiled from: TypesJVM.kt */
final class C16872a implements GenericArrayType, Type {

    /* renamed from: a */
    private final Type f68124a;

    public C16872a(Type type) {
        C13706o.m87929f(type, "elementType");
        this.f68124a = type;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C13706o.m87924a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    public Type getGenericComponentType() {
        return this.f68124a;
    }

    public String getTypeName() {
        return C16898u.m99956h(this.f68124a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
