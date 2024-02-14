package com.getpebble.android.kit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.getpebble.android.kit.C6909a;
import com.getpebble.android.kit.util.PebbleDictionary;
import java.util.UUID;
import org.json.JSONException;

public final class PebbleKit {

    public static abstract class PebbleAckReceiver extends BroadcastReceiver {
        /* renamed from: a */
        public abstract void mo34279a(Context context, int i);

        public void onReceive(Context context, Intent intent) {
            mo34279a(context, intent.getIntExtra("transaction_id", -1));
        }
    }

    public static abstract class PebbleDataLogReceiver extends BroadcastReceiver {

        /* renamed from: a */
        private final UUID f16153a;

        /* renamed from: b */
        private int f16154b;

        /* renamed from: a */
        private void m26092a(Context context, Intent intent, UUID uuid, Long l, Long l2) {
            mo34281c(context, uuid, l, l2);
        }

        /* renamed from: b */
        private void m26093b(Context context, Intent intent, UUID uuid, Long l, Long l2) {
            int intExtra = intent.getIntExtra("pbl_data_id", -1);
            if (intExtra >= 0) {
                Log.i("pebble", "DataID: " + intExtra + " LastDataID: " + this.f16154b);
                if (intExtra != this.f16154b) {
                    C6909a.C6910a b = C6909a.C6910a.m26100b(intent.getByteExtra("pbl_data_type", C6909a.C6910a.INVALID.ord));
                    if (b != null) {
                        int i = C6908a.f16156a[b.ordinal()];
                        if (i == 1) {
                            byte[] decode = Base64.decode(intent.getStringExtra("pbl_data_object"), 2);
                            if (decode != null) {
                                mo34284f(context, uuid, l, l2, decode);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else if (i == 2) {
                            Long l3 = (Long) intent.getSerializableExtra("pbl_data_object");
                            if (l3 != null) {
                                mo34283e(context, uuid, l, l2, l3);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else if (i == 3) {
                            Integer num = (Integer) intent.getSerializableExtra("pbl_data_object");
                            if (num != null) {
                                mo34282d(context, uuid, l, l2, num.intValue());
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid type:" + b.toString());
                        }
                        this.f16154b = intExtra;
                        Intent intent2 = new Intent("com.getpebble.action.dl.ACK_DATA");
                        intent2.putExtra("data_log_uuid", uuid);
                        intent2.putExtra("pbl_data_id", intExtra);
                        context.sendBroadcast(intent2);
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: c */
        public void mo34281c(Context context, UUID uuid, Long l, Long l2) {
        }

        /* renamed from: d */
        public void mo34282d(Context context, UUID uuid, Long l, Long l2, int i) {
            throw new UnsupportedOperationException("int handler not implemented");
        }

        /* renamed from: e */
        public void mo34283e(Context context, UUID uuid, Long l, Long l2, Long l3) {
            throw new UnsupportedOperationException("UnsignedInteger handler not implemented");
        }

        /* renamed from: f */
        public void mo34284f(Context context, UUID uuid, Long l, Long l2, byte[] bArr) {
            throw new UnsupportedOperationException("Byte array handler not implemented");
        }

        public void onReceive(Context context, Intent intent) {
            if (this.f16153a.equals((UUID) intent.getSerializableExtra("uuid"))) {
                try {
                    UUID uuid = (UUID) intent.getSerializableExtra("data_log_uuid");
                    if (uuid != null) {
                        Long l = (Long) intent.getSerializableExtra("data_log_timestamp");
                        if (l != null) {
                            Long l2 = (Long) intent.getSerializableExtra("data_log_tag");
                            if (l2 == null) {
                                throw new IllegalArgumentException();
                            } else if (intent.getAction() == "com.getpebble.action.dl.RECEIVE_DATA_NEW") {
                                m26093b(context, intent, uuid, l, l2);
                            } else if (intent.getAction() == "com.getpebble.action.dl.FINISH_SESSION_NEW") {
                                m26092a(context, intent, uuid, l, l2);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static abstract class PebbleDataReceiver extends BroadcastReceiver {

        /* renamed from: a */
        private final UUID f16155a;

        protected PebbleDataReceiver(UUID uuid) {
            this.f16155a = uuid;
        }

        /* renamed from: a */
        public abstract void mo31400a(Context context, int i, PebbleDictionary pebbleDictionary);

        public void onReceive(Context context, Intent intent) {
            if (this.f16155a.equals((UUID) intent.getSerializableExtra("uuid"))) {
                int intExtra = intent.getIntExtra("transaction_id", -1);
                String stringExtra = intent.getStringExtra("msg_data");
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    try {
                        mo31400a(context, intExtra, PebbleDictionary.m26101o(stringExtra));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static abstract class PebbleNackReceiver extends BroadcastReceiver {
        /* renamed from: a */
        public abstract void mo34287a(Context context, int i);

        public void onReceive(Context context, Intent intent) {
            mo34287a(context, intent.getIntExtra("transaction_id", -1));
        }
    }

    /* renamed from: com.getpebble.android.kit.PebbleKit$a */
    static /* synthetic */ class C6908a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16156a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.getpebble.android.kit.a$a[] r0 = com.getpebble.android.kit.C6909a.C6910a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16156a = r0
                com.getpebble.android.kit.a$a r1 = com.getpebble.android.kit.C6909a.C6910a.BYTES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16156a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.getpebble.android.kit.a$a r1 = com.getpebble.android.kit.C6909a.C6910a.UINT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16156a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.getpebble.android.kit.a$a r1 = com.getpebble.android.kit.C6909a.C6910a.INT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.getpebble.android.kit.PebbleKit.C6908a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m26080a(Context context, UUID uuid) throws IllegalArgumentException {
        if (uuid != null) {
            Intent intent = new Intent("com.getpebble.action.app.STOP");
            intent.putExtra("uuid", uuid);
            context.sendBroadcast(intent);
            return;
        }
        throw new IllegalArgumentException("uuid cannot be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0026  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m26081b(android.content.Context r3) {
        /*
            android.database.Cursor r3 = m26082c(r3)     // Catch:{ all -> 0x0022 }
            r0 = 0
            if (r3 == 0) goto L_0x001c
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x000e
            goto L_0x001c
        L_0x000e:
            int r1 = r3.getInt(r0)     // Catch:{ all -> 0x001a }
            r2 = 1
            if (r1 != r2) goto L_0x0016
            r0 = 1
        L_0x0016:
            r3.close()
            return r0
        L_0x001a:
            r0 = move-exception
            goto L_0x0024
        L_0x001c:
            if (r3 == 0) goto L_0x0021
            r3.close()
        L_0x0021:
            return r0
        L_0x0022:
            r0 = move-exception
            r3 = 0
        L_0x0024:
            if (r3 == 0) goto L_0x0029
            r3.close()
        L_0x0029:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getpebble.android.kit.PebbleKit.m26081b(android.content.Context):boolean");
    }

    /* renamed from: c */
    private static Cursor m26082c(Context context) {
        Cursor query = context.getContentResolver().query(C6909a.f16160d, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query != null) {
            if (!query.moveToFirst() || query.getInt(0) != 1) {
                query.close();
            } else {
                query.moveToPrevious();
                return query;
            }
        }
        return context.getContentResolver().query(C6909a.f16159c, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    /* renamed from: d */
    private static BroadcastReceiver m26083d(Context context, String str, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver == null) {
            return null;
        }
        context.registerReceiver(broadcastReceiver, new IntentFilter(str));
        return broadcastReceiver;
    }

    /* renamed from: e */
    public static BroadcastReceiver m26084e(Context context, BroadcastReceiver broadcastReceiver) {
        return m26083d(context, "com.getpebble.action.PEBBLE_CONNECTED", broadcastReceiver);
    }

    /* renamed from: f */
    public static BroadcastReceiver m26085f(Context context, BroadcastReceiver broadcastReceiver) {
        return m26083d(context, "com.getpebble.action.PEBBLE_DISCONNECTED", broadcastReceiver);
    }

    /* renamed from: g */
    public static BroadcastReceiver m26086g(Context context, PebbleDataReceiver pebbleDataReceiver) {
        return m26083d(context, "com.getpebble.action.app.RECEIVE", pebbleDataReceiver);
    }

    /* renamed from: h */
    public static void m26087h(Context context, int i) throws IllegalArgumentException {
        if ((i & InputDeviceCompat.SOURCE_ANY) == 0) {
            Intent intent = new Intent("com.getpebble.action.app.ACK");
            intent.putExtra("transaction_id", i);
            context.sendBroadcast(intent);
            return;
        }
        throw new IllegalArgumentException(String.format("transaction id must be between (0, 255); got '%d'", new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: i */
    public static void m26088i(Context context, UUID uuid, PebbleDictionary pebbleDictionary) throws IllegalArgumentException {
        m26089j(context, uuid, pebbleDictionary, -1);
    }

    /* renamed from: j */
    public static void m26089j(Context context, UUID uuid, PebbleDictionary pebbleDictionary, int i) throws IllegalArgumentException {
        if (uuid == null) {
            throw new IllegalArgumentException("uuid cannot be null");
        } else if (pebbleDictionary == null) {
            throw new IllegalArgumentException("data cannot be null");
        } else if (pebbleDictionary.size() != 0) {
            Intent intent = new Intent("com.getpebble.action.app.SEND");
            intent.putExtra("uuid", uuid);
            intent.putExtra("transaction_id", i);
            intent.putExtra("msg_data", pebbleDictionary.mo34302t());
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: k */
    public static void m26090k(Context context, UUID uuid) throws IllegalArgumentException {
        if (uuid != null) {
            Intent intent = new Intent("com.getpebble.action.app.START");
            intent.putExtra("uuid", uuid);
            context.sendBroadcast(intent);
            return;
        }
        throw new IllegalArgumentException("uuid cannot be null");
    }
}
