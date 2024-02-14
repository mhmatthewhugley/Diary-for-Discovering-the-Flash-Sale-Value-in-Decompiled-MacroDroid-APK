package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.m81294c();

    /* renamed from: com.google.protobuf.GeneratedMessageLite$1 */
    static /* synthetic */ class C115891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56908a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.protobuf.WireFormat$JavaType[] r0 = com.google.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56908a = r0
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56908a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.C115891.<clinit>():void");
        }
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* renamed from: a */
        private final MessageType f56909a;

        /* renamed from: c */
        protected MessageType f56910c;

        /* renamed from: d */
        protected boolean f56911d = false;

        protected Builder(MessageType messagetype) {
            this.f56909a = messagetype;
            this.f56910c = (GeneratedMessageLite) messagetype.mo65185u(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: M */
        private void m80666M(MessageType messagetype, MessageType messagetype2) {
            Protobuf.m81041a().mo65367e(messagetype).mo65343a(messagetype, messagetype2);
        }

        /* renamed from: A */
        public MessageType mo65192E0() {
            if (this.f56911d) {
                return this.f56910c;
            }
            this.f56910c.mo65169F();
            this.f56911d = true;
            return this.f56910c;
        }

        /* renamed from: B */
        public BuilderType mo64725p() {
            BuilderType H = mo65176e().mo65175d();
            H.mo65195J(mo65192E0());
            return H;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public final void mo65189C() {
            if (this.f56911d) {
                mo65190D();
                this.f56911d = false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public void mo65190D() {
            MessageType messagetype = (GeneratedMessageLite) this.f56910c.mo65185u(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            m80666M(messagetype, this.f56910c);
            this.f56910c = messagetype;
        }

        /* renamed from: E */
        public MessageType mo65176e() {
            return this.f56909a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: G */
        public BuilderType mo64726r(MessageType messagetype) {
            return mo65195J(messagetype);
        }

        /* renamed from: H */
        public BuilderType mo64728t(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            mo65189C();
            try {
                Protobuf.m81041a().mo65367e(this.f56910c).mo65351h(this.f56910c, CodedInputStreamReader.m80029Q(codedInputStream), extensionRegistryLite);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: J */
        public BuilderType mo65195J(MessageType messagetype) {
            mo65189C();
            m80666M(this.f56910c, messagetype);
            return this;
        }

        /* renamed from: K */
        public BuilderType mo64732x(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return mo65197L(bArr, i, i2, ExtensionRegistryLite.m80520b());
        }

        /* renamed from: L */
        public BuilderType mo65197L(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            mo65189C();
            try {
                Protobuf.m81041a().mo65367e(this.f56910c).mo65352i(this.f56910c, bArr, i, i + i2, new ArrayDecoders.Registers(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.m80767k();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: z */
        public final MessageType build() {
            MessageType A = mo65192E0();
            if (A.mo65172a()) {
                return A;
            }
            throw AbstractMessageLite.Builder.m79298y(A);
        }
    }

    protected static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* renamed from: b */
        private final T f56912b;

        public DefaultInstanceBasedParser(T t) {
            this.f56912b = t;
        }

        /* renamed from: i */
        public T mo65200c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.m80640P(this.f56912b, codedInputStream, extensionRegistryLite);
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public void mo65190D() {
            super.mo65190D();
            MessageType messagetype = this.f56910c;
            ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
        }

        /* renamed from: N */
        public final MessageType mo65192E0() {
            if (this.f56911d) {
                return (ExtendableMessage) this.f56910c;
            }
            ((ExtendableMessage) this.f56910c).extensions.mo65139t();
            return (ExtendableMessage) super.mo65192E0();
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<ExtensionDescriptor> extensions = FieldSet.m80578h();

        protected class ExtensionWriter {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public FieldSet<ExtensionDescriptor> mo65203T() {
            if (this.extensions.mo65136o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ MessageLite.Builder mo65173b() {
            return GeneratedMessageLite.super.mo65173b();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ MessageLite.Builder mo65175d() {
            return GeneratedMessageLite.super.mo65175d();
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ MessageLite mo65176e() {
            return GeneratedMessageLite.super.mo65176e();
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
    }

    static final class ExtensionDescriptor implements FieldSet.FieldDescriptorLite<ExtensionDescriptor> {

        /* renamed from: a */
        final Internal.EnumLiteMap<?> f56913a;

        /* renamed from: c */
        final int f56914c;

        /* renamed from: d */
        final WireFormat.FieldType f56915d;

        /* renamed from: f */
        final boolean f56916f;

        /* renamed from: g */
        final boolean f56917g;

        ExtensionDescriptor(Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f56913a = enumLiteMap;
            this.f56914c = i;
            this.f56915d = fieldType;
            this.f56916f = z;
            this.f56917g = z2;
        }

        /* renamed from: D */
        public WireFormat.FieldType mo65142D() {
            return this.f56915d;
        }

        /* renamed from: M */
        public WireFormat.JavaType mo65143M() {
            return this.f56915d.mo65548b();
        }

        /* renamed from: O */
        public boolean mo65144O() {
            return this.f56917g;
        }

        /* renamed from: b */
        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.f56914c - extensionDescriptor.f56914c;
        }

        /* renamed from: c */
        public int mo65145c() {
            return this.f56914c;
        }

        /* renamed from: d */
        public Internal.EnumLiteMap<?> mo65206d() {
            return this.f56913a;
        }

        /* renamed from: f0 */
        public MessageLite.Builder mo65146f0(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mo65195J((GeneratedMessageLite) messageLite);
        }

        /* renamed from: u */
        public boolean mo65147u() {
            return this.f56916f;
        }
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a */
        final ContainingType f56918a;

        /* renamed from: b */
        final Type f56919b;

        /* renamed from: c */
        final MessageLite f56920c;

        /* renamed from: d */
        final ExtensionDescriptor f56921d;

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (extensionDescriptor.mo65142D() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f56918a = containingtype;
                this.f56919b = type;
                this.f56920c = messageLite;
                this.f56921d = extensionDescriptor;
            }
        }

        /* renamed from: a */
        public WireFormat.FieldType mo65207a() {
            return this.f56921d.mo65142D();
        }

        /* renamed from: b */
        public MessageLite mo65208b() {
            return this.f56920c;
        }

        /* renamed from: c */
        public int mo65209c() {
            return this.f56921d.mo65145c();
        }

        /* renamed from: d */
        public boolean mo65210d() {
            return this.f56921d.f56916f;
        }
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        @Deprecated
        /* renamed from: a */
        private Object m80706a() throws ObjectStreamException {
            try {
                Field declaredField = m80707b().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get((Object) null)).mo65175d().mo64731w1(this.asBytes).mo65192E0();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e2);
            } catch (SecurityException e3) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            }
        }

        /* renamed from: b */
        private Class<?> m80707b() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        /* access modifiers changed from: protected */
        public Object readResolve() throws ObjectStreamException {
            try {
                Field declaredField = m80707b().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get((Object) null)).mo65175d().mo64731w1(this.asBytes).mo65192E0();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException unused) {
                return m80706a();
            } catch (SecurityException e2) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }
    }

    /* renamed from: A */
    protected static <E> Internal.ProtobufList<E> m80628A() {
        return ProtobufArrayList.m81048f();
    }

    /* renamed from: B */
    static <T extends GeneratedMessageLite<?, ?>> T m80629B(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((GeneratedMessageLite) UnsafeUtil.m81388j(cls)).mo65176e();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: D */
    static Object m80630D(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: E */
    protected static final <T extends GeneratedMessageLite<T, ?>> boolean m80631E(T t, boolean z) {
        byte byteValue = ((Byte) t.mo65185u(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f = Protobuf.m81041a().mo65367e(t).mo65349f(t);
        if (z) {
            t.mo65186v(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, f ? t : null);
        }
        return f;
    }

    /* renamed from: G */
    protected static <E> Internal.ProtobufList<E> m80632G(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mo64901q1(size == 0 ? 10 : size * 2);
    }

    /* renamed from: I */
    protected static Object m80633I(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    /* renamed from: J */
    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> m80634J(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension(containingtype, Collections.emptyList(), messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, true, z), cls);
    }

    /* renamed from: K */
    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> m80635K(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension(containingtype, type, messageLite, new ExtensionDescriptor(enumLiteMap, i, fieldType, false, false), cls);
    }

    /* renamed from: L */
    protected static <T extends GeneratedMessageLite<T, ?>> T m80636L(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return m80643r(m80637M(t, byteString, ExtensionRegistryLite.m80520b()));
    }

    /* renamed from: M */
    protected static <T extends GeneratedMessageLite<T, ?>> T m80637M(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return m80643r(m80639O(t, byteString, extensionRegistryLite));
    }

    /* renamed from: N */
    protected static <T extends GeneratedMessageLite<T, ?>> T m80638N(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return m80643r(m80641Q(t, bArr, 0, bArr.length, ExtensionRegistryLite.m80520b()));
    }

    /* renamed from: O */
    private static <T extends GeneratedMessageLite<T, ?>> T m80639O(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T P;
        try {
            CodedInputStream M = byteString.mo64910M();
            P = m80640P(t, M, extensionRegistryLite);
            M.mo64958a(0);
            return P;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo65249i(P);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: P */
    static <T extends GeneratedMessageLite<T, ?>> T m80640P(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo65185u(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            Schema e = Protobuf.m81041a().mo65367e(t2);
            e.mo65351h(t2, CodedInputStreamReader.m80029Q(codedInputStream), extensionRegistryLite);
            e.mo65348e(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage()).mo65249i(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: Q */
    static <T extends GeneratedMessageLite<T, ?>> T m80641Q(T t, byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo65185u(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            Schema e = Protobuf.m81041a().mo65367e(t2);
            e.mo65352i(t2, bArr, i, i + i2, new ArrayDecoders.Registers(extensionRegistryLite));
            e.mo65348e(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage()).mo65249i(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m80767k().mo65249i(t2);
        }
    }

    /* renamed from: R */
    protected static <T extends GeneratedMessageLite<?, ?>> void m80642R(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: r */
    private static <T extends GeneratedMessageLite<T, ?>> T m80643r(T t) throws InvalidProtocolBufferException {
        if (t == null || t.mo65172a()) {
            return t;
        }
        throw t.mo64721o().mo65441a().mo65249i(t);
    }

    /* renamed from: x */
    protected static Internal.DoubleList m80644x() {
        return DoubleArrayList.m80494j();
    }

    /* renamed from: y */
    protected static Internal.IntList m80645y() {
        return IntArrayList.m80719j();
    }

    /* renamed from: z */
    protected static Internal.LongList m80646z() {
        return LongArrayList.m80835j();
    }

    /* renamed from: C */
    public final MessageType mo65176e() {
        return (GeneratedMessageLite) mo65185u(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo65169F() {
        Protobuf.m81041a().mo65367e(this).mo65348e(this);
    }

    /* renamed from: H */
    public final BuilderType mo65175d() {
        return (Builder) mo65185u(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: S */
    public final BuilderType mo65173b() {
        BuilderType buildertype = (Builder) mo65185u(MethodToInvoke.NEW_BUILDER);
        buildertype.mo65195J(this);
        return buildertype;
    }

    /* renamed from: a */
    public final boolean mo65172a() {
        return m80631E(this, true);
    }

    /* renamed from: c */
    public int mo65174c() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = Protobuf.m81041a().mo65367e(this).mo65350g(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Protobuf.m81041a().mo65367e(this).mo65345c(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final Parser<MessageType> mo65178f() {
        return (Parser) mo65185u(MethodToInvoke.GET_PARSER);
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int b = Protobuf.m81041a().mo65367e(this).mo65344b(this);
        this.memoizedHashCode = b;
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo64719j() {
        return this.memoizedSerializedSize;
    }

    /* renamed from: k */
    public void mo65180k(CodedOutputStream codedOutputStream) throws IOException {
        Protobuf.m81041a().mo65367e(this).mo65347d(this, CodedOutputStreamWriter.m80349Q(codedOutputStream));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo64722p(int i) {
        this.memoizedSerializedSize = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Object mo65181q() throws Exception {
        return mo65185u(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType mo65182s() {
        return (Builder) mo65185u(MethodToInvoke.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType mo65183t(MessageType messagetype) {
        return mo65182s().mo65195J(messagetype);
    }

    public String toString() {
        return MessageLiteToString.m80915e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Object mo65185u(MethodToInvoke methodToInvoke) {
        return mo60051w(methodToInvoke, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo65186v(MethodToInvoke methodToInvoke, Object obj) {
        return mo60051w(methodToInvoke, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract Object mo60051w(MethodToInvoke methodToInvoke, Object obj, Object obj2);
}
