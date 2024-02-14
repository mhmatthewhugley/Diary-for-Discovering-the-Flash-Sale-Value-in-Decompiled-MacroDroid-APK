package com.arlosoft.macrodroid.action.activities;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.documentfile.provider.DocumentFile;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NonAppActivityWithPreventClash;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import p148q0.C8151a;
import p156r2.C8194a;
import p257f0.C12212r;
import p257f0.C12213s;
import p319lc.C15626c;

public class TakePictureActivity extends NonAppActivityWithPreventClash implements SurfaceHolder.Callback {

    /* renamed from: A */
    private Camera f7844A;

    /* renamed from: B */
    private Camera.PictureCallback f7845B;

    /* renamed from: C */
    private int f7846C;

    /* renamed from: D */
    private int f7847D;

    /* renamed from: E */
    private String f7848E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public String f7849F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f7850G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public String f7851H = null;

    /* renamed from: z */
    private SurfaceHolder f7852z;

    /* renamed from: com.arlosoft.macrodroid.action.activities.TakePictureActivity$a */
    class C2830a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f7853a;

        /* renamed from: c */
        final /* synthetic */ int f7854c;

        /* renamed from: d */
        final /* synthetic */ boolean f7855d;

        /* renamed from: f */
        final /* synthetic */ int f7856f;

        /* renamed from: g */
        final /* synthetic */ String f7857g;

        /* renamed from: o */
        final /* synthetic */ String f7858o;

        /* renamed from: p */
        final /* synthetic */ String f7859p;

        /* renamed from: s */
        final /* synthetic */ long f7860s;

        C2830a(Context context, int i, boolean z, int i2, String str, String str2, String str3, long j) {
            this.f7853a = context;
            this.f7854c = i;
            this.f7855d = z;
            this.f7856f = i2;
            this.f7857g = str;
            this.f7858o = str2;
            this.f7859p = str3;
            this.f7860s = j;
        }

        public void run() {
            try {
                Intent intent = new Intent(this.f7853a, TakePictureActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("CameraId", this.f7854c);
                intent.putExtra("ShowIcon", this.f7855d);
                intent.putExtra("FlashOption", this.f7856f);
                intent.putExtra("FilePathUri", this.f7857g);
                intent.putExtra("FilePath", this.f7858o);
                intent.putExtra("com.arlosoft.macrodroid.MACRO_NAME", this.f7859p);
                intent.putExtra("guid", this.f7860s);
                this.f7853a.startActivity(intent);
            } catch (Exception e) {
                C4878b.m18868g("Failed to take picture: " + e.toString());
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.activities.TakePictureActivity$b */
    private class C2831b extends AsyncTask<byte[], String, String> {
        private C2831b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(byte[]... bArr) {
            OutputStream outputStream;
            String str = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss").format(new Date()) + ".jpg";
            try {
                if (TakePictureActivity.this.f7851H != null) {
                    DocumentFile fromTreeUri = DocumentFile.fromTreeUri(MacroDroidApplication.m14845u(), Uri.parse(TakePictureActivity.this.f7851H));
                    DocumentFile findFile = fromTreeUri.findFile(str);
                    if (findFile == null) {
                        findFile = fromTreeUri.createFile("application/custom", str);
                    }
                    if (findFile == null) {
                        TakePictureActivity.this.m13995Y1(str);
                        return null;
                    }
                    outputStream = TakePictureActivity.this.getContentResolver().openOutputStream(findFile.getUri(), "wa");
                    if (outputStream == null) {
                        C4878b.m18871j("Taking picture failed: Error writing to picture file", TakePictureActivity.this.f7849F);
                        C4878b.m18871j(TakePictureActivity.this.getString(C17541R$string.please_reconfigure_take_picture_action_path), TakePictureActivity.this.f7849F);
                        return TakePictureActivity.this.getString(C17541R$string.error) + " - " + TakePictureActivity.this.getString(C17541R$string.take_picture_action);
                    }
                    findFile.getUri().toString();
                } else if (TakePictureActivity.this.f7850G != null) {
                    C4878b.m18871j("No file path found for taking picture, defaulting to MacroDroid/Photos", TakePictureActivity.this.f7849F);
                    String unused = TakePictureActivity.this.f7850G = new File(Environment.getExternalStorageDirectory(), "MacroDroid/Photos").getAbsolutePath();
                    File file = new File(TakePictureActivity.this.f7850G);
                    if (file.exists() || file.mkdirs()) {
                        File file2 = new File(file + "/" + str);
                        outputStream = new FileOutputStream(file2);
                        file2.getAbsolutePath();
                    } else {
                        C4878b.m18873l("Take Picture Failed - could not write to external storage");
                        C4061t1.m16023v(TakePictureActivity.this, "Take Picture Failed", "Could not write to external storage", false);
                        return null;
                    }
                } else {
                    outputStream = null;
                }
                if (bArr != null) {
                    if (bArr[0] != null) {
                        outputStream.write(bArr[0]);
                        outputStream.close();
                        System.gc();
                        return null;
                    }
                }
                C4878b.m18868g("TakePictureActivity: Error writing to picture file jpeg was null");
                C8151a.m33873n(new RuntimeException("TakePictureActivity: Error writing to picture file jpeg was null"));
                return TakePictureActivity.this.getString(C17541R$string.error) + " - " + TakePictureActivity.this.getString(C17541R$string.take_picture_action);
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    TakePictureActivity takePictureActivity = TakePictureActivity.this;
                    takePictureActivity.m13995Y1(takePictureActivity.f7850G);
                }
                C4878b.m18871j("Taking picture failed: Error writing to picture file: " + e.getMessage(), TakePictureActivity.this.f7849F);
                C4878b.m18871j(TakePictureActivity.this.getString(C17541R$string.please_reconfigure_take_picture_action_path), TakePictureActivity.this.f7849F);
                return TakePictureActivity.this.getString(C17541R$string.error) + " - " + TakePictureActivity.this.getString(C17541R$string.take_picture_action);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str != null) {
                C15626c.m94876a(MacroDroidApplication.m14845u(), str, 1).show();
            }
        }

        /* synthetic */ C2831b(TakePictureActivity takePictureActivity, C2830a aVar) {
            this();
        }
    }

    /* renamed from: V1 */
    public static void m13992V1(Context context, int i, boolean z, int i2, String str, String str2, String str3, long j) {
        new Handler().postDelayed(new C2830a(context, i, z, i2, str, str2, str3, j), NonAppActivityWithPreventClash.m15476N1());
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m13993W1(Camera.CameraInfo cameraInfo, byte[] bArr, Camera camera) {
        new C2831b(this, (C2830a) null).execute(new byte[][]{bArr});
        if (cameraInfo.canDisableShutterSound) {
            this.f7844A.enableShutterSound(true);
        }
        C4878b.m18873l("Picture Taken");
        finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:5|6|7|8|9|10|11|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0034 */
    /* renamed from: X1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m13994X1() {
        /*
            r5 = this;
            r0 = 0
            android.hardware.Camera r1 = r5.f7844A     // Catch:{ Exception -> 0x000b }
            if (r1 == 0) goto L_0x003e
            android.hardware.Camera$PictureCallback r2 = r5.f7845B     // Catch:{ Exception -> 0x000b }
            r1.takePicture(r0, r0, r2)     // Catch:{ Exception -> 0x000b }
            goto L_0x003e
        L_0x000b:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Take Picture Failed - failed in surfaceCreated:"
            r2.append(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18873l(r2)
            r2 = 0
            java.lang.String r3 = "Take picture failed"
            java.lang.String r4 = "Failed to connect to camera"
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r5, r3, r4, r2)
            p148q0.C8151a.m33873n(r1)
            android.hardware.Camera r1 = r5.f7844A     // Catch:{ Exception -> 0x0034 }
            r1.stopPreview()     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            android.hardware.Camera r1 = r5.f7844A     // Catch:{ Exception -> 0x0039 }
            r1.release()     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            r5.f7844A = r0
            r5.finish()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.activities.TakePictureActivity.m13994X1():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m13995Y1(String str) {
        C4878b.m18871j("Error - could not write to file: " + str + ". Need to re-select path and grant access.", this.f7849F);
        C8194a.m34000a(this, getString(C17541R$string.please_reconfigure_take_picture_action_path), this.f7848E);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.take_picture_layout);
        Window window = getWindow();
        window.addFlags(4194304);
        window.addFlags(524288);
        window.addFlags(2097152);
        if (getIntent() != null) {
            this.f7850G = getIntent().getStringExtra("FilePath");
            this.f7846C = getIntent().getIntExtra("CameraId", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("ShowIcon", true);
            this.f7847D = getIntent().getIntExtra("FlashOption", 0);
            this.f7851H = getIntent().getStringExtra("FilePathUri");
            this.f7848E = getIntent().getStringExtra("com.arlosoft.macrodroid.MACRO_NAME");
            this.f7849F = getIntent().getStringExtra("guid");
            if (!booleanExtra) {
                ((ImageView) findViewById(C17532R$id.take_picture_icon)).setVisibility(8);
            }
        } else {
            C8151a.m33873n(new RuntimeException("TakePictureActivity: the intent was null"));
            this.f7851H = null;
            this.f7846C = 0;
            this.f7847D = 0;
        }
        SurfaceView surfaceView = new SurfaceView(getApplicationContext());
        addContentView(surfaceView, new ViewGroup.LayoutParams(1, 1));
        if (this.f7852z == null) {
            this.f7852z = surfaceView.getHolder();
        }
        this.f7852z.addCallback(this);
        C4878b.m18873l("Taking picture");
        this.f7852z.setType(3);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4;
        Camera camera = this.f7844A;
        if (camera == null) {
            C4878b.m18868g("Take picture failed surfaceChanged mCamera is null");
            finish();
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(this.f7846C, cameraInfo);
            if (cameraInfo.canDisableShutterSound) {
                this.f7844A.enableShutterSound(false);
            }
            Camera.Size h1 = C5163j2.m20168h1(this, this.f7844A, cameraInfo);
            int i5 = this.f7847D;
            if (i5 == 0) {
                parameters.setFlashMode("off");
            } else if (i5 == 1) {
                parameters.setFlashMode("on");
            } else if (i5 == 2) {
                parameters.setFlashMode("auto");
            }
            parameters.setPictureFormat(256);
            int i6 = getResources().getConfiguration().orientation;
            int rotation = getWindowManager().getDefaultDisplay().getRotation();
            int i7 = (((rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 90 : 180 : 270) + 45) / 90) * 90;
            if (cameraInfo.facing == 1) {
                i4 = ((cameraInfo.orientation - i7) + 360) % 360;
            } else {
                i4 = (cameraInfo.orientation + i7) % 360;
            }
            parameters.setRotation(i4);
            parameters.setPictureSize(h1.width, h1.height);
            this.f7845B = new C12212r(this, cameraInfo);
            try {
                this.f7844A.setParameters(parameters);
                this.f7844A.startPreview();
                new Handler().postDelayed(new C12213s(this), 1000);
            } catch (Exception e) {
                C4061t1.m16023v(this, "Take Picture Failed", "Could not take picture at this time", false);
                C4878b.m18868g("Take Picture Failed: " + e.getMessage() + ". Try setting an explicit resolution via MacroDroid Settings -> action options -> Take Picture Action");
                finish();
                if (e instanceof FileNotFoundException) {
                    m13995Y1(this.f7850G);
                }
            }
        } catch (Exception unused) {
            C4878b.m18868g("Take picture failed surfaceChanged camera parameters are empty");
            finish();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceCreated(android.view.SurfaceHolder r4) {
        /*
            r3 = this;
            int r0 = r3.f7846C     // Catch:{ Exception -> 0x000c }
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)     // Catch:{ Exception -> 0x000c }
            r3.f7844A = r0     // Catch:{ Exception -> 0x000c }
            r0.setPreviewDisplay(r4)     // Catch:{ Exception -> 0x000c }
            goto L_0x0049
        L_0x000c:
            r4 = move-exception
            boolean r0 = r4 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r3.f7850G
            r3.m13995Y1(r0)
        L_0x0016:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Take Picture Failed - failed in surfaceCreated: "
            r0.append(r1)
            java.lang.String r1 = r4.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18873l(r0)
            r0 = 0
            java.lang.String r1 = "Take picture failed"
            java.lang.String r2 = "Failed to connect to camera"
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r3, r1, r2, r0)
            p148q0.C8151a.m33873n(r4)
            android.hardware.Camera r4 = r3.f7844A     // Catch:{ Exception -> 0x003e }
            r4.stopPreview()     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            android.hardware.Camera r4 = r3.f7844A     // Catch:{ Exception -> 0x0043 }
            r4.release()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            r4 = 0
            r3.f7844A = r4
            r3.finish()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.activities.TakePictureActivity.surfaceCreated(android.view.SurfaceHolder):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|4|5|6) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceDestroyed(android.view.SurfaceHolder r1) {
        /*
            r0 = this;
            android.hardware.Camera r1 = r0.f7844A
            if (r1 == 0) goto L_0x000f
            r1.stopPreview()     // Catch:{ Exception -> 0x0007 }
        L_0x0007:
            android.hardware.Camera r1 = r0.f7844A     // Catch:{ Exception -> 0x000c }
            r1.release()     // Catch:{ Exception -> 0x000c }
        L_0x000c:
            r1 = 0
            r0.f7844A = r1
        L_0x000f:
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.activities.TakePictureActivity.surfaceDestroyed(android.view.SurfaceHolder):void");
    }
}
