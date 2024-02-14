package com.arlosoft.macrodroid.plugins.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.comments.CommentableItem;
import com.arlosoft.macrodroid.common.DontObfuscate;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: PluginDetail.kt */
public final class PluginDetail extends CommentableItem {
    public static final Parcelable.Creator<PluginDetail> CREATOR = new C5008a();
    private final int commentCount;
    private final String description;
    private final String descriptionTranslated;
    private final String developerName;
    private final String downloadLink;
    private final String iconUrl;

    /* renamed from: id */
    private final int f12591id;
    private final String language;
    private final String name;
    private final String nameTranslated;
    private final String packageName;
    private final int starCount;
    private final boolean starred;
    private final long timestamp;
    private final String translationLanguage;
    private final int userId;
    private final String userImage;
    private final String username;
    private final String website;

    /* renamed from: com.arlosoft.macrodroid.plugins.data.PluginDetail$a */
    /* compiled from: PluginDetail.kt */
    public static final class C5008a implements Parcelable.Creator<PluginDetail> {
        /* renamed from: a */
        public final PluginDetail createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new PluginDetail(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final PluginDetail[] newArray(int i) {
            return new PluginDetail[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PluginDetail(int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, long r37, int r39, int r40, int r41, java.lang.String r42, java.lang.String r43, boolean r44, int r45, kotlin.jvm.internal.C13695i r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r27
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r29
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = ""
            r9 = r1
            goto L_0x001d
        L_0x001b:
            r9 = r30
        L_0x001d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0028
            long r1 = java.lang.System.currentTimeMillis()
            r16 = r1
            goto L_0x002a
        L_0x0028:
            r16 = r37
        L_0x002a:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 == 0) goto L_0x0032
            r18 = 0
            goto L_0x0034
        L_0x0032:
            r18 = r39
        L_0x0034:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x003b
            r19 = 0
            goto L_0x003d
        L_0x003b:
            r19 = r40
        L_0x003d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0046
            r20 = 0
            goto L_0x0048
        L_0x0046:
            r20 = r41
        L_0x0048:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0050
            r23 = 0
            goto L_0x0052
        L_0x0050:
            r23 = r44
        L_0x0052:
            r3 = r24
            r4 = r25
            r5 = r26
            r7 = r28
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r21 = r42
            r22 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.plugins.data.PluginDetail.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.i):void");
    }

    public static /* synthetic */ PluginDetail copy$default(PluginDetail pluginDetail, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, int i2, int i3, int i4, String str12, String str13, boolean z, int i5, Object obj) {
        PluginDetail pluginDetail2 = pluginDetail;
        int i6 = i5;
        return pluginDetail.copy((i6 & 1) != 0 ? pluginDetail2.f12591id : i, (i6 & 2) != 0 ? pluginDetail2.name : str, (i6 & 4) != 0 ? pluginDetail2.nameTranslated : str2, (i6 & 8) != 0 ? pluginDetail2.description : str3, (i6 & 16) != 0 ? pluginDetail2.descriptionTranslated : str4, (i6 & 32) != 0 ? pluginDetail2.translationLanguage : str5, (i6 & 64) != 0 ? pluginDetail2.language : str6, (i6 & 128) != 0 ? pluginDetail2.packageName : str7, (i6 & 256) != 0 ? pluginDetail2.developerName : str8, (i6 & 512) != 0 ? pluginDetail2.iconUrl : str9, (i6 & 1024) != 0 ? pluginDetail2.website : str10, (i6 & 2048) != 0 ? pluginDetail2.downloadLink : str11, (i6 & 4096) != 0 ? pluginDetail2.timestamp : j, (i6 & 8192) != 0 ? pluginDetail2.userId : i2, (i6 & 16384) != 0 ? pluginDetail2.commentCount : i3, (i6 & 32768) != 0 ? pluginDetail2.starCount : i4, (i6 & 65536) != 0 ? pluginDetail2.username : str12, (i6 & 131072) != 0 ? pluginDetail2.userImage : str13, (i6 & 262144) != 0 ? pluginDetail2.starred : z);
    }

    public final int component1() {
        return this.f12591id;
    }

    public final String component10() {
        return this.iconUrl;
    }

    public final String component11() {
        return this.website;
    }

    public final String component12() {
        return this.downloadLink;
    }

    public final long component13() {
        return this.timestamp;
    }

    public final int component14() {
        return this.userId;
    }

    public final int component15() {
        return this.commentCount;
    }

    public final int component16() {
        return this.starCount;
    }

    public final String component17() {
        return this.username;
    }

    public final String component18() {
        return this.userImage;
    }

    public final boolean component19() {
        return this.starred;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.nameTranslated;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.descriptionTranslated;
    }

    public final String component6() {
        return this.translationLanguage;
    }

    public final String component7() {
        return this.language;
    }

    public final String component8() {
        return this.packageName;
    }

    public final String component9() {
        return this.developerName;
    }

    public final PluginDetail copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, int i2, int i3, int i4, String str12, String str13, boolean z) {
        int i5 = i;
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str3, "description");
        C13706o.m87929f(str5, "translationLanguage");
        C13706o.m87929f(str6, "language");
        C13706o.m87929f(str7, "packageName");
        C13706o.m87929f(str8, "developerName");
        C13706o.m87929f(str9, "iconUrl");
        C13706o.m87929f(str10, "website");
        C13706o.m87929f(str11, "downloadLink");
        C13706o.m87929f(str12, "username");
        C13706o.m87929f(str13, "userImage");
        return new PluginDetail(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j, i2, i3, i4, str12, str13, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginDetail)) {
            return false;
        }
        PluginDetail pluginDetail = (PluginDetail) obj;
        return this.f12591id == pluginDetail.f12591id && C13706o.m87924a(this.name, pluginDetail.name) && C13706o.m87924a(this.nameTranslated, pluginDetail.nameTranslated) && C13706o.m87924a(this.description, pluginDetail.description) && C13706o.m87924a(this.descriptionTranslated, pluginDetail.descriptionTranslated) && C13706o.m87924a(this.translationLanguage, pluginDetail.translationLanguage) && C13706o.m87924a(this.language, pluginDetail.language) && C13706o.m87924a(this.packageName, pluginDetail.packageName) && C13706o.m87924a(this.developerName, pluginDetail.developerName) && C13706o.m87924a(this.iconUrl, pluginDetail.iconUrl) && C13706o.m87924a(this.website, pluginDetail.website) && C13706o.m87924a(this.downloadLink, pluginDetail.downloadLink) && this.timestamp == pluginDetail.timestamp && this.userId == pluginDetail.userId && this.commentCount == pluginDetail.commentCount && this.starCount == pluginDetail.starCount && C13706o.m87924a(this.username, pluginDetail.username) && C13706o.m87924a(this.userImage, pluginDetail.userImage) && this.starred == pluginDetail.starred;
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionTranslated() {
        return this.descriptionTranslated;
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

    public final int getId() {
        return this.f12591id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameTranslated() {
        return this.nameTranslated;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getStarCount() {
        return this.starCount;
    }

    public final boolean getStarred() {
        return this.starred;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getTranslationLanguage() {
        return this.translationLanguage;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUserImage() {
        return this.userImage;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getWebsite() {
        return this.website;
    }

    public int hashCode() {
        int hashCode = ((this.f12591id * 31) + this.name.hashCode()) * 31;
        String str = this.nameTranslated;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.description.hashCode()) * 31;
        String str2 = this.descriptionTranslated;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode3 = (((((((((((((((((((((((((((hashCode2 + i) * 31) + this.translationLanguage.hashCode()) * 31) + this.language.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.developerName.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.website.hashCode()) * 31) + this.downloadLink.hashCode()) * 31) + C1405a.m633a(this.timestamp)) * 31) + this.userId) * 31) + this.commentCount) * 31) + this.starCount) * 31) + this.username.hashCode()) * 31) + this.userImage.hashCode()) * 31;
        boolean z = this.starred;
        if (z) {
            z = true;
        }
        return hashCode3 + (z ? 1 : 0);
    }

    public String toString() {
        return "PluginDetail(id=" + this.f12591id + ", name=" + this.name + ", nameTranslated=" + this.nameTranslated + ", description=" + this.description + ", descriptionTranslated=" + this.descriptionTranslated + ", translationLanguage=" + this.translationLanguage + ", language=" + this.language + ", packageName=" + this.packageName + ", developerName=" + this.developerName + ", iconUrl=" + this.iconUrl + ", website=" + this.website + ", downloadLink=" + this.downloadLink + ", timestamp=" + this.timestamp + ", userId=" + this.userId + ", commentCount=" + this.commentCount + ", starCount=" + this.starCount + ", username=" + this.username + ", userImage=" + this.userImage + ", starred=" + this.starred + ')';
    }

    public final PluginDetail updateCommentCount(boolean z) {
        int i = this.f12591id;
        String str = this.name;
        String str2 = this.nameTranslated;
        String str3 = this.description;
        String str4 = this.descriptionTranslated;
        String str5 = this.translationLanguage;
        String str6 = this.language;
        String str7 = this.packageName;
        String str8 = this.developerName;
        String str9 = this.iconUrl;
        String str10 = this.website;
        String str11 = this.downloadLink;
        long j = this.timestamp;
        int i2 = this.userId;
        int i3 = this.commentCount;
        return new PluginDetail(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j, i2, z ? i3 + 1 : i3 - 1, this.starCount, this.username, this.userImage, this.starred);
    }

    public final PluginDetail updateStarRating(boolean z) {
        int i = this.f12591id;
        String str = this.name;
        String str2 = this.nameTranslated;
        String str3 = this.description;
        String str4 = this.descriptionTranslated;
        String str5 = this.translationLanguage;
        String str6 = this.language;
        String str7 = this.packageName;
        String str8 = this.developerName;
        String str9 = this.iconUrl;
        String str10 = this.website;
        String str11 = this.downloadLink;
        long j = this.timestamp;
        int i2 = this.userId;
        long j2 = j;
        int i3 = this.commentCount;
        int i4 = this.starCount;
        return new PluginDetail(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j2, i2, i3, z ? i4 + 1 : i4 - 1, this.username, this.userImage, z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeInt(this.f12591id);
        parcel.writeString(this.name);
        parcel.writeString(this.nameTranslated);
        parcel.writeString(this.description);
        parcel.writeString(this.descriptionTranslated);
        parcel.writeString(this.translationLanguage);
        parcel.writeString(this.language);
        parcel.writeString(this.packageName);
        parcel.writeString(this.developerName);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.website);
        parcel.writeString(this.downloadLink);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.commentCount);
        parcel.writeInt(this.starCount);
        parcel.writeString(this.username);
        parcel.writeString(this.userImage);
        parcel.writeInt(this.starred ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PluginDetail(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, int r28, int r29, int r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r17
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r31
            r11 = r32
            java.lang.String r12 = "name"
            kotlin.jvm.internal.C13706o.m87929f(r15, r12)
            java.lang.String r12 = "description"
            kotlin.jvm.internal.C13706o.m87929f(r2, r12)
            java.lang.String r12 = "translationLanguage"
            kotlin.jvm.internal.C13706o.m87929f(r3, r12)
            java.lang.String r12 = "language"
            kotlin.jvm.internal.C13706o.m87929f(r4, r12)
            java.lang.String r12 = "packageName"
            kotlin.jvm.internal.C13706o.m87929f(r5, r12)
            java.lang.String r12 = "developerName"
            kotlin.jvm.internal.C13706o.m87929f(r6, r12)
            java.lang.String r12 = "iconUrl"
            kotlin.jvm.internal.C13706o.m87929f(r7, r12)
            java.lang.String r12 = "website"
            kotlin.jvm.internal.C13706o.m87929f(r8, r12)
            java.lang.String r12 = "downloadLink"
            kotlin.jvm.internal.C13706o.m87929f(r9, r12)
            java.lang.String r12 = "username"
            kotlin.jvm.internal.C13706o.m87929f(r10, r12)
            java.lang.String r12 = "userImage"
            kotlin.jvm.internal.C13706o.m87929f(r11, r12)
            r13.<init>(r10)
            r12 = r14
            r0.f12591id = r12
            r0.name = r1
            r1 = r16
            r0.nameTranslated = r1
            r0.description = r2
            r1 = r18
            r0.descriptionTranslated = r1
            r0.translationLanguage = r3
            r0.language = r4
            r0.packageName = r5
            r0.developerName = r6
            r0.iconUrl = r7
            r0.website = r8
            r0.downloadLink = r9
            r1 = r26
            r0.timestamp = r1
            r1 = r28
            r0.userId = r1
            r1 = r29
            r0.commentCount = r1
            r1 = r30
            r0.starCount = r1
            r0.username = r10
            r0.userImage = r11
            r1 = r33
            r0.starred = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.plugins.data.PluginDetail.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.String, java.lang.String, boolean):void");
    }
}
