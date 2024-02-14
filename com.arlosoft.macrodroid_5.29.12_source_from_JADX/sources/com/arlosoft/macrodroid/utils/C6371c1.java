package com.arlosoft.macrodroid.utils;

import android.os.Build;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.p023dx.p026io.Opcodes;

/* renamed from: com.arlosoft.macrodroid.utils.c1 */
/* compiled from: PieBrightnessLookup */
public class C6371c1 {

    /* renamed from: a */
    private static final int[][] f14963a;

    /* renamed from: b */
    private static final int[][] f14964b;

    static {
        int[][] iArr = new int[Opcodes.REM_INT_LIT8][];
        iArr[0] = new int[]{0, 0};
        iArr[1] = new int[]{1, 6};
        iArr[2] = new int[]{2, 11};
        iArr[3] = new int[]{3, 15};
        iArr[4] = new int[]{4, 19};
        iArr[5] = new int[]{5, 22};
        iArr[6] = new int[]{6, 24};
        iArr[7] = new int[]{7, 27};
        iArr[8] = new int[]{8, 29};
        iArr[9] = new int[]{9, 31};
        iArr[10] = new int[]{10, 33};
        iArr[11] = new int[]{11, 34};
        iArr[12] = new int[]{12, 36};
        iArr[13] = new int[]{13, 38};
        iArr[14] = new int[]{14, 39};
        iArr[15] = new int[]{15, 41};
        iArr[16] = new int[]{16, 42};
        iArr[17] = new int[]{17, 43};
        iArr[18] = new int[]{18, 45};
        iArr[19] = new int[]{19, 46};
        iArr[20] = new int[]{20, 47};
        iArr[21] = new int[]{21, 49};
        iArr[22] = new int[]{22, 50};
        iArr[23] = new int[]{23, 51};
        iArr[24] = new int[]{24, 52};
        iArr[25] = new int[]{25, 53};
        iArr[26] = new int[]{26, 54};
        iArr[27] = new int[]{27, 55};
        iArr[28] = new int[]{28, 56};
        iArr[29] = new int[]{29, 57};
        iArr[30] = new int[]{30, 57};
        iArr[31] = new int[]{31, 57};
        iArr[32] = new int[]{32, 57};
        iArr[33] = new int[]{33, 60};
        iArr[34] = new int[]{34, 60};
        iArr[35] = new int[]{35, 61};
        iArr[36] = new int[]{36, 62};
        iArr[37] = new int[]{37, 62};
        iArr[38] = new int[]{38, 63};
        iArr[39] = new int[]{39, 63};
        iArr[40] = new int[]{40, 64};
        iArr[41] = new int[]{41, 64};
        iArr[42] = new int[]{42, 65};
        iArr[43] = new int[]{43, 65};
        iArr[44] = new int[]{44, 66};
        iArr[45] = new int[]{45, 66};
        iArr[46] = new int[]{46, 67};
        iArr[47] = new int[]{47, 67};
        iArr[48] = new int[]{48, 68};
        iArr[49] = new int[]{49, 68};
        iArr[50] = new int[]{50, 69};
        iArr[51] = new int[]{51, 69};
        iArr[52] = new int[]{52, 70};
        iArr[53] = new int[]{53, 70};
        iArr[54] = new int[]{54, 70};
        iArr[55] = new int[]{55, 71};
        iArr[56] = new int[]{56, 71};
        iArr[57] = new int[]{57, 71};
        iArr[58] = new int[]{58, 72};
        iArr[59] = new int[]{59, 72};
        iArr[60] = new int[]{60, 72};
        iArr[61] = new int[]{61, 73};
        iArr[62] = new int[]{62, 73};
        iArr[63] = new int[]{63, 73};
        iArr[64] = new int[]{64, 74};
        iArr[65] = new int[]{65, 74};
        iArr[66] = new int[]{66, 74};
        iArr[67] = new int[]{67, 75};
        iArr[68] = new int[]{68, 75};
        iArr[69] = new int[]{71, 76};
        iArr[70] = new int[]{73, 76};
        iArr[71] = new int[]{76, 77};
        iArr[72] = new int[]{79, 78};
        iArr[73] = new int[]{80, 78};
        iArr[74] = new int[]{81, 78};
        iArr[75] = new int[]{84, 79};
        iArr[76] = new int[]{86, 80};
        iArr[77] = new int[]{89, 80};
        iArr[78] = new int[]{91, 81};
        iArr[79] = new int[]{94, 81};
        iArr[80] = new int[]{96, 82};
        iArr[81] = new int[]{97, 82};
        iArr[82] = new int[]{98, 82};
        iArr[83] = new int[]{99, 82};
        iArr[84] = new int[]{102, 83};
        iArr[85] = new int[]{104, 83};
        iArr[86] = new int[]{107, 84};
        iArr[87] = new int[]{109, 84};
        iArr[88] = new int[]{112, 85};
        iArr[89] = new int[]{114, 85};
        iArr[90] = new int[]{117, 85};
        iArr[91] = new int[]{119, 86};
        iArr[92] = new int[]{122, 87};
        iArr[93] = new int[]{124, 87};
        iArr[94] = new int[]{127, 87};
        iArr[95] = new int[]{130, 88};
        iArr[96] = new int[]{132, 88};
        iArr[97] = new int[]{133, 88};
        iArr[98] = new int[]{134, 88};
        iArr[99] = new int[]{135, 88};
        iArr[100] = new int[]{136, 88};
        iArr[101] = new int[]{137, 88};
        iArr[102] = new int[]{138, 89};
        iArr[103] = new int[]{139, 89};
        iArr[104] = new int[]{140, 89};
        iArr[105] = new int[]{141, 89};
        iArr[106] = new int[]{142, 89};
        iArr[107] = new int[]{143, 89};
        iArr[108] = new int[]{144, 89};
        iArr[109] = new int[]{145, 90};
        iArr[110] = new int[]{146, 90};
        iArr[111] = new int[]{147, 90};
        iArr[112] = new int[]{148, 90};
        iArr[113] = new int[]{149, 90};
        iArr[114] = new int[]{150, 90};
        iArr[115] = new int[]{151, 90};
        iArr[116] = new int[]{152, 91};
        iArr[117] = new int[]{153, 91};
        iArr[118] = new int[]{154, 91};
        iArr[119] = new int[]{155, 91};
        iArr[120] = new int[]{156, 91};
        iArr[121] = new int[]{157, 91};
        iArr[122] = new int[]{158, 91};
        iArr[123] = new int[]{159, 91};
        iArr[124] = new int[]{160, 91};
        iArr[125] = new int[]{161, 91};
        iArr[126] = new int[]{162, 92};
        iArr[127] = new int[]{163, 92};
        iArr[128] = new int[]{164, 92};
        iArr[129] = new int[]{165, 92};
        iArr[130] = new int[]{166, 92};
        iArr[131] = new int[]{167, 92};
        iArr[132] = new int[]{168, 92};
        iArr[133] = new int[]{169, 92};
        iArr[134] = new int[]{170, 92};
        iArr[135] = new int[]{171, 93};
        iArr[136] = new int[]{172, 93};
        iArr[137] = new int[]{173, 93};
        iArr[138] = new int[]{174, 93};
        iArr[139] = new int[]{175, 93};
        iArr[140] = new int[]{176, 93};
        iArr[141] = new int[]{177, 93};
        iArr[142] = new int[]{178, 93};
        iArr[143] = new int[]{179, 93};
        iArr[144] = new int[]{180, 94};
        iArr[145] = new int[]{181, 94};
        iArr[146] = new int[]{182, 94};
        iArr[147] = new int[]{183, 94};
        iArr[148] = new int[]{184, 94};
        iArr[149] = new int[]{185, 94};
        iArr[150] = new int[]{186, 94};
        iArr[151] = new int[]{187, 94};
        iArr[152] = new int[]{188, 94};
        iArr[153] = new int[]{189, 94};
        iArr[154] = new int[]{190, 95};
        iArr[155] = new int[]{191, 95};
        iArr[156] = new int[]{192, 95};
        iArr[157] = new int[]{193, 95};
        iArr[158] = new int[]{194, 95};
        iArr[159] = new int[]{195, 95};
        iArr[160] = new int[]{196, 95};
        iArr[161] = new int[]{197, 95};
        iArr[162] = new int[]{198, 95};
        iArr[163] = new int[]{199, 95};
        iArr[164] = new int[]{200, 96};
        iArr[165] = new int[]{201, 96};
        iArr[166] = new int[]{202, 96};
        iArr[167] = new int[]{203, 96};
        iArr[168] = new int[]{204, 96};
        iArr[169] = new int[]{205, 96};
        iArr[170] = new int[]{206, 96};
        iArr[171] = new int[]{207, 96};
        iArr[172] = new int[]{Opcodes.ADD_INT_LIT16, 96};
        iArr[173] = new int[]{Opcodes.RSUB_INT, 96};
        iArr[174] = new int[]{Opcodes.MUL_INT_LIT16, 96};
        iArr[175] = new int[]{Opcodes.DIV_INT_LIT16, 96};
        iArr[176] = new int[]{Opcodes.REM_INT_LIT16, 97};
        iArr[177] = new int[]{Opcodes.AND_INT_LIT16, 97};
        iArr[178] = new int[]{Opcodes.OR_INT_LIT16, 97};
        iArr[179] = new int[]{Opcodes.XOR_INT_LIT16, 97};
        iArr[180] = new int[]{Opcodes.ADD_INT_LIT8, 97};
        iArr[181] = new int[]{Opcodes.RSUB_INT_LIT8, 97};
        iArr[182] = new int[]{Opcodes.MUL_INT_LIT8, 97};
        iArr[183] = new int[]{Opcodes.DIV_INT_LIT8, 97};
        iArr[184] = new int[]{Opcodes.REM_INT_LIT8, 97};
        iArr[185] = new int[]{Opcodes.AND_INT_LIT8, 97};
        iArr[186] = new int[]{Opcodes.OR_INT_LIT8, 97};
        iArr[187] = new int[]{Opcodes.XOR_INT_LIT8, 98};
        iArr[188] = new int[]{Opcodes.SHL_INT_LIT8, 98};
        iArr[189] = new int[]{Opcodes.SHR_INT_LIT8, 98};
        iArr[190] = new int[]{Opcodes.USHR_INT_LIT8, 98};
        iArr[191] = new int[]{227, 98};
        iArr[192] = new int[]{228, 98};
        iArr[193] = new int[]{229, 98};
        iArr[194] = new int[]{230, 98};
        iArr[195] = new int[]{231, 98};
        iArr[196] = new int[]{232, 98};
        iArr[197] = new int[]{233, 98};
        iArr[198] = new int[]{234, 98};
        iArr[199] = new int[]{235, 99};
        iArr[200] = new int[]{236, 99};
        iArr[201] = new int[]{237, 99};
        iArr[202] = new int[]{238, 99};
        iArr[203] = new int[]{239, 99};
        iArr[204] = new int[]{240, 99};
        iArr[205] = new int[]{241, 99};
        iArr[206] = new int[]{242, 99};
        iArr[207] = new int[]{243, 99};
        iArr[208] = new int[]{244, 99};
        iArr[209] = new int[]{245, 99};
        iArr[210] = new int[]{246, 99};
        iArr[211] = new int[]{247, 99};
        iArr[212] = new int[]{248, 100};
        iArr[213] = new int[]{249, 100};
        iArr[214] = new int[]{ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 100};
        iArr[215] = new int[]{251, 100};
        iArr[216] = new int[]{252, 100};
        iArr[217] = new int[]{253, 100};
        iArr[218] = new int[]{254, 100};
        iArr[219] = new int[]{255, 100};
        f14963a = iArr;
        int[][] iArr2 = new int[Opcodes.ADD_INT_LIT8][];
        iArr2[0] = new int[]{0, 0};
        iArr2[1] = new int[]{1, 1};
        iArr2[2] = new int[]{2, 2};
        iArr2[3] = new int[]{3, 3};
        iArr2[4] = new int[]{4, 4};
        iArr2[5] = new int[]{5, 5};
        iArr2[6] = new int[]{6, 6};
        iArr2[7] = new int[]{7, 7};
        iArr2[8] = new int[]{8, 8};
        iArr2[9] = new int[]{9, 9};
        iArr2[10] = new int[]{10, 10};
        iArr2[11] = new int[]{11, 11};
        iArr2[12] = new int[]{12, 12};
        iArr2[13] = new int[]{13, 13};
        iArr2[14] = new int[]{14, 14};
        iArr2[15] = new int[]{15, 15};
        iArr2[16] = new int[]{16, 16};
        iArr2[17] = new int[]{17, 17};
        iArr2[18] = new int[]{18, 18};
        iArr2[19] = new int[]{19, 19};
        iArr2[20] = new int[]{20, 20};
        iArr2[21] = new int[]{21, 21};
        iArr2[22] = new int[]{22, 22};
        iArr2[23] = new int[]{23, 23};
        iArr2[24] = new int[]{24, 24};
        iArr2[25] = new int[]{25, 25};
        iArr2[26] = new int[]{26, 26};
        iArr2[27] = new int[]{27, 27};
        iArr2[28] = new int[]{28, 28};
        iArr2[29] = new int[]{29, 29};
        iArr2[30] = new int[]{30, 30};
        iArr2[31] = new int[]{31, 31};
        iArr2[32] = new int[]{32, 32};
        iArr2[33] = new int[]{33, 33};
        iArr2[34] = new int[]{34, 34};
        iArr2[35] = new int[]{35, 35};
        iArr2[36] = new int[]{36, 36};
        iArr2[37] = new int[]{37, 37};
        iArr2[38] = new int[]{38, 38};
        iArr2[39] = new int[]{39, 39};
        iArr2[40] = new int[]{40, 40};
        iArr2[41] = new int[]{41, 41};
        iArr2[42] = new int[]{42, 42};
        iArr2[43] = new int[]{43, 43};
        iArr2[44] = new int[]{44, 44};
        iArr2[45] = new int[]{45, 44};
        iArr2[46] = new int[]{46, 45};
        iArr2[47] = new int[]{47, 45};
        iArr2[48] = new int[]{48, 46};
        iArr2[49] = new int[]{49, 46};
        iArr2[50] = new int[]{50, 47};
        iArr2[51] = new int[]{51, 47};
        iArr2[52] = new int[]{52, 48};
        iArr2[53] = new int[]{53, 48};
        iArr2[54] = new int[]{54, 49};
        iArr2[55] = new int[]{55, 50};
        iArr2[56] = new int[]{57, 51};
        iArr2[57] = new int[]{58, 52};
        iArr2[58] = new int[]{60, 53};
        iArr2[59] = new int[]{61, 54};
        iArr2[60] = new int[]{63, 55};
        iArr2[61] = new int[]{64, 56};
        iArr2[62] = new int[]{65, 57};
        iArr2[63] = new int[]{66, 58};
        iArr2[64] = new int[]{67, 59};
        iArr2[65] = new int[]{70, 60};
        iArr2[66] = new int[]{71, 61};
        iArr2[67] = new int[]{73, 62};
        iArr2[68] = new int[]{76, 63};
        iArr2[69] = new int[]{79, 64};
        iArr2[70] = new int[]{80, 65};
        iArr2[71] = new int[]{81, 66};
        iArr2[72] = new int[]{84, 67};
        iArr2[73] = new int[]{86, 68};
        iArr2[74] = new int[]{89, 69};
        iArr2[75] = new int[]{90, 70};
        iArr2[76] = new int[]{92, 71};
        iArr2[77] = new int[]{94, 72};
        iArr2[78] = new int[]{96, 73};
        iArr2[79] = new int[]{98, 74};
        iArr2[80] = new int[]{100, 75};
        iArr2[81] = new int[]{104, 75};
        iArr2[82] = new int[]{107, 76};
        iArr2[83] = new int[]{109, 76};
        iArr2[84] = new int[]{112, 76};
        iArr2[85] = new int[]{114, 77};
        iArr2[86] = new int[]{150, 77};
        iArr2[87] = new int[]{119, 77};
        iArr2[88] = new int[]{122, 77};
        iArr2[89] = new int[]{124, 78};
        iArr2[90] = new int[]{127, 78};
        iArr2[91] = new int[]{130, 78};
        iArr2[92] = new int[]{132, 78};
        iArr2[93] = new int[]{133, 78};
        iArr2[94] = new int[]{134, 79};
        iArr2[95] = new int[]{135, 79};
        iArr2[96] = new int[]{136, 79};
        iArr2[97] = new int[]{137, 79};
        iArr2[98] = new int[]{138, 80};
        iArr2[99] = new int[]{139, 80};
        iArr2[100] = new int[]{140, 80};
        iArr2[101] = new int[]{141, 80};
        iArr2[102] = new int[]{142, 80};
        iArr2[103] = new int[]{143, 81};
        iArr2[104] = new int[]{144, 81};
        iArr2[105] = new int[]{145, 81};
        iArr2[106] = new int[]{146, 81};
        iArr2[107] = new int[]{147, 82};
        iArr2[108] = new int[]{148, 82};
        iArr2[109] = new int[]{149, 82};
        iArr2[110] = new int[]{150, 82};
        iArr2[111] = new int[]{151, 82};
        iArr2[112] = new int[]{152, 83};
        iArr2[113] = new int[]{153, 83};
        iArr2[114] = new int[]{154, 83};
        iArr2[115] = new int[]{155, 83};
        iArr2[116] = new int[]{156, 83};
        iArr2[117] = new int[]{157, 84};
        iArr2[118] = new int[]{158, 84};
        iArr2[119] = new int[]{159, 84};
        iArr2[120] = new int[]{160, 84};
        iArr2[121] = new int[]{161, 84};
        iArr2[122] = new int[]{162, 84};
        iArr2[123] = new int[]{163, 85};
        iArr2[124] = new int[]{164, 85};
        iArr2[125] = new int[]{165, 85};
        iArr2[126] = new int[]{166, 85};
        iArr2[127] = new int[]{167, 85};
        iArr2[128] = new int[]{168, 85};
        iArr2[129] = new int[]{169, 86};
        iArr2[130] = new int[]{170, 86};
        iArr2[131] = new int[]{171, 86};
        iArr2[132] = new int[]{172, 86};
        iArr2[133] = new int[]{173, 87};
        iArr2[134] = new int[]{174, 87};
        iArr2[135] = new int[]{175, 87};
        iArr2[136] = new int[]{176, 87};
        iArr2[137] = new int[]{177, 88};
        iArr2[138] = new int[]{178, 88};
        iArr2[139] = new int[]{179, 88};
        iArr2[140] = new int[]{180, 88};
        iArr2[141] = new int[]{181, 88};
        iArr2[142] = new int[]{182, 89};
        iArr2[143] = new int[]{183, 89};
        iArr2[144] = new int[]{184, 89};
        iArr2[145] = new int[]{185, 89};
        iArr2[146] = new int[]{186, 90};
        iArr2[147] = new int[]{187, 90};
        iArr2[148] = new int[]{188, 90};
        iArr2[149] = new int[]{189, 90};
        iArr2[150] = new int[]{190, 90};
        iArr2[151] = new int[]{191, 91};
        iArr2[152] = new int[]{192, 91};
        iArr2[153] = new int[]{193, 91};
        iArr2[154] = new int[]{194, 91};
        iArr2[155] = new int[]{195, 91};
        iArr2[156] = new int[]{196, 92};
        iArr2[157] = new int[]{197, 92};
        iArr2[158] = new int[]{198, 92};
        iArr2[159] = new int[]{199, 92};
        iArr2[160] = new int[]{200, 92};
        iArr2[161] = new int[]{201, 93};
        iArr2[162] = new int[]{202, 93};
        iArr2[163] = new int[]{203, 93};
        iArr2[164] = new int[]{204, 93};
        iArr2[165] = new int[]{205, 94};
        iArr2[166] = new int[]{206, 94};
        iArr2[167] = new int[]{207, 94};
        iArr2[168] = new int[]{Opcodes.ADD_INT_LIT16, 94};
        iArr2[169] = new int[]{Opcodes.RSUB_INT, 94};
        iArr2[170] = new int[]{Opcodes.MUL_INT_LIT16, 95};
        iArr2[171] = new int[]{Opcodes.DIV_INT_LIT16, 95};
        iArr2[172] = new int[]{Opcodes.REM_INT_LIT16, 95};
        iArr2[173] = new int[]{Opcodes.AND_INT_LIT16, 95};
        iArr2[174] = new int[]{Opcodes.OR_INT_LIT16, 95};
        iArr2[175] = new int[]{Opcodes.XOR_INT_LIT16, 95};
        iArr2[176] = new int[]{Opcodes.ADD_INT_LIT8, 96};
        iArr2[177] = new int[]{Opcodes.RSUB_INT_LIT8, 96};
        iArr2[178] = new int[]{Opcodes.MUL_INT_LIT8, 96};
        iArr2[179] = new int[]{Opcodes.DIV_INT_LIT8, 96};
        iArr2[180] = new int[]{Opcodes.REM_INT_LIT8, 96};
        iArr2[181] = new int[]{Opcodes.AND_INT_LIT8, 96};
        iArr2[182] = new int[]{Opcodes.OR_INT_LIT8, 96};
        iArr2[183] = new int[]{Opcodes.XOR_INT_LIT8, 97};
        iArr2[184] = new int[]{Opcodes.SHL_INT_LIT8, 97};
        iArr2[185] = new int[]{Opcodes.SHR_INT_LIT8, 97};
        iArr2[186] = new int[]{Opcodes.USHR_INT_LIT8, 97};
        iArr2[187] = new int[]{227, 97};
        iArr2[188] = new int[]{228, 97};
        iArr2[189] = new int[]{229, 97};
        iArr2[190] = new int[]{230, 97};
        iArr2[191] = new int[]{231, 98};
        iArr2[192] = new int[]{232, 98};
        iArr2[193] = new int[]{233, 98};
        iArr2[194] = new int[]{234, 98};
        iArr2[195] = new int[]{235, 98};
        iArr2[196] = new int[]{236, 98};
        iArr2[197] = new int[]{237, 98};
        iArr2[198] = new int[]{238, 98};
        iArr2[199] = new int[]{239, 98};
        iArr2[200] = new int[]{240, 98};
        iArr2[201] = new int[]{241, 98};
        iArr2[202] = new int[]{242, 99};
        iArr2[203] = new int[]{243, 99};
        iArr2[204] = new int[]{244, 99};
        iArr2[205] = new int[]{245, 99};
        iArr2[206] = new int[]{246, 99};
        iArr2[207] = new int[]{247, 99};
        iArr2[208] = new int[]{248, 99};
        iArr2[209] = new int[]{249, 99};
        iArr2[210] = new int[]{ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 99};
        iArr2[211] = new int[]{251, 99};
        iArr2[212] = new int[]{252, 99};
        iArr2[213] = new int[]{253, 99};
        iArr2[214] = new int[]{254, 100};
        iArr2[215] = new int[]{255, 100};
        f14964b = iArr2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m24614a(int r3, int r4, boolean r5, boolean r6) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "xiaomi"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x000d
            int[][] r0 = f14964b
            goto L_0x000f
        L_0x000d:
            int[][] r0 = f14963a
        L_0x000f:
            int r1 = r0.length
            r2 = r5 ^ 1
            if (r6 == 0) goto L_0x0024
        L_0x0014:
            if (r4 >= r1) goto L_0x0034
            r6 = r0[r4]
            r6 = r6[r2]
            if (r6 < r3) goto L_0x0021
            r3 = r0[r4]
            r3 = r3[r5]
            return r3
        L_0x0021:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0024:
            if (r4 < 0) goto L_0x0034
            r6 = r0[r4]
            r6 = r6[r2]
            if (r6 > r3) goto L_0x0031
            r3 = r0[r4]
            r3 = r3[r5]
            return r3
        L_0x0031:
            int r4 = r4 + -1
            goto L_0x0024
        L_0x0034:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.utils.C6371c1.m24614a(int, int, boolean, boolean):int");
    }

    /* renamed from: b */
    public static int m24615b(int i, boolean z) {
        int[][] iArr = Build.MANUFACTURER.equalsIgnoreCase("xiaomi") ? f14964b : f14963a;
        int length = iArr.length - 1;
        if (!z && i < 24) {
            return m24614a(i, 0, false, true);
        }
        int i2 = 0;
        int i3 = 0;
        boolean z2 = true;
        while (i2 <= length) {
            i3 = (i2 + length) / 2;
            int i4 = i - iArr[i3][!z];
            boolean z3 = i4 > 0;
            if (Math.abs(i4) < 2) {
                return m24614a(i, i3, z, z3);
            }
            if (z3) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
            z2 = z3;
        }
        return m24614a(i, i3, z, z2);
    }
}
