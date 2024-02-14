package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0146R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    private int mFontWeight = -1;
    private int mStyle = 0;
    @NonNull
    private final TextView mView;

    @RequiresApi(17)
    static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        static Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        static void setTextLocale(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @RequiresApi(21)
    static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static Typeface create(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        }
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
            TextView textView = this.mView;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = Api17Impl.getCompoundDrawablesRelative(this.mView);
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
                TextView textView2 = this.mView;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.mView;
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView3, drawable7, drawable2, drawable8, drawable4);
        }
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.mStyle = tintTypedArray.getInt(C0146R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int i2 = tintTypedArray.getInt(C0146R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i2;
            if (i2 != -1) {
                this.mStyle = (this.mStyle & 2) | 0;
            }
        }
        int i3 = C0146R.styleable.TextAppearance_android_fontFamily;
        if (tintTypedArray.hasValue(i3) || tintTypedArray.hasValue(C0146R.styleable.TextAppearance_fontFamily)) {
            this.mFontTypeface = null;
            int i4 = C0146R.styleable.TextAppearance_fontFamily;
            if (tintTypedArray.hasValue(i4)) {
                i3 = i4;
            }
            final int i5 = this.mFontWeight;
            final int i6 = this.mStyle;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.mView);
                try {
                    Typeface font = tintTypedArray.getFont(i3, this.mStyle, new ResourcesCompat.FontCallback() {
                        public void onFontRetrievalFailed(int i) {
                        }

                        public void onFontRetrieved(@NonNull Typeface typeface) {
                            int i;
                            if (Build.VERSION.SDK_INT >= 28 && (i = i5) != -1) {
                                typeface = Api28Impl.create(typeface, i, (i6 & 2) != 0);
                            }
                            AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                        }
                    });
                    if (font != null) {
                        if (i < 28 || this.mFontWeight == -1) {
                            this.mFontTypeface = font;
                        } else {
                            this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                        }
                    }
                    this.mAsyncFontPending = this.mFontTypeface == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.mFontTypeface == null && (string = tintTypedArray.getString(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
                    this.mFontTypeface = Typeface.create(string, this.mStyle);
                    return;
                }
                Typeface create = Typeface.create(string, 0);
                int i7 = this.mFontWeight;
                if ((this.mStyle & 2) != 0) {
                    z = true;
                }
                this.mFontTypeface = Api28Impl.create(create, i7, z);
                return;
            }
            return;
        }
        int i8 = C0146R.styleable.TextAppearance_android_typeface;
        if (tintTypedArray.hasValue(i8)) {
            this.mAsyncFontPending = false;
            int i9 = tintTypedArray.getInt(i8, 1);
            if (i9 == 1) {
                this.mFontTypeface = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                this.mFontTypeface = Typeface.SERIF;
            } else if (i9 == 3) {
                this.mFontTypeface = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void applyCompoundDrawablesTints() {
        if (!(this.mDrawableLeftTint == null && this.mDrawableTopTint == null && this.mDrawableRightTint == null && this.mDrawableBottomTint == null)) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint != null || this.mDrawableEndTint != null) {
            Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
            applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    /* access modifiers changed from: package-private */
    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    /* access modifiers changed from: package-private */
    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    /* access modifiers changed from: package-private */
    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    /* access modifiers changed from: package-private */
    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    /* access modifiers changed from: package-private */
    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.mView
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.AppCompatDrawableManager r11 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            int[] r2 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.TintTypedArray r13 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.mView
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.getWrappedTypeArray()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.getResourceId(r0, r14)
            int r1 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableLeftTint = r1
        L_0x0042:
            int r1 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableTopTint = r1
        L_0x0054:
            int r1 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableRightTint = r1
        L_0x0066:
            int r1 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableBottomTint = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.hasValue(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.getResourceId(r2, r12)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r10, r11, r2)
            r7.mDrawableStartTint = r2
        L_0x008c:
            int r2 = androidx.appcompat.C0146R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.hasValue(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.getResourceId(r2, r12)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r10, r11, r2)
            r7.mDrawableEndTint = r2
        L_0x009e:
            r13.recycle()
            android.widget.TextView r2 = r7.mView
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011a
            int[] r6 = androidx.appcompat.C0146R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes((android.content.Context) r10, (int) r0, (int[]) r6)
            if (r2 != 0) goto L_0x00c5
            int r6 = androidx.appcompat.C0146R.styleable.TextAppearance_textAllCaps
            boolean r15 = r0.hasValue(r6)
            if (r15 == 0) goto L_0x00c5
            boolean r6 = r0.getBoolean(r6, r12)
            r15 = 1
            goto L_0x00c7
        L_0x00c5:
            r6 = 0
            r15 = 0
        L_0x00c7:
            r7.updateTypefaceAndStyle(r10, r0)
            if (r1 >= r5) goto L_0x00f5
            int r4 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textColor
            boolean r17 = r0.hasValue(r4)
            if (r17 == 0) goto L_0x00d9
            android.content.res.ColorStateList r4 = r0.getColorStateList(r4)
            goto L_0x00da
        L_0x00d9:
            r4 = 0
        L_0x00da:
            int r13 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textColorHint
            boolean r18 = r0.hasValue(r13)
            if (r18 == 0) goto L_0x00e7
            android.content.res.ColorStateList r13 = r0.getColorStateList(r13)
            goto L_0x00e8
        L_0x00e7:
            r13 = 0
        L_0x00e8:
            int r14 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textColorLink
            boolean r19 = r0.hasValue(r14)
            if (r19 == 0) goto L_0x00f7
            android.content.res.ColorStateList r14 = r0.getColorStateList(r14)
            goto L_0x00f8
        L_0x00f5:
            r4 = 0
            r13 = 0
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            int r5 = androidx.appcompat.C0146R.styleable.TextAppearance_textLocale
            boolean r20 = r0.hasValue(r5)
            if (r20 == 0) goto L_0x0105
            java.lang.String r5 = r0.getString(r5)
            goto L_0x0106
        L_0x0105:
            r5 = 0
        L_0x0106:
            if (r1 < r3) goto L_0x0115
            int r3 = androidx.appcompat.C0146R.styleable.TextAppearance_fontVariationSettings
            boolean r21 = r0.hasValue(r3)
            if (r21 == 0) goto L_0x0115
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0116
        L_0x0115:
            r3 = 0
        L_0x0116:
            r0.recycle()
            goto L_0x0121
        L_0x011a:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0121:
            int[] r0 = androidx.appcompat.C0146R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x013c
            int r12 = androidx.appcompat.C0146R.styleable.TextAppearance_textAllCaps
            boolean r22 = r0.hasValue(r12)
            if (r22 == 0) goto L_0x013c
            r22 = r3
            r3 = 0
            boolean r6 = r0.getBoolean(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0140
        L_0x013c:
            r22 = r3
            r3 = 23
        L_0x0140:
            if (r1 >= r3) goto L_0x0166
            int r3 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textColor
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L_0x014e
            android.content.res.ColorStateList r4 = r0.getColorStateList(r3)
        L_0x014e:
            int r3 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textColorHint
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L_0x015a
            android.content.res.ColorStateList r13 = r0.getColorStateList(r3)
        L_0x015a:
            int r3 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textColorLink
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L_0x0166
            android.content.res.ColorStateList r14 = r0.getColorStateList(r3)
        L_0x0166:
            int r3 = androidx.appcompat.C0146R.styleable.TextAppearance_textLocale
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L_0x0172
            java.lang.String r5 = r0.getString(r3)
        L_0x0172:
            r3 = 26
            if (r1 < r3) goto L_0x0183
            int r3 = androidx.appcompat.C0146R.styleable.TextAppearance_fontVariationSettings
            boolean r12 = r0.hasValue(r3)
            if (r12 == 0) goto L_0x0183
            java.lang.String r3 = r0.getString(r3)
            goto L_0x0185
        L_0x0183:
            r3 = r22
        L_0x0185:
            r12 = 28
            if (r1 < r12) goto L_0x01a2
            int r12 = androidx.appcompat.C0146R.styleable.TextAppearance_android_textSize
            boolean r16 = r0.hasValue(r12)
            if (r16 == 0) goto L_0x01a2
            r16 = r11
            r11 = -1
            int r12 = r0.getDimensionPixelSize(r12, r11)
            if (r12 != 0) goto L_0x01a4
            android.widget.TextView r11 = r7.mView
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a4
        L_0x01a2:
            r16 = r11
        L_0x01a4:
            r7.updateTypefaceAndStyle(r10, r0)
            r0.recycle()
            if (r4 == 0) goto L_0x01b1
            android.widget.TextView r0 = r7.mView
            r0.setTextColor(r4)
        L_0x01b1:
            if (r13 == 0) goto L_0x01b8
            android.widget.TextView r0 = r7.mView
            r0.setHintTextColor(r13)
        L_0x01b8:
            if (r14 == 0) goto L_0x01bf
            android.widget.TextView r0 = r7.mView
            r0.setLinkTextColor(r14)
        L_0x01bf:
            if (r2 != 0) goto L_0x01c6
            if (r15 == 0) goto L_0x01c6
            r7.setAllCaps(r6)
        L_0x01c6:
            android.graphics.Typeface r0 = r7.mFontTypeface
            if (r0 == 0) goto L_0x01dc
            int r2 = r7.mFontWeight
            r4 = -1
            if (r2 != r4) goto L_0x01d7
            android.widget.TextView r2 = r7.mView
            int r4 = r7.mStyle
            r2.setTypeface(r0, r4)
            goto L_0x01dc
        L_0x01d7:
            android.widget.TextView r2 = r7.mView
            r2.setTypeface(r0)
        L_0x01dc:
            if (r3 == 0) goto L_0x01e3
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r0, r3)
        L_0x01e3:
            if (r5 == 0) goto L_0x0205
            r0 = 24
            if (r1 < r0) goto L_0x01f3
            android.widget.TextView r0 = r7.mView
            android.os.LocaleList r1 = androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.forLanguageTags(r5)
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.setTextLocales(r0, r1)
            goto L_0x0205
        L_0x01f3:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)
            r1 = 0
            r0 = r0[r1]
            android.widget.TextView r1 = r7.mView
            java.util.Locale r0 = androidx.appcompat.widget.AppCompatTextHelper.Api21Impl.forLanguageTag(r0)
            androidx.appcompat.widget.AppCompatTextHelper.Api17Impl.setTextLocale(r1, r0)
        L_0x0205:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            r1 = r24
            r0.loadFromAttributes(r1, r9)
            boolean r0 = androidx.core.widget.AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L_0x024d
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            if (r0 == 0) goto L_0x024d
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x024d
            android.widget.TextView r2 = r7.mView
            int r2 = androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getAutoSizeStepGranularity(r2)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0247
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r7.mAutoSizeTextHelper
            int r2 = r2.getAutoSizeMinTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r3 = r7.mAutoSizeTextHelper
            int r3 = r3.getAutoSizeMaxTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r4 = r7.mAutoSizeTextHelper
            int r4 = r4.getAutoSizeStepGranularity()
            r5 = 0
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r0, r2, r3, r4, r5)
            goto L_0x024d
        L_0x0247:
            r5 = 0
            android.widget.TextView r2 = r7.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r2, r0, r5)
        L_0x024d:
            int[] r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView
            androidx.appcompat.widget.TintTypedArray r8 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes((android.content.Context) r10, (android.util.AttributeSet) r1, (int[]) r0)
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableLeftCompat
            r1 = -1
            int r0 = r8.getResourceId(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x0264
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r3 = r0
            goto L_0x0265
        L_0x0264:
            r3 = 0
        L_0x0265:
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0273
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r4 = r0
            goto L_0x0274
        L_0x0273:
            r4 = 0
        L_0x0274:
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0282
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r5 = r0
            goto L_0x0283
        L_0x0282:
            r5 = 0
        L_0x0283:
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableBottomCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0291
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r6 = r0
            goto L_0x0292
        L_0x0291:
            r6 = 0
        L_0x0292:
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableStartCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x02a0
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r9 = r0
            goto L_0x02a1
        L_0x02a0:
            r9 = 0
        L_0x02a1:
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableEndCompat
            int r0 = r8.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x02af
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r10, r0)
            r10 = r0
            goto L_0x02b0
        L_0x02af:
            r10 = 0
        L_0x02b0:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.setCompoundDrawables(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableTint
            boolean r1 = r8.hasValue(r0)
            if (r1 == 0) goto L_0x02cc
            android.content.res.ColorStateList r0 = r8.getColorStateList(r0)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(r1, r0)
        L_0x02cc:
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_drawableTintMode
            boolean r1 = r8.hasValue(r0)
            if (r1 == 0) goto L_0x02e4
            r1 = -1
            int r0 = r8.getInt(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r0, r2)
            android.widget.TextView r2 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(r2, r0)
            goto L_0x02e5
        L_0x02e4:
            r1 = -1
        L_0x02e5:
            int r0 = androidx.appcompat.C0146R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.getDimensionPixelSize(r0, r1)
            int r2 = androidx.appcompat.C0146R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r2 = r8.getDimensionPixelSize(r2, r1)
            int r3 = androidx.appcompat.C0146R.styleable.AppCompatTextView_lineHeight
            int r3 = r8.getDimensionPixelSize(r3, r1)
            r8.recycle()
            if (r0 == r1) goto L_0x0301
            android.widget.TextView r4 = r7.mView
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r4, r0)
        L_0x0301:
            if (r2 == r1) goto L_0x0308
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r0, r2)
        L_0x0308:
            if (r3 == r1) goto L_0x030f
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r3)
        L_0x030f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (ViewCompat.isAttachedToWindow(textView)) {
                final int i = this.mStyle;
                textView.post(new Runnable() {
                    public void run() {
                        textView.setTypeface(typeface, i);
                    }
                });
                return;
            }
            textView.setTypeface(typeface, this.mStyle);
        }
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            autoSizeText();
        }
    }

    /* access modifiers changed from: package-private */
    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    /* access modifiers changed from: package-private */
    public void onSetTextAppearance(Context context, int i) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, C0146R.styleable.TextAppearance);
        int i2 = C0146R.styleable.TextAppearance_textAllCaps;
        if (obtainStyledAttributes.hasValue(i2)) {
            setAllCaps(obtainStyledAttributes.getBoolean(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C0146R.styleable.TextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i4) && (colorStateList3 = obtainStyledAttributes.getColorStateList(i4)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            int i5 = C0146R.styleable.TextAppearance_android_textColorLink;
            if (obtainStyledAttributes.hasValue(i5) && (colorStateList2 = obtainStyledAttributes.getColorStateList(i5)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            int i6 = C0146R.styleable.TextAppearance_android_textColorHint;
            if (obtainStyledAttributes.hasValue(i6) && (colorStateList = obtainStyledAttributes.getColorStateList(i6)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        int i7 = C0146R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i7) && obtainStyledAttributes.getDimensionPixelSize(i7, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (i3 >= 26) {
            int i8 = C0146R.styleable.TextAppearance_fontVariationSettings;
            if (obtainStyledAttributes.hasValue(i8) && (string = obtainStyledAttributes.getString(i8)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    /* access modifiers changed from: package-private */
    public void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    public void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* access modifiers changed from: package-private */
    public void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    /* access modifiers changed from: package-private */
    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    /* access modifiers changed from: package-private */
    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    /* access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i, float f) {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && !isAutoSizeEnabled()) {
            setTextSizeInternal(i, f);
        }
    }
}
