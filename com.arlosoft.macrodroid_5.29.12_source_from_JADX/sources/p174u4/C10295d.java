package p174u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;

/* renamed from: u4.d */
/* compiled from: ResourceDrawableDecoder */
public class C10295d implements C7385h<Uri, Drawable> {

    /* renamed from: a */
    private final Context f23451a;

    public C10295d(Context context) {
        this.f23451a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: d */
    private Context m40447d(Uri uri, String str) {
        if (str.equals(this.f23451a.getPackageName())) {
            return this.f23451a;
        }
        try {
            return this.f23451a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f23451a.getPackageName())) {
                return this.f23451a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @DrawableRes
    /* renamed from: e */
    private int m40448e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    @DrawableRes
    /* renamed from: f */
    private int m40449f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @DrawableRes
    /* renamed from: g */
    private int m40450g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m40449f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m40448e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Nullable
    /* renamed from: c */
    public C7587c<Drawable> mo37384b(@NonNull Uri uri, int i, int i2, @NonNull C7384g gVar) {
        Context d = m40447d(uri, uri.getAuthority());
        return C10294c.m40445d(C10292a.m40439b(this.f23451a, d, m40450g(d, uri)));
    }

    /* renamed from: h */
    public boolean mo37383a(@NonNull Uri uri, @NonNull C7384g gVar) {
        return uri.getScheme().equals("android.resource");
    }
}
