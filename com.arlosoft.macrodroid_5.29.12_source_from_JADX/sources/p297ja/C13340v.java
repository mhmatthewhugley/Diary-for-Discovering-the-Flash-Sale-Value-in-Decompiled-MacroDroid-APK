package p297ja;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo71668d2 = {"Lja/v;", "T", "Lja/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "a", "", "toString", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Lqa/a;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ja.v */
/* compiled from: Lazy.kt */
public final class C13340v<T> implements C13321g<T>, Serializable {
    private Object _value = C13338t.f61330a;
    private C16254a<? extends T> initializer;

    public C13340v(C16254a<? extends T> aVar) {
        C13706o.m87929f(aVar, "initializer");
        this.initializer = aVar;
    }

    private final Object writeReplace() {
        return new C13317d(getValue());
    }

    /* renamed from: a */
    public boolean mo70178a() {
        return this._value != C13338t.f61330a;
    }

    public T getValue() {
        if (this._value == C13338t.f61330a) {
            C16254a<? extends T> aVar = this.initializer;
            C13706o.m87926c(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return this._value;
    }

    public String toString() {
        return mo70178a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
