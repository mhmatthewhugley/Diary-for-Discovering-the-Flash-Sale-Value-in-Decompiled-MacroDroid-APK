package com.arlosoft.macrodroid.homescreen.tiles;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4043o;
import com.arlosoft.macrodroid.logging.systemlog.SystemLogActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.io.File;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.IOUtils;
import org.apache.commons.p353io.input.ReversedLinesFileReader;
import p198z1.C10433a;

/* renamed from: com.arlosoft.macrodroid.homescreen.tiles.x */
/* compiled from: SystemLogTile.kt */
public final class C4823x extends C10433a {

    /* renamed from: b */
    private final Activity f12121b;

    /* renamed from: c */
    private final String f12122c;

    /* renamed from: d */
    private final int f12123d = C17530R$drawable.ic_text_box;

    /* renamed from: e */
    private final long f12124e = 11;

    /* renamed from: f */
    private final int f12125f;

    public C4823x(Activity activity) {
        C13706o.m87929f(activity, "activity");
        this.f12121b = activity;
        String string = activity.getString(C17541R$string.system_log);
        C13706o.m87928e(string, "activity.getString(R.string.system_log)");
        this.f12122c = string;
        this.f12125f = ContextCompat.getColor(activity, C17528R$color.system_log_primary);
    }

    /* renamed from: a */
    public int mo29331a() {
        return this.f12125f;
    }

    /* renamed from: b */
    public int mo29332b() {
        return this.f12123d;
    }

    /* renamed from: c */
    public long mo29333c() {
        return this.f12124e;
    }

    /* renamed from: e */
    public String mo29334e() {
        return this.f12122c;
    }

    /* renamed from: f */
    public void mo29335f(View view, View view2) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(view2, "iconView");
        this.f12121b.startActivity(new Intent(this.f12121b, SystemLogActivity.class));
    }

    /* renamed from: g */
    public void mo29346g(FrameLayout frameLayout) {
        C13706o.m87929f(frameLayout, "view");
        Context context = frameLayout.getContext();
        C13706o.m87928e(context, "view.context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(C17535R$layout.home_tile_custom_log, frameLayout, true);
            ((TextView) frameLayout.findViewById(C17532R$id.logText)).setText(mo29347h());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* renamed from: h */
    public final String mo29347h() {
        int F = C5163j2.m19962F(this.f12121b);
        try {
            File filesDir = this.f12121b.getFilesDir();
            C13706o.m87928e(filesDir, "activity.getFilesDir()");
            File file = new File(filesDir.toString() + '/' + C4043o.m15938c(F));
            StringBuilder sb = new StringBuilder();
            if (file.exists()) {
                ReversedLinesFileReader reversedLinesFileReader = new ReversedLinesFileReader(file, 4096, "utf-8");
                int i = 0;
                while (true) {
                    String readLine = reversedLinesFileReader.readLine();
                    C13706o.m87928e(readLine, "it");
                    if (readLine == null || i >= 10) {
                        break;
                    }
                    int a0 = C15177w.m93682a0(readLine, "] - ", 0, false, 6, (Object) null);
                    if (a0 != -1) {
                        String substring = readLine.substring(a0 + 4);
                        C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    } else {
                        sb.append(readLine);
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                    i++;
                }
            }
            if (sb.length() <= 0) {
                return "";
            }
            String sb2 = sb.toString();
            C13706o.m87928e(sb2, "stringBuilder.toString()");
            return C15176v.m93630E(sb2, "\\n", IOUtils.LINE_SEPARATOR_UNIX, false, 4, (Object) null);
        } catch (Exception unused) {
            return "";
        }
    }
}
