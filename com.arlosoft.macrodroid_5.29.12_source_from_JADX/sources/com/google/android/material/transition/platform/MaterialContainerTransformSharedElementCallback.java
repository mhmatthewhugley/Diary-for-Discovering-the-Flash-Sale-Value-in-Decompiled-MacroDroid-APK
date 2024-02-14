package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public static WeakReference<View> f51049f;

    /* renamed from: a */
    private boolean f51050a = true;

    /* renamed from: b */
    private boolean f51051b = true;

    /* renamed from: c */
    private boolean f51052c = false;
    @Nullable

    /* renamed from: d */
    private Rect f51053d;
    @Nullable

    /* renamed from: e */
    private ShapeProvider f51054e = new ShapeableViewShapeProvider();

    public interface ShapeProvider {
        @Nullable
        /* renamed from: a */
        ShapeAppearanceModel mo59520a(@NonNull View view);
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
        @Nullable
        /* renamed from: a */
        public ShapeAppearanceModel mo59520a(@NonNull View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private static Drawable m70328e(Window window) {
        return window.getDecorView().getBackground();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m70329f(Window window) {
        Drawable e = m70328e(window);
        if (e != null) {
            e.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m70330g(Window window) {
        Drawable e = m70328e(window);
        if (e != null) {
            e.mutate().clearColorFilter();
        }
    }

    /* renamed from: h */
    private void m70331h(final Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.f51052c) {
                window.setSharedElementReenterTransition((Transition) null);
            }
            if (this.f51051b) {
                m70333j(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() {
                    public void onTransitionEnd(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.m70330g(window);
                    }

                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.m70329f(window);
                    }
                });
            }
        }
    }

    /* renamed from: i */
    private void m70332i(final Activity activity, final Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.mo59503o(true);
            materialContainerTransform.addListener(new TransitionListenerAdapter() {
                public void onTransitionEnd(Transition transition) {
                    View view;
                    if (!(MaterialContainerTransformSharedElementCallback.f51049f == null || (view = (View) MaterialContainerTransformSharedElementCallback.f51049f.get()) == null)) {
                        view.setAlpha(1.0f);
                        WeakReference unused = MaterialContainerTransformSharedElementCallback.f51049f = null;
                    }
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (this.f51051b) {
                m70333j(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() {
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.m70329f(window);
                    }
                });
            }
        }
    }

    /* renamed from: j */
    private static void m70333j(Window window, MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }

    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f51049f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        ShapeAppearanceModel a;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (!(onCreateSnapshotView == null || (weakReference = f51049f) == null || this.f51054e == null || (view = (View) weakReference.get()) == null || (a = this.f51054e.mo59520a(view)) == null)) {
            onCreateSnapshotView.setTag(C10462R.C10465id.mtrl_motion_snapshot_view, a);
        }
        return onCreateSnapshotView;
    }

    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity a;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (a = ContextUtils.m68711a(view.getContext())) != null) {
            Window window = a.getWindow();
            if (this.f51050a) {
                m70331h(window);
            } else {
                m70332i(a, window);
            }
        }
    }

    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty()) {
            int i = C10462R.C10465id.mtrl_motion_snapshot_view;
            if (list2.get(0).getTag(i) instanceof View) {
                list2.get(0).setTag(i, (Object) null);
            }
        }
        if (!this.f51050a && !list2.isEmpty()) {
            this.f51053d = TransitionUtils.m70374i(list2.get(0));
        }
        this.f51050a = false;
    }

    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(C10462R.C10465id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.f51050a && !list2.isEmpty() && this.f51053d != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f51053d.width(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(this.f51053d.height(), BasicMeasure.EXACTLY));
            Rect rect = this.f51053d;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
