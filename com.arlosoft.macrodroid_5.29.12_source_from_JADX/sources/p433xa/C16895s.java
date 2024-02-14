package p433xa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13704m;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016¨\u0006\u0018"}, mo71668d2 = {"Lxa/s;", "Ljava/lang/reflect/ParameterizedType;", "", "Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "Ljava/lang/Class;", "rawType", "ownerType", "", "typeArguments", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: xa.s */
/* compiled from: TypesJVM.kt */
final class C16895s implements ParameterizedType, Type {

    /* renamed from: a */
    private final Class<?> f68143a;

    /* renamed from: c */
    private final Type f68144c;

    /* renamed from: d */
    private final Type[] f68145d;

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: xa.s$a */
    /* compiled from: TypesJVM.kt */
    /* synthetic */ class C16896a extends C13704m implements C16265l<Type, String> {

        /* renamed from: a */
        public static final C16896a f68146a = new C16896a();

        C16896a() {
            super(1, C16898u.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        /* renamed from: l */
        public final String invoke(Type type) {
            C13706o.m87929f(type, "p0");
            return C16898u.m99956h(type);
        }
    }

    public C16895s(Class<?> cls, Type type, List<? extends Type> list) {
        C13706o.m87929f(cls, "rawType");
        C13706o.m87929f(list, "typeArguments");
        this.f68143a = cls;
        this.f68144c = type;
        Object[] array = list.toArray(new Type[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f68145d = (Type[]) array;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return C13706o.m87924a(this.f68143a, parameterizedType.getRawType()) && C13706o.m87924a(this.f68144c, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
    }

    public Type[] getActualTypeArguments() {
        return this.f68145d;
    }

    public Type getOwnerType() {
        return this.f68144c;
    }

    public Type getRawType() {
        return this.f68143a;
    }

    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f68144c;
        if (type != null) {
            sb.append(C16898u.m99956h(type));
            sb.append("$");
            sb.append(this.f68143a.getSimpleName());
        } else {
            sb.append(C16898u.m99956h(this.f68143a));
        }
        Type[] typeArr = this.f68145d;
        if (!(typeArr.length == 0)) {
            Appendable unused = C13596m.m87588M(typeArr, sb, (CharSequence) null, "<", ">", 0, (CharSequence) null, C16896a.f68146a, 50, (Object) null);
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.f68143a.hashCode();
        Type type = this.f68144c;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
