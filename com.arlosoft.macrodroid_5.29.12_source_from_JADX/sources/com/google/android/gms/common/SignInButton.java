package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.base.C1733R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private int f3073a;

    /* renamed from: c */
    private int f3074c;

    /* renamed from: d */
    private View f3075d;
    @Nullable

    /* renamed from: f */
    private View.OnClickListener f3076f;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public @interface ColorScheme {
    }

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private final void m3579b(Context context) {
        View view = this.f3075d;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f3075d = zaz.m4659c(context, this.f3073a, this.f3074c);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i = this.f3073a;
            int i2 = this.f3074c;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.mo21748a(context.getResources(), i, i2);
            this.f3075d = zaaa;
        }
        addView(this.f3075d);
        this.f3075d.setEnabled(isEnabled());
        this.f3075d.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo21180a(int i, int i2) {
        this.f3073a = i;
        this.f3074c = i2;
        m3579b(getContext());
    }

    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.f3076f;
        if (onClickListener != null && view == this.f3075d) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        mo21180a(this.f3073a, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f3075d.setEnabled(z);
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f3076f = onClickListener;
        View view = this.f3075d;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        mo21180a(this.f3073a, this.f3074c);
    }

    public void setSize(int i) {
        mo21180a(i, this.f3074c);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3076f = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1733R.styleable.SignInButton, 0, 0);
        try {
            this.f3073a = obtainStyledAttributes.getInt(C1733R.styleable.SignInButton_buttonSize, 0);
            this.f3074c = obtainStyledAttributes.getInt(C1733R.styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            mo21180a(this.f3073a, this.f3074c);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
