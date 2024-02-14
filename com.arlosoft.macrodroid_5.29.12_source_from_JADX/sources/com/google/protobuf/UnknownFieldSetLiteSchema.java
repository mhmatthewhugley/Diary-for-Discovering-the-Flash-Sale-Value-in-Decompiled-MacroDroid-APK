package com.google.protobuf;

import java.io.IOException;

class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    UnknownFieldSetLiteSchema() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public UnknownFieldSetLite mo65448g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo65449h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.mo65463d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo65450i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.mo65464e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public UnknownFieldSetLite mo65452k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        return unknownFieldSetLite2.equals(UnknownFieldSetLite.m81294c()) ? unknownFieldSetLite : UnknownFieldSetLite.m81297i(unknownFieldSetLite, unknownFieldSetLite2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public UnknownFieldSetLite mo65455n() {
        return UnknownFieldSetLite.m81298j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo65456o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        mo65457p(obj, unknownFieldSetLite);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo65457p(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public UnknownFieldSetLite mo65459r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.mo65466h();
        return unknownFieldSetLite;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo65460s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.mo65470o(writer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo65461t(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.mo65471q(writer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo65451j(Object obj) {
        mo65448g(obj).mo65466h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo65458q(Reader reader) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo65442a(UnknownFieldSetLite unknownFieldSetLite, int i, int i2) {
        unknownFieldSetLite.mo65469m(WireFormat.m81549c(i, 5), Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo65443b(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.mo65469m(WireFormat.m81549c(i, 1), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo65444c(UnknownFieldSetLite unknownFieldSetLite, int i, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.mo65469m(WireFormat.m81549c(i, 3), unknownFieldSetLite2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo65445d(UnknownFieldSetLite unknownFieldSetLite, int i, ByteString byteString) {
        unknownFieldSetLite.mo65469m(WireFormat.m81549c(i, 2), byteString);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo65446e(UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.mo65469m(WireFormat.m81549c(i, 0), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public UnknownFieldSetLite mo65447f(Object obj) {
        UnknownFieldSetLite A = mo65448g(obj);
        if (A != UnknownFieldSetLite.m81294c()) {
            return A;
        }
        UnknownFieldSetLite j = UnknownFieldSetLite.m81298j();
        mo65457p(obj, j);
        return j;
    }
}
