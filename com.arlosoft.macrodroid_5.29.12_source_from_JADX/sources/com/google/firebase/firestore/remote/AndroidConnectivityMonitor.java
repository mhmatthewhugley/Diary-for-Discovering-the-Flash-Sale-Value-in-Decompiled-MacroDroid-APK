package com.google.firebase.firestore.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import java.util.ArrayList;
import java.util.List;

public final class AndroidConnectivityMonitor implements ConnectivityMonitor {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f54543a;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public final ConnectivityManager f54544b;
    @Nullable

    /* renamed from: c */
    private Runnable f54545c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<Consumer<ConnectivityMonitor.NetworkStatus>> f54546d = new ArrayList();

    private class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        private DefaultNetworkCallback() {
        }

        public void onAvailable(Network network) {
            synchronized (AndroidConnectivityMonitor.this.f54546d) {
                for (Consumer accept : AndroidConnectivityMonitor.this.f54546d) {
                    accept.accept(ConnectivityMonitor.NetworkStatus.REACHABLE);
                }
            }
        }

        public void onLost(Network network) {
            synchronized (AndroidConnectivityMonitor.this.f54546d) {
                for (Consumer accept : AndroidConnectivityMonitor.this.f54546d) {
                    accept.accept(ConnectivityMonitor.NetworkStatus.UNREACHABLE);
                }
            }
        }
    }

    private class NetworkReceiver extends BroadcastReceiver {

        /* renamed from: a */
        private boolean f54552a;

        private NetworkReceiver() {
            this.f54552a = false;
        }

        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean z = this.f54552a;
            boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            this.f54552a = z2;
            if (z2 && !z) {
                synchronized (AndroidConnectivityMonitor.this.f54546d) {
                    for (Consumer accept : AndroidConnectivityMonitor.this.f54546d) {
                        accept.accept(ConnectivityMonitor.NetworkStatus.REACHABLE);
                    }
                }
            } else if (!z2 && z) {
                synchronized (AndroidConnectivityMonitor.this.f54546d) {
                    for (Consumer accept2 : AndroidConnectivityMonitor.this.f54546d) {
                        accept2.accept(ConnectivityMonitor.NetworkStatus.UNREACHABLE);
                    }
                }
            }
        }
    }

    public AndroidConnectivityMonitor(Context context) {
        Assert.m76443d(context != null, "Context must be non-null", new Object[0]);
        this.f54543a = context;
        this.f54544b = (ConnectivityManager) context.getSystemService("connectivity");
        m76161e();
    }

    /* renamed from: e */
    private void m76161e() {
        if (Build.VERSION.SDK_INT < 24 || this.f54544b == null) {
            final NetworkReceiver networkReceiver = new NetworkReceiver();
            this.f54543a.registerReceiver(networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f54545c = new Runnable() {
                public void run() {
                    AndroidConnectivityMonitor.this.f54543a.unregisterReceiver(networkReceiver);
                }
            };
            return;
        }
        final DefaultNetworkCallback defaultNetworkCallback = new DefaultNetworkCallback();
        this.f54544b.registerDefaultNetworkCallback(defaultNetworkCallback);
        this.f54545c = new Runnable() {
            public void run() {
                AndroidConnectivityMonitor.this.f54544b.unregisterNetworkCallback(defaultNetworkCallback);
            }
        };
    }

    /* renamed from: a */
    public void mo63012a(Consumer<ConnectivityMonitor.NetworkStatus> consumer) {
        synchronized (this.f54546d) {
            this.f54546d.add(consumer);
        }
    }

    public void shutdown() {
        Runnable runnable = this.f54545c;
        if (runnable != null) {
            runnable.run();
            this.f54545c = null;
        }
    }
}
