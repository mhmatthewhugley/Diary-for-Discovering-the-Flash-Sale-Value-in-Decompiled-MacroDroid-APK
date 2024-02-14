package com.arlosoft.macrodroid.common;

import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.utils.C6362a0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p148q0.C8151a;
import p150q2.C8164a;

public class AndroidExplorer extends ListActivity {

    /* renamed from: a */
    private List<String> f10309a = null;

    /* renamed from: c */
    private final String f10310c = "/";

    /* renamed from: d */
    private TextView f10311d;

    /* renamed from: f */
    private String f10312f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f10313g;

    /* renamed from: o */
    private boolean f10314o;

    /* renamed from: p */
    private String f10315p;

    /* renamed from: s */
    private String f10316s;

    /* renamed from: z */
    private boolean f10317z;

    /* renamed from: com.arlosoft.macrodroid.common.AndroidExplorer$a */
    class C3979a extends ArrayAdapter<String> {
        C3979a(Context context, int i, List list) {
            super(context, i, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ((LayoutInflater) AndroidExplorer.this.getSystemService("layout_inflater")).inflate(C17535R$layout.explorer_row, (ViewGroup) null);
            }
            TextView textView = (TextView) view.findViewById(C17532R$id.rowtext);
            String str = (String) getItem(i);
            textView.setText(str);
            if (str.endsWith("/")) {
                textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                textView.setTypeface((Typeface) null, 0);
                textView.setTextSize(20.0f);
            } else if (AndroidExplorer.this.f10313g) {
                textView.setTextColor(Color.rgb(96, 96, 96));
                textView.setTextSize(16.0f);
            } else {
                textView.setTextColor(Color.rgb(32, 32, 160));
                textView.setTypeface((Typeface) null, 1);
                textView.setTextSize(20.0f);
            }
            return view;
        }
    }

    /* renamed from: f */
    private void m15385f(String str) {
        String str2;
        this.f10311d.setText(str);
        ArrayList arrayList = new ArrayList();
        this.f10309a = new ArrayList();
        File file = new File(str);
        File[] fileArr = new File[0];
        if (file.isDirectory()) {
            if (!file.canRead()) {
                fileArr = C6362a0.m24606l(file);
            } else {
                fileArr = file.listFiles();
                if (fileArr != null) {
                    Arrays.sort(fileArr, C4002d.f10371a);
                }
            }
        }
        if (!str.equals("/")) {
            arrayList.add("/");
            this.f10309a.add("/");
            arrayList.add("../");
            this.f10309a.add(file.getParent());
        }
        if (fileArr != null) {
            for (File file2 : fileArr) {
                if (file2.isDirectory()) {
                    if (file2.canRead() || this.f10317z) {
                        arrayList.add(file2.getName() + "/");
                        this.f10309a.add(file2.getPath());
                    }
                } else if (this.f10314o) {
                    String[] strArr = C4061t1.f10628h;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String str3 = strArr[i];
                        if (this.f10313g || file2.getName().toLowerCase().endsWith(str3.toLowerCase())) {
                            arrayList.add(file2.getName());
                            this.f10309a.add(file2.getPath());
                        } else {
                            i++;
                        }
                    }
                    arrayList.add(file2.getName());
                    this.f10309a.add(file2.getPath());
                } else {
                    String str4 = this.f10315p;
                    if (str4 == null && (str2 = this.f10316s) == null) {
                        if (str2 == null) {
                            arrayList.add(file2.getName());
                            this.f10309a.add(file2.getPath());
                        } else if (this.f10313g || file2.getName().endsWith(this.f10316s)) {
                            arrayList.add(file2.getName());
                            this.f10309a.add(file2.getPath());
                        }
                    } else if (this.f10313g || ((str4 != null && file2.getName().endsWith(this.f10315p)) || (this.f10315p != null && file2.getName().endsWith(this.f10316s)))) {
                        arrayList.add(file2.getName());
                        this.f10309a.add(file2.getPath());
                    }
                }
            }
        }
        setListAdapter(new C3979a(this, C17535R$layout.explorer_row, arrayList));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m15386g(File file, File file2) {
        if (file.isDirectory() && !file2.isDirectory()) {
            return -1;
        }
        if (!file2.isDirectory() || file.isDirectory()) {
            return file.getName().toLowerCase().compareTo(file2.getName().toLowerCase());
        }
        return 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m15387h(View view) {
        Intent intent = new Intent();
        intent.putExtra("FileSelection", this.f10311d.getText().toString());
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m15388i(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(C17535R$layout.android_explorer);
        this.f10311d = (TextView) findViewById(2131363479);
        this.f10317z = C8164a.m33886a();
        if (bundle != null) {
            this.f10312f = bundle.getString("Title");
            this.f10313g = bundle.getBoolean("Folder");
            this.f10314o = bundle.getBoolean("AudioFilter", false);
            this.f10315p = bundle.getString("FileExtensionFilter");
            this.f10316s = getIntent().getExtras().getString("FileExtensionFilter2");
            str = bundle.getString("Path");
        } else {
            if (getIntent().getExtras() == null) {
                finish();
            }
            this.f10312f = getIntent().getExtras().getString("Title");
            this.f10313g = getIntent().getExtras().getBoolean("Folder");
            this.f10314o = getIntent().getExtras().getBoolean("AudioFilter", false);
            this.f10315p = getIntent().getExtras().getString("FileExtensionFilter");
            this.f10316s = getIntent().getExtras().getString("FileExtensionFilter2");
            str = getIntent().getExtras().getString("Path");
        }
        if (str == null) {
            m15385f("/");
        } else {
            this.f10311d.setText(str);
            m15385f(str);
        }
        setTitle(this.f10312f);
        ((TextView) findViewById(C17532R$id.top_label)).setText(this.f10312f);
        Button button = (Button) findViewById(C17532R$id.okButton);
        Button button2 = (Button) findViewById(C17532R$id.cancelButton);
        ViewGroup viewGroup = (ViewGroup) findViewById(C17532R$id.button_bar);
        if (!this.f10313g) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        button.setOnClickListener(new C3999c(this));
        button2.setOnClickListener(new C3996b(this));
    }

    /* access modifiers changed from: protected */
    public void onListItemClick(ListView listView, View view, int i, long j) {
        File file = new File(this.f10309a.get(i));
        if (file.isDirectory()) {
            if (file.canRead()) {
                m15385f(this.f10309a.get(i));
            } else if (this.f10317z) {
                m15385f(this.f10309a.get(i));
            } else {
                C8151a.m33873n(new RuntimeException("AndroidExplorer: onListItemClick cannot read directory"));
                AlertDialog.Builder icon = new AlertDialog.Builder(this).setIcon(17301543);
                icon.setTitle((CharSequence) "[" + file.getName() + "] " + getString(C17541R$string.folder_cant_be_read)).setPositiveButton(17039370, (DialogInterface.OnClickListener) C3993a.f10354a).show();
            }
        } else if (!this.f10313g) {
            Intent intent = new Intent();
            intent.putExtra("FileSelection", this.f10309a.get(i));
            setResult(-1, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("Title", this.f10312f);
        super.onSaveInstanceState(bundle);
    }
}
