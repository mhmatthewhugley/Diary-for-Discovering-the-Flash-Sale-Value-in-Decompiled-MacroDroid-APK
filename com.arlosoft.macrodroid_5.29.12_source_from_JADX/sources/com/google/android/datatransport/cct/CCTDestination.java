package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class CCTDestination implements EncodedDestination {

    /* renamed from: c */
    static final String f1112c;

    /* renamed from: d */
    static final String f1113d;

    /* renamed from: e */
    private static final String f1114e;

    /* renamed from: f */
    private static final Set<Encoding> f1115f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding[]{Encoding.m954b("proto"), Encoding.m954b("json")})));

    /* renamed from: g */
    public static final CCTDestination f1116g;

    /* renamed from: h */
    public static final CCTDestination f1117h;
    @NonNull

    /* renamed from: a */
    private final String f1118a;
    @Nullable

    /* renamed from: b */
    private final String f1119b;

    static {
        String a = StringMerger.m986a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f1112c = a;
        String a2 = StringMerger.m986a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f1113d = a2;
        String a3 = StringMerger.m986a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f1114e = a3;
        f1116g = new CCTDestination(a, (String) null);
        f1117h = new CCTDestination(a2, a3);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.f1118a = str;
        this.f1119b = str2;
    }

    @NonNull
    /* renamed from: c */
    public static CCTDestination m966c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new CCTDestination(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<Encoding> mo19276a() {
        return f1115f;
    }

    @Nullable
    /* renamed from: b */
    public byte[] mo19277b() {
        String str = this.f1119b;
        if (str == null && this.f1118a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f1118a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    /* renamed from: d */
    public String mo19278d() {
        return this.f1119b;
    }

    @NonNull
    /* renamed from: e */
    public String mo19279e() {
        return this.f1118a;
    }

    @Nullable
    public byte[] getExtras() {
        return mo19277b();
    }

    @NonNull
    public String getName() {
        return "cct";
    }
}
