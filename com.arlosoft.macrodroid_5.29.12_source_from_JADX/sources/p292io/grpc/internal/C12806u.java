package p292io.grpc.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: io.grpc.internal.u */
/* compiled from: CompositeReadableBuffer */
public class C12806u extends C12614c {

    /* renamed from: a */
    private int f60198a;

    /* renamed from: c */
    private final Queue<C12798s1> f60199c = new ArrayDeque();

    /* renamed from: io.grpc.internal.u$a */
    /* compiled from: CompositeReadableBuffer */
    class C12807a extends C12809c {
        C12807a() {
            super((C12807a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo69565c(C12798s1 s1Var, int i) {
            return s1Var.readUnsignedByte();
        }
    }

    /* renamed from: io.grpc.internal.u$b */
    /* compiled from: CompositeReadableBuffer */
    class C12808b extends C12809c {

        /* renamed from: c */
        int f60201c;

        /* renamed from: d */
        final /* synthetic */ int f60202d;

        /* renamed from: e */
        final /* synthetic */ byte[] f60203e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12808b(int i, byte[] bArr) {
            super((C12807a) null);
            this.f60202d = i;
            this.f60203e = bArr;
            this.f60201c = i;
        }

        /* renamed from: c */
        public int mo69565c(C12798s1 s1Var, int i) {
            s1Var.mo69460M1(this.f60203e, this.f60201c, i);
            this.f60201c += i;
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$c */
    /* compiled from: CompositeReadableBuffer */
    private static abstract class C12809c {

        /* renamed from: a */
        int f60205a;

        /* renamed from: b */
        IOException f60206b;

        private C12809c() {
        }

        /* synthetic */ C12809c(C12807a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo69566a() {
            return this.f60206b != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo69567b(C12798s1 s1Var, int i) {
            try {
                this.f60205a = mo69565c(s1Var, i);
            } catch (IOException e) {
                this.f60206b = e;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo69565c(C12798s1 s1Var, int i) throws IOException;
    }

    /* renamed from: e */
    private void m84571e() {
        if (this.f60199c.peek().mo69462l() == 0) {
            this.f60199c.remove().close();
        }
    }

    /* renamed from: f */
    private void m84572f(C12809c cVar, int i) {
        mo69238b(i);
        if (!this.f60199c.isEmpty()) {
            m84571e();
        }
        while (i > 0 && !this.f60199c.isEmpty()) {
            C12798s1 peek = this.f60199c.peek();
            int min = Math.min(i, peek.mo69462l());
            cVar.mo69567b(peek, min);
            if (!cVar.mo69566a()) {
                i -= min;
                this.f60198a -= min;
                m84571e();
            } else {
                return;
            }
        }
        if (i > 0) {
            throw new AssertionError("Failed executing read operation");
        }
    }

    /* renamed from: M1 */
    public void mo69460M1(byte[] bArr, int i, int i2) {
        m84572f(new C12808b(i, bArr), i2);
    }

    /* renamed from: c */
    public void mo69563c(C12798s1 s1Var) {
        if (!(s1Var instanceof C12806u)) {
            this.f60199c.add(s1Var);
            this.f60198a += s1Var.mo69462l();
            return;
        }
        C12806u uVar = (C12806u) s1Var;
        while (!uVar.f60199c.isEmpty()) {
            this.f60199c.add(uVar.f60199c.remove());
        }
        this.f60198a += uVar.f60198a;
        uVar.f60198a = 0;
        uVar.close();
    }

    public void close() {
        while (!this.f60199c.isEmpty()) {
            this.f60199c.remove().close();
        }
    }

    /* renamed from: g */
    public C12806u mo69461Y(int i) {
        mo69238b(i);
        this.f60198a -= i;
        C12806u uVar = new C12806u();
        while (i > 0) {
            C12798s1 peek = this.f60199c.peek();
            if (peek.mo69462l() > i) {
                uVar.mo69563c(peek.mo69461Y(i));
                i = 0;
            } else {
                uVar.mo69563c(this.f60199c.poll());
                i -= peek.mo69462l();
            }
        }
        return uVar;
    }

    /* renamed from: l */
    public int mo69462l() {
        return this.f60198a;
    }

    public int readUnsignedByte() {
        C12807a aVar = new C12807a();
        m84572f(aVar, 1);
        return aVar.f60205a;
    }
}
