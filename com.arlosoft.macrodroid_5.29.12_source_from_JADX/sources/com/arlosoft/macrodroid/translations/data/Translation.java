package com.arlosoft.macrodroid.translations.data;

import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: Translation.kt */
public final class Translation {
    @SerializedName("english_name")
    private final String englishName;
    @SerializedName("is_base_language")
    private final boolean isBaseLanguage;
    @SerializedName("is_ready_to_publish")
    private final boolean isReady;
    @SerializedName("code")
    private final String languageCode;
    @SerializedName("local_name")
    private final String localName;
    @SerializedName("region")
    private final String region;
    @SerializedName("translation_progress")
    private final String translationProgress;
    @SerializedName("uploaded_at")
    private final String uploadedAt;
    @SerializedName("upload_at_timestamp")
    private final long uploadedAtTimestamp;

    public Translation(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, long j) {
        C13706o.m87929f(str, "languageCode");
        C13706o.m87929f(str2, "englishName");
        C13706o.m87929f(str3, "localName");
        C13706o.m87929f(str4, "region");
        C13706o.m87929f(str5, "translationProgress");
        C13706o.m87929f(str6, "uploadedAt");
        this.languageCode = str;
        this.englishName = str2;
        this.localName = str3;
        this.region = str4;
        this.isBaseLanguage = z;
        this.isReady = z2;
        this.translationProgress = str5;
        this.uploadedAt = str6;
        this.uploadedAtTimestamp = j;
    }

    public static /* synthetic */ Translation copy$default(Translation translation, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, long j, int i, Object obj) {
        Translation translation2 = translation;
        int i2 = i;
        return translation.copy((i2 & 1) != 0 ? translation2.languageCode : str, (i2 & 2) != 0 ? translation2.englishName : str2, (i2 & 4) != 0 ? translation2.localName : str3, (i2 & 8) != 0 ? translation2.region : str4, (i2 & 16) != 0 ? translation2.isBaseLanguage : z, (i2 & 32) != 0 ? translation2.isReady : z2, (i2 & 64) != 0 ? translation2.translationProgress : str5, (i2 & 128) != 0 ? translation2.uploadedAt : str6, (i2 & 256) != 0 ? translation2.uploadedAtTimestamp : j);
    }

    public final String component1() {
        return this.languageCode;
    }

    public final String component2() {
        return this.englishName;
    }

    public final String component3() {
        return this.localName;
    }

    public final String component4() {
        return this.region;
    }

    public final boolean component5() {
        return this.isBaseLanguage;
    }

    public final boolean component6() {
        return this.isReady;
    }

    public final String component7() {
        return this.translationProgress;
    }

    public final String component8() {
        return this.uploadedAt;
    }

    public final long component9() {
        return this.uploadedAtTimestamp;
    }

    public final Translation copy(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, long j) {
        C13706o.m87929f(str, "languageCode");
        C13706o.m87929f(str2, "englishName");
        C13706o.m87929f(str3, "localName");
        String str7 = str4;
        C13706o.m87929f(str7, "region");
        String str8 = str5;
        C13706o.m87929f(str8, "translationProgress");
        String str9 = str6;
        C13706o.m87929f(str9, "uploadedAt");
        return new Translation(str, str2, str3, str7, z, z2, str8, str9, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Translation)) {
            return false;
        }
        Translation translation = (Translation) obj;
        return C13706o.m87924a(this.languageCode, translation.languageCode) && C13706o.m87924a(this.englishName, translation.englishName) && C13706o.m87924a(this.localName, translation.localName) && C13706o.m87924a(this.region, translation.region) && this.isBaseLanguage == translation.isBaseLanguage && this.isReady == translation.isReady && C13706o.m87924a(this.translationProgress, translation.translationProgress) && C13706o.m87924a(this.uploadedAt, translation.uploadedAt) && this.uploadedAtTimestamp == translation.uploadedAtTimestamp;
    }

    public final String getEnglishName() {
        return this.englishName;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getLocalName() {
        return this.localName;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getTranslationProgress() {
        return this.translationProgress;
    }

    public final String getUploadedAt() {
        return this.uploadedAt;
    }

    public final long getUploadedAtTimestamp() {
        return this.uploadedAtTimestamp;
    }

    public int hashCode() {
        int hashCode = ((((((this.languageCode.hashCode() * 31) + this.englishName.hashCode()) * 31) + this.localName.hashCode()) * 31) + this.region.hashCode()) * 31;
        boolean z = this.isBaseLanguage;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isReady;
        if (!z3) {
            z2 = z3;
        }
        return ((((((i + (z2 ? 1 : 0)) * 31) + this.translationProgress.hashCode()) * 31) + this.uploadedAt.hashCode()) * 31) + C1405a.m633a(this.uploadedAtTimestamp);
    }

    public final boolean isBaseLanguage() {
        return this.isBaseLanguage;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    public String toString() {
        return "Translation(languageCode=" + this.languageCode + ", englishName=" + this.englishName + ", localName=" + this.localName + ", region=" + this.region + ", isBaseLanguage=" + this.isBaseLanguage + ", isReady=" + this.isReady + ", translationProgress=" + this.translationProgress + ", uploadedAt=" + this.uploadedAt + ", uploadedAtTimestamp=" + this.uploadedAtTimestamp + ')';
    }
}
