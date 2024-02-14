package p047s;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1460b;
import com.airbnb.lottie.C1488g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0006d;
import p001a0.C0010h;

/* renamed from: s.b */
/* compiled from: ImageAssetManager */
public class C2091b {

    /* renamed from: e */
    private static final Object f6479e = new Object();

    /* renamed from: a */
    private final Context f6480a;

    /* renamed from: b */
    private final String f6481b;
    @Nullable

    /* renamed from: c */
    private C1460b f6482c;

    /* renamed from: d */
    private final Map<String, C1488g> f6483d;

    public C2091b(Drawable.Callback callback, String str, C1460b bVar, Map<String, C1488g> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f6481b = str;
        } else {
            this.f6481b = str + '/';
        }
        if (!(callback instanceof View)) {
            C0006d.m32c("LottieDrawable must be inside of a view for images to work.");
            this.f6483d = new HashMap();
            this.f6480a = null;
            return;
        }
        this.f6480a = ((View) callback).getContext();
        this.f6483d = map;
        mo24199d(bVar);
    }

    /* renamed from: c */
    private Bitmap m8638c(String str, @Nullable Bitmap bitmap) {
        synchronized (f6479e) {
            this.f6483d.get(str).mo17159f(bitmap);
        }
        return bitmap;
    }

    @Nullable
    /* renamed from: a */
    public Bitmap mo24197a(String str) {
        C1488g gVar = this.f6483d.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap a = gVar.mo17154a();
        if (a != null) {
            return a;
        }
        C1460b bVar = this.f6482c;
        if (bVar != null) {
            Bitmap a2 = bVar.mo17050a(gVar);
            if (a2 != null) {
                m8638c(str, a2);
            }
            return a2;
        }
        String b = gVar.mo17155b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f6481b)) {
                    AssetManager assets = this.f6480a.getAssets();
                    try {
                        return m8638c(str, C0010h.m82l(BitmapFactory.decodeStream(assets.open(this.f6481b + b), (Rect) null, options), gVar.mo17158e(), gVar.mo17156c()));
                    } catch (IllegalArgumentException e) {
                        C0006d.m33d("Unable to decode image.", e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e2) {
                C0006d.m33d("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                return m8638c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e3) {
                C0006d.m33d("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo24198b(Context context) {
        return (context == null && this.f6480a == null) || this.f6480a.equals(context);
    }

    /* renamed from: d */
    public void mo24199d(@Nullable C1460b bVar) {
        this.f6482c = bVar;
    }
}
