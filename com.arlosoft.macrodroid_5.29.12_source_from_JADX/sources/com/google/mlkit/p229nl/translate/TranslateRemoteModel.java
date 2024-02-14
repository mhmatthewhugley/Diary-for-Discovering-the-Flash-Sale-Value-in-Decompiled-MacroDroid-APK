package com.google.mlkit.p229nl.translate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import com.google.mlkit.p229nl.translate.TranslateLanguage;
import com.google.mlkit.p229nl.translate.internal.zzad;

/* renamed from: com.google.mlkit.nl.translate.TranslateRemoteModel */
/* compiled from: com.google.mlkit:translate@@17.0.1 */
public class TranslateRemoteModel extends RemoteModel {
    @TranslateLanguage.Language

    /* renamed from: g */
    private final String f56432g;

    /* renamed from: com.google.mlkit.nl.translate.TranslateRemoteModel$Builder */
    /* compiled from: com.google.mlkit:translate@@17.0.1 */
    public static class Builder {
        @TranslateLanguage.Language

        /* renamed from: a */
        private final String f56433a;

        public Builder(@NonNull @TranslateLanguage.Language String str) {
            this.f56433a = str;
        }

        @NonNull
        /* renamed from: a */
        public TranslateRemoteModel mo64632a() {
            return new TranslateRemoteModel(this.f56433a, (zzk) null);
        }
    }

    /* synthetic */ TranslateRemoteModel(String str, zzk zzk) {
        super((String) null, BaseModel.TRANSLATE, ModelType.TRANSLATE);
        this.f56432g = str;
    }

    @NonNull
    /* renamed from: g */
    public static String m79145g(@NonNull String str) {
        return "COM.GOOGLE.BASE_TRANSLATE:".concat(String.valueOf(str));
    }

    @NonNull
    /* renamed from: c */
    public final String mo64530c() {
        return zzad.m79188e(mo64631f());
    }

    @NonNull
    /* renamed from: e */
    public final String mo64532e() {
        return m79145g(zzad.m79188e(mo64631f()));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslateRemoteModel) && super.equals(obj) && mo64631f() == ((TranslateRemoteModel) obj).mo64631f();
    }

    @NonNull
    @TranslateLanguage.Language
    /* renamed from: f */
    public String mo64631f() {
        return this.f56432g;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + mo64631f().hashCode();
    }
}
