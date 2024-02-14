package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaq;
import com.google.android.gms.internal.mlkit_common.zzar;

@KeepForSdk
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class OptionalModuleUtils {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    public static final Feature[] f56319a = new Feature[0];
    @NonNull
    @KeepForSdk

    /* renamed from: b */
    public static final Feature f56320b;
    @NonNull
    @KeepForSdk

    /* renamed from: c */
    public static final Feature f56321c;
    @NonNull
    @KeepForSdk

    /* renamed from: d */
    public static final Feature f56322d;
    @NonNull
    @KeepForSdk

    /* renamed from: e */
    public static final Feature f56323e;
    @NonNull
    @KeepForSdk

    /* renamed from: f */
    public static final Feature f56324f;
    @NonNull
    @KeepForSdk

    /* renamed from: g */
    public static final Feature f56325g;
    @NonNull
    @KeepForSdk

    /* renamed from: h */
    public static final Feature f56326h;
    @NonNull
    @KeepForSdk

    /* renamed from: i */
    public static final Feature f56327i;
    @NonNull
    @KeepForSdk

    /* renamed from: j */
    public static final Feature f56328j;
    @NonNull
    @KeepForSdk

    /* renamed from: k */
    public static final Feature f56329k;

    /* renamed from: l */
    private static final zzar f56330l;

    /* renamed from: m */
    private static final zzar f56331m;

    static {
        Feature feature = new Feature("vision.barcode", 1);
        f56320b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1);
        f56321c = feature2;
        Feature feature3 = new Feature("vision.face", 1);
        f56322d = feature3;
        Feature feature4 = new Feature("vision.ica", 1);
        f56323e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1);
        f56324f = feature5;
        Feature feature6 = new Feature("mlkit.langid", 1);
        f56325g = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1);
        f56326h = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1);
        f56327i = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1);
        f56328j = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1);
        f56329k = feature10;
        zzaq zzaq = new zzaq();
        zzaq.mo51761a("barcode", feature);
        zzaq.mo51761a("custom_ica", feature2);
        zzaq.mo51761a("face", feature3);
        zzaq.mo51761a("ica", feature4);
        zzaq.mo51761a("ocr", feature5);
        zzaq.mo51761a("langid", feature6);
        zzaq.mo51761a("nlclassifier", feature7);
        zzaq.mo51761a("tflite_dynamite", feature8);
        zzaq.mo51761a("barcode_ui", feature9);
        zzaq.mo51761a("smart_reply", feature10);
        f56330l = zzaq.mo51762b();
        zzaq zzaq2 = new zzaq();
        zzaq2.mo51761a("com.google.android.gms.vision.barcode", feature);
        zzaq2.mo51761a("com.google.android.gms.vision.custom.ica", feature2);
        zzaq2.mo51761a("com.google.android.gms.vision.face", feature3);
        zzaq2.mo51761a("com.google.android.gms.vision.ica", feature4);
        zzaq2.mo51761a("com.google.android.gms.vision.ocr", feature5);
        zzaq2.mo51761a("com.google.android.gms.mlkit.langid", feature6);
        zzaq2.mo51761a("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzaq2.mo51761a("com.google.android.gms.tflite_dynamite", feature8);
        zzaq2.mo51761a("com.google.android.gms.mlkit_smartreply", feature10);
        f56331m = zzaq2.mo51762b();
    }

    private OptionalModuleUtils() {
    }
}
