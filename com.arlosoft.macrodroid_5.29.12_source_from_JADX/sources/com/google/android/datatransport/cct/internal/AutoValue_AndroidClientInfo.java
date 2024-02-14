package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;

final class AutoValue_AndroidClientInfo extends AndroidClientInfo {

    /* renamed from: a */
    private final Integer f1173a;

    /* renamed from: b */
    private final String f1174b;

    /* renamed from: c */
    private final String f1175c;

    /* renamed from: d */
    private final String f1176d;

    /* renamed from: e */
    private final String f1177e;

    /* renamed from: f */
    private final String f1178f;

    /* renamed from: g */
    private final String f1179g;

    /* renamed from: h */
    private final String f1180h;

    /* renamed from: i */
    private final String f1181i;

    /* renamed from: j */
    private final String f1182j;

    /* renamed from: k */
    private final String f1183k;

    /* renamed from: l */
    private final String f1184l;

    static final class Builder extends AndroidClientInfo.Builder {

        /* renamed from: a */
        private Integer f1185a;

        /* renamed from: b */
        private String f1186b;

        /* renamed from: c */
        private String f1187c;

        /* renamed from: d */
        private String f1188d;

        /* renamed from: e */
        private String f1189e;

        /* renamed from: f */
        private String f1190f;

        /* renamed from: g */
        private String f1191g;

        /* renamed from: h */
        private String f1192h;

        /* renamed from: i */
        private String f1193i;

        /* renamed from: j */
        private String f1194j;

        /* renamed from: k */
        private String f1195k;

        /* renamed from: l */
        private String f1196l;

        Builder() {
        }

        /* renamed from: a */
        public AndroidClientInfo mo19300a() {
            return new AutoValue_AndroidClientInfo(this.f1185a, this.f1186b, this.f1187c, this.f1188d, this.f1189e, this.f1190f, this.f1191g, this.f1192h, this.f1193i, this.f1194j, this.f1195k, this.f1196l);
        }

        /* renamed from: b */
        public AndroidClientInfo.Builder mo19301b(@Nullable String str) {
            this.f1196l = str;
            return this;
        }

        /* renamed from: c */
        public AndroidClientInfo.Builder mo19302c(@Nullable String str) {
            this.f1194j = str;
            return this;
        }

        /* renamed from: d */
        public AndroidClientInfo.Builder mo19303d(@Nullable String str) {
            this.f1188d = str;
            return this;
        }

        /* renamed from: e */
        public AndroidClientInfo.Builder mo19304e(@Nullable String str) {
            this.f1192h = str;
            return this;
        }

        /* renamed from: f */
        public AndroidClientInfo.Builder mo19305f(@Nullable String str) {
            this.f1187c = str;
            return this;
        }

        /* renamed from: g */
        public AndroidClientInfo.Builder mo19306g(@Nullable String str) {
            this.f1193i = str;
            return this;
        }

        /* renamed from: h */
        public AndroidClientInfo.Builder mo19307h(@Nullable String str) {
            this.f1191g = str;
            return this;
        }

        /* renamed from: i */
        public AndroidClientInfo.Builder mo19308i(@Nullable String str) {
            this.f1195k = str;
            return this;
        }

        /* renamed from: j */
        public AndroidClientInfo.Builder mo19309j(@Nullable String str) {
            this.f1186b = str;
            return this;
        }

        /* renamed from: k */
        public AndroidClientInfo.Builder mo19310k(@Nullable String str) {
            this.f1190f = str;
            return this;
        }

        /* renamed from: l */
        public AndroidClientInfo.Builder mo19311l(@Nullable String str) {
            this.f1189e = str;
            return this;
        }

        /* renamed from: m */
        public AndroidClientInfo.Builder mo19312m(@Nullable Integer num) {
            this.f1185a = num;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo19288b() {
        return this.f1184l;
    }

    @Nullable
    /* renamed from: c */
    public String mo19289c() {
        return this.f1182j;
    }

    @Nullable
    /* renamed from: d */
    public String mo19290d() {
        return this.f1176d;
    }

    @Nullable
    /* renamed from: e */
    public String mo19291e() {
        return this.f1180h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidClientInfo)) {
            return false;
        }
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        Integer num = this.f1173a;
        if (num != null ? num.equals(androidClientInfo.mo19299m()) : androidClientInfo.mo19299m() == null) {
            String str = this.f1174b;
            if (str != null ? str.equals(androidClientInfo.mo19296j()) : androidClientInfo.mo19296j() == null) {
                String str2 = this.f1175c;
                if (str2 != null ? str2.equals(androidClientInfo.mo19292f()) : androidClientInfo.mo19292f() == null) {
                    String str3 = this.f1176d;
                    if (str3 != null ? str3.equals(androidClientInfo.mo19290d()) : androidClientInfo.mo19290d() == null) {
                        String str4 = this.f1177e;
                        if (str4 != null ? str4.equals(androidClientInfo.mo19298l()) : androidClientInfo.mo19298l() == null) {
                            String str5 = this.f1178f;
                            if (str5 != null ? str5.equals(androidClientInfo.mo19297k()) : androidClientInfo.mo19297k() == null) {
                                String str6 = this.f1179g;
                                if (str6 != null ? str6.equals(androidClientInfo.mo19294h()) : androidClientInfo.mo19294h() == null) {
                                    String str7 = this.f1180h;
                                    if (str7 != null ? str7.equals(androidClientInfo.mo19291e()) : androidClientInfo.mo19291e() == null) {
                                        String str8 = this.f1181i;
                                        if (str8 != null ? str8.equals(androidClientInfo.mo19293g()) : androidClientInfo.mo19293g() == null) {
                                            String str9 = this.f1182j;
                                            if (str9 != null ? str9.equals(androidClientInfo.mo19289c()) : androidClientInfo.mo19289c() == null) {
                                                String str10 = this.f1183k;
                                                if (str10 != null ? str10.equals(androidClientInfo.mo19295i()) : androidClientInfo.mo19295i() == null) {
                                                    String str11 = this.f1184l;
                                                    if (str11 == null) {
                                                        if (androidClientInfo.mo19288b() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(androidClientInfo.mo19288b())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo19292f() {
        return this.f1175c;
    }

    @Nullable
    /* renamed from: g */
    public String mo19293g() {
        return this.f1181i;
    }

    @Nullable
    /* renamed from: h */
    public String mo19294h() {
        return this.f1179g;
    }

    public int hashCode() {
        Integer num = this.f1173a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f1174b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1175c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1176d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1177e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f1178f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f1179g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f1180h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f1181i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f1182j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f1183k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f1184l;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode11 ^ i;
    }

    @Nullable
    /* renamed from: i */
    public String mo19295i() {
        return this.f1183k;
    }

    @Nullable
    /* renamed from: j */
    public String mo19296j() {
        return this.f1174b;
    }

    @Nullable
    /* renamed from: k */
    public String mo19297k() {
        return this.f1178f;
    }

    @Nullable
    /* renamed from: l */
    public String mo19298l() {
        return this.f1177e;
    }

    @Nullable
    /* renamed from: m */
    public Integer mo19299m() {
        return this.f1173a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f1173a + ", model=" + this.f1174b + ", hardware=" + this.f1175c + ", device=" + this.f1176d + ", product=" + this.f1177e + ", osBuild=" + this.f1178f + ", manufacturer=" + this.f1179g + ", fingerprint=" + this.f1180h + ", locale=" + this.f1181i + ", country=" + this.f1182j + ", mccMnc=" + this.f1183k + ", applicationBuild=" + this.f1184l + "}";
    }

    private AutoValue_AndroidClientInfo(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.f1173a = num;
        this.f1174b = str;
        this.f1175c = str2;
        this.f1176d = str3;
        this.f1177e = str4;
        this.f1178f = str5;
        this.f1179g = str6;
        this.f1180h = str7;
        this.f1181i = str8;
        this.f1182j = str9;
        this.f1183k = str10;
        this.f1184l = str11;
    }
}
