package com.obsez.android.lib.filechooser.permissions;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.obsez.android.lib.filechooser.permissions.C11707a;
import java.util.ArrayList;
import java.util.List;

public class PermissionActivity extends AppCompatActivity {
    @Nullable

    /* renamed from: d */
    private C11707a.C11708a f57544d;

    /* renamed from: f */
    public int f57545f;

    /* renamed from: g */
    private List<String> f57546g = new ArrayList();

    /* renamed from: o */
    private List<String> f57547o = new ArrayList();

    /* renamed from: K1 */
    private String[] m81880K1(List<String> list) {
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return strArr;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String[] stringArrayExtra = intent.getStringArrayExtra("PERMISSIONS");
        if (stringArrayExtra.length == 0) {
            finish();
        }
        int intExtra = intent.getIntExtra("REQUEST_CODE", -1);
        this.f57545f = intExtra;
        if (intExtra == -1) {
            finish();
        }
        this.f57544d = C11707a.m81881a(this.f57545f);
        for (String str : stringArrayExtra) {
            if (str == null || str.isEmpty()) {
                throw new RuntimeException("permission can't be null or empty");
            }
            if (ContextCompat.checkSelfPermission(this, str) == 0) {
                this.f57546g.add(str);
            } else {
                this.f57547o.add(str);
            }
        }
        if (!this.f57547o.isEmpty()) {
            ActivityCompat.requestPermissions(this, m81880K1(this.f57547o), this.f57545f);
        } else if (!this.f57546g.isEmpty()) {
            C11707a.C11708a aVar = this.f57544d;
            if (aVar != null) {
                aVar.mo65801b(m81880K1(this.f57546g));
            }
            finish();
        } else {
            throw new RuntimeException("there are no permissions");
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(0, 0);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != this.f57545f) {
            finish();
        }
        this.f57547o.clear();
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (iArr[length] == 0) {
                this.f57546g.add(strArr[length]);
            } else {
                this.f57547o.add(strArr[length]);
            }
        }
        if (!this.f57547o.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String next : this.f57547o) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, next)) {
                    arrayList.add(next);
                }
            }
            C11707a.C11708a aVar = this.f57544d;
            if (aVar != null) {
                aVar.mo65800a(m81880K1(this.f57547o));
                this.f57544d.mo65802c(m81880K1(arrayList));
            }
            finish();
        } else if (!this.f57546g.isEmpty()) {
            C11707a.C11708a aVar2 = this.f57544d;
            if (aVar2 != null) {
                aVar2.mo65801b(m81880K1(this.f57546g));
            }
            finish();
        } else {
            throw new RuntimeException("there are no permissions");
        }
    }
}
