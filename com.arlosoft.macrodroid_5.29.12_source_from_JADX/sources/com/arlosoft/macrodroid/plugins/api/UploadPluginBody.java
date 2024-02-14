package com.arlosoft.macrodroid.plugins.api;

import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: UploadPluginBody.kt */
public final class UploadPluginBody {
    private final String description;
    private final String developerName;
    private final String downloadLink;
    private final String iconUrl;
    private final String language;
    private final String name;
    private final String packageName;
    private final int userId;
    private final String website;

    public UploadPluginBody(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "developerName");
        C13706o.m87929f(str3, "description");
        C13706o.m87929f(str4, "packageName");
        C13706o.m87929f(str5, "downloadLink");
        C13706o.m87929f(str7, "website");
        C13706o.m87929f(str8, "language");
        this.userId = i;
        this.name = str;
        this.developerName = str2;
        this.description = str3;
        this.packageName = str4;
        this.downloadLink = str5;
        this.iconUrl = str6;
        this.website = str7;
        this.language = str8;
    }

    public static /* synthetic */ UploadPluginBody copy$default(UploadPluginBody uploadPluginBody, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, Object obj) {
        UploadPluginBody uploadPluginBody2 = uploadPluginBody;
        int i3 = i2;
        return uploadPluginBody.copy((i3 & 1) != 0 ? uploadPluginBody2.userId : i, (i3 & 2) != 0 ? uploadPluginBody2.name : str, (i3 & 4) != 0 ? uploadPluginBody2.developerName : str2, (i3 & 8) != 0 ? uploadPluginBody2.description : str3, (i3 & 16) != 0 ? uploadPluginBody2.packageName : str4, (i3 & 32) != 0 ? uploadPluginBody2.downloadLink : str5, (i3 & 64) != 0 ? uploadPluginBody2.iconUrl : str6, (i3 & 128) != 0 ? uploadPluginBody2.website : str7, (i3 & 256) != 0 ? uploadPluginBody2.language : str8);
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.developerName;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.packageName;
    }

    public final String component6() {
        return this.downloadLink;
    }

    public final String component7() {
        return this.iconUrl;
    }

    public final String component8() {
        return this.website;
    }

    public final String component9() {
        return this.language;
    }

    public final UploadPluginBody copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str2, "developerName");
        C13706o.m87929f(str3, "description");
        String str9 = str4;
        C13706o.m87929f(str9, "packageName");
        String str10 = str5;
        C13706o.m87929f(str10, "downloadLink");
        String str11 = str7;
        C13706o.m87929f(str11, "website");
        String str12 = str8;
        C13706o.m87929f(str12, "language");
        return new UploadPluginBody(i, str, str2, str3, str9, str10, str6, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadPluginBody)) {
            return false;
        }
        UploadPluginBody uploadPluginBody = (UploadPluginBody) obj;
        return this.userId == uploadPluginBody.userId && C13706o.m87924a(this.name, uploadPluginBody.name) && C13706o.m87924a(this.developerName, uploadPluginBody.developerName) && C13706o.m87924a(this.description, uploadPluginBody.description) && C13706o.m87924a(this.packageName, uploadPluginBody.packageName) && C13706o.m87924a(this.downloadLink, uploadPluginBody.downloadLink) && C13706o.m87924a(this.iconUrl, uploadPluginBody.iconUrl) && C13706o.m87924a(this.website, uploadPluginBody.website) && C13706o.m87924a(this.language, uploadPluginBody.language);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeveloperName() {
        return this.developerName;
    }

    public final String getDownloadLink() {
        return this.downloadLink;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.userId * 31) + this.name.hashCode()) * 31) + this.developerName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.downloadLink.hashCode()) * 31;
        String str = this.iconUrl;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.website.hashCode()) * 31) + this.language.hashCode();
    }

    public String toString() {
        return "UploadPluginBody(userId=" + this.userId + ", name=" + this.name + ", developerName=" + this.developerName + ", description=" + this.description + ", packageName=" + this.packageName + ", downloadLink=" + this.downloadLink + ", iconUrl=" + this.iconUrl + ", website=" + this.website + ", language=" + this.language + ')';
    }
}
