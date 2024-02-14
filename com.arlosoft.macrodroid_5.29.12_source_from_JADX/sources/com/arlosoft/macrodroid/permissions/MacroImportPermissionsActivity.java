package com.arlosoft.macrodroid.permissions;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p112j2.C7439d0;

public class MacroImportPermissionsActivity extends AppCompatActivity {

    /* renamed from: d */
    private boolean f12529d = false;

    /* renamed from: f */
    private boolean f12530f;

    /* renamed from: K1 */
    private void m19263K1() {
        List<Macro> z = C4934n.m18998M().mo29710z();
        if (!this.f12529d) {
            List<String> L1 = m19264L1(z);
            if (L1.size() > 0) {
                ActivityCompat.requestPermissions(this, (String[]) L1.toArray(new String[0]), 0);
                return;
            }
            this.f12529d = true;
            if (!this.f12530f) {
                m19265M1(z);
            }
        } else if (!this.f12530f) {
            m19265M1(z);
        }
    }

    /* renamed from: L1 */
    private List<String> m19264L1(List<Macro> list) {
        ArrayList arrayList = new ArrayList();
        for (Macro next : list) {
            for (String str : this.f12530f ? next.getRequiredPermissionsOnImport() : next.getRequiredPermissions()) {
                if (!arrayList.contains(str) && ContextCompat.checkSelfPermission(this, str) != 0) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: M1 */
    private void m19265M1(List<Macro> list) {
        for (Macro next : list) {
            Iterator<Trigger> it = next.getTriggerList().iterator();
            while (it.hasNext()) {
                if (!C7439d0.m30854A(this, it.next(), true, true)) {
                    return;
                }
            }
            Iterator<Action> it2 = next.getActions().iterator();
            while (it2.hasNext()) {
                Action next2 = it2.next();
                if (C7439d0.m30854A(this, next2, true, true)) {
                    Iterator<Constraint> it3 = next2.mo27826J0().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!C7439d0.m30854A(this, it3.next(), true, true)) {
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            Iterator<Constraint> it4 = next.getConstraints().iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (!C7439d0.m30854A(this, it4.next(), true, true)) {
                        return;
                    }
                }
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12530f = getIntent().getBooleanExtra("check_import_permissions", false);
    }

    public void onDestroy() {
        if (C5163j2.m20013M0(this)) {
            Macro.setMacroDroidEnabledState(false);
            C4934n.m18998M().mo29694n0();
            Macro.setMacroDroidEnabledState(true);
            C4934n.m18998M().mo29694n0();
        }
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i != 0) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        boolean z = true;
        if (this.f12530f) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (iArr[i3] != 0) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                i2 = -1;
            }
            setResult(i2);
            finish();
            return;
        }
        this.f12529d = true;
        m19265M1(C4934n.m18998M().mo29710z());
    }

    public void onResume() {
        super.onResume();
        m19263K1();
    }
}
