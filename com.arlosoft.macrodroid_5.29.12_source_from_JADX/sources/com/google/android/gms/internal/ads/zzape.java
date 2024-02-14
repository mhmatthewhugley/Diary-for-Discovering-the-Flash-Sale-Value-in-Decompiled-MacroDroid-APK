package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzape {

    /* renamed from: d */
    private static final String[] f25246d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    private final String f25247a = "ad.doubleclick.net";

    /* renamed from: b */
    private final String[] f25248b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private final zzapa f25249c;

    @Deprecated
    public zzape(zzapa zzapa) {
        this.f25249c = zzapa;
    }

    /* renamed from: g */
    private final Uri m42069g(Uri uri, String str) throws zzapf {
        Objects.requireNonNull(uri);
        try {
            if (uri.getHost().equals(this.f25247a)) {
                try {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new zzapf("Parameter already exists: dc_ms");
                } catch (UnsupportedOperationException unused) {
                    throw new zzapf("Provided Uri is not in a valid state");
                }
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        }
        throw new zzapf("Query parameter already exists: ms");
    }

    @Deprecated
    /* renamed from: a */
    public final Uri mo41774a(Uri uri, Context context, View view, Activity activity) throws zzapf {
        try {
            return m42069g(uri, this.f25249c.mo20432f(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzapf("Provided Uri is not in a valid state");
        }
    }

    @Deprecated
    /* renamed from: b */
    public final Uri mo41775b(Uri uri, Context context) throws zzapf {
        return m42069g(uri, this.f25249c.mo20428b(context));
    }

    @Deprecated
    /* renamed from: c */
    public final zzapa mo41776c() {
        return this.f25249c;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo41777d(MotionEvent motionEvent) {
        this.f25249c.mo20430d(motionEvent);
    }

    /* renamed from: e */
    public final boolean mo41778e(Uri uri) {
        if (mo41779f(uri)) {
            String[] strArr = f25246d;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo41779f(Uri uri) {
        Objects.requireNonNull(uri);
        try {
            String host = uri.getHost();
            String[] strArr = this.f25248b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
