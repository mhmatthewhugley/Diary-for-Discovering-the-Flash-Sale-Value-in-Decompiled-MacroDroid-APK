package com.arlosoft.macrodroid.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.DontObfuscate;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@DontObfuscate
/* compiled from: HttpRequestAction.kt */
public final class HttpRequestConfig implements Parcelable {
    public static final int CONTENT_BODY_FILE = 1;
    public static final int CONTENT_BODY_TEXT = 0;
    public static final Parcelable.Creator<HttpRequestConfig> CREATOR = new C2483b();
    public static final C2482a Companion = new C2482a((C13695i) null);
    public static final int SAVE_RESPONSE_FILE = 2;
    public static final int SAVE_RESPONSE_NONE = 0;
    public static final int SAVE_RESPONSE_VARIABLE = 1;
    private final boolean allowAnyCertificate;
    private final boolean basicAuthEnabled;
    private final String basicAuthPassword;
    private final String basicAuthUsername;
    private final boolean blockNextAction;
    private final String contentBodyFileDisplayName;
    private final String contentBodyFileUri;
    private final int contentBodySource;
    private final String contentBodyText;
    private final String contentType;
    private final boolean followRedirects;
    private final List<HttpParam> headerParams;
    private final List<HttpParam> queryParams;
    private final int requestTimeOutSeconds;
    private final int requestType;
    private final DictionaryKeys responseDictionaryKeys;
    private final String responseVariableName;
    private final DictionaryKeys returnCodeDictionaryKeys;
    private final String returnCodeVariableName;
    private final String saveResponseFileName;
    private final String saveResponseFolderPathDisplayName;
    private final String saveResponseFolderPathUri;
    private final int saveResponseType;
    private final boolean saveReturnCodeToVariable;
    private final String urlToOpen;

    /* renamed from: com.arlosoft.macrodroid.action.HttpRequestConfig$a */
    /* compiled from: HttpRequestAction.kt */
    public static final class C2482a {
        private C2482a() {
        }

        public /* synthetic */ C2482a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.HttpRequestConfig$b */
    /* compiled from: HttpRequestAction.kt */
    public static final class C2483b implements Parcelable.Creator<HttpRequestConfig> {
        /* renamed from: a */
        public final HttpRequestConfig createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C13706o.m87929f(parcel2, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString6 = parcel.readString();
            DictionaryKeys dictionaryKeys = (DictionaryKeys) parcel2.readParcelable(HttpRequestConfig.class.getClassLoader());
            int readInt4 = parcel.readInt();
            String readString7 = parcel.readString();
            DictionaryKeys dictionaryKeys2 = (DictionaryKeys) parcel2.readParcelable(HttpRequestConfig.class.getClassLoader());
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            int readInt5 = parcel.readInt();
            String str = readString7;
            ArrayList arrayList = new ArrayList(readInt5);
            int i = 0;
            while (i != readInt5) {
                arrayList.add(HttpParam.CREATOR.createFromParcel(parcel2));
                i++;
                readInt5 = readInt5;
            }
            int readInt6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt6);
            ArrayList arrayList3 = arrayList;
            int i2 = 0;
            while (i2 != readInt6) {
                arrayList2.add(HttpParam.CREATOR.createFromParcel(parcel2));
                i2++;
                readInt6 = readInt6;
            }
            return new HttpRequestConfig(readInt, readString, readInt2, readString2, readInt3, readString3, readString4, readString5, z, readString6, dictionaryKeys, readInt4, str, dictionaryKeys2, readString8, readString9, readString10, z2, z3, z4, z5, readString11, readString12, arrayList3, arrayList2);
        }

        /* renamed from: b */
        public final HttpRequestConfig[] newArray(int i) {
            return new HttpRequestConfig[i];
        }
    }

    public HttpRequestConfig() {
        this(0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554431, (C13695i) null);
    }

    public HttpRequestConfig(int i, String str, int i2, String str2, int i3, String str3, String str4, String str5, boolean z, String str6, DictionaryKeys dictionaryKeys, int i4, String str7, DictionaryKeys dictionaryKeys2, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, boolean z5, String str11, String str12, List<HttpParam> list, List<HttpParam> list2) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        String str21 = str11;
        String str22 = str12;
        List<HttpParam> list3 = list;
        List<HttpParam> list4 = list2;
        C13706o.m87929f(str13, "urlToOpen");
        C13706o.m87929f(str14, "contentType");
        C13706o.m87929f(str15, "contentBodyText");
        C13706o.m87929f(str16, "contentBodyFileUri");
        C13706o.m87929f(str17, "contentBodyFileDisplayName");
        C13706o.m87929f(str18, "saveResponseFolderPathUri");
        C13706o.m87929f(str19, "saveResponseFolderPathDisplayName");
        C13706o.m87929f(str20, "saveResponseFileName");
        C13706o.m87929f(str21, "basicAuthUsername");
        C13706o.m87929f(str22, "basicAuthPassword");
        C13706o.m87929f(list3, "headerParams");
        C13706o.m87929f(list4, "queryParams");
        this.requestType = i;
        this.urlToOpen = str13;
        this.requestTimeOutSeconds = i2;
        this.contentType = str14;
        this.contentBodySource = i3;
        this.contentBodyText = str15;
        this.contentBodyFileUri = str16;
        this.contentBodyFileDisplayName = str17;
        this.saveReturnCodeToVariable = z;
        this.returnCodeVariableName = str6;
        this.returnCodeDictionaryKeys = dictionaryKeys;
        this.saveResponseType = i4;
        this.responseVariableName = str7;
        this.responseDictionaryKeys = dictionaryKeys2;
        this.saveResponseFolderPathUri = str18;
        this.saveResponseFolderPathDisplayName = str19;
        this.saveResponseFileName = str20;
        this.blockNextAction = z2;
        this.allowAnyCertificate = z3;
        this.followRedirects = z4;
        this.basicAuthEnabled = z5;
        this.basicAuthUsername = str21;
        this.basicAuthPassword = str22;
        this.headerParams = list3;
        this.queryParams = list4;
    }

    public static /* synthetic */ HttpRequestConfig copy$default(HttpRequestConfig httpRequestConfig, int i, String str, int i2, String str2, int i3, String str3, String str4, String str5, boolean z, String str6, DictionaryKeys dictionaryKeys, int i4, String str7, DictionaryKeys dictionaryKeys2, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, boolean z5, String str11, String str12, List list, List list2, int i5, Object obj) {
        HttpRequestConfig httpRequestConfig2 = httpRequestConfig;
        int i6 = i5;
        return httpRequestConfig.copy((i6 & 1) != 0 ? httpRequestConfig2.requestType : i, (i6 & 2) != 0 ? httpRequestConfig2.urlToOpen : str, (i6 & 4) != 0 ? httpRequestConfig2.requestTimeOutSeconds : i2, (i6 & 8) != 0 ? httpRequestConfig2.contentType : str2, (i6 & 16) != 0 ? httpRequestConfig2.contentBodySource : i3, (i6 & 32) != 0 ? httpRequestConfig2.contentBodyText : str3, (i6 & 64) != 0 ? httpRequestConfig2.contentBodyFileUri : str4, (i6 & 128) != 0 ? httpRequestConfig2.contentBodyFileDisplayName : str5, (i6 & 256) != 0 ? httpRequestConfig2.saveReturnCodeToVariable : z, (i6 & 512) != 0 ? httpRequestConfig2.returnCodeVariableName : str6, (i6 & 1024) != 0 ? httpRequestConfig2.returnCodeDictionaryKeys : dictionaryKeys, (i6 & 2048) != 0 ? httpRequestConfig2.saveResponseType : i4, (i6 & 4096) != 0 ? httpRequestConfig2.responseVariableName : str7, (i6 & 8192) != 0 ? httpRequestConfig2.responseDictionaryKeys : dictionaryKeys2, (i6 & 16384) != 0 ? httpRequestConfig2.saveResponseFolderPathUri : str8, (i6 & 32768) != 0 ? httpRequestConfig2.saveResponseFolderPathDisplayName : str9, (i6 & 65536) != 0 ? httpRequestConfig2.saveResponseFileName : str10, (i6 & 131072) != 0 ? httpRequestConfig2.blockNextAction : z2, (i6 & 262144) != 0 ? httpRequestConfig2.allowAnyCertificate : z3, (i6 & 524288) != 0 ? httpRequestConfig2.followRedirects : z4, (i6 & 1048576) != 0 ? httpRequestConfig2.basicAuthEnabled : z5, (i6 & 2097152) != 0 ? httpRequestConfig2.basicAuthUsername : str11, (i6 & 4194304) != 0 ? httpRequestConfig2.basicAuthPassword : str12, (i6 & 8388608) != 0 ? httpRequestConfig2.headerParams : list, (i6 & 16777216) != 0 ? httpRequestConfig2.queryParams : list2);
    }

    public final int component1() {
        return this.requestType;
    }

    public final String component10() {
        return this.returnCodeVariableName;
    }

    public final DictionaryKeys component11() {
        return this.returnCodeDictionaryKeys;
    }

    public final int component12() {
        return this.saveResponseType;
    }

    public final String component13() {
        return this.responseVariableName;
    }

    public final DictionaryKeys component14() {
        return this.responseDictionaryKeys;
    }

    public final String component15() {
        return this.saveResponseFolderPathUri;
    }

    public final String component16() {
        return this.saveResponseFolderPathDisplayName;
    }

    public final String component17() {
        return this.saveResponseFileName;
    }

    public final boolean component18() {
        return this.blockNextAction;
    }

    public final boolean component19() {
        return this.allowAnyCertificate;
    }

    public final String component2() {
        return this.urlToOpen;
    }

    public final boolean component20() {
        return this.followRedirects;
    }

    public final boolean component21() {
        return this.basicAuthEnabled;
    }

    public final String component22() {
        return this.basicAuthUsername;
    }

    public final String component23() {
        return this.basicAuthPassword;
    }

    public final List<HttpParam> component24() {
        return this.headerParams;
    }

    public final List<HttpParam> component25() {
        return this.queryParams;
    }

    public final int component3() {
        return this.requestTimeOutSeconds;
    }

    public final String component4() {
        return this.contentType;
    }

    public final int component5() {
        return this.contentBodySource;
    }

    public final String component6() {
        return this.contentBodyText;
    }

    public final String component7() {
        return this.contentBodyFileUri;
    }

    public final String component8() {
        return this.contentBodyFileDisplayName;
    }

    public final boolean component9() {
        return this.saveReturnCodeToVariable;
    }

    public final HttpRequestConfig copy(int i, String str, int i2, String str2, int i3, String str3, String str4, String str5, boolean z, String str6, DictionaryKeys dictionaryKeys, int i4, String str7, DictionaryKeys dictionaryKeys2, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, boolean z5, String str11, String str12, List<HttpParam> list, List<HttpParam> list2) {
        int i5 = i;
        C13706o.m87929f(str, "urlToOpen");
        C13706o.m87929f(str2, "contentType");
        C13706o.m87929f(str3, "contentBodyText");
        C13706o.m87929f(str4, "contentBodyFileUri");
        C13706o.m87929f(str5, "contentBodyFileDisplayName");
        C13706o.m87929f(str8, "saveResponseFolderPathUri");
        C13706o.m87929f(str9, "saveResponseFolderPathDisplayName");
        C13706o.m87929f(str10, "saveResponseFileName");
        C13706o.m87929f(str11, "basicAuthUsername");
        C13706o.m87929f(str12, "basicAuthPassword");
        C13706o.m87929f(list, "headerParams");
        C13706o.m87929f(list2, "queryParams");
        return new HttpRequestConfig(i, str, i2, str2, i3, str3, str4, str5, z, str6, dictionaryKeys, i4, str7, dictionaryKeys2, str8, str9, str10, z2, z3, z4, z5, str11, str12, list, list2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequestConfig)) {
            return false;
        }
        HttpRequestConfig httpRequestConfig = (HttpRequestConfig) obj;
        return this.requestType == httpRequestConfig.requestType && C13706o.m87924a(this.urlToOpen, httpRequestConfig.urlToOpen) && this.requestTimeOutSeconds == httpRequestConfig.requestTimeOutSeconds && C13706o.m87924a(this.contentType, httpRequestConfig.contentType) && this.contentBodySource == httpRequestConfig.contentBodySource && C13706o.m87924a(this.contentBodyText, httpRequestConfig.contentBodyText) && C13706o.m87924a(this.contentBodyFileUri, httpRequestConfig.contentBodyFileUri) && C13706o.m87924a(this.contentBodyFileDisplayName, httpRequestConfig.contentBodyFileDisplayName) && this.saveReturnCodeToVariable == httpRequestConfig.saveReturnCodeToVariable && C13706o.m87924a(this.returnCodeVariableName, httpRequestConfig.returnCodeVariableName) && C13706o.m87924a(this.returnCodeDictionaryKeys, httpRequestConfig.returnCodeDictionaryKeys) && this.saveResponseType == httpRequestConfig.saveResponseType && C13706o.m87924a(this.responseVariableName, httpRequestConfig.responseVariableName) && C13706o.m87924a(this.responseDictionaryKeys, httpRequestConfig.responseDictionaryKeys) && C13706o.m87924a(this.saveResponseFolderPathUri, httpRequestConfig.saveResponseFolderPathUri) && C13706o.m87924a(this.saveResponseFolderPathDisplayName, httpRequestConfig.saveResponseFolderPathDisplayName) && C13706o.m87924a(this.saveResponseFileName, httpRequestConfig.saveResponseFileName) && this.blockNextAction == httpRequestConfig.blockNextAction && this.allowAnyCertificate == httpRequestConfig.allowAnyCertificate && this.followRedirects == httpRequestConfig.followRedirects && this.basicAuthEnabled == httpRequestConfig.basicAuthEnabled && C13706o.m87924a(this.basicAuthUsername, httpRequestConfig.basicAuthUsername) && C13706o.m87924a(this.basicAuthPassword, httpRequestConfig.basicAuthPassword) && C13706o.m87924a(this.headerParams, httpRequestConfig.headerParams) && C13706o.m87924a(this.queryParams, httpRequestConfig.queryParams);
    }

    public final boolean getAllowAnyCertificate() {
        return this.allowAnyCertificate;
    }

    public final boolean getBasicAuthEnabled() {
        return this.basicAuthEnabled;
    }

    public final String getBasicAuthPassword() {
        return this.basicAuthPassword;
    }

    public final String getBasicAuthUsername() {
        return this.basicAuthUsername;
    }

    public final boolean getBlockNextAction() {
        return this.blockNextAction;
    }

    public final String getContentBodyFileDisplayName() {
        return this.contentBodyFileDisplayName;
    }

    public final String getContentBodyFileUri() {
        return this.contentBodyFileUri;
    }

    public final int getContentBodySource() {
        return this.contentBodySource;
    }

    public final String getContentBodyText() {
        return this.contentBodyText;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final List<HttpParam> getHeaderParams() {
        return this.headerParams;
    }

    public final List<HttpParam> getQueryParams() {
        return this.queryParams;
    }

    public final int getRequestTimeOutSeconds() {
        return this.requestTimeOutSeconds;
    }

    public final int getRequestType() {
        return this.requestType;
    }

    public final DictionaryKeys getResponseDictionaryKeys() {
        return this.responseDictionaryKeys;
    }

    public final String getResponseVariableName() {
        return this.responseVariableName;
    }

    public final DictionaryKeys getReturnCodeDictionaryKeys() {
        return this.returnCodeDictionaryKeys;
    }

    public final String getReturnCodeVariableName() {
        return this.returnCodeVariableName;
    }

    public final String getSaveResponseFileName() {
        return this.saveResponseFileName;
    }

    public final String getSaveResponseFolderPathDisplayName() {
        return this.saveResponseFolderPathDisplayName;
    }

    public final String getSaveResponseFolderPathUri() {
        return this.saveResponseFolderPathUri;
    }

    public final int getSaveResponseType() {
        return this.saveResponseType;
    }

    public final boolean getSaveReturnCodeToVariable() {
        return this.saveReturnCodeToVariable;
    }

    public final String getUrlToOpen() {
        return this.urlToOpen;
    }

    public final boolean hasBody() {
        int i = this.requestType;
        return i == 1 || i == 2 || i == 4 || i == 3;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.requestType * 31) + this.urlToOpen.hashCode()) * 31) + this.requestTimeOutSeconds) * 31) + this.contentType.hashCode()) * 31) + this.contentBodySource) * 31) + this.contentBodyText.hashCode()) * 31) + this.contentBodyFileUri.hashCode()) * 31) + this.contentBodyFileDisplayName.hashCode()) * 31;
        boolean z = this.saveReturnCodeToVariable;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.returnCodeVariableName;
        int i2 = 0;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        DictionaryKeys dictionaryKeys = this.returnCodeDictionaryKeys;
        int hashCode3 = (((hashCode2 + (dictionaryKeys == null ? 0 : dictionaryKeys.hashCode())) * 31) + this.saveResponseType) * 31;
        String str2 = this.responseVariableName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DictionaryKeys dictionaryKeys2 = this.responseDictionaryKeys;
        if (dictionaryKeys2 != null) {
            i2 = dictionaryKeys2.hashCode();
        }
        int hashCode5 = (((((((hashCode4 + i2) * 31) + this.saveResponseFolderPathUri.hashCode()) * 31) + this.saveResponseFolderPathDisplayName.hashCode()) * 31) + this.saveResponseFileName.hashCode()) * 31;
        boolean z3 = this.blockNextAction;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode5 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.allowAnyCertificate;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.followRedirects;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.basicAuthEnabled;
        if (!z6) {
            z2 = z6;
        }
        return ((((((((i5 + (z2 ? 1 : 0)) * 31) + this.basicAuthUsername.hashCode()) * 31) + this.basicAuthPassword.hashCode()) * 31) + this.headerParams.hashCode()) * 31) + this.queryParams.hashCode();
    }

    public String toString() {
        return "HttpRequestConfig(requestType=" + this.requestType + ", urlToOpen=" + this.urlToOpen + ", requestTimeOutSeconds=" + this.requestTimeOutSeconds + ", contentType=" + this.contentType + ", contentBodySource=" + this.contentBodySource + ", contentBodyText=" + this.contentBodyText + ", contentBodyFileUri=" + this.contentBodyFileUri + ", contentBodyFileDisplayName=" + this.contentBodyFileDisplayName + ", saveReturnCodeToVariable=" + this.saveReturnCodeToVariable + ", returnCodeVariableName=" + this.returnCodeVariableName + ", returnCodeDictionaryKeys=" + this.returnCodeDictionaryKeys + ", saveResponseType=" + this.saveResponseType + ", responseVariableName=" + this.responseVariableName + ", responseDictionaryKeys=" + this.responseDictionaryKeys + ", saveResponseFolderPathUri=" + this.saveResponseFolderPathUri + ", saveResponseFolderPathDisplayName=" + this.saveResponseFolderPathDisplayName + ", saveResponseFileName=" + this.saveResponseFileName + ", blockNextAction=" + this.blockNextAction + ", allowAnyCertificate=" + this.allowAnyCertificate + ", followRedirects=" + this.followRedirects + ", basicAuthEnabled=" + this.basicAuthEnabled + ", basicAuthUsername=" + this.basicAuthUsername + ", basicAuthPassword=" + this.basicAuthPassword + ", headerParams=" + this.headerParams + ", queryParams=" + this.queryParams + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        parcel.writeInt(this.requestType);
        parcel.writeString(this.urlToOpen);
        parcel.writeInt(this.requestTimeOutSeconds);
        parcel.writeString(this.contentType);
        parcel.writeInt(this.contentBodySource);
        parcel.writeString(this.contentBodyText);
        parcel.writeString(this.contentBodyFileUri);
        parcel.writeString(this.contentBodyFileDisplayName);
        parcel.writeInt(this.saveReturnCodeToVariable ? 1 : 0);
        parcel.writeString(this.returnCodeVariableName);
        parcel.writeParcelable(this.returnCodeDictionaryKeys, i);
        parcel.writeInt(this.saveResponseType);
        parcel.writeString(this.responseVariableName);
        parcel.writeParcelable(this.responseDictionaryKeys, i);
        parcel.writeString(this.saveResponseFolderPathUri);
        parcel.writeString(this.saveResponseFolderPathDisplayName);
        parcel.writeString(this.saveResponseFileName);
        parcel.writeInt(this.blockNextAction ? 1 : 0);
        parcel.writeInt(this.allowAnyCertificate ? 1 : 0);
        parcel.writeInt(this.followRedirects ? 1 : 0);
        parcel.writeInt(this.basicAuthEnabled ? 1 : 0);
        parcel.writeString(this.basicAuthUsername);
        parcel.writeString(this.basicAuthPassword);
        List<HttpParam> list = this.headerParams;
        parcel.writeInt(list.size());
        for (HttpParam writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<HttpParam> list2 = this.queryParams;
        parcel.writeInt(list2.size());
        for (HttpParam writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HttpRequestConfig(int r27, java.lang.String r28, int r29, java.lang.String r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, java.lang.String r36, com.arlosoft.macrodroid.variables.DictionaryKeys r37, int r38, java.lang.String r39, com.arlosoft.macrodroid.variables.DictionaryKeys r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, boolean r44, boolean r45, boolean r46, boolean r47, java.lang.String r48, java.lang.String r49, java.util.List r50, java.util.List r51, int r52, kotlin.jvm.internal.C13695i r53) {
        /*
            r26 = this;
            r0 = r52
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r27
        L_0x000a:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0012
            r3 = r4
            goto L_0x0014
        L_0x0012:
            r3 = r28
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001b
            r5 = 30
            goto L_0x001d
        L_0x001b:
            r5 = r29
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r4
            goto L_0x0025
        L_0x0023:
            r6 = r30
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002b
            r7 = 0
            goto L_0x002d
        L_0x002b:
            r7 = r31
        L_0x002d:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0033
            r8 = r4
            goto L_0x0035
        L_0x0033:
            r8 = r32
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = r4
            goto L_0x003d
        L_0x003b:
            r9 = r33
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0043
            r10 = r4
            goto L_0x0045
        L_0x0043:
            r10 = r34
        L_0x0045:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004b
            r11 = 0
            goto L_0x004d
        L_0x004b:
            r11 = r35
        L_0x004d:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0053
            r12 = 0
            goto L_0x0055
        L_0x0053:
            r12 = r36
        L_0x0055:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005b
            r14 = 0
            goto L_0x005d
        L_0x005b:
            r14 = r37
        L_0x005d:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0063
            r15 = 0
            goto L_0x0065
        L_0x0063:
            r15 = r38
        L_0x0065:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x006b
            r2 = 0
            goto L_0x006d
        L_0x006b:
            r2 = r39
        L_0x006d:
            r13 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x0073
            r13 = 0
            goto L_0x0075
        L_0x0073:
            r13 = r40
        L_0x0075:
            r27 = r4
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x007e
            r4 = r27
            goto L_0x0080
        L_0x007e:
            r4 = r41
        L_0x0080:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x008a
            r16 = r27
            goto L_0x008c
        L_0x008a:
            r16 = r42
        L_0x008c:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0095
            r17 = r27
            goto L_0x0097
        L_0x0095:
            r17 = r43
        L_0x0097:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00a0
            r18 = 0
            goto L_0x00a2
        L_0x00a0:
            r18 = r44
        L_0x00a2:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00ab
            r19 = 0
            goto L_0x00ad
        L_0x00ab:
            r19 = r45
        L_0x00ad:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b6
            r20 = 0
            goto L_0x00b8
        L_0x00b6:
            r20 = r46
        L_0x00b8:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00c1
            r21 = 0
            goto L_0x00c3
        L_0x00c1:
            r21 = r47
        L_0x00c3:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00cc
            r22 = r27
            goto L_0x00ce
        L_0x00cc:
            r22 = r48
        L_0x00ce:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d7
            r23 = r27
            goto L_0x00d9
        L_0x00d7:
            r23 = r49
        L_0x00d9:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00e5
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            goto L_0x00e7
        L_0x00e5:
            r24 = r50
        L_0x00e7:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00f3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x00f5
        L_0x00f3:
            r0 = r51
        L_0x00f5:
            r27 = r26
            r28 = r1
            r29 = r3
            r30 = r5
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r14
            r39 = r15
            r40 = r2
            r41 = r13
            r42 = r4
            r43 = r16
            r44 = r17
            r45 = r18
            r46 = r19
            r47 = r20
            r48 = r21
            r49 = r22
            r50 = r23
            r51 = r24
            r52 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.HttpRequestConfig.<init>(int, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.arlosoft.macrodroid.variables.DictionaryKeys, int, java.lang.String, com.arlosoft.macrodroid.variables.DictionaryKeys, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
