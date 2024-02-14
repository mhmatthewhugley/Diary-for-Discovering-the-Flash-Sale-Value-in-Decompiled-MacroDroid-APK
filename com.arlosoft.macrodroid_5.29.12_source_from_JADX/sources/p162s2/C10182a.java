package p162s2;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.C15276b0;
import kotlinx.coroutines.flow.C15401u;
import kotlinx.coroutines.flow.C15406z;

/* renamed from: s2.a */
/* compiled from: ScreenContentsCache.kt */
public final class C10182a {

    /* renamed from: a */
    private final C15401u<Map<String, String>> f23288a;

    /* renamed from: b */
    private final C15406z<Map<String, String>> f23289b;

    public C10182a() {
        C15401u<Map<String, String>> b = C15276b0.m94087b(0, 1, (C15220e) null, 5, (Object) null);
        this.f23288a = b;
        this.f23289b = b;
    }

    /* renamed from: a */
    public final C15406z<Map<String, String>> mo40782a() {
        return this.f23289b;
    }

    /* renamed from: b */
    public final void mo40783b(Map<String, String> map) {
        C13706o.m87929f(map, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        this.f23288a.mo74652b(map);
    }
}
