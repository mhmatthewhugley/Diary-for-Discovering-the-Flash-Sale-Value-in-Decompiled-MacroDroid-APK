package com.yalantis.ucrop;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p368q8.C16232a;
import p395t8.C16594i;

public class UCropActivity extends AppCompatActivity {

    /* renamed from: W */
    public static final Bitmap.CompressFormat f57948W = Bitmap.CompressFormat.JPEG;
    @DrawableRes

    /* renamed from: A */
    private int f57949A;

    /* renamed from: B */
    private int f57950B;

    /* renamed from: C */
    private boolean f57951C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f57952D = true;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public UCropView f57953E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public GestureCropImageView f57954F;

    /* renamed from: G */
    private OverlayView f57955G;

    /* renamed from: H */
    private ViewGroup f57956H;

    /* renamed from: I */
    private ViewGroup f57957I;

    /* renamed from: J */
    private ViewGroup f57958J;

    /* renamed from: K */
    private ViewGroup f57959K;

    /* renamed from: L */
    private ViewGroup f57960L;

    /* renamed from: M */
    private ViewGroup f57961M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public List<ViewGroup> f57962N = new ArrayList();

    /* renamed from: O */
    private TextView f57963O;

    /* renamed from: P */
    private TextView f57964P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public View f57965Q;

    /* renamed from: R */
    private Bitmap.CompressFormat f57966R = f57948W;

    /* renamed from: S */
    private int f57967S = 90;

    /* renamed from: T */
    private int[] f57968T = {1, 2, 3};

    /* renamed from: U */
    private TransformImageView.C11923b f57969U = new C11905a();

    /* renamed from: V */
    private final View.OnClickListener f57970V = new C11911g();

    /* renamed from: d */
    private String f57971d;

    /* renamed from: f */
    private int f57972f;

    /* renamed from: g */
    private int f57973g;

    /* renamed from: o */
    private int f57974o;

    /* renamed from: p */
    private int f57975p;
    @ColorInt

    /* renamed from: s */
    private int f57976s;
    @DrawableRes

    /* renamed from: z */
    private int f57977z;

    /* renamed from: com.yalantis.ucrop.UCropActivity$a */
    class C11905a implements TransformImageView.C11923b {
        C11905a() {
        }

        /* renamed from: a */
        public void mo67194a() {
            UCropActivity.this.f57953E.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f57965Q.setClickable(false);
            boolean unused = UCropActivity.this.f57952D = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        /* renamed from: b */
        public void mo67195b(@NonNull Exception exc) {
            UCropActivity.this.mo67192e2(exc);
            UCropActivity.this.finish();
        }

        /* renamed from: c */
        public void mo67196c(float f) {
            UCropActivity.this.m82180g2(f);
        }

        /* renamed from: d */
        public void mo67197d(float f) {
            UCropActivity.this.m82177b2(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$b */
    class C11906b implements View.OnClickListener {
        C11906b() {
        }

        public void onClick(View view) {
            UCropActivity.this.f57954F.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).mo67315b(view.isSelected()));
            UCropActivity.this.f57954F.mo67249x();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropActivity.this.f57962N) {
                    viewGroup.setSelected(viewGroup == view);
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$c */
    class C11907c implements HorizontalProgressWheelView.C11926a {
        C11907c() {
        }

        /* renamed from: a */
        public void mo67199a() {
            UCropActivity.this.f57954F.mo67249x();
        }

        /* renamed from: b */
        public void mo67200b() {
            UCropActivity.this.f57954F.mo67235r();
        }

        /* renamed from: c */
        public void mo67201c(float f, float f2) {
            UCropActivity.this.f57954F.mo67247v(f / 42.0f);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$d */
    class C11908d implements View.OnClickListener {
        C11908d() {
        }

        public void onClick(View view) {
            UCropActivity.this.m82174Y1();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$e */
    class C11909e implements View.OnClickListener {
        C11909e() {
        }

        public void onClick(View view) {
            UCropActivity.this.m82175Z1(90);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$f */
    class C11910f implements HorizontalProgressWheelView.C11926a {
        C11910f() {
        }

        /* renamed from: a */
        public void mo67199a() {
            UCropActivity.this.f57954F.mo67249x();
        }

        /* renamed from: b */
        public void mo67200b() {
            UCropActivity.this.f57954F.mo67235r();
        }

        /* renamed from: c */
        public void mo67201c(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.this.f57954F.mo67225A(UCropActivity.this.f57954F.getCurrentScale() + (f * ((UCropActivity.this.f57954F.getMaxScale() - UCropActivity.this.f57954F.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f57954F.mo67227C(UCropActivity.this.f57954F.getCurrentScale() + (f * ((UCropActivity.this.f57954F.getMaxScale() - UCropActivity.this.f57954F.getMinScale()) / 15000.0f)));
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$g */
    class C11911g implements View.OnClickListener {
        C11911g() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.m82182i2(view.getId());
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$h */
    class C11912h implements C16232a {
        C11912h() {
        }

        /* renamed from: a */
        public void mo67205a(@NonNull Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.mo67193f2(uri, uCropActivity.f57954F.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }

        /* renamed from: b */
        public void mo67206b(@NonNull Throwable th) {
            UCropActivity.this.mo67192e2(th);
            UCropActivity.this.finish();
        }
    }

    /* renamed from: U1 */
    private void m82171U1() {
        if (this.f57965Q == null) {
            this.f57965Q = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R$id.toolbar);
            this.f57965Q.setLayoutParams(layoutParams);
            this.f57965Q.setClickable(true);
        }
        ((RelativeLayout) findViewById(R$id.ucrop_photobox)).addView(this.f57965Q);
    }

    /* renamed from: W1 */
    private void m82172W1() {
        UCropView uCropView = (UCropView) findViewById(R$id.ucrop);
        this.f57953E = uCropView;
        this.f57954F = uCropView.getCropImageView();
        this.f57955G = this.f57953E.getOverlayView();
        this.f57954F.setTransformImageListener(this.f57969U);
        ((ImageView) findViewById(R$id.image_view_logo)).setColorFilter(this.f57950B, PorterDuff.Mode.SRC_ATOP);
        findViewById(R$id.ucrop_frame).setBackgroundColor(this.f57976s);
    }

    /* renamed from: X1 */
    private void m82173X1(@NonNull Intent intent) {
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = f57948W;
        }
        this.f57966R = valueOf;
        this.f57967S = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f57968T = intArrayExtra;
        }
        this.f57954F.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f57954F.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f57954F.setImageToWrapCropBoundsAnimDuration((long) intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f57955G.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f57955G.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(R$color.ucrop_color_default_dimmed)));
        this.f57955G.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f57955G.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f57955G.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(R$color.ucrop_color_default_crop_frame)));
        this.f57955G.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_frame_stoke_width)));
        this.f57955G.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f57955G.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f57955G.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f57955G.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", getResources().getColor(R$color.ucrop_color_default_crop_grid)));
        this.f57955G.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(R$dimen.ucrop_default_crop_grid_stoke_width)));
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra > 0.0f && floatExtra2 > 0.0f) {
            ViewGroup viewGroup = this.f57956H;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f57954F.setTargetAspectRatio(floatExtra / floatExtra2);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.f57954F.setTargetAspectRatio(0.0f);
        } else {
            this.f57954F.setTargetAspectRatio(((AspectRatio) parcelableArrayListExtra.get(intExtra)).mo67217b() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).mo67218c());
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.f57954F.setMaxResultImageSizeX(intExtra2);
            this.f57954F.setMaxResultImageSizeY(intExtra3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m82174Y1() {
        GestureCropImageView gestureCropImageView = this.f57954F;
        gestureCropImageView.mo67247v(-gestureCropImageView.getCurrentAngle());
        this.f57954F.mo67249x();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public void m82175Z1(int i) {
        this.f57954F.mo67247v((float) i);
        this.f57954F.mo67249x();
    }

    /* renamed from: a2 */
    private void m82176a2(int i) {
        GestureCropImageView gestureCropImageView = this.f57954F;
        int[] iArr = this.f57968T;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.f57954F;
        int[] iArr2 = this.f57968T;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public void m82177b2(float f) {
        TextView textView = this.f57963O;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
        }
    }

    /* renamed from: c2 */
    private void m82178c2(@NonNull Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        m82173X1(intent);
        if (uri == null || uri2 == null) {
            mo67192e2(new NullPointerException(getString(R$string.ucrop_error_input_data_is_absent)));
            finish();
            return;
        }
        try {
            this.f57954F.mo67301l(uri, uri2);
        } catch (Exception e) {
            mo67192e2(e);
            finish();
        }
    }

    /* renamed from: d2 */
    private void m82179d2() {
        if (!this.f57951C) {
            m82176a2(0);
        } else if (this.f57956H.getVisibility() == 0) {
            m82182i2(R$id.state_aspect_ratio);
        } else {
            m82182i2(R$id.state_scale);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public void m82180g2(float f) {
        TextView textView = this.f57964P;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
        }
    }

    /* renamed from: h2 */
    private void m82181h2(@ColorInt int i) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public void m82182i2(@IdRes int i) {
        if (this.f57951C) {
            ViewGroup viewGroup = this.f57956H;
            int i2 = R$id.state_aspect_ratio;
            viewGroup.setSelected(i == i2);
            ViewGroup viewGroup2 = this.f57957I;
            int i3 = R$id.state_rotate;
            viewGroup2.setSelected(i == i3);
            ViewGroup viewGroup3 = this.f57958J;
            int i4 = R$id.state_scale;
            viewGroup3.setSelected(i == i4);
            int i5 = 8;
            this.f57959K.setVisibility(i == i2 ? 0 : 8);
            this.f57960L.setVisibility(i == i3 ? 0 : 8);
            ViewGroup viewGroup4 = this.f57961M;
            if (i == i4) {
                i5 = 0;
            }
            viewGroup4.setVisibility(i5);
            if (i == i4) {
                m82176a2(0);
            } else if (i == i3) {
                m82176a2(1);
            } else {
                m82176a2(2);
            }
        }
    }

    /* renamed from: j2 */
    private void m82183j2() {
        m82181h2(this.f57973g);
        Toolbar toolbar = (Toolbar) findViewById(R$id.toolbar);
        toolbar.setBackgroundColor(this.f57972f);
        toolbar.setTitleTextColor(this.f57975p);
        TextView textView = (TextView) toolbar.findViewById(R$id.toolbar_title);
        textView.setTextColor(this.f57975p);
        textView.setText(this.f57971d);
        Drawable mutate = ContextCompat.getDrawable(this, this.f57977z).mutate();
        mutate.setColorFilter(this.f57975p, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    /* renamed from: k2 */
    private void m82184k2(@NonNull Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio((String) null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(R$string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio((String) null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R$layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f57974o);
            aspectRatioTextView.setAspectRatio((AspectRatio) it.next());
            linearLayout.addView(frameLayout);
            this.f57962N.add(frameLayout);
        }
        this.f57962N.get(intExtra).setSelected(true);
        for (ViewGroup onClickListener : this.f57962N) {
            onClickListener.setOnClickListener(new C11906b());
        }
    }

    /* renamed from: l2 */
    private void m82185l2() {
        this.f57963O = (TextView) findViewById(R$id.text_view_rotate);
        int i = R$id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C11907c());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f57974o);
        findViewById(R$id.wrapper_reset_rotate).setOnClickListener(new C11908d());
        findViewById(R$id.wrapper_rotate_by_angle).setOnClickListener(new C11909e());
    }

    /* renamed from: m2 */
    private void m82186m2() {
        this.f57964P = (TextView) findViewById(R$id.text_view_scale);
        int i = R$id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C11910f());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f57974o);
    }

    /* renamed from: n2 */
    private void m82187n2() {
        ImageView imageView = (ImageView) findViewById(R$id.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(R$id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(R$id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new C16594i(imageView.getDrawable(), this.f57974o));
        imageView2.setImageDrawable(new C16594i(imageView2.getDrawable(), this.f57974o));
        imageView3.setImageDrawable(new C16594i(imageView3.getDrawable(), this.f57974o));
    }

    /* renamed from: o2 */
    private void m82188o2(@NonNull Intent intent) {
        this.f57973g = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", ContextCompat.getColor(this, R$color.ucrop_color_statusbar));
        this.f57972f = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar));
        this.f57974o = intent.getIntExtra("com.yalantis.ucrop.UcropColorWidgetActive", ContextCompat.getColor(this, R$color.ucrop_color_widget_active));
        this.f57975p = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", ContextCompat.getColor(this, R$color.ucrop_color_toolbar_widget));
        this.f57977z = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", R$drawable.ucrop_ic_cross);
        this.f57949A = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", R$drawable.ucrop_ic_done);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f57971d = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(R$string.ucrop_label_edit_photo);
        }
        this.f57971d = stringExtra;
        this.f57950B = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", ContextCompat.getColor(this, R$color.ucrop_color_default_logo));
        this.f57951C = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f57976s = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", ContextCompat.getColor(this, R$color.ucrop_color_crop_background));
        m82183j2();
        m82172W1();
        if (this.f57951C) {
            View.inflate(this, R$layout.ucrop_controls, (ViewGroup) findViewById(R$id.ucrop_photobox));
            ViewGroup viewGroup = (ViewGroup) findViewById(R$id.state_aspect_ratio);
            this.f57956H = viewGroup;
            viewGroup.setOnClickListener(this.f57970V);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R$id.state_rotate);
            this.f57957I = viewGroup2;
            viewGroup2.setOnClickListener(this.f57970V);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R$id.state_scale);
            this.f57958J = viewGroup3;
            viewGroup3.setOnClickListener(this.f57970V);
            this.f57959K = (ViewGroup) findViewById(R$id.layout_aspect_ratio);
            this.f57960L = (ViewGroup) findViewById(R$id.layout_rotate_wheel);
            this.f57961M = (ViewGroup) findViewById(R$id.layout_scale_wheel);
            m82184k2(intent);
            m82185l2();
            m82186m2();
            m82187n2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V1 */
    public void mo67191V1() {
        this.f57965Q.setClickable(true);
        this.f57952D = true;
        supportInvalidateOptionsMenu();
        this.f57954F.mo67236s(this.f57966R, this.f57967S, new C11912h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e2 */
    public void mo67192e2(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public void mo67193f2(Uri uri, float f, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.ucrop_activity_photobox);
        Intent intent = getIntent();
        m82188o2(intent);
        m82178c2(intent);
        m82179d2();
        m82171U1();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R$menu.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(R$id.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f57975p, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e) {
                Log.i("UCropActivity", String.format("%s - %s", new Object[]{e.getMessage(), getString(R$string.ucrop_mutate_exception_hint)}));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(R$id.menu_crop);
        Drawable drawable = ContextCompat.getDrawable(this, this.f57949A);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(this.f57975p, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(drawable);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R$id.menu_crop) {
            mo67191V1();
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R$id.menu_crop).setVisible(!this.f57952D);
        menu.findItem(R$id.menu_loader).setVisible(this.f57952D);
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f57954F;
        if (gestureCropImageView != null) {
            gestureCropImageView.mo67235r();
        }
    }
}
