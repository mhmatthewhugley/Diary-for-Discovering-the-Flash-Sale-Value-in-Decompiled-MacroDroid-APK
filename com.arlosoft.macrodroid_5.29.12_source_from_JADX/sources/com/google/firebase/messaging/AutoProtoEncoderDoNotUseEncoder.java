package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
import org.apache.commons.logging.LogFactory;

public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* renamed from: a */
    public static final Configurator f54933a = new AutoProtoEncoderDoNotUseEncoder();

    private static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {

        /* renamed from: a */
        static final MessagingClientEventEncoder f54934a = new MessagingClientEventEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f54935b = FieldDescriptor.m7731a("projectNumber").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        /* renamed from: c */
        private static final FieldDescriptor f54936c = FieldDescriptor.m7731a("messageId").mo23604b(AtProtobuf.m7791b().mo23632c(2).mo23631a()).mo23603a();

        /* renamed from: d */
        private static final FieldDescriptor f54937d = FieldDescriptor.m7731a("instanceId").mo23604b(AtProtobuf.m7791b().mo23632c(3).mo23631a()).mo23603a();

        /* renamed from: e */
        private static final FieldDescriptor f54938e = FieldDescriptor.m7731a("messageType").mo23604b(AtProtobuf.m7791b().mo23632c(4).mo23631a()).mo23603a();

        /* renamed from: f */
        private static final FieldDescriptor f54939f = FieldDescriptor.m7731a("sdkPlatform").mo23604b(AtProtobuf.m7791b().mo23632c(5).mo23631a()).mo23603a();

        /* renamed from: g */
        private static final FieldDescriptor f54940g = FieldDescriptor.m7731a("packageName").mo23604b(AtProtobuf.m7791b().mo23632c(6).mo23631a()).mo23603a();

        /* renamed from: h */
        private static final FieldDescriptor f54941h = FieldDescriptor.m7731a("collapseKey").mo23604b(AtProtobuf.m7791b().mo23632c(7).mo23631a()).mo23603a();

        /* renamed from: i */
        private static final FieldDescriptor f54942i = FieldDescriptor.m7731a(LogFactory.PRIORITY_KEY).mo23604b(AtProtobuf.m7791b().mo23632c(8).mo23631a()).mo23603a();

        /* renamed from: j */
        private static final FieldDescriptor f54943j = FieldDescriptor.m7731a("ttl").mo23604b(AtProtobuf.m7791b().mo23632c(9).mo23631a()).mo23603a();

        /* renamed from: k */
        private static final FieldDescriptor f54944k = FieldDescriptor.m7731a("topic").mo23604b(AtProtobuf.m7791b().mo23632c(10).mo23631a()).mo23603a();

        /* renamed from: l */
        private static final FieldDescriptor f54945l = FieldDescriptor.m7731a("bulkId").mo23604b(AtProtobuf.m7791b().mo23632c(11).mo23631a()).mo23603a();

        /* renamed from: m */
        private static final FieldDescriptor f54946m = FieldDescriptor.m7731a(NotificationCompat.CATEGORY_EVENT).mo23604b(AtProtobuf.m7791b().mo23632c(12).mo23631a()).mo23603a();

        /* renamed from: n */
        private static final FieldDescriptor f54947n = FieldDescriptor.m7731a("analyticsLabel").mo23604b(AtProtobuf.m7791b().mo23632c(13).mo23631a()).mo23603a();

        /* renamed from: o */
        private static final FieldDescriptor f54948o = FieldDescriptor.m7731a("campaignId").mo23604b(AtProtobuf.m7791b().mo23632c(14).mo23631a()).mo23603a();

        /* renamed from: p */
        private static final FieldDescriptor f54949p = FieldDescriptor.m7731a("composerLabel").mo23604b(AtProtobuf.m7791b().mo23632c(15).mo23631a()).mo23603a();

        private MessagingClientEventEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(MessagingClientEvent messagingClientEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f54935b, messagingClientEvent.mo63467l());
            objectEncoderContext.mo23608e(f54936c, messagingClientEvent.mo63463h());
            objectEncoderContext.mo23608e(f54937d, messagingClientEvent.mo63462g());
            objectEncoderContext.mo23608e(f54938e, messagingClientEvent.mo63464i());
            objectEncoderContext.mo23608e(f54939f, messagingClientEvent.mo63468m());
            objectEncoderContext.mo23608e(f54940g, messagingClientEvent.mo63465j());
            objectEncoderContext.mo23608e(f54941h, messagingClientEvent.mo63459d());
            objectEncoderContext.mo23607c(f54942i, messagingClientEvent.mo63466k());
            objectEncoderContext.mo23607c(f54943j, messagingClientEvent.mo63470o());
            objectEncoderContext.mo23608e(f54944k, messagingClientEvent.mo63469n());
            objectEncoderContext.mo23606b(f54945l, messagingClientEvent.mo63457b());
            objectEncoderContext.mo23608e(f54946m, messagingClientEvent.mo63461f());
            objectEncoderContext.mo23608e(f54947n, messagingClientEvent.mo63456a());
            objectEncoderContext.mo23606b(f54948o, messagingClientEvent.mo63458c());
            objectEncoderContext.mo23608e(f54949p, messagingClientEvent.mo63460e());
        }
    }

    private static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {

        /* renamed from: a */
        static final MessagingClientEventExtensionEncoder f54950a = new MessagingClientEventExtensionEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f54951b = FieldDescriptor.m7731a("messagingClientEvent").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        private MessagingClientEventExtensionEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(MessagingClientEventExtension messagingClientEventExtension, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f54951b, messagingClientEventExtension.mo63484a());
        }
    }

    private static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a */
        static final ProtoEncoderDoNotUseEncoder f54952a = new ProtoEncoderDoNotUseEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f54953b = FieldDescriptor.m7732d("messagingClientEventExtension");

        private ProtoEncoderDoNotUseEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f54953b, protoEncoderDoNotUse.mo63391b());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    /* renamed from: a */
    public void mo19313a(EncoderConfig<?> encoderConfig) {
        encoderConfig.mo23612a(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f54952a);
        encoderConfig.mo23612a(MessagingClientEventExtension.class, MessagingClientEventExtensionEncoder.f54950a);
        encoderConfig.mo23612a(MessagingClientEvent.class, MessagingClientEventEncoder.f54934a);
    }
}
