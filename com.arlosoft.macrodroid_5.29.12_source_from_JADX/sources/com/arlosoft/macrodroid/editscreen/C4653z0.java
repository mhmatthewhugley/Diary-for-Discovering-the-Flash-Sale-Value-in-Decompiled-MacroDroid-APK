package com.arlosoft.macrodroid.editscreen;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.action.IfConditionAction;
import com.arlosoft.macrodroid.action.LoopAction;
import com.arlosoft.macrodroid.action.ParentAction;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.extensions.C4656c;
import com.arlosoft.macrodroid.extensions.C4666m;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6416p0;
import com.arlosoft.macrodroid.utils.C6421r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p424wa.C16788e;

/* renamed from: com.arlosoft.macrodroid.editscreen.z0 */
/* compiled from: TopLevelEditHelper.kt */
public final class C4653z0 {

    /* renamed from: a */
    private final Activity f11738a;

    /* renamed from: b */
    private final C16265l<Boolean, C13339u> f11739b;

    /* renamed from: c */
    private final C16254a<C13339u> f11740c;

    /* renamed from: d */
    private final C16254a<C13339u> f11741d;

    public C4653z0(Activity activity, C16265l<? super Boolean, C13339u> lVar, C16254a<C13339u> aVar, C16254a<C13339u> aVar2) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(lVar, "setHasEdited");
        C13706o.m87929f(aVar, "refresh");
        C13706o.m87929f(aVar2, "refreshActions");
        this.f11738a = activity;
        this.f11739b = lVar;
        this.f11740c = aVar;
        this.f11741d = aVar2;
    }

    /* renamed from: e */
    private final void m18097e(AppCompatDialog appCompatDialog, SelectableItem selectableItem, EditText editText) {
        selectableItem.mo27819E2(true);
        selectableItem.mo27815A2(String.valueOf(editText != null ? editText.getText() : null));
        appCompatDialog.dismiss();
        this.f11739b.invoke(Boolean.TRUE);
        this.f11740c.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m18098h(C4653z0 z0Var, AppCompatDialog appCompatDialog, SelectableItem selectableItem, EditText editText, TextView textView, int i, KeyEvent keyEvent) {
        C13706o.m87929f(z0Var, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(selectableItem, "$item");
        if (i != 6) {
            return false;
        }
        z0Var.m18097e(appCompatDialog, selectableItem, editText);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m18099i(EditText editText, View view) {
        if (editText != null) {
            editText.setText("");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m18100j(C4653z0 z0Var, AppCompatDialog appCompatDialog, SelectableItem selectableItem, EditText editText, View view) {
        C13706o.m87929f(z0Var, "this$0");
        C13706o.m87929f(appCompatDialog, "$dialog");
        C13706o.m87929f(selectableItem, "$item");
        z0Var.m18097e(appCompatDialog, selectableItem, editText);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m18101k(AppCompatDialog appCompatDialog, View view) {
        C13706o.m87929f(appCompatDialog, "$dialog");
        appCompatDialog.dismiss();
    }

    /* renamed from: f */
    public final void mo29097f(ParentAction parentAction, Macro macro) {
        int i;
        C13706o.m87929f(parentAction, "parentAction");
        C13706o.m87929f(macro, "macro");
        ArrayList<Action> actions = macro.getActions();
        int indexOf = actions.indexOf(parentAction);
        if (parentAction instanceof IfConditionAction) {
            i = C6416p0.m24705b(actions, indexOf);
        } else {
            i = parentAction instanceof LoopAction ? C6416p0.m24706c(actions, indexOf) : 0;
        }
        C16788e eVar = new C16788e(indexOf, i);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(actions.get(((C13603n0) it).nextInt()));
        }
        C6421r.m24727h(arrayList);
    }

    /* renamed from: g */
    public final void mo29098g(SelectableItem selectableItem, String str, boolean z) {
        C13706o.m87929f(selectableItem, "item");
        C13706o.m87929f(str, "title");
        AppCompatDialog appCompatDialog = new AppCompatDialog(this.f11738a, mo29100m(selectableItem));
        appCompatDialog.setContentView((int) C17535R$layout.dialog_comment);
        appCompatDialog.setTitle((CharSequence) str);
        C4656c.m18114c(appCompatDialog, this.f11738a.getResources().getDimensionPixelOffset(C17529R$dimen.margin_medium));
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        ImageButton imageButton = (ImageButton) appCompatDialog.findViewById(C17532R$id.clear_button);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_comment_text);
        if (editText != null) {
            editText.setText(selectableItem.mo27820F0());
        }
        if (editText != null) {
            C4666m.m18154v(editText);
        }
        if (z && imageButton != null) {
            imageButton.setVisibility(8);
        }
        if (editText != null) {
            editText.setOnEditorActionListener(new C4651y0(this, appCompatDialog, selectableItem, editText));
        }
        if (imageButton != null) {
            imageButton.setOnClickListener(new C4645v0(editText));
        }
        if (button != null) {
            button.setOnClickListener(new C4649x0(this, appCompatDialog, selectableItem, editText));
        }
        if (button2 != null) {
            button2.setOnClickListener(new C4647w0(appCompatDialog));
        }
        appCompatDialog.show();
        Window window = appCompatDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    /* renamed from: l */
    public final void mo29099l(SelectableItem selectableItem) {
        C13706o.m87929f(selectableItem, "item");
        ParentAction parentAction = (ParentAction) selectableItem;
        parentAction.mo25459K3(!parentAction.mo25458J3());
        this.f11741d.invoke();
    }

    /* renamed from: m */
    public final int mo29100m(SelectableItem selectableItem) {
        C13706o.m87929f(selectableItem, "selectableItem");
        if (selectableItem instanceof Trigger) {
            return C17542R$style.Theme_App_Dialog_Invert_Trigger;
        }
        return selectableItem instanceof Action ? C17542R$style.Theme_App_Dialog_Invert_Action : C17542R$style.Theme_App_Dialog_Invert_Constraint;
    }

    /* renamed from: n */
    public final void mo29101n(SelectableItem selectableItem) {
        C13706o.m87929f(selectableItem, "item");
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f11738a, mo29100m(selectableItem));
        builder.setTitle((CharSequence) selectableItem.mo25559a1());
        if (selectableItem.mo24673T0().mo27902t()) {
            builder.setMessage((CharSequence) C4061t1.m16007n(this.f11738a, selectableItem.mo25557Q0()));
        } else {
            builder.setMessage((CharSequence) selectableItem.mo25557Q0());
        }
        builder.setNegativeButton(17039370, (DialogInterface.OnClickListener) null);
        C4061t1.m16026w0(builder.show());
    }
}
