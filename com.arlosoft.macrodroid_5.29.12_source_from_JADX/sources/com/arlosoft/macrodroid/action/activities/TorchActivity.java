package com.arlosoft.macrodroid.action.activities;

import android.hardware.Camera;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.NonAppActivity;
import java.io.IOException;
import p257f0.C12214t;
import p319lc.C15626c;

public class TorchActivity extends NonAppActivity implements SurfaceHolder.Callback {

    /* renamed from: s */
    private static boolean f7862s = false;

    /* renamed from: z */
    private static TorchActivity f7863z;

    /* renamed from: o */
    private Camera f7864o;

    /* renamed from: p */
    private SurfaceHolder f7865p;

    /* renamed from: M1 */
    public static boolean m13999M1() {
        return f7862s;
    }

    /* renamed from: N1 */
    public static void m14000N1() {
        TorchActivity torchActivity = f7863z;
        if (torchActivity != null) {
            torchActivity.finish();
            f7863z = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public /* synthetic */ void m14001O1(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView((int) C17535R$layout.torch_layout);
        getWindow().setWindowAnimations(0);
        overridePendingTransition(0, 0);
        f7863z = this;
        ((Button) findViewById(C17532R$id.torch_layout_cancel)).setOnClickListener(new C12214t(this));
    }

    public void onPause() {
        super.onPause();
        Camera camera = this.f7864o;
        if (camera != null) {
            camera.stopPreview();
            this.f7864o.release();
            this.f7864o = null;
            this.f7865p = null;
        }
        f7862s = false;
    }

    public void onResume() {
        super.onResume();
        try {
            ((SurfaceView) findViewById(C17532R$id.PREVIEW)).getHolder().addCallback(this);
            Camera open = Camera.open();
            this.f7864o = open;
            Camera.Parameters parameters = open.getParameters();
            parameters.setFlashMode("torch");
            this.f7864o.setParameters(parameters);
            this.f7864o.startPreview();
            f7862s = true;
        } catch (RuntimeException unused) {
            f7862s = false;
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.action_camera_flash_camera_failed), 0).show();
            finish();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.f7865p = surfaceHolder;
            Camera camera = this.f7864o;
            if (camera != null) {
                camera.setPreviewDisplay(surfaceHolder);
            }
        } catch (IOException unused) {
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Camera camera = this.f7864o;
        if (camera != null) {
            camera.stopPreview();
            this.f7865p = null;
        }
    }
}
