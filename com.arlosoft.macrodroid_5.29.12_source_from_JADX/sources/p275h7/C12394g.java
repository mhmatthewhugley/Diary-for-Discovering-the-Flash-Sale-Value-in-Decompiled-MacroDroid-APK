package p275h7;

import android.net.Uri;
import p259f7.C12246f;

/* renamed from: h7.g */
/* compiled from: PermissionUtil */
public class C12394g {
    /* renamed from: a */
    public static String[] m83225a(boolean z) {
        if (z) {
            return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    /* renamed from: b */
    public static void m83226b(C12246f fVar, Uri uri) {
        fVar.mo68561c().grantUriPermission(fVar.mo68561c().getPackageName(), uri, 1);
    }
}
