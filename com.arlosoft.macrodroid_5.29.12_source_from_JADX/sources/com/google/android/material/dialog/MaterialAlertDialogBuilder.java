package com.google.android.material.dialog;

import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.shape.MaterialShapeDrawable;

public class MaterialAlertDialogBuilder extends AlertDialog.Builder {
    @AttrRes

    /* renamed from: c */
    private static final int f49283c = C10462R.attr.alertDialogStyle;
    @StyleRes

    /* renamed from: d */
    private static final int f49284d = C10462R.style.MaterialAlertDialog_MaterialComponents;
    @AttrRes

    /* renamed from: e */
    private static final int f49285e = C10462R.attr.materialAlertDialogTheme;
    @Nullable

    /* renamed from: a */
    private Drawable f49286a;
    @NonNull
    @Dimension

    /* renamed from: b */
    private final Rect f49287b;

    @NonNull
    /* renamed from: A */
    public MaterialAlertDialogBuilder setPositiveButtonIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @NonNull
    /* renamed from: B */
    public MaterialAlertDialogBuilder setSingleChoiceItems(@ArrayRes int i, int i2, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i, i2, onClickListener);
    }

    @NonNull
    /* renamed from: C */
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable Cursor cursor, int i, @NonNull String str, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i, str, onClickListener);
    }

    @NonNull
    /* renamed from: D */
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable ListAdapter listAdapter, int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i, onClickListener);
    }

    @NonNull
    /* renamed from: E */
    public MaterialAlertDialogBuilder setSingleChoiceItems(@Nullable CharSequence[] charSequenceArr, int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    @NonNull
    /* renamed from: F */
    public MaterialAlertDialogBuilder setTitle(@StringRes int i) {
        return (MaterialAlertDialogBuilder) super.setTitle(i);
    }

    @NonNull
    /* renamed from: G */
    public MaterialAlertDialogBuilder setTitle(@Nullable CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @NonNull
    /* renamed from: H */
    public MaterialAlertDialogBuilder setView(int i) {
        return (MaterialAlertDialogBuilder) super.setView(i);
    }

    @NonNull
    /* renamed from: I */
    public MaterialAlertDialogBuilder setView(@Nullable View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    @NonNull
    /* renamed from: a */
    public MaterialAlertDialogBuilder setAdapter(@Nullable ListAdapter listAdapter, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @NonNull
    /* renamed from: b */
    public MaterialAlertDialogBuilder setCancelable(boolean z) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z);
    }

    @NonNull
    /* renamed from: c */
    public MaterialAlertDialogBuilder setCursor(@Nullable Cursor cursor, @Nullable DialogInterface.OnClickListener onClickListener, @NonNull String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @NonNull
    public AlertDialog create() {
        AlertDialog create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f49286a;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).mo58655Z(ViewCompat.getElevation(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.m68376a(this.f49286a, this.f49287b));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, this.f49287b));
        return create;
    }

    @NonNull
    /* renamed from: d */
    public MaterialAlertDialogBuilder setCustomTitle(@Nullable View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @NonNull
    /* renamed from: e */
    public MaterialAlertDialogBuilder setIcon(@DrawableRes int i) {
        return (MaterialAlertDialogBuilder) super.setIcon(i);
    }

    @NonNull
    /* renamed from: f */
    public MaterialAlertDialogBuilder setIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @NonNull
    /* renamed from: g */
    public MaterialAlertDialogBuilder setIconAttribute(@AttrRes int i) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i);
    }

    @NonNull
    /* renamed from: h */
    public MaterialAlertDialogBuilder setItems(@ArrayRes int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i, onClickListener);
    }

    @NonNull
    /* renamed from: i */
    public MaterialAlertDialogBuilder setItems(@Nullable CharSequence[] charSequenceArr, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @NonNull
    /* renamed from: j */
    public MaterialAlertDialogBuilder setMessage(@StringRes int i) {
        return (MaterialAlertDialogBuilder) super.setMessage(i);
    }

    @NonNull
    /* renamed from: k */
    public MaterialAlertDialogBuilder setMessage(@Nullable CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @NonNull
    /* renamed from: l */
    public MaterialAlertDialogBuilder setMultiChoiceItems(@ArrayRes int i, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
    }

    @NonNull
    /* renamed from: m */
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable Cursor cursor, @NonNull String str, @NonNull String str2, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @NonNull
    /* renamed from: n */
    public MaterialAlertDialogBuilder setMultiChoiceItems(@Nullable CharSequence[] charSequenceArr, @Nullable boolean[] zArr, @Nullable DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @NonNull
    /* renamed from: o */
    public MaterialAlertDialogBuilder setNegativeButton(@StringRes int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i, onClickListener);
    }

    @NonNull
    /* renamed from: p */
    public MaterialAlertDialogBuilder setNegativeButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @NonNull
    /* renamed from: q */
    public MaterialAlertDialogBuilder setNegativeButtonIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @NonNull
    /* renamed from: r */
    public MaterialAlertDialogBuilder setNeutralButton(@StringRes int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i, onClickListener);
    }

    @NonNull
    /* renamed from: s */
    public MaterialAlertDialogBuilder setNeutralButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @NonNull
    /* renamed from: t */
    public MaterialAlertDialogBuilder setNeutralButtonIcon(@Nullable Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @NonNull
    /* renamed from: u */
    public MaterialAlertDialogBuilder setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @NonNull
    /* renamed from: v */
    public MaterialAlertDialogBuilder setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @NonNull
    /* renamed from: w */
    public MaterialAlertDialogBuilder setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @NonNull
    /* renamed from: x */
    public MaterialAlertDialogBuilder setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @NonNull
    /* renamed from: y */
    public MaterialAlertDialogBuilder setPositiveButton(@StringRes int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i, onClickListener);
    }

    @NonNull
    /* renamed from: z */
    public MaterialAlertDialogBuilder setPositiveButton(@Nullable CharSequence charSequence, @Nullable DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }
}
