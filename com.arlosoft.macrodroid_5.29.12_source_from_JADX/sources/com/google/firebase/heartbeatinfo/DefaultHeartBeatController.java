package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.p007os.UserManagerCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* renamed from: f */
    private static final ThreadFactory f54803f = C11257e.f54820a;

    /* renamed from: a */
    private final Provider<HeartBeatInfoStorage> f54804a;

    /* renamed from: b */
    private final Context f54805b;

    /* renamed from: c */
    private final Provider<UserAgentPublisher> f54806c;

    /* renamed from: d */
    private final Set<HeartBeatConsumer> f54807d;

    /* renamed from: e */
    private final Executor f54808e;

    private DefaultHeartBeatController(Context context, String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider) {
        this(new C11254b(context, str), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f54803f), provider, context);
    }

    @NonNull
    /* renamed from: h */
    public static Component<DefaultHeartBeatController> m76544h() {
        return Component.m6344d(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).mo22880b(Dependency.m6427j(Context.class)).mo22880b(Dependency.m6427j(FirebaseApp.class)).mo22880b(Dependency.m6429l(HeartBeatConsumer.class)).mo22880b(Dependency.m6428k(UserAgentPublisher.class)).mo22884f(C11253a.f54815a).mo22882d();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ DefaultHeartBeatController m76545i(ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.mo22868a(Context.class), ((FirebaseApp) componentContainer.mo22868a(FirebaseApp.class)).mo61953q(), componentContainer.mo22869c(HeartBeatConsumer.class), componentContainer.mo22887d(UserAgentPublisher.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ String m76546j() throws Exception {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            HeartBeatInfoStorage heartBeatInfoStorage = this.f54804a.get();
            List<HeartBeatResult> c = heartBeatInfoStorage.mo63206c();
            heartBeatInfoStorage.mo63205b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                HeartBeatResult heartBeatResult = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", heartBeatResult.mo63192c());
                jSONObject.put("dates", new JSONArray(heartBeatResult.mo63191b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put(ClientCookie.VERSION_ATTR, ExifInterface.GPS_MEASUREMENT_2D);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ HeartBeatInfoStorage m76547k(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Void m76548l() throws Exception {
        synchronized (this) {
            this.f54804a.get().mo63211k(System.currentTimeMillis(), this.f54806c.get().mo63499a());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ Thread m76549m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* renamed from: a */
    public Task<String> mo63201a() {
        if (!UserManagerCompat.isUserUnlocked(this.f54805b)) {
            return Tasks.m66667f("");
        }
        return Tasks.m66664c(this.f54808e, new C11255c(this));
    }

    @NonNull
    /* renamed from: b */
    public synchronized HeartBeatInfo.HeartBeat mo63202b(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.f54804a.get();
        if (heartBeatInfoStorage.mo63209i(currentTimeMillis)) {
            heartBeatInfoStorage.mo63208g();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    /* renamed from: n */
    public Task<Void> mo63203n() {
        if (this.f54807d.size() <= 0) {
            return Tasks.m66667f(null);
        }
        if (!UserManagerCompat.isUserUnlocked(this.f54805b)) {
            return Tasks.m66667f(null);
        }
        return Tasks.m66664c(this.f54808e, new C11256d(this));
    }

    @VisibleForTesting
    DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.f54804a = provider;
        this.f54807d = set;
        this.f54808e = executor;
        this.f54806c = provider2;
        this.f54805b = context;
    }
}
