package com.arlosoft.macrodroid.autobackup.p068ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.autobackup.p068ui.cloud.C3819k;
import com.arlosoft.macrodroid.autobackup.p068ui.local.C3855d;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.c */
/* compiled from: AutoBackupActivity.kt */
final class C3801c extends FragmentStateAdapter {

    /* renamed from: a */
    private final AutoBackupActivity f9925a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3801c(AutoBackupActivity autoBackupActivity) {
        super((FragmentActivity) autoBackupActivity);
        C13706o.m87929f(autoBackupActivity, "activity");
        this.f9925a = autoBackupActivity;
    }

    /* renamed from: B */
    public final String mo27327B(int i) {
        if (i == 0) {
            String string = this.f9925a.getString(C17541R$string.local_backup);
            C13706o.m87928e(string, "activity.getString(R.string.local_backup)");
            return string;
        }
        String string2 = this.f9925a.getString(C17541R$string.cloud_backup);
        C13706o.m87928e(string2, "activity.getString(R.string.cloud_backup)");
        return string2;
    }

    public Fragment createFragment(int i) {
        if (i == 0) {
            return C3855d.f10007p.mo27404a();
        }
        return C3819k.f9957G.mo27358a();
    }

    public int getItemCount() {
        return 2;
    }
}
