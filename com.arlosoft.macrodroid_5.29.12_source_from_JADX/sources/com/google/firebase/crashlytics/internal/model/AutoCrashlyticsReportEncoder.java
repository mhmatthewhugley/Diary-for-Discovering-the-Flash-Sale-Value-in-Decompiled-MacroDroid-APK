package com.google.firebase.crashlytics.internal.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

public final class AutoCrashlyticsReportEncoder implements Configurator {

    /* renamed from: a */
    public static final Configurator f5086a = new AutoCrashlyticsReportEncoder();

    private static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {

        /* renamed from: a */
        static final CrashlyticsReportApplicationExitInfoEncoder f5087a = new CrashlyticsReportApplicationExitInfoEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5088b = FieldDescriptor.m7732d("pid");

        /* renamed from: c */
        private static final FieldDescriptor f5089c = FieldDescriptor.m7732d("processName");

        /* renamed from: d */
        private static final FieldDescriptor f5090d = FieldDescriptor.m7732d("reasonCode");

        /* renamed from: e */
        private static final FieldDescriptor f5091e = FieldDescriptor.m7732d("importance");

        /* renamed from: f */
        private static final FieldDescriptor f5092f = FieldDescriptor.m7732d("pss");

        /* renamed from: g */
        private static final FieldDescriptor f5093g = FieldDescriptor.m7732d("rss");

        /* renamed from: h */
        private static final FieldDescriptor f5094h = FieldDescriptor.m7732d("timestamp");

        /* renamed from: i */
        private static final FieldDescriptor f5095i = FieldDescriptor.m7732d("traceFile");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23607c(f5088b, applicationExitInfo.mo23155c());
            objectEncoderContext.mo23608e(f5089c, applicationExitInfo.mo23156d());
            objectEncoderContext.mo23607c(f5090d, applicationExitInfo.mo23159f());
            objectEncoderContext.mo23607c(f5091e, applicationExitInfo.mo23154b());
            objectEncoderContext.mo23606b(f5092f, applicationExitInfo.mo23157e());
            objectEncoderContext.mo23606b(f5093g, applicationExitInfo.mo23160g());
            objectEncoderContext.mo23606b(f5094h, applicationExitInfo.mo23161h());
            objectEncoderContext.mo23608e(f5095i, applicationExitInfo.mo23163i());
        }
    }

    private static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {

        /* renamed from: a */
        static final CrashlyticsReportCustomAttributeEncoder f5096a = new CrashlyticsReportCustomAttributeEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5097b = FieldDescriptor.m7732d("key");

        /* renamed from: c */
        private static final FieldDescriptor f5098c = FieldDescriptor.m7732d("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5097b, customAttribute.mo23174b());
            objectEncoderContext.mo23608e(f5098c, customAttribute.mo23175c());
        }
    }

    private static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {

        /* renamed from: a */
        static final CrashlyticsReportEncoder f5099a = new CrashlyticsReportEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5100b = FieldDescriptor.m7732d("sdkVersion");

        /* renamed from: c */
        private static final FieldDescriptor f5101c = FieldDescriptor.m7732d("gmpAppId");

        /* renamed from: d */
        private static final FieldDescriptor f5102d = FieldDescriptor.m7732d("platform");

        /* renamed from: e */
        private static final FieldDescriptor f5103e = FieldDescriptor.m7732d("installationUuid");

        /* renamed from: f */
        private static final FieldDescriptor f5104f = FieldDescriptor.m7732d("buildVersion");

        /* renamed from: g */
        private static final FieldDescriptor f5105g = FieldDescriptor.m7732d("displayVersion");

        /* renamed from: h */
        private static final FieldDescriptor f5106h = FieldDescriptor.m7732d("session");

        /* renamed from: i */
        private static final FieldDescriptor f5107i = FieldDescriptor.m7732d("ndkPayload");

        private CrashlyticsReportEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5100b, crashlyticsReport.mo23141i());
            objectEncoderContext.mo23608e(f5101c, crashlyticsReport.mo23135e());
            objectEncoderContext.mo23607c(f5102d, crashlyticsReport.mo23139h());
            objectEncoderContext.mo23608e(f5103e, crashlyticsReport.mo23137f());
            objectEncoderContext.mo23608e(f5104f, crashlyticsReport.mo23133c());
            objectEncoderContext.mo23608e(f5105g, crashlyticsReport.mo23134d());
            objectEncoderContext.mo23608e(f5106h, crashlyticsReport.mo23142j());
            objectEncoderContext.mo23608e(f5107i, crashlyticsReport.mo23138g());
        }
    }

    private static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {

        /* renamed from: a */
        static final CrashlyticsReportFilesPayloadEncoder f5108a = new CrashlyticsReportFilesPayloadEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5109b = FieldDescriptor.m7732d("files");

        /* renamed from: c */
        private static final FieldDescriptor f5110c = FieldDescriptor.m7732d("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5109b, filesPayload.mo23182b());
            objectEncoderContext.mo23608e(f5110c, filesPayload.mo23183c());
        }
    }

    private static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {

        /* renamed from: a */
        static final CrashlyticsReportFilesPayloadFileEncoder f5111a = new CrashlyticsReportFilesPayloadFileEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5112b = FieldDescriptor.m7732d("filename");

        /* renamed from: c */
        private static final FieldDescriptor f5113c = FieldDescriptor.m7732d("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5112b, file.mo23191c());
            objectEncoderContext.mo23608e(f5113c, file.mo23190b());
        }
    }

    private static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {

        /* renamed from: a */
        static final CrashlyticsReportSessionApplicationEncoder f5114a = new CrashlyticsReportSessionApplicationEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5115b = FieldDescriptor.m7732d("identifier");

        /* renamed from: c */
        private static final FieldDescriptor f5116c = FieldDescriptor.m7732d(ClientCookie.VERSION_ATTR);

        /* renamed from: d */
        private static final FieldDescriptor f5117d = FieldDescriptor.m7732d("displayVersion");

        /* renamed from: e */
        private static final FieldDescriptor f5118e = FieldDescriptor.m7732d("organization");

        /* renamed from: f */
        private static final FieldDescriptor f5119f = FieldDescriptor.m7732d("installationUuid");

        /* renamed from: g */
        private static final FieldDescriptor f5120g = FieldDescriptor.m7732d("developmentPlatform");

        /* renamed from: h */
        private static final FieldDescriptor f5121h = FieldDescriptor.m7732d("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5115b, application.mo23228e());
            objectEncoderContext.mo23608e(f5116c, application.mo23232h());
            objectEncoderContext.mo23608e(f5117d, application.mo23227d());
            objectEncoderContext.mo23608e(f5118e, application.mo23231g());
            objectEncoderContext.mo23608e(f5119f, application.mo23230f());
            objectEncoderContext.mo23608e(f5120g, application.mo23225b());
            objectEncoderContext.mo23608e(f5121h, application.mo23226c());
        }
    }

    private static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {

        /* renamed from: a */
        static final CrashlyticsReportSessionApplicationOrganizationEncoder f5122a = new CrashlyticsReportSessionApplicationOrganizationEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5123b = FieldDescriptor.m7732d("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5123b, organization.mo23242a());
        }
    }

    private static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {

        /* renamed from: a */
        static final CrashlyticsReportSessionDeviceEncoder f5124a = new CrashlyticsReportSessionDeviceEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5125b = FieldDescriptor.m7732d("arch");

        /* renamed from: c */
        private static final FieldDescriptor f5126c = FieldDescriptor.m7732d("model");

        /* renamed from: d */
        private static final FieldDescriptor f5127d = FieldDescriptor.m7732d("cores");

        /* renamed from: e */
        private static final FieldDescriptor f5128e = FieldDescriptor.m7732d("ram");

        /* renamed from: f */
        private static final FieldDescriptor f5129f = FieldDescriptor.m7732d("diskSpace");

        /* renamed from: g */
        private static final FieldDescriptor f5130g = FieldDescriptor.m7732d("simulator");

        /* renamed from: h */
        private static final FieldDescriptor f5131h = FieldDescriptor.m7732d("state");

        /* renamed from: i */
        private static final FieldDescriptor f5132i = FieldDescriptor.m7732d("manufacturer");

        /* renamed from: j */
        private static final FieldDescriptor f5133j = FieldDescriptor.m7732d("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23607c(f5125b, device.mo23246b());
            objectEncoderContext.mo23608e(f5126c, device.mo23251f());
            objectEncoderContext.mo23607c(f5127d, device.mo23247c());
            objectEncoderContext.mo23606b(f5128e, device.mo23253h());
            objectEncoderContext.mo23606b(f5129f, device.mo23248d());
            objectEncoderContext.mo23605a(f5130g, device.mo23256j());
            objectEncoderContext.mo23607c(f5131h, device.mo23255i());
            objectEncoderContext.mo23608e(f5132i, device.mo23249e());
            objectEncoderContext.mo23608e(f5133j, device.mo23252g());
        }
    }

    private static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEncoder f5134a = new CrashlyticsReportSessionEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5135b = FieldDescriptor.m7732d("generator");

        /* renamed from: c */
        private static final FieldDescriptor f5136c = FieldDescriptor.m7732d("identifier");

        /* renamed from: d */
        private static final FieldDescriptor f5137d = FieldDescriptor.m7732d("startedAt");

        /* renamed from: e */
        private static final FieldDescriptor f5138e = FieldDescriptor.m7732d("endedAt");

        /* renamed from: f */
        private static final FieldDescriptor f5139f = FieldDescriptor.m7732d("crashed");

        /* renamed from: g */
        private static final FieldDescriptor f5140g = FieldDescriptor.m7732d("app");

        /* renamed from: h */
        private static final FieldDescriptor f5141h = FieldDescriptor.m7732d("user");

        /* renamed from: i */
        private static final FieldDescriptor f5142i = FieldDescriptor.m7732d("os");

        /* renamed from: j */
        private static final FieldDescriptor f5143j = FieldDescriptor.m7732d("device");

        /* renamed from: k */
        private static final FieldDescriptor f5144k = FieldDescriptor.m7732d("events");

        /* renamed from: l */
        private static final FieldDescriptor f5145l = FieldDescriptor.m7732d("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5135b, session.mo23203f());
            objectEncoderContext.mo23608e(f5136c, session.mo23448i());
            objectEncoderContext.mo23606b(f5137d, session.mo23208k());
            objectEncoderContext.mo23608e(f5138e, session.mo23200d());
            objectEncoderContext.mo23605a(f5139f, session.mo23210m());
            objectEncoderContext.mo23608e(f5140g, session.mo23198b());
            objectEncoderContext.mo23608e(f5141h, session.mo23209l());
            objectEncoderContext.mo23608e(f5142i, session.mo23207j());
            objectEncoderContext.mo23608e(f5143j, session.mo23199c());
            objectEncoderContext.mo23608e(f5144k, session.mo23201e());
            objectEncoderContext.mo23607c(f5145l, session.mo23204g());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEventApplicationEncoder f5146a = new CrashlyticsReportSessionEventApplicationEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5147b = FieldDescriptor.m7732d("execution");

        /* renamed from: c */
        private static final FieldDescriptor f5148c = FieldDescriptor.m7732d("customAttributes");

        /* renamed from: d */
        private static final FieldDescriptor f5149d = FieldDescriptor.m7732d("internalKeys");

        /* renamed from: e */
        private static final FieldDescriptor f5150e = FieldDescriptor.m7732d("background");

        /* renamed from: f */
        private static final FieldDescriptor f5151f = FieldDescriptor.m7732d("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5147b, application.mo23285d());
            objectEncoderContext.mo23608e(f5148c, application.mo23284c());
            objectEncoderContext.mo23608e(f5149d, application.mo23286e());
            objectEncoderContext.mo23608e(f5150e, application.mo23283b());
            objectEncoderContext.mo23607c(f5151f, application.mo23288f());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder */
    private static final class C1882x99c932db implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {

        /* renamed from: a */
        static final C1882x99c932db f5152a = new C1882x99c932db();

        /* renamed from: b */
        private static final FieldDescriptor f5153b = FieldDescriptor.m7732d("baseAddress");

        /* renamed from: c */
        private static final FieldDescriptor f5154c = FieldDescriptor.m7732d("size");

        /* renamed from: d */
        private static final FieldDescriptor f5155d = FieldDescriptor.m7732d("name");

        /* renamed from: e */
        private static final FieldDescriptor f5156e = FieldDescriptor.m7732d("uuid");

        private C1882x99c932db() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f5153b, binaryImage.mo23312b());
            objectEncoderContext.mo23606b(f5154c, binaryImage.mo23314d());
            objectEncoderContext.mo23608e(f5155d, binaryImage.mo23313c());
            objectEncoderContext.mo23608e(f5156e, binaryImage.mo23452f());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder f5157a = new CrashlyticsReportSessionEventApplicationExecutionEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5158b = FieldDescriptor.m7732d("threads");

        /* renamed from: c */
        private static final FieldDescriptor f5159c = FieldDescriptor.m7732d("exception");

        /* renamed from: d */
        private static final FieldDescriptor f5160d = FieldDescriptor.m7732d("appExitInfo");

        /* renamed from: e */
        private static final FieldDescriptor f5161e = FieldDescriptor.m7732d("signal");

        /* renamed from: f */
        private static final FieldDescriptor f5162f = FieldDescriptor.m7732d("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5158b, execution.mo23303f());
            objectEncoderContext.mo23608e(f5159c, execution.mo23300d());
            objectEncoderContext.mo23608e(f5160d, execution.mo23298b());
            objectEncoderContext.mo23608e(f5161e, execution.mo23301e());
            objectEncoderContext.mo23608e(f5162f, execution.mo23299c());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder */
    private static final class C1883x55689506 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {

        /* renamed from: a */
        static final C1883x55689506 f5163a = new C1883x55689506();

        /* renamed from: b */
        private static final FieldDescriptor f5164b = FieldDescriptor.m7732d("type");

        /* renamed from: c */
        private static final FieldDescriptor f5165c = FieldDescriptor.m7732d("reason");

        /* renamed from: d */
        private static final FieldDescriptor f5166d = FieldDescriptor.m7732d("frames");

        /* renamed from: e */
        private static final FieldDescriptor f5167e = FieldDescriptor.m7732d("causedBy");

        /* renamed from: f */
        private static final FieldDescriptor f5168f = FieldDescriptor.m7732d("overflowCount");

        private C1883x55689506() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5164b, exception.mo23329f());
            objectEncoderContext.mo23608e(f5165c, exception.mo23327e());
            objectEncoderContext.mo23608e(f5166d, exception.mo23325c());
            objectEncoderContext.mo23608e(f5167e, exception.mo23324b());
            objectEncoderContext.mo23607c(f5168f, exception.mo23326d());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder f5169a = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5170b = FieldDescriptor.m7732d("name");

        /* renamed from: c */
        private static final FieldDescriptor f5171c = FieldDescriptor.m7732d("code");

        /* renamed from: d */
        private static final FieldDescriptor f5172d = FieldDescriptor.m7732d("address");

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5170b, signal.mo23340d());
            objectEncoderContext.mo23608e(f5171c, signal.mo23339c());
            objectEncoderContext.mo23606b(f5172d, signal.mo23338b());
        }
    }

    private static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder f5173a = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5174b = FieldDescriptor.m7732d("name");

        /* renamed from: c */
        private static final FieldDescriptor f5175c = FieldDescriptor.m7732d("importance");

        /* renamed from: d */
        private static final FieldDescriptor f5176d = FieldDescriptor.m7732d("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5174b, thread.mo23350d());
            objectEncoderContext.mo23607c(f5175c, thread.mo23349c());
            objectEncoderContext.mo23608e(f5176d, thread.mo23348b());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder */
    private static final class C1884xc3999712 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {

        /* renamed from: a */
        static final C1884xc3999712 f5177a = new C1884xc3999712();

        /* renamed from: b */
        private static final FieldDescriptor f5178b = FieldDescriptor.m7732d("pc");

        /* renamed from: c */
        private static final FieldDescriptor f5179c = FieldDescriptor.m7732d("symbol");

        /* renamed from: d */
        private static final FieldDescriptor f5180d = FieldDescriptor.m7732d("file");

        /* renamed from: e */
        private static final FieldDescriptor f5181e = FieldDescriptor.m7732d(TypedValues.Cycle.S_WAVE_OFFSET);

        /* renamed from: f */
        private static final FieldDescriptor f5182f = FieldDescriptor.m7732d("importance");

        private C1884xc3999712() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f5178b, frame.mo23361e());
            objectEncoderContext.mo23608e(f5179c, frame.mo23363f());
            objectEncoderContext.mo23608e(f5180d, frame.mo23358b());
            objectEncoderContext.mo23606b(f5181e, frame.mo23360d());
            objectEncoderContext.mo23607c(f5182f, frame.mo23359c());
        }
    }

    private static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEventDeviceEncoder f5183a = new CrashlyticsReportSessionEventDeviceEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5184b = FieldDescriptor.m7732d("batteryLevel");

        /* renamed from: c */
        private static final FieldDescriptor f5185c = FieldDescriptor.m7732d("batteryVelocity");

        /* renamed from: d */
        private static final FieldDescriptor f5186d = FieldDescriptor.m7732d("proximityOn");

        /* renamed from: e */
        private static final FieldDescriptor f5187e = FieldDescriptor.m7732d("orientation");

        /* renamed from: f */
        private static final FieldDescriptor f5188f = FieldDescriptor.m7732d("ramUsed");

        /* renamed from: g */
        private static final FieldDescriptor f5189g = FieldDescriptor.m7732d("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5184b, device.mo23372b());
            objectEncoderContext.mo23607c(f5185c, device.mo23373c());
            objectEncoderContext.mo23605a(f5186d, device.mo23378g());
            objectEncoderContext.mo23607c(f5187e, device.mo23375e());
            objectEncoderContext.mo23606b(f5188f, device.mo23377f());
            objectEncoderContext.mo23606b(f5189g, device.mo23374d());
        }
    }

    private static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEventEncoder f5190a = new CrashlyticsReportSessionEventEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5191b = FieldDescriptor.m7732d("timestamp");

        /* renamed from: c */
        private static final FieldDescriptor f5192c = FieldDescriptor.m7732d("type");

        /* renamed from: d */
        private static final FieldDescriptor f5193d = FieldDescriptor.m7732d("app");

        /* renamed from: e */
        private static final FieldDescriptor f5194e = FieldDescriptor.m7732d("device");

        /* renamed from: f */
        private static final FieldDescriptor f5195f = FieldDescriptor.m7732d("log");

        private CrashlyticsReportSessionEventEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23606b(f5191b, event.mo23271e());
            objectEncoderContext.mo23608e(f5192c, event.mo23273f());
            objectEncoderContext.mo23608e(f5193d, event.mo23268b());
            objectEncoderContext.mo23608e(f5194e, event.mo23269c());
            objectEncoderContext.mo23608e(f5195f, event.mo23270d());
        }
    }

    private static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {

        /* renamed from: a */
        static final CrashlyticsReportSessionEventLogEncoder f5196a = new CrashlyticsReportSessionEventLogEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5197b = FieldDescriptor.m7732d("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5197b, log.mo23388b());
        }
    }

    private static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {

        /* renamed from: a */
        static final CrashlyticsReportSessionOperatingSystemEncoder f5198a = new CrashlyticsReportSessionOperatingSystemEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5199b = FieldDescriptor.m7732d("platform");

        /* renamed from: c */
        private static final FieldDescriptor f5200c = FieldDescriptor.m7732d(ClientCookie.VERSION_ATTR);

        /* renamed from: d */
        private static final FieldDescriptor f5201d = FieldDescriptor.m7732d("buildVersion");

        /* renamed from: e */
        private static final FieldDescriptor f5202e = FieldDescriptor.m7732d("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23607c(f5199b, operatingSystem.mo23395c());
            objectEncoderContext.mo23608e(f5200c, operatingSystem.mo23396d());
            objectEncoderContext.mo23608e(f5201d, operatingSystem.mo23394b());
            objectEncoderContext.mo23605a(f5202e, operatingSystem.mo23397e());
        }
    }

    private static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {

        /* renamed from: a */
        static final CrashlyticsReportSessionUserEncoder f5203a = new CrashlyticsReportSessionUserEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f5204b = FieldDescriptor.m7732d("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        /* renamed from: b */
        public void mo19314a(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.mo23608e(f5204b, user.mo23406b());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    /* renamed from: a */
    public void mo19313a(EncoderConfig<?> encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.f5099a;
        encoderConfig.mo23612a(CrashlyticsReport.class, crashlyticsReportEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.f5134a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.f5114a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.f5122a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.f5203a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.f5198a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.f5124a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.f5190a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.f5146a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.f5157a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.f5173a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        encoderConfig.mo23612a(C1903x7e3e3ebd.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        C1884xc3999712 crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = C1884xc3999712.f5177a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        encoderConfig.mo23612a(C1905xce3d994b.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        C1883x55689506 crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = C1883x55689506.f5163a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        encoderConfig.mo23612a(C1899xc2f5febc.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.f5087a;
        encoderConfig.mo23612a(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.f5169a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        encoderConfig.mo23612a(C1901x7c929f5b.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        C1882x99c932db crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = C1882x99c932db.f5152a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        encoderConfig.mo23612a(C1897xfe724d07.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.f5096a;
        encoderConfig.mo23612a(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.f5183a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.f5196a;
        encoderConfig.mo23612a(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.f5108a;
        encoderConfig.mo23612a(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.f5111a;
        encoderConfig.mo23612a(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        encoderConfig.mo23612a(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
