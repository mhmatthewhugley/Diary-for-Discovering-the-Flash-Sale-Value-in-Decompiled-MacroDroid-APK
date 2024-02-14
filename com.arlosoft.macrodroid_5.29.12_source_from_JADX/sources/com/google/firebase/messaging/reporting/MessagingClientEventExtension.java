package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;

public final class MessagingClientEventExtension {

    /* renamed from: b */
    private static final MessagingClientEventExtension f55155b = new Builder().mo63486a();

    /* renamed from: a */
    private final MessagingClientEvent f55156a;

    public static final class Builder {

        /* renamed from: a */
        private MessagingClientEvent f55157a = null;

        Builder() {
        }

        /* renamed from: a */
        public MessagingClientEventExtension mo63486a() {
            return new MessagingClientEventExtension(this.f55157a);
        }

        /* renamed from: b */
        public Builder mo63487b(MessagingClientEvent messagingClientEvent) {
            this.f55157a = messagingClientEvent;
            return this;
        }
    }

    MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.f55156a = messagingClientEvent;
    }

    /* renamed from: b */
    public static Builder m77144b() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    @Encodable.Field
    /* renamed from: a */
    public MessagingClientEvent mo63484a() {
        return this.f55156a;
    }

    /* renamed from: c */
    public byte[] mo63485c() {
        return ProtoEncoderDoNotUse.m76982a(this);
    }
}
