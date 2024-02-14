package com.twofortyfouram.locale.sdk.client.p234ui.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.twofortyfouram.locale.sdk.client.internal.C11782c;

/* renamed from: com.twofortyfouram.locale.sdk.client.ui.activity.AbstractFragmentPluginActivity */
public abstract class AbstractFragmentPluginActivity extends FragmentActivity implements IPluginActivity {
    @NonNull

    /* renamed from: a */
    private final C11782c<AbstractFragmentPluginActivity> f57729a = new C11782c<>();
    protected boolean mIsCancelled = false;

    public void finish() {
        C11782c.m81999a(this, this.mIsCancelled);
        super.finish();
    }

    @Nullable
    public final String getPreviousBlurb() {
        return C11782c.m81997a(this);
    }

    @Nullable
    public final Bundle getPreviousBundle() {
        return C11782c.m82001b(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C11782c.m81998a(this, bundle);
    }

    public void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        C11782c.m82002b(this, bundle);
    }
}