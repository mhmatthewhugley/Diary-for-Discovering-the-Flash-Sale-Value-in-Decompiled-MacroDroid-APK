package p257f0;

import android.hardware.Camera;
import com.arlosoft.macrodroid.action.activities.TakePictureActivity;

/* renamed from: f0.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12212r implements Camera.PictureCallback {

    /* renamed from: a */
    public final /* synthetic */ TakePictureActivity f58694a;

    /* renamed from: b */
    public final /* synthetic */ Camera.CameraInfo f58695b;

    public /* synthetic */ C12212r(TakePictureActivity takePictureActivity, Camera.CameraInfo cameraInfo) {
        this.f58694a = takePictureActivity;
        this.f58695b = cameraInfo;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.f58694a.m13993W1(this.f58695b, bArr, camera);
    }
}
