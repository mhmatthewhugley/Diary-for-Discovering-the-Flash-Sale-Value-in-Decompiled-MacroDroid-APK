package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.LazyField;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class MessageSetSchema<T> implements Schema<T> {

    /* renamed from: a */
    private final MessageLite f57026a;

    /* renamed from: b */
    private final UnknownFieldSchema<?, ?> f57027b;

    /* renamed from: c */
    private final boolean f57028c;

    /* renamed from: d */
    private final ExtensionSchema<?> f57029d;

    private MessageSetSchema(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        this.f57027b = unknownFieldSchema;
        this.f57028c = extensionSchema.mo65104e(messageLite);
        this.f57029d = extensionSchema;
        this.f57026a = messageLite;
    }

    /* renamed from: j */
    private <UT, UB> int m80993j(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t) {
        return unknownFieldSchema.mo65450i(unknownFieldSchema.mo65448g(t));
    }

    /* renamed from: k */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void m80994k(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        UB f = unknownFieldSchema.mo65447f(t);
        FieldSet<ET> d = extensionSchema.mo65103d(t);
        do {
            try {
                if (reader.mo64772G() == Integer.MAX_VALUE) {
                    unknownFieldSchema.mo65456o(t, f);
                    return;
                }
            } finally {
                unknownFieldSchema.mo65456o(t, f);
            }
        } while (m80996m(reader, extensionRegistryLite, extensionSchema, d, unknownFieldSchema, f));
    }

    /* renamed from: l */
    static <T> MessageSetSchema<T> m80995l(UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MessageLite messageLite) {
        return new MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    /* renamed from: m */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean m80996m(Reader reader, ExtensionRegistryLite extensionRegistryLite, ExtensionSchema<ET> extensionSchema, FieldSet<ET> fieldSet, UnknownFieldSchema<UT, UB> unknownFieldSchema, UB ub) throws IOException {
        int a = reader.mo64782a();
        if (a == WireFormat.f57164a) {
            int i = 0;
            Object obj = null;
            ByteString byteString = null;
            while (reader.mo64772G() != Integer.MAX_VALUE) {
                int a2 = reader.mo64782a();
                if (a2 == WireFormat.f57166c) {
                    i = reader.mo64794j();
                    obj = extensionSchema.mo65101b(extensionRegistryLite, this.f57026a, i);
                } else if (a2 == WireFormat.f57167d) {
                    if (obj != null) {
                        extensionSchema.mo65107h(reader, obj, extensionRegistryLite, fieldSet);
                    } else {
                        byteString = reader.mo64805s();
                    }
                } else if (!reader.mo64776K()) {
                    break;
                }
            }
            if (reader.mo64782a() == WireFormat.f57165b) {
                if (byteString != null) {
                    if (obj != null) {
                        extensionSchema.mo65108i(byteString, obj, extensionRegistryLite, fieldSet);
                    } else {
                        unknownFieldSchema.mo65445d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.m80758a();
        } else if (WireFormat.m81548b(a) != 2) {
            return reader.mo64776K();
        } else {
            Object b = extensionSchema.mo65101b(extensionRegistryLite, this.f57026a, WireFormat.m81547a(a));
            if (b == null) {
                return unknownFieldSchema.mo65454m(ub, reader);
            }
            extensionSchema.mo65107h(reader, b, extensionRegistryLite, fieldSet);
            return true;
        }
    }

    /* renamed from: n */
    private <UT, UB> void m80997n(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t, Writer writer) throws IOException {
        unknownFieldSchema.mo65460s(unknownFieldSchema.mo65448g(t), writer);
    }

    /* renamed from: a */
    public void mo65343a(T t, T t2) {
        SchemaUtil.m81151G(this.f57027b, t, t2);
        if (this.f57028c) {
            SchemaUtil.m81149E(this.f57029d, t, t2);
        }
    }

    /* renamed from: b */
    public int mo65344b(T t) {
        int hashCode = this.f57027b.mo65448g(t).hashCode();
        return this.f57028c ? (hashCode * 53) + this.f57029d.mo65102c(t).hashCode() : hashCode;
    }

    /* renamed from: c */
    public boolean mo65345c(T t, T t2) {
        if (!this.f57027b.mo65448g(t).equals(this.f57027b.mo65448g(t2))) {
            return false;
        }
        if (this.f57028c) {
            return this.f57029d.mo65102c(t).equals(this.f57029d.mo65102c(t2));
        }
        return true;
    }

    /* renamed from: d */
    public void mo65347d(T t, Writer writer) throws IOException {
        Iterator<Map.Entry<?, Object>> s = this.f57029d.mo65102c(t).mo65138s();
        while (s.hasNext()) {
            Map.Entry next = s.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.mo65143M() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.mo65147u() || fieldDescriptorLite.mo65144O()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof LazyField.LazyEntry) {
                writer.mo64836c(fieldDescriptorLite.mo65145c(), ((LazyField.LazyEntry) next).mo65257a().mo65269e());
            } else {
                writer.mo64836c(fieldDescriptorLite.mo65145c(), next.getValue());
            }
        }
        m80997n(this.f57027b, t, writer);
    }

    /* renamed from: e */
    public void mo65348e(T t) {
        this.f57027b.mo65451j(t);
        this.f57029d.mo65105f(t);
    }

    /* renamed from: f */
    public final boolean mo65349f(T t) {
        return this.f57029d.mo65102c(t).mo65137p();
    }

    /* renamed from: g */
    public int mo65350g(T t) {
        int j = m80993j(this.f57027b, t) + 0;
        return this.f57028c ? j + this.f57029d.mo65102c(t).mo65133j() : j;
    }

    /* renamed from: h */
    public void mo65351h(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        m80994k(this.f57027b, this.f57029d, t, reader, extensionRegistryLite);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.GeneratedMessageLite$GeneratedExtension} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65352i(T r11, byte[] r12, int r13, int r14, com.google.protobuf.ArrayDecoders.Registers r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            com.google.protobuf.UnknownFieldSetLite r1 = r0.unknownFields
            com.google.protobuf.UnknownFieldSetLite r2 = com.google.protobuf.UnknownFieldSetLite.m81294c()
            if (r1 != r2) goto L_0x0011
            com.google.protobuf.UnknownFieldSetLite r1 = com.google.protobuf.UnknownFieldSetLite.m81298j()
            r0.unknownFields = r1
        L_0x0011:
            com.google.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.google.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.google.protobuf.FieldSet r11 = r11.mo65203T()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.protobuf.ArrayDecoders.m79361I(r12, r13, r15)
            int r13 = r15.f56573a
            int r3 = com.google.protobuf.WireFormat.f57164a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.protobuf.WireFormat.m81548b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.protobuf.ExtensionSchema<?> r2 = r10.f57029d
            com.google.protobuf.ExtensionRegistryLite r3 = r15.f56576d
            com.google.protobuf.MessageLite r5 = r10.f57026a
            int r6 = com.google.protobuf.WireFormat.m81547a(r13)
            java.lang.Object r2 = r2.mo65101b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r8 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r8
            if (r8 == 0) goto L_0x005b
            com.google.protobuf.Protobuf r13 = com.google.protobuf.Protobuf.m81041a()
            com.google.protobuf.MessageLite r2 = r8.mo65208b()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.Schema r13 = r13.mo65366d(r2)
            int r13 = com.google.protobuf.ArrayDecoders.m79382p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r2 = r8.f56921d
            java.lang.Object r3 = r15.f56575c
            r11.mo65141x(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.ArrayDecoders.m79359G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.google.protobuf.ArrayDecoders.m79366N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.protobuf.ArrayDecoders.m79361I(r12, r4, r15)
            int r6 = r15.f56573a
            int r7 = com.google.protobuf.WireFormat.m81547a(r6)
            int r8 = com.google.protobuf.WireFormat.m81548b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.google.protobuf.Protobuf r6 = com.google.protobuf.Protobuf.m81041a()
            com.google.protobuf.MessageLite r7 = r2.mo65208b()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.Schema r6 = r6.mo65366d(r7)
            int r4 = com.google.protobuf.ArrayDecoders.m79382p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor r6 = r2.f56921d
            java.lang.Object r7 = r15.f56575c
            r11.mo65141x(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.protobuf.ArrayDecoders.m79368b(r12, r4, r15)
            java.lang.Object r3 = r15.f56575c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.protobuf.ArrayDecoders.m79361I(r12, r4, r15)
            int r13 = r15.f56573a
            com.google.protobuf.ExtensionSchema<?> r2 = r10.f57029d
            com.google.protobuf.ExtensionRegistryLite r6 = r15.f56576d
            com.google.protobuf.MessageLite r7 = r10.f57026a
            java.lang.Object r2 = r2.mo65101b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$GeneratedExtension r2 = (com.google.protobuf.GeneratedMessageLite.GeneratedExtension) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.protobuf.WireFormat.f57165b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.protobuf.ArrayDecoders.m79366N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.protobuf.WireFormat.m81549c(r13, r5)
            r1.mo65469m(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.m80764g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSetSchema.mo65352i(java.lang.Object, byte[], int, int, com.google.protobuf.ArrayDecoders$Registers):void");
    }

    public T newInstance() {
        return this.f57026a.mo65175d().mo65192E0();
    }
}
