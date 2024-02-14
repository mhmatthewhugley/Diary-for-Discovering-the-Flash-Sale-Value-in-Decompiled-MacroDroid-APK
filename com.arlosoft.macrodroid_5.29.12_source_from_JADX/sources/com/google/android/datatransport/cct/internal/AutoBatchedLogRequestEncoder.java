package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

public final class AutoBatchedLogRequestEncoder implements Configurator {

    /* renamed from: a */
    public static final Configurator f1135a = new AutoBatchedLogRequestEncoder();

    private static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {

        /* renamed from: a */
        static final AndroidClientInfoEncoder f1136a = new AndroidClientInfoEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1137b = FieldDescriptor.m7732d("sdkVersion");

        /* renamed from: c */
        private static final FieldDescriptor f1138c = FieldDescriptor.m7732d("model");

        /* renamed from: d */
        private static final FieldDescriptor f1139d = FieldDescriptor.m7732d("hardware");

        /* renamed from: e */
        private static final FieldDescriptor f1140e = FieldDescriptor.m7732d("device");

        /* renamed from: f */
        private static final FieldDescriptor f1141f = FieldDescriptor.m7732d("product");

        /* renamed from: g */
        private static final FieldDescriptor f1142g = FieldDescriptor.m7732d("osBuild");

        /* renamed from: h */
        private static final FieldDescriptor f1143h = FieldDescriptor.m7732d("manufacturer");

        /* renamed from: i */
        private static final FieldDescriptor f1144i = FieldDescriptor.m7732d("fingerprint");

        /* renamed from: j */
        private static final FieldDescriptor f1145j = FieldDescriptor.m7732d("locale");

        /* renamed from: k */
        private static final FieldDescriptor f1146k = FieldDescriptor.m7732d("country");

        /* renamed from: l */
        private static final FieldDescriptor f1147l = FieldDescriptor.m7732d("mccMnc");

        /* renamed from: m */
        private static final FieldDescriptor f1148m = FieldDescriptor.m7732d("applicationBuild");

        private AndroidClientInfoEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1137b, androidClientInfo.mo19299m());
            objectEncoderContext.mo23608e(f1138c, androidClientInfo.mo19296j());
            objectEncoderContext.mo23608e(f1139d, androidClientInfo.mo19292f());
            objectEncoderContext.mo23608e(f1140e, androidClientInfo.mo19290d());
            objectEncoderContext.mo23608e(f1141f, androidClientInfo.mo19298l());
            objectEncoderContext.mo23608e(f1142g, androidClientInfo.mo19297k());
            objectEncoderContext.mo23608e(f1143h, androidClientInfo.mo19294h());
            objectEncoderContext.mo23608e(f1144i, androidClientInfo.mo19291e());
            objectEncoderContext.mo23608e(f1145j, androidClientInfo.mo19293g());
            objectEncoderContext.mo23608e(f1146k, androidClientInfo.mo19289c());
            objectEncoderContext.mo23608e(f1147l, androidClientInfo.mo19295i());
            objectEncoderContext.mo23608e(f1148m, androidClientInfo.mo19288b());
        }
    }

    private static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {

        /* renamed from: a */
        static final BatchedLogRequestEncoder f1149a = new BatchedLogRequestEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1150b = FieldDescriptor.m7732d("logRequest");

        private BatchedLogRequestEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1150b, batchedLogRequest.mo19324c());
        }
    }

    private static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {

        /* renamed from: a */
        static final ClientInfoEncoder f1151a = new ClientInfoEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1152b = FieldDescriptor.m7732d("clientType");

        /* renamed from: c */
        private static final FieldDescriptor f1153c = FieldDescriptor.m7732d("androidClientInfo");

        private ClientInfoEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1152b, clientInfo.mo19329c());
            objectEncoderContext.mo23608e(f1153c, clientInfo.mo19328b());
        }
    }

    private static final class LogEventEncoder implements ObjectEncoder<LogEvent> {

        /* renamed from: a */
        static final LogEventEncoder f1154a = new LogEventEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1155b = FieldDescriptor.m7732d("eventTimeMs");

        /* renamed from: c */
        private static final FieldDescriptor f1156c = FieldDescriptor.m7732d("eventCode");

        /* renamed from: d */
        private static final FieldDescriptor f1157d = FieldDescriptor.m7732d("eventUptimeMs");

        /* renamed from: e */
        private static final FieldDescriptor f1158e = FieldDescriptor.m7732d("sourceExtension");

        /* renamed from: f */
        private static final FieldDescriptor f1159f = FieldDescriptor.m7732d("sourceExtensionJsonProto3");

        /* renamed from: g */
        private static final FieldDescriptor f1160g = FieldDescriptor.m7732d("timezoneOffsetSeconds");

        /* renamed from: h */
        private static final FieldDescriptor f1161h = FieldDescriptor.m7732d("networkConnectionInfo");

        private LogEventEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f1155b, logEvent.mo19337c());
            objectEncoderContext.mo23608e(f1156c, logEvent.mo19336b());
            objectEncoderContext.mo23606b(f1157d, logEvent.mo19338d());
            objectEncoderContext.mo23608e(f1158e, logEvent.mo19341f());
            objectEncoderContext.mo23608e(f1159f, logEvent.mo19342g());
            objectEncoderContext.mo23606b(f1160g, logEvent.mo19343h());
            objectEncoderContext.mo23608e(f1161h, logEvent.mo19339e());
        }
    }

    private static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {

        /* renamed from: a */
        static final LogRequestEncoder f1162a = new LogRequestEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1163b = FieldDescriptor.m7732d("requestTimeMs");

        /* renamed from: c */
        private static final FieldDescriptor f1164c = FieldDescriptor.m7732d("requestUptimeMs");

        /* renamed from: d */
        private static final FieldDescriptor f1165d = FieldDescriptor.m7732d("clientInfo");

        /* renamed from: e */
        private static final FieldDescriptor f1166e = FieldDescriptor.m7732d("logSource");

        /* renamed from: f */
        private static final FieldDescriptor f1167f = FieldDescriptor.m7732d("logSourceName");

        /* renamed from: g */
        private static final FieldDescriptor f1168g = FieldDescriptor.m7732d("logEvent");

        /* renamed from: h */
        private static final FieldDescriptor f1169h = FieldDescriptor.m7732d("qosTier");

        private LogRequestEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f1163b, logRequest.mo19360g());
            objectEncoderContext.mo23606b(f1164c, logRequest.mo19361h());
            objectEncoderContext.mo23608e(f1165d, logRequest.mo19354b());
            objectEncoderContext.mo23608e(f1166e, logRequest.mo19356d());
            objectEncoderContext.mo23608e(f1167f, logRequest.mo19357e());
            objectEncoderContext.mo23608e(f1168g, logRequest.mo19355c());
            objectEncoderContext.mo23608e(f1169h, logRequest.mo19359f());
        }
    }

    private static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {

        /* renamed from: a */
        static final NetworkConnectionInfoEncoder f1170a = new NetworkConnectionInfoEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1171b = FieldDescriptor.m7732d("networkType");

        /* renamed from: c */
        private static final FieldDescriptor f1172c = FieldDescriptor.m7732d("mobileSubtype");

        private NetworkConnectionInfoEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1171b, networkConnectionInfo.mo19377c());
            objectEncoderContext.mo23608e(f1172c, networkConnectionInfo.mo19376b());
        }
    }

    private AutoBatchedLogRequestEncoder() {
    }

    /* renamed from: a */
    public void mo19313a(EncoderConfig<?> encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.f1149a;
        encoderConfig.mo23612a(BatchedLogRequest.class, batchedLogRequestEncoder);
        encoderConfig.mo23612a(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.f1162a;
        encoderConfig.mo23612a(LogRequest.class, logRequestEncoder);
        encoderConfig.mo23612a(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.f1151a;
        encoderConfig.mo23612a(ClientInfo.class, clientInfoEncoder);
        encoderConfig.mo23612a(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.f1136a;
        encoderConfig.mo23612a(AndroidClientInfo.class, androidClientInfoEncoder);
        encoderConfig.mo23612a(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.f1154a;
        encoderConfig.mo23612a(LogEvent.class, logEventEncoder);
        encoderConfig.mo23612a(AutoValue_LogEvent.class, logEventEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.f1170a;
        encoderConfig.mo23612a(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        encoderConfig.mo23612a(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
    }
}
