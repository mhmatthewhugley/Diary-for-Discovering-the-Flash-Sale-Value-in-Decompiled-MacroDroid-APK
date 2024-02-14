package p314l7;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

/* renamed from: l7.b */
/* compiled from: ViewPropertyAnimator */
public abstract class C15589b {

    /* renamed from: a */
    private static final WeakHashMap<View, C15589b> f64827a = new WeakHashMap<>(0);

    /* renamed from: a */
    public static C15589b m94771a(View view) {
        WeakHashMap<View, C15589b> weakHashMap = f64827a;
        C15589b bVar = weakHashMap.get(view);
        if (bVar == null) {
            int intValue = Integer.valueOf(Build.VERSION.SDK).intValue();
            if (intValue >= 14) {
                bVar = new C15595d(view);
            } else if (intValue >= 11) {
                bVar = new C15590c(view);
            } else {
                bVar = new C15596e(view);
            }
            weakHashMap.put(view, bVar);
        }
        return bVar;
    }

    /* renamed from: b */
    public abstract C15589b mo74936b(long j);

    /* renamed from: c */
    public abstract C15589b mo74937c(Interpolator interpolator);

    /* renamed from: d */
    public abstract C15589b mo74938d(float f);
}
