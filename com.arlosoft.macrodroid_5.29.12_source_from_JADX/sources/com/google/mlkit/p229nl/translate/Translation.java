package com.google.mlkit.p229nl.translate;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.p229nl.translate.internal.TranslatorImpl;

/* renamed from: com.google.mlkit.nl.translate.Translation */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class Translation {
    private Translation() {
    }

    @NonNull
    /* renamed from: a */
    public static Translator m79150a(@NonNull TranslatorOptions translatorOptions) {
        return ((TranslatorImpl.Factory) MlKitContext.m79040c().mo64553a(TranslatorImpl.Factory.class)).mo64652a(translatorOptions);
    }
}
