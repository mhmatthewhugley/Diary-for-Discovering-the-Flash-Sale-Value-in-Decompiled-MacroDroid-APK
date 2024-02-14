package p297ja;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, mo71668d2 = {"Lja/q;", "T", "Lja/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "a", "", "toString", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "lock", "<init>", "(Lqa/a;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ja.q */
/* compiled from: LazyJVM.kt */
final class C13335q<T> implements C13321g<T>, Serializable {
    private volatile Object _value;
    private C16254a<? extends T> initializer;
    private final Object lock;

    public C13335q(C16254a<? extends T> aVar, Object obj) {
        C13706o.m87929f(aVar, "initializer");
        this.initializer = aVar;
        this._value = C13338t.f61330a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C13317d(getValue());
    }

    /* renamed from: a */
    public boolean mo70168a() {
        return this._value != C13338t.f61330a;
    }

    public T getValue() {
        T t;
        T t2 = this._value;
        T t3 = C13338t.f61330a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == t3) {
                C16254a aVar = this.initializer;
                C13706o.m87926c(aVar);
                t = aVar.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    public String toString() {
        return mo70168a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13335q(C16254a aVar, Object obj, int i, C13695i iVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
