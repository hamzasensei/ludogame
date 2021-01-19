package com.example.myludogame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Random;

public class twoplayers extends AppCompatActivity {

    RelativeLayout mainlayout;
    int isize, rh;
    int i = 0, j= 0,
            upsc = 0, //Blue
            ypsc = 0, //Yellow
            bx1 = 0, bx2 = 0,
            yx1 = 0, yx2 = 0;
    int r2, r3, dfour = 0 ,cfour = 0;
    int dicenumber[] = new int[6];
    int w = 0, x = 0;
    Button play;
    ImageButton dice2, dice3;
    ImageView blue1, blue2, blue3, blue4;
    ImageView yellow1, yellow2, yellow3, yellow4;

    int playx1, playy1, playx2, playy2, playx3, playy3, playx4, playy4; //Blue Tokens 1,2,3,4
    int yplayx1, yplayy1, yplayx2, yplayy2, yplayx3, yplayy3, yplayx4, yplayy4; //Yellow Tokens 1,2,3,4

    int[] b_x = new int[62];
    int[] b_y = new int[62];
    int[] y_x = new int[62];
    int[] y_y = new int[62];

    ImageView id0, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13, id14, id15,
            id16, id17, id18, id19, id20, id21, id22, id23, id24, id25, id26, id27, id28, id29,
            id30, id31, id32, id33, id34, id35, id36, id37, id38, id39, id40, id41, id42, id43,
            id44, id45, id46, id47, id48, id49, id50, id51, id52, id53, id54, id55, id56, id57,
            id58, id59, id60, id61, id62, id63, id64, id65, id66, id67, id68, id69, id70, id71,
            id72, id73, id74, id75, id76, id77, id78, id79, id80, id81, id82, id83, id84, id85,
            id86, id87, id88, id89, id90, id91, id92, id93, id94, id95, id96, id97, id98, id99,
            id100, id101, id102, id103, id104, id105, id106, id107, id108, id109, id110, id111,
            id112, id113, id114, id115, id116, id117, id118, id119, id120, id121, id122, id123,
            id124, id125, id126, id127, id128, id129, id130, id131, id132, id133, id134, id135,
            id136, id137, id138, id139, id140, id141, id142, id143, id144, id145, id146, id147,
            id148, id149, id150, id151, id152, id153, id154, id155, id156, id157, id158, id159,
            id160, id161, id162, id163, id164, id165, id166, id167, id168, id169, id170, id171,
            id172, id173, id174, id175, id176, id177, id178, id179, id180, id181, id182, id183,
            id184, id185, id186, id187, id188, id189, id190, id191, id192, id193, id194, id195,
            id196, id197, id198, id199, id200, id201, id202, id203, id204, id205, id206, id207,
            id208, id209, id210, id211, id212, id213, id214, id215, id216, id217, id218, id219,
            id220, id221, id222, id223, id224;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_twoplayers);

        new sqlb1(twoplayers.this).delete();
        new sqlb2(twoplayers.this).delete();
        new sqlb3(twoplayers.this).delete();
        new sqlb4(twoplayers.this).delete();

        new sqlb1(twoplayers.this).insert("0");
        new sqlb2(twoplayers.this).insert("0");
        new sqlb3(twoplayers.this).insert("0");
        new sqlb4(twoplayers.this).insert("0");

        new sqly1(twoplayers.this).delete();
        new sqly2(twoplayers.this).delete();
        new sqly3(twoplayers.this).delete();
        new sqly4(twoplayers.this).delete();

        new sqly1(twoplayers.this).insert("0");
        new sqly2(twoplayers.this).insert("0");
        new sqly3(twoplayers.this).insert("0");
        new sqly4(twoplayers.this).insert("0");

        dice2 = (ImageButton) findViewById(R.id.dice2);
        dice3 = (ImageButton) findViewById(R.id.dice3);

        dicenumber[0] = R.drawable.d_one;
        dicenumber[1] = R.drawable.d_two;
        dicenumber[2] = R.drawable.d_three;
        dicenumber[3] = R.drawable.d_four;
        dicenumber[4] = R.drawable.d_five;
        dicenumber[5] = R.drawable.d_six;

        mainlayout = new RelativeLayout(twoplayers.this);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final int height = displayMetrics.heightPixels;
        final int width = displayMetrics.widthPixels;
        isize = width / 15;
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(isize, isize);

        id0 = (ImageView) findViewById(R.id.id0);
        id0.setLayoutParams(p);

        id1 = (ImageView) findViewById(R.id.id1);
        id1.setLayoutParams(p);

        id2 = (ImageView) findViewById(R.id.id2);
        id2.setLayoutParams(p);

        id3 = (ImageView) findViewById(R.id.id3);
        id3.setLayoutParams(p);

        id4 = (ImageView) findViewById(R.id.id4);
        id4.setLayoutParams(p);

        id5 = (ImageView) findViewById(R.id.id5);
        id5.setLayoutParams(p);

        id6 = (ImageView) findViewById(R.id.id6);
        id6.setLayoutParams(p);

        id7 = (ImageView) findViewById(R.id.id7);
        id7.setLayoutParams(p);

        id8 = (ImageView) findViewById(R.id.id8);
        id8.setLayoutParams(p);

        id9 = (ImageView) findViewById(R.id.id9);
        id9.setLayoutParams(p);

        id10 = (ImageView) findViewById(R.id.id10);
        id10.setLayoutParams(p);

        id11 = (ImageView) findViewById(R.id.id11);
        id11.setLayoutParams(p);

        id12 = (ImageView) findViewById(R.id.id12);
        id12.setLayoutParams(p);

        id13 = (ImageView) findViewById(R.id.id13);
        id13.setLayoutParams(p);

        id14 = (ImageView) findViewById(R.id.id14);
        id14.setLayoutParams(p);

        id15 = (ImageView) findViewById(R.id.id15);
        id15.setLayoutParams(p);

        id16 = (ImageView) findViewById(R.id.id16);
        id16.setLayoutParams(p);

        id17 = (ImageView) findViewById(R.id.id17);
        id17.setLayoutParams(p);

        id18 = (ImageView) findViewById(R.id.id18);
        id18.setLayoutParams(p);

        id19 = (ImageView) findViewById(R.id.id19);
        id19.setLayoutParams(p);

        id20 = (ImageView) findViewById(R.id.id20);
        id20.setLayoutParams(p);

        id21 = (ImageView) findViewById(R.id.id21);
        id21.setLayoutParams(p);

        id22 = (ImageView) findViewById(R.id.id22);
        id22.setLayoutParams(p);

        id23 = (ImageView) findViewById(R.id.id23);
        id23.setLayoutParams(p);

        id24 = (ImageView) findViewById(R.id.id24);
        id24.setLayoutParams(p);

        id25 = (ImageView) findViewById(R.id.id25);
        id25.setLayoutParams(p);

        id26 = (ImageView) findViewById(R.id.id26);
        id26.setLayoutParams(p);

        id27 = (ImageView) findViewById(R.id.id27);
        id27.setLayoutParams(p);

        id28 = (ImageView) findViewById(R.id.id28);
        id28.setLayoutParams(p);

        id29 = (ImageView) findViewById(R.id.id29);
        id29.setLayoutParams(p);

        id30 = (ImageView) findViewById(R.id.id30);
        id30.setLayoutParams(p);

        id31 = (ImageView) findViewById(R.id.id31);
        id31.setLayoutParams(p);

        id32 = (ImageView) findViewById(R.id.id32);
        id32.setLayoutParams(p);

        id33 = (ImageView) findViewById(R.id.id33);
        id33.setLayoutParams(p);

        id34 = (ImageView) findViewById(R.id.id34);
        id34.setLayoutParams(p);

        id35 = (ImageView) findViewById(R.id.id35);
        id35.setLayoutParams(p);

        id36 = (ImageView) findViewById(R.id.id36);
        id36.setLayoutParams(p);

        id37 = (ImageView) findViewById(R.id.id37);
        id37.setLayoutParams(p);

        id38 = (ImageView) findViewById(R.id.id38);
        id38.setLayoutParams(p);

        id39 = (ImageView) findViewById(R.id.id39);
        id39.setLayoutParams(p);

        id40 = (ImageView) findViewById(R.id.id40);
        id40.setLayoutParams(p);

        id41 = (ImageView) findViewById(R.id.id41);
        id41.setLayoutParams(p);

        id42 = (ImageView) findViewById(R.id.id42);
        id42.setLayoutParams(p);

        id43 = (ImageView) findViewById(R.id.id43);
        id43.setLayoutParams(p);

        id44 = (ImageView) findViewById(R.id.id44);
        id44.setLayoutParams(p);

        id45 = (ImageView) findViewById(R.id.id45);
        id45.setLayoutParams(p);

        id46 = (ImageView) findViewById(R.id.id46);
        id46.setLayoutParams(p);

        id47 = (ImageView) findViewById(R.id.id47);
        id47.setLayoutParams(p);

        id48 = (ImageView) findViewById(R.id.id48);
        id48.setLayoutParams(p);

        id49 = (ImageView) findViewById(R.id.id49);
        id49.setLayoutParams(p);

        id50 = (ImageView) findViewById(R.id.id50);
        id50.setLayoutParams(p);

        id51 = (ImageView) findViewById(R.id.id51);
        id51.setLayoutParams(p);

        id52 = (ImageView) findViewById(R.id.id52);
        id52.setLayoutParams(p);

        id53 = (ImageView) findViewById(R.id.id53);
        id53.setLayoutParams(p);

        id54 = (ImageView) findViewById(R.id.id54);
        id54.setLayoutParams(p);

        id55 = (ImageView) findViewById(R.id.id55);
        id55.setLayoutParams(p);

        id56 = (ImageView) findViewById(R.id.id56);
        id56.setLayoutParams(p);

        id57 = (ImageView) findViewById(R.id.id57);
        id57.setLayoutParams(p);

        id58 = (ImageView) findViewById(R.id.id58);
        id58.setLayoutParams(p);

        id59 = (ImageView) findViewById(R.id.id59);
        id59.setLayoutParams(p);

        id60 = (ImageView) findViewById(R.id.id60);
        id60.setLayoutParams(p);

        id61 = (ImageView) findViewById(R.id.id61);
        id61.setLayoutParams(p);

        id62 = (ImageView) findViewById(R.id.id62);
        id62.setLayoutParams(p);

        id63 = (ImageView) findViewById(R.id.id63);
        id63.setLayoutParams(p);

        id64 = (ImageView) findViewById(R.id.id64);
        id64.setLayoutParams(p);

        id65 = (ImageView) findViewById(R.id.id65);
        id65.setLayoutParams(p);

        id66 = (ImageView) findViewById(R.id.id66);
        id66.setLayoutParams(p);

        id67 = (ImageView) findViewById(R.id.id67);
        id67.setLayoutParams(p);

        id68 = (ImageView) findViewById(R.id.id68);
        id68.setLayoutParams(p);

        id69 = (ImageView) findViewById(R.id.id69);
        id69.setLayoutParams(p);

        id70 = (ImageView) findViewById(R.id.id70);
        id70.setLayoutParams(p);

        id71 = (ImageView) findViewById(R.id.id71);
        id71.setLayoutParams(p);

        id72 = (ImageView) findViewById(R.id.id72);
        id72.setLayoutParams(p);

        id73 = (ImageView) findViewById(R.id.id73);
        id73.setLayoutParams(p);

        id74 = (ImageView) findViewById(R.id.id74);
        id74.setLayoutParams(p);

        id75 = (ImageView) findViewById(R.id.id75);
        id75.setLayoutParams(p);

        id76 = (ImageView) findViewById(R.id.id76);
        id76.setLayoutParams(p);

        id77 = (ImageView) findViewById(R.id.id77);
        id77.setLayoutParams(p);

        id78 = (ImageView) findViewById(R.id.id78);
        id78.setLayoutParams(p);

        id79 = (ImageView) findViewById(R.id.id79);
        id79.setLayoutParams(p);

        id80 = (ImageView) findViewById(R.id.id80);
        id80.setLayoutParams(p);

        id81 = (ImageView) findViewById(R.id.id81);
        id81.setLayoutParams(p);

        id82 = (ImageView) findViewById(R.id.id82);
        id82.setLayoutParams(p);

        id83 = (ImageView) findViewById(R.id.id83);
        id83.setLayoutParams(p);

        id84 = (ImageView) findViewById(R.id.id84);
        id84.setLayoutParams(p);

        id85 = (ImageView) findViewById(R.id.id85);
        id85.setLayoutParams(p);

        id86 = (ImageView) findViewById(R.id.id86);
        id86.setLayoutParams(p);

        id87 = (ImageView) findViewById(R.id.id87);
        id87.setLayoutParams(p);

        id88 = (ImageView) findViewById(R.id.id88);
        id88.setLayoutParams(p);

        id89 = (ImageView) findViewById(R.id.id89);
        id89.setLayoutParams(p);

        id90 = (ImageView) findViewById(R.id.id90);
        id90.setLayoutParams(p);

        id91 = (ImageView) findViewById(R.id.id91);
        id91.setLayoutParams(p);

        id92 = (ImageView) findViewById(R.id.id92);
        id92.setLayoutParams(p);

        id93 = (ImageView) findViewById(R.id.id93);
        id93.setLayoutParams(p);

        id94 = (ImageView) findViewById(R.id.id94);
        id94.setLayoutParams(p);

        id95 = (ImageView) findViewById(R.id.id95);
        id95.setLayoutParams(p);

        id96 = (ImageView) findViewById(R.id.id96);
        id96.setLayoutParams(p);

        id97 = (ImageView) findViewById(R.id.id97);
        id97.setLayoutParams(p);

        id98 = (ImageView) findViewById(R.id.id98);
        id98.setLayoutParams(p);

        id99 = (ImageView) findViewById(R.id.id99);
        id99.setLayoutParams(p);

        id100 = (ImageView) findViewById(R.id.id100);
        id100.setLayoutParams(p);

        id101 = (ImageView) findViewById(R.id.id101);
        id101.setLayoutParams(p);

        id102 = (ImageView) findViewById(R.id.id102);
        id102.setLayoutParams(p);

        id103 = (ImageView) findViewById(R.id.id103);
        id103.setLayoutParams(p);

        id104 = (ImageView) findViewById(R.id.id104);
        id104.setLayoutParams(p);

        id105 = (ImageView) findViewById(R.id.id105);
        id105.setLayoutParams(p);

        id106 = (ImageView) findViewById(R.id.id106);
        id106.setLayoutParams(p);

        id107 = (ImageView) findViewById(R.id.id107);
        id107.setLayoutParams(p);

        id108 = (ImageView) findViewById(R.id.id108);
        id108.setLayoutParams(p);

        id109 = (ImageView) findViewById(R.id.id109);
        id109.setLayoutParams(p);

        id110 = (ImageView) findViewById(R.id.id110);
        id110.setLayoutParams(p);

        id111 = (ImageView) findViewById(R.id.id111);
        id111.setLayoutParams(p);

        id112 = (ImageView) findViewById(R.id.id112);
        id112.setLayoutParams(p);

        id113 = (ImageView) findViewById(R.id.id113);
        id113.setLayoutParams(p);

        id114 = (ImageView) findViewById(R.id.id114);
        id114.setLayoutParams(p);

        id115 = (ImageView) findViewById(R.id.id115);
        id115.setLayoutParams(p);

        id116 = (ImageView) findViewById(R.id.id116);
        id116.setLayoutParams(p);

        id117 = (ImageView) findViewById(R.id.id117);
        id117.setLayoutParams(p);

        id118 = (ImageView) findViewById(R.id.id118);
        id118.setLayoutParams(p);

        id119 = (ImageView) findViewById(R.id.id119);
        id119.setLayoutParams(p);

        id120 = (ImageView) findViewById(R.id.id120);
        id120.setLayoutParams(p);

        id121 = (ImageView) findViewById(R.id.id121);
        id121.setLayoutParams(p);

        id122 = (ImageView) findViewById(R.id.id122);
        id122.setLayoutParams(p);

        id123 = (ImageView) findViewById(R.id.id123);
        id123.setLayoutParams(p);

        id124 = (ImageView) findViewById(R.id.id124);
        id124.setLayoutParams(p);

        id125 = (ImageView) findViewById(R.id.id125);
        id125.setLayoutParams(p);

        id126 = (ImageView) findViewById(R.id.id126);
        id126.setLayoutParams(p);

        id127 = (ImageView) findViewById(R.id.id127);
        id127.setLayoutParams(p);

        id128 = (ImageView) findViewById(R.id.id128);
        id128.setLayoutParams(p);

        id129 = (ImageView) findViewById(R.id.id129);
        id129.setLayoutParams(p);

        id130 = (ImageView) findViewById(R.id.id130);
        id130.setLayoutParams(p);

        id131 = (ImageView) findViewById(R.id.id131);
        id131.setLayoutParams(p);

        id132 = (ImageView) findViewById(R.id.id132);
        id132.setLayoutParams(p);

        id133 = (ImageView) findViewById(R.id.id133);
        id133.setLayoutParams(p);

        id134 = (ImageView) findViewById(R.id.id134);
        id134.setLayoutParams(p);

        id135 = (ImageView) findViewById(R.id.id135);
        id135.setLayoutParams(p);

        id136 = (ImageView) findViewById(R.id.id136);
        id136.setLayoutParams(p);

        id137 = (ImageView) findViewById(R.id.id137);
        id137.setLayoutParams(p);

        id138 = (ImageView) findViewById(R.id.id138);
        id138.setLayoutParams(p);

        id139 = (ImageView) findViewById(R.id.id139);
        id139.setLayoutParams(p);

        id140 = (ImageView) findViewById(R.id.id140);
        id140.setLayoutParams(p);

        id141 = (ImageView) findViewById(R.id.id141);
        id141.setLayoutParams(p);

        id142 = (ImageView) findViewById(R.id.id142);
        id142.setLayoutParams(p);

        id143 = (ImageView) findViewById(R.id.id143);
        id143.setLayoutParams(p);

        id144 = (ImageView) findViewById(R.id.id144);
        id144.setLayoutParams(p);

        id145 = (ImageView) findViewById(R.id.id145);
        id145.setLayoutParams(p);

        id146 = (ImageView) findViewById(R.id.id146);
        id146.setLayoutParams(p);

        id147 = (ImageView) findViewById(R.id.id147);
        id147.setLayoutParams(p);

        id148 = (ImageView) findViewById(R.id.id148);
        id148.setLayoutParams(p);

        id149 = (ImageView) findViewById(R.id.id149);
        id149.setLayoutParams(p);

        id150 = (ImageView) findViewById(R.id.id150);
        id150.setLayoutParams(p);

        id151 = (ImageView) findViewById(R.id.id151);
        id151.setLayoutParams(p);

        id152 = (ImageView) findViewById(R.id.id152);
        id152.setLayoutParams(p);

        id153 = (ImageView) findViewById(R.id.id153);
        id153.setLayoutParams(p);

        id154 = (ImageView) findViewById(R.id.id154);
        id154.setLayoutParams(p);

        id155 = (ImageView) findViewById(R.id.id155);
        id155.setLayoutParams(p);

        id156 = (ImageView) findViewById(R.id.id156);
        id156.setLayoutParams(p);

        id157 = (ImageView) findViewById(R.id.id157);
        id157.setLayoutParams(p);

        id158 = (ImageView) findViewById(R.id.id158);
        id158.setLayoutParams(p);

        id159 = (ImageView) findViewById(R.id.id159);
        id159.setLayoutParams(p);

        id160 = (ImageView) findViewById(R.id.id160);
        id160.setLayoutParams(p);

        id161 = (ImageView) findViewById(R.id.id161);
        id161.setLayoutParams(p);

        id162 = (ImageView) findViewById(R.id.id162);
        id162.setLayoutParams(p);

        id163 = (ImageView) findViewById(R.id.id163);
        id163.setLayoutParams(p);

        id164 = (ImageView) findViewById(R.id.id164);
        id164.setLayoutParams(p);

        id165 = (ImageView) findViewById(R.id.id165);
        id165.setLayoutParams(p);

        id166 = (ImageView) findViewById(R.id.id166);
        id166.setLayoutParams(p);

        id167 = (ImageView) findViewById(R.id.id167);
        id167.setLayoutParams(p);

        id168 = (ImageView) findViewById(R.id.id168);
        id168.setLayoutParams(p);

        id169 = (ImageView) findViewById(R.id.id169);
        id169.setLayoutParams(p);

        id170 = (ImageView) findViewById(R.id.id170);
        id170.setLayoutParams(p);

        id171 = (ImageView) findViewById(R.id.id171);
        id171.setLayoutParams(p);

        id172 = (ImageView) findViewById(R.id.id172);
        id172.setLayoutParams(p);

        id173 = (ImageView) findViewById(R.id.id173);
        id173.setLayoutParams(p);

        id174 = (ImageView) findViewById(R.id.id174);
        id174.setLayoutParams(p);

        id175 = (ImageView) findViewById(R.id.id175);
        id175.setLayoutParams(p);

        id176 = (ImageView) findViewById(R.id.id176);
        id176.setLayoutParams(p);

        id177 = (ImageView) findViewById(R.id.id177);
        id177.setLayoutParams(p);

        id178 = (ImageView) findViewById(R.id.id178);
        id178.setLayoutParams(p);

        id179 = (ImageView) findViewById(R.id.id179);
        id179.setLayoutParams(p);

        id180 = (ImageView) findViewById(R.id.id180);
        id180.setLayoutParams(p);

        id181 = (ImageView) findViewById(R.id.id181);
        id181.setLayoutParams(p);

        id182 = (ImageView) findViewById(R.id.id182);
        id182.setLayoutParams(p);

        id183 = (ImageView) findViewById(R.id.id183);
        id183.setLayoutParams(p);

        id184 = (ImageView) findViewById(R.id.id184);
        id184.setLayoutParams(p);

        id185 = (ImageView) findViewById(R.id.id185);
        id185.setLayoutParams(p);

        id186 = (ImageView) findViewById(R.id.id186);
        id186.setLayoutParams(p);

        id187 = (ImageView) findViewById(R.id.id187);
        id187.setLayoutParams(p);

        id188 = (ImageView) findViewById(R.id.id188);
        id188.setLayoutParams(p);

        id189 = (ImageView) findViewById(R.id.id189);
        id189.setLayoutParams(p);

        id190 = (ImageView) findViewById(R.id.id190);
        id190.setLayoutParams(p);

        id191 = (ImageView) findViewById(R.id.id191);
        id191.setLayoutParams(p);

        id192 = (ImageView) findViewById(R.id.id192);
        id192.setLayoutParams(p);

        id193 = (ImageView) findViewById(R.id.id193);
        id193.setLayoutParams(p);

        id194 = (ImageView) findViewById(R.id.id194);
        id194.setLayoutParams(p);

        id195 = (ImageView) findViewById(R.id.id195);
        id195.setLayoutParams(p);

        id196 = (ImageView) findViewById(R.id.id196);
        id196.setLayoutParams(p);

        id197 = (ImageView) findViewById(R.id.id197);
        id197.setLayoutParams(p);

        id198 = (ImageView) findViewById(R.id.id198);
        id198.setLayoutParams(p);

        id199 = (ImageView) findViewById(R.id.id199);
        id199.setLayoutParams(p);

        id200 = (ImageView) findViewById(R.id.id200);
        id200.setLayoutParams(p);

        id201 = (ImageView) findViewById(R.id.id201);
        id201.setLayoutParams(p);

        id202 = (ImageView) findViewById(R.id.id202);
        id202.setLayoutParams(p);

        id203 = (ImageView) findViewById(R.id.id203);
        id203.setLayoutParams(p);

        id204 = (ImageView) findViewById(R.id.id204);
        id204.setLayoutParams(p);

        id205 = (ImageView) findViewById(R.id.id205);
        id205.setLayoutParams(p);

        id206 = (ImageView) findViewById(R.id.id206);
        id206.setLayoutParams(p);

        id207 = (ImageView) findViewById(R.id.id207);
        id207.setLayoutParams(p);

        id208 = (ImageView) findViewById(R.id.id208);
        id208.setLayoutParams(p);

        id209 = (ImageView) findViewById(R.id.id209);
        id209.setLayoutParams(p);

        id210 = (ImageView) findViewById(R.id.id210);
        id210.setLayoutParams(p);

        id211 = (ImageView) findViewById(R.id.id211);
        id211.setLayoutParams(p);

        id212 = (ImageView) findViewById(R.id.id212);
        id212.setLayoutParams(p);

        id213 = (ImageView) findViewById(R.id.id213);
        id213.setLayoutParams(p);

        id214 = (ImageView) findViewById(R.id.id214);
        id214.setLayoutParams(p);

        id215 = (ImageView) findViewById(R.id.id215);
        id215.setLayoutParams(p);

        id216 = (ImageView) findViewById(R.id.id216);
        id216.setLayoutParams(p);

        id217 = (ImageView) findViewById(R.id.id217);
        id217.setLayoutParams(p);

        id218 = (ImageView) findViewById(R.id.id218);
        id218.setLayoutParams(p);

        id219 = (ImageView) findViewById(R.id.id219);
        id219.setLayoutParams(p);

        id220 = (ImageView) findViewById(R.id.id220);
        id220.setLayoutParams(p);

        id221 = (ImageView) findViewById(R.id.id221);
        id221.setLayoutParams(p);

        id222 = (ImageView) findViewById(R.id.id222);
        id222.setLayoutParams(p);

        id223 = (ImageView) findViewById(R.id.id223);
        id223.setLayoutParams(p);

        id224 = (ImageView) findViewById(R.id.id224);
        id224.setLayoutParams(p);

        blue1 = (ImageView) findViewById(R.id.bluetoken1);
        blue2 = (ImageView) findViewById(R.id.bluetoken2);
        blue3 = (ImageView) findViewById(R.id.bluetoken3);
        blue4 = (ImageView) findViewById(R.id.bluetoken4);

        yellow1 = (ImageView) findViewById(R.id.yellowtoken1);
        yellow2 = (ImageView) findViewById(R.id.yellowtoken2);
        yellow3 = (ImageView) findViewById(R.id.yellowtoken3);
        yellow4 = (ImageView) findViewById(R.id.yellowtoken4);

        play = (Button) findViewById(R.id.playbtn);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int r = height - (width );  //+0 for C7 & -120 for A30 && -180 for Laptop
                rh = r / 2;

                tokendirection(blue1, (isize * 2), (rh + (isize * 11)));
                tokendirection(blue2, (isize * 2), (rh + (isize * 12)));
                tokendirection(blue3, (isize * 3), (rh + (isize * 11)));
                tokendirection(blue4, (isize * 3), (rh + (isize * 12)));
//                tokendirection(blue2, (isize * 3), (rh + (isize * 11)));
//                tokendirection(blue3, (isize * 2), (rh + (isize * 12)));
//                tokendirection(blue4, (isize * 3), (rh + (isize * 12)));
                tokendirection(yellow1, (isize * 11), (rh + (isize * 2)));
                tokendirection(yellow2, (isize * 11), (rh + (isize * 3)));
                tokendirection(yellow3, (isize * 12), (rh + (isize * 2)));
                tokendirection(yellow4, (isize * 12), (rh + (isize * 3)));
//                tokendirection(yellow2, (isize * 11), (rh + (isize * 3)));
//                tokendirection(yellow3, (isize * 12), (rh + (isize * 2)));
//                tokendirection(yellow4, (isize * 12), (rh + (isize * 3)));
                playx1 = (int) blue1.getX();
                playy1 = (int) blue1.getY();
                playx2 = (int) blue2.getX();
                playy2 = (int) blue2.getY();
                playx3 = (int) blue3.getX();
                playy3 = (int) blue3.getY();
                playx4 = (int) blue4.getX();
                playy4 = (int) blue4.getY();

                yplayx1 = (int) yellow1.getX();
                yplayy1 = (int) yellow1.getY();
                yplayx2 = (int) yellow2.getX();
                yplayy2 = (int) yellow2.getY();
                yplayx3 = (int) yellow3.getX();
                yplayy3 = (int) yellow3.getY();
                yplayx4 = (int) yellow4.getX();
                yplayy4 = (int) yellow4.getY();

                if (play.getText().toString().equals("play")) {
                    //Toast.makeText(MainActivity.this,"out side"+ playx1  +"   "+osovle1.getX(),Toast.LENGTH_SHORT) .show()   ;
                    play.setVisibility(View.GONE);
                }
                play.setText("play");
            }
        });

        dice2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(twoplayers.this, R.raw.dicesound);
                mp.start();
                Thread th = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (j = 0; j < 7; j++) {
                                x++;
                                Thread.sleep(100);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (x < 5) {
                                            dice2.setImageDrawable(getResources().getDrawable(dicenumber[w]));
                                            if (j == 7) {
                                                Random rand = new Random();
                                                int number_random = rand.nextInt(6);
                                                r2 = number_random;
                                                cfour++;
                                                if (cfour == 4 || r2 == 5) {
                                                    r2 = 5;
                                                    cfour = 0;
                                                }
                                                dice2.setImageDrawable(getResources().getDrawable(dicenumber[r2]));
                                                mp.stop();

                                                if (r2 == 5) {moveyellow(r2, yellow1, yplayx1, yplayy1);}  //DICE
                                                if (r2 == 0) {moveyellow(r2, yellow1, yplayx1, yplayy1);}  //BLUE
                                                if (r2 == 1) {moveyellow(r2, yellow1, yplayx1, yplayy1);}  //NUMBER
                                                if (r2 == 2) {moveyellow(r2, yellow1, yplayx1, yplayy1);}  //ONCE
                                                if (r2 == 3) {moveyellow(r2, yellow1, yplayx1, yplayy1);}
                                                if (r2 == 4) {moveyellow(r2, yellow1, yplayx1, yplayy1);}

                                                if (r2 == 5) {moveyellow(r2, yellow2, yplayx2, yplayy2);}  //DICE
                                                if (r2 == 0) {moveyellow(r2, yellow2, yplayx2, yplayy2);}  //BlUE
                                                if (r2 == 1) {moveyellow(r2, yellow2, yplayx2, yplayy2);}  //NUMBER
                                                if (r2 == 2) {moveyellow(r2, yellow2, yplayx2, yplayy2);}  //TWO
                                                if (r2 == 3) {moveyellow(r2, yellow2, yplayx2, yplayy2);}
                                                if (r2 == 4) {moveyellow(r2, yellow2, yplayx2, yplayy2);}

                                                if (r2 == 5) {moveyellow(r2, yellow3, yplayx3, yplayy3);}  //DICE
                                                if (r2 == 0) {moveyellow(r2, yellow3, yplayx3, yplayy3);}  //BLUE
                                                if (r2 == 1) {moveyellow(r2, yellow3, yplayx3, yplayy3);}  //MUMBER
                                                if (r2 == 2) {moveyellow(r2, yellow3, yplayx3, yplayy3);}  //THREE
                                                if (r2 == 3) {moveyellow(r2, yellow3, yplayx3, yplayy3);}
                                                if (r2 == 4) {moveyellow(r2, yellow3, yplayx3, yplayy3);}

                                                if (r2 == 5) {moveyellow(r2, yellow4, yplayx4, yplayy4);}  //DICE
                                                if (r2 == 0) {moveyellow(r2, yellow4, yplayx4, yplayy4);}  //BLUE
                                                if (r2 == 1) {moveyellow(r2, yellow4, yplayx4, yplayy4);}  //NUMBER
                                                if (r2 == 2) {moveyellow(r2, yellow4, yplayx4, yplayy4);}  //FOUR
                                                if (r2 == 3) {moveyellow(r2, yellow4, yplayx4, yplayy4);}
                                                if (r2 == 4) {moveyellow(r2, yellow4, yplayx4, yplayy4);}
                                            }
                                        } else { x = 0; }
                                    }
                                });
                            }
                        } catch (InterruptedException e) { e.printStackTrace();
                        }
                    }
                });
                th.start();
            }
        });

        dice3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(twoplayers.this, R.raw.dicesound);
                mp.start();
                Thread th = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            for (i = 0; i < 7; i++) {
                                w++;
                                Thread.sleep(100);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (w < 5) {
                                            dice3.setImageDrawable(getResources().getDrawable(dicenumber[w]));
                                            if (i == 7) {
                                                Random rand = new Random();
                                                int number_random = rand.nextInt(6);
                                                r3 = number_random;
                                                dfour++;
                                                if (dfour == 4 || r3 == 5) {
                                                    r3 = 5;
                                                    dfour = 0;
                                                }
                                                dice3.setImageDrawable(getResources().getDrawable(dicenumber[r3]));
                                                mp.stop();

                                                if (r3 == 5) {moveblue(r3, blue1, playx1, playy1);}  //DICE
                                                if (r3 == 0) {moveblue(r3, blue1, playx1, playy1);}  //BLUE
                                                if (r3 == 1) {moveblue(r3, blue1, playx1, playy1);}  //NUMBER
                                                if (r3 == 2) {moveblue(r3, blue1, playx1, playy1);}  //ONCE
                                                if (r3 == 3) {moveblue(r3, blue1, playx1, playy1);}
                                                if (r3 == 4) {moveblue(r3, blue1, playx1, playy1);}

                                                if (r3 == 5) {moveblue(r3, blue2, playx2, playy2);}  //DICE
                                                if (r3 == 0) {moveblue(r3, blue2, playx2, playy2);}  //BlUE
                                                if (r3 == 1) {moveblue(r3, blue2, playx2, playy2);}  //NUMBER
                                                if (r3 == 2) {moveblue(r3, blue2, playx2, playy2);}  //TWO
                                                if (r3 == 3) {moveblue(r3, blue2, playx2, playy2);}
                                                if (r3 == 4) {moveblue(r3, blue2, playx2, playy2);}

                                                if (r3 == 5) {moveblue(r3, blue3, playx3, playy3);}  //DICE
                                                if (r3 == 0) {moveblue(r3, blue3, playx3, playy3);}  //BLUE
                                                if (r3 == 1) {moveblue(r3, blue3, playx3, playy3);}  //MUMBER
                                                if (r3 == 2) {moveblue(r3, blue3, playx3, playy3);}  //THREE
                                                if (r3 == 3) {moveblue(r3, blue3, playx3, playy3);}
                                                if (r3 == 4) {moveblue(r3, blue3, playx3, playy3);}

                                                if (r3 == 5) {moveblue(r3, blue4, playx4, playy4);}  //DICE
                                                if (r3 == 0) {moveblue(r3, blue4, playx4, playy4);}  //BLUE
                                                if (r3 == 1) {moveblue(r3, blue4, playx4, playy4);}  //NUMBER
                                                if (r3 == 2) {moveblue(r3, blue4, playx4, playy4);}  //FOUR
                                                if (r3 == 3) {moveblue(r3, blue4, playx4, playy4);}
                                                if (r3 == 4) {moveblue(r3, blue4, playx4, playy4);}
                                            }
                                        } else {
                                            w = 0;
                                        }
                                    }
                                });
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                th.start();
            }
        });

    }

    public void animate(View v) {
        RotateAnimation anim = new RotateAnimation(0.0f, 7.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setInterpolator(new LinearInterpolator());
        anim.setBackgroundColor(Color.RED);
        anim.setRepeatCount(Animation.INFINITE); //Repeat animation indefinitely
        anim.setDuration(70);
        v.setAnimation(anim);
    }

    public Animation blink() {
        Animation animation = new AlphaAnimation(1, 0); //to change visibility from visible to invisible
        animation.setDuration(400); //1 second duration for each animation cycle
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE); //repeating indefinitely
        animation.setRepeatMode(Animation.REVERSE); //animation will start from end point once ended.
        return animation;
    }

    public void tokendirection(ImageView img, int left, int top) {
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(70, 70); //Token height and width
        params.leftMargin = left;
        params.topMargin = top;
        img.setLayoutParams(params);
    }

    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Exit..!!");
        alertDialog.setIcon(R.drawable.ic_exit);
        alertDialog.setMessage("You will lose the progress! Are you sure you want to exit?");// Your opponent will win if you leave! ....Leave.....Keep playing
        alertDialog.setCancelable(false);
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        AlertDialog alertDialog1 = alertDialog.create();
        alertDialog1.show();
    }

    public void moveblue(final int diceno, final ImageView imgblue, final int xdir, final int ydir) {

        if ((int) imgblue.getX() == xdir && (int) imgblue.getY() == ydir)
        {
            if (diceno == 5)
            {
                imgblue.startAnimation(blink());
            }
        }
        else
            {
            imgblue.startAnimation(blink());
            if (new sqlb1(twoplayers.this).show() + (diceno + 1) > 62)
            {
                if (blue1.getAnimation() != null)
                {
                    blue1.getAnimation().cancel();
                    blue1.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
            if (new sqlb2(twoplayers.this).show() + (diceno + 1) > 62)
            {
                if (blue2.getAnimation() != null)
                {
                    blue2.getAnimation().cancel();
                    blue2.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
            if (new sqlb3(twoplayers.this).show() + (diceno + 1) > 62)
            {
                if (blue3.getAnimation() != null)
                {
                    blue3.getAnimation().cancel();
                    blue3.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
            if (new sqlb4(twoplayers.this).show() + (diceno + 1) > 62)
            {
                if (blue4.getAnimation() != null)
                {
                    blue4.getAnimation().cancel();
                    blue4.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
        }

        imgblue.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v)
            {
                if (imgblue.getAnimation() == null)
                {
                    return;
                }
                                               // Token1
                    if (imgblue.getId() == blue1.getId()) {
                        int yuio = 0;
                        if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (yuio == 0) {
                            blue1.setImageDrawable(getResources().getDrawable(R.drawable.blueic));
                        }
                        if (yuio == 1) {
                            if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {

                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {

                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                        }
                        if (yuio == 2) {
                            int po = 0; int po1=0;
                            if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                            }
                            if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                                po1 = 1;
                            }
                            if (new sqlb1(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                                po = 2;
                            }
                            if (po == 2) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                if(po1==1){
                                    blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2)); }else {
                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                                }
                            } else {
                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                        }
                        if (yuio == 3) {
                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic4));
                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                        }
                    }
                                                            // Token2
                    if (imgblue.getId() == blue2.getId()) {
                        int yuio = 0;
                        if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (yuio == 0) {
                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic));
                        }
                        if (yuio == 1) {
                            if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                        }
                        if (yuio == 2) {
                            int po = 0; int po1=0;
                            if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                            }
                            if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                                po1 = 1;
                            }
                            if (new sqlb2(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                                po = 2;
                            }
                            if (po == 2) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                if(po1==1){
                                    blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2)); }else {
                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                                }
                            } else {
                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                        }
                        if (yuio == 3) {
                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic4));
                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                        }
                    }
                                                            // TOKEN3
                    if (imgblue.getId() == blue3.getId()) {
                        int yuio = 0;
                        if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (yuio == 0) {
                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic));
                        }
                        if (yuio == 1) {
                            if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                        }
                        if (yuio == 2) {
                            int po = 0; int po1=0;
                            if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                            }
                            if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                                po1 = 1;
                            }
                            if (new sqlb3(twoplayers.this).show() + (diceno + 1) == new sqlb4(twoplayers.this).show()) {
                                po = 2;
                            }
                            if (po == 2) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                if(po1==1){
                                    blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2)); }else {
                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                                }
                            } else {
                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                        }
                        if (yuio == 3) {
                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic4));
                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                        }
                    }
                                                            //TOKEN4
                    if (imgblue.getId() == blue4.getId()) {
                        int yuio = 0;
                        if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                            yuio++;
                        }
                        if (yuio == 0) {
                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic));
                        }
                        if (yuio == 1) {
                            if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                            if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            }
                        }
                        if (yuio == 2) {
                            int po = 0; int po1=0;
                            if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb1(twoplayers.this).show()) {
                            }
                            if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb2(twoplayers.this).show()) {
                                po1 = 1;
                            }
                            if (new sqlb4(twoplayers.this).show() + (diceno + 1) == new sqlb3(twoplayers.this).show()) {
                                po = 2;
                            }
                            if (po == 2) {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                            } else {
                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                                if(po1==1){
                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));} else {
                                    blue1.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                                }
                            }
                        }
                        if (yuio == 3) {
                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.blueic4));
                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.blueic3));
                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.blueic2));
                        }
                    }

                if (imgblue.getId() == blue1.getId()) {
                    int ypp = new sqlb1(twoplayers.this).show();
                    int yppp = (ypp + diceno + 1);
                    new sqlb1(twoplayers.this).update(Integer.toString(yppp));
                    Toast.makeText(twoplayers.this, "" + new sqlb1(twoplayers.this).show(), Toast.LENGTH_LONG).show();

                }

///////////a
                if (imgblue.getId() == blue2.getId()) {
                    int ypp = new sqlb2(twoplayers.this).show();
                    int yppp = (ypp + diceno + 1);
                    new sqlb2(twoplayers.this).update(Integer.toString(yppp));
                    Toast.makeText(twoplayers.this, "" + new sqlb2(twoplayers.this).show(), Toast.LENGTH_LONG).show();

                }


///////////a
                if (imgblue.getId() == blue3.getId()) {
                    int ypp = new sqlb3(twoplayers.this).show();
                    int yppp = (ypp + diceno + 1);
                    new sqlb3(twoplayers.this).update(Integer.toString(yppp));
                    Toast.makeText(twoplayers.this, "" + new sqlb3(twoplayers.this).show(), Toast.LENGTH_LONG).show();

                }


///////////a
                if (imgblue.getId() == blue4.getId()) {
                    int ypp = new sqlb4(twoplayers.this).show();
                    int yppp = (ypp + diceno + 1);
                    new sqlb4(twoplayers.this).update(Integer.toString(yppp));
                    Toast.makeText(twoplayers.this, "" + new sqlb4(twoplayers.this).show(), Toast.LENGTH_LONG).show();

                }

                int loc[] = new int[2];
                id201.getLocationOnScreen(loc);
                if (blue1.getAnimation() != null)
                {
                    blue1.getAnimation().cancel();
                    blue1.clearAnimation();
                    blink().setAnimationListener(null);
                }

                if (blue2.getAnimation() != null)
                {
                    blue2.getAnimation().cancel();
                    blue2.clearAnimation();
                    blink().setAnimationListener(null);
                }

                if (blue3.getAnimation() != null)
                {
                    blue3.getAnimation().cancel();
                    blue3.clearAnimation();
                    blink().setAnimationListener(null);
                }
                if (blue4.getAnimation() != null)
                {
                    blue4.getAnimation().cancel();
                    blue4.clearAnimation();
                    blink().setAnimationListener(null);
                }

                if ((int) imgblue.getX() == xdir && (int) imgblue.getY() == ydir)
                {
                    if (diceno == 5)
                    {
                        tokendirection(imgblue, (int) imgblue.getX() + (isize * 4), rh + (isize * 13));
                    }
//                    else
//                    {
//                    }

//                    if(imgblue.getId() == blue1.getId() && imgblue.getId() == blue2.getId() || imgblue.getId() == blue1.getId() && imgblue.getId() == blue3.getId() || imgblue.getId() == blue1.getId() && imgblue.getId() == blue4.getId())
//                    {
//                        Toast.makeText(twoplayers.this,"Two tokens are in same place",Toast.LENGTH_LONG).show();
//                    }
                    b_x[1] = (int) imgblue.getX() + (isize * 4);
                    b_y[1] = rh + (isize * 12);

                    b_x[2] = (int) imgblue.getX() + (isize * 4);
                    b_y[2] = rh + (isize * 11);

                    b_x[3] = (int) imgblue.getX() + (isize * 4);
                    b_y[3] = rh + (isize * 10);

                    b_x[4] = (int) imgblue.getX() + (isize * 4);
                    b_y[4] = rh + (isize * 9);

                    b_x[5] = (int) imgblue.getX() + (isize * 3);
                    b_y[5] = rh + (isize * 8);

                    b_x[6] = (int) imgblue.getX() + (isize * 2);
                    b_y[6] = rh + (isize * 8);

                    b_x[7] = (int) imgblue.getX() + (isize * 1);
                    b_y[7] = rh + (isize * 8);

                    b_x[8] = (int) imgblue.getX() - (isize * 0);
                    b_y[8] = rh + (isize * 8);

                    b_x[9] = (int) imgblue.getX() - (isize * 1);
                    b_y[9] = rh + (isize * 8);

                    b_x[10] = (int) imgblue.getX() - (isize * 2);
                    b_y[10] = rh + (isize * 8);

                    b_x[11] = (int) imgblue.getX() - (isize * 2);
                    b_y[11] = rh + (isize * 7);

                    b_x[12] = (int) imgblue.getX() - (isize * 2);
                    b_y[12] = rh + (isize * 6);

                    b_x[13] = (int) imgblue.getX() - (isize);
                    b_y[13] = rh + (isize * 6);

                    b_x[14] = (int) imgblue.getX() + (isize * 0);
                    b_y[14] = rh + (isize * 6);

                    b_x[15] = (int) imgblue.getX() + (isize * 1);
                    b_y[15] = rh + (isize * 6);

                    b_x[16] = (int) imgblue.getX() + (isize * 2);
                    b_y[16] = rh + (isize * 6);

                    b_x[17] = (int) imgblue.getX() + (isize * 3);
                    b_y[17] = rh + (isize * 6);

                    b_x[18] = (int) imgblue.getX() + (isize * 4);
                    b_y[18] = rh + (isize * 5);

                    b_x[19] = (int) imgblue.getX() + (isize * 4);
                    b_y[19] = rh + (isize * 4);

                    b_x[20] = (int) imgblue.getX() + (isize * 4);
                    b_y[20] = rh + (isize * 3);

                    b_x[21] = (int) imgblue.getX() + (isize * 4);
                    b_y[21] = rh + (isize * 2);

                    b_x[22] = (int) imgblue.getX() + (isize * 4);
                    b_y[22] = rh + (isize * 1);

                    b_x[23] = (int) imgblue.getX() + (isize * 4);
                    b_y[23] = rh - (isize * 0);

                    b_x[24] = (int) imgblue.getX() + (isize * 5);
                    b_y[24] = rh - (isize * 0);

                    b_x[25] = (int) imgblue.getX() + (isize * 6);
                    b_y[25] = rh - (isize * 0);

                    b_x[26] = (int) imgblue.getX() + (isize * 6);
                    b_y[26] = rh + (isize * 1);

                    b_x[27] = (int) imgblue.getX() + (isize * 6);
                    b_y[27] = rh + (isize * 2);

                    b_x[28] = (int) imgblue.getX() + (isize * 6);
                    b_y[28] = rh + (isize * 3);

                    b_x[29] = (int) imgblue.getX() + (isize * 6);
                    b_y[29] = rh + (isize * 4);

                    b_x[30] = (int) imgblue.getX() + (isize * 6);
                    b_y[30] = rh + (isize * 5);

                    b_x[31] = (int) imgblue.getX() + (isize * 7);
                    b_y[31] = rh + (isize * 6);

                    b_x[32] = (int) imgblue.getX() + (isize * 8);
                    b_y[32] = rh + (isize * 6);

                    b_x[33] = (int) imgblue.getX() + (isize * 9);
                    b_y[33] = rh + (isize * 6);

                    b_x[34] = (int) imgblue.getX() + (isize * 10);
                    b_y[34] = rh + (isize * 6);

                    b_x[35] = (int) imgblue.getX() + (isize * 11);
                    b_y[35] = rh + (isize * 6);

                    b_x[36] = (int) imgblue.getX() + (isize * 12);
                    b_y[36] = rh + (isize * 6);

                    b_x[37] = (int) imgblue.getX() + (isize * 12);
                    b_y[37] = rh + (isize * 7);

                    b_x[38] = (int) imgblue.getX() + (isize * 12);
                    b_y[38] = rh + (isize * 8);

                    b_x[39] = (int) imgblue.getX() + (isize * 11);
                    b_y[39] = rh + (isize * 8);

                    b_x[40] = (int) imgblue.getX() + (isize * 10);
                    b_y[40] = rh + (isize * 8);

                    b_x[41] = (int) imgblue.getX() + (isize * 9);
                    b_y[41] = rh + (isize * 8);

                    b_x[42] = (int) imgblue.getX() + (isize * 8);
                    b_y[42] = rh + (isize * 8);

                    b_x[43] = (int) imgblue.getX() + (isize * 7);
                    b_y[43] = rh + (isize * 8);

                    b_x[44] = (int) imgblue.getX() + (isize * 6);
                    b_y[44] = rh + (isize * 9);

                    b_x[45] = (int) imgblue.getX() + (isize * 6);
                    b_y[45] = rh + (isize * 10);

                    b_x[46] = (int) imgblue.getX() + (isize * 6);
                    b_y[46] = rh + (isize * 11);

                    b_x[47] = (int) imgblue.getX() + (isize * 6);
                    b_y[47] = rh + (isize * 12);

                    b_x[48] = (int) imgblue.getX() + (isize * 6);
                    b_y[48] = rh + (isize * 13);

                    b_x[49] = (int) imgblue.getX() + (isize * 6);
                    b_y[49] = rh + (isize * 14);

                    b_x[50] = (int) imgblue.getX() + (isize * 5);
                    b_y[50] = rh + (isize * 14);

                    b_x[51] = (int) imgblue.getX() + (isize * 5);
                    b_y[51] = rh + (isize * 13);

                    b_x[52] = (int) imgblue.getX() + (isize * 5);
                    b_y[52] = rh + (isize * 12);

                    b_x[53] = (int) imgblue.getX() + (isize * 5);
                    b_y[53] = rh + (isize * 11);

                    b_x[54] = (int) imgblue.getX() + (isize * 5);
                    b_y[54] = rh + (isize * 10);

                    b_x[55] = (int) imgblue.getX() + (isize * 5);
                    b_y[55] = rh + (isize * 9);

                    b_x[56] = (int) imgblue.getX() + (isize * 5);
                    b_y[56] = rh + (isize * 8);

                }
                else {
                    //Thread
                    if (upsc == 0) {
                        Thread th = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    for (int yu = 0; yu < diceno + 1; yu++) {
                                        Thread.sleep(400);
                                        final int finalYu = yu + 1;
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                tokendirection(imgblue, b_x[finalYu], b_y[(finalYu)]);
                                            }
                                        });
                                    }
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        th.start();
                    } else {
                        if ((int) imgblue.getX() == b_x[1] && (int) imgblue.getY() == b_y[1] + (isize)) {

                            Thread ttt = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        for (int yu = 0; yu < diceno + 1; yu++) {
                                            Thread.sleep(400);
                                            final int finalYu = yu + 1;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    tokendirection(imgblue, b_x[finalYu], b_y[(finalYu)]);
                                                }
                                            });
                                        }
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                            ttt.start();
                        }
                    }
                    upsc++;

                    int[] values = new int[2];
                    imgblue.getLocationOnScreen(values);

                    for (int iu = 0; iu < 56; iu++) {

                        if ((int) imgblue.getX() == b_x[iu] && (int) imgblue.getY() == b_y[iu]) {

                            bx1 = iu;
                            Thread thr = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        for (int ac = 0; ac < (diceno + 2); ac++) {
                                            bx2 = ac;
                                            Thread.sleep(400);
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    tokendirection(imgblue, b_x[bx1 + bx2], b_y[bx1 + bx2]);
                                                }
                                            });
                                        }
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                            thr.start();
                        }
                    }
                }
            }
        });
    }

    public void moveyellow(final int diceno, final ImageView imgyellow, final int xdir, final int ydir) {

        if ((int) imgyellow.getX() == xdir && (int) imgyellow.getY() == ydir)
        {
            if (diceno == 5)
            {
                imgyellow.startAnimation(blink());
            }
        }
        else
            {
            imgyellow.startAnimation(blink());
            if (new sqly1(twoplayers.this).show() + (diceno + 1) > 57)
            {
                if (yellow1.getAnimation() != null)
                {
                    yellow1.getAnimation().cancel();
                    yellow1.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
            if (new sqly2(twoplayers.this).show() + (diceno + 1) > 57)
            {
                if (yellow2.getAnimation() != null)
                {
                    yellow2.getAnimation().cancel();
                    yellow2.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
            if (new sqly3(twoplayers.this).show() + (diceno + 1) > 57)
            {
                if (yellow3.getAnimation() != null)
                {
                    yellow3.getAnimation().cancel();
                    yellow3.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
            if (new sqly4(twoplayers.this).show() + (diceno + 1) > 57)
            {
                if (yellow4.getAnimation() != null)
                {
                    yellow4.getAnimation().cancel();
                    yellow4.clearAnimation();
                    blink().setAnimationListener(null);
                }
            }
        }

        imgyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (imgyellow.getAnimation() == null)
                {
                    return;
                }
//                                               // Token1
//                    if (imgblue.getId() == blue1.getId()) {
//                        int yuio = 0;
//                        if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (yuio == 0) {
//                            blue1.setImageDrawable(getResources().getDrawable(R.drawable.tblue));
//                        }
//                        if (yuio == 1) {
//                            if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                            }
//                            if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            }
//                            if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            }
//                        }
//                        if (yuio == 2) {
//                            int po = 0; int po1=0;
//                            if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                            }
//                            if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                                po1 = 1;
//                            }
//                            if (new sqlb1(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                                po = 2;
//                            }
//                            if (po == 2) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                                if(po1==1){
//                                    blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3)); }else {
//                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                                }
//                            } else {
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                            }
//                        }
//                        if (yuio == 3) {
//                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                        }
//                    }
//                                                            // Token2
//                    if (imgblue.getId() == blue2.getId()) {
//                        int yuio = 0;
//                        if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (yuio == 0) {
//                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                        }
//                        if (yuio == 1) {
//                            if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                            }
//                            if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            }
//                            if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            }
//                        }
//                        if (yuio == 2) {
//                            int po = 0; int po1=0;
//                            if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                            }
//                            if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                                po1 = 1;
//                            }
//                            if (new sqlb2(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                                po = 2;
//                            }
//                            if (po == 2) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                                if(po1==1){
//                                    blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3)); }else {
//                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                                }
//                            } else {
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                            }
//                        }
//                        if (yuio == 3) {
//                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                        }
//                    }
//                                                            // TOKEN3
//                    if (imgblue.getId() == blue3.getId()) {
//                        int yuio = 0;
//                        if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (yuio == 0) {
//                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                        }
//                        if (yuio == 1) {
//                            if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            }
//                            if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            }
//                            if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            }
//                        }
//                        if (yuio == 2) {
//                            int po = 0; int po1=0;
//                            if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                            }
//                            if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                                po1 = 1;
//                            }
//                            if (new sqlb3(MainActivity.this).show() + (diceno + 1) == new sqlb4(MainActivity.this).show()) {
//                                po = 2;
//                            }
//                            if (po == 2) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                                if(po1==1){
//                                    blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3)); }else {
//                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                                }
//                            } else {
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                                blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                            }
//                        }
//                        if (yuio == 3) {
//                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                        }
//                    }
//                                                            //TOKEN4
//                    if (imgblue.getId() == blue4.getId()) {
//                        int yuio = 0;
//                        if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                            yuio++;
//                        }
//                        if (yuio == 0) {
//                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                        }
//                        if (yuio == 1) {
//                            if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            }
//                            if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            }
//                            if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            }
//                        }
//                        if (yuio == 2) {
//                            int po = 0; int po1=0;
//                            if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb1(MainActivity.this).show()) {
//                            }
//                            if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb2(MainActivity.this).show()) {
//                                po1 = 1;
//                            }
//                            if (new sqlb4(MainActivity.this).show() + (diceno + 1) == new sqlb3(MainActivity.this).show()) {
//                                po = 2;
//                            }
//                            if (po == 2) {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                                blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            } else {
//                                blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                                if(po1==1){
//                                    blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));} else {
//                                    blue1.setImageDrawable(getResources().getDrawable(R.drawable.tblue));
//                                }
//                            }
//                        }
//                        if (yuio == 3) {
//                            blue4.setImageDrawable(getResources().getDrawable(R.drawable.tblue4));
//                            blue3.setImageDrawable(getResources().getDrawable(R.drawable.tblue3));
//                            blue2.setImageDrawable(getResources().getDrawable(R.drawable.tblue2));
//                        }
//                    }
//                int loc[] = new int[2];
//                id201.getLocationOnScreen(loc);
                if (yellow1.getAnimation() != null)
                {
                    yellow1.getAnimation().cancel();
                    yellow1.clearAnimation();
                    blink().setAnimationListener(null);
                }

                if (yellow2.getAnimation() != null)
                {
                    yellow2.getAnimation().cancel();
                    yellow2.clearAnimation();
                    blink().setAnimationListener(null);
                }

                if (yellow3.getAnimation() != null)
                {
                    yellow3.getAnimation().cancel();
                    yellow3.clearAnimation();
                    blink().setAnimationListener(null);
                }
                if (yellow4.getAnimation() != null)
                {
                    yellow4.getAnimation().cancel();
                    yellow4.clearAnimation();
                    blink().setAnimationListener(null);
                }

                if ((int) imgyellow.getX() == xdir && (int) imgyellow.getY() == ydir)
                {
                    if (diceno == 5)
                    {
                        tokendirection(imgyellow, (int) imgyellow.getX() - (isize * 3), rh + (isize * 1));
                    }
//                    else
//                    {
//                    }

                    y_x[1] = (int) imgyellow.getX() - (isize * 3);
                    y_y[1] = rh + (isize * 2);

                    y_x[2] = (int) imgyellow.getX() - (isize * 3);
                    y_y[2] = rh + (isize * 3);

                    y_x[3] = (int) imgyellow.getX() - (isize * 3);
                    y_y[3] = rh + (isize * 4);

                    y_x[4] = (int) imgyellow.getX() - (isize * 3);
                    y_y[4] = rh + (isize * 5);

                    y_x[5] = (int) imgyellow.getX() - (isize * 2);
                    y_y[5] = rh + (isize * 6);

                    y_x[6] = (int) imgyellow.getX() - (isize);
                    y_y[6] = rh + (isize * 6);

                    y_x[7] = (int) imgyellow.getX() + (isize * 0);
                    y_y[7] = rh + (isize * 6);

                    y_x[8] = (int) imgyellow.getX() + (isize);
                    y_y[8] = rh + (isize * 6);

                    y_x[9] = (int) imgyellow.getX() + (isize * 2);
                    y_y[9] = rh + (isize * 6);

                    y_x[10] = (int) imgyellow.getX() + (isize * 3);
                    y_y[10] = rh + (isize * 6);

                    y_x[11] = (int) imgyellow.getX() + (isize * 3);
                    y_y[11] = rh + (isize * 7);

                    y_x[12] = (int) imgyellow.getX() + (isize * 3);
                    y_y[12] = rh + (isize * 8);

                    y_x[13] = (int) imgyellow.getX() + (isize * 2);
                    y_y[13] = rh + (isize * 8);

                    y_x[14] = (int) imgyellow.getX() + (isize);
                    y_y[14] = rh + (isize * 8);

                    y_x[15] = (int) imgyellow.getX() + (isize * 0);
                    y_y[15] = rh + (isize * 8);

                    y_x[16] = (int) imgyellow.getX() - (isize);
                    y_y[16] = rh + (isize * 8);

                    y_x[17] = (int) imgyellow.getX() - (isize * 2);
                    y_y[17] = rh + (isize * 8);

                    y_x[18] = (int) imgyellow.getX() - (isize * 3);
                    y_y[18] = rh + (isize * 9);

                    y_x[19] = (int) imgyellow.getX() - (isize * 3);
                    y_y[19] = rh + (isize * 10);

                    y_x[20] = (int) imgyellow.getX() - (isize * 3);
                    y_y[20] = rh + (isize * 11);

                    y_x[21] = (int) imgyellow.getX() - (isize * 3);
                    y_y[21] = rh + (isize * 12);

                    y_x[22] = (int) imgyellow.getX() - (isize * 3);
                    y_y[22] = rh + (isize * 13);

                    y_x[23] = (int) imgyellow.getX() - (isize * 3);
                    y_y[23] = rh + (isize * 14);

                    y_x[24] = (int) imgyellow.getX() - (isize * 4);
                    y_y[24] = rh + (isize * 14);

                    y_x[25] = (int) imgyellow.getX() - (isize * 5);
                    y_y[25] = rh + (isize * 14);

                    y_x[26] = (int) imgyellow.getX() - (isize * 5);
                    y_y[26] = rh + (isize * 13);

                    y_x[27] = (int) imgyellow.getX() - (isize * 5);
                    y_y[27] = rh + (isize * 12);

                    y_x[28] = (int) imgyellow.getX() - (isize * 5);
                    y_y[28] = rh + (isize * 11);

                    y_x[29] = (int) imgyellow.getX() - (isize * 5);
                    y_y[29] = rh + (isize * 10);

                    y_x[30] = (int) imgyellow.getX() - (isize * 5);
                    y_y[30] = rh + (isize * 9);

                    y_x[31] = (int) imgyellow.getX() - (isize * 6);
                    y_y[31] = rh + (isize * 8);

                    y_x[32] = (int) imgyellow.getX() - (isize * 7);
                    y_y[32] = rh + (isize * 8);

                    y_x[33] = (int) imgyellow.getX() - (isize * 8);
                    y_y[33] = rh + (isize * 8);

                    y_x[34] = (int) imgyellow.getX() - (isize * 9);
                    y_y[34] = rh + (isize * 8);

                    y_x[35] = (int) imgyellow.getX() - (isize * 10);
                    y_y[35] = rh + (isize * 8);

                    y_x[36] = (int) imgyellow.getX() - (isize * 11);
                    y_y[36] = rh + (isize * 8);

                    y_x[37] = (int) imgyellow.getX() - (isize * 11);
                    y_y[37] = rh + (isize * 7);

                    y_x[38] = (int) imgyellow.getX() - (isize * 11);
                    y_y[38] = rh + (isize * 6);

                    y_x[39] = (int) imgyellow.getX() - (isize * 10);
                    y_y[39] = rh + (isize * 6);

                    y_x[40] = (int) imgyellow.getX() - (isize * 9);
                    y_y[40] = rh + (isize * 6);

                    y_x[41] = (int) imgyellow.getX() - (isize * 8);
                    y_y[41] = rh + (isize * 6);

                    y_x[42] = (int) imgyellow.getX() - (isize * 7);
                    y_y[42] = rh + (isize * 6);

                    y_x[43] = (int) imgyellow.getX() - (isize * 6);
                    y_y[43] = rh + (isize * 6);

                    y_x[44] = (int) imgyellow.getX() - (isize * 5);
                    y_y[44] = rh + (isize * 5);

                    y_x[45] = (int) imgyellow.getX() - (isize * 5);
                    y_y[45] = rh + (isize * 4);

                    y_x[46] = (int) imgyellow.getX() - (isize * 5);
                    y_y[46] = rh + (isize * 3);

                    y_x[47] = (int) imgyellow.getX() - (isize * 5);
                    y_y[47] = rh + (isize * 2);

                    y_x[48] = (int) imgyellow.getX() - (isize * 5);
                    y_y[48] = rh + (isize);

                    y_x[49] = (int) imgyellow.getX() - (isize * 5);
                    y_y[49] = rh - (isize * 0);

                    y_x[50] = (int) imgyellow.getX() - (isize * 4);
                    y_y[50] = rh + (isize * 0);

                    y_x[51] = (int) imgyellow.getX() - (isize * 4);
                    y_y[51] = rh + (isize);

                    y_x[52] = (int) imgyellow.getX() - (isize * 4);
                    y_y[52] = rh + (isize * 2);

                    y_x[53] = (int) imgyellow.getX() - (isize * 4);
                    y_y[53] = rh + (isize * 3);

                    y_x[54] = (int) imgyellow.getX() - (isize * 4);
                    y_y[54] = rh + (isize * 4);

                    y_x[55] = (int) imgyellow.getX() - (isize * 4);
                    y_y[55] = rh + (isize * 5);

                    y_x[56] = (int) imgyellow.getX() - (isize * 4);
                    y_y[56] = rh + (isize * 6);

                }
                else
                    {
                    //Thread
                    if (ypsc == 0)
                    {
                        Thread th = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    for (int yu = 0; yu < diceno + 1; yu++)
                                    {
                                        Thread.sleep(400);
                                        final int finalYu = yu + 1;
                                        runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                tokendirection(imgyellow, y_x[finalYu], y_y[(finalYu)]);
                                            }
                                        });
                                    }
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        th.start();
                    }
                    else
                        {
                        if ((int) imgyellow.getX() == y_x[1] && (int) imgyellow.getY() == y_y[1] + (isize))
                        {

                            Thread ttt = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        for (int yu = 0; yu < diceno + 1; yu++)
                                        {
                                            Thread.sleep(400);
                                            final int finalYu = yu + 1;
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    tokendirection(imgyellow, y_x[finalYu], y_y[(finalYu)]);
                                                }
                                            });
                                        }
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                            ttt.start();
                        }
                    }
                    ypsc++;

                    int[] values = new int[2];
                    imgyellow.getLocationOnScreen(values);

                    for (int iu = 0; iu < 56; iu++)
                    {

                        if ((int) imgyellow.getX() == y_x[iu] && (int) imgyellow.getY() == y_y[iu])
                        {

                            yx1 = iu;
                            Thread thr = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        for (int ac = 0; ac < (diceno + 2); ac++)
                                        {
                                            yx2 = ac;
                                            Thread.sleep(400);
                                            runOnUiThread(new Runnable() {
                                                @Override
                                                public void run() {
                                                    tokendirection(imgyellow, y_x[yx1 + yx2], y_y[yx1 + yx2]);
                                                }
                                            });
                                        }
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                            thr.start();
                        }
                    }
                }
            }
        });

    }

}