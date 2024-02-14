package com.arlosoft.macrodroid.logging.systemlog;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6409o;
import java.net.URLDecoder;
import kotlin.jvm.internal.C13706o;
import p081e1.C7264a;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.a */
/* compiled from: MacroMovementMethod.kt */
public final class C4876a extends LinkMovementMethod {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Activity f12256a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f12257b;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.a$a */
    /* compiled from: MacroMovementMethod.kt */
    public static final class C4877a implements C6409o.C6412c {

        /* renamed from: a */
        final /* synthetic */ C4876a f12258a;

        /* renamed from: b */
        final /* synthetic */ Uri f12259b;

        C4877a(C4876a aVar, Uri uri) {
            this.f12258a = aVar;
            this.f12259b = uri;
        }

        /* renamed from: a */
        public void mo24616a() {
        }

        /* renamed from: b */
        public void mo24617b() {
            this.f12258a.f12256a.startActivity(new Intent("android.intent.action.VIEW", this.f12259b));
            this.f12258a.f12257b = true;
        }
    }

    public C4876a(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12256a = activity;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        C13706o.m87929f(textView, "widget");
        C13706o.m87929f(spannable, "buffer");
        C13706o.m87929f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = x + textView.getScrollX();
        int scrollY = y + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
        if (uRLSpanArr.length > 0) {
            Uri parse = Uri.parse(uRLSpanArr[0].getURL());
            String lastPathSegment = parse.getLastPathSegment();
            try {
                lastPathSegment = URLDecoder.decode(lastPathSegment);
            } catch (Exception unused) {
            }
            Macro S = C4934n.m18998M().mo29684S(lastPathSegment);
            if (S != null) {
                String category = S.getCategory();
                C7264a q = MacroDroidApplication.f9883I.mo27303b().mo27293q(Category.CATEGORY_CACHE);
                CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
                if (categoryList != null) {
                    C13706o.m87928e(category, "categoryName");
                    Category categoryByName = categoryList.getCategoryByName(category);
                    if (categoryByName != null && categoryByName.isLocked() && !this.f12257b) {
                        if (motionEvent.getAction() == 1) {
                            C6409o oVar = new C6409o(q, (C6409o.C6411b) null);
                            Activity activity = this.f12256a;
                            oVar.mo32449u(activity, activity.getString(C17541R$string.enter_category_lock_password), category, C5163j2.m19992J0(this.f12256a), 0, new C4877a(this, parse));
                        }
                        return false;
                    }
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
