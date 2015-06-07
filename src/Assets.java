import java.awt.image.BufferedImage;


public class Assets {

	private static final int width = 85, height = 111;
	public static BufferedImage player1, enemy1, platform,
	platform2,
	platform3,
	platform4,
	platform5,
	platform6,
	platform7,
	platform8,
	platform9,
	platform10,
	platform11,
	platform12,
	platform13,
	platform30, p1down,p1downLeft,p1down2,p1down2Left,p1downWalk,p1downWalkLeft,p1downWalk2,
	p1downWalk2Left,p1jump,p1jumpLeft,p2jump,p1jump2Left,
	p1walkr1,p1walkl1,
	p1walkr2,p1walkl2,
	p1walkr3,p1walkl3,
	p1walkr4,p1walkl4,
	p1walkr5,p1walkl5,
	p1walkr6,p1walkl6,
	p1walkr7,p1walkl7,
	p1walkr8,p1walkl8,
	p1walkr9,p1walkl9,
	p1walkr10,p1walkl10,
	shootright, shootleft,
	stanceR, stance_left,
	bulletR, bulletL,
	
	//BATMAN SPRITES
	batman_stance, batman_stanceL,
	batmanKick1_1,batmanKick1_2,batmanKick1_3,
	batmanKick1_1L,batmanKick1_2L,batmanKick1_3L,
	batmanPunch1_1,batmanPunch1_2,batmanPunch1_3,
	batmanPunch1_1L,batmanPunch1_2L,batmanPunch1_3L,
	batmanKick2_1,batmanKick2_2,batmanKick2_3, batmanKick2_4,batmanKick2_5,
	batmanKick2_1L,batmanKick2_2L,batmanKick2_3L, batmanKick2_4L,batmanKick2_5L,
	batmanJump_1, batmanJump_2, batmanJump_1L, batmanJump_2L,
	batmanDuck_1, batmanDuck_2, batmanDuck_1L, batmanDuck_2L, 
	batmanWalk1,batmanWalk2,batmanWalk3,batmanWalk4,batmanWalk5,
	batmanWalk1L,batmanWalk2L,batmanWalk3L,batmanWalk4L,batmanWalk5L,
	hit1, hit2, hit3, hit4, hit1L, hit2L, hit3L, hit4L,
	batmanBulletR, batmanBulletL, 
	shoot1, shoot2, shoot3, shoot4, shoot5,
	shoot1L, shoot2L, shoot3L, shoot4L, shoot5L;
	
	
	public static void init(){
		
		SpreedSheet all = new SpreedSheet(ImageLoader.loadImage("textures/All_Sprites.png"));
		SpreedSheet sheet = new SpreedSheet(ImageLoader.loadImage("textures/halo_sprites.jpg"));
		SpreedSheet sheet2 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map1.png"));
		SpreedSheet sheet3 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map1_inverted.png"));
		
		SpreedSheet sheet4 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map2.png"));
		SpreedSheet sheet5 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map2_inverted.png"));

		
		SpreedSheet sheet6 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map3.png"));
		SpreedSheet sheet7 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map3_inverted.png"));
		
		SpreedSheet sheet8 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map4.png"));
		SpreedSheet sheet9 = new SpreedSheet(ImageLoader.loadImage("textures/halo_map4_inverted.png"));
		
		
		SpreedSheet sheet10 = new SpreedSheet(ImageLoader.loadImage("textures/halo_ground_flat.png"));
		SpreedSheet sheet11 = new SpreedSheet(ImageLoader.loadImage("textures/halo_ground_step.png"));
		SpreedSheet sheet12 = new SpreedSheet(ImageLoader.loadImage("textures/halo_ground_2step.png"));
		SpreedSheet sheet30 = new SpreedSheet(ImageLoader.loadImage("textures/halo_sky_full.png"));
		
		
		//MASTERCHIEF:
		SpreedSheet p1_down = new SpreedSheet(ImageLoader.loadImage("textures/down1.png"));
		SpreedSheet p1_downLeft = new SpreedSheet(ImageLoader.loadImage("textures/down1_left.png"));
		
		SpreedSheet p1_down2 = new SpreedSheet(ImageLoader.loadImage("textures/down2.png"));
		SpreedSheet p1_down2Left = new SpreedSheet(ImageLoader.loadImage("textures/down2_left.png"));
		
		SpreedSheet p1_downWalk = new SpreedSheet(ImageLoader.loadImage("textures/halo_down_walk1.png"));
		SpreedSheet p1_downWalkLeft = new SpreedSheet(ImageLoader.loadImage("textures/halo_down_walk1_left.png"));
		
		SpreedSheet p1_downWalk2 = new SpreedSheet(ImageLoader.loadImage("textures/halo_down_walk2.png"));
		SpreedSheet p1_downWalk2Left = new SpreedSheet(ImageLoader.loadImage("textures/halo_down_walk2_left.png"));
		
		SpreedSheet p1_jump = new SpreedSheet(ImageLoader.loadImage("textures/jump1.png"));
		SpreedSheet p1_jumpLeft = new SpreedSheet(ImageLoader.loadImage("textures/jump1_left.png"));
		
		SpreedSheet p1_jump2 = new SpreedSheet(ImageLoader.loadImage("textures/jump2.png"));
		SpreedSheet p1_jump2Left = new SpreedSheet(ImageLoader.loadImage("textures/jump2_left.png"));
		
		SpreedSheet p1_walkr1 = new SpreedSheet(ImageLoader.loadImage("textures/right1.png"));
		SpreedSheet p1_walkl1 = new SpreedSheet(ImageLoader.loadImage("textures/left1.png"));
		
		SpreedSheet p1_walkr2 = new SpreedSheet(ImageLoader.loadImage("textures/right2.png"));
		SpreedSheet p1_walkl2 = new SpreedSheet(ImageLoader.loadImage("textures/left2.png"));
		
		SpreedSheet p1_walkr3 = new SpreedSheet(ImageLoader.loadImage("textures/right3.png"));
		SpreedSheet p1_walkl3 = new SpreedSheet(ImageLoader.loadImage("textures/left3.png"));
		
		SpreedSheet p1_walkr4 = new SpreedSheet(ImageLoader.loadImage("textures/right4.png"));
		SpreedSheet p1_walkl4 = new SpreedSheet(ImageLoader.loadImage("textures/left4.png"));
		
		SpreedSheet p1_walkr5 = new SpreedSheet(ImageLoader.loadImage("textures/right5.png"));
		SpreedSheet p1_walkl5 = new SpreedSheet(ImageLoader.loadImage("textures/left5.png"));
		
		SpreedSheet p1_walkr6 = new SpreedSheet(ImageLoader.loadImage("textures/right6.png"));
		SpreedSheet p1_walkl6 = new SpreedSheet(ImageLoader.loadImage("textures/left6.png"));
		
		SpreedSheet p1_walkr7 = new SpreedSheet(ImageLoader.loadImage("textures/right7.png"));
		SpreedSheet p1_walkl7 = new SpreedSheet(ImageLoader.loadImage("textures/left7.png"));
		
		
		SpreedSheet p1_walkr8 = new SpreedSheet(ImageLoader.loadImage("textures/right8.png"));
		SpreedSheet p1_walkl8 = new SpreedSheet(ImageLoader.loadImage("textures/left8.png"));
		
		SpreedSheet p1_walkr9 = new SpreedSheet(ImageLoader.loadImage("textures/right9.png"));
		SpreedSheet p1_walkl9 = new SpreedSheet(ImageLoader.loadImage("textures/left9.png"));
		
		SpreedSheet p1_walkr10 = new SpreedSheet(ImageLoader.loadImage("textures/right2.png"));
		SpreedSheet p1_walkl10 = new SpreedSheet(ImageLoader.loadImage("textures/left2.png"));
		
		SpreedSheet p1_shootL = new SpreedSheet(ImageLoader.loadImage("textures/shoot_left.png"));
		SpreedSheet p1_shootR = new SpreedSheet(ImageLoader.loadImage("textures/shoot_right.png"));
		
		SpreedSheet p1_stanceR = new SpreedSheet(ImageLoader.loadImage("textures/stance.png"));
		SpreedSheet p1_stanceL = new SpreedSheet(ImageLoader.loadImage("textures/stance_left.png"));
		
		player1 = p1_stanceR.crop(0, 0, width, height);
		p1down = p1_down.crop(0,0, width, height);
		p1downLeft = p1_downLeft.crop(0,0, width, height);
		p1down2 = p1_down2.crop(0,0, width, height);
		p1down2Left = p1_down2Left.crop(0,0, width, height);
		p1downWalk = p1_downWalk.crop(0,0, width, height);
		p1downWalkLeft = p1_downWalkLeft.crop(0,0, width, height);
		p1downWalk2 = p1_downWalk2.crop(0,0, width, height);
		p1downWalk2Left = p1_downWalk2Left.crop(0,0, width, height);
		p1jump = p1_jump.crop(0,0, width, height);
		p1jumpLeft = p1_jumpLeft.crop(0,0, width, height);
		p2jump = p1_jump2.crop(0,0, width, height);
		p1jump2Left = p1_jump2Left.crop(0,0, width, height);
		p1walkr1 = p1_walkr1.crop(0,0, width, height);
		p1walkl1 = p1_walkl1.crop(0,0, width, height);
		p1walkr2 = p1_walkr2.crop(0,0, width, height);
		p1walkl2 = p1_walkl2.crop(0,0, width, height);
		p1walkr3 = p1_walkr3.crop(0,0, 78, 114);
		p1walkl3 = p1_walkl3.crop(0,0, 78, 114);
		p1walkr4 = p1_walkr4.crop(0,0, 80, 114);
		p1walkl4 = p1_walkl4.crop(0,0, 80, 114);
		p1walkr5 = p1_walkr5.crop(0,0, width, height);
		p1walkl5 = p1_walkl5.crop(0,0, width, height);
		p1walkr6 = p1_walkr6.crop(0,0, width, height);
		p1walkl6 = p1_walkl6.crop(0,0, width, height);
		p1walkr7 = p1_walkr7.crop(0,0, width, height);
		p1walkl7 = p1_walkl7.crop(0,0, width, height);
		p1walkr8 = p1_walkr8.crop(0,0, width, height);
		p1walkl8 = p1_walkl8.crop(0,0, width, height);
		p1walkr9 = p1_walkr9.crop(0,0, width, height);
		p1walkl9 = p1_walkl9.crop(0,0, width, height);
		p1walkr10 = p1_walkr10.crop(0,0, width, height);
		p1walkl10 = p1_walkl10.crop(0,0, width, height);
	
		shootright = p1_shootR.crop(0,0, 114, 114);
		shootleft = p1_shootL.crop(0,0, 114, 114);
		stanceR = p1_stanceR.crop(0,0, width, height);
		stance_left = p1_stanceL.crop(0,0, width, height);
		
		bulletR = all.crop(17, 47, 15, 19);
		bulletL = all.crop(17,16,17,17);
		
		platform = sheet2.crop(0, 0, 920, 1125);
		platform2 = sheet3.crop(0, 0, 920, 1125);
		platform3 = sheet4.crop(0, 0, 920, 1125);
		platform4 = sheet5.crop(0, 0, 920, 1125);
		platform5 = sheet6.crop(0, 0, 920, 1125);
		platform6 = sheet7.crop(0, 0, 920, 1125);
		platform7 = sheet8.crop(0, 0, 920, 1125);
		platform8 = sheet9.crop(0, 0, 920, 1125);
		platform9 = sheet10.crop(0, 0, 920, 1125);
		platform10 = sheet11.crop(0, 0, 920, 1125);
		platform11 = sheet12.crop(0, 0, 920, 1125);
		

		platform30 = sheet30.crop(0, 0, 920, 1125);
		//put all sprites needed in one sheet and figure out the coordinates.
		//HERE IS WHERE I CAN USE CROP IMAGES OUT OF THE SPREADSHEAT AND DESIGN A MAP WITH THEM
		
		
		batman_stance = all.crop(35,2,55,95);
		batman_stanceL = all.crop(90,3,62,95);
		batmanKick1_1 = all.crop(3,100,58,98);
		batmanKick1_2 = all.crop(68,100,70,95);
		batmanKick1_3 = all.crop(137,97,96,93);
		batmanKick1_1L = all.crop(175,205,58,98);
		batmanKick1_2L = all.crop(101,204,68,96);
		batmanKick1_3L = all.crop(3,202,95,92);
		batmanPunch1_1 = all.crop(7,310,58,98);
		batmanPunch1_2 = all.crop(78,305,80,96);
		batmanPunch1_3 = all.crop(155,308,107,91);
		batmanPunch1_1L = all.crop(205,415,59,98);
		batmanPunch1_2L = all.crop(110,415,79,91);
		batmanPunch1_3L = all.crop(3,413,109,93);	
		batmanKick2_1 = all.crop(15,528,67,89);
		batmanKick2_2 = all.crop(88,524,78,88);
		batmanKick2_3 = all.crop(166,517,88,99);
		batmanKick2_4 = all.crop(252,518,90,98);
		batmanKick2_5 = all.crop(348,517,54,97);
		batmanKick2_1L = all.crop(325,630,68,92);
		batmanKick2_2L = all.crop(242,630,79,88);
		batmanKick2_3L = all.crop(154,620,83,101);
		batmanKick2_4L = all.crop(64,624,91,96);
		batmanKick2_5L = all.crop(4,624,55,95);
		batmanJump_1 = all.crop(6,735,53,100);
		batmanJump_2 = all.crop(58,726,57,137);
		batmanJump_2L = all.crop(124,725,56,134);
		batmanJump_1L = all.crop(179,735,54,99);
		batmanDuck_1 = all.crop(241,729,67,95);
		batmanDuck_2 = all.crop(309,747,78,73);
		batmanDuck_1L = all.crop(2,876,72,75);
		batmanDuck_2L = all.crop(73,865,74,88);
		batmanWalk1 = all.crop(9,957,78,94);
		batmanWalk2 = all.crop(94,951,67,96);
		batmanWalk3 = all.crop(165,952,62,95);
		batmanWalk4 = all.crop(233,952,63,97);
		batmanWalk5 = all.crop(296,956,71,96);
		batmanWalk1L = all.crop(300,1061,75,93);
		batmanWalk2L = all.crop(224,1053,67,98);
		batmanWalk3L = all.crop(157,1053,64,99);
		batmanWalk4L = all.crop(89,1056,62,98);
		batmanWalk5L = all.crop(18,1055,70,100);
		hit1 = all.crop(172,7,68,92);
		hit2 = all.crop(245,5,68,94);
		hit3 = all.crop(315,19,99,58);
		hit4 = all.crop(420,33,115,41);
		hit1L = all.crop(528,117,66,94);
		hit2L =  all.crop(452,113,67,97);
		hit3L = all.crop(350,127,100,62);
		hit4L = all.crop(235,145,111,39);
		batmanBulletR = all.crop(662,252,55,21);
		batmanBulletL = all.crop(268,357,55,26);
		shoot1 = all.crop(289,215,66,99);
		shoot2 = all.crop(357,218,58,93);
		shoot3 = all.crop(415,218,89,94);
		shoot4 = all.crop(501,219,96,92);
		shoot5 = all.crop(599,213,59,97);
		shoot1L = all.crop(631,323,59,98);
		shoot2L = all.crop(570,324,58,96);
		shoot3L = all.crop(480,328,88,91);
		shoot4L = all.crop(386,324,95,95);
		shoot5L = all.crop(325,325,62,95);
		
		
	}

}
