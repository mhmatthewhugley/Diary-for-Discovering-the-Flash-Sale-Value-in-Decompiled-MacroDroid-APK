package dagger.android.support;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import dagger.android.C11986a;
import dagger.android.DispatchingAndroidInjector;
import p404u8.C16667a;
import p413v8.C16726b;

public abstract class DaggerAppCompatActivity extends AppCompatActivity implements C16726b {

    /* renamed from: d */
    DispatchingAndroidInjector<Fragment> f58186d;

    /* renamed from: h0 */
    public C11986a<Fragment> mo27312h0() {
        return this.f58186d;
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        C16667a.m99103a(this);
        super.onCreate(bundle);
    }
}
