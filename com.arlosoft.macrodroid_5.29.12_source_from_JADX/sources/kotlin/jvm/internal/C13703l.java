package kotlin.jvm.internal;

import p433xa.C16874c;
import p433xa.C16879h;

/* renamed from: kotlin.jvm.internal.l */
/* compiled from: FunctionReference */
public class C13703l extends C13685e implements C13699k, C16879h {
    private final int arity;
    private final int flags;

    public C13703l(int i) {
        this(i, C13685e.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C16874c computeReflected() {
        return C13687e0.m87867a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13703l) {
            C13703l lVar = (C13703l) obj;
            if (!getName().equals(lVar.getName()) || !getSignature().equals(lVar.getSignature()) || this.flags != lVar.flags || this.arity != lVar.arity || !C13706o.m87924a(getBoundReceiver(), lVar.getBoundReceiver()) || !C13706o.m87924a(getOwner(), lVar.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof C16879h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C16874c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C13703l(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C16879h getReflected() {
        return (C16879h) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13703l(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
