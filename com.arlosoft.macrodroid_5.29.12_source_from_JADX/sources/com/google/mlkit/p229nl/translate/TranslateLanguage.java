package com.google.mlkit.p229nl.translate;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_translate.zzv;
import com.google.android.gms.internal.mlkit_translate.zzy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* renamed from: com.google.mlkit.nl.translate.TranslateLanguage */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class TranslateLanguage {

    /* renamed from: a */
    private static final zzy f56431a = zzy.m62270e("iw", "he", "in", "id", "nb", "no");

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.mlkit.nl.translate.TranslateLanguage$Language */
    /* compiled from: com.google.mlkit:translate@@17.0.1 */
    public @interface Language {
    }

    private TranslateLanguage() {
    }

    @NonNull
    /* renamed from: a */
    public static List<String> m79143a() {
        return zzv.m62255n(new String[]{"af", "sq", "ar", "be", "bg", "bn", "ca", "zh", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "gl", "ka", "de", "el", "gu", "ht", "he", "hi", "hu", "is", "id", "ga", "it", "ja", "kn", "ko", "lt", "lv", "mk", "mr", "ms", "mt", "no", "fa", "pl", "pt", "ro", "ru", "sk", "sl", "es", "sv", "sw", "tl", "ta", "te", "th", "tr", "uk", "ur", "vi", "cy"});
    }

    @NonNull
    /* renamed from: b */
    public static String m79144b(@NonNull @Language String str) {
        return str.equals("he") ? "iw" : str;
    }
}
