package com.twofortyfouram.locale.sdk.host;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.util.regex.Pattern;

public class TaskerPlugin {
    public static final String ACTION_EDIT_EVENT = "net.dinglisch.android.tasker.ACTION_EDIT_EVENT";
    private static final String BASE_KEY = "net.dinglisch.android.tasker";
    private static final String BUNDLE_KEY_HINT_PREFIX = ".hints.";
    private static final String BUNDLE_KEY_HINT_TIMEOUT_MS = ".hints.TIMEOUT";
    public static final String BUNDLE_KEY_RELEVANT_VARIABLES = "net.dinglisch.android.tasker.RELEVANT_VARIABLES";
    private static final String EXTRAS_PREFIX = "net.dinglisch.android.tasker.extras.";
    private static final String EXTRA_HINTS_BUNDLE = "net.dinglisch.android.tasker.extras.HINTS";
    private static final String EXTRA_HOST_CAPABILITIES = "net.dinglisch.android.tasker.extras.HOST_CAPABILITIES";
    public static final int EXTRA_HOST_CAPABILITY_ALL = 126;
    public static final int EXTRA_HOST_CAPABILITY_CONDITION_RETURN_VARIABLES = 4;
    private static final int EXTRA_HOST_CAPABILITY_RELEVANT_VARIABLES = 16;
    public static final int EXTRA_HOST_CAPABILITY_REQUEST_QUERY_DATA_PASS_THROUGH = 64;
    public static final int EXTRA_HOST_CAPABILITY_SETTING_FIRE_VARIABLE_REPLACEMENT = 8;
    public static final int EXTRA_HOST_CAPABILITY_SETTING_RETURN_VARIABLES = 2;
    public static final int EXTRA_HOST_CAPABILITY_SETTING_SYNCHRONOUS_EXECUTION = 32;
    private static final String EXTRA_VARIABLES_BUNDLE = "net.dinglisch.android.tasker.extras.VARIABLES";
    private static final int FIRST_ON_FIRE_VARIABLES_TASKER_VERSION = 80;
    private static final int RANDOM_HISTORY_SIZE = 100;
    private static final String TAG = "TaskerPlugin";
    private static final String VARIABLE_NAME_END_EXPRESSION = "[\\w0-9&&[^_]]";
    public static final String VARIABLE_NAME_MAIN_PART_MATCH_EXPRESSION = "[\\w&&[^_]][\\w0-9]+[\\w0-9&&[^_]]";
    public static final String VARIABLE_NAME_MATCH_EXPRESSION = "%+[\\w&&[^_]][\\w0-9]+[\\w0-9&&[^_]]";
    private static Pattern VARIABLE_NAME_MATCH_PATTERN = null;
    private static final String VARIABLE_NAME_MID_EXPRESSION = "[\\w0-9]+";
    private static final String VARIABLE_NAME_START_EXPRESSION = "[\\w&&[^_]]";
    public static final String VARIABLE_PREFIX = "%";
    private static int[] lastRandomsSeen;
    private static int randomInsertPointer;

    /* renamed from: sr */
    private static SecureRandom f57732sr;

    public static class Condition {
        public static boolean hostSupportsVariableReturn(Bundle bundle) {
            return TaskerPlugin.hostSupports(bundle, 4);
        }
    }

    public static class Event {
        public static final String EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA = "net.dinglisch.android.tasker.extras.PASS_THROUGH_DATA";
        public static final String PASS_THROUGH_BUNDLE_MESSAGE_ID_KEY = "net.dinglisch.android.tasker.MESSAGE_ID";

        public static void addPassThroughData(Intent intent, Bundle bundle) {
            retrieveOrCreatePassThroughBundle(intent).putAll(bundle);
        }

        public static int addPassThroughMessageID(Intent intent) {
            Bundle retrieveOrCreatePassThroughBundle = retrieveOrCreatePassThroughBundle(intent);
            int positiveNonRepeatingRandomInteger = TaskerPlugin.getPositiveNonRepeatingRandomInteger();
            retrieveOrCreatePassThroughBundle.putInt(PASS_THROUGH_BUNDLE_MESSAGE_ID_KEY, positiveNonRepeatingRandomInteger);
            return positiveNonRepeatingRandomInteger;
        }

        public static boolean hostSupportsRequestQueryDataPassThrough(Bundle bundle) {
            return TaskerPlugin.hostSupports(bundle, 64);
        }

        public static Bundle retrieveOrCreatePassThroughBundle(Intent intent) {
            if (intent.hasExtra(EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA)) {
                return intent.getBundleExtra(EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA);
            }
            Bundle bundle = new Bundle();
            intent.putExtra(EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA, bundle);
            return bundle;
        }

        public static Bundle retrievePassThroughData(Intent intent) {
            return (Bundle) TaskerPlugin.getExtraValueSafe(intent, EXTRA_REQUEST_QUERY_PASS_THROUGH_DATA, Bundle.class, "retrievePassThroughData");
        }

        public static int retrievePassThroughMessageID(Intent intent) {
            Integer num;
            Bundle retrievePassThroughData = retrievePassThroughData(intent);
            if (retrievePassThroughData == null || (num = (Integer) TaskerPlugin.getBundleValueSafe(retrievePassThroughData, PASS_THROUGH_BUNDLE_MESSAGE_ID_KEY, Integer.class, "retrievePassThroughMessageID")) == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    public static class Host {
        public static Intent addCapabilities(Intent intent, int i) {
            return intent.putExtra(TaskerPlugin.EXTRA_HOST_CAPABILITIES, i);
        }

        public static void addCompletionIntent(Intent intent, Intent intent2) {
            intent.putExtra("net.dinglisch.android.tasker.extras.COMPLETION_INTENT", intent2.toUri(1));
        }

        public static void addHintTimeoutMS(Intent intent, int i) {
            getHintsBundle(intent, "addHintTimeoutMS").putInt(TaskerPlugin.BUNDLE_KEY_HINT_TIMEOUT_MS, i);
        }

        public static void cleanHints(Bundle bundle) {
            bundle.remove(TaskerPlugin.EXTRA_HINTS_BUNDLE);
        }

        public static void cleanRelevantVariables(Bundle bundle) {
            bundle.remove(TaskerPlugin.BUNDLE_KEY_RELEVANT_VARIABLES);
        }

        public static void cleanRequestedTimeout(Bundle bundle) {
            bundle.remove("net.dinglisch.android.tasker.extras.REQUESTED_TIMEOUT");
        }

        public static void cleanSettingReplaceVariables(Bundle bundle) {
            bundle.remove("net.dinglisch.android.tasker.extras.VARIABLE_REPLACE_KEYS");
        }

        private static Bundle getHintsBundle(Intent intent, String str) {
            Bundle bundle = (Bundle) TaskerPlugin.getExtraValueSafe(intent, TaskerPlugin.EXTRA_HINTS_BUNDLE, Bundle.class, str);
            if (bundle != null) {
                return bundle;
            }
            Bundle bundle2 = new Bundle();
            intent.putExtra(TaskerPlugin.EXTRA_HINTS_BUNDLE, bundle2);
            return bundle2;
        }

        public static int getRequestedTimeoutMS(Bundle bundle) {
            return ((Integer) TaskerPlugin.getBundleValueSafe(bundle, "net.dinglisch.android.tasker.extras.REQUESTED_TIMEOUT", Integer.class, "getRequestedTimeout")).intValue();
        }

        public static int getSettingResultCode(Intent intent) {
            Integer num = (Integer) TaskerPlugin.getExtraValueSafe(intent, Setting.EXTRA_RESULT_CODE, Integer.class, "getSettingResultCode");
            if (num == null) {
                return 4;
            }
            return num.intValue();
        }

        public static String[] getSettingVariableReplaceKeys(Bundle bundle) {
            String str = (String) TaskerPlugin.getBundleValueSafe(bundle, "net.dinglisch.android.tasker.extras.VARIABLE_REPLACE_KEYS", String.class, "getSettingVariableReplaceKeys");
            if (str != null) {
                return str.split(" ");
            }
            return null;
        }

        public static Bundle getVariablesBundle(Bundle bundle) {
            return (Bundle) TaskerPlugin.getBundleValueSafe(bundle, TaskerPlugin.EXTRA_VARIABLES_BUNDLE, Bundle.class, "getVariablesBundle");
        }

        public static boolean haveRelevantVariables(Bundle bundle) {
            return bundle.containsKey(TaskerPlugin.BUNDLE_KEY_RELEVANT_VARIABLES);
        }

        public static boolean haveRequestedTimeout(Bundle bundle) {
            return bundle.containsKey("net.dinglisch.android.tasker.extras.REQUESTED_TIMEOUT");
        }
    }

    public static class Setting {
        private static final String BUNDLE_KEY_VARIABLE_REPLACE_STRINGS = "net.dinglisch.android.tasker.extras.VARIABLE_REPLACE_KEYS";
        private static final String EXTRA_PLUGIN_COMPLETION_INTENT = "net.dinglisch.android.tasker.extras.COMPLETION_INTENT";
        private static final String EXTRA_REQUESTED_TIMEOUT = "net.dinglisch.android.tasker.extras.REQUESTED_TIMEOUT";
        public static final String EXTRA_RESULT_CODE = "net.dinglisch.android.tasker.extras.RESULT_CODE";
        public static final int REQUESTED_TIMEOUT_MS_MAX = 3599000;
        public static final int REQUESTED_TIMEOUT_MS_NEVER = 3600000;
        public static final int REQUESTED_TIMEOUT_MS_NONE = 0;
        public static final int RESULT_CODE_FAILED = 2;
        public static final int RESULT_CODE_FAILED_PLUGIN_FIRST = 10;
        public static final int RESULT_CODE_OK = -1;
        public static final int RESULT_CODE_OK_MINOR_FAILURES = 1;
        public static final int RESULT_CODE_PENDING = 3;
        public static final int RESULT_CODE_UNKNOWN = 4;
        public static final String VARNAME_ERROR_MESSAGE = "%errmsg";

        public static int getHintTimeoutMS(Bundle bundle) {
            Integer num;
            Bundle bundle2 = (Bundle) TaskerPlugin.getBundleValueSafe(bundle, TaskerPlugin.EXTRA_HINTS_BUNDLE, Bundle.class, "getHintTimeoutMS");
            if (bundle2 == null || (num = (Integer) TaskerPlugin.getBundleValueSafe(bundle2, TaskerPlugin.BUNDLE_KEY_HINT_TIMEOUT_MS, Integer.class, "getHintTimeoutMS")) == null) {
                return -1;
            }
            return num.intValue();
        }

        public static boolean hostSupportsOnFireVariableReplacement(Bundle bundle) {
            return TaskerPlugin.hostSupports(bundle, 8);
        }

        public static boolean hostSupportsSynchronousExecution(Bundle bundle) {
            return TaskerPlugin.hostSupports(bundle, 32);
        }

        public static boolean hostSupportsVariableReturn(Bundle bundle) {
            return TaskerPlugin.hostSupports(bundle, 2);
        }

        public static void requestTimeoutMS(Intent intent, int i) {
            if (i < 0) {
                Log.w(TaskerPlugin.TAG, "requestTimeoutMS: ignoring negative timeout (" + i + ")");
                return;
            }
            if (i > 3599000 && i != 3600000) {
                Log.w(TaskerPlugin.TAG, "requestTimeoutMS: requested timeout " + i + " exceeds maximum, setting to max (" + REQUESTED_TIMEOUT_MS_MAX + ")");
                i = REQUESTED_TIMEOUT_MS_MAX;
            }
            intent.putExtra(EXTRA_REQUESTED_TIMEOUT, i);
        }

        public static void setVariableReplaceKeys(Bundle bundle, String[] strArr) {
            StringBuilder sb = new StringBuilder();
            if (strArr != null) {
                for (String str : strArr) {
                    if (str.contains(" ")) {
                        Log.w(TaskerPlugin.TAG, "setVariableReplaceKeys: ignoring bad keyName containing space: " + str);
                    } else {
                        if (sb.length() > 0) {
                            sb.append(' ');
                        }
                        sb.append(str);
                    }
                    if (sb.length() > 0) {
                        bundle.putString(BUNDLE_KEY_VARIABLE_REPLACE_STRINGS, sb.toString());
                    }
                }
            }
        }

        public static boolean signalFinish(Context context, Intent intent, int i, Bundle bundle) {
            String str = (String) TaskerPlugin.getExtraValueSafe(intent, EXTRA_PLUGIN_COMPLETION_INTENT, String.class, "signalFinish");
            if (str != null) {
                Uri uri = null;
                try {
                    uri = Uri.parse(str);
                } catch (Exception unused) {
                    Log.w(TaskerPlugin.TAG, "signalFinish: " + "couldn't parse " + str);
                }
                if (uri != null) {
                    try {
                        Intent parseUri = Intent.parseUri(str, 1);
                        parseUri.putExtra(EXTRA_RESULT_CODE, i);
                        if (bundle != null) {
                            parseUri.putExtra(TaskerPlugin.EXTRA_VARIABLES_BUNDLE, bundle);
                        }
                        context.sendBroadcast(parseUri);
                        return true;
                    } catch (URISyntaxException unused2) {
                        Log.w(TaskerPlugin.TAG, "signalFinish: " + "bad URI: " + uri);
                    }
                }
            }
            return false;
        }

        public static boolean hostSupportsOnFireVariableReplacement(Activity activity) {
            boolean hostSupportsOnFireVariableReplacement = hostSupportsOnFireVariableReplacement(activity.getIntent().getExtras());
            if (hostSupportsOnFireVariableReplacement) {
                return hostSupportsOnFireVariableReplacement;
            }
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity == null) {
                Log.w(TaskerPlugin.TAG, "hostSupportsOnFireVariableReplacement: null callingActivity, defaulting to false");
                return hostSupportsOnFireVariableReplacement;
            }
            String packageName = callingActivity.getPackageName();
            return packageName.startsWith(TaskerPlugin.BASE_KEY) && TaskerPlugin.getPackageVersionCode(activity.getPackageManager(), packageName) > 80;
        }
    }

    public static void addRelevantVariableList(Intent intent, String[] strArr) {
        intent.putExtra(BUNDLE_KEY_RELEVANT_VARIABLES, strArr);
    }

    public static void addVariableBundle(Bundle bundle, Bundle bundle2) {
        bundle.putBundle(EXTRA_VARIABLES_BUNDLE, bundle2);
    }

    /* access modifiers changed from: private */
    public static Object getBundleValueSafe(Bundle bundle, String str, Class<?> cls, String str2) {
        if (bundle != null && bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (obj == null) {
                Log.w(TAG, str2 + ": " + str + ": null value");
            } else if (obj.getClass() == cls) {
                return obj;
            } else {
                Log.w(TAG, str2 + ": " + str + ": expected " + cls.getClass().getName() + ", got " + obj.getClass().getName());
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Object getExtraValueSafe(Intent intent, String str, Class<?> cls, String str2) {
        if (intent.hasExtra(str)) {
            return getBundleValueSafe(intent.getExtras(), str, cls, str2);
        }
        return null;
    }

    public static int getPackageVersionCode(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (Exception unused) {
            Log.e(TAG, "getPackageVersionCode: exception getting package info");
            return -1;
        }
    }

    public static int getPositiveNonRepeatingRandomInteger() {
        int nextInt;
        if (f57732sr == null) {
            f57732sr = new SecureRandom();
            lastRandomsSeen = new int[100];
            int i = 0;
            while (true) {
                int[] iArr = lastRandomsSeen;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = -1;
                i++;
            }
        }
        do {
            nextInt = f57732sr.nextInt(Integer.MAX_VALUE);
            int[] iArr2 = lastRandomsSeen;
            int length = iArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (iArr2[i2] == nextInt) {
                    nextInt = -1;
                    continue;
                    break;
                } else {
                    i2++;
                }
            }
        } while (nextInt == -1);
        int[] iArr3 = lastRandomsSeen;
        int i3 = randomInsertPointer;
        iArr3[i3] = nextInt;
        randomInsertPointer = (i3 + 1) % iArr3.length;
        return nextInt;
    }

    public static String[] getRelevantVariableList(Bundle bundle) {
        String[] strArr = (String[]) getBundleValueSafe(bundle, BUNDLE_KEY_RELEVANT_VARIABLES, String[].class, "getRelevantVariableList");
        return strArr == null ? new String[0] : strArr;
    }

    /* access modifiers changed from: private */
    public static boolean hostSupports(Bundle bundle, int i) {
        Integer num = (Integer) getBundleValueSafe(bundle, EXTRA_HOST_CAPABILITIES, Integer.class, "hostSupports");
        return num != null && (num.intValue() & i) > 0;
    }

    public static boolean hostSupportsRelevantVariables(Bundle bundle) {
        return hostSupports(bundle, 16);
    }

    private static boolean variableNameIsLocal(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                return false;
            }
            if (Character.isDigit(charAt)) {
                i++;
            }
        }
        if (i != str.length() - 1) {
            return true;
        }
        return false;
    }

    public static boolean variableNameValid(String str) {
        if (str == null) {
            return false;
        }
        if (VARIABLE_NAME_MATCH_PATTERN == null) {
            VARIABLE_NAME_MATCH_PATTERN = Pattern.compile(VARIABLE_NAME_MATCH_EXPRESSION, 0);
        }
        if (!VARIABLE_NAME_MATCH_PATTERN.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("variableNameValid: invalid name: ");
            sb.append(str);
            return false;
        } else if (variableNameIsLocal(str)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("variableNameValid: name not local: ");
            sb2.append(str);
            return false;
        }
    }
}
