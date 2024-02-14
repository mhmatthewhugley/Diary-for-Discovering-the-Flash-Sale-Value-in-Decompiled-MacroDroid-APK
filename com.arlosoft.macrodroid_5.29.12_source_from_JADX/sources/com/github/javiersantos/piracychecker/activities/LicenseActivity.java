package com.github.javiersantos.piracychecker.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import com.github.javiersantos.piracychecker.C6918R;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f¨\u0006\u001b"}, mo71668d2 = {"Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lja/u;", "K1", "M1", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "d", "Ljava/lang/String;", "description", "", "f", "I", "colorPrimary", "g", "colorPrimaryDark", "", "o", "Z", "withLightStatusBar", "p", "layoutXML", "<init>", "()V", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: LicenseActivity.kt */
public final class LicenseActivity extends AppCompatActivity {

    /* renamed from: d */
    private String f16324d;
    @ColorRes

    /* renamed from: f */
    private int f16325f;
    @ColorRes

    /* renamed from: g */
    private int f16326g;

    /* renamed from: o */
    private boolean f16327o;
    @LayoutRes

    /* renamed from: p */
    private int f16328p;

    /* renamed from: K1 */
    private final void m26235K1() {
        int i;
        int i2;
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("content") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f16324d = stringExtra;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            i = intent2.getIntExtra("colorPrimary", ContextCompat.getColor(this, C6918R.C6919color.colorPrimary));
        } else {
            i = ContextCompat.getColor(this, C6918R.C6919color.colorPrimary);
        }
        this.f16325f = i;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            i2 = intent3.getIntExtra("colorPrimaryDark", ContextCompat.getColor(this, C6918R.C6919color.colorPrimaryDark));
        } else {
            i2 = ContextCompat.getColor(this, C6918R.C6919color.colorPrimaryDark);
        }
        this.f16326g = i2;
        Intent intent4 = getIntent();
        boolean z = false;
        if (intent4 != null) {
            z = intent4.getBooleanExtra("withLightStatusBar", false);
        }
        this.f16327o = z;
        Intent intent5 = getIntent();
        int i3 = -1;
        if (intent5 != null) {
            i3 = intent5.getIntExtra("layoutXML", -1);
        }
        this.f16328p = i3;
    }

    /* renamed from: L1 */
    private final void m26236L1() {
        View view;
        FrameLayout frameLayout = (FrameLayout) findViewById(C6918R.C6921id.mainContainer);
        LayoutInflater from = LayoutInflater.from(this);
        int i = this.f16328p;
        if (i == -1) {
            view = from.inflate(C6918R.C6923layout.activity_license_default, (ViewGroup) null);
            TextView textView = (TextView) view.findViewById(C6918R.C6921id.piracy_checker_description);
            if (textView != null) {
                textView.setText(this.f16324d);
            }
        } else {
            view = from.inflate(i, (ViewGroup) null);
        }
        if (view != null && frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    /* renamed from: M1 */
    private final void m26237M1() {
        View findViewById = findViewById(C6918R.C6921id.toolbar);
        if (!(findViewById instanceof Toolbar)) {
            findViewById = null;
        }
        Toolbar toolbar = (Toolbar) findViewById;
        if (toolbar != null) {
            toolbar.setBackgroundColor(ContextCompat.getColor(this, this.f16325f));
        }
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle((CharSequence) ActivityUtilsKt.m26233a(this));
        }
        Window window = getWindow();
        C13706o.m87925b(window, "window");
        window.setStatusBarColor(ContextCompat.getColor(this, this.f16326g));
        Window window2 = getWindow();
        C13706o.m87925b(window2, "window");
        View decorView = window2.getDecorView();
        C13706o.m87925b(decorView, "window.decorView");
        ActivityUtilsKt.m26234b(decorView, this.f16327o);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6918R.C6923layout.activity_license);
        m26235K1();
        m26237M1();
        m26236L1();
    }
}
