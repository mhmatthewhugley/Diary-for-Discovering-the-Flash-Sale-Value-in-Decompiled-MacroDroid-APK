package com.arlosoft.macrodroid.templatestore.model;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: UploadMacroBody.kt */
public final class UploadMacroBody {
    private final int categoryId;
    private final String description;
    private final String json;
    private final String language;
    private final String name;
    private final int rootOnlyVersion;
    private final int userId;

    public UploadMacroBody(int i, String str, String str2, String str3, int i2, String str4, int i3) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "description");
        C13706o.m87929f(str3, "json");
        C13706o.m87929f(str4, "language");
        this.userId = i;
        this.name = str;
        this.description = str2;
        this.json = str3;
        this.categoryId = i2;
        this.language = str4;
        this.rootOnlyVersion = i3;
    }

    public static /* synthetic */ UploadMacroBody copy$default(UploadMacroBody uploadMacroBody, int i, String str, String str2, String str3, int i2, String str4, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = uploadMacroBody.userId;
        }
        if ((i4 & 2) != 0) {
            str = uploadMacroBody.name;
        }
        String str5 = str;
        if ((i4 & 4) != 0) {
            str2 = uploadMacroBody.description;
        }
        String str6 = str2;
        if ((i4 & 8) != 0) {
            str3 = uploadMacroBody.json;
        }
        String str7 = str3;
        if ((i4 & 16) != 0) {
            i2 = uploadMacroBody.categoryId;
        }
        int i5 = i2;
        if ((i4 & 32) != 0) {
            str4 = uploadMacroBody.language;
        }
        String str8 = str4;
        if ((i4 & 64) != 0) {
            i3 = uploadMacroBody.rootOnlyVersion;
        }
        return uploadMacroBody.copy(i, str5, str6, str7, i5, str8, i3);
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.json;
    }

    public final int component5() {
        return this.categoryId;
    }

    public final String component6() {
        return this.language;
    }

    public final int component7() {
        return this.rootOnlyVersion;
    }

    public final UploadMacroBody copy(int i, String str, String str2, String str3, int i2, String str4, int i3) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "description");
        C13706o.m87929f(str3, "json");
        C13706o.m87929f(str4, "language");
        return new UploadMacroBody(i, str, str2, str3, i2, str4, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadMacroBody)) {
            return false;
        }
        UploadMacroBody uploadMacroBody = (UploadMacroBody) obj;
        return this.userId == uploadMacroBody.userId && C13706o.m87924a(this.name, uploadMacroBody.name) && C13706o.m87924a(this.description, uploadMacroBody.description) && C13706o.m87924a(this.json, uploadMacroBody.json) && this.categoryId == uploadMacroBody.categoryId && C13706o.m87924a(this.language, uploadMacroBody.language) && this.rootOnlyVersion == uploadMacroBody.rootOnlyVersion;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getJson() {
        return this.json;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRootOnlyVersion() {
        return this.rootOnlyVersion;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((this.userId * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.json.hashCode()) * 31) + this.categoryId) * 31) + this.language.hashCode()) * 31) + this.rootOnlyVersion;
    }

    public String toString() {
        return "UploadMacroBody(userId=" + this.userId + ", name=" + this.name + ", description=" + this.description + ", json=" + this.json + ", categoryId=" + this.categoryId + ", language=" + this.language + ", rootOnlyVersion=" + this.rootOnlyVersion + ')';
    }
}
