package com.araujo.jordan.excuseme.view.dialog;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.android.p023dx.rop.code.RegisterSpec;
import com.araujo.jordan.excuseme.R$id;
import com.araujo.jordan.excuseme.R$layout;
import com.araujo.jordan.excuseme.view.InvisibleActivity;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p029d0.C1973a;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/view/dialog/e;", "Lcom/araujo/jordan/excuseme/view/dialog/b;", "Lcom/araujo/jordan/excuseme/view/InvisibleActivity;", "act", "", "h", "(Lcom/araujo/jordan/excuseme/view/InvisibleActivity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "()V", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: com.araujo.jordan.excuseme.view.dialog.e */
/* compiled from: PrePermissionDialog.kt */
public final class C1645e extends C1636b {

    /* renamed from: f */
    private C16265l<? super C16265l<? super Boolean, C13339u>, C13339u> f1100f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "a", "(Z)V"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.e$a */
    /* compiled from: PrePermissionDialog.kt */
    static final class C1646a extends C13708q implements C16265l<Boolean, C13339u> {
        final /* synthetic */ C1645e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1646a(C1645e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final void mo19257a(boolean z) {
            this.this$0.mo19244b(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19257a(((Boolean) obj).booleanValue());
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.e$b */
    /* compiled from: PrePermissionDialog.kt */
    static final class C1647b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1645e f1101a;

        C1647b(C1645e eVar) {
            this.f1101a = eVar;
        }

        public final void onClick(View view) {
            this.f1101a.mo19244b(true);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.e$c */
    /* compiled from: PrePermissionDialog.kt */
    static final class C1648c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1645e f1102a;

        C1648c(C1645e eVar) {
            this.f1102a = eVar;
        }

        public final void onClick(View view) {
            this.f1102a.mo19244b(false);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onCancel", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.e$d */
    /* compiled from: PrePermissionDialog.kt */
    static final class C1649d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C1645e f1103a;

        C1649d(C1645e eVar) {
            this.f1103a = eVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f1103a.mo19244b(false);
        }
    }

    public C1645e() {
        super(false);
    }

    /* renamed from: h */
    public Object mo19250h(InvisibleActivity invisibleActivity, C13635d<? super Boolean> dVar) {
        C16265l<? super C16265l<? super Boolean, C13339u>, C13339u> lVar = this.f1100f;
        if (lVar == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(invisibleActivity);
            View inflate = invisibleActivity.getLayoutInflater().inflate(R$layout.dialog_gently_ask, (ViewGroup) null);
            C13706o.m87925b(inflate, RegisterSpec.PREFIX);
            int i = R$id.excuseMeGentlyTitle;
            TextView textView = (TextView) inflate.findViewById(i);
            if (textView != null) {
                textView.setText(mo19248f());
            }
            int i2 = R$id.excuseMeGentlyDescriptionText;
            TextView textView2 = (TextView) inflate.findViewById(i2);
            if (textView2 != null) {
                textView2.setText(mo19246d());
            }
            int i3 = R$id.excuseMeGentlyYesBtn;
            Button button = (Button) inflate.findViewById(i3);
            if (button != null) {
                button.setOnClickListener(new C1647b(this));
            }
            Button button2 = (Button) inflate.findViewById(i3);
            if (button2 != null) {
                button2.setTextColor(C1973a.f6055a.mo23992a(invisibleActivity, "colorPrimaryDark"));
            }
            int i4 = R$id.excuseMeGentlyNoBtn;
            Button button3 = (Button) inflate.findViewById(i4);
            if (button3 != null) {
                button3.setTextColor(C1973a.f6055a.mo23992a(invisibleActivity, "colorPrimaryDark"));
            }
            TextView textView3 = (TextView) inflate.findViewById(i);
            if (textView3 != null) {
                textView3.setBackgroundColor(C1973a.f6055a.mo23992a(invisibleActivity, "colorPrimary"));
            }
            TextView textView4 = (TextView) inflate.findViewById(i2);
            if (textView4 != null) {
                textView4.setTextColor(C1973a.f6055a.mo23992a(invisibleActivity, "#0c0c0c"));
            }
            Button button4 = (Button) inflate.findViewById(i4);
            if (button4 != null) {
                button4.setOnClickListener(new C1648c(this));
            }
            builder.setOnCancelListener(new C1649d(this));
            builder.setView(inflate);
            builder.setCancelable(false);
            mo19249g(builder.show());
        } else if (lVar != null) {
            C13339u invoke = lVar.invoke(new C1646a(this));
        }
        return super.mo19250h(invisibleActivity, dVar);
    }
}
