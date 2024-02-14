package com.arlosoft.macrodroid.templatestore.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.comments.CommentableItem;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

@DontObfuscate
/* compiled from: MacroTemplate.kt */
public final class MacroTemplate extends CommentableItem {
    public static final Parcelable.Creator<MacroTemplate> CREATOR = new C5223a();
    private final int categoryId;
    private final int commentCount;
    private boolean deleted;
    private final String description;
    private final String descriptionTranslated;
    private final int flagCount;

    /* renamed from: id */
    private final int f13052id;
    private final String json;
    private final String language;
    private Macro macro;
    private final String name;
    private final String nameTranslated;
    private final int rootOnlyVersion;
    private final int starCount;
    private final boolean starred;
    private final long timestamp;
    private final String translationLanguage;
    private final long updated;
    private boolean useTranslatedText;
    private final int userId;
    private final String userImage;
    private final String username;

    /* renamed from: com.arlosoft.macrodroid.templatestore.model.MacroTemplate$a */
    /* compiled from: MacroTemplate.kt */
    public static final class C5223a implements Parcelable.Creator<MacroTemplate> {
        /* renamed from: a */
        public final MacroTemplate createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C13706o.m87929f(parcel2, "parcel");
            return new MacroTemplate(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, (Macro) parcel2.readParcelable(MacroTemplate.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readLong());
        }

        /* renamed from: b */
        public final MacroTemplate[] newArray(int i) {
            return new MacroTemplate[i];
        }
    }

    public MacroTemplate() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, 0, 0, 0, 0, 0, false, (Macro) null, false, false, 0, 0, 4194303, (C13695i) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MacroTemplate(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, long r34, java.lang.String r36, int r37, int r38, int r39, int r40, int r41, boolean r42, com.arlosoft.macrodroid.macro.Macro r43, boolean r44, boolean r45, int r46, long r47, int r49, kotlin.jvm.internal.C13695i r50) {
        /*
            r24 = this;
            r0 = r49
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r25
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = 0
            goto L_0x0014
        L_0x0012:
            r3 = r26
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = r2
            goto L_0x001c
        L_0x001a:
            r5 = r27
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = r2
            goto L_0x0024
        L_0x0022:
            r6 = r28
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r29
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = r2
            goto L_0x0034
        L_0x0032:
            r8 = r30
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r31
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r2
            goto L_0x0044
        L_0x0042:
            r10 = r32
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = 0
            goto L_0x004c
        L_0x004a:
            r11 = r33
        L_0x004c:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0055
            long r13 = java.lang.System.currentTimeMillis()
            goto L_0x0057
        L_0x0055:
            r13 = r34
        L_0x0057:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r2 = r36
        L_0x005e:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0064
            r15 = 0
            goto L_0x0066
        L_0x0064:
            r15 = r37
        L_0x0066:
            r4 = r0 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x006c
            r4 = 0
            goto L_0x006e
        L_0x006c:
            r4 = r38
        L_0x006e:
            r12 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x0074
            r12 = 0
            goto L_0x0076
        L_0x0074:
            r12 = r39
        L_0x0076:
            r50 = r12
            r12 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x007e
            r12 = 0
            goto L_0x0080
        L_0x007e:
            r12 = r40
        L_0x0080:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x008a
            r16 = 0
            goto L_0x008c
        L_0x008a:
            r16 = r41
        L_0x008c:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0095
            r17 = 0
            goto L_0x0097
        L_0x0095:
            r17 = r42
        L_0x0097:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a0
            r18 = 0
            goto L_0x00a2
        L_0x00a0:
            r18 = r43
        L_0x00a2:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00ab
            r19 = 0
            goto L_0x00ad
        L_0x00ab:
            r19 = r44
        L_0x00ad:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b6
            r20 = 0
            goto L_0x00b8
        L_0x00b6:
            r20 = r45
        L_0x00b8:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00c1
            r21 = 0
            goto L_0x00c3
        L_0x00c1:
            r21 = r46
        L_0x00c3:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r22
            if (r0 == 0) goto L_0x00cc
            r22 = 0
            goto L_0x00ce
        L_0x00cc:
            r22 = r47
        L_0x00ce:
            r25 = r24
            r26 = r1
            r27 = r3
            r28 = r5
            r29 = r6
            r30 = r7
            r31 = r8
            r32 = r9
            r33 = r10
            r34 = r11
            r35 = r13
            r37 = r2
            r38 = r15
            r39 = r4
            r40 = r50
            r41 = r12
            r42 = r16
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.templatestore.model.MacroTemplate.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, int, int, int, int, int, boolean, com.arlosoft.macrodroid.macro.Macro, boolean, boolean, int, long, int, kotlin.jvm.internal.i):void");
    }

    public static /* synthetic */ MacroTemplate copy$default(MacroTemplate macroTemplate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, long j, String str9, int i2, int i3, int i4, int i5, int i6, boolean z, Macro macro2, boolean z2, boolean z3, int i7, long j2, int i8, Object obj) {
        MacroTemplate macroTemplate2 = macroTemplate;
        int i9 = i8;
        return macroTemplate.copy((i9 & 1) != 0 ? macroTemplate2.name : str, (i9 & 2) != 0 ? macroTemplate2.nameTranslated : str2, (i9 & 4) != 0 ? macroTemplate2.username : str3, (i9 & 8) != 0 ? macroTemplate2.description : str4, (i9 & 16) != 0 ? macroTemplate2.descriptionTranslated : str5, (i9 & 32) != 0 ? macroTemplate2.translationLanguage : str6, (i9 & 64) != 0 ? macroTemplate2.json : str7, (i9 & 128) != 0 ? macroTemplate2.language : str8, (i9 & 256) != 0 ? macroTemplate2.rootOnlyVersion : i, (i9 & 512) != 0 ? macroTemplate2.timestamp : j, (i9 & 1024) != 0 ? macroTemplate2.userImage : str9, (i9 & 2048) != 0 ? macroTemplate2.f13052id : i2, (i9 & 4096) != 0 ? macroTemplate2.userId : i3, (i9 & 8192) != 0 ? macroTemplate2.flagCount : i4, (i9 & 16384) != 0 ? macroTemplate2.commentCount : i5, (i9 & 32768) != 0 ? macroTemplate2.starCount : i6, (i9 & 65536) != 0 ? macroTemplate2.starred : z, (i9 & 131072) != 0 ? macroTemplate2.macro : macro2, (i9 & 262144) != 0 ? macroTemplate2.deleted : z2, (i9 & 524288) != 0 ? macroTemplate2.useTranslatedText : z3, (i9 & 1048576) != 0 ? macroTemplate2.categoryId : i7, (i9 & 2097152) != 0 ? macroTemplate2.updated : j2);
    }

    public final MacroTemplate clearJsonData() {
        return new MacroTemplate(this.name, this.nameTranslated, this.username, this.description, this.descriptionTranslated, this.translationLanguage, "", this.language, this.rootOnlyVersion, this.timestamp, this.userImage, this.f13052id, this.userId, this.flagCount, this.commentCount, this.starCount, this.starred, this.macro, this.deleted, this.useTranslatedText, 0, 0, 3145728, (C13695i) null);
    }

    public final String component1() {
        return this.name;
    }

    public final long component10() {
        return this.timestamp;
    }

    public final String component11() {
        return this.userImage;
    }

    public final int component12() {
        return this.f13052id;
    }

    public final int component13() {
        return this.userId;
    }

    public final int component14() {
        return this.flagCount;
    }

    public final int component15() {
        return this.commentCount;
    }

    public final int component16() {
        return this.starCount;
    }

    public final boolean component17() {
        return this.starred;
    }

    public final Macro component18() {
        return this.macro;
    }

    public final boolean component19() {
        return this.deleted;
    }

    public final String component2() {
        return this.nameTranslated;
    }

    public final boolean component20() {
        return this.useTranslatedText;
    }

    public final int component21() {
        return this.categoryId;
    }

    public final long component22() {
        return this.updated;
    }

    public final String component3() {
        return this.username;
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
        return this.json;
    }

    public final String component8() {
        return this.language;
    }

    public final int component9() {
        return this.rootOnlyVersion;
    }

    public final MacroTemplate copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, long j, String str9, int i2, int i3, int i4, int i5, int i6, boolean z, Macro macro2, boolean z2, boolean z3, int i7, long j2) {
        String str10 = str;
        C13706o.m87929f(str10, "name");
        C13706o.m87929f(str3, "username");
        C13706o.m87929f(str4, "description");
        C13706o.m87929f(str6, "translationLanguage");
        C13706o.m87929f(str7, "json");
        C13706o.m87929f(str8, "language");
        C13706o.m87929f(str9, "userImage");
        return new MacroTemplate(str10, str2, str3, str4, str5, str6, str7, str8, i, j, str9, i2, i3, i4, i5, i6, z, macro2, z2, z3, i7, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MacroTemplate)) {
            return false;
        }
        MacroTemplate macroTemplate = (MacroTemplate) obj;
        return C13706o.m87924a(this.name, macroTemplate.name) && C13706o.m87924a(this.nameTranslated, macroTemplate.nameTranslated) && C13706o.m87924a(this.username, macroTemplate.username) && C13706o.m87924a(this.description, macroTemplate.description) && C13706o.m87924a(this.descriptionTranslated, macroTemplate.descriptionTranslated) && C13706o.m87924a(this.translationLanguage, macroTemplate.translationLanguage) && C13706o.m87924a(this.json, macroTemplate.json) && C13706o.m87924a(this.language, macroTemplate.language) && this.rootOnlyVersion == macroTemplate.rootOnlyVersion && this.timestamp == macroTemplate.timestamp && C13706o.m87924a(this.userImage, macroTemplate.userImage) && this.f13052id == macroTemplate.f13052id && this.userId == macroTemplate.userId && this.flagCount == macroTemplate.flagCount && this.commentCount == macroTemplate.commentCount && this.starCount == macroTemplate.starCount && this.starred == macroTemplate.starred && C13706o.m87924a(this.macro, macroTemplate.macro) && this.deleted == macroTemplate.deleted && this.useTranslatedText == macroTemplate.useTranslatedText && this.categoryId == macroTemplate.categoryId && this.updated == macroTemplate.updated;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionTranslated() {
        return this.descriptionTranslated;
    }

    public final int getFlagCount() {
        return this.flagCount;
    }

    public final int getId() {
        return this.f13052id;
    }

    public final String getJson() {
        return this.json;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Macro getMacro() {
        return this.macro;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNameToDisplay() {
        String str = this.nameTranslated;
        return str == null || str.length() == 0 ? this.name : this.nameTranslated;
    }

    public final String getNameTranslated() {
        return this.nameTranslated;
    }

    public final int getRootOnlyVersion() {
        return this.rootOnlyVersion;
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

    public final long getUpdated() {
        return this.updated;
    }

    public final boolean getUseTranslatedText() {
        return this.useTranslatedText;
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

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.nameTranslated;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.username.hashCode()) * 31) + this.description.hashCode()) * 31;
        String str2 = this.descriptionTranslated;
        int hashCode3 = (((((((((((((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.translationLanguage.hashCode()) * 31) + this.json.hashCode()) * 31) + this.language.hashCode()) * 31) + this.rootOnlyVersion) * 31) + C1405a.m633a(this.timestamp)) * 31) + this.userImage.hashCode()) * 31) + this.f13052id) * 31) + this.userId) * 31) + this.flagCount) * 31) + this.commentCount) * 31) + this.starCount) * 31;
        boolean z = this.starred;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        Macro macro2 = this.macro;
        if (macro2 != null) {
            i = macro2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.deleted;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.useTranslatedText;
        if (!z4) {
            z2 = z4;
        }
        return ((((i4 + (z2 ? 1 : 0)) * 31) + this.categoryId) * 31) + C1405a.m633a(this.updated);
    }

    public final void setDeleted(boolean z) {
        this.deleted = z;
    }

    public final MacroTemplate setFlagCount(int i) {
        return new MacroTemplate(this.name, this.nameTranslated, this.username, this.description, this.descriptionTranslated, this.translationLanguage, this.json, this.language, this.rootOnlyVersion, this.timestamp, this.userImage, this.f13052id, this.userId, i, this.commentCount, this.starCount, this.starred, this.macro, this.deleted, this.useTranslatedText, 0, 0, 3145728, (C13695i) null);
    }

    public final void setMacro(Macro macro2) {
        this.macro = macro2;
    }

    public final MacroTemplate setUseTranslated(boolean z) {
        return new MacroTemplate(this.name, this.nameTranslated, this.username, this.description, this.descriptionTranslated, this.translationLanguage, this.json, this.language, this.rootOnlyVersion, this.timestamp, this.userImage, this.f13052id, this.userId, this.flagCount, this.commentCount, this.starCount, this.starred, this.macro, this.deleted, z, 0, 0, 3145728, (C13695i) null);
    }

    public final void setUseTranslatedText(boolean z) {
        this.useTranslatedText = z;
    }

    public String toString() {
        return "MacroTemplate(name=" + this.name + ", nameTranslated=" + this.nameTranslated + ", username=" + this.username + ", description=" + this.description + ", descriptionTranslated=" + this.descriptionTranslated + ", translationLanguage=" + this.translationLanguage + ", json=" + this.json + ", language=" + this.language + ", rootOnlyVersion=" + this.rootOnlyVersion + ", timestamp=" + this.timestamp + ", userImage=" + this.userImage + ", id=" + this.f13052id + ", userId=" + this.userId + ", flagCount=" + this.flagCount + ", commentCount=" + this.commentCount + ", starCount=" + this.starCount + ", starred=" + this.starred + ", macro=" + this.macro + ", deleted=" + this.deleted + ", useTranslatedText=" + this.useTranslatedText + ", categoryId=" + this.categoryId + ", updated=" + this.updated + ')';
    }

    public final MacroTemplate updateCommentCount(boolean z) {
        String str = this.name;
        String str2 = this.nameTranslated;
        String str3 = this.username;
        String str4 = this.description;
        String str5 = this.descriptionTranslated;
        String str6 = this.translationLanguage;
        String str7 = this.json;
        String str8 = this.language;
        int i = this.rootOnlyVersion;
        long j = this.timestamp;
        String str9 = this.userImage;
        int i2 = this.f13052id;
        int i3 = this.userId;
        int i4 = this.flagCount;
        int i5 = this.commentCount;
        return new MacroTemplate(str, str2, str3, str4, str5, str6, str7, str8, i, j, str9, i2, i3, i4, z ? i5 + 1 : i5 - 1, this.starCount, this.starred, this.macro, this.deleted, this.useTranslatedText, 0, 0, 3145728, (C13695i) null);
    }

    public final MacroTemplate updateDescription(String str) {
        C13706o.m87929f(str, "descriptionText");
        return new MacroTemplate(this.name, this.nameTranslated, this.username, str, str, this.translationLanguage, this.json, this.language, this.rootOnlyVersion, this.timestamp, this.userImage, this.f13052id, this.userId, this.flagCount, this.commentCount, this.starCount, this.starred, this.macro, this.deleted, this.useTranslatedText, 0, 0, 3145728, (C13695i) null);
    }

    public final MacroTemplate updateName(String str) {
        C13706o.m87929f(str, "name");
        return new MacroTemplate(str, str, this.username, this.description, this.descriptionTranslated, this.translationLanguage, this.json, this.language, this.rootOnlyVersion, this.timestamp, this.userImage, this.f13052id, this.userId, this.flagCount, this.commentCount, this.starCount, this.starred, this.macro, this.deleted, this.useTranslatedText, 0, 0, 3145728, (C13695i) null);
    }

    public final MacroTemplate updateStarRating(boolean z) {
        String str = this.name;
        String str2 = this.nameTranslated;
        String str3 = this.username;
        String str4 = this.description;
        String str5 = this.descriptionTranslated;
        String str6 = this.translationLanguage;
        String str7 = this.json;
        String str8 = this.language;
        int i = this.rootOnlyVersion;
        long j = this.timestamp;
        String str9 = this.userImage;
        int i2 = this.f13052id;
        int i3 = this.userId;
        int i4 = this.flagCount;
        int i5 = i3;
        int i6 = this.commentCount;
        int i7 = i4;
        int i8 = this.starCount;
        return new MacroTemplate(str, str2, str3, str4, str5, str6, str7, str8, i, j, str9, i2, i5, i7, i6, z ? i8 + 1 : i8 - 1, z, this.macro, this.deleted, this.useTranslatedText, 0, 0, 3145728, (C13695i) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.nameTranslated);
        parcel.writeString(this.username);
        parcel.writeString(this.description);
        parcel.writeString(this.descriptionTranslated);
        parcel.writeString(this.translationLanguage);
        parcel.writeString(this.json);
        parcel.writeString(this.language);
        parcel.writeInt(this.rootOnlyVersion);
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.userImage);
        parcel.writeInt(this.f13052id);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.flagCount);
        parcel.writeInt(this.commentCount);
        parcel.writeInt(this.starCount);
        parcel.writeInt(this.starred ? 1 : 0);
        parcel.writeParcelable(this.macro, i);
        parcel.writeInt(this.deleted ? 1 : 0);
        parcel.writeInt(this.useTranslatedText ? 1 : 0);
        parcel.writeInt(this.categoryId);
        parcel.writeLong(this.updated);
    }

    public final MacroTemplate setDeleted() {
        return new MacroTemplate(this.name, this.nameTranslated, this.username, this.description, this.descriptionTranslated, this.translationLanguage, this.json, this.language, this.rootOnlyVersion, this.timestamp, this.userImage, this.f13052id, this.userId, this.flagCount, this.commentCount, this.starCount, this.starred, this.macro, true, this.useTranslatedText, 0, 0, 3145728, (C13695i) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MacroTemplate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, long j, String str9, int i2, int i3, int i4, int i5, int i6, boolean z, Macro macro2, boolean z2, boolean z3, int i7, long j2) {
        super(str3);
        String str10 = str7;
        String str11 = str8;
        String str12 = str9;
        C13706o.m87929f(str, "name");
        C13706o.m87929f(str3, "username");
        C13706o.m87929f(str4, "description");
        C13706o.m87929f(str6, "translationLanguage");
        C13706o.m87929f(str10, "json");
        C13706o.m87929f(str11, "language");
        C13706o.m87929f(str12, "userImage");
        this.name = str;
        this.nameTranslated = str2;
        this.username = str3;
        this.description = str4;
        this.descriptionTranslated = str5;
        this.translationLanguage = str6;
        this.json = str10;
        this.language = str11;
        this.rootOnlyVersion = i;
        this.timestamp = j;
        this.userImage = str12;
        this.f13052id = i2;
        this.userId = i3;
        this.flagCount = i4;
        this.commentCount = i5;
        this.starCount = i6;
        this.starred = z;
        this.macro = macro2;
        this.deleted = z2;
        this.useTranslatedText = z3;
        this.categoryId = i7;
        this.updated = j2;
    }
}
