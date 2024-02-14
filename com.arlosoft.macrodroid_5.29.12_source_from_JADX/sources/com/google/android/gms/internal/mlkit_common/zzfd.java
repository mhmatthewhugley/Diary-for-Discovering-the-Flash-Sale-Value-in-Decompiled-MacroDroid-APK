package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfd implements ObjectEncoder {

    /* renamed from: A */
    private static final FieldDescriptor f42312A;

    /* renamed from: B */
    private static final FieldDescriptor f42313B;

    /* renamed from: C */
    private static final FieldDescriptor f42314C;

    /* renamed from: D */
    private static final FieldDescriptor f42315D;

    /* renamed from: E */
    private static final FieldDescriptor f42316E;

    /* renamed from: F */
    private static final FieldDescriptor f42317F;

    /* renamed from: G */
    private static final FieldDescriptor f42318G;

    /* renamed from: H */
    private static final FieldDescriptor f42319H;

    /* renamed from: I */
    private static final FieldDescriptor f42320I;

    /* renamed from: J */
    private static final FieldDescriptor f42321J;

    /* renamed from: K */
    private static final FieldDescriptor f42322K;

    /* renamed from: L */
    private static final FieldDescriptor f42323L;

    /* renamed from: M */
    private static final FieldDescriptor f42324M;

    /* renamed from: N */
    private static final FieldDescriptor f42325N;

    /* renamed from: O */
    private static final FieldDescriptor f42326O;

    /* renamed from: P */
    private static final FieldDescriptor f42327P;

    /* renamed from: Q */
    private static final FieldDescriptor f42328Q;

    /* renamed from: R */
    private static final FieldDescriptor f42329R;

    /* renamed from: S */
    private static final FieldDescriptor f42330S;

    /* renamed from: T */
    private static final FieldDescriptor f42331T;

    /* renamed from: U */
    private static final FieldDescriptor f42332U;

    /* renamed from: V */
    private static final FieldDescriptor f42333V;

    /* renamed from: W */
    private static final FieldDescriptor f42334W;

    /* renamed from: X */
    private static final FieldDescriptor f42335X;

    /* renamed from: Y */
    private static final FieldDescriptor f42336Y;

    /* renamed from: Z */
    private static final FieldDescriptor f42337Z;

    /* renamed from: a */
    static final zzfd f42338a = new zzfd();

    /* renamed from: a0 */
    private static final FieldDescriptor f42339a0;

    /* renamed from: b */
    private static final FieldDescriptor f42340b;

    /* renamed from: b0 */
    private static final FieldDescriptor f42341b0;

    /* renamed from: c */
    private static final FieldDescriptor f42342c;

    /* renamed from: c0 */
    private static final FieldDescriptor f42343c0;

    /* renamed from: d */
    private static final FieldDescriptor f42344d;

    /* renamed from: d0 */
    private static final FieldDescriptor f42345d0;

    /* renamed from: e */
    private static final FieldDescriptor f42346e;

    /* renamed from: e0 */
    private static final FieldDescriptor f42347e0;

    /* renamed from: f */
    private static final FieldDescriptor f42348f;

    /* renamed from: f0 */
    private static final FieldDescriptor f42349f0;

    /* renamed from: g */
    private static final FieldDescriptor f42350g;

    /* renamed from: g0 */
    private static final FieldDescriptor f42351g0;

    /* renamed from: h */
    private static final FieldDescriptor f42352h;

    /* renamed from: h0 */
    private static final FieldDescriptor f42353h0;

    /* renamed from: i */
    private static final FieldDescriptor f42354i;

    /* renamed from: i0 */
    private static final FieldDescriptor f42355i0;

    /* renamed from: j */
    private static final FieldDescriptor f42356j;

    /* renamed from: j0 */
    private static final FieldDescriptor f42357j0;

    /* renamed from: k */
    private static final FieldDescriptor f42358k;

    /* renamed from: k0 */
    private static final FieldDescriptor f42359k0;

    /* renamed from: l */
    private static final FieldDescriptor f42360l;

    /* renamed from: l0 */
    private static final FieldDescriptor f42361l0;

    /* renamed from: m */
    private static final FieldDescriptor f42362m;

    /* renamed from: m0 */
    private static final FieldDescriptor f42363m0;

    /* renamed from: n */
    private static final FieldDescriptor f42364n;

    /* renamed from: n0 */
    private static final FieldDescriptor f42365n0;

    /* renamed from: o */
    private static final FieldDescriptor f42366o;

    /* renamed from: o0 */
    private static final FieldDescriptor f42367o0;

    /* renamed from: p */
    private static final FieldDescriptor f42368p;

    /* renamed from: p0 */
    private static final FieldDescriptor f42369p0;

    /* renamed from: q */
    private static final FieldDescriptor f42370q;

    /* renamed from: q0 */
    private static final FieldDescriptor f42371q0;

    /* renamed from: r */
    private static final FieldDescriptor f42372r;

    /* renamed from: r0 */
    private static final FieldDescriptor f42373r0;

    /* renamed from: s */
    private static final FieldDescriptor f42374s;

    /* renamed from: s0 */
    private static final FieldDescriptor f42375s0;

    /* renamed from: t */
    private static final FieldDescriptor f42376t;

    /* renamed from: t0 */
    private static final FieldDescriptor f42377t0;

    /* renamed from: u */
    private static final FieldDescriptor f42378u;

    /* renamed from: u0 */
    private static final FieldDescriptor f42379u0;

    /* renamed from: v */
    private static final FieldDescriptor f42380v;

    /* renamed from: v0 */
    private static final FieldDescriptor f42381v0;

    /* renamed from: w */
    private static final FieldDescriptor f42382w;

    /* renamed from: w0 */
    private static final FieldDescriptor f42383w0;

    /* renamed from: x */
    private static final FieldDescriptor f42384x;

    /* renamed from: x0 */
    private static final FieldDescriptor f42385x0;

    /* renamed from: y */
    private static final FieldDescriptor f42386y;

    /* renamed from: y0 */
    private static final FieldDescriptor f42387y0;

    /* renamed from: z */
    private static final FieldDescriptor f42388z;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("systemInfo");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42340b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventName");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42342c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isThickClient");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(37);
        f42344d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("clientType");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(61);
        f42346e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("modelDownloadLogEvent");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(3);
        f42348f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("customModelLoadLogEvent");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(20);
        f42350g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("customModelInferenceLogEvent");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(4);
        f42352h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("customModelCreateLogEvent");
        zzbh zzbh8 = new zzbh();
        zzbh8.mo51821a(29);
        f42354i = a8.mo23604b(zzbh8.mo51822b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("onDeviceFaceDetectionLogEvent");
        zzbh zzbh9 = new zzbh();
        zzbh9.mo51821a(5);
        f42356j = a9.mo23604b(zzbh9.mo51822b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("onDeviceFaceLoadLogEvent");
        zzbh zzbh10 = new zzbh();
        zzbh10.mo51821a(59);
        f42358k = a10.mo23604b(zzbh10.mo51822b()).mo23603a();
        FieldDescriptor.Builder a11 = FieldDescriptor.m7731a("onDeviceTextDetectionLogEvent");
        zzbh zzbh11 = new zzbh();
        zzbh11.mo51821a(6);
        f42360l = a11.mo23604b(zzbh11.mo51822b()).mo23603a();
        FieldDescriptor.Builder a12 = FieldDescriptor.m7731a("onDeviceTextDetectionLoadLogEvent");
        zzbh zzbh12 = new zzbh();
        zzbh12.mo51821a(79);
        f42362m = a12.mo23604b(zzbh12.mo51822b()).mo23603a();
        FieldDescriptor.Builder a13 = FieldDescriptor.m7731a("onDeviceBarcodeDetectionLogEvent");
        zzbh zzbh13 = new zzbh();
        zzbh13.mo51821a(7);
        f42364n = a13.mo23604b(zzbh13.mo51822b()).mo23603a();
        FieldDescriptor.Builder a14 = FieldDescriptor.m7731a("onDeviceBarcodeLoadLogEvent");
        zzbh zzbh14 = new zzbh();
        zzbh14.mo51821a(58);
        f42366o = a14.mo23604b(zzbh14.mo51822b()).mo23603a();
        FieldDescriptor.Builder a15 = FieldDescriptor.m7731a("onDeviceImageLabelCreateLogEvent");
        zzbh zzbh15 = new zzbh();
        zzbh15.mo51821a(48);
        f42368p = a15.mo23604b(zzbh15.mo51822b()).mo23603a();
        FieldDescriptor.Builder a16 = FieldDescriptor.m7731a("onDeviceImageLabelLoadLogEvent");
        zzbh zzbh16 = new zzbh();
        zzbh16.mo51821a(49);
        f42370q = a16.mo23604b(zzbh16.mo51822b()).mo23603a();
        FieldDescriptor.Builder a17 = FieldDescriptor.m7731a("onDeviceImageLabelDetectionLogEvent");
        zzbh zzbh17 = new zzbh();
        zzbh17.mo51821a(18);
        f42372r = a17.mo23604b(zzbh17.mo51822b()).mo23603a();
        FieldDescriptor.Builder a18 = FieldDescriptor.m7731a("onDeviceObjectCreateLogEvent");
        zzbh zzbh18 = new zzbh();
        zzbh18.mo51821a(26);
        f42374s = a18.mo23604b(zzbh18.mo51822b()).mo23603a();
        FieldDescriptor.Builder a19 = FieldDescriptor.m7731a("onDeviceObjectLoadLogEvent");
        zzbh zzbh19 = new zzbh();
        zzbh19.mo51821a(27);
        f42376t = a19.mo23604b(zzbh19.mo51822b()).mo23603a();
        FieldDescriptor.Builder a20 = FieldDescriptor.m7731a("onDeviceObjectInferenceLogEvent");
        zzbh zzbh20 = new zzbh();
        zzbh20.mo51821a(28);
        f42378u = a20.mo23604b(zzbh20.mo51822b()).mo23603a();
        FieldDescriptor.Builder a21 = FieldDescriptor.m7731a("onDevicePoseDetectionLogEvent");
        zzbh zzbh21 = new zzbh();
        zzbh21.mo51821a(44);
        f42380v = a21.mo23604b(zzbh21.mo51822b()).mo23603a();
        FieldDescriptor.Builder a22 = FieldDescriptor.m7731a("onDeviceSegmentationLogEvent");
        zzbh zzbh22 = new zzbh();
        zzbh22.mo51821a(45);
        f42382w = a22.mo23604b(zzbh22.mo51822b()).mo23603a();
        FieldDescriptor.Builder a23 = FieldDescriptor.m7731a("onDeviceSmartReplyLogEvent");
        zzbh zzbh23 = new zzbh();
        zzbh23.mo51821a(19);
        f42384x = a23.mo23604b(zzbh23.mo51822b()).mo23603a();
        FieldDescriptor.Builder a24 = FieldDescriptor.m7731a("onDeviceLanguageIdentificationLogEvent");
        zzbh zzbh24 = new zzbh();
        zzbh24.mo51821a(21);
        f42386y = a24.mo23604b(zzbh24.mo51822b()).mo23603a();
        FieldDescriptor.Builder a25 = FieldDescriptor.m7731a("onDeviceTranslationLogEvent");
        zzbh zzbh25 = new zzbh();
        zzbh25.mo51821a(22);
        f42388z = a25.mo23604b(zzbh25.mo51822b()).mo23603a();
        FieldDescriptor.Builder a26 = FieldDescriptor.m7731a("cloudFaceDetectionLogEvent");
        zzbh zzbh26 = new zzbh();
        zzbh26.mo51821a(8);
        f42312A = a26.mo23604b(zzbh26.mo51822b()).mo23603a();
        FieldDescriptor.Builder a27 = FieldDescriptor.m7731a("cloudCropHintDetectionLogEvent");
        zzbh zzbh27 = new zzbh();
        zzbh27.mo51821a(9);
        f42313B = a27.mo23604b(zzbh27.mo51822b()).mo23603a();
        FieldDescriptor.Builder a28 = FieldDescriptor.m7731a("cloudDocumentTextDetectionLogEvent");
        zzbh zzbh28 = new zzbh();
        zzbh28.mo51821a(10);
        f42314C = a28.mo23604b(zzbh28.mo51822b()).mo23603a();
        FieldDescriptor.Builder a29 = FieldDescriptor.m7731a("cloudImagePropertiesDetectionLogEvent");
        zzbh zzbh29 = new zzbh();
        zzbh29.mo51821a(11);
        f42315D = a29.mo23604b(zzbh29.mo51822b()).mo23603a();
        FieldDescriptor.Builder a30 = FieldDescriptor.m7731a("cloudImageLabelDetectionLogEvent");
        zzbh zzbh30 = new zzbh();
        zzbh30.mo51821a(12);
        f42316E = a30.mo23604b(zzbh30.mo51822b()).mo23603a();
        FieldDescriptor.Builder a31 = FieldDescriptor.m7731a("cloudLandmarkDetectionLogEvent");
        zzbh zzbh31 = new zzbh();
        zzbh31.mo51821a(13);
        f42317F = a31.mo23604b(zzbh31.mo51822b()).mo23603a();
        FieldDescriptor.Builder a32 = FieldDescriptor.m7731a("cloudLogoDetectionLogEvent");
        zzbh zzbh32 = new zzbh();
        zzbh32.mo51821a(14);
        f42318G = a32.mo23604b(zzbh32.mo51822b()).mo23603a();
        FieldDescriptor.Builder a33 = FieldDescriptor.m7731a("cloudSafeSearchDetectionLogEvent");
        zzbh zzbh33 = new zzbh();
        zzbh33.mo51821a(15);
        f42319H = a33.mo23604b(zzbh33.mo51822b()).mo23603a();
        FieldDescriptor.Builder a34 = FieldDescriptor.m7731a("cloudTextDetectionLogEvent");
        zzbh zzbh34 = new zzbh();
        zzbh34.mo51821a(16);
        f42320I = a34.mo23604b(zzbh34.mo51822b()).mo23603a();
        FieldDescriptor.Builder a35 = FieldDescriptor.m7731a("cloudWebSearchDetectionLogEvent");
        zzbh zzbh35 = new zzbh();
        zzbh35.mo51821a(17);
        f42321J = a35.mo23604b(zzbh35.mo51822b()).mo23603a();
        FieldDescriptor.Builder a36 = FieldDescriptor.m7731a("automlImageLabelingCreateLogEvent");
        zzbh zzbh36 = new zzbh();
        zzbh36.mo51821a(23);
        f42322K = a36.mo23604b(zzbh36.mo51822b()).mo23603a();
        FieldDescriptor.Builder a37 = FieldDescriptor.m7731a("automlImageLabelingLoadLogEvent");
        zzbh zzbh37 = new zzbh();
        zzbh37.mo51821a(24);
        f42323L = a37.mo23604b(zzbh37.mo51822b()).mo23603a();
        FieldDescriptor.Builder a38 = FieldDescriptor.m7731a("automlImageLabelingInferenceLogEvent");
        zzbh zzbh38 = new zzbh();
        zzbh38.mo51821a(25);
        f42324M = a38.mo23604b(zzbh38.mo51822b()).mo23603a();
        FieldDescriptor.Builder a39 = FieldDescriptor.m7731a("isModelDownloadedLogEvent");
        zzbh zzbh39 = new zzbh();
        zzbh39.mo51821a(39);
        f42325N = a39.mo23604b(zzbh39.mo51822b()).mo23603a();
        FieldDescriptor.Builder a40 = FieldDescriptor.m7731a("deleteModelLogEvent");
        zzbh zzbh40 = new zzbh();
        zzbh40.mo51821a(40);
        f42326O = a40.mo23604b(zzbh40.mo51822b()).mo23603a();
        FieldDescriptor.Builder a41 = FieldDescriptor.m7731a("aggregatedAutomlImageLabelingInferenceLogEvent");
        zzbh zzbh41 = new zzbh();
        zzbh41.mo51821a(30);
        f42327P = a41.mo23604b(zzbh41.mo51822b()).mo23603a();
        FieldDescriptor.Builder a42 = FieldDescriptor.m7731a("aggregatedCustomModelInferenceLogEvent");
        zzbh zzbh42 = new zzbh();
        zzbh42.mo51821a(31);
        f42328Q = a42.mo23604b(zzbh42.mo51822b()).mo23603a();
        FieldDescriptor.Builder a43 = FieldDescriptor.m7731a("aggregatedOnDeviceFaceDetectionLogEvent");
        zzbh zzbh43 = new zzbh();
        zzbh43.mo51821a(32);
        f42329R = a43.mo23604b(zzbh43.mo51822b()).mo23603a();
        FieldDescriptor.Builder a44 = FieldDescriptor.m7731a("aggregatedOnDeviceBarcodeDetectionLogEvent");
        zzbh zzbh44 = new zzbh();
        zzbh44.mo51821a(33);
        f42330S = a44.mo23604b(zzbh44.mo51822b()).mo23603a();
        FieldDescriptor.Builder a45 = FieldDescriptor.m7731a("aggregatedOnDeviceImageLabelDetectionLogEvent");
        zzbh zzbh45 = new zzbh();
        zzbh45.mo51821a(34);
        f42331T = a45.mo23604b(zzbh45.mo51822b()).mo23603a();
        FieldDescriptor.Builder a46 = FieldDescriptor.m7731a("aggregatedOnDeviceObjectInferenceLogEvent");
        zzbh zzbh46 = new zzbh();
        zzbh46.mo51821a(35);
        f42332U = a46.mo23604b(zzbh46.mo51822b()).mo23603a();
        FieldDescriptor.Builder a47 = FieldDescriptor.m7731a("aggregatedOnDeviceTextDetectionLogEvent");
        zzbh zzbh47 = new zzbh();
        zzbh47.mo51821a(36);
        f42333V = a47.mo23604b(zzbh47.mo51822b()).mo23603a();
        FieldDescriptor.Builder a48 = FieldDescriptor.m7731a("aggregatedOnDevicePoseDetectionLogEvent");
        zzbh zzbh48 = new zzbh();
        zzbh48.mo51821a(46);
        f42334W = a48.mo23604b(zzbh48.mo51822b()).mo23603a();
        FieldDescriptor.Builder a49 = FieldDescriptor.m7731a("aggregatedOnDeviceSegmentationLogEvent");
        zzbh zzbh49 = new zzbh();
        zzbh49.mo51821a(47);
        f42335X = a49.mo23604b(zzbh49.mo51822b()).mo23603a();
        FieldDescriptor.Builder a50 = FieldDescriptor.m7731a("pipelineAccelerationInferenceEvents");
        zzbh zzbh50 = new zzbh();
        zzbh50.mo51821a(69);
        f42336Y = a50.mo23604b(zzbh50.mo51822b()).mo23603a();
        FieldDescriptor.Builder a51 = FieldDescriptor.m7731a("remoteConfigLogEvent");
        zzbh zzbh51 = new zzbh();
        zzbh51.mo51821a(42);
        f42337Z = a51.mo23604b(zzbh51.mo51822b()).mo23603a();
        FieldDescriptor.Builder a52 = FieldDescriptor.m7731a("inputImageConstructionLogEvent");
        zzbh zzbh52 = new zzbh();
        zzbh52.mo51821a(50);
        f42339a0 = a52.mo23604b(zzbh52.mo51822b()).mo23603a();
        FieldDescriptor.Builder a53 = FieldDescriptor.m7731a("leakedHandleEvent");
        zzbh zzbh53 = new zzbh();
        zzbh53.mo51821a(51);
        f42341b0 = a53.mo23604b(zzbh53.mo51822b()).mo23603a();
        FieldDescriptor.Builder a54 = FieldDescriptor.m7731a("cameraSourceLogEvent");
        zzbh zzbh54 = new zzbh();
        zzbh54.mo51821a(52);
        f42343c0 = a54.mo23604b(zzbh54.mo51822b()).mo23603a();
        FieldDescriptor.Builder a55 = FieldDescriptor.m7731a("imageLabelOptionalModuleLogEvent");
        zzbh zzbh55 = new zzbh();
        zzbh55.mo51821a(53);
        f42345d0 = a55.mo23604b(zzbh55.mo51822b()).mo23603a();
        FieldDescriptor.Builder a56 = FieldDescriptor.m7731a("languageIdentificationOptionalModuleLogEvent");
        zzbh zzbh56 = new zzbh();
        zzbh56.mo51821a(54);
        f42347e0 = a56.mo23604b(zzbh56.mo51822b()).mo23603a();
        FieldDescriptor.Builder a57 = FieldDescriptor.m7731a("faceDetectionOptionalModuleLogEvent");
        zzbh zzbh57 = new zzbh();
        zzbh57.mo51821a(60);
        f42349f0 = a57.mo23604b(zzbh57.mo51822b()).mo23603a();
        FieldDescriptor.Builder a58 = FieldDescriptor.m7731a("nlClassifierOptionalModuleLogEvent");
        zzbh zzbh58 = new zzbh();
        zzbh58.mo51821a(55);
        f42351g0 = a58.mo23604b(zzbh58.mo51822b()).mo23603a();
        FieldDescriptor.Builder a59 = FieldDescriptor.m7731a("nlClassifierClientLibraryLogEvent");
        zzbh zzbh59 = new zzbh();
        zzbh59.mo51821a(56);
        f42353h0 = a59.mo23604b(zzbh59.mo51822b()).mo23603a();
        FieldDescriptor.Builder a60 = FieldDescriptor.m7731a("accelerationAllowlistLogEvent");
        zzbh zzbh60 = new zzbh();
        zzbh60.mo51821a(57);
        f42355i0 = a60.mo23604b(zzbh60.mo51822b()).mo23603a();
        FieldDescriptor.Builder a61 = FieldDescriptor.m7731a("toxicityDetectionCreateEvent");
        zzbh zzbh61 = new zzbh();
        zzbh61.mo51821a(62);
        f42357j0 = a61.mo23604b(zzbh61.mo51822b()).mo23603a();
        FieldDescriptor.Builder a62 = FieldDescriptor.m7731a("toxicityDetectionLoadEvent");
        zzbh zzbh62 = new zzbh();
        zzbh62.mo51821a(63);
        f42359k0 = a62.mo23604b(zzbh62.mo51822b()).mo23603a();
        FieldDescriptor.Builder a63 = FieldDescriptor.m7731a("toxicityDetectionInferenceEvent");
        zzbh zzbh63 = new zzbh();
        zzbh63.mo51821a(64);
        f42361l0 = a63.mo23604b(zzbh63.mo51822b()).mo23603a();
        FieldDescriptor.Builder a64 = FieldDescriptor.m7731a("barcodeDetectionOptionalModuleLogEvent");
        zzbh zzbh64 = new zzbh();
        zzbh64.mo51821a(65);
        f42363m0 = a64.mo23604b(zzbh64.mo51822b()).mo23603a();
        FieldDescriptor.Builder a65 = FieldDescriptor.m7731a("customImageLabelOptionalModuleLogEvent");
        zzbh zzbh65 = new zzbh();
        zzbh65.mo51821a(66);
        f42365n0 = a65.mo23604b(zzbh65.mo51822b()).mo23603a();
        FieldDescriptor.Builder a66 = FieldDescriptor.m7731a("codeScannerScanApiEvent");
        zzbh zzbh66 = new zzbh();
        zzbh66.mo51821a(67);
        f42367o0 = a66.mo23604b(zzbh66.mo51822b()).mo23603a();
        FieldDescriptor.Builder a67 = FieldDescriptor.m7731a("codeScannerOptionalModuleEvent");
        zzbh zzbh67 = new zzbh();
        zzbh67.mo51821a(68);
        f42369p0 = a67.mo23604b(zzbh67.mo51822b()).mo23603a();
        FieldDescriptor.Builder a68 = FieldDescriptor.m7731a("onDeviceExplicitContentCreateLogEvent");
        zzbh zzbh68 = new zzbh();
        zzbh68.mo51821a(70);
        f42371q0 = a68.mo23604b(zzbh68.mo51822b()).mo23603a();
        FieldDescriptor.Builder a69 = FieldDescriptor.m7731a("onDeviceExplicitContentLoadLogEvent");
        zzbh zzbh69 = new zzbh();
        zzbh69.mo51821a(71);
        f42373r0 = a69.mo23604b(zzbh69.mo51822b()).mo23603a();
        FieldDescriptor.Builder a70 = FieldDescriptor.m7731a("onDeviceExplicitContentInferenceLogEvent");
        zzbh zzbh70 = new zzbh();
        zzbh70.mo51821a(72);
        f42375s0 = a70.mo23604b(zzbh70.mo51822b()).mo23603a();
        FieldDescriptor.Builder a71 = FieldDescriptor.m7731a("aggregatedOnDeviceExplicitContentLogEvent");
        zzbh zzbh71 = new zzbh();
        zzbh71.mo51821a(73);
        f42377t0 = a71.mo23604b(zzbh71.mo51822b()).mo23603a();
        FieldDescriptor.Builder a72 = FieldDescriptor.m7731a("onDeviceSelfieFaceCreateLogEvent");
        zzbh zzbh72 = new zzbh();
        zzbh72.mo51821a(74);
        f42379u0 = a72.mo23604b(zzbh72.mo51822b()).mo23603a();
        FieldDescriptor.Builder a73 = FieldDescriptor.m7731a("onDeviceSelfieFaceLoadLogEvent");
        zzbh zzbh73 = new zzbh();
        zzbh73.mo51821a(75);
        f42381v0 = a73.mo23604b(zzbh73.mo51822b()).mo23603a();
        FieldDescriptor.Builder a74 = FieldDescriptor.m7731a("onDeviceSelfieFaceLogEvent");
        zzbh zzbh74 = new zzbh();
        zzbh74.mo51821a(76);
        f42383w0 = a74.mo23604b(zzbh74.mo51822b()).mo23603a();
        FieldDescriptor.Builder a75 = FieldDescriptor.m7731a("aggregatedOnDeviceSelfieFaceLogEvent");
        zzbh zzbh75 = new zzbh();
        zzbh75.mo51821a(77);
        f42385x0 = a75.mo23604b(zzbh75.mo51822b()).mo23603a();
        FieldDescriptor.Builder a76 = FieldDescriptor.m7731a("smartReplyOptionalModuleLogEvent");
        zzbh zzbh76 = new zzbh();
        zzbh76.mo51821a(78);
        f42387y0 = a76.mo23604b(zzbh76.mo51822b()).mo23603a();
    }

    private zzfd() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjc zzjc = (zzjc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f42340b, zzjc.mo51896f());
        objectEncoderContext.mo23608e(f42342c, zzjc.mo51894d());
        objectEncoderContext.mo23608e(f42344d, (Object) null);
        objectEncoderContext.mo23608e(f42346e, (Object) null);
        objectEncoderContext.mo23608e(f42348f, zzjc.mo51895e());
        objectEncoderContext.mo23608e(f42350g, (Object) null);
        objectEncoderContext.mo23608e(f42352h, (Object) null);
        objectEncoderContext.mo23608e(f42354i, (Object) null);
        objectEncoderContext.mo23608e(f42356j, (Object) null);
        objectEncoderContext.mo23608e(f42358k, (Object) null);
        objectEncoderContext.mo23608e(f42360l, (Object) null);
        objectEncoderContext.mo23608e(f42362m, (Object) null);
        objectEncoderContext.mo23608e(f42364n, (Object) null);
        objectEncoderContext.mo23608e(f42366o, (Object) null);
        objectEncoderContext.mo23608e(f42368p, (Object) null);
        objectEncoderContext.mo23608e(f42370q, (Object) null);
        objectEncoderContext.mo23608e(f42372r, (Object) null);
        objectEncoderContext.mo23608e(f42374s, (Object) null);
        objectEncoderContext.mo23608e(f42376t, (Object) null);
        objectEncoderContext.mo23608e(f42378u, (Object) null);
        objectEncoderContext.mo23608e(f42380v, (Object) null);
        objectEncoderContext.mo23608e(f42382w, (Object) null);
        objectEncoderContext.mo23608e(f42384x, (Object) null);
        objectEncoderContext.mo23608e(f42386y, (Object) null);
        objectEncoderContext.mo23608e(f42388z, (Object) null);
        objectEncoderContext.mo23608e(f42312A, (Object) null);
        objectEncoderContext.mo23608e(f42313B, (Object) null);
        objectEncoderContext.mo23608e(f42314C, (Object) null);
        objectEncoderContext.mo23608e(f42315D, (Object) null);
        objectEncoderContext.mo23608e(f42316E, (Object) null);
        objectEncoderContext.mo23608e(f42317F, (Object) null);
        objectEncoderContext.mo23608e(f42318G, (Object) null);
        objectEncoderContext.mo23608e(f42319H, (Object) null);
        objectEncoderContext.mo23608e(f42320I, (Object) null);
        objectEncoderContext.mo23608e(f42321J, (Object) null);
        objectEncoderContext.mo23608e(f42322K, (Object) null);
        objectEncoderContext.mo23608e(f42323L, (Object) null);
        objectEncoderContext.mo23608e(f42324M, (Object) null);
        objectEncoderContext.mo23608e(f42325N, zzjc.mo51892b());
        objectEncoderContext.mo23608e(f42326O, zzjc.mo51891a());
        objectEncoderContext.mo23608e(f42327P, (Object) null);
        objectEncoderContext.mo23608e(f42328Q, (Object) null);
        objectEncoderContext.mo23608e(f42329R, (Object) null);
        objectEncoderContext.mo23608e(f42330S, (Object) null);
        objectEncoderContext.mo23608e(f42331T, (Object) null);
        objectEncoderContext.mo23608e(f42332U, (Object) null);
        objectEncoderContext.mo23608e(f42333V, (Object) null);
        objectEncoderContext.mo23608e(f42334W, (Object) null);
        objectEncoderContext.mo23608e(f42335X, (Object) null);
        objectEncoderContext.mo23608e(f42336Y, (Object) null);
        objectEncoderContext.mo23608e(f42337Z, (Object) null);
        objectEncoderContext.mo23608e(f42339a0, (Object) null);
        objectEncoderContext.mo23608e(f42341b0, zzjc.mo51893c());
        objectEncoderContext.mo23608e(f42343c0, (Object) null);
        objectEncoderContext.mo23608e(f42345d0, (Object) null);
        objectEncoderContext.mo23608e(f42347e0, (Object) null);
        objectEncoderContext.mo23608e(f42349f0, (Object) null);
        objectEncoderContext.mo23608e(f42351g0, (Object) null);
        objectEncoderContext.mo23608e(f42353h0, (Object) null);
        objectEncoderContext.mo23608e(f42355i0, (Object) null);
        objectEncoderContext.mo23608e(f42357j0, (Object) null);
        objectEncoderContext.mo23608e(f42359k0, (Object) null);
        objectEncoderContext.mo23608e(f42361l0, (Object) null);
        objectEncoderContext.mo23608e(f42363m0, (Object) null);
        objectEncoderContext.mo23608e(f42365n0, (Object) null);
        objectEncoderContext.mo23608e(f42367o0, (Object) null);
        objectEncoderContext.mo23608e(f42369p0, (Object) null);
        objectEncoderContext.mo23608e(f42371q0, (Object) null);
        objectEncoderContext.mo23608e(f42373r0, (Object) null);
        objectEncoderContext.mo23608e(f42375s0, (Object) null);
        objectEncoderContext.mo23608e(f42377t0, (Object) null);
        objectEncoderContext.mo23608e(f42379u0, (Object) null);
        objectEncoderContext.mo23608e(f42381v0, (Object) null);
        objectEncoderContext.mo23608e(f42383w0, (Object) null);
        objectEncoderContext.mo23608e(f42385x0, (Object) null);
        objectEncoderContext.mo23608e(f42387y0, (Object) null);
    }
}
