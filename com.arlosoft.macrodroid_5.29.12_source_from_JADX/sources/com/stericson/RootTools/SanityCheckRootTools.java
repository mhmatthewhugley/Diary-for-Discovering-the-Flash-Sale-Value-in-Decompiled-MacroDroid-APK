package com.stericson.RootTools;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StrictMode;
import android.widget.ScrollView;
import android.widget.TextView;
import com.stericson.RootShell.exceptions.RootDeniedException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.apache.commons.p353io.IOUtils;
import p376r7.C16351a;
import p376r7.C16355b;
import p385s7.C16505a;
import p394t7.C16580b;

public class SanityCheckRootTools extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ScrollView f57606a;

    /* renamed from: c */
    private TextView f57607c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ProgressDialog f57608d;

    /* renamed from: com.stericson.RootTools.SanityCheckRootTools$a */
    class C11727a implements Runnable {
        C11727a() {
        }

        public void run() {
            SanityCheckRootTools.this.f57606a.fullScroll(130);
        }
    }

    /* renamed from: com.stericson.RootTools.SanityCheckRootTools$b */
    private class C11728b extends Thread {

        /* renamed from: a */
        private Handler f57610a;

        /* renamed from: com.stericson.RootTools.SanityCheckRootTools$b$a */
        class C11729a extends C16351a {
            C11729a(int i, String... strArr) {
                super(i, strArr);
            }

            /* renamed from: c */
            public void mo25775c(int i, String str) {
                C11728b bVar = C11728b.this;
                bVar.m81912b(3, str + IOUtils.LINE_SEPARATOR_UNIX);
                super.mo25775c(i, str);
            }
        }

        /* renamed from: com.stericson.RootTools.SanityCheckRootTools$b$b */
        class C11730b extends C16351a {
            C11730b(int i, int i2, String... strArr) {
                super(i, i2, strArr);
            }

            /* renamed from: c */
            public void mo25775c(int i, String str) {
                C11728b bVar = C11728b.this;
                bVar.m81912b(3, str + IOUtils.LINE_SEPARATOR_UNIX);
                super.mo25775c(i, str);
            }
        }

        /* renamed from: com.stericson.RootTools.SanityCheckRootTools$b$c */
        class C11731c extends C16351a {
            C11731c(int i, String... strArr) {
                super(i, strArr);
            }

            /* renamed from: c */
            public void mo25775c(int i, String str) {
                C11728b bVar = C11728b.this;
                bVar.m81912b(3, str + IOUtils.LINE_SEPARATOR_UNIX);
                super.mo25775c(i, str);
            }
        }

        /* renamed from: com.stericson.RootTools.SanityCheckRootTools$b$d */
        class C11732d extends C16351a {
            C11732d(int i, String... strArr) {
                super(i, strArr);
            }

            /* renamed from: c */
            public void mo25775c(int i, String str) {
                C11728b bVar = C11728b.this;
                bVar.m81912b(3, str + IOUtils.LINE_SEPARATOR_UNIX);
                super.mo25775c(i, str);
            }
        }

        /* renamed from: com.stericson.RootTools.SanityCheckRootTools$b$e */
        class C11733e extends C16351a {
            C11733e(int i, String... strArr) {
                super(i, strArr);
            }

            /* renamed from: c */
            public void mo25775c(int i, String str) {
                C11728b bVar = C11728b.this;
                bVar.m81912b(3, str + IOUtils.LINE_SEPARATOR_UNIX);
                super.mo25775c(i, str);
            }
        }

        /* renamed from: com.stericson.RootTools.SanityCheckRootTools$b$f */
        class C11734f extends C16351a {

            /* renamed from: p */
            boolean f57617p = false;

            C11734f(int i, boolean z, String... strArr) {
                super(i, z, strArr);
            }

            /* renamed from: a */
            public void mo25774a(int i, int i2) {
                synchronized (SanityCheckRootTools.this) {
                    this.f57617p = true;
                    C11728b.this.m81912b(4, "All tests complete.");
                    C11728b.this.m81912b(2, (String) null);
                    try {
                        C16505a.m98561b();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            /* renamed from: c */
            public void mo25775c(int i, String str) {
                if (this.f57617p) {
                    C16505a.m98585z("CAUGHT!!!");
                }
                super.mo25775c(i, str);
            }

            /* renamed from: d */
            public void mo25776d(int i, String str) {
                synchronized (SanityCheckRootTools.this) {
                    this.f57617p = true;
                    C11728b.this.m81912b(4, "All tests complete.");
                    C11728b.this.m81912b(2, (String) null);
                    try {
                        C16505a.m98561b();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public C11728b(Context context, Handler handler) {
            this.f57610a = handler;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m81912b(int i, String str) {
            Message obtainMessage = this.f57610a.obtainMessage();
            Bundle bundle = new Bundle();
            bundle.putInt("action", i);
            bundle.putString("text", str);
            obtainMessage.setData(bundle);
            this.f57610a.sendMessage(obtainMessage);
        }

        public void run() {
            m81912b(1, (String) null);
            m81912b(4, "Testing getPath");
            m81912b(3, "[ getPath ]\n");
            try {
                for (String str : C16505a.m98573n()) {
                    m81912b(3, str + " k\n\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            m81912b(4, "Testing A ton of commands");
            m81912b(3, "[ Ton of Commands ]\n");
            for (int i = 0; i < 100; i++) {
                C16505a.m98564e("/system/xbin/busybox");
            }
            m81912b(4, "Testing Find Binary");
            boolean x = C16505a.m98583x();
            m81912b(3, "[ Checking Root ]\n");
            m81912b(3, x + " k\n\n");
            m81912b(4, "Testing file exists");
            m81912b(3, "[ Checking Exists() ]\n");
            m81912b(3, C16505a.m98564e("/system/sbin/[") + " k\n\n");
            m81912b(4, "Testing Is Access Given");
            boolean v = C16505a.m98581v();
            m81912b(3, "[ Checking for Access to Root ]\n");
            m81912b(3, v + " k\n\n");
            m81912b(4, "Testing Remount");
            boolean C = C16505a.m98558C("/system", "rw");
            m81912b(3, "[ Remounting System as RW ]\n");
            m81912b(3, C + " k\n\n");
            m81912b(4, "Testing CheckUtil");
            m81912b(3, "[ Checking busybox is setup ]\n");
            m81912b(3, C16505a.m98560a("busybox") + " k\n\n");
            m81912b(4, "Testing getBusyBoxVersion");
            m81912b(3, "[ Checking busybox version ]\n");
            m81912b(3, C16505a.m98568i("/system/xbin/") + " k\n\n");
            try {
                m81912b(4, "Testing fixUtils");
                m81912b(3, "[ Checking Utils ]\n");
                m81912b(3, C16505a.m98566g(new String[]{"ls", "rm", "ln", "dd", "chmod", "mount"}) + " k\n\n");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                m81912b(4, "Testing getSymlink");
                m81912b(3, "[ Checking [[ for symlink ]\n");
                m81912b(3, C16505a.m98580u("/system/bin/[[") + " k\n\n");
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            m81912b(4, "Testing getInode");
            m81912b(3, "[ Checking Inodes ]\n");
            m81912b(3, C16505a.m98570k("/system/bin/busybox") + " k\n\n");
            m81912b(4, "Testing GetBusyBoxapplets");
            try {
                m81912b(3, "[ Getting all available Busybox applets ]\n");
                for (String str2 : C16505a.m98567h("/data/data/stericson.busybox/files/bb/busybox")) {
                    m81912b(3, str2 + " k\n\n");
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            m81912b(4, "Testing GetBusyBox version in a special directory!");
            try {
                m81912b(3, "[ Testing GetBusyBox version in a special directory! ]\n");
                String i2 = C16505a.m98568i("/data/data/stericson.busybox/files/bb/");
                m81912b(3, i2 + " k\n\n");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            m81912b(4, "Testing getFilePermissionsSymlinks");
            C16580b j = C16505a.m98569j("/system/xbin/busybox");
            m81912b(3, "[ Checking busybox permissions and symlink ]\n");
            if (j != null) {
                m81912b(3, "Symlink: " + j.mo79409d() + " k\n\n");
                m81912b(3, "Group Permissions: " + j.mo79406a() + " k\n\n");
                m81912b(3, "Owner Permissions: " + j.mo79407b() + " k\n\n");
                m81912b(3, "Permissions: " + j.mo79408c() + " k\n\n");
                m81912b(3, "Type: " + j.mo79410e() + " k\n\n");
                m81912b(3, "User Permissions: " + j.mo79411f() + " k\n\n");
            } else {
                m81912b(3, "Permissions == null k\n\n");
            }
            m81912b(4, "Testing output capture");
            m81912b(3, "[ busybox ash --help ]\n");
            try {
                C16355b o = C16505a.m98574o(true);
                o.mo79032w(new C11729a(0, "busybox ash --help"));
                m81912b(4, "getevent - /dev/input/event0");
                m81912b(3, "[ getevent - /dev/input/event0 ]\n");
                o.mo79032w(new C11730b(0, 0, "getevent /dev/input/event0"));
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            m81912b(4, "Switching RootContext - SYSTEM_APP");
            m81912b(3, "[ Switching Root Context - SYSTEM_APP ]\n");
            try {
                C16355b s = C16505a.m98578s(true, C16355b.C16359d.SYSTEM_APP);
                s.mo79032w(new C11731c(0, "id"));
                m81912b(4, "Testing PM");
                m81912b(3, "[ Testing pm list packages -d ]\n");
                s.mo79032w(new C11732d(0, "sh /system/bin/pm list packages -d"));
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            m81912b(4, "Switching RootContext - UNTRUSTED");
            m81912b(3, "[ Switching Root Context - UNTRUSTED ]\n");
            try {
                C16505a.m98578s(true, C16355b.C16359d.UNTRUSTED_APP).mo79032w(new C11733e(0, "id"));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            m81912b(4, "Testing df");
            long t = C16505a.m98579t("/data");
            m81912b(3, "[ Checking /data partition size]\n");
            m81912b(3, t + "k\n\n");
            try {
                C16505a.m98574o(true).mo79032w(new C11734f(42, false, "echo done"));
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    /* renamed from: com.stericson.RootTools.SanityCheckRootTools$c */
    private class C11735c extends Handler {
        private C11735c() {
        }

        public void handleMessage(Message message) {
            int i = message.getData().getInt("action");
            String string = message.getData().getString("text");
            if (i == 1) {
                SanityCheckRootTools.this.f57608d.show();
                SanityCheckRootTools.this.f57608d.setMessage("Running Root Library Tests...");
            } else if (i == 2) {
                if (string != null) {
                    SanityCheckRootTools.this.mo66392c(string);
                }
                SanityCheckRootTools.this.f57608d.hide();
            } else if (i == 3) {
                SanityCheckRootTools.this.mo66392c(string);
            } else if (i == 4) {
                SanityCheckRootTools.this.f57608d.setMessage(string);
            }
        }

        /* synthetic */ C11735c(SanityCheckRootTools sanityCheckRootTools, C11727a aVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo66392c(CharSequence charSequence) {
        this.f57607c.append(charSequence);
        this.f57606a.post(new C11727a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedClosableObjects().penaltyLog().penaltyDeath().build());
        C16505a.f67202b = true;
        TextView textView = new TextView(this);
        this.f57607c = textView;
        textView.setText("");
        ScrollView scrollView = new ScrollView(this);
        this.f57606a = scrollView;
        scrollView.addView(this.f57607c);
        setContentView(this.f57606a);
        mo66392c("SanityCheckRootTools \n\n");
        if (C16505a.m98583x()) {
            mo66392c("Root found.\n");
        } else {
            mo66392c("Root not found");
        }
        try {
            C16355b.m98065L();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e2) {
            mo66392c("[ TIMEOUT EXCEPTION! ]\n");
            e2.printStackTrace();
        } catch (RootDeniedException e3) {
            mo66392c("[ ROOT DENIED EXCEPTION! ]\n");
            e3.printStackTrace();
        }
        try {
            if (!C16505a.m98581v()) {
                mo66392c("ERROR: No root access to this device.\n");
                return;
            }
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.f57608d = progressDialog;
            progressDialog.setCancelable(false);
            this.f57608d.setProgressStyle(0);
            new C11728b(this, new C11735c(this, (C11727a) null)).start();
        } catch (Exception unused) {
            mo66392c("ERROR: could not determine root access to this device.\n");
        }
    }
}
