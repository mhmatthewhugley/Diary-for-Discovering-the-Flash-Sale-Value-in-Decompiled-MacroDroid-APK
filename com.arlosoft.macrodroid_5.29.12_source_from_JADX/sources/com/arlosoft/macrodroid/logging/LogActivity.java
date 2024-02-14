package com.arlosoft.macrodroid.logging;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.C1492k;
import com.airbnb.lottie.LottieAnimationView;
import com.arlosoft.macrodroid.C17527R$bool;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.categories.Category;
import com.arlosoft.macrodroid.categories.CategoryList;
import com.arlosoft.macrodroid.common.C4043o;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.events.LogUpdateEvent;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.utils.C6362a0;
import com.arlosoft.macrodroid.utils.C6409o;
import com.arlosoft.macrodroid.utils.C6413o0;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p353io.IOUtils;
import p012b0.C1398b;
import p048t.C2097e;
import p081e1.C7264a;
import p148q0.C8151a;
import p161s1.C10180a;
import p246e2.C12131a;
import p246e2.C12132b;
import p246e2.C12133c;
import p246e2.C12134d;
import p246e2.C12135e;
import p319lc.C15626c;

public class LogActivity extends MacroDroidBaseActivity {

    /* renamed from: B */
    public static String f12202B = "UserLog";

    /* renamed from: A */
    private LinkMovementMethod f12203A = new C4852b();
    @BindView(2131361976)
    LottieAnimationView emptyView;
    @BindView(2131362962)
    TextView infoCardDetail;
    @BindView(2131362963)
    Button infoCardGotIt;
    @BindView(2131362964)
    TextView infoCardTitle;
    @BindView(2131362965)
    CardView infoCardView;

    /* renamed from: o */
    private int f12204o;

    /* renamed from: p */
    private boolean f12205p;
    @BindView(2131363593)
    RecyclerView recyclerView;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f12206s;
    @BindView(2131364301)
    ViewFlipper viewFlipper;

    /* renamed from: z */
    private LogEntryAdapter f12207z;

    public static class LogEntryAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {

        /* renamed from: a */
        private Context f12208a;

        /* renamed from: c */
        private List<String> f12209c = new ArrayList();

        /* renamed from: d */
        private int f12210d;

        /* renamed from: f */
        private boolean f12211f;

        /* renamed from: g */
        private boolean f12212g;

        /* renamed from: o */
        private LinkMovementMethod f12213o;

        class ViewHolder extends RecyclerView.ViewHolder {
            @BindView(2131362446)
            ViewGroup dateHeader;
            @BindView(2131362448)
            TextView dateText;
            @BindView(2131363079)
            TextView logText;
            @BindView(2131364034)
            TextView timeStampText;

            public ViewHolder(View view) {
                super(view);
                ButterKnife.bind((Object) this, view);
            }
        }

        public class ViewHolder_ViewBinding implements Unbinder {

            /* renamed from: a */
            private ViewHolder f12215a;

            @UiThread
            public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
                this.f12215a = viewHolder;
                viewHolder.logText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.log_text, "field 'logText'", TextView.class);
                viewHolder.timeStampText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.timestamp_text, "field 'timeStampText'", TextView.class);
                viewHolder.dateHeader = (ViewGroup) Utils.findRequiredViewAsType(view, C17532R$id.date_header, "field 'dateHeader'", ViewGroup.class);
                viewHolder.dateText = (TextView) Utils.findRequiredViewAsType(view, C17532R$id.date_text, "field 'dateText'", TextView.class);
            }

            @CallSuper
            public void unbind() {
                ViewHolder viewHolder = this.f12215a;
                if (viewHolder != null) {
                    this.f12215a = null;
                    viewHolder.logText = null;
                    viewHolder.timeStampText = null;
                    viewHolder.dateHeader = null;
                    viewHolder.dateText = null;
                    return;
                }
                throw new IllegalStateException("Bindings already cleared.");
            }
        }

        public LogEntryAdapter(Context context, boolean z, LinkMovementMethod linkMovementMethod) {
            this.f12208a = context;
            this.f12212g = z;
            this.f12213o = linkMovementMethod;
        }

        /* renamed from: B */
        private String m18765B(boolean z, int i) {
            String str;
            if (!z) {
                int i2 = 1;
                while (true) {
                    int i3 = i - i2;
                    if (i3 < 0) {
                        return null;
                    }
                    str = this.f12209c.get(i3);
                    if (str.contains("] - ")) {
                        break;
                    }
                    i2++;
                }
            } else if (i == 0) {
                String str2 = this.f12209c.get(i);
                return str2.substring(0, Math.min(21, str2.length()));
            } else {
                int itemCount = getItemCount();
                while (true) {
                    int i4 = itemCount - i;
                    if (i4 < 0) {
                        return null;
                    }
                    str = this.f12209c.get(i4);
                    if (str.contains("] - ")) {
                        break;
                    }
                    i++;
                }
            }
            return str;
        }

        /* renamed from: C */
        private String m18766C(String str) {
            try {
                return "<a href=\"macrodroid://www.macrodroid.com/macro/" + URLEncoder.encode(str, "UTF-8") + "\">" + str + "</a>";
            } catch (Exception unused) {
                return "<a href=\"macrodroid://www.macrodroid.com/macro/" + str + "\">" + str + "</a>";
            }
        }

        /* renamed from: D */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            String str;
            String str2;
            String str3;
            viewHolder.logText.setTextSize(1, (float) this.f12210d);
            viewHolder.timeStampText.setTextSize(1, (float) (this.f12210d - 2));
            viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.default_text_color));
            viewHolder.logText.setTypeface((Typeface) null, 0);
            if (this.f12211f) {
                str = this.f12209c.get((getItemCount() - 1) - i);
            } else {
                str = this.f12209c.get(i);
            }
            String replace = str.replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
            if (!replace.contains("] - ")) {
                viewHolder.timeStampText.setVisibility(8);
                str2 = replace;
            } else if (!this.f12212g || C5163j2.m20257s2(this.f12208a)) {
                try {
                    String substring = replace.substring(0, replace.indexOf("] - ") + 4);
                    int length = substring.length();
                    String B = m18765B(this.f12211f, i);
                    if (B != null) {
                        String substring2 = B.substring(0, replace.indexOf(" ") + 1);
                        if (substring.startsWith(substring2)) {
                            viewHolder.dateHeader.setVisibility(8);
                        } else {
                            String substring3 = substring.substring(1, substring.indexOf(" "));
                            viewHolder.dateHeader.setVisibility(0);
                            viewHolder.dateText.setText(substring3);
                        }
                        str3 = substring.substring(substring2.length());
                    } else {
                        String substring4 = substring.substring(1, substring.indexOf(" ") + 1);
                        viewHolder.dateHeader.setVisibility(0);
                        viewHolder.dateText.setText(substring.substring(1, substring.indexOf(" ")));
                        str3 = substring.substring(substring4.length() + 1);
                    }
                    str2 = replace.substring(length);
                    viewHolder.timeStampText.setText(str3.replace("[", "").replace("]", ""));
                } catch (Exception unused) {
                    viewHolder.timeStampText.setText("");
                }
            } else {
                try {
                    String substring5 = replace.substring(0, replace.indexOf("] - ") + 4);
                    str2 = replace.substring(substring5.length());
                    viewHolder.timeStampText.setText(substring5.replace("[", "").replace("]", ""));
                    viewHolder.timeStampText.setVisibility(0);
                } catch (Exception unused2) {
                    viewHolder.timeStampText.setText("0000-00-00 00:00:00");
                    viewHolder.timeStampText.setVisibility(4);
                }
            }
            if (replace.contains("Invoking Macro: ")) {
                viewHolder.logText.setTypeface((Typeface) null, 1);
                String substring6 = str2.substring(str2.indexOf("Invoking Macro: ") + 16);
                viewHolder.logText.setText(C6413o0.m24692a("Invoking Macro: " + m18766C(substring6)));
                viewHolder.logText.setMovementMethod(this.f12213o);
            } else if (this.f12212g || (!replace.contains("Trigger Fired: ") && !str2.startsWith("T: "))) {
                if ((!this.f12212g) && (replace.contains("Action Run: ") || str2.startsWith("A: "))) {
                    viewHolder.logText.setTypeface((Typeface) null, 1);
                    viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.log_text_action));
                    if (str2.contains("constraint failed")) {
                        viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.log_text_action_constraint_fail));
                    } else {
                        viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.log_text_action));
                    }
                    if (str2.contains("{Macro:")) {
                        String substring7 = str2.substring(0, str2.indexOf("{Macro:"));
                        String substring8 = str2.substring(str2.indexOf("{Macro:") + 7, str2.length() - 1);
                        viewHolder.logText.setText(Html.fromHtml(substring7 + m18766C(substring8)));
                        viewHolder.logText.setMovementMethod(this.f12213o);
                        return;
                    }
                    viewHolder.logText.setText(str2);
                } else if (str2.contains("http:") || str2.contains("https:") || str2.contains("www.")) {
                    viewHolder.logText.setText(C6413o0.m24692a(str2));
                    if (str2.startsWith("{ERROR}")) {
                        viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.text_color_error));
                    }
                    Linkify.addLinks(viewHolder.logText, 3);
                } else {
                    if (replace.contains("{ERROR}")) {
                        viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.text_color_error));
                    } else if (str2.startsWith("ENABLED")) {
                        viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.log_enabled_color));
                    } else if (str2.startsWith("DISABLED")) {
                        viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.log_disabled_color));
                    }
                    viewHolder.logText.setText(str2);
                }
            } else {
                viewHolder.logText.setTypeface((Typeface) null, 1);
                viewHolder.logText.setText(str2);
                if (str2.contains("did not fire because") || str2.contains("constraint failed")) {
                    viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.log_text_trigger_not_run));
                } else {
                    viewHolder.logText.setTextColor(ContextCompat.getColor(this.f12208a, C17528R$color.log_text_trigger));
                }
            }
        }

        /* renamed from: E */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new ViewHolder(LayoutInflater.from(this.f12208a).inflate(C17535R$layout.list_item_log_entry, viewGroup, false));
        }

        /* renamed from: F */
        public void mo29397F(List<String> list, boolean z) {
            this.f12209c = list;
            this.f12211f = z;
            notifyDataSetChanged();
        }

        /* renamed from: G */
        public void mo29398G(int i) {
            this.f12210d = i;
            notifyDataSetChanged();
        }

        public Filter getFilter() {
            return null;
        }

        public int getItemCount() {
            return this.f12209c.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.LogActivity$a */
    class C4851a extends RecyclerView.OnScrollListener {
        C4851a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            boolean unused = LogActivity.this.f12206s = true;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.LogActivity$b */
    class C4852b extends LinkMovementMethod {

        /* renamed from: com.arlosoft.macrodroid.logging.LogActivity$b$a */
        class C4853a implements C6409o.C6412c {

            /* renamed from: a */
            final /* synthetic */ Uri f12218a;

            C4853a(Uri uri) {
                this.f12218a = uri;
            }

            /* renamed from: a */
            public void mo24616a() {
            }

            /* renamed from: b */
            public void mo24617b() {
                LogActivity.this.startActivity(new Intent("android.intent.action.VIEW", this.f12218a));
            }
        }

        C4852b() {
        }

        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            Category categoryByName;
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
                    C7264a q = MacroDroidApplication.m14845u().mo27293q(Category.CATEGORY_CACHE);
                    CategoryList categoryList = (CategoryList) q.mo37133c(Category.CATEGORIES_KEY, CategoryList.class);
                    if (!(categoryList == null || (categoryByName = categoryList.getCategoryByName(category)) == null || !categoryByName.isLocked())) {
                        if (motionEvent.getAction() != 1) {
                            C6409o oVar = new C6409o(q, (C6409o.C6411b) null);
                            LogActivity logActivity = LogActivity.this;
                            oVar.mo32449u(logActivity, logActivity.getString(C17541R$string.enter_category_lock_password), category, C5163j2.m19992J0(LogActivity.this), 0, new C4853a(parse));
                        }
                        return false;
                    }
                }
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
    }

    /* renamed from: W1 */
    private void m18752W1() {
        if ((!this.f12205p || !C5163j2.m19953D6(this)) && (this.f12205p || !C5163j2.m19937B6(this))) {
            this.infoCardView.setCardBackgroundColor(ContextCompat.getColor(this, this.f12205p ? C17528R$color.user_log_primary : C17528R$color.system_log_primary));
            this.infoCardTitle.setText(this.f12205p ? C17541R$string.user_log : C17541R$string.system_log);
            this.infoCardDetail.setText(this.f12205p ? C17541R$string.user_log_info_card : C17541R$string.system_log_info_card);
            this.infoCardGotIt.setOnClickListener(new C12133c(this));
            return;
        }
        this.infoCardView.setVisibility(8);
    }

    /* renamed from: X1 */
    public static String m18753X1(Context context) {
        ArrayList arrayList = new ArrayList();
        String str = context.getExternalFilesDir((String) null) + "/" + "MacroDroidUserLog.txt";
        try {
            FileInputStream openFileInput = MacroDroidApplication.m14845u().openFileInput("MacroDroidUserLog.txt");
            if (openFileInput == null) {
                return null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new DataInputStream(openFileInput)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine.replace("\\\\n", IOUtils.LINE_SEPARATOR_WINDOWS) + IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(str)));
            if (m18756a2(context, true)) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    dataOutputStream.write(((String) arrayList.get(size)).getBytes());
                }
            } else {
                for (int i = 0; i < arrayList.size(); i++) {
                    dataOutputStream.write(((String) arrayList.get(i)).getBytes());
                }
            }
            dataOutputStream.close();
            return str;
        } catch (Exception e) {
            if (!(e instanceof FileNotFoundException)) {
                C8151a.m33873n(new RuntimeException("Failed to output user log file: " + e.getMessage()));
            }
            return null;
        }
    }

    /* renamed from: Y1 */
    private void m18754Y1() {
        if (this.f12205p) {
            C5163j2.m20204l5(this, !C5163j2.m20296x1(this));
        } else {
            C5163j2.m20196k5(this, !C5163j2.m20288w1(this));
        }
        m18764i2(true);
    }

    /* renamed from: Z1 */
    private void m18755Z1() {
        String str;
        if (this.f12205p) {
            str = m18753X1(this);
        } else {
            str = C4043o.m15936a(this);
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", "MacroDroid Log");
            intent.putExtra("android.intent.extra.TEXT", "Here is the MacroDroid log file.");
            C6362a0.m24598d(this, intent, new File(str));
            startActivity(Intent.createChooser(intent, getString(C17541R$string.share_log)));
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(getApplicationContext(), getString(C17541R$string.no_app_found_to_share), 0).show();
        } catch (Exception e) {
            C15626c.makeText(getApplicationContext(), C17541R$string.export_failed, 0).show();
            C4878b.m18868g("Failed to export file: " + e.toString());
        }
    }

    /* renamed from: a2 */
    private static boolean m18756a2(Context context, boolean z) {
        if (z) {
            return C5163j2.m20296x1(context);
        }
        return C5163j2.m20288w1(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public /* synthetic */ void m18757b2(View view) {
        if (this.f12205p) {
            C5163j2.m20071U2(getApplicationContext());
        } else {
            C5163j2.m20057S2(getApplicationContext());
        }
        this.infoCardView.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public /* synthetic */ ColorFilter m18758c2(C1398b bVar) {
        return new PorterDuffColorFilter(ContextCompat.getColor(this, C17528R$color.white_transparent), PorterDuff.Mode.SRC_ATOP);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public /* synthetic */ boolean m18759d2(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C17532R$id.menu_large:
                this.f12204o = 14;
                break;
            case C17532R$id.menu_medium:
                this.f12204o = 12;
                break;
            case C17532R$id.menu_small:
                this.f12204o = 10;
                break;
            case C17532R$id.menu_very_large:
                this.f12204o = 16;
                break;
        }
        this.f12207z.mo29398G(this.f12204o);
        if (this.f12205p) {
            C5163j2.m20189j6(this, this.f12204o);
            return true;
        }
        C5163j2.m20315z4(this, this.f12204o);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public /* synthetic */ void m18760e2(DialogInterface dialogInterface, int i) {
        try {
            if (this.f12205p) {
                new File(getFilesDir() + "/" + "MacroDroidUserLog.txt").delete();
            } else {
                File file = new File(getFilesDir() + "/" + C4043o.m15938c(1));
                File file2 = new File(getFilesDir() + "/" + C4043o.m15938c(2));
                file.delete();
                file2.delete();
            }
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Log file deletion failed: " + e.getMessage()));
            C4061t1.m16023v(this, "Clear Log Failed", "The log file could not be cleared", false);
        }
        this.f12207z.mo29397F(new ArrayList(), true);
        this.viewFlipper.setDisplayedChild(1);
        dialogInterface.dismiss();
    }

    /* renamed from: g2 */
    private void m18762g2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((int) C17541R$string.clear_log);
        builder.setMessage((int) C17541R$string.are_you_sure_clear_log);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C12131a(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) C12132b.f58422a);
        builder.show();
    }

    /* renamed from: h2 */
    private void m18763h2(boolean z) {
        for (Macro excludeFromLog : C4934n.m18998M().mo29710z()) {
            excludeFromLog.setExcludeFromLog(z);
        }
        C4934n.m18998M().mo29702s0();
        C15626c.makeText(this, z ? C17541R$string.disabled : C17541R$string.enabled, 0).show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.io.File} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00f0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18764i2(boolean r11) {
        /*
            r10 = this;
            int r0 = com.arlosoft.macrodroid.settings.C5163j2.m19962F(r10)
            r1 = 1
            if (r0 != r1) goto L_0x0009
            r2 = 2
            goto L_0x000a
        L_0x0009:
            r2 = 1
        L_0x000a:
            boolean r3 = r10.f12205p
            java.lang.String r4 = "MacroDroidUserLog.txt"
            java.lang.String r5 = "/"
            r6 = 0
            if (r3 == 0) goto L_0x0031
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.io.File r8 = r10.getFilesDir()
            r7.append(r8)
            r7.append(r5)
            r7.append(r4)
            java.lang.String r5 = r7.toString()
            r3.<init>(r5)
            r7 = r3
            r3 = r6
            goto L_0x006f
        L_0x0031:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.io.File r8 = r10.getFilesDir()
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = com.arlosoft.macrodroid.common.C4043o.m15938c(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3.<init>(r7)
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.io.File r9 = r10.getFilesDir()
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = com.arlosoft.macrodroid.common.C4043o.m15938c(r0)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
        L_0x006f:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0122 }
            r5.<init>()     // Catch:{ Exception -> 0x0122 }
            r8 = 0
            if (r3 == 0) goto L_0x00ab
            boolean r3 = r3.exists()     // Catch:{ Exception -> 0x0122 }
            if (r3 == 0) goto L_0x00ab
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = com.arlosoft.macrodroid.common.C4043o.m15938c(r2)     // Catch:{ all -> 0x00a6 }
            java.io.FileInputStream r2 = r10.openFileInput(r2)     // Catch:{ all -> 0x00a6 }
            r3.<init>(r2)     // Catch:{ all -> 0x00a6 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x00a3 }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ all -> 0x00a3 }
            r9.<init>(r3)     // Catch:{ all -> 0x00a3 }
            r2.<init>(r9)     // Catch:{ all -> 0x00a3 }
        L_0x0094:
            java.lang.String r9 = r2.readLine()     // Catch:{ all -> 0x00a3 }
            if (r9 == 0) goto L_0x009e
            r5.add(r9)     // Catch:{ all -> 0x00a3 }
            goto L_0x0094
        L_0x009e:
            r3.close()     // Catch:{ Exception -> 0x00a1 }
        L_0x00a1:
            r2 = 1
            goto L_0x00ac
        L_0x00a3:
            r11 = move-exception
            r6 = r3
            goto L_0x00a7
        L_0x00a6:
            r11 = move-exception
        L_0x00a7:
            r6.close()     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            throw r11     // Catch:{ Exception -> 0x0122 }
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            boolean r3 = r7.exists()     // Catch:{ Exception -> 0x0122 }
            if (r3 == 0) goto L_0x00f1
            boolean r2 = r10.f12205p     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x00c5
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ all -> 0x00ec }
            com.arlosoft.macrodroid.app.MacroDroidApplication r2 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()     // Catch:{ all -> 0x00ec }
            java.io.FileInputStream r2 = r2.openFileInput(r4)     // Catch:{ all -> 0x00ec }
            r0.<init>(r2)     // Catch:{ all -> 0x00ec }
            r6 = r0
            goto L_0x00d3
        L_0x00c5:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = com.arlosoft.macrodroid.common.C4043o.m15938c(r0)     // Catch:{ all -> 0x00ec }
            java.io.FileInputStream r0 = r10.openFileInput(r0)     // Catch:{ all -> 0x00ec }
            r2.<init>(r0)     // Catch:{ all -> 0x00ec }
            r6 = r2
        L_0x00d3:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x00ec }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ec }
            r2.<init>(r6)     // Catch:{ all -> 0x00ec }
            r0.<init>(r2)     // Catch:{ all -> 0x00ec }
        L_0x00dd:
            java.lang.String r2 = r0.readLine()     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x00e7
            r5.add(r2)     // Catch:{ all -> 0x00ec }
            goto L_0x00dd
        L_0x00e7:
            r6.close()     // Catch:{ Exception -> 0x00ea }
        L_0x00ea:
            r2 = 1
            goto L_0x00f1
        L_0x00ec:
            r11 = move-exception
            r6.close()     // Catch:{ Exception -> 0x00f0 }
        L_0x00f0:
            throw r11     // Catch:{ Exception -> 0x0122 }
        L_0x00f1:
            boolean r0 = r10.f12205p     // Catch:{ Exception -> 0x0122 }
            boolean r0 = m18756a2(r10, r0)     // Catch:{ Exception -> 0x0122 }
            if (r2 == 0) goto L_0x011c
            com.arlosoft.macrodroid.logging.LogActivity$LogEntryAdapter r2 = r10.f12207z     // Catch:{ Exception -> 0x0122 }
            r2.mo29397F(r5, r0)     // Catch:{ Exception -> 0x0122 }
            if (r11 == 0) goto L_0x0116
            boolean r11 = r10.f12206s     // Catch:{ Exception -> 0x0122 }
            if (r11 != 0) goto L_0x0116
            if (r0 == 0) goto L_0x010c
            androidx.recyclerview.widget.RecyclerView r11 = r10.recyclerView     // Catch:{ Exception -> 0x0122 }
            r11.scrollToPosition(r8)     // Catch:{ Exception -> 0x0122 }
            goto L_0x0116
        L_0x010c:
            androidx.recyclerview.widget.RecyclerView r11 = r10.recyclerView     // Catch:{ Exception -> 0x0122 }
            int r0 = r5.size()     // Catch:{ Exception -> 0x0122 }
            int r0 = r0 - r1
            r11.scrollToPosition(r0)     // Catch:{ Exception -> 0x0122 }
        L_0x0116:
            android.widget.ViewFlipper r11 = r10.viewFlipper     // Catch:{ Exception -> 0x0122 }
            r11.setDisplayedChild(r8)     // Catch:{ Exception -> 0x0122 }
            goto L_0x0145
        L_0x011c:
            android.widget.ViewFlipper r11 = r10.viewFlipper     // Catch:{ Exception -> 0x0122 }
            r11.setDisplayedChild(r1)     // Catch:{ Exception -> 0x0122 }
            goto L_0x0145
        L_0x0122:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to read in error log: "
            r2.append(r3)
            java.lang.String r11 = r11.getMessage()
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            p148q0.C8151a.m33873n(r0)
            android.widget.ViewFlipper r11 = r10.viewFlipper
            r11.setDisplayedChild(r1)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logging.LogActivity.m18764i2(boolean):void");
    }

    public void onCreate(Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra(f12202B, false);
        this.f12205p = booleanExtra;
        if (booleanExtra) {
            setTheme(C17542R$style.Theme_App_UserLogs);
        }
        super.onCreate(bundle);
        setContentView(C17535R$layout.event_log);
        ButterKnife.bind((Activity) this);
        this.f12204o = this.f12205p ? C5163j2.m20265t2(this) : C5163j2.m19999K0(this);
        setTitle(this.f12205p ? C17541R$string.user_log : C17541R$string.system_log);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LogEntryAdapter logEntryAdapter = new LogEntryAdapter(this, this.f12205p, this.f12203A);
        this.f12207z = logEntryAdapter;
        logEntryAdapter.mo29398G(this.f12204o);
        this.recyclerView.setAdapter(this.f12207z);
        m18764i2(true);
        C10180a.m40075a().mo80019m(this);
        m18752W1();
        if (getResources().getBoolean(C17527R$bool.is_night_mode)) {
            this.emptyView.mo16978f(new C2097e("**"), C1492k.f984E, new C12135e(this));
        }
        this.recyclerView.addOnScrollListener(new C4851a());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17536R$menu.log_menu, menu);
        MenuItem findItem = menu.findItem(C17532R$id.menu_log_triggers);
        MenuItem findItem2 = menu.findItem(C17532R$id.menu_log_actions);
        MenuItem findItem3 = menu.findItem(C17532R$id.menu_log_constraints);
        MenuItem findItem4 = menu.findItem(C17532R$id.menu_date_layout);
        MenuItem findItem5 = menu.findItem(C17532R$id.menu_toggle_macro_logging);
        findItem4.setVisible(false);
        if (this.f12205p) {
            findItem.setVisible(false);
            findItem2.setVisible(false);
            findItem3.setVisible(false);
            findItem5.setVisible(false);
            return true;
        }
        findItem.setChecked(C5163j2.m20209m2(this));
        findItem2.setChecked(C5163j2.m20158g(this));
        findItem3.setChecked(C5163j2.m19938C(this));
        findItem5.setTitle(C5163j2.m20076V0(this) ? C17541R$string.disable_logging_in_all_macros : C17541R$string.enable_logging_in_all_macros);
        return true;
    }

    public void onDestroy() {
        C10180a.m40075a().mo80020p(this);
        super.onDestroy();
    }

    public void onEventMainThread(LogUpdateEvent logUpdateEvent) {
        m18764i2(true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z = false;
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            case C17532R$id.menu_clear_log:
                m18762g2();
                return true;
            case C17532R$id.menu_date_layout:
                boolean z2 = !C5163j2.m20257s2(this);
                C5163j2.m20181i6(this, z2);
                menuItem.setChecked(z2);
                m18764i2(false);
                return true;
            case C17532R$id.menu_log_actions:
                boolean z3 = !C5163j2.m20158g(this);
                C5163j2.m20162g3(this, z3);
                menuItem.setChecked(z3);
                return true;
            case C17532R$id.menu_log_constraints:
                boolean z4 = !C5163j2.m19938C(this);
                C5163j2.m19926A3(this, z4);
                menuItem.setChecked(z4);
                return true;
            case C17532R$id.menu_log_triggers:
                boolean z5 = !C5163j2.m20209m2(this);
                C5163j2.m20133c6(this, z5);
                menuItem.setChecked(z5);
                return true;
            case C17532R$id.menu_reorder:
                m18754Y1();
                return true;
            case C17532R$id.menu_share_log:
                m18755Z1();
                return true;
            case C17532R$id.menu_text_size:
                PopupMenu popupMenu = new PopupMenu(this, findViewById(C17532R$id.menu_share_log));
                popupMenu.inflate(C17536R$menu.text_size_menu);
                popupMenu.setOnMenuItemClickListener(new C12134d(this));
                popupMenu.show();
                popupMenu.getMenu().findItem(C17532R$id.menu_small).setChecked(this.f12204o == 10);
                popupMenu.getMenu().findItem(C17532R$id.menu_medium).setChecked(this.f12204o == 12);
                popupMenu.getMenu().findItem(C17532R$id.menu_large).setChecked(this.f12204o == 14);
                MenuItem findItem = popupMenu.getMenu().findItem(C17532R$id.menu_very_large);
                if (this.f12204o == 16) {
                    z = true;
                }
                findItem.setChecked(z);
                return true;
            case C17532R$id.menu_toggle_macro_logging:
                boolean V0 = C5163j2.m20076V0(this);
                m18763h2(V0);
                C5163j2.m20003K4(this, !V0);
                menuItem.setTitle(C5163j2.m20076V0(this) ? C17541R$string.disable_logging_in_all_macros : C17541R$string.enable_logging_in_all_macros);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
