package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IFragmentWrapper;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: a */
    private Fragment f4023a;

    private SupportFragmentWrapper(Fragment fragment) {
        this.f4023a = fragment;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: t1 */
    public static SupportFragmentWrapper m5055t1(@Nullable Fragment fragment) {
        if (fragment != null) {
            return new SupportFragmentWrapper(fragment);
        }
        return null;
    }

    /* renamed from: C1 */
    public final void mo22011C1(boolean z) {
        this.f4023a.setUserVisibleHint(z);
    }

    /* renamed from: D */
    public final boolean mo22012D() {
        return this.f4023a.isInLayout();
    }

    /* renamed from: F */
    public final boolean mo22013F() {
        return this.f4023a.isVisible();
    }

    /* renamed from: H */
    public final boolean mo22014H() {
        return this.f4023a.isRemoving();
    }

    /* renamed from: I */
    public final boolean mo22015I() {
        return this.f4023a.isResumed();
    }

    /* renamed from: K */
    public final boolean mo22016K() {
        return this.f4023a.isHidden();
    }

    /* renamed from: O6 */
    public final void mo22017O6(boolean z) {
        this.f4023a.setHasOptionsMenu(z);
    }

    /* renamed from: a */
    public final int mo22018a() {
        return this.f4023a.getTargetRequestCode();
    }

    @Nullable
    /* renamed from: b */
    public final IFragmentWrapper mo22019b() {
        return m5055t1(this.f4023a.getParentFragment());
    }

    @Nullable
    /* renamed from: c */
    public final IFragmentWrapper mo22020c() {
        return m5055t1(this.f4023a.getTargetFragment());
    }

    /* renamed from: c0 */
    public final void mo22021c0(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m5050A1(iObjectWrapper);
        Fragment fragment = this.f4023a;
        Preconditions.m4488k(view);
        fragment.unregisterForContextMenu(view);
    }

    @Nullable
    /* renamed from: d */
    public final Bundle mo22022d() {
        return this.f4023a.getArguments();
    }

    @NonNull
    /* renamed from: e */
    public final IObjectWrapper mo22023e() {
        return ObjectWrapper.m5051g8(this.f4023a.getResources());
    }

    @NonNull
    /* renamed from: f */
    public final IObjectWrapper mo22024f() {
        return ObjectWrapper.m5051g8(this.f4023a.getActivity());
    }

    @NonNull
    /* renamed from: g */
    public final IObjectWrapper mo22025g() {
        return ObjectWrapper.m5051g8(this.f4023a.getView());
    }

    @Nullable
    /* renamed from: h */
    public final String mo22026h() {
        return this.f4023a.getTag();
    }

    /* renamed from: i1 */
    public final void mo22027i1(boolean z) {
        this.f4023a.setMenuVisibility(z);
    }

    /* renamed from: k1 */
    public final void mo22028k1(boolean z) {
        this.f4023a.setRetainInstance(z);
    }

    /* renamed from: o8 */
    public final void mo22029o8(@NonNull Intent intent) {
        this.f4023a.startActivity(intent);
    }

    /* renamed from: p */
    public final boolean mo22030p() {
        return this.f4023a.getRetainInstance();
    }

    /* renamed from: r */
    public final boolean mo22031r() {
        return this.f4023a.getUserVisibleHint();
    }

    /* renamed from: s1 */
    public final void mo22032s1(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m5050A1(iObjectWrapper);
        Fragment fragment = this.f4023a;
        Preconditions.m4488k(view);
        fragment.registerForContextMenu(view);
    }

    /* renamed from: u */
    public final boolean mo22033u() {
        return this.f4023a.isAdded();
    }

    /* renamed from: w */
    public final boolean mo22034w() {
        return this.f4023a.isDetached();
    }

    /* renamed from: x8 */
    public final void mo22035x8(@NonNull Intent intent, int i) {
        this.f4023a.startActivityForResult(intent, i);
    }

    public final int zzb() {
        return this.f4023a.getId();
    }
}
