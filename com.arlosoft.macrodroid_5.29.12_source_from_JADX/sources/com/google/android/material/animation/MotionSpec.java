package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

public class MotionSpec {

    /* renamed from: a */
    private final SimpleArrayMap<String, MotionTiming> f48534a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final SimpleArrayMap<String, PropertyValuesHolder[]> f48535b = new SimpleArrayMap<>();

    /* renamed from: a */
    private static void m67233a(@NonNull MotionSpec motionSpec, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.mo56595l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            motionSpec.mo56596m(objectAnimator.getPropertyName(), MotionTiming.m67246b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @NonNull
    /* renamed from: b */
    private PropertyValuesHolder[] m67234b(@NonNull PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    @Nullable
    /* renamed from: c */
    public static MotionSpec m67235c(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m67236d(context, resourceId);
    }

    @Nullable
    /* renamed from: d */
    public static MotionSpec m67236d(@NonNull Context context, @AnimatorRes int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m67237e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m67237e(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    @NonNull
    /* renamed from: e */
    private static MotionSpec m67237e(@NonNull List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m67233a(motionSpec, list.get(i));
        }
        return motionSpec;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionSpec)) {
            return false;
        }
        return this.f48534a.equals(((MotionSpec) obj).f48534a);
    }

    @NonNull
    /* renamed from: f */
    public <T> ObjectAnimator mo56588f(@NonNull String str, @NonNull T t, @NonNull Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo56589g(str));
        ofPropertyValuesHolder.setProperty(property);
        mo56590h(str).mo56598a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @NonNull
    /* renamed from: g */
    public PropertyValuesHolder[] mo56589g(String str) {
        if (mo56593j(str)) {
            return m67234b(this.f48535b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public MotionTiming mo56590h(String str) {
        if (mo56594k(str)) {
            return this.f48534a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f48534a.hashCode();
    }

    /* renamed from: i */
    public long mo56592i() {
        int size = this.f48534a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            MotionTiming valueAt = this.f48534a.valueAt(i);
            j = Math.max(j, valueAt.mo56599c() + valueAt.mo56600d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean mo56593j(String str) {
        return this.f48535b.get(str) != null;
    }

    /* renamed from: k */
    public boolean mo56594k(String str) {
        return this.f48534a.get(str) != null;
    }

    /* renamed from: l */
    public void mo56595l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f48535b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void mo56596m(String str, @Nullable MotionTiming motionTiming) {
        this.f48534a.put(str, motionTiming);
    }

    @NonNull
    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f48534a + "}\n";
    }
}
