package dev.skomlach.common.network;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12114c;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p240d9.C11966a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u001c\u0010\u0019\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0002J\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u001c\u0010,\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u001c\u0010-\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u001c\u0010.\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100¨\u00064"}, mo71668d2 = {"Ldev/skomlach/common/network/e;", "", "", "u", "", "h", "Lja/u;", "k", "originalUrl", "s", "o", "meta", "f", "rel", "g", "tag", "", "j", "original", "t", "d", "url", "e", "link1", "link2", "i", "c", "", "delaySeconds", "l", "Ldev/skomlach/common/network/ConnectionStateListener;", "a", "Ldev/skomlach/common/network/ConnectionStateListener;", "connectionStateListener", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "", "[Ljava/lang/String;", "hosts", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "patternMeta", "patternLink", "patternTagAttributes", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "job", "<init>", "(Ldev/skomlach/common/network/ConnectionStateListener;)V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: dev.skomlach.common.network.e */
/* compiled from: Ping.kt */
public final class C12129e {

    /* renamed from: a */
    private final ConnectionStateListener f58410a;

    /* renamed from: b */
    private final Context f58411b = C12104a.f58372a.mo68283g();

    /* renamed from: c */
    private final String[] f58412c = {"1.1.1.1", "google.com", "aliexpress.com"};

    /* renamed from: d */
    private final Pattern f58413d = Pattern.compile("<meta(.*?)>");

    /* renamed from: e */
    private final Pattern f58414e = Pattern.compile("<link(.*?)>");

    /* renamed from: f */
    private final Pattern f58415f = Pattern.compile("(\\w*?)=\"(.*?)\"");

    /* renamed from: g */
    private Runnable f58416g;

    public C12129e(ConnectionStateListener connectionStateListener) {
        C13706o.m87929f(connectionStateListener, "connectionStateListener");
        this.f58410a = connectionStateListener;
    }

    /* renamed from: d */
    private final void m82621d(String str, String str2) throws Exception {
        if (str2 != null && !m82625h(str2)) {
            str2 = "https://" + str2;
        }
        if (!m82626i(str, str2)) {
            throw new IOException("Unable to connect to " + str);
        }
    }

    /* renamed from: e */
    private final String m82622e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!m82625h(str)) {
                return "";
            }
            String scheme = new URI(str).getScheme();
            C13706o.m87928e(scheme, "URI(url).scheme");
            return scheme;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    private final String m82623f(String str) {
        Map<String, String> j = m82627j(str);
        if (C15176v.m93641v("og:url", j.get("property"), true)) {
            return j.get("content");
        }
        return null;
    }

    /* renamed from: g */
    private final String m82624g(String str) {
        Map<String, String> j = m82627j(str);
        String str2 = j.get("rel");
        if (C15176v.m93641v("canonical", str2, true) || C15176v.m93641v("alternate", str2, true) || C15176v.m93641v("shortlink", str2, true)) {
            return j.get("href");
        }
        return null;
    }

    /* renamed from: h */
    private final boolean m82625h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(C12104a.f58372a.mo68285j());
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int a0 = C15177w.m93682a0(lowerCase, "/", 0, false, 6, (Object) null);
        if (a0 > 0 && a0 < C15177w.m93682a0(lowerCase, "?", 0, false, 6, (Object) null)) {
            lowerCase = lowerCase.substring(0, C15177w.m93682a0(lowerCase, "?", 0, false, 6, (Object) null));
            C13706o.m87928e(lowerCase, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if ((C15176v.m93634I(lowerCase, "http://", false, 2, (Object) null) || C15176v.m93634I(lowerCase, "https://", false, 2, (Object) null)) && Patterns.WEB_URL.matcher(lowerCase).matches()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0148 A[Catch:{ all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159 A[Catch:{ all -> 0x022b }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7 A[Catch:{ all -> 0x022b }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m82626i(java.lang.String r24, java.lang.String r25) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r2 = "ROOT"
            java.lang.String r3 = "www."
            java.lang.String r4 = "m."
            java.lang.String r5 = "u1.host"
            java.lang.String r6 = ""
            if (r24 != 0) goto L_0x0012
            r7 = r6
            goto L_0x0014
        L_0x0012:
            r7 = r24
        L_0x0014:
            if (r25 != 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r6 = r25
        L_0x0019:
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r9 = 0
            if (r8 == 0) goto L_0x0021
            return r9
        L_0x0021:
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L_0x0028
            return r9
        L_0x0028:
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ all -> 0x0235 }
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)     // Catch:{ all -> 0x0235 }
            java.lang.String r15 = r7.toLowerCase(r8)     // Catch:{ all -> 0x0235 }
            kotlin.jvm.internal.C13706o.m87928e(r15, r1)     // Catch:{ all -> 0x0235 }
            kotlin.jvm.internal.C13706o.m87928e(r8, r2)     // Catch:{ all -> 0x0233 }
            java.lang.String r2 = r6.toLowerCase(r8)     // Catch:{ all -> 0x0233 }
            kotlin.jvm.internal.C13706o.m87928e(r2, r1)     // Catch:{ all -> 0x0233 }
            java.lang.String r1 = r0.m82622e(r2)     // Catch:{ all -> 0x0230 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0230 }
            java.lang.String r6 = "http"
            java.lang.String r7 = "http://"
            java.lang.String r8 = "://"
            java.lang.String r14 = "this as java.lang.String).substring(startIndex)"
            r13 = 0
            r12 = 2
            if (r1 == 0) goto L_0x0093
            boolean r1 = kotlin.text.C15177w.m93663N(r2, r8, r9, r12, r13)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x007f
            java.lang.String r17 = "://"
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r2
            int r1 = kotlin.text.C15177w.m93682a0(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r2.substring(r1)     // Catch:{ all -> 0x008f }
            kotlin.jvm.internal.C13706o.m87928e(r1, r14)     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r10.<init>()     // Catch:{ all -> 0x008f }
            r10.append(r6)     // Catch:{ all -> 0x008f }
            r10.append(r1)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x008f }
            goto L_0x0094
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r1.<init>()     // Catch:{ all -> 0x008f }
            r1.append(r7)     // Catch:{ all -> 0x008f }
            r1.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008f }
            goto L_0x0094
        L_0x008f:
            r6 = r2
            r7 = r15
            goto L_0x0235
        L_0x0093:
            r1 = r2
        L_0x0094:
            java.lang.String r2 = r0.m82622e(r15)     // Catch:{ all -> 0x022d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x022d }
            if (r2 == 0) goto L_0x00e7
            boolean r2 = kotlin.text.C15177w.m93663N(r15, r8, r9, r12, r13)     // Catch:{ all -> 0x022d }
            if (r2 == 0) goto L_0x00d4
            java.lang.String r11 = "://"
            r2 = 0
            r7 = 0
            r8 = 6
            r16 = 0
            r10 = r15
            r12 = r2
            r2 = r13
            r13 = r7
            r7 = r14
            r14 = r8
            r8 = r15
            r15 = r16
            int r10 = kotlin.text.C15177w.m93682a0(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x022e }
            java.lang.String r10 = r8.substring(r10)     // Catch:{ all -> 0x022e }
            kotlin.jvm.internal.C13706o.m87928e(r10, r7)     // Catch:{ all -> 0x022e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r11.<init>()     // Catch:{ all -> 0x022e }
            r11.append(r6)     // Catch:{ all -> 0x022e }
            r11.append(r10)     // Catch:{ all -> 0x022e }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x022e }
            r22 = r7
            r7 = r6
            r6 = r22
            goto L_0x00eb
        L_0x00d4:
            r2 = r13
            r6 = r14
            r8 = r15
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            r10.<init>()     // Catch:{ all -> 0x022e }
            r10.append(r7)     // Catch:{ all -> 0x022e }
            r10.append(r8)     // Catch:{ all -> 0x022e }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x022e }
            goto L_0x00eb
        L_0x00e7:
            r2 = r13
            r6 = r14
            r8 = r15
            r7 = r8
        L_0x00eb:
            java.net.URL r8 = new java.net.URL     // Catch:{ all -> 0x022b }
            r8.<init>(r7)     // Catch:{ all -> 0x022b }
            java.net.URL r10 = new java.net.URL     // Catch:{ all -> 0x022b }
            r10.<init>(r1)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = r8.getProtocol()     // Catch:{ all -> 0x022b }
            java.lang.String r12 = r10.getProtocol()     // Catch:{ all -> 0x022b }
            boolean r11 = kotlin.jvm.internal.C13706o.m87924a(r11, r12)     // Catch:{ all -> 0x022b }
            if (r11 != 0) goto L_0x0119
            java.net.URL r11 = new java.net.URL     // Catch:{ all -> 0x022b }
            java.lang.String r12 = r10.getProtocol()     // Catch:{ all -> 0x022b }
            java.lang.String r13 = r8.getHost()     // Catch:{ all -> 0x022b }
            int r14 = r8.getPort()     // Catch:{ all -> 0x022b }
            java.lang.String r8 = r8.getFile()     // Catch:{ all -> 0x022b }
            r11.<init>(r12, r13, r14, r8)     // Catch:{ all -> 0x022b }
            r8 = r11
        L_0x0119:
            java.lang.String r11 = r8.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r11, r5)     // Catch:{ all -> 0x022b }
            r12 = 2
            boolean r11 = kotlin.text.C15176v.m93634I(r11, r4, r9, r12, r2)     // Catch:{ all -> 0x022b }
            r13 = 1
            java.lang.String r14 = "u2.host"
            if (r11 != 0) goto L_0x013a
            java.lang.String r11 = r10.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r11, r14)     // Catch:{ all -> 0x022b }
            boolean r11 = kotlin.text.C15176v.m93634I(r11, r4, r9, r12, r2)     // Catch:{ all -> 0x022b }
            if (r11 == 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r11 = 0
            goto L_0x013b
        L_0x013a:
            r11 = 1
        L_0x013b:
            java.lang.String r15 = r8.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r15, r5)     // Catch:{ all -> 0x022b }
            boolean r15 = kotlin.text.C15176v.m93634I(r15, r3, r9, r12, r2)     // Catch:{ all -> 0x022b }
            if (r15 != 0) goto L_0x0157
            java.lang.String r15 = r10.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r15, r14)     // Catch:{ all -> 0x022b }
            boolean r15 = kotlin.text.C15176v.m93634I(r15, r3, r9, r12, r2)     // Catch:{ all -> 0x022b }
            if (r15 == 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r13 = 0
        L_0x0157:
            if (r11 == 0) goto L_0x01b5
            java.lang.String r11 = r8.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r11, r5)     // Catch:{ all -> 0x022b }
            boolean r11 = kotlin.text.C15176v.m93634I(r11, r4, r9, r12, r2)     // Catch:{ all -> 0x022b }
            if (r11 == 0) goto L_0x0187
            java.net.URL r4 = new java.net.URL     // Catch:{ all -> 0x022b }
            java.lang.String r11 = r8.getProtocol()     // Catch:{ all -> 0x022b }
            java.lang.String r15 = r8.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r15, r5)     // Catch:{ all -> 0x022b }
            java.lang.String r15 = r15.substring(r12)     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r15, r6)     // Catch:{ all -> 0x022b }
            int r2 = r8.getPort()     // Catch:{ all -> 0x022b }
            java.lang.String r8 = r8.getFile()     // Catch:{ all -> 0x022b }
            r4.<init>(r11, r15, r2, r8)     // Catch:{ all -> 0x022b }
            r8 = r4
            goto L_0x01b5
        L_0x0187:
            java.lang.String r2 = r10.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r2, r14)     // Catch:{ all -> 0x022b }
            r11 = 0
            boolean r2 = kotlin.text.C15176v.m93634I(r2, r4, r9, r12, r11)     // Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x01b5
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x022b }
            java.lang.String r4 = r10.getProtocol()     // Catch:{ all -> 0x022b }
            java.lang.String r11 = r10.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r11, r14)     // Catch:{ all -> 0x022b }
            java.lang.String r11 = r11.substring(r12)     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r11, r6)     // Catch:{ all -> 0x022b }
            int r15 = r10.getPort()     // Catch:{ all -> 0x022b }
            java.lang.String r10 = r10.getFile()     // Catch:{ all -> 0x022b }
            r2.<init>(r4, r11, r15, r10)     // Catch:{ all -> 0x022b }
            r10 = r2
        L_0x01b5:
            if (r13 == 0) goto L_0x0215
            java.lang.String r2 = r8.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r2, r5)     // Catch:{ all -> 0x022b }
            r4 = 0
            boolean r2 = kotlin.text.C15176v.m93634I(r2, r3, r9, r12, r4)     // Catch:{ all -> 0x022b }
            r4 = 4
            if (r2 == 0) goto L_0x01e7
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x022b }
            java.lang.String r3 = r8.getProtocol()     // Catch:{ all -> 0x022b }
            java.lang.String r9 = r8.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r9, r5)     // Catch:{ all -> 0x022b }
            java.lang.String r4 = r9.substring(r4)     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r4, r6)     // Catch:{ all -> 0x022b }
            int r5 = r8.getPort()     // Catch:{ all -> 0x022b }
            java.lang.String r6 = r8.getFile()     // Catch:{ all -> 0x022b }
            r2.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x022b }
            r8 = r2
            goto L_0x0215
        L_0x01e7:
            java.lang.String r2 = r10.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r2, r14)     // Catch:{ all -> 0x022b }
            r5 = 0
            boolean r2 = kotlin.text.C15176v.m93634I(r2, r3, r9, r12, r5)     // Catch:{ all -> 0x022b }
            if (r2 == 0) goto L_0x0215
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x022b }
            java.lang.String r3 = r10.getProtocol()     // Catch:{ all -> 0x022b }
            java.lang.String r5 = r10.getHost()     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r5, r14)     // Catch:{ all -> 0x022b }
            java.lang.String r4 = r5.substring(r4)     // Catch:{ all -> 0x022b }
            kotlin.jvm.internal.C13706o.m87928e(r4, r6)     // Catch:{ all -> 0x022b }
            int r5 = r10.getPort()     // Catch:{ all -> 0x022b }
            java.lang.String r6 = r10.getFile()     // Catch:{ all -> 0x022b }
            r2.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x022b }
            r10 = r2
        L_0x0215:
            java.lang.String r2 = r8.toExternalForm()     // Catch:{ all -> 0x022b }
            java.lang.String r3 = "u1.toExternalForm()"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)     // Catch:{ all -> 0x022b }
            java.lang.String r3 = r10.toExternalForm()     // Catch:{ all -> 0x0228 }
            java.lang.String r4 = "u2.toExternalForm()"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)     // Catch:{ all -> 0x0228 }
            goto L_0x0237
        L_0x0228:
            r6 = r1
            r7 = r2
            goto L_0x0235
        L_0x022b:
            r6 = r1
            goto L_0x0235
        L_0x022d:
            r8 = r15
        L_0x022e:
            r6 = r1
            goto L_0x0234
        L_0x0230:
            r8 = r15
            r6 = r2
            goto L_0x0234
        L_0x0233:
            r8 = r15
        L_0x0234:
            r7 = r8
        L_0x0235:
            r3 = r6
            r2 = r7
        L_0x0237:
            boolean r1 = kotlin.jvm.internal.C13706o.m87924a(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.common.network.C12129e.m82626i(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: j */
    private final Map<String, String> m82627j(String str) {
        Matcher matcher = this.f58415f.matcher(str);
        HashMap hashMap = new HashMap();
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            C13706o.m87928e(group, "key");
            C13706o.m87928e(group2, "value");
            hashMap.put(group, group2);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r15.f58410a.mo68327c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0147, code lost:
        if (r7 != null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r7.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0151, code lost:
        if (r7 != null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r7.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0142 */
    @androidx.annotation.WorkerThread
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m82628k() {
        /*
            r15 = this;
            java.lang.String r0 = "https://"
            android.content.Context r1 = r15.f58411b
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 1
            r5 = 28
            if (r2 < r5) goto L_0x001e
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.isDefaultNetworkActive()
            if (r1 != r4) goto L_0x002d
        L_0x001c:
            r1 = 1
            goto L_0x002e
        L_0x001e:
            if (r1 == 0) goto L_0x002d
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.isConnectedOrConnecting()
            if (r1 != r4) goto L_0x002d
            goto L_0x001c
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 != 0) goto L_0x0036
            dev.skomlach.common.network.ConnectionStateListener r0 = r15.f58410a
            r0.mo68327c(r3)
            return
        L_0x0036:
            java.lang.String[] r1 = r15.f58412c
            int r2 = r1.length
            r5 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x0157
            r6 = r1[r5]
            r7 = 0
            java.net.InetAddress[] r8 = java.net.InetAddress.getAllByName(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = "getAllByName(host)"
            kotlin.jvm.internal.C13706o.m87928e(r8, r9)     // Catch:{ all -> 0x0142 }
            int r8 = r8.length     // Catch:{ all -> 0x0142 }
            if (r8 != 0) goto L_0x004d
            r8 = 1
            goto L_0x004e
        L_0x004d:
            r8 = 0
        L_0x004e:
            r8 = r8 ^ r4
            java.lang.String r9 = "Unable to connect to "
            if (r8 == 0) goto L_0x012d
            java.net.URI r8 = new java.net.URI     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            r10.append(r0)     // Catch:{ all -> 0x0142 }
            r10.append(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0142 }
            r8.<init>(r10)     // Catch:{ all -> 0x0142 }
            dev.skomlach.common.network.b r10 = dev.skomlach.common.network.C12126b.f58407a     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = r8.toString()     // Catch:{ all -> 0x0142 }
            r12 = 1000(0x3e8, float:1.401E-42)
            java.net.HttpURLConnection r7 = r10.mo68335a(r11, r12)     // Catch:{ all -> 0x0142 }
            r7.setInstanceFollowRedirects(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = "GET"
            r7.setRequestMethod(r11)     // Catch:{ all -> 0x0142 }
            r7.connect()     // Catch:{ all -> 0x0142 }
            int r11 = r7.getResponseCode()     // Catch:{ all -> 0x0142 }
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0142 }
            r12.<init>()     // Catch:{ all -> 0x0142 }
            r13 = 200(0xc8, float:2.8E-43)
            r14 = 300(0x12c, float:4.2E-43)
            if (r11 < r13) goto L_0x0099
            if (r11 >= r14) goto L_0x0099
            java.io.InputStream r11 = r7.getInputStream()     // Catch:{ all -> 0x0142 }
            java.lang.String r13 = "urlConnection.inputStream"
            kotlin.jvm.internal.C13706o.m87928e(r11, r13)     // Catch:{ all -> 0x0142 }
            goto L_0x00e7
        L_0x0099:
            if (r11 < r14) goto L_0x00de
            r13 = 400(0x190, float:5.6E-43)
            if (r11 >= r13) goto L_0x00de
            java.lang.String r11 = "Location"
            java.lang.String r11 = r7.getHeaderField(r11)     // Catch:{ all -> 0x0142 }
            if (r11 == 0) goto L_0x00bc
            boolean r13 = r15.m82625h(r11)     // Catch:{ all -> 0x0142 }
            if (r13 != 0) goto L_0x00bc
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r13.<init>()     // Catch:{ all -> 0x0142 }
            r13.append(r0)     // Catch:{ all -> 0x0142 }
            r13.append(r11)     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0142 }
        L_0x00bc:
            if (r11 == 0) goto L_0x00de
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x0142 }
            boolean r11 = r15.m82626i(r13, r11)     // Catch:{ all -> 0x0142 }
            if (r11 == 0) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            r10.append(r9)     // Catch:{ all -> 0x0142 }
            r10.append(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x0142 }
            r8.<init>(r6)     // Catch:{ all -> 0x0142 }
            throw r8     // Catch:{ all -> 0x0142 }
        L_0x00de:
            java.io.InputStream r11 = r7.getErrorStream()     // Catch:{ all -> 0x0142 }
            java.lang.String r13 = "urlConnection.errorStream"
            kotlin.jvm.internal.C13706o.m87928e(r11, r13)     // Catch:{ all -> 0x0142 }
        L_0x00e7:
            r10.mo68336b(r11, r12)     // Catch:{ all -> 0x0142 }
            r11.close()     // Catch:{ all -> 0x0142 }
            byte[] r10 = r12.toByteArray()     // Catch:{ all -> 0x0142 }
            r12.close()     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "data"
            kotlin.jvm.internal.C13706o.m87928e(r10, r12)     // Catch:{ all -> 0x0142 }
            java.nio.charset.Charset r12 = kotlin.text.C15147d.f64349b     // Catch:{ all -> 0x0142 }
            r11.<init>(r10, r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = "uri.toString()"
            kotlin.jvm.internal.C13706o.m87928e(r8, r10)     // Catch:{ all -> 0x0142 }
            boolean r8 = r15.m82631o(r8, r11)     // Catch:{ all -> 0x0142 }
            if (r8 == 0) goto L_0x0118
            dev.skomlach.common.network.ConnectionStateListener r6 = r15.f58410a     // Catch:{ all -> 0x0142 }
            r6.mo68327c(r4)     // Catch:{ all -> 0x0142 }
            r7.disconnect()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            return
        L_0x0118:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            r10.append(r9)     // Catch:{ all -> 0x0142 }
            r10.append(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x0142 }
            r8.<init>(r6)     // Catch:{ all -> 0x0142 }
            throw r8     // Catch:{ all -> 0x0142 }
        L_0x012d:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            r10.append(r9)     // Catch:{ all -> 0x0142 }
            r10.append(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x0142 }
            r8.<init>(r6)     // Catch:{ all -> 0x0142 }
            throw r8     // Catch:{ all -> 0x0142 }
        L_0x0142:
            dev.skomlach.common.network.ConnectionStateListener r6 = r15.f58410a     // Catch:{ all -> 0x0150 }
            r6.mo68327c(r3)     // Catch:{ all -> 0x0150 }
            if (r7 == 0) goto L_0x014c
            r7.disconnect()     // Catch:{ all -> 0x014c }
        L_0x014c:
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0150:
            r0 = move-exception
            if (r7 == 0) goto L_0x0156
            r7.disconnect()     // Catch:{ all -> 0x0156 }
        L_0x0156:
            throw r0
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.common.network.C12129e.m82628k():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m82629m(C12129e eVar) {
        C13706o.m87929f(eVar, "this$0");
        C12114c.f58379a.mo68308k(new C12128d(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m82630n(C12129e eVar) {
        C13706o.m87929f(eVar, "this$0");
        eVar.m82628k();
    }

    /* renamed from: o */
    private final boolean m82631o(String str, String str2) throws Exception {
        String str3 = str;
        String str4 = str2;
        Locale locale = Locale.ROOT;
        C13706o.m87928e(locale, "ROOT");
        String lowerCase = str4.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int a0 = C15177w.m93682a0(lowerCase, "<head>", 0, false, 6, (Object) null);
        C13706o.m87928e(locale, "ROOT");
        String lowerCase2 = str4.toLowerCase(locale);
        C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        int a02 = C15177w.m93682a0(lowerCase2, "</head>", 0, false, 6, (Object) null);
        if (!(a0 == -1 || a02 == -1)) {
            String substring = str4.substring(a0 + 6, a02);
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Matcher matcher = this.f58414e.matcher(substring);
            while (matcher.find()) {
                String group = matcher.group(1);
                C13706o.m87928e(group, "rel");
                String g = m82624g(group);
                if (g != null) {
                    m82621d(str3, g);
                    C11966a aVar = C11966a.f58161a;
                    aVar.mo67379b("Ping compare (link):" + str3 + " == " + g);
                    return true;
                }
            }
            Matcher matcher2 = this.f58413d.matcher(substring);
            while (matcher2.find()) {
                String group2 = matcher2.group(1);
                C13706o.m87928e(group2, "meta");
                String f = m82623f(group2);
                if (f != null) {
                    m82621d(str3, f);
                    C11966a aVar2 = C11966a.f58161a;
                    aVar2.mo67379b("Ping compare (meta):" + str3 + " == " + f);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo68342c() {
        Runnable runnable = this.f58416g;
        if (runnable != null) {
            C12114c.f58379a.mo68307i(runnable);
        }
        this.f58416g = null;
    }

    /* renamed from: l */
    public final void mo68343l(long j) {
        mo68342c();
        C12127c cVar = new C12127c(this);
        this.f58416g = cVar;
        if (j > 0) {
            C12114c.f58379a.mo68306h(cVar, TimeUnit.SECONDS.toMillis(j));
        } else {
            C12114c.f58379a.mo68305g(cVar);
        }
    }
}
