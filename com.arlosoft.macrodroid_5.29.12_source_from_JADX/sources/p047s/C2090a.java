package p047s;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1459a;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0006d;
import p048t.C2101i;

/* renamed from: s.a */
/* compiled from: FontAssetManager */
public class C2090a {

    /* renamed from: a */
    private final C2101i<String> f6474a = new C2101i<>();

    /* renamed from: b */
    private final Map<C2101i<String>, Typeface> f6475b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f6476c = new HashMap();

    /* renamed from: d */
    private final AssetManager f6477d;

    /* renamed from: e */
    private String f6478e = ".ttf";

    public C2090a(Drawable.Callback callback, @Nullable C1459a aVar) {
        if (!(callback instanceof View)) {
            C0006d.m32c("LottieDrawable must be inside of a view for images to work.");
            this.f6477d = null;
            return;
        }
        this.f6477d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    private Typeface m8634a(String str) {
        Typeface typeface = this.f6476c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f6477d, "fonts/" + str + this.f6478e);
        this.f6476c.put(str, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: d */
    private Typeface m8635d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    /* renamed from: b */
    public Typeface mo24195b(String str, String str2) {
        this.f6474a.mo24224b(str, str2);
        Typeface typeface = this.f6475b.get(this.f6474a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d = m8635d(m8634a(str), str2);
        this.f6475b.put(this.f6474a, d);
        return d;
    }

    /* renamed from: c */
    public void mo24196c(@Nullable C1459a aVar) {
    }
}
