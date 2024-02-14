package p160s0;

import android.app.Activity;
import android.app.Application;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import dagger.android.C11986a;
import kotlin.jvm.internal.C13706o;
import p166t0.C10238a;

/* renamed from: s0.d1 */
/* compiled from: BaseActivityComponentBuilder.kt */
public abstract class C8234d1<T extends Activity> extends C11986a.C11987a<T> {
    /* renamed from: d */
    public abstract C8234d1<T> mo38294d(C10238a aVar);

    /* renamed from: e */
    public void mo38293c(T t) {
        C13706o.m87929f(t, "instance");
        Application application = t.getApplication();
        C13706o.m87927d(application, "null cannot be cast to non-null type com.arlosoft.macrodroid.app.MacroDroidApplication");
        mo38294d(((MacroDroidApplication) application).mo27286l(t));
    }
}
