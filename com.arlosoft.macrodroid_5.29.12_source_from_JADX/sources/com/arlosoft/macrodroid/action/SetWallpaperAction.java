package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.io.IOException;
import java.util.List;
import p128m0.C7734e4;
import p319lc.C15626c;

public class SetWallpaperAction extends Action {
    public static final Parcelable.Creator<SetWallpaperAction> CREATOR = new C2672a();
    private static final int OPTION_HOME_AND_LOCK_SCREEN = 2;
    private static final int OPTION_HOME_SCREEN = 0;
    private static final int OPTION_IMAGE = 0;
    private static final int OPTION_LIVE_WALLPAPER = 1;
    private static final int OPTION_LOCK_SCREEN = 1;
    private static final int PHOTO_PICKER_ID = 1;
    private String m_imageName;
    private String m_liveWallpaperClassName;
    private String m_liveWallpaperName;
    private String m_liveWallpaperPackage;
    private int m_option;
    private int m_screenOption;
    private String m_wallpaperUriString;

    /* renamed from: com.arlosoft.macrodroid.action.SetWallpaperAction$a */
    class C2672a implements Parcelable.Creator<SetWallpaperAction> {
        C2672a() {
        }

        /* renamed from: a */
        public SetWallpaperAction createFromParcel(Parcel parcel) {
            return new SetWallpaperAction(parcel, (C2672a) null);
        }

        /* renamed from: b */
        public SetWallpaperAction[] newArray(int i) {
            return new SetWallpaperAction[i];
        }
    }

    /* synthetic */ SetWallpaperAction(Parcel parcel, C2672a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m12802A3(DialogInterface dialogInterface, int i) {
        this.m_screenOption = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        if (this.m_option == 0) {
            m12805D3();
        } else {
            m12809H3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m12803B3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: C3 */
    private void m12804C3(List<ResolveInfo> list) {
        if (list.size() == 0) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_live_wallpapers_found, 0).show();
            return;
        }
        String[] strArr = new String[list.size()];
        String[] strArr2 = new String[list.size()];
        String[] strArr3 = new String[list.size()];
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ResolveInfo resolveInfo = list.get(i2);
            if (resolveInfo.serviceInfo != null) {
                strArr[i2] = resolveInfo.loadLabel(mo27827K0().getPackageManager()).toString();
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                strArr2[i2] = serviceInfo.packageName;
                strArr3[i2] = serviceInfo.name;
                String str = this.m_liveWallpaperPackage;
                if (str != null && str.equals(strArr2[i2])) {
                    i = i2;
                }
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) strArr, i, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C3064fj.f8337a);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3035ej(this, strArr2, strArr, strArr3));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3656zi(this));
    }

    /* renamed from: D3 */
    private void m12805D3() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        try {
            mo27850j0().startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.no_app_available, 0).show();
        }
    }

    /* renamed from: E3 */
    private Bitmap m12806E3(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return createBitmap;
    }

    @RequiresApi(api = 24)
    /* renamed from: F3 */
    private Bitmap m12807F3(Bitmap bitmap, Uri uri) throws IOException {
        int attributeInt = new ExifInterface(mo27827K0().getContentResolver().openInputStream(uri)).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return m12806E3(bitmap, 180);
        }
        if (attributeInt == 6) {
            return m12806E3(bitmap, 90);
        }
        if (attributeInt != 8) {
            return bitmap;
        }
        return m12806E3(bitmap, 270);
    }

    /* renamed from: G3 */
    private Bitmap m12808G3(Bitmap bitmap, String str) throws IOException {
        int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return m12806E3(bitmap, 180);
        }
        if (attributeInt == 6) {
            return m12806E3(bitmap, 90);
        }
        if (attributeInt != 8) {
            return bitmap;
        }
        return m12806E3(bitmap, 270);
    }

    /* renamed from: H3 */
    private void m12809H3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0());
        builder.setMessage((int) C17541R$string.live_wallpaper_warning).setTitle((int) C17541R$string.action_set_wallpaper).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3007dj(this));
        builder.show();
    }

    /* renamed from: I3 */
    private void m12810I3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((int) C17541R$string.select_option);
        builder.setSingleChoiceItems((CharSequence[]) m12822u3(), this.m_screenOption, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C2950bj(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C2978cj(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C2922aj(this));
    }

    /* renamed from: q3 */
    private static int m12818q3(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: r3 */
    private List<ResolveInfo> m12819r3() {
        List<ResolveInfo> queryIntentServices = mo27827K0().getPackageManager().queryIntentServices(new Intent("android.service.wallpaper.WallpaperService"), 128);
        for (int i = 0; i < queryIntentServices.size(); i++) {
            Log.i("TEST", " " + queryIntentServices.get(i).toString());
        }
        return queryIntentServices;
    }

    /* renamed from: s3 */
    private String[] m12820s3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.image), SelectableItem.m15535j1(C17541R$string.live_wallpaper)};
    }

    @RequiresApi(api = 24)
    /* renamed from: t3 */
    private int m12821t3() {
        int i = this.m_screenOption;
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: u3 */
    private String[] m12822u3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.home_screen), SelectableItem.m15535j1(C17541R$string.lock_screen), SelectableItem.m15535j1(C17541R$string.home_and_lock_screen)};
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m12824w3(String[] strArr, String[] strArr2, String[] strArr3, DialogInterface dialogInterface, int i) {
        int checkedItemPosition = ((AlertDialog) dialogInterface).getListView().getCheckedItemPosition();
        this.m_liveWallpaperPackage = strArr[checkedItemPosition];
        this.m_liveWallpaperName = strArr2[checkedItemPosition];
        this.m_liveWallpaperClassName = strArr3[checkedItemPosition];
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m12825x3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m12826y3(DialogInterface dialogInterface, int i) {
        m12804C3(m12819r3());
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m12827z3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        int i = this.m_option;
        if (i != 0) {
            return i == 1 ? this.m_liveWallpaperName : "";
        }
        String str = this.m_wallpaperUriString;
        if (str == null) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("//");
        if (lastIndexOf == -1) {
            return this.m_wallpaperUriString;
        }
        return this.m_wallpaperUriString.substring(lastIndexOf + 2);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7734e4.m32261u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0169 A[Catch:{ Exception -> 0x0174 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a6 A[Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01d1 A[Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }] */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo r13) {
        /*
            r12 = this;
            java.lang.String r13 = "/NO_TRANSFORM"
            java.lang.String r0 = "/ACTUAL"
            java.lang.String r1 = "content://com.google.android.apps.photos.contentprovider"
            java.lang.String r2 = "window"
            int r3 = r12.m_option
            r4 = 1
            if (r3 != r4) goto L_0x0062
            java.lang.String r3 = r12.m_liveWallpaperPackage
            if (r3 != 0) goto L_0x001f
            java.lang.Long r13 = r12.mo27840Y0()
            long r0 = r13.longValue()
            java.lang.String r13 = "Cannot change live wallpaper package name is null"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r13, r0)
            return
        L_0x001f:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = "android.service.wallpaper.CHANGE_LIVE_WALLPAPER"
            r3.<init>(r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r5 = "android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT"
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ Exception -> 0x0041 }
            java.lang.String r7 = r12.m_liveWallpaperPackage     // Catch:{ Exception -> 0x0041 }
            java.lang.String r8 = r12.m_liveWallpaperClassName     // Catch:{ Exception -> 0x0041 }
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0041 }
            r3.putExtra(r5, r6)     // Catch:{ Exception -> 0x0041 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r5)     // Catch:{ Exception -> 0x0041 }
            android.content.Context r5 = r12.mo27827K0()     // Catch:{ Exception -> 0x0041 }
            r5.startActivity(r3)     // Catch:{ Exception -> 0x0041 }
            return
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Could not set live wallpaper: "
            r5.append(r6)
            java.lang.String r3 = r3.toString()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Long r5 = r12.mo27840Y0()
            long r5 = r5.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r3, r5)
        L_0x0062:
            android.content.Context r3 = r12.mo27827K0()
            android.app.WallpaperManager r3 = android.app.WallpaperManager.getInstance(r3)
            android.content.Context r5 = r12.mo27827K0()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.view.WindowManager r5 = (android.view.WindowManager) r5     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.view.Display r5 = r5.getDefaultDisplay()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r6 = r12.m_imageName     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r7 = 24
            r8 = 0
            if (r6 == 0) goto L_0x00c8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r13.<init>()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.content.Context r0 = r12.mo27827K0()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r13.append(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r0 = "/"
            r13.append(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r0 = r12.m_imageName     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r13.append(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r13 = r13.toString()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r0.inJustDecodeBounds = r4     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.BitmapFactory.decodeFile(r13, r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r6 = r5.getWidth()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r5 = r5.getHeight()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r5 = m12818q3(r0, r6, r5)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r1.inSampleSize = r5     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r0.inPreferredConfig = r5     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r13, r1)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.Bitmap r13 = r12.m12808G3(r0, r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            goto L_0x01d2
        L_0x00c8:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r6.inJustDecodeBounds = r4     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r9 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            boolean r9 = r9.startsWith(r1)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r10 = "utf-8"
            java.lang.String r11 = "content"
            if (r9 == 0) goto L_0x00fa
            java.lang.String r9 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            boolean r9 = r9.contains(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            if (r9 == 0) goto L_0x00fa
            java.lang.String r13 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r1 = r13.lastIndexOf(r11)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r9 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r0 = r9.lastIndexOf(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r13 = r13.substring(r1, r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r13 = java.net.URLDecoder.decode(r13, r10)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r12.m_wallpaperUriString = r13     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            goto L_0x0120
        L_0x00fa:
            java.lang.String r0 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            boolean r0 = r0.startsWith(r1)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            boolean r0 = r0.contains(r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r1 = r0.lastIndexOf(r11)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r9 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r13 = r9.lastIndexOf(r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r13 = r0.substring(r1, r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r13 = java.net.URLDecoder.decode(r13, r10)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r12.m_wallpaperUriString = r13     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
        L_0x0120:
            android.content.Context r13 = r12.mo27827K0()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r0 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.io.InputStream r13 = r13.openInputStream(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.BitmapFactory.decodeStream(r13, r8, r6)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r13 = r5.getWidth()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r0 = r5.getHeight()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r13 = m12818q3(r6, r13, r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r0.inSampleSize = r13     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r13 = 0
            r1 = 2131952250(0x7f13027a, float:1.9540937E38)
            r5 = 2131952248(0x7f130278, float:1.9540933E38)
            android.content.Context r6 = r12.mo27827K0()     // Catch:{ Exception -> 0x0176 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x0176 }
            java.lang.String r9 = r12.m_wallpaperUriString     // Catch:{ Exception -> 0x0176 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0176 }
            java.io.InputStream r6 = r6.openInputStream(r9)     // Catch:{ Exception -> 0x0176 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r6, r8, r0)     // Catch:{ Exception -> 0x0176 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0174 }
            if (r6 <= r7) goto L_0x01a4
            java.lang.String r6 = r12.m_wallpaperUriString     // Catch:{ Exception -> 0x0174 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x0174 }
            android.graphics.Bitmap r0 = r12.m12807F3(r0, r6)     // Catch:{ Exception -> 0x0174 }
            goto L_0x01a4
        L_0x0174:
            r6 = move-exception
            goto L_0x0178
        L_0x0176:
            r6 = move-exception
            r0 = r8
        L_0x0178:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r10.<init>()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r11 = "Exception loading wallpaper: "
            r10.append(r11)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r6 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r10.append(r6)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r6 = r10.toString()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r9.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            p148q0.C8151a.m33873n(r9)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.content.Context r6 = r12.mo27827K0()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r9 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r5)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r10 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r1)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r6, r9, r10, r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
        L_0x01a4:
            if (r0 != 0) goto L_0x01d1
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r3 = "Image was null when setting wallpaper: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r3 = r12.m_wallpaperUriString     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            p148q0.C8151a.m33873n(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.content.Context r0 = r12.mo27827K0()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r2 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r5)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.String r1 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r1)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r0, r2, r1, r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            return
        L_0x01d1:
            r13 = r0
        L_0x01d2:
            int r0 = r13.getWidth()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r1 = r13.getHeight()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r5 = r3.getDesiredMinimumHeight()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.content.Context r6 = r12.mo27827K0()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r6 = r6.heightPixels     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.content.Context r6 = r12.mo27827K0()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            if (r5 >= 0) goto L_0x0200
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r5 = r2.getHeight()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
        L_0x0200:
            if (r1 >= r5) goto L_0x0223
            double r5 = (double) r5     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            double r1 = (double) r1     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            double r5 = r5 / r1
            double r9 = (double) r0     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            double r9 = r9 * r5
            int r0 = (int) r9     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            double r1 = r1 * r5
            int r1 = (int) r1     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r13, r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r13.recycle()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            if (r13 >= r7) goto L_0x021b
            r3.setBitmap(r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            goto L_0x0276
        L_0x021b:
            int r13 = r12.m12821t3()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r3.setBitmap(r0, r8, r4, r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            goto L_0x0276
        L_0x0223:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            if (r0 >= r7) goto L_0x022b
            r3.setBitmap(r13)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            goto L_0x0276
        L_0x022b:
            int r0 = r12.m12821t3()     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            r3.setBitmap(r13, r8, r4, r0)     // Catch:{ FileNotFoundException -> 0x0255, Exception -> 0x0233 }
            goto L_0x0276
        L_0x0233:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception: "
            r0.append(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.Long r0 = r12.mo27840Y0()
            long r0 = r0.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r13, r0)
            goto L_0x0276
        L_0x0255:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FileNotFoundException: "
            r0.append(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.Long r0 = r12.mo27840Y0()
            long r0 = r0.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18880s(r13, r0)
        L_0x0276:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetWallpaperAction.mo24675a3(com.arlosoft.macrodroid.triggers.TriggerContextInfo):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12820s3();
    }

    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v9, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0052 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b A[SYNTHETIC, Splitter:B:27:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a2 A[SYNTHETIC, Splitter:B:31:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae A[SYNTHETIC, Splitter:B:38:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b5 A[SYNTHETIC, Splitter:B:42:0x00b5] */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24713q1(android.app.Activity r4, int r5, int r6, android.content.Intent r7) {
        /*
            r3 = this;
            r3.mo27877y2(r4)
            r0 = 1
            if (r5 != r0) goto L_0x00b9
            r5 = -1
            if (r6 != r5) goto L_0x00b9
            android.net.Uri r6 = r7.getData()
            java.lang.String r6 = r6.toString()
            r3.m_wallpaperUriString = r6
            java.util.UUID r6 = java.util.UUID.randomUUID()
            long r6 = r6.getLeastSignificantBits()
            long r6 = java.lang.Math.abs(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3.m_imageName = r6
            r6 = 0
            r7 = 0
            android.content.Context r0 = r3.mo27827K0()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r1 = r3.m_wallpaperUriString     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.io.InputStream r0 = r0.openInputStream(r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r1 = r3.m_imageName     // Catch:{ Exception -> 0x0058, all -> 0x0056 }
            java.io.FileOutputStream r6 = r4.openFileOutput(r1, r7)     // Catch:{ Exception -> 0x0058, all -> 0x0056 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0058, all -> 0x0056 }
        L_0x0043:
            int r1 = r0.read(r4)     // Catch:{ Exception -> 0x0058, all -> 0x0056 }
            if (r1 == r5) goto L_0x004d
            r6.write(r4, r7, r1)     // Catch:{ Exception -> 0x0058, all -> 0x0056 }
            goto L_0x0043
        L_0x004d:
            if (r6 == 0) goto L_0x0052
            r6.close()     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            r0.close()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a5
        L_0x0056:
            r4 = move-exception
            goto L_0x00ac
        L_0x0058:
            r4 = move-exception
            r5 = r6
            r6 = r0
            goto L_0x0061
        L_0x005c:
            r4 = move-exception
            r0 = r6
            goto L_0x00ac
        L_0x005f:
            r4 = move-exception
            r5 = r6
        L_0x0061:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "Failed to set wallpaper: "
            r0.append(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00a9 }
            r0.append(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a9 }
            java.lang.Long r1 = r3.mo27840Y0()     // Catch:{ all -> 0x00a9 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x00a9 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r1)     // Catch:{ all -> 0x00a9 }
            p148q0.C8151a.m33873n(r4)     // Catch:{ all -> 0x00a9 }
            android.content.Context r4 = r3.mo27827K0()     // Catch:{ all -> 0x00a9 }
            r0 = 2131952248(0x7f130278, float:1.9540933E38)
            java.lang.String r0 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r0)     // Catch:{ all -> 0x00a9 }
            r1 = 2131952250(0x7f13027a, float:1.9540937E38)
            java.lang.String r1 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r1)     // Catch:{ all -> 0x00a9 }
            com.arlosoft.macrodroid.common.C4061t1.m16023v(r4, r0, r1, r7)     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x00a0
            r5.close()     // Catch:{ Exception -> 0x009f }
            goto L_0x00a0
        L_0x009f:
        L_0x00a0:
            if (r6 == 0) goto L_0x00a5
            r6.close()     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            r3.mo24689O1()
            goto L_0x00b9
        L_0x00a9:
            r4 = move-exception
            r0 = r6
            r6 = r5
        L_0x00ac:
            if (r6 == 0) goto L_0x00b3
            r6.close()     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00b3
        L_0x00b2:
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
            r0.close()     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            throw r4
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.SetWallpaperAction.mo24713q1(android.app.Activity, int, int, android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        super.mo24714u1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (Build.VERSION.SDK_INT >= 24 && this.m_option == 0) {
            m12810I3();
        } else if (this.m_option == 0) {
            m12805D3();
        } else {
            m12809H3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_wallpaperUriString);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_screenOption);
        parcel.writeString(this.m_liveWallpaperName);
        parcel.writeString(this.m_liveWallpaperPackage);
        parcel.writeString(this.m_liveWallpaperClassName);
        parcel.writeString(this.m_imageName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public SetWallpaperAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetWallpaperAction() {
    }

    private SetWallpaperAction(Parcel parcel) {
        super(parcel);
        this.m_wallpaperUriString = parcel.readString();
        this.m_option = parcel.readInt();
        this.m_screenOption = parcel.readInt();
        this.m_liveWallpaperName = parcel.readString();
        this.m_liveWallpaperPackage = parcel.readString();
        this.m_liveWallpaperClassName = parcel.readString();
        this.m_imageName = parcel.readString();
    }
}
