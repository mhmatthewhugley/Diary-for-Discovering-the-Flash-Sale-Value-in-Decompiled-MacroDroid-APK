package com.arlosoft.macrodroid;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.content.p006pm.ShortcutInfoCompat;
import androidx.core.content.p006pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.confirmation.C4083b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.ShortcutTrigger;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.arlosoft.macrodroid.utils.C6443v;
import com.arlosoft.macrodroid.wizard.WizardActivity;
import java.util.ArrayList;
import java.util.List;
import p149q1.C8157f;
import p319lc.C15626c;

public class ShortcutActivity extends MacroDroidDialogDaggerBaseActivity {

    /* renamed from: A */
    private ImageView f7093A;

    /* renamed from: B */
    private boolean f7094B = false;

    /* renamed from: C */
    C4083b f7095C;

    /* renamed from: D */
    C5070a f7096D;

    /* renamed from: o */
    private int f7097o = 0;

    /* renamed from: p */
    private String f7098p = "com.arlosoft.macrodroid";

    /* renamed from: s */
    private String f7099s = "";

    /* renamed from: z */
    private Uri f7100z;

    /* renamed from: S1 */
    private void m9524S1(Macro macro, String str, @Nullable Bitmap bitmap) {
        if (this.f7094B) {
            Intent intent = new Intent(this, ShortcutDispatchActivity.class);
            intent.setAction("");
            intent.putExtra("com.arlosoft.macrodroid.MACRO_NAME", macro.getName());
            intent.putExtra("guid", macro.getGUID());
            intent.addFlags(268435456);
            intent.addFlags(67141632);
            ShortcutInfoCompat.Builder intent2 = new ShortcutInfoCompat.Builder((Context) this, str).setShortLabel(str).setIntent(intent);
            if (bitmap != null) {
                intent2.setIcon(IconCompat.createWithBitmap(bitmap));
            }
            ShortcutManagerCompat.requestPinShortcut(this, intent2.build(), (IntentSender) null);
            return;
        }
        Intent intent3 = new Intent("com.arlosoft.macrodroid.ShortcutDispatch");
        intent3.putExtra("com.arlosoft.macrodroid.MACRO_NAME", str);
        intent3.putExtra("guid", macro.getGUID());
        intent3.addFlags(268435456);
        intent3.addFlags(67141632);
        intent3.setType("macrodroid/macro");
        Intent intent4 = new Intent();
        intent4.putExtra("android.intent.extra.shortcut.INTENT", intent3);
        intent4.putExtra("android.intent.extra.shortcut.NAME", str);
        if (bitmap != null) {
            intent4.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
        intent4.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        setResult(-1, intent4);
    }

    /* renamed from: T1 */
    private static Bitmap m9525T1(VectorDrawable vectorDrawable) {
        Bitmap createBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        vectorDrawable.draw(canvas);
        return createBitmap;
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m9526U1(DialogInterface dialogInterface, int i) {
        this.f7097o = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ void m9527V1(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m9528W1(boolean z, List list, DialogInterface dialogInterface, int i) {
        int i2 = this.f7097o;
        if (i2 == 0) {
            int size = C4934n.m18998M().mo29710z().size();
            int f0 = C5163j2.m20151f0(this);
            if (((MacroDroidApplication) getApplication()).f9902p.mo28009e().mo28008a() || size < f0) {
                Macro macro = new Macro();
                macro.addTrigger(new ShortcutTrigger());
                macro.setConfiguringShortcut(true);
                Intent intent = new Intent(this, WizardActivity.class);
                intent.putExtra(C8157f.ITEM_TYPE, macro);
                startActivityForResult(intent, 88);
                C15626c.makeText(getApplicationContext(), C17541R$string.creating_new_macro_with_shortcut_launched_trigger, 0).show();
                return;
            }
            C4061t1.m15957G0(this, this.f7096D);
            finish();
        } else if (z) {
            m9532a2((Macro) list.get(i2 - 1));
        } else {
            Macro macro2 = (Macro) list.get(i2 - 1);
            m9524S1(macro2, macro2.getName(), (Bitmap) null);
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m9529X1(View view) {
        startActivityForResult(new Intent(this, IconSelectActivity.class), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m9530Y1(AppCompatDialog appCompatDialog, Macro macro, View view) {
        Bitmap bitmap;
        String str;
        appCompatDialog.dismiss();
        if (this.f7093A.getDrawable() instanceof VectorDrawable) {
            bitmap = m9525T1((VectorDrawable) this.f7093A.getDrawable());
        } else {
            bitmap = C6443v.m24755a(this.f7093A.getDrawable());
        }
        if (bitmap != null && (bitmap.getWidth() > 192 || bitmap.getHeight() > 192)) {
            bitmap = Bitmap.createScaledBitmap(bitmap, 192, 192, false);
        }
        if (macro == null) {
            str = "";
        } else {
            str = TextUtils.isEmpty(macro.getName()) ? " " : macro.getName();
        }
        m9524S1(macro, str, bitmap);
        this.f7093A = null;
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m9531Z1(AppCompatDialog appCompatDialog, View view) {
        appCompatDialog.cancel();
        this.f7093A = null;
        finish();
    }

    /* renamed from: a2 */
    private void m9532a2(Macro macro) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(this, C17542R$style.Theme_App_Dialog);
        appCompatDialog.setCancelable(false);
        appCompatDialog.setContentView((int) C17535R$layout.dialog_shortcut_icon_configure);
        appCompatDialog.setTitle((CharSequence) getString(C17541R$string.select_icon));
        this.f7093A = (ImageView) appCompatDialog.findViewById(C17532R$id.shortcut_icon_configure_icon);
        ((Button) appCompatDialog.findViewById(C17532R$id.shortcut_icon_configure_change_button)).setOnClickListener(new C4913m0(this));
        ((Button) appCompatDialog.findViewById(C17532R$id.okButton)).setOnClickListener(new C4965o0(this, appCompatDialog, macro));
        ((Button) appCompatDialog.findViewById(C17532R$id.cancelButton)).setOnClickListener(new C4963n0(this, appCompatDialog));
        appCompatDialog.show();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Macro S;
        super.onActivityResult(i, i2, intent);
        if (i == 88) {
            if (intent != null && (S = C4934n.m18998M().mo29684S(intent.getStringExtra("com.arlosoft.macrodroid.MACRO_NAME"))) != null) {
                m9532a2(S);
            }
        } else if (i == 0 && i2 == -1) {
            this.f7099s = intent.getStringExtra("drawableName");
            this.f7098p = intent.getStringExtra("drawablePackageName");
            Uri data = intent.getData();
            this.f7100z = data;
            ImageView imageView = this.f7093A;
            if (imageView == null) {
                return;
            }
            if (data != null) {
                imageView.setImageURI(data);
                return;
            }
            String str = this.f7098p;
            if (str == null || !str.equals("UserIcon")) {
                Drawable I = C4061t1.m15960I(this, this.f7098p, this.f7099s);
                if (I != null) {
                    this.f7093A.setImageDrawable(I);
                    return;
                }
                return;
            }
            Bitmap f = C6362a0.m24600f(this.f7099s);
            if (f != null) {
                this.f7093A.setImageBitmap(f);
            } else {
                this.f7093A.setImageResource(C17530R$drawable.launcher_no_border);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Macro macro = (Macro) getIntent().getParcelableExtra(C8157f.ITEM_TYPE);
        int i = 1;
        if (macro != null) {
            this.f7094B = true;
            m9532a2(macro);
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("extra_pick_icon", true);
        ArrayList<Macro> arrayList = new ArrayList<>(C4934n.m18998M().mo29672B(true));
        String[] strArr = new String[(arrayList.size() + 1)];
        strArr[0] = "<" + getString(C17541R$string.add_new_macro) + ">";
        for (Macro macro2 : arrayList) {
            int i2 = i + 1;
            if (macro2.getIsFavourite()) {
                str = "⭐ " + macro2.getName();
            } else {
                str = macro2.getName();
            }
            strArr[i] = str;
            i = i2;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.select_macro);
        builder.setSingleChoiceItems((CharSequence[]) strArr, 0, (DialogInterface.OnClickListener) new C4831k0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4829j0(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C4833l0(this, booleanExtra, arrayList));
        builder.create().show();
    }
}
