package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.core.Bound;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.model.mutation.ArrayTransformOperation;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.FieldMask;
import com.google.firebase.firestore.model.mutation.FieldTransform;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.model.mutation.NumericIncrementTransformOperation;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.ServerTimestampOperation;
import com.google.firebase.firestore.model.mutation.SetMutation;
import com.google.firebase.firestore.model.mutation.TransformOperation;
import com.google.firebase.firestore.model.mutation.VerifyMutation;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p228v1.ArrayValue;
import com.google.firestore.p228v1.BatchGetDocumentsResponse;
import com.google.firestore.p228v1.Cursor;
import com.google.firestore.p228v1.Document;
import com.google.firestore.p228v1.DocumentChange;
import com.google.firestore.p228v1.DocumentDelete;
import com.google.firestore.p228v1.DocumentMask;
import com.google.firestore.p228v1.DocumentRemove;
import com.google.firestore.p228v1.DocumentTransform;
import com.google.firestore.p228v1.ExistenceFilter;
import com.google.firestore.p228v1.ListenResponse;
import com.google.firestore.p228v1.Precondition;
import com.google.firestore.p228v1.StructuredQuery;
import com.google.firestore.p228v1.Target;
import com.google.firestore.p228v1.TargetChange;
import com.google.firestore.p228v1.Write;
import com.google.firestore.p228v1.WriteResult;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p292io.grpc.C12537b1;

public final class RemoteSerializer {

    /* renamed from: a */
    private final DatabaseId f54640a;

    /* renamed from: b */
    private final String f54641b;

    /* renamed from: com.google.firebase.firestore.remote.RemoteSerializer$1 */
    static /* synthetic */ class C112421 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54642a;

        /* renamed from: b */
        static final /* synthetic */ int[] f54643b;

        /* renamed from: c */
        static final /* synthetic */ int[] f54644c;

        /* renamed from: d */
        static final /* synthetic */ int[] f54645d;

        /* renamed from: e */
        static final /* synthetic */ int[] f54646e;

        /* renamed from: f */
        static final /* synthetic */ int[] f54647f;

        /* renamed from: g */
        static final /* synthetic */ int[] f54648g;

        /* renamed from: h */
        static final /* synthetic */ int[] f54649h;

        /* renamed from: i */
        static final /* synthetic */ int[] f54650i;

        /* renamed from: j */
        static final /* synthetic */ int[] f54651j;

        /* renamed from: k */
        static final /* synthetic */ int[] f54652k;

        /* JADX WARNING: Can't wrap try/catch for region: R(111:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(2:93|94)|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|(2:119|120)|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(112:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|(2:63|64)|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|(2:119|120)|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(114:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|(2:119|120)|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(115:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|(2:59|60)|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|(3:145|146|148)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(118:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(119:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|(2:55|56)|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(120:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(122:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(123:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|(2:71|72)|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(124:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|(2:111|112)|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(125:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(126:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|(2:137|138)|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(127:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|(2:67|68)|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|137|138|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Can't wrap try/catch for region: R(129:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|63|64|65|67|68|69|71|72|73|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|97|98|99|100|101|102|103|104|105|107|108|109|110|111|112|113|115|116|117|118|119|120|121|123|124|125|126|127|128|129|130|131|133|134|135|136|137|138|139|141|142|143|144|145|146|148) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x019f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x01c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x01ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x01e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x01f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x020e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x0218 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0222 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x023d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0247 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0262 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x026c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x012a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0134 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x013e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0148 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0152 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0166 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0170 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x017a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0195 */
        static {
            /*
                com.google.firestore.v1.ListenResponse$ResponseTypeCase[] r0 = com.google.firestore.p228v1.ListenResponse.ResponseTypeCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54652k = r0
                r1 = 1
                com.google.firestore.v1.ListenResponse$ResponseTypeCase r2 = com.google.firestore.p228v1.ListenResponse.ResponseTypeCase.TARGET_CHANGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f54652k     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firestore.v1.ListenResponse$ResponseTypeCase r3 = com.google.firestore.p228v1.ListenResponse.ResponseTypeCase.DOCUMENT_CHANGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f54652k     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firestore.v1.ListenResponse$ResponseTypeCase r4 = com.google.firestore.p228v1.ListenResponse.ResponseTypeCase.DOCUMENT_DELETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f54652k     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firestore.v1.ListenResponse$ResponseTypeCase r5 = com.google.firestore.p228v1.ListenResponse.ResponseTypeCase.DOCUMENT_REMOVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f54652k     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firestore.v1.ListenResponse$ResponseTypeCase r6 = com.google.firestore.p228v1.ListenResponse.ResponseTypeCase.FILTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f54652k     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firestore.v1.ListenResponse$ResponseTypeCase r7 = com.google.firestore.p228v1.ListenResponse.ResponseTypeCase.RESPONSETYPE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.google.firestore.v1.TargetChange$TargetChangeType[] r6 = com.google.firestore.p228v1.TargetChange.TargetChangeType.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f54651j = r6
                com.google.firestore.v1.TargetChange$TargetChangeType r7 = com.google.firestore.p228v1.TargetChange.TargetChangeType.NO_CHANGE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r6 = f54651j     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.google.firestore.v1.TargetChange$TargetChangeType r7 = com.google.firestore.p228v1.TargetChange.TargetChangeType.ADD     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r6 = f54651j     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.firestore.v1.TargetChange$TargetChangeType r7 = com.google.firestore.p228v1.TargetChange.TargetChangeType.REMOVE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r6 = f54651j     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.firestore.v1.TargetChange$TargetChangeType r7 = com.google.firestore.p228v1.TargetChange.TargetChangeType.CURRENT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r6 = f54651j     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.google.firestore.v1.TargetChange$TargetChangeType r7 = com.google.firestore.p228v1.TargetChange.TargetChangeType.RESET     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r6 = f54651j     // Catch:{ NoSuchFieldError -> 0x008c }
                com.google.firestore.v1.TargetChange$TargetChangeType r7 = com.google.firestore.p228v1.TargetChange.TargetChangeType.UNRECOGNIZED     // Catch:{ NoSuchFieldError -> 0x008c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                com.google.firestore.v1.StructuredQuery$Direction[] r6 = com.google.firestore.p228v1.StructuredQuery.Direction.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f54650i = r6
                com.google.firestore.v1.StructuredQuery$Direction r7 = com.google.firestore.p228v1.StructuredQuery.Direction.ASCENDING     // Catch:{ NoSuchFieldError -> 0x009d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r6 = f54650i     // Catch:{ NoSuchFieldError -> 0x00a7 }
                com.google.firestore.v1.StructuredQuery$Direction r7 = com.google.firestore.p228v1.StructuredQuery.Direction.DESCENDING     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator[] r6 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f54649h = r6
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r7 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                int[] r6 = f54649h     // Catch:{ NoSuchFieldError -> 0x00c2 }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r7 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r6 = f54649h     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r7 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.EQUAL     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r6 = f54649h     // Catch:{ NoSuchFieldError -> 0x00d6 }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r7 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                int[] r6 = f54649h     // Catch:{ NoSuchFieldError -> 0x00e0 }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r7 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                int[] r6 = f54649h     // Catch:{ NoSuchFieldError -> 0x00ea }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r7 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x00ea }
            L_0x00ea:
                r6 = 7
                int[] r7 = f54649h     // Catch:{ NoSuchFieldError -> 0x00f5 }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r8 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                r7 = 8
                int[] r8 = f54649h     // Catch:{ NoSuchFieldError -> 0x0101 }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r9 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.IN     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                r8 = 9
                int[] r9 = f54649h     // Catch:{ NoSuchFieldError -> 0x010d }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r10 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x010d }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                r9 = 10
                int[] r10 = f54649h     // Catch:{ NoSuchFieldError -> 0x0119 }
                com.google.firestore.v1.StructuredQuery$FieldFilter$Operator r11 = com.google.firestore.p228v1.StructuredQuery.FieldFilter.Operator.NOT_IN     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                com.google.firebase.firestore.core.Filter$Operator[] r10 = com.google.firebase.firestore.core.Filter.Operator.values()
                int r10 = r10.length
                int[] r10 = new int[r10]
                f54648g = r10
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x012a }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x012a }
                r10[r11] = r1     // Catch:{ NoSuchFieldError -> 0x012a }
            L_0x012a:
                int[] r10 = f54648g     // Catch:{ NoSuchFieldError -> 0x0134 }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0134 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0134 }
                r10[r11] = r0     // Catch:{ NoSuchFieldError -> 0x0134 }
            L_0x0134:
                int[] r10 = f54648g     // Catch:{ NoSuchFieldError -> 0x013e }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.EQUAL     // Catch:{ NoSuchFieldError -> 0x013e }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x013e }
                r10[r11] = r2     // Catch:{ NoSuchFieldError -> 0x013e }
            L_0x013e:
                int[] r10 = f54648g     // Catch:{ NoSuchFieldError -> 0x0148 }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0148 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0148 }
                r10[r11] = r3     // Catch:{ NoSuchFieldError -> 0x0148 }
            L_0x0148:
                int[] r10 = f54648g     // Catch:{ NoSuchFieldError -> 0x0152 }
                com.google.firebase.firestore.core.Filter$Operator r11 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0152 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0152 }
                r10[r11] = r4     // Catch:{ NoSuchFieldError -> 0x0152 }
            L_0x0152:
                int[] r4 = f54648g     // Catch:{ NoSuchFieldError -> 0x015c }
                com.google.firebase.firestore.core.Filter$Operator r10 = com.google.firebase.firestore.core.Filter.Operator.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x015c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r4[r10] = r5     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r4 = f54648g     // Catch:{ NoSuchFieldError -> 0x0166 }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x0166 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0166 }
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0166 }
            L_0x0166:
                int[] r4 = f54648g     // Catch:{ NoSuchFieldError -> 0x0170 }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.IN     // Catch:{ NoSuchFieldError -> 0x0170 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0170 }
                r4[r5] = r7     // Catch:{ NoSuchFieldError -> 0x0170 }
            L_0x0170:
                int[] r4 = f54648g     // Catch:{ NoSuchFieldError -> 0x017a }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x017a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x017a }
                r4[r5] = r8     // Catch:{ NoSuchFieldError -> 0x017a }
            L_0x017a:
                int[] r4 = f54648g     // Catch:{ NoSuchFieldError -> 0x0184 }
                com.google.firebase.firestore.core.Filter$Operator r5 = com.google.firebase.firestore.core.Filter.Operator.NOT_IN     // Catch:{ NoSuchFieldError -> 0x0184 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0184 }
                r4[r5] = r9     // Catch:{ NoSuchFieldError -> 0x0184 }
            L_0x0184:
                com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator[] r4 = com.google.firestore.p228v1.StructuredQuery.UnaryFilter.Operator.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f54647f = r4
                com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator r5 = com.google.firestore.p228v1.StructuredQuery.UnaryFilter.Operator.IS_NAN     // Catch:{ NoSuchFieldError -> 0x0195 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0195 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0195 }
            L_0x0195:
                int[] r4 = f54647f     // Catch:{ NoSuchFieldError -> 0x019f }
                com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator r5 = com.google.firestore.p228v1.StructuredQuery.UnaryFilter.Operator.IS_NULL     // Catch:{ NoSuchFieldError -> 0x019f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x019f }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x019f }
            L_0x019f:
                int[] r4 = f54647f     // Catch:{ NoSuchFieldError -> 0x01a9 }
                com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator r5 = com.google.firestore.p228v1.StructuredQuery.UnaryFilter.Operator.IS_NOT_NAN     // Catch:{ NoSuchFieldError -> 0x01a9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a9 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01a9 }
            L_0x01a9:
                int[] r4 = f54647f     // Catch:{ NoSuchFieldError -> 0x01b3 }
                com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator r5 = com.google.firestore.p228v1.StructuredQuery.UnaryFilter.Operator.IS_NOT_NULL     // Catch:{ NoSuchFieldError -> 0x01b3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b3 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x01b3 }
            L_0x01b3:
                com.google.firestore.v1.StructuredQuery$Filter$FilterTypeCase[] r4 = com.google.firestore.p228v1.StructuredQuery.Filter.FilterTypeCase.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f54646e = r4
                com.google.firestore.v1.StructuredQuery$Filter$FilterTypeCase r5 = com.google.firestore.p228v1.StructuredQuery.Filter.FilterTypeCase.COMPOSITE_FILTER     // Catch:{ NoSuchFieldError -> 0x01c4 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c4 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x01c4 }
            L_0x01c4:
                int[] r4 = f54646e     // Catch:{ NoSuchFieldError -> 0x01ce }
                com.google.firestore.v1.StructuredQuery$Filter$FilterTypeCase r5 = com.google.firestore.p228v1.StructuredQuery.Filter.FilterTypeCase.FIELD_FILTER     // Catch:{ NoSuchFieldError -> 0x01ce }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ce }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x01ce }
            L_0x01ce:
                int[] r4 = f54646e     // Catch:{ NoSuchFieldError -> 0x01d8 }
                com.google.firestore.v1.StructuredQuery$Filter$FilterTypeCase r5 = com.google.firestore.p228v1.StructuredQuery.Filter.FilterTypeCase.UNARY_FILTER     // Catch:{ NoSuchFieldError -> 0x01d8 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d8 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01d8 }
            L_0x01d8:
                com.google.firebase.firestore.local.QueryPurpose[] r4 = com.google.firebase.firestore.local.QueryPurpose.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f54645d = r4
                com.google.firebase.firestore.local.QueryPurpose r5 = com.google.firebase.firestore.local.QueryPurpose.LISTEN     // Catch:{ NoSuchFieldError -> 0x01e9 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e9 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x01e9 }
            L_0x01e9:
                int[] r4 = f54645d     // Catch:{ NoSuchFieldError -> 0x01f3 }
                com.google.firebase.firestore.local.QueryPurpose r5 = com.google.firebase.firestore.local.QueryPurpose.EXISTENCE_FILTER_MISMATCH     // Catch:{ NoSuchFieldError -> 0x01f3 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f3 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x01f3 }
            L_0x01f3:
                int[] r4 = f54645d     // Catch:{ NoSuchFieldError -> 0x01fd }
                com.google.firebase.firestore.local.QueryPurpose r5 = com.google.firebase.firestore.local.QueryPurpose.LIMBO_RESOLUTION     // Catch:{ NoSuchFieldError -> 0x01fd }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fd }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x01fd }
            L_0x01fd:
                com.google.firestore.v1.DocumentTransform$FieldTransform$TransformTypeCase[] r4 = com.google.firestore.p228v1.DocumentTransform.FieldTransform.TransformTypeCase.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f54644c = r4
                com.google.firestore.v1.DocumentTransform$FieldTransform$TransformTypeCase r5 = com.google.firestore.p228v1.DocumentTransform.FieldTransform.TransformTypeCase.SET_TO_SERVER_VALUE     // Catch:{ NoSuchFieldError -> 0x020e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x020e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x020e }
            L_0x020e:
                int[] r4 = f54644c     // Catch:{ NoSuchFieldError -> 0x0218 }
                com.google.firestore.v1.DocumentTransform$FieldTransform$TransformTypeCase r5 = com.google.firestore.p228v1.DocumentTransform.FieldTransform.TransformTypeCase.APPEND_MISSING_ELEMENTS     // Catch:{ NoSuchFieldError -> 0x0218 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0218 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0218 }
            L_0x0218:
                int[] r4 = f54644c     // Catch:{ NoSuchFieldError -> 0x0222 }
                com.google.firestore.v1.DocumentTransform$FieldTransform$TransformTypeCase r5 = com.google.firestore.p228v1.DocumentTransform.FieldTransform.TransformTypeCase.REMOVE_ALL_FROM_ARRAY     // Catch:{ NoSuchFieldError -> 0x0222 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0222 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0222 }
            L_0x0222:
                int[] r4 = f54644c     // Catch:{ NoSuchFieldError -> 0x022c }
                com.google.firestore.v1.DocumentTransform$FieldTransform$TransformTypeCase r5 = com.google.firestore.p228v1.DocumentTransform.FieldTransform.TransformTypeCase.INCREMENT     // Catch:{ NoSuchFieldError -> 0x022c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x022c }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x022c }
            L_0x022c:
                com.google.firestore.v1.Precondition$ConditionTypeCase[] r3 = com.google.firestore.p228v1.Precondition.ConditionTypeCase.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f54643b = r3
                com.google.firestore.v1.Precondition$ConditionTypeCase r4 = com.google.firestore.p228v1.Precondition.ConditionTypeCase.UPDATE_TIME     // Catch:{ NoSuchFieldError -> 0x023d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x023d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x023d }
            L_0x023d:
                int[] r3 = f54643b     // Catch:{ NoSuchFieldError -> 0x0247 }
                com.google.firestore.v1.Precondition$ConditionTypeCase r4 = com.google.firestore.p228v1.Precondition.ConditionTypeCase.EXISTS     // Catch:{ NoSuchFieldError -> 0x0247 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0247 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0247 }
            L_0x0247:
                int[] r3 = f54643b     // Catch:{ NoSuchFieldError -> 0x0251 }
                com.google.firestore.v1.Precondition$ConditionTypeCase r4 = com.google.firestore.p228v1.Precondition.ConditionTypeCase.CONDITIONTYPE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0251 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0251 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0251 }
            L_0x0251:
                com.google.firestore.v1.Write$OperationCase[] r3 = com.google.firestore.p228v1.Write.OperationCase.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f54642a = r3
                com.google.firestore.v1.Write$OperationCase r4 = com.google.firestore.p228v1.Write.OperationCase.UPDATE     // Catch:{ NoSuchFieldError -> 0x0262 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0262 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0262 }
            L_0x0262:
                int[] r1 = f54642a     // Catch:{ NoSuchFieldError -> 0x026c }
                com.google.firestore.v1.Write$OperationCase r3 = com.google.firestore.p228v1.Write.OperationCase.DELETE     // Catch:{ NoSuchFieldError -> 0x026c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x026c }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x026c }
            L_0x026c:
                int[] r0 = f54642a     // Catch:{ NoSuchFieldError -> 0x0276 }
                com.google.firestore.v1.Write$OperationCase r1 = com.google.firestore.p228v1.Write.OperationCase.VERIFY     // Catch:{ NoSuchFieldError -> 0x0276 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0276 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0276 }
            L_0x0276:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.RemoteSerializer.C112421.<clinit>():void");
        }
    }

    public RemoteSerializer(DatabaseId databaseId) {
        this.f54640a = databaseId;
        this.f54641b = m76267U(databaseId).mo62797e();
    }

    /* renamed from: B */
    private DocumentMask m76257B(FieldMask fieldMask) {
        DocumentMask.Builder a0 = DocumentMask.m77816a0();
        for (FieldPath e : fieldMask.mo62892b()) {
            a0.mo63795N(e.mo62797e());
        }
        return (DocumentMask) a0.build();
    }

    /* renamed from: D */
    private StructuredQuery.FieldFilter.Operator m76258D(Filter.Operator operator) {
        switch (C112421.f54648g[operator.ordinal()]) {
            case 1:
                return StructuredQuery.FieldFilter.Operator.LESS_THAN;
            case 2:
                return StructuredQuery.FieldFilter.Operator.LESS_THAN_OR_EQUAL;
            case 3:
                return StructuredQuery.FieldFilter.Operator.EQUAL;
            case 4:
                return StructuredQuery.FieldFilter.Operator.NOT_EQUAL;
            case 5:
                return StructuredQuery.FieldFilter.Operator.GREATER_THAN;
            case 6:
                return StructuredQuery.FieldFilter.Operator.GREATER_THAN_OR_EQUAL;
            case 7:
                return StructuredQuery.FieldFilter.Operator.ARRAY_CONTAINS;
            case 8:
                return StructuredQuery.FieldFilter.Operator.IN;
            case 9:
                return StructuredQuery.FieldFilter.Operator.ARRAY_CONTAINS_ANY;
            case 10:
                return StructuredQuery.FieldFilter.Operator.NOT_IN;
            default:
                throw Assert.m76440a("Unknown operator %d", operator);
        }
    }

    /* renamed from: E */
    private StructuredQuery.FieldReference m76259E(FieldPath fieldPath) {
        return (StructuredQuery.FieldReference) StructuredQuery.FieldReference.m78048X().mo63880N(fieldPath.mo62797e()).build();
    }

    /* renamed from: F */
    private DocumentTransform.FieldTransform m76260F(FieldTransform fieldTransform) {
        TransformOperation b = fieldTransform.mo62897b();
        if (b instanceof ServerTimestampOperation) {
            return (DocumentTransform.FieldTransform) DocumentTransform.FieldTransform.m77836f0().mo63806O(fieldTransform.mo62896a().mo62797e()).mo63809S(DocumentTransform.FieldTransform.ServerValue.REQUEST_TIME).build();
        }
        if (b instanceof ArrayTransformOperation.Union) {
            return (DocumentTransform.FieldTransform) DocumentTransform.FieldTransform.m77836f0().mo63806O(fieldTransform.mo62896a().mo62797e()).mo63805N(ArrayValue.m77721d0().mo63763N(((ArrayTransformOperation.Union) b).mo62885f())).build();
        }
        if (b instanceof ArrayTransformOperation.Remove) {
            return (DocumentTransform.FieldTransform) DocumentTransform.FieldTransform.m77836f0().mo63806O(fieldTransform.mo62896a().mo62797e()).mo63808R(ArrayValue.m77721d0().mo63763N(((ArrayTransformOperation.Remove) b).mo62885f())).build();
        }
        if (b instanceof NumericIncrementTransformOperation) {
            return (DocumentTransform.FieldTransform) DocumentTransform.FieldTransform.m77836f0().mo63806O(fieldTransform.mo62896a().mo62797e()).mo63807P(((NumericIncrementTransformOperation) b).mo62928d()).build();
        }
        throw Assert.m76440a("Unknown transform: %s", b);
    }

    /* renamed from: G */
    private StructuredQuery.Filter m76261G(List<Filter> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Filter next : list) {
            if (next instanceof FieldFilter) {
                arrayList.add(mo63064S((FieldFilter) next));
            }
        }
        if (list.size() == 1) {
            return (StructuredQuery.Filter) arrayList.get(0);
        }
        StructuredQuery.CompositeFilter.Builder b0 = StructuredQuery.CompositeFilter.m78007b0();
        b0.mo63869O(StructuredQuery.CompositeFilter.Operator.AND);
        b0.mo63868N(arrayList);
        return (StructuredQuery.Filter) StructuredQuery.Filter.m78058c0().mo63885N(b0).build();
    }

    @Nullable
    /* renamed from: I */
    private String m76262I(QueryPurpose queryPurpose) {
        int i = C112421.f54645d[queryPurpose.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "existence-filter-mismatch";
        }
        if (i == 3) {
            return "limbo-document";
        }
        throw Assert.m76440a("Unrecognized query purpose: %s", queryPurpose);
    }

    /* renamed from: L */
    private StructuredQuery.Order m76263L(OrderBy orderBy) {
        StructuredQuery.Order.Builder Y = StructuredQuery.Order.m78074Y();
        if (orderBy.mo23905b().equals(OrderBy.Direction.ASCENDING)) {
            Y.mo63890N(StructuredQuery.Direction.ASCENDING);
        } else {
            Y.mo63890N(StructuredQuery.Direction.DESCENDING);
        }
        Y.mo63891O(m76259E(orderBy.mo23906c()));
        return (StructuredQuery.Order) Y.build();
    }

    /* renamed from: M */
    private Precondition m76264M(com.google.firebase.firestore.model.mutation.Precondition precondition) {
        Assert.m76443d(!precondition.mo62936d(), "Can't serialize an empty precondition", new Object[0]);
        Precondition.Builder a0 = Precondition.m77938a0();
        if (precondition.mo62935c() != null) {
            return (Precondition) a0.mo63843O(mo63065T(precondition.mo62935c())).build();
        }
        if (precondition.mo62934b() != null) {
            return (Precondition) a0.mo63842N(precondition.mo62934b().booleanValue()).build();
        }
        throw Assert.m76440a("Unknown Precondition", new Object[0]);
    }

    /* renamed from: N */
    private String m76265N(ResourcePath resourcePath) {
        return m76266P(this.f54640a, resourcePath);
    }

    /* renamed from: P */
    private String m76266P(DatabaseId databaseId, ResourcePath resourcePath) {
        return ((ResourcePath) ((ResourcePath) m76267U(databaseId).mo62796d("documents")).mo62794b(resourcePath)).mo62797e();
    }

    /* renamed from: U */
    private static ResourcePath m76267U(DatabaseId databaseId) {
        return ResourcePath.m75902s(Arrays.asList(new String[]{"projects", databaseId.mo62814e(), "databases", databaseId.mo62813d()}));
    }

    /* renamed from: V */
    private static ResourcePath m76268V(ResourcePath resourcePath) {
        Assert.m76443d(resourcePath.mo62807n() > 4 && resourcePath.mo62803j(4).equals("documents"), "Tried to deserialize invalid key %s", resourcePath);
        return (ResourcePath) resourcePath.mo62808o(5);
    }

    /* renamed from: W */
    private C12537b1 m76269W(Status status) {
        return C12537b1.m83683h(status.mo65551U()).mo69066q(status.mo65552W());
    }

    /* renamed from: Y */
    private static boolean m76270Y(ResourcePath resourcePath) {
        if (resourcePath.mo62807n() < 4 || !resourcePath.mo62803j(0).equals("projects") || !resourcePath.mo62803j(2).equals("databases")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private Bound m76271b(Cursor cursor) {
        return new Bound(cursor.mo63778l(), cursor.mo63777Y());
    }

    /* renamed from: c */
    private FieldMask m76272c(DocumentMask documentMask) {
        int Z = documentMask.mo63794Z();
        HashSet hashSet = new HashSet(Z);
        for (int i = 0; i < Z; i++) {
            hashSet.add(FieldPath.m75864s(documentMask.mo63793Y(i)));
        }
        return FieldMask.m75950a(hashSet);
    }

    /* renamed from: f */
    private Filter.Operator m76273f(StructuredQuery.FieldFilter.Operator operator) {
        switch (C112421.f54649h[operator.ordinal()]) {
            case 1:
                return Filter.Operator.LESS_THAN;
            case 2:
                return Filter.Operator.LESS_THAN_OR_EQUAL;
            case 3:
                return Filter.Operator.EQUAL;
            case 4:
                return Filter.Operator.NOT_EQUAL;
            case 5:
                return Filter.Operator.GREATER_THAN_OR_EQUAL;
            case 6:
                return Filter.Operator.GREATER_THAN;
            case 7:
                return Filter.Operator.ARRAY_CONTAINS;
            case 8:
                return Filter.Operator.IN;
            case 9:
                return Filter.Operator.ARRAY_CONTAINS_ANY;
            case 10:
                return Filter.Operator.NOT_IN;
            default:
                throw Assert.m76440a("Unhandled FieldFilter.operator %d", operator);
        }
    }

    /* renamed from: g */
    private FieldTransform m76274g(DocumentTransform.FieldTransform fieldTransform) {
        int i = C112421.f54644c[fieldTransform.mo63804e0().ordinal()];
        if (i == 1) {
            Assert.m76443d(fieldTransform.mo63803d0() == DocumentTransform.FieldTransform.ServerValue.REQUEST_TIME, "Unknown transform setToServerValue: %s", fieldTransform.mo63803d0());
            return new FieldTransform(FieldPath.m75864s(fieldTransform.mo63800a0()), ServerTimestampOperation.m76001d());
        } else if (i == 2) {
            return new FieldTransform(FieldPath.m75864s(fieldTransform.mo63800a0()), new ArrayTransformOperation.Union(fieldTransform.mo63799Z().mo63762l()));
        } else {
            if (i == 3) {
                return new FieldTransform(FieldPath.m75864s(fieldTransform.mo63800a0()), new ArrayTransformOperation.Remove(fieldTransform.mo63802c0().mo63762l()));
            }
            if (i == 4) {
                return new FieldTransform(FieldPath.m75864s(fieldTransform.mo63800a0()), new NumericIncrementTransformOperation(fieldTransform.mo63801b0()));
            }
            throw Assert.m76440a("Unknown FieldTransform proto: %s", fieldTransform);
        }
    }

    /* renamed from: h */
    private List<Filter> m76275h(StructuredQuery.Filter filter) {
        List<StructuredQuery.Filter> list;
        if (filter.mo63883a0() == StructuredQuery.Filter.FilterTypeCase.COMPOSITE_FILTER) {
            Assert.m76443d(filter.mo63881X().mo63867a0() == StructuredQuery.CompositeFilter.Operator.AND, "Only AND-type composite filters are supported, got %d", filter.mo63881X().mo63867a0());
            list = filter.mo63881X().mo63866Z();
        } else {
            list = Collections.singletonList(filter);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (StructuredQuery.Filter next : list) {
            int i = C112421.f54646e[next.mo63883a0().ordinal()];
            if (i == 1) {
                throw Assert.m76440a("Nested composite filters are not supported.", new Object[0]);
            } else if (i == 2) {
                arrayList.add(mo63069e(next.mo63882Z()));
            } else if (i == 3) {
                arrayList.add(m76282v(next.mo63884b0()));
            } else {
                throw Assert.m76440a("Unrecognized Filter.filterType %d", next.mo63883a0());
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private MutableDocument m76276i(BatchGetDocumentsResponse batchGetDocumentsResponse) {
        Assert.m76443d(batchGetDocumentsResponse.mo63771X().equals(BatchGetDocumentsResponse.ResultCase.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        DocumentKey j = mo63070j(batchGetDocumentsResponse.mo63768U().mo63782a0());
        ObjectValue g = ObjectValue.m75893g(batchGetDocumentsResponse.mo63768U().mo63781Y());
        SnapshotVersion w = mo63077w(batchGetDocumentsResponse.mo63768U().mo63783b0());
        Assert.m76443d(!w.equals(SnapshotVersion.f54468c), "Got a document response with no snapshot version", new Object[0]);
        return MutableDocument.m75871p(j, w, g);
    }

    /* renamed from: l */
    private MutableDocument m76277l(BatchGetDocumentsResponse batchGetDocumentsResponse) {
        Assert.m76443d(batchGetDocumentsResponse.mo63771X().equals(BatchGetDocumentsResponse.ResultCase.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        DocumentKey j = mo63070j(batchGetDocumentsResponse.mo63769V());
        SnapshotVersion w = mo63077w(batchGetDocumentsResponse.mo63770W());
        Assert.m76443d(!w.equals(SnapshotVersion.f54468c), "Got a no document response with no snapshot version", new Object[0]);
        return MutableDocument.m75873r(j, w);
    }

    /* renamed from: o */
    private OrderBy m76278o(StructuredQuery.Order order) {
        OrderBy.Direction direction;
        FieldPath s = FieldPath.m75864s(order.mo63889X().mo63879W());
        int i = C112421.f54650i[order.mo63888W().ordinal()];
        if (i == 1) {
            direction = OrderBy.Direction.ASCENDING;
        } else if (i == 2) {
            direction = OrderBy.Direction.DESCENDING;
        } else {
            throw Assert.m76440a("Unrecognized direction %d", order.mo63888W());
        }
        return OrderBy.m8134d(direction, s);
    }

    /* renamed from: p */
    private com.google.firebase.firestore.model.mutation.Precondition m76279p(Precondition precondition) {
        int i = C112421.f54643b[precondition.mo63839W().ordinal()];
        if (i == 1) {
            return com.google.firebase.firestore.model.mutation.Precondition.m75996f(mo63077w(precondition.mo63841Z()));
        }
        if (i == 2) {
            return com.google.firebase.firestore.model.mutation.Precondition.m75995a(precondition.mo63840Y());
        }
        if (i == 3) {
            return com.google.firebase.firestore.model.mutation.Precondition.f54494c;
        }
        throw Assert.m76440a("Unknown precondition", new Object[0]);
    }

    /* renamed from: q */
    private ResourcePath m76280q(String str) {
        ResourcePath t = m76281t(str);
        if (t.mo62807n() == 4) {
            return ResourcePath.f54467c;
        }
        return m76268V(t);
    }

    /* renamed from: t */
    private ResourcePath m76281t(String str) {
        ResourcePath t = ResourcePath.m75903t(str);
        Assert.m76443d(m76270Y(t), "Tried to deserialize invalid key %s", t);
        return t;
    }

    /* renamed from: v */
    private Filter m76282v(StructuredQuery.UnaryFilter unaryFilter) {
        FieldPath s = FieldPath.m75864s(unaryFilter.mo63892X().mo63879W());
        int i = C112421.f54647f[unaryFilter.mo63893Y().ordinal()];
        if (i == 1) {
            return FieldFilter.m8065d(s, Filter.Operator.EQUAL, Values.f54470a);
        }
        if (i == 2) {
            return FieldFilter.m8065d(s, Filter.Operator.EQUAL, Values.f54471b);
        }
        if (i == 3) {
            return FieldFilter.m8065d(s, Filter.Operator.NOT_EQUAL, Values.f54470a);
        }
        if (i == 4) {
            return FieldFilter.m8065d(s, Filter.Operator.NOT_EQUAL, Values.f54471b);
        }
        throw Assert.m76440a("Unrecognized UnaryFilter.operator %d", unaryFilter.mo63893Y());
    }

    /* renamed from: z */
    private Cursor m76283z(Bound bound) {
        Cursor.Builder a0 = Cursor.m77772a0();
        a0.mo63779N(bound.mo23811b());
        a0.mo63780O(bound.mo23812c());
        return (Cursor) a0.build();
    }

    /* renamed from: A */
    public Document mo63056A(DocumentKey documentKey, ObjectValue objectValue) {
        Document.Builder e0 = Document.m77789e0();
        e0.mo63785O(mo63058H(documentKey));
        e0.mo63784N(objectValue.mo62869l());
        return (Document) e0.build();
    }

    /* renamed from: C */
    public Target.DocumentsTarget mo63057C(com.google.firebase.firestore.core.Target target) {
        Target.DocumentsTarget.Builder a0 = Target.DocumentsTarget.m78124a0();
        a0.mo63904N(m76265N(target.mo23959g()));
        return (Target.DocumentsTarget) a0.build();
    }

    /* renamed from: H */
    public String mo63058H(DocumentKey documentKey) {
        return m76266P(this.f54640a, documentKey.mo62832k());
    }

    @Nullable
    /* renamed from: J */
    public Map<String, String> mo63059J(TargetData targetData) {
        String I = m76262I(targetData.mo62782b());
        if (I == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("goog-listen-tags", I);
        return hashMap;
    }

    /* renamed from: K */
    public Write mo63060K(Mutation mutation) {
        Write.Builder o0 = Write.m78223o0();
        if (mutation instanceof SetMutation) {
            o0.mo63955R(mo63056A(mutation.mo62902e(), ((SetMutation) mutation).mo62943n()));
        } else if (mutation instanceof PatchMutation) {
            PatchMutation patchMutation = (PatchMutation) mutation;
            o0.mo63955R(mo63056A(mutation.mo62902e(), patchMutation.mo62932p()));
            o0.mo63956S(m76257B(patchMutation.mo62931n()));
        } else if (mutation instanceof DeleteMutation) {
            o0.mo63954P(mo63058H(mutation.mo62902e()));
        } else if (mutation instanceof VerifyMutation) {
            o0.mo63957T(mo63058H(mutation.mo62902e()));
        } else {
            throw Assert.m76440a("unknown mutation type %s", mutation.getClass());
        }
        for (FieldTransform F : mutation.mo62901d()) {
            o0.mo63952N(m76260F(F));
        }
        if (!mutation.mo62903g().mo62936d()) {
            o0.mo63953O(m76264M(mutation.mo62903g()));
        }
        return (Write) o0.build();
    }

    /* renamed from: O */
    public Target.QueryTarget mo63061O(com.google.firebase.firestore.core.Target target) {
        Target.QueryTarget.Builder Z = Target.QueryTarget.m78133Z();
        StructuredQuery.Builder r0 = StructuredQuery.m77966r0();
        ResourcePath g = target.mo23959g();
        boolean z = true;
        if (target.mo23953b() != null) {
            Assert.m76443d(g.mo62807n() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            Z.mo63907N(m76265N(g));
            StructuredQuery.CollectionSelector.Builder Y = StructuredQuery.CollectionSelector.m77993Y();
            Y.mo63865O(target.mo23953b());
            Y.mo63864N(true);
            r0.mo63856N(Y);
        } else {
            if (g.mo62807n() % 2 == 0) {
                z = false;
            }
            Assert.m76443d(z, "Document queries with filters are not supported.", new Object[0]);
            Z.mo63907N(m76265N((ResourcePath) g.mo62809q()));
            StructuredQuery.CollectionSelector.Builder Y2 = StructuredQuery.CollectionSelector.m77993Y();
            Y2.mo63865O(g.mo62802i());
            r0.mo63856N(Y2);
        }
        if (target.mo23955d().size() > 0) {
            r0.mo63861T(m76261G(target.mo23955d()));
        }
        for (OrderBy L : target.mo23958f()) {
            r0.mo63857O(m76263L(L));
        }
        if (target.mo23962i()) {
            r0.mo63859R(Int32Value.m80711X().mo65213N((int) target.mo23956e()));
        }
        if (target.mo23960h() != null) {
            r0.mo63860S(m76283z(target.mo23960h()));
        }
        if (target.mo23954c() != null) {
            r0.mo63858P(m76283z(target.mo23954c()));
        }
        Z.mo63908O(r0);
        return (Target.QueryTarget) Z.build();
    }

    /* renamed from: Q */
    public Target mo63062Q(TargetData targetData) {
        Target.Builder Z = Target.m78107Z();
        com.google.firebase.firestore.core.Target f = targetData.mo62787f();
        if (f.mo23963j()) {
            Z.mo63897N(mo63057C(f));
        } else {
            Z.mo63898O(mo63061O(f));
        }
        Z.mo63901S(targetData.mo62788g());
        if (!targetData.mo62783c().isEmpty() || targetData.mo62785e().compareTo(SnapshotVersion.f54468c) <= 0) {
            Z.mo63900R(targetData.mo62783c());
        } else {
            Z.mo63899P(mo63063R(targetData.mo62785e().mo62876d()));
        }
        return (Target) Z.build();
    }

    /* renamed from: R */
    public Timestamp mo63063R(com.google.firebase.Timestamp timestamp) {
        Timestamp.Builder Z = Timestamp.m81258Z();
        Z.mo65440O(timestamp.mo61973e());
        Z.mo65439N(timestamp.mo61971d());
        return (Timestamp) Z.build();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: S */
    public StructuredQuery.Filter mo63064S(FieldFilter fieldFilter) {
        StructuredQuery.UnaryFilter.Operator operator;
        StructuredQuery.UnaryFilter.Operator operator2;
        Filter.Operator e = fieldFilter.mo23860e();
        Filter.Operator operator3 = Filter.Operator.EQUAL;
        if (e == operator3 || fieldFilter.mo23860e() == Filter.Operator.NOT_EQUAL) {
            StructuredQuery.UnaryFilter.Builder Z = StructuredQuery.UnaryFilter.m78088Z();
            Z.mo63894N(m76259E(fieldFilter.mo23859b()));
            if (Values.m75935v(fieldFilter.mo23862f())) {
                if (fieldFilter.mo23860e() == operator3) {
                    operator2 = StructuredQuery.UnaryFilter.Operator.IS_NAN;
                } else {
                    operator2 = StructuredQuery.UnaryFilter.Operator.IS_NOT_NAN;
                }
                Z.mo63895O(operator2);
                return (StructuredQuery.Filter) StructuredQuery.Filter.m78058c0().mo63887P(Z).build();
            } else if (Values.m75936w(fieldFilter.mo23862f())) {
                if (fieldFilter.mo23860e() == operator3) {
                    operator = StructuredQuery.UnaryFilter.Operator.IS_NULL;
                } else {
                    operator = StructuredQuery.UnaryFilter.Operator.IS_NOT_NULL;
                }
                Z.mo63895O(operator);
                return (StructuredQuery.Filter) StructuredQuery.Filter.m78058c0().mo63887P(Z).build();
            }
        }
        StructuredQuery.FieldFilter.Builder b0 = StructuredQuery.FieldFilter.m78029b0();
        b0.mo63875N(m76259E(fieldFilter.mo23859b()));
        b0.mo63876O(m76258D(fieldFilter.mo23860e()));
        b0.mo63877P(fieldFilter.mo23862f());
        return (StructuredQuery.Filter) StructuredQuery.Filter.m78058c0().mo63886O(b0).build();
    }

    /* renamed from: T */
    public Timestamp mo63065T(SnapshotVersion snapshotVersion) {
        return mo63063R(snapshotVersion.mo62876d());
    }

    /* renamed from: X */
    public boolean mo63066X(ResourcePath resourcePath) {
        if (!m76270Y(resourcePath) || !resourcePath.mo62803j(1).equals(this.f54640a.mo62814e()) || !resourcePath.mo62803j(3).equals(this.f54640a.mo62813d())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public String mo63067a() {
        return this.f54641b;
    }

    /* renamed from: d */
    public com.google.firebase.firestore.core.Target mo63068d(Target.DocumentsTarget documentsTarget) {
        int Z = documentsTarget.mo63903Z();
        Assert.m76443d(Z == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(Z));
        return Query.m8139b(m76280q(documentsTarget.mo63902Y(0))).mo23934z();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: e */
    public FieldFilter mo63069e(StructuredQuery.FieldFilter fieldFilter) {
        return FieldFilter.m8065d(FieldPath.m75864s(fieldFilter.mo63872Y().mo63879W()), m76273f(fieldFilter.mo63873Z()), fieldFilter.mo63874a0());
    }

    /* renamed from: j */
    public DocumentKey mo63070j(String str) {
        ResourcePath t = m76281t(str);
        Assert.m76443d(t.mo62803j(1).equals(this.f54640a.mo62814e()), "Tried to deserialize key from different project.", new Object[0]);
        Assert.m76443d(t.mo62803j(3).equals(this.f54640a.mo62813d()), "Tried to deserialize key from different database.", new Object[0]);
        return DocumentKey.m75849i(m76268V(t));
    }

    /* renamed from: k */
    public MutableDocument mo63071k(BatchGetDocumentsResponse batchGetDocumentsResponse) {
        if (batchGetDocumentsResponse.mo63771X().equals(BatchGetDocumentsResponse.ResultCase.FOUND)) {
            return m76276i(batchGetDocumentsResponse);
        }
        if (batchGetDocumentsResponse.mo63771X().equals(BatchGetDocumentsResponse.ResultCase.MISSING)) {
            return m76277l(batchGetDocumentsResponse);
        }
        throw new IllegalArgumentException("Unknown result case: " + batchGetDocumentsResponse.mo63771X());
    }

    /* renamed from: m */
    public Mutation mo63072m(Write write) {
        com.google.firebase.firestore.model.mutation.Precondition precondition;
        if (write.mo63948k0()) {
            precondition = m76279p(write.mo63940c0());
        } else {
            precondition = com.google.firebase.firestore.model.mutation.Precondition.f54494c;
        }
        com.google.firebase.firestore.model.mutation.Precondition precondition2 = precondition;
        ArrayList arrayList = new ArrayList();
        for (DocumentTransform.FieldTransform g : write.mo63946i0()) {
            arrayList.add(m76274g(g));
        }
        int i = C112421.f54642a[write.mo63942e0().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new DeleteMutation(mo63070j(write.mo63941d0()), precondition2);
            }
            if (i == 3) {
                return new VerifyMutation(mo63070j(write.mo63947j0()), precondition2);
            }
            throw Assert.m76440a("Unknown mutation operation: %d", write.mo63942e0());
        } else if (write.mo63951n0()) {
            return new PatchMutation(mo63070j(write.mo63944g0().mo63782a0()), ObjectValue.m75893g(write.mo63944g0().mo63781Y()), m76272c(write.mo63945h0()), precondition2, arrayList);
        } else {
            return new SetMutation(mo63070j(write.mo63944g0().mo63782a0()), ObjectValue.m75893g(write.mo63944g0().mo63781Y()), precondition2, arrayList);
        }
    }

    /* renamed from: n */
    public MutationResult mo63073n(WriteResult writeResult, SnapshotVersion snapshotVersion) {
        SnapshotVersion w = mo63077w(writeResult.mo63967W());
        if (!SnapshotVersion.f54468c.equals(w)) {
            snapshotVersion = w;
        }
        int V = writeResult.mo63966V();
        ArrayList arrayList = new ArrayList(V);
        for (int i = 0; i < V; i++) {
            arrayList.add(writeResult.mo63965U(i));
        }
        return new MutationResult(snapshotVersion, arrayList);
    }

    /* renamed from: r */
    public com.google.firebase.firestore.core.Target mo63074r(Target.QueryTarget queryTarget) {
        return mo63075s(queryTarget.mo63905X(), queryTarget.mo63906Y());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.firestore.core.Target mo63075s(java.lang.String r13, com.google.firestore.p228v1.StructuredQuery r14) {
        /*
            r12 = this;
            com.google.firebase.firestore.model.ResourcePath r13 = r12.m76280q(r13)
            int r0 = r14.mo63846h0()
            r1 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            r3 = 1
            if (r0 != r3) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r4 = "StructuredQuery.from with more than one collection is not supported."
            com.google.firebase.firestore.util.Assert.m76443d(r3, r4, r0)
            com.google.firestore.v1.StructuredQuery$CollectionSelector r0 = r14.mo63845g0(r2)
            boolean r3 = r0.mo63862W()
            if (r3 == 0) goto L_0x0029
            java.lang.String r0 = r0.mo63863X()
            r4 = r13
            r5 = r0
            goto L_0x0035
        L_0x0029:
            java.lang.String r0 = r0.mo63863X()
            com.google.firebase.firestore.model.BasePath r13 = r13.mo62796d(r0)
            com.google.firebase.firestore.model.ResourcePath r13 = (com.google.firebase.firestore.model.ResourcePath) r13
        L_0x0033:
            r4 = r13
            r5 = r1
        L_0x0035:
            boolean r13 = r14.mo63855q0()
            if (r13 == 0) goto L_0x0044
            com.google.firestore.v1.StructuredQuery$Filter r13 = r14.mo63851m0()
            java.util.List r13 = r12.m76275h(r13)
            goto L_0x0048
        L_0x0044:
            java.util.List r13 = java.util.Collections.emptyList()
        L_0x0048:
            r6 = r13
            int r13 = r14.mo63849k0()
            if (r13 <= 0) goto L_0x0066
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r13)
        L_0x0054:
            if (r2 >= r13) goto L_0x0064
            com.google.firestore.v1.StructuredQuery$Order r3 = r14.mo63848j0(r2)
            com.google.firebase.firestore.core.OrderBy r3 = r12.m76278o(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0054
        L_0x0064:
            r7 = r0
            goto L_0x006b
        L_0x0066:
            java.util.List r13 = java.util.Collections.emptyList()
            r7 = r13
        L_0x006b:
            r2 = -1
            boolean r13 = r14.mo63853o0()
            if (r13 == 0) goto L_0x007c
            com.google.protobuf.Int32Value r13 = r14.mo63847i0()
            int r13 = r13.mo65212W()
            long r2 = (long) r13
        L_0x007c:
            r8 = r2
            boolean r13 = r14.mo63854p0()
            if (r13 == 0) goto L_0x008d
            com.google.firestore.v1.Cursor r13 = r14.mo63850l0()
            com.google.firebase.firestore.core.Bound r13 = r12.m76271b(r13)
            r10 = r13
            goto L_0x008e
        L_0x008d:
            r10 = r1
        L_0x008e:
            boolean r13 = r14.mo63852n0()
            if (r13 == 0) goto L_0x009c
            com.google.firestore.v1.Cursor r13 = r14.mo63844f0()
            com.google.firebase.firestore.core.Bound r1 = r12.m76271b(r13)
        L_0x009c:
            r11 = r1
            com.google.firebase.firestore.core.Target r13 = new com.google.firebase.firestore.core.Target
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.RemoteSerializer.mo63075s(java.lang.String, com.google.firestore.v1.StructuredQuery):com.google.firebase.firestore.core.Target");
    }

    /* renamed from: u */
    public com.google.firebase.Timestamp mo63076u(Timestamp timestamp) {
        return new com.google.firebase.Timestamp(timestamp.mo65438Y(), timestamp.mo65437X());
    }

    /* renamed from: w */
    public SnapshotVersion mo63077w(Timestamp timestamp) {
        if (timestamp.mo65438Y() == 0 && timestamp.mo65437X() == 0) {
            return SnapshotVersion.f54468c;
        }
        return new SnapshotVersion(mo63076u(timestamp));
    }

    /* renamed from: x */
    public SnapshotVersion mo63078x(ListenResponse listenResponse) {
        if (listenResponse.mo63829Z() != ListenResponse.ResponseTypeCase.TARGET_CHANGE) {
            return SnapshotVersion.f54468c;
        }
        if (listenResponse.mo63830a0().mo63913Z() != 0) {
            return SnapshotVersion.f54468c;
        }
        return mo63077w(listenResponse.mo63830a0().mo63910W());
    }

    /* renamed from: y */
    public WatchChange mo63079y(ListenResponse listenResponse) {
        WatchChange.WatchTargetChangeType watchTargetChangeType;
        WatchChange watchTargetChange;
        int i = C112421.f54652k[listenResponse.mo63829Z().ordinal()];
        C12537b1 b1Var = null;
        if (i == 1) {
            TargetChange a0 = listenResponse.mo63830a0();
            int i2 = C112421.f54651j[a0.mo63912Y().ordinal()];
            if (i2 == 1) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.NoChange;
            } else if (i2 == 2) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Added;
            } else if (i2 == 3) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Removed;
                b1Var = m76269W(a0.mo63909U());
            } else if (i2 == 4) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Current;
            } else if (i2 == 5) {
                watchTargetChangeType = WatchChange.WatchTargetChangeType.Reset;
            } else {
                throw new IllegalArgumentException("Unknown target change type");
            }
            watchTargetChange = new WatchChange.WatchTargetChange(watchTargetChangeType, a0.mo63914a0(), a0.mo63911X(), b1Var);
        } else if (i == 2) {
            DocumentChange V = listenResponse.mo63825V();
            List<Integer> X = V.mo63789X();
            List<Integer> W = V.mo63788W();
            DocumentKey j = mo63070j(V.mo63787V().mo63782a0());
            SnapshotVersion w = mo63077w(V.mo63787V().mo63783b0());
            Assert.m76443d(!w.equals(SnapshotVersion.f54468c), "Got a document change without an update time", new Object[0]);
            MutableDocument p = MutableDocument.m75871p(j, w, ObjectValue.m75893g(V.mo63787V().mo63781Y()));
            watchTargetChange = new WatchChange.DocumentChange(X, W, p.getKey(), p);
        } else if (i == 3) {
            DocumentDelete W2 = listenResponse.mo63826W();
            List<Integer> X2 = W2.mo63792X();
            MutableDocument r = MutableDocument.m75873r(mo63070j(W2.mo63790V()), mo63077w(W2.mo63791W()));
            return new WatchChange.DocumentChange(Collections.emptyList(), X2, r.getKey(), r);
        } else if (i == 4) {
            DocumentRemove X3 = listenResponse.mo63827X();
            watchTargetChange = new WatchChange.DocumentChange(Collections.emptyList(), X3.mo63797W(), mo63070j(X3.mo63796V()), (MutableDocument) null);
        } else if (i == 5) {
            ExistenceFilter Y = listenResponse.mo63828Y();
            return new WatchChange.ExistenceFilterWatchChange(Y.mo63812W(), new ExistenceFilter(Y.mo63811U()));
        } else {
            throw new IllegalArgumentException("Unknown change type set");
        }
        return watchTargetChange;
    }
}
