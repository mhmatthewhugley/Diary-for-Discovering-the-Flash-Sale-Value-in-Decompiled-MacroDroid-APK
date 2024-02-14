package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p361pa.C16148b;
import p433xa.C16874c;
import p433xa.C16878g;
import p433xa.C16881j;
import p433xa.C16888n;
import p433xa.C16889o;
import p433xa.C16894r;

/* renamed from: kotlin.jvm.internal.e */
/* compiled from: CallableReference */
public abstract class C13685e implements C16874c, Serializable {
    public static final Object NO_RECEIVER = C13686a.f61919a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C16874c reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.e$a */
    /* compiled from: CallableReference */
    private static class C13686a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C13686a f61919a = new C13686a();

        private C13686a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f61919a;
        }
    }

    public C13685e() {
        this(NO_RECEIVER);
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C16874c compute() {
        C16874c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        C16874c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C16874c computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C16878g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C13687e0.m87869c(cls) : C13687e0.m87868b(cls);
    }

    public List<C16881j> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C16874c getReflected() {
        C16874c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C16148b();
    }

    public C16888n getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<C16889o> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C16894r getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected C13685e(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C13685e(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
