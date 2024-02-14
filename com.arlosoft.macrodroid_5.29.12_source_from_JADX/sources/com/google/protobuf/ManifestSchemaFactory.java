package com.google.protobuf;

final class ManifestSchemaFactory implements SchemaFactory {

    /* renamed from: b */
    private static final MessageInfoFactory f56992b = new MessageInfoFactory() {
        /* renamed from: a */
        public MessageInfo mo65166a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo65167b(Class<?> cls) {
            return false;
        }
    };

    /* renamed from: a */
    private final MessageInfoFactory f56993a;

    private static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* renamed from: a */
        private MessageInfoFactory[] f56994a;

        CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.f56994a = messageInfoFactoryArr;
        }

        /* renamed from: a */
        public MessageInfo mo65166a(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.f56994a) {
                if (messageInfoFactory.mo65167b(cls)) {
                    return messageInfoFactory.mo65166a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo65167b(Class<?> cls) {
            for (MessageInfoFactory b : this.f56994a) {
                if (b.mo65167b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ManifestSchemaFactory() {
        this(m80848b());
    }

    /* renamed from: b */
    private static MessageInfoFactory m80848b() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.m80625c(), m80849c());
    }

    /* renamed from: c */
    private static MessageInfoFactory m80849c() {
        try {
            return (MessageInfoFactory) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f56992b;
        }
    }

    /* renamed from: d */
    private static boolean m80850d(MessageInfo messageInfo) {
        return messageInfo.mo65342c() == ProtoSyntax.PROTO2;
    }

    /* renamed from: e */
    private static <T> Schema<T> m80851e(Class<T> cls, MessageInfo messageInfo) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (m80850d(messageInfo)) {
                return MessageSchema.m80932Q(cls, messageInfo, NewInstanceSchemas.m81014b(), ListFieldSchema.m80819b(), SchemaUtil.m81157M(), ExtensionSchemas.m80544b(), MapFieldSchemas.m80892b());
            }
            return MessageSchema.m80932Q(cls, messageInfo, NewInstanceSchemas.m81014b(), ListFieldSchema.m80819b(), SchemaUtil.m81157M(), (ExtensionSchema<?>) null, MapFieldSchemas.m80892b());
        } else if (m80850d(messageInfo)) {
            return MessageSchema.m80932Q(cls, messageInfo, NewInstanceSchemas.m81013a(), ListFieldSchema.m80818a(), SchemaUtil.m81152H(), ExtensionSchemas.m80543a(), MapFieldSchemas.m80891a());
        } else {
            return MessageSchema.m80932Q(cls, messageInfo, NewInstanceSchemas.m81013a(), ListFieldSchema.m80818a(), SchemaUtil.m81153I(), (ExtensionSchema<?>) null, MapFieldSchemas.m80891a());
        }
    }

    /* renamed from: a */
    public <T> Schema<T> mo65318a(Class<T> cls) {
        SchemaUtil.m81154J(cls);
        MessageInfo a = this.f56993a.mo65166a(cls);
        if (!a.mo65340a()) {
            return m80851e(cls, a);
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return MessageSetSchema.m80995l(SchemaUtil.m81157M(), ExtensionSchemas.m80544b(), a.mo65341b());
        }
        return MessageSetSchema.m80995l(SchemaUtil.m81152H(), ExtensionSchemas.m80543a(), a.mo65341b());
    }

    private ManifestSchemaFactory(MessageInfoFactory messageInfoFactory) {
        this.f56993a = (MessageInfoFactory) Internal.m80733b(messageInfoFactory, "messageInfoFactory");
    }
}
