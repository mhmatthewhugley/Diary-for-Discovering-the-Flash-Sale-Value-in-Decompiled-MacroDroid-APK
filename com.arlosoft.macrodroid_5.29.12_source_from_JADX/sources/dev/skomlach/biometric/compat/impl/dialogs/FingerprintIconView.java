package dev.skomlach.biometric.compat.impl.dialogs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.C12021R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u001d\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u001a"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView$State;", "state", "Lja/u;", "setTint", "", "color", "tintColor", "(Ljava/lang/Integer;)V", "Ldev/skomlach/biometric/compat/BiometricType;", "type", "setState", "", "animate", "Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView$State;", "Ldev/skomlach/biometric/compat/BiometricType;", "Ljava/lang/Integer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "State", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: FingerprintIconView.kt */
public final class FingerprintIconView extends AppCompatImageView {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final Bitmap.Config format;
    @ChecksSdkIntAtLeast(api = 26)
    private static final boolean isAndroidO;
    private Integer color;
    private State state;
    private BiometricType type;

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView$State;", "", "(Ljava/lang/String;I)V", "OFF", "ON", "ERROR", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: FingerprintIconView.kt */
    public enum State {
        OFF,
        ON,
        ERROR
    }

    static {
        boolean z = Build.VERSION.SDK_INT >= 26;
        isAndroidO = z;
        format = z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.ARGB_4444;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FingerprintIconView(Context context) {
        this(context, (AttributeSet) null, 2, (C13695i) null);
        C13706o.m87929f(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FingerprintIconView(Context context, AttributeSet attributeSet, int i, C13695i iVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void setTint(State state2) {
        Integer num;
        if (state2 != State.ON || (num = this.color) == null) {
            ImageViewCompat.setImageTintList(this, (ColorStateList) null);
        } else {
            ImageViewCompat.setImageTintList(this, ColorStateList.valueOf(num.intValue()));
        }
    }

    public final void setState(State state2, BiometricType biometricType) {
        C13706o.m87929f(state2, "state");
        C13706o.m87929f(biometricType, "type");
        setState(state2, true, biometricType);
    }

    public final void tintColor(Integer num) {
        this.color = num;
        setTint(this.state);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FingerprintIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13706o.m87929f(context, "context");
        this.state = State.OFF;
        this.type = BiometricType.BIOMETRIC_FACE;
        this.color = Integer.valueOf(C12021R.C12022color.material_blue_500);
        setLayerType(2, (Paint) null);
        setState(this.state, false, this.type);
    }

    public final void setState(State state2, boolean z, BiometricType biometricType) {
        Drawable drawable;
        C13706o.m87929f(state2, "state");
        C13706o.m87929f(biometricType, "type");
        if (state2 != this.state) {
            setTint(state2);
            Drawable drawable2 = null;
            if (biometricType == BiometricType.BIOMETRIC_FINGERPRINT || biometricType == BiometricType.BIOMETRIC_ANY) {
                int access$getDrawable = Companion.getDrawable(this.state, state2, z);
                if (access$getDrawable == 0) {
                    setImageDrawable((Drawable) null);
                } else {
                    if (z) {
                        try {
                            drawable2 = AnimatedVectorDrawableCompat.create(getContext(), access$getDrawable);
                        } catch (Throwable unused) {
                        }
                    }
                    if (drawable2 == null) {
                        Companion companion = Companion;
                        Context context = getContext();
                        C13706o.m87928e(context, "context");
                        drawable2 = companion.getDrawable(context, access$getDrawable, getContext().getTheme());
                    }
                    setImageDrawable(drawable2);
                    if (drawable2 instanceof Animatable) {
                        ((Animatable) drawable2).start();
                    }
                }
            } else {
                Drawable drawable3 = getDrawable();
                if (drawable3 == null) {
                    drawable3 = new ColorDrawable(0);
                }
                Companion companion2 = Companion;
                int access$getDrawable2 = companion2.getDrawable(this.state, state2, false);
                if (access$getDrawable2 == 0) {
                    setImageDrawable((Drawable) null);
                } else {
                    if (state2 == State.ON) {
                        Context context2 = getContext();
                        C13706o.m87928e(context2, "context");
                        drawable = companion2.getDrawable(context2, biometricType.getIconId(), getContext().getTheme());
                    } else {
                        Context context3 = getContext();
                        C13706o.m87928e(context3, "context");
                        drawable = companion2.getDrawable(context3, access$getDrawable2, getContext().getTheme());
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable3, drawable});
                    transitionDrawable.setCrossFadeEnabled(true);
                    setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(getContext().getResources().getInteger(17694720));
                }
            }
            this.state = state2;
        }
    }

    @Metadata(mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u000eR\u00020\u000fH\u0002J \u0010\u0007\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0003J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView$Companion;", "", "()V", "format", "Landroid/graphics/Bitmap$Config;", "isAndroidO", "", "getDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "resId", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "currentState", "Ldev/skomlach/biometric/compat/impl/dialogs/FingerprintIconView$State;", "newState", "animate", "getDrawableAndroidR", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: FingerprintIconView.kt */
    public static final class Companion {

        @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
        /* compiled from: FingerprintIconView.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[State.values().length];
                iArr[State.OFF.ordinal()] = 1;
                iArr[State.ON.ordinal()] = 2;
                iArr[State.ERROR.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Drawable getDrawable(Context context, @DrawableRes int i, Resources.Theme theme) {
            Drawable drawable;
            try {
                drawable = AppCompatResources.getDrawable(context, i);
            } catch (Exception unused) {
                drawable = null;
            }
            if (drawable == null) {
                try {
                    drawable = ContextCompat.getDrawable(context, i);
                } catch (Exception unused2) {
                    drawable = null;
                }
            }
            if (drawable == null) {
                int i2 = 0;
                try {
                    Method method = Context.class.getMethod("getThemeResId", new Class[0]);
                    method.setAccessible(true);
                    Object invoke = method.invoke(context, new Object[0]);
                    C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Int");
                    i2 = ((Integer) invoke).intValue();
                } catch (Exception unused3) {
                }
                if (i2 == 0) {
                    try {
                        i2 = C12021R.style.Theme_BiometricPromptDialog;
                    } catch (Exception unused4) {
                        drawable = null;
                    }
                }
                Resources resources = context.getResources();
                if (theme == null) {
                    theme = new ContextThemeWrapper(context, i2).getTheme();
                }
                drawable = VectorDrawableCompat.create(resources, i, theme);
            }
            if (drawable == null && Build.VERSION.SDK_INT >= 28) {
                return getDrawableAndroidR(context, i);
            }
            if (drawable != null) {
                return drawable;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = FingerprintIconView.format;
                if (Build.VERSION.SDK_INT >= 26) {
                    options.outConfig = FingerprintIconView.format;
                }
                return new BitmapDrawable(BitmapFactory.decodeResource(context.getResources(), i, options));
            } catch (Exception unused5) {
                return null;
            }
        }

        @RequiresApi(28)
        private final Drawable getDrawableAndroidR(Context context, int i) {
            try {
                ImageDecoder.Source createSource = ImageDecoder.createSource(context.getResources(), i);
                C13706o.m87928e(createSource, "createSource(context.resources, resId)");
                return ImageDecoder.decodeDrawable(createSource, C12059j.f58282a);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: getDrawableAndroidR$lambda-0  reason: not valid java name */
        public static final void m101344getDrawableAndroidR$lambda0(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            C13706o.m87929f(imageDecoder, "decoder");
            C13706o.m87929f(imageInfo, "info");
            C13706o.m87929f(source, "source");
            imageDecoder.setAllocator(1);
        }

        /* access modifiers changed from: private */
        @DrawableRes
        public final int getDrawable(State state, State state2, boolean z) {
            int i = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
            if (i == 1) {
                if (z) {
                    if (state == State.ON) {
                        return C12021R.C12023drawable.fingerprint_draw_off_animation;
                    }
                    if (state == State.ERROR) {
                        return C12021R.C12023drawable.fingerprint_error_off_animation;
                    }
                }
                return 0;
            } else if (i == 2) {
                if (z) {
                    if (state == State.OFF) {
                        return C12021R.C12023drawable.fingerprint_draw_on_animation;
                    }
                    if (state == State.ERROR) {
                        return C12021R.C12023drawable.fingerprint_error_state_to_fp_animation;
                    }
                }
                return C12021R.C12023drawable.fingerprint_fingerprint;
            } else if (i == 3) {
                if (z) {
                    if (state == State.ON) {
                        return C12021R.C12023drawable.fingerprint_fp_to_error_state_animation;
                    }
                    if (state == State.OFF) {
                        return C12021R.C12023drawable.fingerprint_error_on_animation;
                    }
                }
                return C12021R.C12023drawable.fingerprint_error;
            } else {
                throw new IllegalArgumentException("Unknown state: " + state2);
            }
        }
    }
}
