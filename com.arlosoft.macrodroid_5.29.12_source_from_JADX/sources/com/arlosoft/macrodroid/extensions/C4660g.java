package com.arlosoft.macrodroid.extensions;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.arlosoft.macrodroid.common.C4012f1;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15147d;

/* renamed from: com.arlosoft.macrodroid.extensions.g */
/* compiled from: StringExtensions.kt */
public final class C4660g {
    /* renamed from: a */
    public static final String m18123a(String str) {
        C13706o.m87929f(str, "<this>");
        String a = new C4012f1().mo27914a(str);
        C13706o.m87928e(a, "SimpleEncryption().decrypt(this)");
        return a;
    }

    /* renamed from: b */
    public static final int m18124b(String str) {
        C13706o.m87929f(str, "<this>");
        int length = str.length() - 1;
        while (length > 0) {
            char charAt = str.charAt(length);
            if (!('0' <= charAt && charAt < ':')) {
                break;
            }
            length--;
        }
        String substring = str.substring(length + 1, str.length());
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Integer l = C15175u.m93622l(substring);
        if (l != null) {
            return l.intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public static final String m18125c(String str) {
        C13706o.m87929f(str, "<this>");
        MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
        byte[] bytes = str.getBytes(C15147d.f64349b);
        C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
        String bigInteger = new BigInteger(1, instance.digest(bytes)).toString(16);
        C13706o.m87928e(bigInteger, "BigInteger(1, md.digest(…yteArray())).toString(16)");
        return C15177w.m93692k0(bigInteger, 32, '0');
    }

    /* renamed from: d */
    public static final String m18126d(String str) {
        C13706o.m87929f(str, "<this>");
        int length = str.length() - 1;
        while (length > 0) {
            char charAt = str.charAt(length);
            if ('0' <= charAt && charAt < ':') {
                length--;
            }
        }
        try {
            String substring = str.substring(0, length);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: e */
    public static final SpannableString m18127e(String str, List<String> list, float f) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(list, "paths");
        SpannableString spannableString = new SpannableString(str);
        for (String str2 : list) {
            String spannableString2 = spannableString.toString();
            C13706o.m87928e(spannableString2, "spannable.toString()");
            int a0 = C15177w.m93682a0(spannableString2, str2, 0, false, 6, (Object) null);
            spannableString.setSpan(new RelativeSizeSpan(f), a0, str2.length() + a0, 0);
        }
        return spannableString;
    }

    /* renamed from: f */
    public static final SpannableString m18128f(String str) {
        C13706o.m87929f(str, "<this>");
        return m18127e(str, C13614t.m87751m("ACRO", "ROID"), 0.8f);
    }

    /* renamed from: g */
    public static final String m18129g(String str) {
        C13706o.m87929f(str, "<this>");
        MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256);
        byte[] bytes = str.getBytes(C15147d.f64349b);
        C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
        instance.update(bytes);
        byte[] digest = instance.digest();
        C13696i0 i0Var = C13696i0.f61931a;
        String format = String.format("%064x", Arrays.copyOf(new Object[]{new BigInteger(1, digest)}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        return format;
    }

    /* renamed from: h */
    public static final String m18130h(String str) {
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256);
        byte[] bytes = str.getBytes(C15147d.f64349b);
        C13706o.m87928e(bytes, "this as java.lang.String).getBytes(charset)");
        instance.update(bytes);
        byte[] digest = instance.digest();
        C13696i0 i0Var = C13696i0.f61931a;
        String format = String.format("%064x", Arrays.copyOf(new Object[]{new BigInteger(1, digest)}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        return format;
    }
}
