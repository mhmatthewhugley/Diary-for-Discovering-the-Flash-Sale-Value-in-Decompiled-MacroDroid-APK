package com.arlosoft.macrodroid.triggers.activities.selecticon;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17536R$menu;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.templatestore.p071ui.C5274a;
import com.arlosoft.macrodroid.templatestore.p071ui.C5275b;
import com.arlosoft.macrodroid.utils.C6391i0;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.commons.p353io.FileUtils;
import p113j3.C13278a;
import p113j3.C13279b;
import p113j3.C13280c;
import p113j3.C13281d;
import p113j3.C7449j;

public class IconSelectActivity extends MacroDroidBaseActivity implements C5275b {

    /* renamed from: A */
    private boolean f13868A;

    /* renamed from: B */
    private TextView f13869B;

    /* renamed from: C */
    private ViewPager f13870C;

    /* renamed from: D */
    private SearchView f13871D;

    /* renamed from: o */
    private CardView f13872o;

    /* renamed from: p */
    private boolean f13873p = true;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ArrayList<C5274a> f13874s = new ArrayList<>();

    /* renamed from: z */
    private C7449j f13875z;

    /* renamed from: com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity$a */
    class C5855a implements SearchView.OnQueryTextListener {
        C5855a() {
        }

        public boolean onQueryTextChange(String str) {
            Iterator it = IconSelectActivity.this.f13874s.iterator();
            while (it.hasNext()) {
                ((C5274a) it.next()).mo30432L(str);
            }
            return true;
        }

        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    /* renamed from: V1 */
    private void m23939V1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, C17542R$style.Theme_App_Dialog_Action);
        builder.setTitle((int) C17541R$string.install_new_icon_pack);
        builder.setMessage((int) C17541R$string.install_ipack_detail);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13278a(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    /* renamed from: W1 */
    private void m23940W1(String str) {
        try {
            File file = new File(str);
            FileUtils.copyFile(file, getFilesDir());
            Intent intent = new Intent();
            intent.putExtra("drawableName", file);
            setResult(-1, intent);
            finish();
        } catch (IOException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public /* synthetic */ void m23941X1(DialogInterface dialogInterface, int i) {
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/store/search?q=Ipack&c=apps")));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public /* synthetic */ void m23942Y1(View view) {
        C5163j2.m20123b4(getApplicationContext(), true);
        this.f13872o.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public /* synthetic */ void m23943Z1(View view) {
        m23945b2();
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public /* synthetic */ void m23944a2(View view) {
        m23946c2();
    }

    /* renamed from: b2 */
    private void m23945b2() {
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://play.google.com/store/search?q=adw%20icon%20pack&c=apps")));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: c2 */
    private void m23946c2() {
        boolean z = !this.f13873p;
        this.f13873p = z;
        if (z) {
            this.f13869B.setBackgroundColor(ContextCompat.getColor(this, C17528R$color.icon_picker_select_bg));
            this.f13869B.setTextColor(ContextCompat.getColor(this, 2131099722));
            this.f13870C.setBackgroundColor(ContextCompat.getColor(this, 2131099722));
            return;
        }
        this.f13869B.setBackgroundColor(ContextCompat.getColor(this, 2131099722));
        this.f13869B.setTextColor(ContextCompat.getColor(this, 2131101114));
        this.f13870C.setBackgroundColor(ContextCompat.getColor(this, C17528R$color.icon_picker_select_bg));
    }

    /* renamed from: Y */
    public void mo30411Y(C5274a aVar) {
        this.f13874s.add(aVar);
    }

    /* renamed from: b0 */
    public void mo30412b0(C5274a aVar) {
        this.f13874s.remove(aVar);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4282) {
            if (i2 == -1) {
                Uri data = intent.getData();
                Intent intent2 = new Intent();
                intent2.putExtra("drawableId", 0);
                intent2.putExtra("drawableName", "");
                intent2.putExtra("drawablePackageName", "");
                intent2.setData(Uri.parse("android.resource://" + data.getHost() + "/" + intent.getExtras().getInt("net.dinglisch.android.ipack.extras.ICON_ID")));
                setResult(-1, intent2);
                finish();
            }
        } else if (i2 == -1) {
            String string = intent.getExtras().getString("FileSelection");
            File file = new File(string);
            if (i == 47) {
                C5163j2.m20147e4(this, file.getParent());
                m23940W1(string);
            }
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.select_icon_top_level);
        setTitle(C17541R$string.select_icon);
        C6391i0 i0Var = new C6391i0();
        i0Var.mo32435c(getApplicationContext());
        HashMap<String, C6391i0.C6392a> b = i0Var.mo32434b(true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String next : b.keySet()) {
            arrayList.add(next);
            arrayList2.add(b.get(next).f14989b);
        }
        this.f13868A = getIntent().getBooleanExtra("DisplayAppIcons", true);
        this.f13870C = (ViewPager) findViewById(C17532R$id.select_icon_top_level_view_pager);
        this.f13871D = (SearchView) findViewById(C17532R$id.searchView);
        C7449j jVar = new C7449j(this, getSupportFragmentManager(), this.f13868A, arrayList, arrayList2, true);
        this.f13875z = jVar;
        this.f13870C.setAdapter(jVar);
        this.f13872o = (CardView) findViewById(C17532R$id.infoCardView);
        ((Button) findViewById(C17532R$id.infoCardGotIt)).setOnClickListener(new C13279b(this));
        ((Button) findViewById(C17532R$id.info_card_search)).setOnClickListener(new C13281d(this));
        this.f13871D.setOnQueryTextListener(new C5855a());
        if (!this.f13868A || C5163j2.m20207m0(getApplicationContext())) {
            this.f13872o.setVisibility(8);
        } else {
            this.f13872o.setVisibility(0);
        }
        ((TabLayout) findViewById(C17532R$id.tabs)).setupWithViewPager(this.f13870C);
        TextView textView = (TextView) findViewById(C17532R$id.toggle_bg_color);
        this.f13869B = textView;
        textView.setOnClickListener(new C13280c(this));
        if ((getResources().getConfiguration().uiMode & 48) != 32) {
            m23946c2();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!this.f13868A) {
            return true;
        }
        getMenuInflater().inflate(C17536R$menu.icon_select_menu, menu);
        if (C5163j2.m20207m0(getApplicationContext())) {
            return true;
        }
        menu.findItem(C17532R$id.menu_show_info_card).setVisible(false);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            case C17532R$id.menu_icon_pack_search:
                m23945b2();
                return true;
            case C17532R$id.menu_install_new_icon_pack:
                m23939V1();
                return true;
            case C17532R$id.menu_show_info_card:
                this.f13872o.setVisibility(0);
                return true;
            case C17532R$id.menu_use_icon_pack:
                try {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(C17529R$dimen.ipack_icon_size);
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(C17529R$dimen.ipack_cell_size);
                    Intent intent = new Intent("net.dinglisch.android.ipack.actions.ICON_SELECT");
                    intent.putExtra("net.dinglisch.android.ipack.extras.ICON_DISPLAY_SIZE", dimensionPixelSize);
                    intent.putExtra("net.dinglisch.android.ipack.extras.CELL_SIZE", dimensionPixelSize2);
                    startActivityForResult(Intent.createChooser(intent, getString(C17541R$string.icon_selection_choose_ipack)), 4282);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    m23939V1();
                    return true;
                }
            default:
                return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.f13871D.setFocusable(false);
        this.f13871D.clearFocus();
    }

    @NonNull
    /* renamed from: z */
    public String mo30419z() {
        return this.f13871D.getQuery().toString();
    }
}
