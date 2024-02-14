package p345o7;

import java.io.UnsupportedEncodingException;
import p226cd.C11188e;

/* renamed from: o7.a */
/* compiled from: Credentials */
public final class C15807a {
    /* renamed from: a */
    public static String m95369a(String str, String str2) {
        try {
            String b = C11188e.m75104r((str + ":" + str2).getBytes("ISO-8859-1")).mo62491b();
            return "Basic " + b;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
