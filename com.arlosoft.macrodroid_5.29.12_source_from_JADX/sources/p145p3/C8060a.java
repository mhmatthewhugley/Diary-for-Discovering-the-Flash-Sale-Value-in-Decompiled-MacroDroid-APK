package p145p3;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@RequiresApi(api = 23)
/* renamed from: p3.a */
/* compiled from: MediaSessionManagerWrapper */
public class C8060a {

    /* renamed from: a */
    private MediaSessionManager f19654a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8062b f19655b;

    /* renamed from: p3.a$a */
    /* compiled from: MediaSessionManagerWrapper */
    public class C8061a implements InvocationHandler {
        public C8061a() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            C8060a.this.f19655b.mo32079a(objArr[0]);
            return new Object();
        }
    }

    /* renamed from: p3.a$b */
    /* compiled from: MediaSessionManagerWrapper */
    public interface C8062b {
        /* renamed from: a */
        void mo32079a(KeyEvent keyEvent);
    }

    public C8060a(Context context, C8062b bVar) {
        this.f19655b = bVar;
        MediaSessionManager mediaSessionManager = (MediaSessionManager) context.getSystemService(MediaSessionManager.class);
        this.f19654a = mediaSessionManager;
        try {
            mediaSessionManager.getClass();
            Class<?> cls = Class.forName("android.media.session.MediaSessionManager$OnVolumeKeyLongPressListener");
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C8061a());
            this.f19654a.getClass().getMethod("setOnVolumeKeyLongPressListener", new Class[]{cls, Handler.class}).invoke(this.f19654a, new Object[]{newProxyInstance, null});
        } catch (Exception e) {
            C4878b.m18868g("Failed to call setOnVolumeKeyLongPressListener: " + e.toString());
        }
    }
}
