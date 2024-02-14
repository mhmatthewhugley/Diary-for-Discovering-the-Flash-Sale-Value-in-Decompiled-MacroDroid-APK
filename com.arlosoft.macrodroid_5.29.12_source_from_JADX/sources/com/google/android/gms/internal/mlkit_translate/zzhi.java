package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhi implements ObjectEncoder {

    /* renamed from: A */
    private static final FieldDescriptor f43579A;

    /* renamed from: B */
    private static final FieldDescriptor f43580B;

    /* renamed from: C */
    private static final FieldDescriptor f43581C;

    /* renamed from: D */
    private static final FieldDescriptor f43582D;

    /* renamed from: E */
    private static final FieldDescriptor f43583E;

    /* renamed from: F */
    private static final FieldDescriptor f43584F;

    /* renamed from: G */
    private static final FieldDescriptor f43585G;

    /* renamed from: H */
    private static final FieldDescriptor f43586H;

    /* renamed from: I */
    private static final FieldDescriptor f43587I;

    /* renamed from: J */
    private static final FieldDescriptor f43588J;

    /* renamed from: K */
    private static final FieldDescriptor f43589K;

    /* renamed from: L */
    private static final FieldDescriptor f43590L;

    /* renamed from: M */
    private static final FieldDescriptor f43591M;

    /* renamed from: N */
    private static final FieldDescriptor f43592N;

    /* renamed from: O */
    private static final FieldDescriptor f43593O;

    /* renamed from: P */
    private static final FieldDescriptor f43594P;

    /* renamed from: Q */
    private static final FieldDescriptor f43595Q;

    /* renamed from: R */
    private static final FieldDescriptor f43596R;

    /* renamed from: S */
    private static final FieldDescriptor f43597S;

    /* renamed from: T */
    private static final FieldDescriptor f43598T;

    /* renamed from: U */
    private static final FieldDescriptor f43599U;

    /* renamed from: V */
    private static final FieldDescriptor f43600V;

    /* renamed from: W */
    private static final FieldDescriptor f43601W;

    /* renamed from: X */
    private static final FieldDescriptor f43602X;

    /* renamed from: Y */
    private static final FieldDescriptor f43603Y;

    /* renamed from: Z */
    private static final FieldDescriptor f43604Z;

    /* renamed from: a */
    static final zzhi f43605a = new zzhi();

    /* renamed from: a0 */
    private static final FieldDescriptor f43606a0;

    /* renamed from: b */
    private static final FieldDescriptor f43607b;

    /* renamed from: b0 */
    private static final FieldDescriptor f43608b0;

    /* renamed from: c */
    private static final FieldDescriptor f43609c;

    /* renamed from: c0 */
    private static final FieldDescriptor f43610c0;

    /* renamed from: d */
    private static final FieldDescriptor f43611d;

    /* renamed from: d0 */
    private static final FieldDescriptor f43612d0;

    /* renamed from: e */
    private static final FieldDescriptor f43613e;

    /* renamed from: e0 */
    private static final FieldDescriptor f43614e0;

    /* renamed from: f */
    private static final FieldDescriptor f43615f;

    /* renamed from: f0 */
    private static final FieldDescriptor f43616f0;

    /* renamed from: g */
    private static final FieldDescriptor f43617g;

    /* renamed from: g0 */
    private static final FieldDescriptor f43618g0;

    /* renamed from: h */
    private static final FieldDescriptor f43619h;

    /* renamed from: h0 */
    private static final FieldDescriptor f43620h0;

    /* renamed from: i */
    private static final FieldDescriptor f43621i;

    /* renamed from: i0 */
    private static final FieldDescriptor f43622i0;

    /* renamed from: j */
    private static final FieldDescriptor f43623j;

    /* renamed from: j0 */
    private static final FieldDescriptor f43624j0;

    /* renamed from: k */
    private static final FieldDescriptor f43625k;

    /* renamed from: k0 */
    private static final FieldDescriptor f43626k0;

    /* renamed from: l */
    private static final FieldDescriptor f43627l;

    /* renamed from: l0 */
    private static final FieldDescriptor f43628l0;

    /* renamed from: m */
    private static final FieldDescriptor f43629m;

    /* renamed from: m0 */
    private static final FieldDescriptor f43630m0;

    /* renamed from: n */
    private static final FieldDescriptor f43631n;

    /* renamed from: n0 */
    private static final FieldDescriptor f43632n0;

    /* renamed from: o */
    private static final FieldDescriptor f43633o;

    /* renamed from: o0 */
    private static final FieldDescriptor f43634o0;

    /* renamed from: p */
    private static final FieldDescriptor f43635p;

    /* renamed from: p0 */
    private static final FieldDescriptor f43636p0;

    /* renamed from: q */
    private static final FieldDescriptor f43637q;

    /* renamed from: q0 */
    private static final FieldDescriptor f43638q0;

    /* renamed from: r */
    private static final FieldDescriptor f43639r;

    /* renamed from: r0 */
    private static final FieldDescriptor f43640r0;

    /* renamed from: s */
    private static final FieldDescriptor f43641s;

    /* renamed from: s0 */
    private static final FieldDescriptor f43642s0;

    /* renamed from: t */
    private static final FieldDescriptor f43643t;

    /* renamed from: t0 */
    private static final FieldDescriptor f43644t0;

    /* renamed from: u */
    private static final FieldDescriptor f43645u;

    /* renamed from: u0 */
    private static final FieldDescriptor f43646u0;

    /* renamed from: v */
    private static final FieldDescriptor f43647v;

    /* renamed from: v0 */
    private static final FieldDescriptor f43648v0;

    /* renamed from: w */
    private static final FieldDescriptor f43649w;

    /* renamed from: w0 */
    private static final FieldDescriptor f43650w0;

    /* renamed from: x */
    private static final FieldDescriptor f43651x;

    /* renamed from: x0 */
    private static final FieldDescriptor f43652x0;

    /* renamed from: y */
    private static final FieldDescriptor f43653y;

    /* renamed from: y0 */
    private static final FieldDescriptor f43654y0;

    /* renamed from: z */
    private static final FieldDescriptor f43655z;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("systemInfo");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43607b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventName");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43609c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isThickClient");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(37);
        f43611d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("clientType");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(61);
        f43613e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("modelDownloadLogEvent");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(3);
        f43615f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("customModelLoadLogEvent");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(20);
        f43617g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("customModelInferenceLogEvent");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(4);
        f43619h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("customModelCreateLogEvent");
        zzbc zzbc8 = new zzbc();
        zzbc8.mo52081a(29);
        f43621i = a8.mo23604b(zzbc8.mo52082b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("onDeviceFaceDetectionLogEvent");
        zzbc zzbc9 = new zzbc();
        zzbc9.mo52081a(5);
        f43623j = a9.mo23604b(zzbc9.mo52082b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("onDeviceFaceLoadLogEvent");
        zzbc zzbc10 = new zzbc();
        zzbc10.mo52081a(59);
        f43625k = a10.mo23604b(zzbc10.mo52082b()).mo23603a();
        FieldDescriptor.Builder a11 = FieldDescriptor.m7731a("onDeviceTextDetectionLogEvent");
        zzbc zzbc11 = new zzbc();
        zzbc11.mo52081a(6);
        f43627l = a11.mo23604b(zzbc11.mo52082b()).mo23603a();
        FieldDescriptor.Builder a12 = FieldDescriptor.m7731a("onDeviceTextDetectionLoadLogEvent");
        zzbc zzbc12 = new zzbc();
        zzbc12.mo52081a(79);
        f43629m = a12.mo23604b(zzbc12.mo52082b()).mo23603a();
        FieldDescriptor.Builder a13 = FieldDescriptor.m7731a("onDeviceBarcodeDetectionLogEvent");
        zzbc zzbc13 = new zzbc();
        zzbc13.mo52081a(7);
        f43631n = a13.mo23604b(zzbc13.mo52082b()).mo23603a();
        FieldDescriptor.Builder a14 = FieldDescriptor.m7731a("onDeviceBarcodeLoadLogEvent");
        zzbc zzbc14 = new zzbc();
        zzbc14.mo52081a(58);
        f43633o = a14.mo23604b(zzbc14.mo52082b()).mo23603a();
        FieldDescriptor.Builder a15 = FieldDescriptor.m7731a("onDeviceImageLabelCreateLogEvent");
        zzbc zzbc15 = new zzbc();
        zzbc15.mo52081a(48);
        f43635p = a15.mo23604b(zzbc15.mo52082b()).mo23603a();
        FieldDescriptor.Builder a16 = FieldDescriptor.m7731a("onDeviceImageLabelLoadLogEvent");
        zzbc zzbc16 = new zzbc();
        zzbc16.mo52081a(49);
        f43637q = a16.mo23604b(zzbc16.mo52082b()).mo23603a();
        FieldDescriptor.Builder a17 = FieldDescriptor.m7731a("onDeviceImageLabelDetectionLogEvent");
        zzbc zzbc17 = new zzbc();
        zzbc17.mo52081a(18);
        f43639r = a17.mo23604b(zzbc17.mo52082b()).mo23603a();
        FieldDescriptor.Builder a18 = FieldDescriptor.m7731a("onDeviceObjectCreateLogEvent");
        zzbc zzbc18 = new zzbc();
        zzbc18.mo52081a(26);
        f43641s = a18.mo23604b(zzbc18.mo52082b()).mo23603a();
        FieldDescriptor.Builder a19 = FieldDescriptor.m7731a("onDeviceObjectLoadLogEvent");
        zzbc zzbc19 = new zzbc();
        zzbc19.mo52081a(27);
        f43643t = a19.mo23604b(zzbc19.mo52082b()).mo23603a();
        FieldDescriptor.Builder a20 = FieldDescriptor.m7731a("onDeviceObjectInferenceLogEvent");
        zzbc zzbc20 = new zzbc();
        zzbc20.mo52081a(28);
        f43645u = a20.mo23604b(zzbc20.mo52082b()).mo23603a();
        FieldDescriptor.Builder a21 = FieldDescriptor.m7731a("onDevicePoseDetectionLogEvent");
        zzbc zzbc21 = new zzbc();
        zzbc21.mo52081a(44);
        f43647v = a21.mo23604b(zzbc21.mo52082b()).mo23603a();
        FieldDescriptor.Builder a22 = FieldDescriptor.m7731a("onDeviceSegmentationLogEvent");
        zzbc zzbc22 = new zzbc();
        zzbc22.mo52081a(45);
        f43649w = a22.mo23604b(zzbc22.mo52082b()).mo23603a();
        FieldDescriptor.Builder a23 = FieldDescriptor.m7731a("onDeviceSmartReplyLogEvent");
        zzbc zzbc23 = new zzbc();
        zzbc23.mo52081a(19);
        f43651x = a23.mo23604b(zzbc23.mo52082b()).mo23603a();
        FieldDescriptor.Builder a24 = FieldDescriptor.m7731a("onDeviceLanguageIdentificationLogEvent");
        zzbc zzbc24 = new zzbc();
        zzbc24.mo52081a(21);
        f43653y = a24.mo23604b(zzbc24.mo52082b()).mo23603a();
        FieldDescriptor.Builder a25 = FieldDescriptor.m7731a("onDeviceTranslationLogEvent");
        zzbc zzbc25 = new zzbc();
        zzbc25.mo52081a(22);
        f43655z = a25.mo23604b(zzbc25.mo52082b()).mo23603a();
        FieldDescriptor.Builder a26 = FieldDescriptor.m7731a("cloudFaceDetectionLogEvent");
        zzbc zzbc26 = new zzbc();
        zzbc26.mo52081a(8);
        f43579A = a26.mo23604b(zzbc26.mo52082b()).mo23603a();
        FieldDescriptor.Builder a27 = FieldDescriptor.m7731a("cloudCropHintDetectionLogEvent");
        zzbc zzbc27 = new zzbc();
        zzbc27.mo52081a(9);
        f43580B = a27.mo23604b(zzbc27.mo52082b()).mo23603a();
        FieldDescriptor.Builder a28 = FieldDescriptor.m7731a("cloudDocumentTextDetectionLogEvent");
        zzbc zzbc28 = new zzbc();
        zzbc28.mo52081a(10);
        f43581C = a28.mo23604b(zzbc28.mo52082b()).mo23603a();
        FieldDescriptor.Builder a29 = FieldDescriptor.m7731a("cloudImagePropertiesDetectionLogEvent");
        zzbc zzbc29 = new zzbc();
        zzbc29.mo52081a(11);
        f43582D = a29.mo23604b(zzbc29.mo52082b()).mo23603a();
        FieldDescriptor.Builder a30 = FieldDescriptor.m7731a("cloudImageLabelDetectionLogEvent");
        zzbc zzbc30 = new zzbc();
        zzbc30.mo52081a(12);
        f43583E = a30.mo23604b(zzbc30.mo52082b()).mo23603a();
        FieldDescriptor.Builder a31 = FieldDescriptor.m7731a("cloudLandmarkDetectionLogEvent");
        zzbc zzbc31 = new zzbc();
        zzbc31.mo52081a(13);
        f43584F = a31.mo23604b(zzbc31.mo52082b()).mo23603a();
        FieldDescriptor.Builder a32 = FieldDescriptor.m7731a("cloudLogoDetectionLogEvent");
        zzbc zzbc32 = new zzbc();
        zzbc32.mo52081a(14);
        f43585G = a32.mo23604b(zzbc32.mo52082b()).mo23603a();
        FieldDescriptor.Builder a33 = FieldDescriptor.m7731a("cloudSafeSearchDetectionLogEvent");
        zzbc zzbc33 = new zzbc();
        zzbc33.mo52081a(15);
        f43586H = a33.mo23604b(zzbc33.mo52082b()).mo23603a();
        FieldDescriptor.Builder a34 = FieldDescriptor.m7731a("cloudTextDetectionLogEvent");
        zzbc zzbc34 = new zzbc();
        zzbc34.mo52081a(16);
        f43587I = a34.mo23604b(zzbc34.mo52082b()).mo23603a();
        FieldDescriptor.Builder a35 = FieldDescriptor.m7731a("cloudWebSearchDetectionLogEvent");
        zzbc zzbc35 = new zzbc();
        zzbc35.mo52081a(17);
        f43588J = a35.mo23604b(zzbc35.mo52082b()).mo23603a();
        FieldDescriptor.Builder a36 = FieldDescriptor.m7731a("automlImageLabelingCreateLogEvent");
        zzbc zzbc36 = new zzbc();
        zzbc36.mo52081a(23);
        f43589K = a36.mo23604b(zzbc36.mo52082b()).mo23603a();
        FieldDescriptor.Builder a37 = FieldDescriptor.m7731a("automlImageLabelingLoadLogEvent");
        zzbc zzbc37 = new zzbc();
        zzbc37.mo52081a(24);
        f43590L = a37.mo23604b(zzbc37.mo52082b()).mo23603a();
        FieldDescriptor.Builder a38 = FieldDescriptor.m7731a("automlImageLabelingInferenceLogEvent");
        zzbc zzbc38 = new zzbc();
        zzbc38.mo52081a(25);
        f43591M = a38.mo23604b(zzbc38.mo52082b()).mo23603a();
        FieldDescriptor.Builder a39 = FieldDescriptor.m7731a("isModelDownloadedLogEvent");
        zzbc zzbc39 = new zzbc();
        zzbc39.mo52081a(39);
        f43592N = a39.mo23604b(zzbc39.mo52082b()).mo23603a();
        FieldDescriptor.Builder a40 = FieldDescriptor.m7731a("deleteModelLogEvent");
        zzbc zzbc40 = new zzbc();
        zzbc40.mo52081a(40);
        f43593O = a40.mo23604b(zzbc40.mo52082b()).mo23603a();
        FieldDescriptor.Builder a41 = FieldDescriptor.m7731a("aggregatedAutomlImageLabelingInferenceLogEvent");
        zzbc zzbc41 = new zzbc();
        zzbc41.mo52081a(30);
        f43594P = a41.mo23604b(zzbc41.mo52082b()).mo23603a();
        FieldDescriptor.Builder a42 = FieldDescriptor.m7731a("aggregatedCustomModelInferenceLogEvent");
        zzbc zzbc42 = new zzbc();
        zzbc42.mo52081a(31);
        f43595Q = a42.mo23604b(zzbc42.mo52082b()).mo23603a();
        FieldDescriptor.Builder a43 = FieldDescriptor.m7731a("aggregatedOnDeviceFaceDetectionLogEvent");
        zzbc zzbc43 = new zzbc();
        zzbc43.mo52081a(32);
        f43596R = a43.mo23604b(zzbc43.mo52082b()).mo23603a();
        FieldDescriptor.Builder a44 = FieldDescriptor.m7731a("aggregatedOnDeviceBarcodeDetectionLogEvent");
        zzbc zzbc44 = new zzbc();
        zzbc44.mo52081a(33);
        f43597S = a44.mo23604b(zzbc44.mo52082b()).mo23603a();
        FieldDescriptor.Builder a45 = FieldDescriptor.m7731a("aggregatedOnDeviceImageLabelDetectionLogEvent");
        zzbc zzbc45 = new zzbc();
        zzbc45.mo52081a(34);
        f43598T = a45.mo23604b(zzbc45.mo52082b()).mo23603a();
        FieldDescriptor.Builder a46 = FieldDescriptor.m7731a("aggregatedOnDeviceObjectInferenceLogEvent");
        zzbc zzbc46 = new zzbc();
        zzbc46.mo52081a(35);
        f43599U = a46.mo23604b(zzbc46.mo52082b()).mo23603a();
        FieldDescriptor.Builder a47 = FieldDescriptor.m7731a("aggregatedOnDeviceTextDetectionLogEvent");
        zzbc zzbc47 = new zzbc();
        zzbc47.mo52081a(36);
        f43600V = a47.mo23604b(zzbc47.mo52082b()).mo23603a();
        FieldDescriptor.Builder a48 = FieldDescriptor.m7731a("aggregatedOnDevicePoseDetectionLogEvent");
        zzbc zzbc48 = new zzbc();
        zzbc48.mo52081a(46);
        f43601W = a48.mo23604b(zzbc48.mo52082b()).mo23603a();
        FieldDescriptor.Builder a49 = FieldDescriptor.m7731a("aggregatedOnDeviceSegmentationLogEvent");
        zzbc zzbc49 = new zzbc();
        zzbc49.mo52081a(47);
        f43602X = a49.mo23604b(zzbc49.mo52082b()).mo23603a();
        FieldDescriptor.Builder a50 = FieldDescriptor.m7731a("pipelineAccelerationInferenceEvents");
        zzbc zzbc50 = new zzbc();
        zzbc50.mo52081a(69);
        f43603Y = a50.mo23604b(zzbc50.mo52082b()).mo23603a();
        FieldDescriptor.Builder a51 = FieldDescriptor.m7731a("remoteConfigLogEvent");
        zzbc zzbc51 = new zzbc();
        zzbc51.mo52081a(42);
        f43604Z = a51.mo23604b(zzbc51.mo52082b()).mo23603a();
        FieldDescriptor.Builder a52 = FieldDescriptor.m7731a("inputImageConstructionLogEvent");
        zzbc zzbc52 = new zzbc();
        zzbc52.mo52081a(50);
        f43606a0 = a52.mo23604b(zzbc52.mo52082b()).mo23603a();
        FieldDescriptor.Builder a53 = FieldDescriptor.m7731a("leakedHandleEvent");
        zzbc zzbc53 = new zzbc();
        zzbc53.mo52081a(51);
        f43608b0 = a53.mo23604b(zzbc53.mo52082b()).mo23603a();
        FieldDescriptor.Builder a54 = FieldDescriptor.m7731a("cameraSourceLogEvent");
        zzbc zzbc54 = new zzbc();
        zzbc54.mo52081a(52);
        f43610c0 = a54.mo23604b(zzbc54.mo52082b()).mo23603a();
        FieldDescriptor.Builder a55 = FieldDescriptor.m7731a("imageLabelOptionalModuleLogEvent");
        zzbc zzbc55 = new zzbc();
        zzbc55.mo52081a(53);
        f43612d0 = a55.mo23604b(zzbc55.mo52082b()).mo23603a();
        FieldDescriptor.Builder a56 = FieldDescriptor.m7731a("languageIdentificationOptionalModuleLogEvent");
        zzbc zzbc56 = new zzbc();
        zzbc56.mo52081a(54);
        f43614e0 = a56.mo23604b(zzbc56.mo52082b()).mo23603a();
        FieldDescriptor.Builder a57 = FieldDescriptor.m7731a("faceDetectionOptionalModuleLogEvent");
        zzbc zzbc57 = new zzbc();
        zzbc57.mo52081a(60);
        f43616f0 = a57.mo23604b(zzbc57.mo52082b()).mo23603a();
        FieldDescriptor.Builder a58 = FieldDescriptor.m7731a("nlClassifierOptionalModuleLogEvent");
        zzbc zzbc58 = new zzbc();
        zzbc58.mo52081a(55);
        f43618g0 = a58.mo23604b(zzbc58.mo52082b()).mo23603a();
        FieldDescriptor.Builder a59 = FieldDescriptor.m7731a("nlClassifierClientLibraryLogEvent");
        zzbc zzbc59 = new zzbc();
        zzbc59.mo52081a(56);
        f43620h0 = a59.mo23604b(zzbc59.mo52082b()).mo23603a();
        FieldDescriptor.Builder a60 = FieldDescriptor.m7731a("accelerationAllowlistLogEvent");
        zzbc zzbc60 = new zzbc();
        zzbc60.mo52081a(57);
        f43622i0 = a60.mo23604b(zzbc60.mo52082b()).mo23603a();
        FieldDescriptor.Builder a61 = FieldDescriptor.m7731a("toxicityDetectionCreateEvent");
        zzbc zzbc61 = new zzbc();
        zzbc61.mo52081a(62);
        f43624j0 = a61.mo23604b(zzbc61.mo52082b()).mo23603a();
        FieldDescriptor.Builder a62 = FieldDescriptor.m7731a("toxicityDetectionLoadEvent");
        zzbc zzbc62 = new zzbc();
        zzbc62.mo52081a(63);
        f43626k0 = a62.mo23604b(zzbc62.mo52082b()).mo23603a();
        FieldDescriptor.Builder a63 = FieldDescriptor.m7731a("toxicityDetectionInferenceEvent");
        zzbc zzbc63 = new zzbc();
        zzbc63.mo52081a(64);
        f43628l0 = a63.mo23604b(zzbc63.mo52082b()).mo23603a();
        FieldDescriptor.Builder a64 = FieldDescriptor.m7731a("barcodeDetectionOptionalModuleLogEvent");
        zzbc zzbc64 = new zzbc();
        zzbc64.mo52081a(65);
        f43630m0 = a64.mo23604b(zzbc64.mo52082b()).mo23603a();
        FieldDescriptor.Builder a65 = FieldDescriptor.m7731a("customImageLabelOptionalModuleLogEvent");
        zzbc zzbc65 = new zzbc();
        zzbc65.mo52081a(66);
        f43632n0 = a65.mo23604b(zzbc65.mo52082b()).mo23603a();
        FieldDescriptor.Builder a66 = FieldDescriptor.m7731a("codeScannerScanApiEvent");
        zzbc zzbc66 = new zzbc();
        zzbc66.mo52081a(67);
        f43634o0 = a66.mo23604b(zzbc66.mo52082b()).mo23603a();
        FieldDescriptor.Builder a67 = FieldDescriptor.m7731a("codeScannerOptionalModuleEvent");
        zzbc zzbc67 = new zzbc();
        zzbc67.mo52081a(68);
        f43636p0 = a67.mo23604b(zzbc67.mo52082b()).mo23603a();
        FieldDescriptor.Builder a68 = FieldDescriptor.m7731a("onDeviceExplicitContentCreateLogEvent");
        zzbc zzbc68 = new zzbc();
        zzbc68.mo52081a(70);
        f43638q0 = a68.mo23604b(zzbc68.mo52082b()).mo23603a();
        FieldDescriptor.Builder a69 = FieldDescriptor.m7731a("onDeviceExplicitContentLoadLogEvent");
        zzbc zzbc69 = new zzbc();
        zzbc69.mo52081a(71);
        f43640r0 = a69.mo23604b(zzbc69.mo52082b()).mo23603a();
        FieldDescriptor.Builder a70 = FieldDescriptor.m7731a("onDeviceExplicitContentInferenceLogEvent");
        zzbc zzbc70 = new zzbc();
        zzbc70.mo52081a(72);
        f43642s0 = a70.mo23604b(zzbc70.mo52082b()).mo23603a();
        FieldDescriptor.Builder a71 = FieldDescriptor.m7731a("aggregatedOnDeviceExplicitContentLogEvent");
        zzbc zzbc71 = new zzbc();
        zzbc71.mo52081a(73);
        f43644t0 = a71.mo23604b(zzbc71.mo52082b()).mo23603a();
        FieldDescriptor.Builder a72 = FieldDescriptor.m7731a("onDeviceSelfieFaceCreateLogEvent");
        zzbc zzbc72 = new zzbc();
        zzbc72.mo52081a(74);
        f43646u0 = a72.mo23604b(zzbc72.mo52082b()).mo23603a();
        FieldDescriptor.Builder a73 = FieldDescriptor.m7731a("onDeviceSelfieFaceLoadLogEvent");
        zzbc zzbc73 = new zzbc();
        zzbc73.mo52081a(75);
        f43648v0 = a73.mo23604b(zzbc73.mo52082b()).mo23603a();
        FieldDescriptor.Builder a74 = FieldDescriptor.m7731a("onDeviceSelfieFaceLogEvent");
        zzbc zzbc74 = new zzbc();
        zzbc74.mo52081a(76);
        f43650w0 = a74.mo23604b(zzbc74.mo52082b()).mo23603a();
        FieldDescriptor.Builder a75 = FieldDescriptor.m7731a("aggregatedOnDeviceSelfieFaceLogEvent");
        zzbc zzbc75 = new zzbc();
        zzbc75.mo52081a(77);
        f43652x0 = a75.mo23604b(zzbc75.mo52082b()).mo23603a();
        FieldDescriptor.Builder a76 = FieldDescriptor.m7731a("smartReplyOptionalModuleLogEvent");
        zzbc zzbc76 = new zzbc();
        zzbc76.mo52081a(78);
        f43654y0 = a76.mo23604b(zzbc76.mo52082b()).mo23603a();
    }

    private zzhi() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlh zzlh = (zzlh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43607b, zzlh.mo52263h());
        objectEncoderContext.mo23608e(f43609c, zzlh.mo52259d());
        objectEncoderContext.mo23608e(f43611d, (Object) null);
        objectEncoderContext.mo23608e(f43613e, zzlh.mo52258c());
        objectEncoderContext.mo23608e(f43615f, zzlh.mo52260e());
        objectEncoderContext.mo23608e(f43617g, (Object) null);
        objectEncoderContext.mo23608e(f43619h, (Object) null);
        objectEncoderContext.mo23608e(f43621i, (Object) null);
        objectEncoderContext.mo23608e(f43623j, (Object) null);
        objectEncoderContext.mo23608e(f43625k, (Object) null);
        objectEncoderContext.mo23608e(f43627l, (Object) null);
        objectEncoderContext.mo23608e(f43629m, (Object) null);
        objectEncoderContext.mo23608e(f43631n, (Object) null);
        objectEncoderContext.mo23608e(f43633o, (Object) null);
        objectEncoderContext.mo23608e(f43635p, (Object) null);
        objectEncoderContext.mo23608e(f43637q, (Object) null);
        objectEncoderContext.mo23608e(f43639r, (Object) null);
        objectEncoderContext.mo23608e(f43641s, (Object) null);
        objectEncoderContext.mo23608e(f43643t, (Object) null);
        objectEncoderContext.mo23608e(f43645u, (Object) null);
        objectEncoderContext.mo23608e(f43647v, (Object) null);
        objectEncoderContext.mo23608e(f43649w, (Object) null);
        objectEncoderContext.mo23608e(f43651x, (Object) null);
        objectEncoderContext.mo23608e(f43653y, (Object) null);
        objectEncoderContext.mo23608e(f43655z, zzlh.mo52261f());
        objectEncoderContext.mo23608e(f43579A, (Object) null);
        objectEncoderContext.mo23608e(f43580B, (Object) null);
        objectEncoderContext.mo23608e(f43581C, (Object) null);
        objectEncoderContext.mo23608e(f43582D, (Object) null);
        objectEncoderContext.mo23608e(f43583E, (Object) null);
        objectEncoderContext.mo23608e(f43584F, (Object) null);
        objectEncoderContext.mo23608e(f43585G, (Object) null);
        objectEncoderContext.mo23608e(f43586H, (Object) null);
        objectEncoderContext.mo23608e(f43587I, (Object) null);
        objectEncoderContext.mo23608e(f43588J, (Object) null);
        objectEncoderContext.mo23608e(f43589K, (Object) null);
        objectEncoderContext.mo23608e(f43590L, (Object) null);
        objectEncoderContext.mo23608e(f43591M, (Object) null);
        objectEncoderContext.mo23608e(f43592N, zzlh.mo52257b());
        objectEncoderContext.mo23608e(f43593O, zzlh.mo52256a());
        objectEncoderContext.mo23608e(f43594P, (Object) null);
        objectEncoderContext.mo23608e(f43595Q, (Object) null);
        objectEncoderContext.mo23608e(f43596R, (Object) null);
        objectEncoderContext.mo23608e(f43597S, (Object) null);
        objectEncoderContext.mo23608e(f43598T, (Object) null);
        objectEncoderContext.mo23608e(f43599U, (Object) null);
        objectEncoderContext.mo23608e(f43600V, (Object) null);
        objectEncoderContext.mo23608e(f43601W, (Object) null);
        objectEncoderContext.mo23608e(f43602X, (Object) null);
        objectEncoderContext.mo23608e(f43603Y, (Object) null);
        objectEncoderContext.mo23608e(f43604Z, zzlh.mo52262g());
        objectEncoderContext.mo23608e(f43606a0, (Object) null);
        objectEncoderContext.mo23608e(f43608b0, (Object) null);
        objectEncoderContext.mo23608e(f43610c0, (Object) null);
        objectEncoderContext.mo23608e(f43612d0, (Object) null);
        objectEncoderContext.mo23608e(f43614e0, (Object) null);
        objectEncoderContext.mo23608e(f43616f0, (Object) null);
        objectEncoderContext.mo23608e(f43618g0, (Object) null);
        objectEncoderContext.mo23608e(f43620h0, (Object) null);
        objectEncoderContext.mo23608e(f43622i0, (Object) null);
        objectEncoderContext.mo23608e(f43624j0, (Object) null);
        objectEncoderContext.mo23608e(f43626k0, (Object) null);
        objectEncoderContext.mo23608e(f43628l0, (Object) null);
        objectEncoderContext.mo23608e(f43630m0, (Object) null);
        objectEncoderContext.mo23608e(f43632n0, (Object) null);
        objectEncoderContext.mo23608e(f43634o0, (Object) null);
        objectEncoderContext.mo23608e(f43636p0, (Object) null);
        objectEncoderContext.mo23608e(f43638q0, (Object) null);
        objectEncoderContext.mo23608e(f43640r0, (Object) null);
        objectEncoderContext.mo23608e(f43642s0, (Object) null);
        objectEncoderContext.mo23608e(f43644t0, (Object) null);
        objectEncoderContext.mo23608e(f43646u0, (Object) null);
        objectEncoderContext.mo23608e(f43648v0, (Object) null);
        objectEncoderContext.mo23608e(f43650w0, (Object) null);
        objectEncoderContext.mo23608e(f43652x0, (Object) null);
        objectEncoderContext.mo23608e(f43654y0, (Object) null);
    }
}
