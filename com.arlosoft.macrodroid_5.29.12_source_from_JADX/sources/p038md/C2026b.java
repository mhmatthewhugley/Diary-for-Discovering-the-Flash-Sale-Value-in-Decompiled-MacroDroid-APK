package p038md;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J$\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8W@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8W@VX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo71668d2 = {"Lmd/b;", "Lmd/a;", "Landroid/app/AlertDialog;", "", "buttonTextResource", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "Lja/u;", "onClicked", "b", "a", "f", "", "value", "getTitle", "()Ljava/lang/CharSequence;", "e", "(Ljava/lang/CharSequence;)V", "title", "getMessage", "d", "message", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "commons-base_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: md.b */
/* compiled from: AndroidAlertBuilder.kt */
public final class C2026b implements C2025a<AlertDialog> {

    /* renamed from: a */
    private final AlertDialog.Builder f6250a = new AlertDialog.Builder(mo24111c());

    /* renamed from: b */
    private final Context f6251b;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo71668d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "<anonymous parameter 1>", "Lja/u;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: md.b$a */
    /* compiled from: AndroidAlertBuilder.kt */
    static final class C2027a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C16265l f6252a;

        C2027a(C16265l lVar) {
            this.f6252a = lVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C16265l lVar = this.f6252a;
            C13706o.m87925b(dialogInterface, "dialog");
            lVar.invoke(dialogInterface);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo71668d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "<anonymous parameter 1>", "Lja/u;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: md.b$b */
    /* compiled from: AndroidAlertBuilder.kt */
    static final class C2028b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C16265l f6253a;

        C2028b(C16265l lVar) {
            this.f6253a = lVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C16265l lVar = this.f6253a;
            C13706o.m87925b(dialogInterface, "dialog");
            lVar.invoke(dialogInterface);
        }
    }

    public C2026b(Context context) {
        C13706o.m87930g(context, "ctx");
        this.f6251b = context;
    }

    /* renamed from: a */
    public void mo24108a(int i, C16265l<? super DialogInterface, C13339u> lVar) {
        C13706o.m87930g(lVar, "onClicked");
        this.f6250a.setNegativeButton(i, new C2027a(lVar));
    }

    /* renamed from: b */
    public void mo24109b(int i, C16265l<? super DialogInterface, C13339u> lVar) {
        C13706o.m87930g(lVar, "onClicked");
        this.f6250a.setPositiveButton(i, new C2028b(lVar));
    }

    /* renamed from: c */
    public Context mo24111c() {
        return this.f6251b;
    }

    /* renamed from: d */
    public void mo24112d(CharSequence charSequence) {
        C13706o.m87930g(charSequence, "value");
        this.f6250a.setMessage(charSequence);
    }

    /* renamed from: e */
    public void mo24113e(CharSequence charSequence) {
        C13706o.m87930g(charSequence, "value");
        this.f6250a.setTitle(charSequence);
    }

    /* renamed from: f */
    public AlertDialog show() {
        AlertDialog show = this.f6250a.show();
        C13706o.m87925b(show, "builder.show()");
        return show;
    }
}
