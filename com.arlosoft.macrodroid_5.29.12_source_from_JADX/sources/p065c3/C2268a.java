package p065c3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.templatestore.p071ui.comments.TemplateCommentsActivity;
import com.arlosoft.macrodroid.templatestore.p071ui.search.TemplateSearchActivity;
import com.arlosoft.macrodroid.utils.C6368b1;
import java.util.Arrays;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;

/* renamed from: c3.a */
/* compiled from: TemplateStoreNotificationHandler.kt */
public final class C2268a {

    /* renamed from: b */
    public static final C2269a f6975b = new C2269a((C13695i) null);

    /* renamed from: c */
    private static int f6976c = 783459;

    /* renamed from: a */
    private final Context f6977a;

    /* renamed from: c3.a$a */
    /* compiled from: TemplateStoreNotificationHandler.kt */
    public static final class C2269a {
        private C2269a() {
        }

        public /* synthetic */ C2269a(C13695i iVar) {
            this();
        }
    }

    public C2268a(Context context) {
        C13706o.m87929f(context, "context");
        this.f6977a = context;
    }

    /* renamed from: e */
    private final void m9336e(String str, String str2, PendingIntent pendingIntent) {
        NotificationCompat.Builder defaults = new NotificationCompat.Builder(this.f6977a, "template_store_updates").setSmallIcon((int) C17530R$drawable.template_store_update_notification).setContentTitle(str).setContentText(str2).setContentIntent(pendingIntent).setAutoCancel(true).setPriority(2).setDefaults(-1);
        C13706o.m87928e(defaults, "Builder(context, Constan…cationCompat.DEFAULT_ALL)");
        NotificationManagerCompat from = NotificationManagerCompat.from(this.f6977a);
        C13706o.m87928e(from, "from(context)");
        int i = f6976c;
        f6976c = i + 1;
        from.notify(i, defaults.build());
    }

    /* renamed from: f */
    static /* synthetic */ void m9337f(C2268a aVar, String str, String str2, PendingIntent pendingIntent, int i, Object obj) {
        if ((i & 4) != 0) {
            pendingIntent = null;
        }
        aVar.m9336e(str, str2, pendingIntent);
    }

    /* renamed from: a */
    public final void mo24575a(String str, int i, String str2, int i2) {
        C13706o.m87929f(str, "macroName");
        C13706o.m87929f(str2, ClientCookie.COMMENT_ATTR);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = this.f6977a.getString(C17541R$string.template_store_new_macro_comment_with_comment_text);
        C13706o.m87928e(string, "context.getString(R.stri…omment_with_comment_text)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
        C13706o.m87928e(format, "format(format, *args)");
        Intent intent = new Intent(this.f6977a, TemplateCommentsActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("macro_id", i);
        intent.putExtra("clear_update_subscription_id", i2);
        m9336e(str, format, PendingIntent.getActivity(this.f6977a, 0, intent, C6368b1.f14959b | 268435456));
    }

    /* renamed from: b */
    public final void mo24576b(String str) {
        C13706o.m87929f(str, "macroName");
        String string = this.f6977a.getString(C17541R$string.template_store_macro_deleted_notification);
        C13706o.m87928e(string, "context.getString(R.stri…cro_deleted_notification)");
        m9337f(this, str, string, (PendingIntent) null, 4, (Object) null);
    }

    /* renamed from: c */
    public final void mo24577c(String str, int i, int i2) {
        C13706o.m87929f(str, "macroName");
        Intent intent = new Intent(this.f6977a, TemplateSearchActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("search_text", "id=" + i);
        intent.putExtra("clear_update_subscription_id", i2);
        PendingIntent activity = PendingIntent.getActivity(this.f6977a, 0, intent, C6368b1.f14959b | 268435456);
        String string = this.f6977a.getString(C17541R$string.template_store_macro_updated_notification);
        C13706o.m87928e(string, "context.getString(R.stri…cro_updated_notification)");
        m9336e(str, string, activity);
    }

    /* renamed from: d */
    public final void mo24578d(String str, String str2, int i, int i2) {
        C13706o.m87929f(str, "username");
        C13706o.m87929f(str2, "macroName");
        Intent intent = new Intent(this.f6977a, TemplateSearchActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("search_text", "id=" + i);
        intent.putExtra("clear_update_subscription_id", i2);
        PendingIntent activity = PendingIntent.getActivity(this.f6977a, 0, intent, C6368b1.f14959b | 268435456);
        C13696i0 i0Var = C13696i0.f61931a;
        String string = this.f6977a.getString(C17541R$string.template_store_new_macro_notification_with_macro_name);
        C13706o.m87928e(string, "context.getString(R.stri…fication_with_macro_name)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str2, activity}, 2));
        C13706o.m87928e(format, "format(format, *args)");
        m9336e(str, format, activity);
    }
}
