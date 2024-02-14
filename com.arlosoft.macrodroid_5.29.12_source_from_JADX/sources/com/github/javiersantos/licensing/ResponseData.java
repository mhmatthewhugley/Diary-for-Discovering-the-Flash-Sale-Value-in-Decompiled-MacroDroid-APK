package com.github.javiersantos.licensing;

import android.text.TextUtils;
import java.util.regex.Pattern;

public class ResponseData {

    /* renamed from: a */
    public int f16239a;

    /* renamed from: b */
    public int f16240b;

    /* renamed from: c */
    public String f16241c;

    /* renamed from: d */
    public String f16242d;

    /* renamed from: e */
    public String f16243e;

    /* renamed from: f */
    public long f16244f;

    /* renamed from: g */
    public String f16245g;

    /* renamed from: a */
    public static ResponseData m26173a(String str) {
        int indexOf = str.indexOf(58);
        String str2 = "";
        if (-1 != indexOf) {
            String substring = str.substring(0, indexOf);
            if (indexOf < str.length()) {
                str2 = str.substring(indexOf + 1);
            }
            str = substring;
        }
        String[] split = TextUtils.split(str, Pattern.quote("|"));
        if (split.length >= 6) {
            ResponseData responseData = new ResponseData();
            responseData.f16245g = str2;
            responseData.f16239a = Integer.parseInt(split[0]);
            responseData.f16240b = Integer.parseInt(split[1]);
            responseData.f16241c = split[2];
            responseData.f16242d = split[3];
            responseData.f16243e = split[4];
            responseData.f16244f = Long.parseLong(split[5]);
            return responseData;
        }
        throw new IllegalArgumentException("Wrong number of fields.");
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f16239a), Integer.valueOf(this.f16240b), this.f16241c, this.f16242d, this.f16243e, Long.valueOf(this.f16244f)});
    }
}
