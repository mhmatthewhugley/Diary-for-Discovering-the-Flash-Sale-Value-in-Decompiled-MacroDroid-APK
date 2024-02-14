package p040o;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;

/* renamed from: o.c */
/* compiled from: TypefaceHelper */
public class C2043c {

    /* renamed from: a */
    private static final SimpleArrayMap<String, Typeface> f6286a = new SimpleArrayMap<>();

    /* renamed from: a */
    public static Typeface m8453a(Context context, String str) {
        SimpleArrayMap<String, Typeface> simpleArrayMap = f6286a;
        synchronized (simpleArrayMap) {
            if (!simpleArrayMap.containsKey(str)) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", new Object[]{str}));
                    simpleArrayMap.put(str, createFromAsset);
                    return createFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } else {
                Typeface typeface = simpleArrayMap.get(str);
                return typeface;
            }
        }
    }
}
