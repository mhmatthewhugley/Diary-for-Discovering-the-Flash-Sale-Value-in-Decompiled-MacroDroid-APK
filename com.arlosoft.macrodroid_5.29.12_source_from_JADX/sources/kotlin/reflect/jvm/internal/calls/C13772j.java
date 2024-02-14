package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/calls/j;", "Lkotlin/reflect/jvm/internal/calls/d;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "c", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "<init>", "()V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.calls.j */
/* compiled from: ThrowingCaller.kt */
public final class C13772j implements C13738d {

    /* renamed from: a */
    public static final C13772j f61986a = new C13772j();

    private C13772j() {
    }

    /* renamed from: a */
    public List<Type> mo71984a() {
        return C13614t.m87748j();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo71985b() {
        return (Member) mo72004c();
    }

    /* renamed from: c */
    public Void mo72004c() {
        return null;
    }

    public Object call(Object[] objArr) {
        C13706o.m87929f(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    public Type getReturnType() {
        Class cls = Void.TYPE;
        C13706o.m87928e(cls, "TYPE");
        return cls;
    }
}
