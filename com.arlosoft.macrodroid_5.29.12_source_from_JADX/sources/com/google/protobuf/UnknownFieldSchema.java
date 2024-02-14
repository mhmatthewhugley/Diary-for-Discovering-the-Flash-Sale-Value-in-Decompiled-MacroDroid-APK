package com.google.protobuf;

import java.io.IOException;

abstract class UnknownFieldSchema<T, B> {
    UnknownFieldSchema() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo65442a(B b, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo65443b(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo65444c(B b, int i, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo65445d(B b, int i, ByteString byteString);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo65446e(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo65447f(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo65448g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo65449h(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo65450i(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo65451j(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo65452k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65453l(B r3, com.google.protobuf.Reader r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo64772G()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo65454m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.UnknownFieldSchema.mo65453l(java.lang.Object, com.google.protobuf.Reader):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo65454m(B b, Reader reader) throws IOException {
        int a = reader.mo64782a();
        int a2 = WireFormat.m81547a(a);
        int b2 = WireFormat.m81548b(a);
        if (b2 == 0) {
            mo65446e(b, a2, reader.mo64780O());
            return true;
        } else if (b2 == 1) {
            mo65443b(b, a2, reader.mo64784b());
            return true;
        } else if (b2 == 2) {
            mo65445d(b, a2, reader.mo64805s());
            return true;
        } else if (b2 == 3) {
            Object n = mo65455n();
            int c = WireFormat.m81549c(a2, 4);
            mo65453l(n, reader);
            if (c == reader.mo64782a()) {
                mo65444c(b, a2, mo65459r(n));
                return true;
            }
            throw InvalidProtocolBufferException.m80758a();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo65442a(b, a2, reader.mo64812z());
                return true;
            }
            throw InvalidProtocolBufferException.m80761d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract B mo65455n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo65456o(Object obj, B b);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo65457p(Object obj, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo65458q(Reader reader);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract T mo65459r(B b);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo65460s(T t, Writer writer) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo65461t(T t, Writer writer) throws IOException;
}
