package com.arlosoft.macrodroid.action.screenshot;

import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.view.View;
import com.arlosoft.macrodroid.C17541R$string;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p319lc.C15626c;

/* compiled from: CaptureActivity.kt */
public final class CaptureActivity extends Activity {

    /* renamed from: d */
    public static final C3425a f9095d = new C3425a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static MediaProjection f9096f;

    /* renamed from: a */
    private MediaProjectionManager f9097a;

    /* renamed from: c */
    public Map<Integer, View> f9098c = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.action.screenshot.CaptureActivity$a */
    /* compiled from: CaptureActivity.kt */
    public static final class C3425a {
        private C3425a() {
        }

        public /* synthetic */ C3425a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final MediaProjection mo26770a() {
            return CaptureActivity.f9096f;
        }

        /* renamed from: b */
        public final void mo26771b(MediaProjection mediaProjection) {
            CaptureActivity.f9096f = mediaProjection;
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            MediaProjectionManager mediaProjectionManager = null;
            if (i2 == -1) {
                MediaProjectionManager mediaProjectionManager2 = this.f9097a;
                if (mediaProjectionManager2 == null) {
                    C13706o.m87945v("mediaProjectionManager");
                } else {
                    mediaProjectionManager = mediaProjectionManager2;
                }
                C13706o.m87926c(intent);
                f9096f = mediaProjectionManager.getMediaProjection(i2, intent);
                Intent action = new Intent(this, CaptureService.class).setAction("enable_capture");
                C13706o.m87928e(action, "Intent(this, CaptureServ…ce.ACTION_ENABLE_CAPTURE)");
                startService(action);
            } else {
                f9096f = null;
                C15626c.makeText(getApplicationContext(), C17541R$string.error, 0).show();
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object systemService = getSystemService("media_projection");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) systemService;
        this.f9097a = mediaProjectionManager;
        if (mediaProjectionManager == null) {
            C13706o.m87945v("mediaProjectionManager");
            mediaProjectionManager = null;
        }
        startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 1);
    }
}
