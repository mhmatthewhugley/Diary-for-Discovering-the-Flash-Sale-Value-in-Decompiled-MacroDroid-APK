package com.arlosoft.macrodroid.plugins.data;

import com.arlosoft.macrodroid.common.DontObfuscate;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: AppBrainPackageInfo.kt */
public final class AppBrainPackageInfo {
    private final String description;
    private final String developerName;
    private final String iconUrl;
    private final String name;
    @SerializedName("package")
    private final String packageName;
    private final String shortDescription;
    private final String website;

    public AppBrainPackageInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C13706o.m87929f(str, "packageName");
        C13706o.m87929f(str2, "name");
        C13706o.m87929f(str3, "shortDescription");
        C13706o.m87929f(str4, "description");
        C13706o.m87929f(str5, "iconUrl");
        C13706o.m87929f(str6, "website");
        C13706o.m87929f(str7, "developerName");
        this.packageName = str;
        this.name = str2;
        this.shortDescription = str3;
        this.description = str4;
        this.iconUrl = str5;
        this.website = str6;
        this.developerName = str7;
    }

    public static /* synthetic */ AppBrainPackageInfo copy$default(AppBrainPackageInfo appBrainPackageInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appBrainPackageInfo.packageName;
        }
        if ((i & 2) != 0) {
            str2 = appBrainPackageInfo.name;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = appBrainPackageInfo.shortDescription;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = appBrainPackageInfo.description;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = appBrainPackageInfo.iconUrl;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = appBrainPackageInfo.website;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = appBrainPackageInfo.developerName;
        }
        return appBrainPackageInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.shortDescription;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.website;
    }

    public final String component7() {
        return this.developerName;
    }

    public final AppBrainPackageInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C13706o.m87929f(str, "packageName");
        C13706o.m87929f(str2, "name");
        C13706o.m87929f(str3, "shortDescription");
        C13706o.m87929f(str4, "description");
        C13706o.m87929f(str5, "iconUrl");
        C13706o.m87929f(str6, "website");
        String str8 = str7;
        C13706o.m87929f(str8, "developerName");
        return new AppBrainPackageInfo(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBrainPackageInfo)) {
            return false;
        }
        AppBrainPackageInfo appBrainPackageInfo = (AppBrainPackageInfo) obj;
        return C13706o.m87924a(this.packageName, appBrainPackageInfo.packageName) && C13706o.m87924a(this.name, appBrainPackageInfo.name) && C13706o.m87924a(this.shortDescription, appBrainPackageInfo.shortDescription) && C13706o.m87924a(this.description, appBrainPackageInfo.description) && C13706o.m87924a(this.iconUrl, appBrainPackageInfo.iconUrl) && C13706o.m87924a(this.website, appBrainPackageInfo.website) && C13706o.m87924a(this.developerName, appBrainPackageInfo.developerName);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeveloperName() {
        return this.developerName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getShortDescription() {
        return this.shortDescription;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        return (((((((((((this.packageName.hashCode() * 31) + this.name.hashCode()) * 31) + this.shortDescription.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.website.hashCode()) * 31) + this.developerName.hashCode();
    }

    public String toString() {
        return "AppBrainPackageInfo(packageName=" + this.packageName + ", name=" + this.name + ", shortDescription=" + this.shortDescription + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ", website=" + this.website + ", developerName=" + this.developerName + ')';
    }
}
