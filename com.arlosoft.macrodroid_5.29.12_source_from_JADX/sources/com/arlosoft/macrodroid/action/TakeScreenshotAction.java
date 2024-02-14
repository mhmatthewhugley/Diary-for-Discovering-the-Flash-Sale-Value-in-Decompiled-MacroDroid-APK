package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.services.UploadPhotoService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.services.MacroDroidAccessibilityServiceJellyBean;
import com.arlosoft.macrodroid.utils.C6379f0;
import com.arlosoft.macrodroid.utils.C6383g0;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p128m0.C7819p4;
import p148q0.C8151a;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

public class TakeScreenshotAction extends Action {
    public static final Parcelable.Creator<TakeScreenshotAction> CREATOR = new C2719c();
    private static final int SAVE_TO_DEVICE = 0;
    private static final int SEND_VIA_EMAIL = 1;
    private static final int SHARE_VIA_INTENT = 2;
    private static int s_actionCounter;
    private static ContentObserver s_contentObserver;
    private transient boolean handeNextImageUpdate;
    private transient int hiddenMechanismCount;
    private String m_email;
    private final transient C6383g0 m_gmailHelper;
    private int m_mechanismOption;
    private int m_option;
    private boolean saveToJpeg;
    private transient int temporaryMechanismOption;

    /* renamed from: com.arlosoft.macrodroid.action.TakeScreenshotAction$a */
    class C2717a extends ContentObserver {
        C2717a(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z, Uri uri) {
            TakeScreenshotAction.m13306w3(uri);
            super.onChange(z, uri);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TakeScreenshotAction$b */
    class C2718b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7616a;

        C2718b(Button button) {
            this.f7616a = button;
        }

        public void afterTextChanged(Editable editable) {
            this.f7616a.setEnabled(C4061t1.m15998i0(editable.toString()));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.TakeScreenshotAction$c */
    class C2719c implements Parcelable.Creator<TakeScreenshotAction> {
        C2719c() {
        }

        /* renamed from: a */
        public TakeScreenshotAction createFromParcel(Parcel parcel) {
            return new TakeScreenshotAction(parcel, (C2717a) null);
        }

        /* renamed from: b */
        public TakeScreenshotAction[] newArray(int i) {
            return new TakeScreenshotAction[i];
        }
    }

    /* synthetic */ TakeScreenshotAction(Parcel parcel, C2717a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m13290A3(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            this.saveToJpeg = true;
            C15626c.m94876a(mo27827K0(), "Save to JPEG Enabled", 0).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m13291B3(EditText editText, DialogInterface dialogInterface, int i) {
        this.m_email = editText.getText().toString();
        mo24689O1();
    }

    /* renamed from: C3 */
    private static void m13292C3(Uri uri, Context context, Action action) {
        try {
            Location location = null;
            Cursor query = MediaStore.Images.Media.query(context.getContentResolver(), uri, (String[]) null);
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("title"));
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            File file = new File(context.getExternalFilesDir((String) null), "ScreenShots");
            File file2 = new File(file.getAbsolutePath() + "/" + string + ".jpg");
            if (file.exists() || file.mkdirs()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.close();
                context.getContentResolver().delete(uri, (String) null, (String[]) null);
                LocationManager locationManager = (LocationManager) context.getSystemService("location");
                List<String> providers = locationManager.getProviders(true);
                if (providers != null) {
                    for (String lastKnownLocation : providers) {
                        Location lastKnownLocation2 = locationManager.getLastKnownLocation(lastKnownLocation);
                        if (lastKnownLocation2 != null && (location == null || lastKnownLocation2.getTime() > location.getTime())) {
                            location = lastKnownLocation2;
                        }
                    }
                }
                if (location != null) {
                    ExifInterface exifInterface = new ExifInterface(file2.getAbsolutePath());
                    exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, C6379f0.m24626a(location.getLatitude()));
                    exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, C6379f0.m24627b(location.getLatitude()));
                    exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, C6379f0.m24626a(location.getLongitude()));
                    exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, C6379f0.m24628c(location.getLongitude()));
                    exifInterface.saveAttributes();
                    return;
                }
                return;
            }
            C4061t1.m16023v(context, SelectableItem.m15535j1(C17541R$string.action_take_screenshot_failed), SelectableItem.m15535j1(C17541R$string.action_take_screenshot_write_error), false);
        } catch (Exception e) {
            C4878b.m18869h("Take Screenshot failure: " + e.toString(), action.mo27840Y0().longValue());
        }
    }

    /* renamed from: D3 */
    private String m13293D3() {
        File file;
        int i = this.m_mechanismOption;
        if (i == 0 || i == 1) {
            file = new File(Environment.getExternalStorageDirectory(), "MacroDroid/Screenshots");
        } else if (i == 2 || i == 3) {
            try {
                file = new File("/storage/emulated/legacy", "MacroDroid/Screenshots");
            } catch (Exception e) {
                C8151a.m33873n(new RuntimeException("Failed to take a screenshot: " + e.getMessage()));
                C4061t1.m16023v(mo27827K0(), SelectableItem.m15535j1(C17541R$string.action_take_screenshot_failed), e.getMessage(), false);
                return null;
            }
        } else {
            file = null;
        }
        if (file.exists() || file.mkdirs()) {
            String str = file.getCanonicalPath() + "/" + (new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss").format(new Date()) + ".png");
            int i2 = this.m_mechanismOption;
            if (i2 == 0 || i2 == 2) {
                C4061t1.m16032z0(new String[]{"/system/bin/screencap -p " + str});
            } else if (i2 == 1 || i2 == 3) {
                C4061t1.m15947B0(new String[]{"/system/bin/screencap -p " + str});
            }
            return str;
        }
        C4061t1.m16023v(mo27827K0(), SelectableItem.m15535j1(C17541R$string.action_take_screenshot_failed), SelectableItem.m15535j1(C17541R$string.action_take_screenshot_write_error), false);
        return null;
    }

    /* renamed from: E3 */
    private void m13294E3() {
        Activity j0 = mo27850j0();
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setTitle((int) C17541R$string.send_via_email);
        int dimensionPixelOffset = mo27827K0().getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium);
        EditText editText = new EditText(new ContextThemeWrapper((Context) j0, mo24705l0()));
        editText.setInputType(32);
        editText.setHint(C17541R$string.enter_email_address);
        int dimensionPixelSize = mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.input_text_dialog_top_margin);
        String str = this.m_email;
        if (str != null) {
            editText.setText(str);
            editText.setSelection(editText.length());
        }
        editText.setSingleLine();
        editText.setMinimumWidth(mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.alert_dialog_input_min_width));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3524um(this, editText));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(create.getWindow().getAttributes());
        layoutParams.width = -1;
        create.getWindow().setAttributes(layoutParams);
        create.setView(editText, dimensionPixelOffset, dimensionPixelSize, dimensionPixelOffset, 0);
        create.show();
        Button button = create.getButton(-1);
        button.setEnabled(C4061t1.m15998i0(editText.getText().toString()));
        editText.addTextChangedListener(new C2718b(button));
    }

    /* renamed from: F3 */
    private static void m13295F3(String str, Uri uri, Context context, String str2) {
        Intent intent = new Intent(context, UploadPhotoService.class);
        intent.putExtra("UploadSite", "Email");
        intent.putExtra("EmailAddress", str2);
        intent.putExtra("Subject", SelectableItem.m15535j1(C17541R$string.screenshot_email_subject));
        intent.putExtra("Body", "");
        if (str != null) {
            intent.putExtra("photo_file", str);
        }
        if (uri != null) {
            intent.putExtra("photo_uri", uri);
        }
        context.startService(intent);
    }

    /* renamed from: H3 */
    private static void m13296H3(String str, Uri uri, Context context) {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/png");
        if (uri == null && str != null) {
            uri = Uri.fromFile(new File(str));
        }
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
        context.startActivity(Intent.createChooser(intent, SelectableItem.m15535j1(C17541R$string.action_take_screenshot_share)).addFlags(268435456));
    }

    /* renamed from: o3 */
    private void m13302o3() {
        GoogleAccountCredential c = this.m_gmailHelper.mo32426c();
        if (c.mo60271b() == null) {
            this.m_gmailHelper.mo32425b(c, mo27850j0());
        } else {
            m13294E3();
        }
    }

    /* renamed from: p3 */
    private void m13303p3() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
            builder.setTitle((CharSequence) mo24772h1());
            builder.setSingleChoiceItems((CharSequence[]) m13304s3(), this.m_mechanismOption, (DialogInterface.OnClickListener) new C3497tm(this));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3457sm(this));
            AlertDialog create = builder.create();
            create.show();
            create.setOnCancelListener(new C3406rm(this));
            C15626c.makeText(j0.getApplicationContext(), C17541R$string.try_alternative_mechanism, 1).show();
        }
    }

    /* renamed from: s3 */
    private String[] m13304s3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.mechanism) + " 1", SelectableItem.m15535j1(C17541R$string.mechanism) + " 2", SelectableItem.m15535j1(C17541R$string.mechanism) + " 3", SelectableItem.m15535j1(C17541R$string.mechanism) + " 4"};
    }

    /* renamed from: u3 */
    private String[] m13305u3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_take_screenshot_save), SelectableItem.m15535j1(C17541R$string.send_via_email), SelectableItem.m15535j1(C17541R$string.action_take_screenshot_intent)};
    }

    /* renamed from: w3 */
    public static void m13306w3(Uri uri) {
        if (uri != null) {
            MacroDroidApplication u = MacroDroidApplication.m14845u();
            for (Macro actions : C4934n.m18998M().mo29710z()) {
                Iterator<Action> it = actions.getActions().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Action next = it.next();
                        if (next instanceof TakeScreenshotAction) {
                            TakeScreenshotAction takeScreenshotAction = (TakeScreenshotAction) next;
                            if (takeScreenshotAction.mo25838r3()) {
                                if (takeScreenshotAction.mo25840v3()) {
                                    m13292C3(uri, u, takeScreenshotAction);
                                } else {
                                    int t3 = takeScreenshotAction.mo25839t3();
                                    if (t3 == 1) {
                                        m13295F3((String) null, uri, u, takeScreenshotAction.mo25837q3());
                                    } else if (t3 == 2) {
                                        m13296H3((String) null, uri, u);
                                    }
                                }
                                takeScreenshotAction.mo25836G3(false);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m13307x3(DialogInterface dialogInterface, int i) {
        this.temporaryMechanismOption = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m13308y3(DialogInterface dialogInterface, int i) {
        this.m_mechanismOption = this.temporaryMechanismOption;
        int i2 = this.m_option;
        if (i2 == 0) {
            mo24689O1();
        } else if (i2 == 1) {
            m13302o3();
        } else if (i2 == 2) {
            mo24689O1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m13309z3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G3 */
    public void mo25836G3(boolean z) {
        this.handeNextImageUpdate = z;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (Build.VERSION.SDK_INT < 28 || this.m_option != 0 || !this.saveToJpeg) {
            return m13305u3()[this.m_option];
        }
        return m13305u3()[0] + " (JPG)";
    }

    /* renamed from: S0 */
    public int mo25558S0() {
        return C17530R$drawable.ic_cellphone_android_white_24dp;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7819p4.m32679u();
    }

    /* renamed from: U2 */
    public void mo24692U2() {
        int i = s_actionCounter - 1;
        s_actionCounter = i;
        if (i == 0 && s_contentObserver != null) {
            MacroDroidApplication.m14845u().getContentResolver().unregisterContentObserver(s_contentObserver);
        }
    }

    /* renamed from: V2 */
    public void mo24694V2() {
        if (s_actionCounter == 0) {
            s_contentObserver = new C2717a(new Handler());
            MacroDroidApplication.m14845u().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, s_contentObserver);
        }
        s_actionCounter++;
    }

    /* renamed from: a1 */
    public String mo25559a1() {
        return mo27827K0().getString(C17541R$string.action_take_screenshot);
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            Intent intent = new Intent(mo27827K0(), MacroDroidAccessibilityServiceJellyBean.class);
            intent.setAction("com.arlosoft.macrodroid.triggers.services.GLOBAL_CONTROL");
            intent.putExtra("GlobalControlType", 9);
            mo27827K0().startService(intent);
            if (this.m_option != 0 || this.saveToJpeg) {
                this.handeNextImageUpdate = true;
                return;
            }
            return;
        }
        String D3 = m13293D3();
        int i = this.m_option;
        if (i != 1) {
            if (i == 2 && D3 != null) {
                m13296H3(D3, (Uri) null, mo27827K0());
            }
        } else if (D3 != null) {
            m13295F3(D3, (Uri) null, mo27827K0(), this.m_email);
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m13305u3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24738G0() + " (" + mo24672O0() + ")";
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 == -1 && intent != null && i == 1000 && this.m_gmailHelper.mo32427e(i, i2, intent)) {
            m13294E3();
        }
    }

    /* renamed from: q3 */
    public String mo25837q3() {
        return this.m_email;
    }

    /* renamed from: r3 */
    public boolean mo25838r3() {
        return this.handeNextImageUpdate;
    }

    /* renamed from: t3 */
    public int mo25839t3() {
        return this.m_option;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (Build.VERSION.SDK_INT < 28) {
            m13303p3();
        } else if (this.m_option == 1) {
            m13302o3();
        } else {
            mo24689O1();
        }
    }

    /* renamed from: v3 */
    public boolean mo25840v3() {
        return this.saveToJpeg;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeString(this.m_email);
        parcel.writeInt(this.m_mechanismOption);
        parcel.writeInt(this.saveToJpeg ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = this.hiddenMechanismCount + 1;
            this.hiddenMechanismCount = i2;
            if (i2 > 5) {
                new C11102b((FragmentActivity) mo27850j0()).mo62231o("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").mo79679I(C16971a.m100210a()).mo79685P(new C3551vm(this));
            }
        }
    }

    private TakeScreenshotAction() {
        this.hiddenMechanismCount = 0;
        this.handeNextImageUpdate = false;
        this.m_option = 0;
        this.m_gmailHelper = C6383g0.m24633d(mo27827K0().getApplicationContext());
    }

    public TakeScreenshotAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private TakeScreenshotAction(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.hiddenMechanismCount = 0;
        this.handeNextImageUpdate = false;
        this.m_gmailHelper = C6383g0.m24633d(mo27827K0().getApplicationContext());
        this.m_option = parcel.readInt();
        this.m_email = parcel.readString();
        this.m_mechanismOption = parcel.readInt();
        this.saveToJpeg = parcel.readInt() != 0 ? true : z;
    }
}
