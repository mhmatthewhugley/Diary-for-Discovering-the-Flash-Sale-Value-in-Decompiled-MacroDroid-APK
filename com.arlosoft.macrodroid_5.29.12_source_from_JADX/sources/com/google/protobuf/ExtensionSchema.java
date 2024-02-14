package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.util.Map;

abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    ExtensionSchema() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo65100a(Map.Entry<?, ?> entry);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Object mo65101b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract FieldSet<T> mo65102c(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract FieldSet<T> mo65103d(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo65104e(MessageLite messageLite);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo65105f(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract <UT, UB> UB mo65106g(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo65107h(Reader reader, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo65108i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo65109j(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}
