package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {

    /* renamed from: a */
    public static final Configurator f1290a = new AutoProtoEncoderDoNotUseEncoder();

    private static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* renamed from: a */
        static final ClientMetricsEncoder f1291a = new ClientMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1292b = FieldDescriptor.m7731a("window").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        /* renamed from: c */
        private static final FieldDescriptor f1293c = FieldDescriptor.m7731a("logSourceMetrics").mo23604b(AtProtobuf.m7791b().mo23632c(2).mo23631a()).mo23603a();

        /* renamed from: d */
        private static final FieldDescriptor f1294d = FieldDescriptor.m7731a("globalMetrics").mo23604b(AtProtobuf.m7791b().mo23632c(3).mo23631a()).mo23603a();

        /* renamed from: e */
        private static final FieldDescriptor f1295e = FieldDescriptor.m7731a("appNamespace").mo23604b(AtProtobuf.m7791b().mo23632c(4).mo23631a()).mo23603a();

        private ClientMetricsEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1292b, clientMetrics.mo19502d());
            objectEncoderContext.mo23608e(f1293c, clientMetrics.mo19501c());
            objectEncoderContext.mo23608e(f1294d, clientMetrics.mo19500b());
            objectEncoderContext.mo23608e(f1295e, clientMetrics.mo19499a());
        }
    }

    private static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* renamed from: a */
        static final GlobalMetricsEncoder f1296a = new GlobalMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1297b = FieldDescriptor.m7731a("storageMetrics").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        private GlobalMetricsEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1297b, globalMetrics.mo19509a());
        }
    }

    private static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* renamed from: a */
        static final LogEventDroppedEncoder f1298a = new LogEventDroppedEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1299b = FieldDescriptor.m7731a("eventsDroppedCount").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        /* renamed from: c */
        private static final FieldDescriptor f1300c = FieldDescriptor.m7731a("reason").mo23604b(AtProtobuf.m7791b().mo23632c(3).mo23631a()).mo23603a();

        private LogEventDroppedEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f1299b, logEventDropped.mo19512a());
            objectEncoderContext.mo23608e(f1300c, logEventDropped.mo19513b());
        }
    }

    private static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* renamed from: a */
        static final LogSourceMetricsEncoder f1301a = new LogSourceMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1302b = FieldDescriptor.m7731a("logSource").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        /* renamed from: c */
        private static final FieldDescriptor f1303c = FieldDescriptor.m7731a("logEventDropped").mo23604b(AtProtobuf.m7791b().mo23632c(2).mo23631a()).mo23603a();

        private LogSourceMetricsEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1302b, logSourceMetrics.mo19519b());
            objectEncoderContext.mo23608e(f1303c, logSourceMetrics.mo19518a());
        }
    }

    private static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a */
        static final ProtoEncoderDoNotUseEncoder f1304a = new ProtoEncoderDoNotUseEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1305b = FieldDescriptor.m7732d("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f1305b, protoEncoderDoNotUse.mo19455b());
        }
    }

    private static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* renamed from: a */
        static final StorageMetricsEncoder f1306a = new StorageMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1307b = FieldDescriptor.m7731a("currentCacheSizeBytes").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        /* renamed from: c */
        private static final FieldDescriptor f1308c = FieldDescriptor.m7731a("maxCacheSizeBytes").mo23604b(AtProtobuf.m7791b().mo23632c(2).mo23631a()).mo23603a();

        private StorageMetricsEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f1307b, storageMetrics.mo19523a());
            objectEncoderContext.mo23606b(f1308c, storageMetrics.mo19524b());
        }
    }

    private static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* renamed from: a */
        static final TimeWindowEncoder f1309a = new TimeWindowEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f1310b = FieldDescriptor.m7731a("startMs").mo23604b(AtProtobuf.m7791b().mo23632c(1).mo23631a()).mo23603a();

        /* renamed from: c */
        private static final FieldDescriptor f1311c = FieldDescriptor.m7731a("endMs").mo23604b(AtProtobuf.m7791b().mo23632c(2).mo23631a()).mo23603a();

        private TimeWindowEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f1310b, timeWindow.mo19529b());
            objectEncoderContext.mo23606b(f1311c, timeWindow.mo19528a());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    /* renamed from: a */
    public void mo19313a(EncoderConfig<?> encoderConfig) {
        encoderConfig.mo23612a(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f1304a);
        encoderConfig.mo23612a(ClientMetrics.class, ClientMetricsEncoder.f1291a);
        encoderConfig.mo23612a(TimeWindow.class, TimeWindowEncoder.f1309a);
        encoderConfig.mo23612a(LogSourceMetrics.class, LogSourceMetricsEncoder.f1301a);
        encoderConfig.mo23612a(LogEventDropped.class, LogEventDroppedEncoder.f1298a);
        encoderConfig.mo23612a(GlobalMetrics.class, GlobalMetricsEncoder.f1296a);
        encoderConfig.mo23612a(StorageMetrics.class, StorageMetricsEncoder.f1306a);
    }
}
