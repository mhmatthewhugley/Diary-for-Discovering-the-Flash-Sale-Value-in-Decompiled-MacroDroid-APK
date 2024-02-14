package p122l0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.lang.reflect.Method;

@RequiresApi(api = 26)
/* renamed from: l0.c */
/* compiled from: MyOreoWifiManager */
public class C7591c {

    /* renamed from: b */
    private static final String f18497b = "c";

    /* renamed from: a */
    private Context f18498a;

    public C7591c(Context context) {
        this.f18498a = context;
    }

    /* renamed from: a */
    public void mo37662a(C7590b bVar, Handler handler) {
        Object obj;
        Class<?> cls = null;
        try {
            obj = new C7589a(this.f18498a, bVar).mo37661b().getDeclaredConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{0});
        } catch (Exception e) {
            e.printStackTrace();
            obj = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f18498a.getApplicationContext().getSystemService(ConnectivityManager.class);
        try {
            cls = Class.forName("android.net.ConnectivityManager$OnStartTetheringCallback");
        } catch (ClassNotFoundException e2) {
            try {
                e2.printStackTrace();
            } catch (Exception unused) {
                C4878b.m18868g("Could not modify hotspot: $e");
                return;
            }
        }
        Method declaredMethod = connectivityManager.getClass().getDeclaredMethod("startTethering", new Class[]{Integer.TYPE, Boolean.TYPE, cls, Handler.class});
        if (declaredMethod == null) {
            Log.e(f18497b, "startTetheringMethod is null");
            return;
        }
        declaredMethod.invoke(connectivityManager, new Object[]{0, Boolean.FALSE, obj, handler});
    }

    /* renamed from: b */
    public void mo37663b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f18498a.getApplicationContext().getSystemService(ConnectivityManager.class);
        try {
            Method declaredMethod = connectivityManager.getClass().getDeclaredMethod("stopTethering", new Class[]{Integer.TYPE});
            if (declaredMethod == null) {
                Log.e(f18497b, "stopTetheringMethod is null");
                return;
            }
            declaredMethod.invoke(connectivityManager, new Object[]{0});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
