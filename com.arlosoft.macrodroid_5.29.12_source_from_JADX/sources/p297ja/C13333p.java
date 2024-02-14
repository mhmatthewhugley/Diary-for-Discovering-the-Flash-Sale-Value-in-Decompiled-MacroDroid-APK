package p297ja;

import androidx.concurrent.futures.C0320a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p370qa.C16254a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\bB\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo71668d2 = {"Lja/p;", "T", "Lja/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "a", "", "toString", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Lqa/a;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ja.p */
/* compiled from: LazyJVM.kt */
final class C13333p<T> implements C13321g<T>, Serializable {

    /* renamed from: a */
    public static final C13334a f61328a = new C13334a((C13695i) null);

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater<C13333p<?>, Object> f61329c = AtomicReferenceFieldUpdater.newUpdater(C13333p.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f69358final;
    private volatile C16254a<? extends T> initializer;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo71668d2 = {"Lja/p$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lja/p;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ja.p$a */
    /* compiled from: LazyJVM.kt */
    public static final class C13334a {
        private C13334a() {
        }

        public /* synthetic */ C13334a(C13695i iVar) {
            this();
        }
    }

    public C13333p(C16254a<? extends T> aVar) {
        C13706o.m87929f(aVar, "initializer");
        this.initializer = aVar;
        C13338t tVar = C13338t.f61330a;
        this._value = tVar;
        this.f69358final = tVar;
    }

    private final Object writeReplace() {
        return new C13317d(getValue());
    }

    /* renamed from: a */
    public boolean mo70166a() {
        return this._value != C13338t.f61330a;
    }

    public T getValue() {
        T t = this._value;
        T t2 = C13338t.f61330a;
        if (t != t2) {
            return t;
        }
        C16254a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (C0320a.m383a(f61329c, this, t2, invoke)) {
                this.initializer = null;
                return invoke;
            }
        }
        return this._value;
    }

    public String toString() {
        return mo70166a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
