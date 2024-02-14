package com.google.mlkit.p229nl.translate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_translate.zznv;
import com.google.android.gms.internal.mlkit_translate.zznx;
import com.google.mlkit.p229nl.translate.TranslateLanguage;
import java.util.concurrent.Executor;

/* renamed from: com.google.mlkit.nl.translate.TranslatorOptions */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class TranslatorOptions {
    @TranslateLanguage.Language

    /* renamed from: a */
    private final String f56434a;
    @TranslateLanguage.Language

    /* renamed from: b */
    private final String f56435b;
    @Nullable

    /* renamed from: c */
    private final Executor f56436c;

    /* renamed from: com.google.mlkit.nl.translate.TranslatorOptions$Builder */
    /* compiled from: com.google.mlkit:translate@@17.0.1 */
    public static class Builder {
        @Nullable
        @TranslateLanguage.Language

        /* renamed from: a */
        private String f56437a;
        @Nullable
        @TranslateLanguage.Language

        /* renamed from: b */
        private String f56438b;
        @Nullable

        /* renamed from: c */
        private Executor f56439c;

        @NonNull
        /* renamed from: a */
        public TranslatorOptions mo64644a() {
            return new TranslatorOptions((String) Preconditions.m4488k(this.f56437a), (String) Preconditions.m4488k(this.f56438b), this.f56439c, (zzl) null);
        }

        @NonNull
        /* renamed from: b */
        public Builder mo64645b(@NonNull @TranslateLanguage.Language String str) {
            this.f56437a = str;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public Builder mo64646c(@NonNull @TranslateLanguage.Language String str) {
            this.f56438b = str;
            return this;
        }
    }

    /* synthetic */ TranslatorOptions(String str, String str2, Executor executor, zzl zzl) {
        this.f56434a = str;
        this.f56435b = str2;
        this.f56436c = executor;
    }

    /* renamed from: a */
    public final zznx mo64636a() {
        zznv zznv = new zznv();
        zznv.mo52361a(this.f56434a);
        zznv.mo52362b(this.f56435b);
        return zznv.mo52363c();
    }

    @NonNull
    /* renamed from: b */
    public final String mo64637b() {
        return TranslateLanguage.m79144b(this.f56434a);
    }

    @NonNull
    /* renamed from: c */
    public final String mo64638c() {
        return TranslateLanguage.m79144b(this.f56435b);
    }

    @NonNull
    @TranslateLanguage.Language
    /* renamed from: d */
    public final String mo64639d() {
        return this.f56434a;
    }

    @NonNull
    @TranslateLanguage.Language
    /* renamed from: e */
    public final String mo64640e() {
        return this.f56435b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslatorOptions)) {
            return false;
        }
        TranslatorOptions translatorOptions = (TranslatorOptions) obj;
        return Objects.m4470a(translatorOptions.f56434a, this.f56434a) && Objects.m4470a(translatorOptions.f56435b, this.f56435b) && Objects.m4470a(translatorOptions.f56436c, this.f56436c);
    }

    @Nullable
    /* renamed from: f */
    public final Executor mo64642f() {
        return this.f56436c;
    }

    public int hashCode() {
        return Objects.m4471b(this.f56434a, this.f56435b, this.f56436c);
    }
}
