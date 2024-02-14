package com.araujo.jordan.excuseme.view.dialog;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import com.android.p023dx.rop.code.RegisterSpec;
import com.araujo.jordan.excuseme.R$id;
import com.araujo.jordan.excuseme.R$layout;
import com.araujo.jordan.excuseme.view.InvisibleActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p029d0.C1973a;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo71668d2 = {"Lcom/araujo/jordan/excuseme/view/dialog/d;", "Lcom/araujo/jordan/excuseme/view/dialog/b;", "Lcom/araujo/jordan/excuseme/view/InvisibleActivity;", "act", "", "h", "(Lcom/araujo/jordan/excuseme/view/InvisibleActivity;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "denied", "Lja/u;", "k", "g", "Ljava/lang/String;", "titleShowSettings", "reasonShowSettings", "i", "Ljava/util/List;", "deniedPermissions", "Lcom/araujo/jordan/excuseme/view/dialog/a;", "j", "Lcom/araujo/jordan/excuseme/view/dialog/a;", "()Lcom/araujo/jordan/excuseme/view/dialog/a;", "setDialogType", "(Lcom/araujo/jordan/excuseme/view/dialog/a;)V", "dialogType", "<init>", "()V", "excuseme_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: com.araujo.jordan.excuseme.view.dialog.d */
/* compiled from: PosPermissionDialog.kt */
public final class C1640d extends C1636b {

    /* renamed from: f */
    private C16269p<? super C1635a, ? super C16265l<? super Boolean, C13339u>, C13339u> f1092f;

    /* renamed from: g */
    private String f1093g;

    /* renamed from: h */
    private String f1094h;

    /* renamed from: i */
    private List<String> f1095i = C13614t.m87748j();

    /* renamed from: j */
    private C1635a f1096j = C1635a.EXPLAIN_AGAIN;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "a", "(Z)V"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.d$a */
    /* compiled from: PosPermissionDialog.kt */
    static final class C1641a extends C13708q implements C16265l<Boolean, C13339u> {
        final /* synthetic */ C1640d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1641a(C1640d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final void mo19253a(boolean z) {
            this.this$0.mo19244b(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo19253a(((Boolean) obj).booleanValue());
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.d$b */
    /* compiled from: PosPermissionDialog.kt */
    static final class C1642b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1640d f1097a;

        C1642b(C1640d dVar) {
            this.f1097a = dVar;
        }

        public final void onClick(View view) {
            this.f1097a.mo19244b(true);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.d$c */
    /* compiled from: PosPermissionDialog.kt */
    static final class C1643c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1640d f1098a;

        C1643c(C1640d dVar) {
            this.f1098a = dVar;
        }

        public final void onClick(View view) {
            this.f1098a.mo19244b(false);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "it", "Lja/u;", "onCancel", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: com.araujo.jordan.excuseme.view.dialog.d$d */
    /* compiled from: PosPermissionDialog.kt */
    static final class C1644d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ C1640d f1099a;

        C1644d(C1640d dVar) {
            this.f1099a = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f1099a.mo19244b(false);
        }
    }

    public C1640d() {
        super(false);
    }

    /* renamed from: h */
    public Object mo19250h(InvisibleActivity invisibleActivity, C13635d<? super Boolean> dVar) {
        T t;
        C1635a aVar;
        String str;
        String str2;
        Iterator<T> it = this.f1095i.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C13654b.m87833a(ActivityCompat.shouldShowRequestPermissionRationale(invisibleActivity, (String) t)).booleanValue()) {
                break;
            }
        }
        if (t instanceof String) {
            aVar = C1635a.EXPLAIN_AGAIN;
        } else {
            aVar = C1635a.SHOW_SETTINGS;
        }
        this.f1096j = aVar;
        C16269p<? super C1635a, ? super C16265l<? super Boolean, C13339u>, C13339u> pVar = this.f1092f;
        if (pVar == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(invisibleActivity);
            View inflate = invisibleActivity.getLayoutInflater().inflate(R$layout.dialog_gently_ask, (ViewGroup) null);
            C13706o.m87925b(inflate, RegisterSpec.PREFIX);
            int i = R$id.excuseMeGentlyTitle;
            TextView textView = (TextView) inflate.findViewById(i);
            if (textView != null) {
                int i2 = C1639c.f1090a[this.f1096j.ordinal()];
                if (i2 == 1) {
                    str2 = mo19248f();
                } else if (i2 == 2) {
                    str2 = this.f1093g;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(str2);
            }
            int i3 = R$id.excuseMeGentlyDescriptionText;
            TextView textView2 = (TextView) inflate.findViewById(i3);
            if (textView2 != null) {
                int i4 = C1639c.f1091b[this.f1096j.ordinal()];
                if (i4 == 1) {
                    str = mo19246d();
                } else if (i4 == 2) {
                    str = this.f1094h;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView2.setText(str);
            }
            int i5 = R$id.excuseMeGentlyYesBtn;
            Button button = (Button) inflate.findViewById(i5);
            if (button != null) {
                button.setOnClickListener(new C1642b(this));
            }
            Button button2 = (Button) inflate.findViewById(i5);
            if (button2 != null) {
                button2.setTextColor(C1973a.f6055a.mo23992a(invisibleActivity, "colorPrimaryDark"));
            }
            int i6 = R$id.excuseMeGentlyNoBtn;
            Button button3 = (Button) inflate.findViewById(i6);
            if (button3 != null) {
                button3.setTextColor(C1973a.f6055a.mo23992a(invisibleActivity, "colorPrimaryDark"));
            }
            TextView textView3 = (TextView) inflate.findViewById(i);
            if (textView3 != null) {
                textView3.setBackgroundColor(C1973a.f6055a.mo23992a(invisibleActivity, "colorPrimary"));
            }
            TextView textView4 = (TextView) inflate.findViewById(i3);
            if (textView4 != null) {
                textView4.setTextColor(C1973a.f6055a.mo23992a(invisibleActivity, "#0c0c0c"));
            }
            Button button4 = (Button) inflate.findViewById(i6);
            if (button4 != null) {
                button4.setOnClickListener(new C1643c(this));
            }
            builder.setOnCancelListener(new C1644d(this));
            builder.setView(inflate);
            builder.setCancelable(false);
            mo19249g(builder.show());
        } else if (pVar != null) {
            C13339u invoke = pVar.invoke(aVar, new C1641a(this));
        }
        return super.mo19250h(invisibleActivity, dVar);
    }

    /* renamed from: j */
    public final C1635a mo19251j() {
        return this.f1096j;
    }

    /* renamed from: k */
    public final void mo19252k(List<String> list) {
        C13706o.m87930g(list, "denied");
        this.f1095i = list;
    }
}
