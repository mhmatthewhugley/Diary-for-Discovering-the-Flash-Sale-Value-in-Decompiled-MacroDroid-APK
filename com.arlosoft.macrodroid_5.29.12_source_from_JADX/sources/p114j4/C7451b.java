package p114j4;

import android.net.Uri;

/* renamed from: j4.b */
/* compiled from: MediaStoreUtil */
public final class C7451b {
    /* renamed from: a */
    public static boolean m30931a(Uri uri) {
        return m30932b(uri) && !m30935e(uri);
    }

    /* renamed from: b */
    public static boolean m30932b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m30933c(Uri uri) {
        return m30932b(uri) && m30935e(uri);
    }

    /* renamed from: d */
    public static boolean m30934d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m30935e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
