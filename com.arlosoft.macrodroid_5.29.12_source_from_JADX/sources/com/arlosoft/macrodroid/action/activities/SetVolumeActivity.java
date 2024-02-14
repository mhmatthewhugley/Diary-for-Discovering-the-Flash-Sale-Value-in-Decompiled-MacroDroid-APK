package com.arlosoft.macrodroid.action.activities;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.arlosoft.macrodroid.action.SetVolumeAction;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.C6520o0;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.List;

public class SetVolumeActivity extends NonAppActivity {

    /* renamed from: com.arlosoft.macrodroid.action.activities.SetVolumeActivity$a */
    class C2829a extends Thread {
        C2829a() {
        }

        public void run() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
            }
            SetVolumeActivity.this.finish();
        }
    }

    /* renamed from: L1 */
    public static void m13983L1(Context context, boolean[] zArr, int[] iArr, MacroDroidVariable[] macroDroidVariableArr, DictionaryKeys[] dictionaryKeysArr, long j) {
        Intent intent = new Intent(context, SetVolumeActivity.class);
        intent.putExtra("stream_index_array", zArr);
        intent.putExtra("stream_volume_array", iArr);
        intent.putExtra("variables", macroDroidVariableArr);
        intent.putExtra("dictionary_keys", dictionaryKeysArr);
        intent.putExtra("MacroGuid", j);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: M1 */
    private void m13984M1(boolean[] zArr, int[] iArr, MacroDroidVariable[] macroDroidVariableArr, DictionaryKeys[] dictionaryKeysArr, long j) {
        Macro macro;
        double d;
        Long l;
        boolean[] zArr2 = zArr;
        long j2 = j;
        String[] q3 = SetVolumeAction.m12774q3();
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        Macro Q = C4934n.m18998M().mo29682Q(j2);
        int i = 0;
        while (i < zArr2.length) {
            if (zArr2[i]) {
                try {
                    int[] iArr2 = SetVolumeAction.f7537d;
                    int streamMaxVolume = audioManager.getStreamMaxVolume(iArr2[i]);
                    if (streamMaxVolume == 0) {
                        C4878b.m18869h("Max volume for " + q3[i] + " is zero", j2);
                        d = 0.0d;
                    } else {
                        d = (double) (100 / streamMaxVolume);
                    }
                    if (macroDroidVariableArr[i] != null) {
                        if (Q != null) {
                            MacroDroidVariable variableByName = Q.getVariableByName(macroDroidVariableArr[i].getName());
                            if (variableByName != null) {
                                if (dictionaryKeysArr[i] != null) {
                                    l = variableByName.mo27733E(C6520o0.m24868C(this, dictionaryKeysArr[i].getKeys(), (TriggerContextInfo) null, Q));
                                } else {
                                    l = variableByName.mo27733E((List<String>) null);
                                }
                                if (l != null) {
                                    macro = Q;
                                    try {
                                        try {
                                            audioManager.setStreamVolume(iArr2[i], (int) ((((double) (((long) streamMaxVolume) * l.longValue())) + (d / 2.0d)) / 100.0d), 0);
                                        } catch (Exception e) {
                                            C4878b.m18869h("Set volume failed: " + e.toString(), j2);
                                        }
                                    } catch (IllegalArgumentException unused) {
                                        C4878b.m18882u("Could not use audioStream: " + SetVolumeAction.f7537d[i] + " on this device");
                                        i++;
                                        zArr2 = zArr;
                                        Q = macro;
                                    }
                                } else {
                                    macro = Q;
                                    C4878b.m18869h("Set volume failed, variable not found: " + macroDroidVariableArr[i].getName() + C6520o0.m24912e0(dictionaryKeysArr[i]), j2);
                                }
                            } else {
                                macro = Q;
                                C4878b.m18869h("Set volume failed, variable not found: " + macroDroidVariableArr[i].getName(), j2);
                            }
                        } else {
                            macro = Q;
                        }
                        C4878b.m18868g("Set volume failed - the macro was null");
                    } else {
                        macro = Q;
                        try {
                            try {
                                audioManager.setStreamVolume(iArr2[i], (int) ((((double) (streamMaxVolume * iArr[i])) + (d / 2.0d)) / 100.0d), 0);
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            try {
                                C4878b.m18869h("Set volume failed: " + e.toString(), j2);
                            } catch (IllegalArgumentException unused2) {
                            }
                            i++;
                            zArr2 = zArr;
                            Q = macro;
                        }
                        i++;
                        zArr2 = zArr;
                        Q = macro;
                    }
                } catch (IllegalArgumentException unused3) {
                    macro = Q;
                    C4878b.m18882u("Could not use audioStream: " + SetVolumeAction.f7537d[i] + " on this device");
                    i++;
                    zArr2 = zArr;
                    Q = macro;
                }
            } else {
                macro = Q;
            }
            i++;
            zArr2 = zArr;
            Q = macro;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        boolean[] booleanArrayExtra = getIntent().getBooleanArrayExtra("stream_index_array");
        int[] intArrayExtra = getIntent().getIntArrayExtra("stream_volume_array");
        long longExtra = getIntent().getLongExtra("MacroGuid", 0);
        Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("variables");
        Parcelable[] parcelableArrayExtra2 = getIntent().getParcelableArrayExtra("dictionary_keys");
        MacroDroidVariable[] macroDroidVariableArr = new MacroDroidVariable[parcelableArrayExtra.length];
        for (int i = 0; i < parcelableArrayExtra.length; i++) {
            macroDroidVariableArr[i] = (MacroDroidVariable) parcelableArrayExtra[i];
        }
        DictionaryKeys[] dictionaryKeysArr = new DictionaryKeys[parcelableArrayExtra2.length];
        for (int i2 = 0; i2 < parcelableArrayExtra2.length; i2++) {
            dictionaryKeysArr[i2] = (DictionaryKeys) parcelableArrayExtra2[i2];
        }
        m13984M1(booleanArrayExtra, intArrayExtra, macroDroidVariableArr, dictionaryKeysArr, longExtra);
        new C2829a().start();
    }
}
