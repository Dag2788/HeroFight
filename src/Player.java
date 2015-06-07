import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class Player extends Creature {

	Controller controller;
	public double counter2 = 4;
	Animation animLeft;
	Animation animRight;
	Animation animJumpLeft;
	Animation animJumpRight;
	Animation animKneelWalkLeft;
	Animation animKneelWalkRight;
	Animation kneel;
	Animation kneel_Left;
	private boolean lookingLeft = false;
	private boolean moving = false;
	public boolean  is_shooting = false;
	public boolean is_jumping = false;
	public Player(GameLoop game, float x, float y) {
		super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		animLeft = new Animation(3, Assets.p1walkl1 , Assets.p1walkl2, Assets.p1walkl3, Assets.p1walkl4,Assets.p1walkl5,Assets.p1walkl6,Assets.p1walkl7,Assets.p1walkl8,Assets.p1walkl9);
		 animRight = new Animation(3, Assets.p1walkr1,Assets.p1walkr2,Assets.p1walkr3,Assets.p1walkr4,Assets.p1walkr5,Assets.p1walkr6,Assets.p1walkr7,Assets.p1walkr8,Assets.p1walkr9);
		 animJumpLeft = new Animation(3, Assets.p1jumpLeft,Assets.p1jump2Left,Assets.p1downLeft);
		 animJumpRight = new Animation(3, Assets.p1jump, Assets.p2jump, Assets.p1down);
		 animKneelWalkLeft = new Animation(3, Assets.p1downWalkLeft, Assets.p1downWalk2Left);
		 animKneelWalkRight = new Animation(3, Assets.p1downWalk, Assets.p1downWalk2);
		 kneel = new Animation(3, Assets.p1down, Assets.p1down2);
		 kneel_Left = new Animation (3, Assets.p1downLeft, Assets.p1down2Left);
	}

	@Override
	public void tick() {
		getInput();
		move();
		game.getGameCamara().centerOnEntity(this);
		
		//System.out.println("coordinates: " + this.x + " " + this.y);
		
		
		//BOUNDS AND GRAVITY
		if (this.x >= 6845){
			this.x = 6845;
		}
		if (this.x <= 452){
			this.x = 452;
		}
		if (this.y >= 7424){
			this.y = 7424;
		}
		
		if (this.y <= 7424 && game.getKeyManager().up != true){
			
			
			if( (x >= 1352 && x <= 1742) && (y >= 288 && y<= 366) ){
				if(y >= 366)
					y = 366;
			}
			else if( (x >= 1910 && x <= 2234) && (y >= 384 && y <= 468) ){
				if(y >= 468)
					y = 468;
			}
			else if(( x >= 1376 && x <= 1778) && (y >= 798 && y<= 864) ){
				if(y >= 864)
					y = 864;
			}
			else if( (x >= 2282 && x <= 2666) && (y >= 732 && y <= 798) ){
				if(y >= 798)
					y = 798;
			}
			else if( (x >= 2726 && x <= 2894) && (y >= 606 && y <= 672) ){
				if(y >= 671)
					y = 671;
				if(x >= 2888)
					x = 2888;
			}
			else if( (x >= 2918 && x <= 3047) && (y >= 510 && y <= 582) ){
				if(y >= 581)
					y = 581;
				if(x >= 3040)
					x = 3040;
			}
			else if( (x >= 3062 && x <= 3177) && ( y >= 414 && y <= 486) ){
				if(y >= 480)
					y = 480;
				if(x >= 3170)
					x = 3170;
			}
			///
			else if( (x >= 3224 && x <= 3620) && (y >= 792 && y <= 858) ){
				if(y >= 855)
					y = 855;
				
			}
			else if( (x >= 4118 && x <= 4520) && ( y >= 726 && y<= 798)  ){
				if(y >= 794)
					y = 794;
				
			}
			else if( (x >= 4580 && x <= 4740) && (y >= 600 && y<= 660) ){
				if(y >= 658)
					y = 658;
				if(x >= 4727)
					x = 4727;
			}
			else if( (x >= 4754 && x <= 4890) && (y >= 510 && y <= 570)){
				if(y >= 567)
					y = 567;
				if(x >= 4883)
					x = 4883;
			}
			else if( (x >= 4910 && x <= 5029) && (y >= 420 && y<= 486) ){
				if(y >= 482)
					y = 482;
				if(x >= 5022)
					x = 5022;
			}
			else if(( x >= 5066 && x <= 5468) && (y >= 792 && y <= 864) ){
				if(y >= 860)
					y = 860;
				
			}
			else if( (x >= 1358 && x <= 1754) && (y >= 1464 && y <= 1542 )){
				if(y >= 1538)
					y = 1538;
				
			}
			else if( (x >= 1076 && x <= 1360) && (y >= 1548 && y<= 1614)){
				if(y >= 1610)
					y = 1610;
				if(x >= 1346)
					x = 1346;
			}
			else if( (x >= 902 && x <= 1082) && (y >= 1650 && y <= 1716)){
				if(y >= 1710)
					y = 1710;
				if(x >= 1076)
					x = 1076;
			}
			else if( (x >= 1850 && x <= 2234) && (y >= 1478 && y <=1538) ){
				if(y >= 1534)
					y = 1534;
				
			}
			else if( (x >= 1076 && x <= 1205) && (y >= 504 && y<= 582)){ // second modify
				if(x >= 1190){
					x = 1190;
				}
				if(y >= 579){
					y = 579;
				}
			}
			else if( (x >= 2240 && x <= 2510) && (y >= 1544 && y <= 1622) ){
				if(y >= 1618)
					y = 1618;
				if(x <= 2252)
					x = 2252;
			}
			else if( (x >= 2490 && x <= 2684) && (y >= 1652 && y <= 1730)){
				if(y >= 1726)
					y = 1726;
				if(x <=2510 )
					x = 2510;
			}
			else if( (x >= 1220 && x <= 1340) && (y >= 414 && y <= 486) ){
				if(x >= 1334)
					x=1334;
				if(y >= 486)
					y=468;
			}
			else if( (x >= 3212 && x <= 3566) && ( y >= 1262 && y <= 1328) ){
				if(y >= 1325)
					y = 1325;
				
			}
			else if(( x >= 2738 && x <= 3104) && (y >= 1760 && y <= 1814) ){
				if(y >= 1810)
					y = 1810;
				
			}
			else if( ( x >= 3674 && x <= 4082) && (y >= 1250 && y <= 1322) ){
				if(y >= 1318)
					y = 1318;
			}
			else if( ( x >= 4160 && x <= 4544) && (y >= 1748 && y <= 1814) ){
				if(y >= 1810)
					y = 1810;
			}
			else if(( x >= 4568 && x <= 4940) && (y >= 1916 && y <= 1994)){
				if(y >= 1990)
					y = 1990;
			}
			else if( ( x >= 4610 && x <= 5000) && (y >= 1412 && y <= 1490) ){
				if(y >= 1486)
					y = 1486;
			}
			else if(( x >= 4990 && x <= 5138) && (y >= 1550 && y <= 1610) ){
				if(y >= 1606)
					y = 1606;
				if(x <= 5006)
					x = 5006;
			}
			else if( ( x >= 5831 && x <= 5960) && (y >= 1544 && y <= 1616) ){
				if(y >= 1612)
					y = 1612;
				if(x >= 5939)
					x = 5939;
			}
			else if( ( x >= 5957 && x <= 6335) && (y >= 1424 && y <= 1484) ){
				if(y >= 1480)
					y = 1480;
			}
			else if( ( x >= 5987 && x <= 6377) && (y >= 1922 && y <= 1976)){
				if(y >= 1972)
					y = 1972;
			}
			else if(( x >= 5120 && x <= 5288) && (y >= 1634 && y <= 1706) ){
				if(y >= 1702)
					y = 1702;
				if(x <= 5138)
					x = 5138;
			}
			else if( (x >= 890 && x <= 1075) && (y >= 594 && y<= 675) ){ //just checked this
				if( x >= 1064){
					x = 1064;  //my attempt for the wall
				}
				if( y >= 665){
					y = 655;
				}
			}
			else if( (x >= 5264 && x <= 5456) && (y >= 1730 && y<= 1796) ){
				if( x <= 5288){
					x = 5288;  //my attempt for the wall
				}
				if( y >= 1792){
					y = 1792;
				}
			}
			else if( (x >= 5495 && x <= 5685) && (y >= 1736 && y<= 1790)){
				if( x >= 5669){
					x = 5669;  //my attempt for the wall
				}
				if( y >= 1786){
					y = 1786;
				}
				
			}
			else if( (x >= 5681 && x <= 5819) && (y >= 1634 && y<= 1706) ){
				if( x >= 5795){
					x = 5795;  //my attempt for the wall
				}
				if( y >= 1702){
					y = 1702;
				}
			}
			else if((x >= 914 && x <= 1322) && (y >= 2600 && y<= 2670) ){
				if( y <= 2662){
					y = 2662;
				}
			}
			else if( (x >= 1304 && x <= 1610) && (y >= 2678 && y<= 2750) ){
				if( x <= 1328 ){
					x = 1328;  //my attempt for the wall
				}
				if( y >= 2746){
					y = 2746;
				}
			}
			else if( (x >= 1575 && x <= 1778) && (y >= 2780 && y<= 2858)){
				if( x <= 1598 ){
					x = 1598;  //my attempt for the wall
				}
				if( y >= 2854){
					y = 2854;
				}
			}
			else if( (x >= 1376 && x <= 1748) && (y >= 3494 && y <= 3578)){
				if( y >= 3574){
					y = 3574;
				}
			}
			else if( (x >= 902 && x <= 1268) && (y >= 3998 && y <= 4064) ){
				if( y >= 4060){
					y = 4060;
				}
			}
			else if( (x >= 1340 && x <= 1736) && (y >= 5927 && y <= 5990) ){
				if( y >= 5986){
					y = 5986;
				}
			}
			else if( (x >= 1202 && x <= 1364) && (y >= 6044 && y <= 6110) ){
				if( y >= 6106){
					y = 6106;
				}
				if( x >= 1340){
					x = 1340;
				}
			}
			else if( (x >= 1064 && x <= 1225) && (y >= 6140 && y <= 6202)){
				if( y >= 6198){
					y = 6198;
				}
				if( x >= 1208){
					x = 1208;
				}
			}
			else if( (x >= 884 && x <= 1085) && (y >= 6224 && y <= 6290) ){
				if( y >= 6286){
					y = 6286;
				}
				if( x >= 1052){
					x = 1052;
				}
			}
			else if( (x >= 1388 && x <= 1772) && (y >= 6410 && y <= 6488)){
				
				if( y >= 6484){
					y = 6484;
				}
			}
			else if((x >= 1826 && x <= 2000) && (y >= 2848 && y <= 2914)){
				if( x >= 1976)
					x = 1976;
			}
			else if( (x >= 2000 && x <= 2138) && (y >= 2758 && y <= 2842) ){
				if ( x >= 2120)
					x = 2120;
			}
			else if((x >= 2144 && x <= 2275) && (y >= 2674 && y <= 2740) ){
				if (x >= 2258)
					x = 2258;
			}
			else if((x >= 2270 && x <= 2666) && (y >= 2555 && y <= 2602)){
				if(y >= 2600){
					y = 2600;
				}
				
			}
			else if( (x >= 2312 && x <= 2702) && (y >= 3052 && y <= 3118)){
				if (y>= 3118){
					y = 3118;
				}
				
			}
			else if((x >= 2282 && x <= 2642) && (y >= 5764 && y <= 5836) ){
				if(y >= 5834){
					y = 5834;
				}
				
			}
			else if( (x >= 1808 && x <= 2174) && (y >= 6250 && y <= 6322) ){
				if (y >= 6320)
					y = 6320; 
				
			}
			else if( (x >= 3230 && x <= 3596) && (y >= 2374 && y <= 2446) ){
			if ( y >= 2446)
				y = 2446;
			}
			else if( (x >= 2804 && x <= 3176) && (y >= 2636 && y <= 2710) ){
			 if ( y >= 2710)
				 y = 2710;
			}
			
			//
			else if( (x >= 3212 && x <= 3590) && (y >= 2986 && y <= 3052)){
				if( y>= 3052)
					y = 3052;
			}
			else if((x >= 2756 && x <= 3104) && (y >= 6412 && y <= 6490) ){
				if ( y>= 6490)
					y = 6490;
			}
			else if( (x >= 3728 && x <= 4022) && (y >= 2536 && y <= 2626)){
				if( y>= 2626)
					y = 2626;
			}
			else if( (x >= 4064 && x <= 4184) && (y >= 2662 && y <= 2740) ){
				if( y>= 2740)
					y = 2740;
				if ( x <= 4088)
					x = 4088;
			}
			else if( (x >= 3224 && x <= 3590) && (y >= 3496 && y <= 3574) ){ //22
				if( y>= 3574)
					y = 3574;
			}
			else if( (x >= 2732 && x <= 3098) && (y >= 3994 && y <= 4072)){
				if ( y >= 4072)
					y = 4072;
			}
			else if( (x >= 2804 && x <= 3134) && (y >= 5920 && y <= 5992)){
				if( y>= 5992)
					y = 5992;
			}
			else if( (x >= 3704 && x <= 4064) && (y >= 5746 && y <= 5824)){
				if( y>= 5824)
					y = 5824;
			}
			else if((x >= 3668 && x <= 4028) && (y >= 3046 && y <= 3118)){
				if(y >= 3118)
					y = 3118;
			}
			else if( (x >= 4208 && x <= 4322) && (y >= 2752 && y <= 2830) ){
				if( y>= 2830)
					y = 2830;
				if (x <= 4232)
					x = 4232;
			}
			else if( (x >= 3146 && x <= 3272) && (y >= 6046 && y <= 6109)){
				if( y>= 6190)
					y = 6190;
				if (x <= 3176)
					x = 3176;
			}
			else if( (x >= 3284 && x <= 3404) && (y >= 6130 && y <= 6202) ){
				if( y>= 6202)
					y = 6202;
				if (x <= 3314)
					x = 3314;
			}
			else if((x >= 3440 && x <= 3620) && (y >= 6238 && y <= 6298) ){
				if( y>= 6298)
					y = 6298;
				if (x <= 3452)
					x = 3453;
			}
			else if( (x >= 4172 && x <= 4514) && (y >= 6244 && y <= 6322) ){
				if ( y >= 6322)
					y = 6322;
			}
			else if( (x >= 4360 && x <= 4514) && (y >= 2860 && y <= 2914) ){
				if( y>= 2914)
					y = 2914;
				if (x <= 4388)
					x = 4388;
				
			}
			else if( (x >= 4628 && x <= 4970) && (y >= 2596 && y <= 2662) ){
				if ( y >= 2662)
					y = 2662;
			}
			else if( (x >= 4982 && x <= 5252) && (y >= 2674 && y <= 2746) ){
				if( y>= 2746)
					y = 2746;
				if (x <= 5012)
					x = 5012;
			}
			else if(  (x >= 5270 && x <= 5438) && (y >= 2770 && y <= 2848)){
				if( y>= 2848)
					y = 2848;
				if (x <= 5294)
					x = 5294;
			}
			else if( (x >= 5528 && x <= 5684) && (y >= 2770 && y <= 2854)){
				if( y>= 2854)
					y = 2854;
				if (x >= 5660)
					x = 5660;
			}
			else if( (x >= 5708 && x <= 5966) && (y >= 2674 && y <= 2752) ){
				if( y>= 2752)
					y = 2752;
				if (x >= 5936)
					x = 5936;
			}
			else if((x >= 5978 && x <= 6332) && (y >= 2590 && y <= 2668) ){
				if ( y>= 2668)
					y = 2668;
			}
			else if( (x >= 5072 && x <= 5396) && (y >= 3508 && y <= 3586) ){
				if ( y >= 3586)
					y = 3586;
			}
			else if( (x >= 4586 && x <= 4934) && (y >= 4000 && y <= 4072) ){
				if( y>= 4072)
					y = 4072;
			}
			else if( (x >= 5078 && x <= 5384) && (y >= 5908 && y <= 5992) ){
				if( y>= 5992)
					y = 5992;
			}
			else if( (x >= 4934 && x <= 5035) && (y >= 6052 && y <= 6112) ){
				if( y>= 6112)
					y = 6112;
				if (x >= 5018)
					x = 5018;
			}
			else if(( x >= 4784 && x <= 4895) && (y >= 6142 && y <= 6202)){
				if( y>= 6202)
					y = 6202;
				if (x >= 4874)
					x = 4874;
			}
			else if( ( x >= 4598 && x <= 4758) && (y >= 6232 && y <= 6298) ){
				if( y>= 6298)
					y = 6298;
				if (x >= 4736)
					x = 4736;
			}
			else if( ( x >= 5108 && x <= 5450) && (y >= 6430 && y <= 6478)){
				if( y >= 6478)
					y = 6578;
			}
			else if( ( x >= 5540 && x <= 5858) && (y >= 6250 && y <= 6328)){
				if (y >= 6328)
					y = 6328;
			}
			else if(( x >= 452 && x <= 584) && (y >= 7278 && y <=7370)){
				if (y >=7370 )
					y = 7370;
			}
			else if( (x >= 890 && x <= 1256) && (y >= 7298 && y <= 7364 )){
				if (y >=7364 )
					y = 7364;
			}
			else if( (x >= 1418 && x <= 1784) && (y >= 7298 && y <= 7364 ) ){
				if (y >= 7364)
					y = 7364;
			}
			else if((x >= 2072 && x <= 2420) && (y >= 7304 && y <= 7370 )){
				if ( y>= 7370)
					y = 7370;
			}
			else if( (x >= 2756 && x <= 3116) && (y >= 7304 && y <= 7364 ) ){
				if (y >= 7364)
					y = 7364;
			}
			else if( (x >= 3266 && x <= 4022) && (y >= 7310 && y <= 7370 )  ){
				if (y >= 7370)
					y = 7370;
			}
			else if( (x >= 4175 && x <= 4535) && (y >= 7298 && y <= 7370 )  ){
				if (y >= 7370)
					y = 7370;
				
			}
			else if( (x >= 596 && x <= 884) && (y >= 7412 && y <= 7424 )){
				if (x <= 632)
					x = 632;
				if (x >= 866)
					x = 866;
			}
			else if( (x >= 1286 && x <= 1400) && (y >= 7412 && y <= 7424 )){
				if (x <= 1310)
					x = 1310;
				if (x >= 1382)
					x = 1382;
			}
			else if( (x >= 1784 && x <= 2044) && (y >= 7412 && y <= 7424 )){
				if (x <= 1802)
					x = 1802;
				if (x >= 2024)
					x = 2024;
			}
			else if( (x >= 2444 && x <= 2730) && (y >= 7412 && y <= 7424 )){
				if (x <= 2474)
					x = 2474;
				if (x >= 2708)
					x = 2708;
			}
			else if( (x >= 3128 && x <= 3236) && (y >= 7412 && y <= 7424 )){
				if (x <= 3152)
					x = 3152;
				if (x >= 3212)
					x = 3212;
			}
			else if( (x >= 4037 && x <= 4155) && (y >= 7412 && y <= 7424 )){
				if (x <= 4067)
					x = 4067;
				if (x >= 4139)
					x = 4139;
			}
			else if( (x >= 4547 && x <= 4800) && (y >= 7412 && y <= 7424 )){
				if (x <= 4577)
					x = 4577;
				if (x >= 4787)
					x = 4787;
			}
			else if( (x >= 5195 && x <= 5495) && (y >= 7412 && y <= 7424 )){
				if (x <= 5207)
					x = 5207;
				if (x >= 5465)
					x = 5465;
			}
			else if( (x >= 5890 && x <= 5995) && (y >= 7412 && y <= 7424 )){
				if (x <= 5915)
					x = 5915;
				if (x >= 5969)
					x = 5969;
			}
			else if( (x >= 6377 && x <= 6659) && (y >= 7412 && y <= 7424 )){
				if (x <= 6413)
					x = 6413;
				if (x >= 6617)
					x = 6617;
			}
			else if((x >= 4841 && x <= 5165) && (y >= 7310 && y <= 7364 ) ){
				if (y >= 7364)
					y = 7364;
			}
			else if((x >= 5519 && x <= 5873) && (y >= 7292 && y <= 7358 ) ){
				if (y >= 7358)
					y = 7358;
			}
			else if((x >= 6029 && x <= 6365) && (y >= 7298 && y <= 7376 ) ){
				if (y >= 7376)
					y = 7376;
			}
			else if((x >= 6689 && x <= 6845) && (y >= 7298 && y <= 7358 ) ){
				if (y >= 7358)
					y = 7358;
			}
			
			else this.y+=10;
		}
		
		//MASTERCHIEF'S MOVEMENTS
		

		 animLeft.runAnimation();
		 animRight.runAnimation();
		 animJumpLeft.runAnimation();
		 animJumpRight.runAnimation();
		 animKneelWalkLeft.runAnimation();
		 animKneelWalkRight.runAnimation();
		 kneel.runAnimation();
		 kneel_Left.runAnimation();
		
		
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		if(game.getKeyManager().up){
			
				counter2 += 0.05;
				y = y + (int) (Math.sin(counter2) + Math.cos(counter2)) * 6; 
				if (counter2 >= 7){
					counter2 = 4;
				}
		}
		 if (!game.getKeyManager().up){
			counter2 = 4;
			
		}
		 if(game.getKeyManager().down){
			
		
			//yMove = speed;
		 }
	    if(game.getKeyManager().right){
			xMove = speed;
			lookingLeft = false;
		}
		else if(game.getKeyManager().left){
			xMove = -speed;
			lookingLeft = true;
		}
		 if(game.getKeyManager().shoot && !is_shooting ){
			is_shooting = true;
					
			if(lookingLeft){
				Bullet b = new Halo_Bullet( game,  (x-game.getGameCamara().getxOffset()), (y-game.getGameCamara().getyOffset()), 15, 19);
				b.setDirection(1);
				Bullet c = new Halo_Bullet(game,  (x-game.getGameCamara().getxOffset()), (y-game.getGameCamara().getyOffset()), 15,19);
				c.setDirection(1);
				game.getController().addEntity(b);
				game.getController().addEntity(c);
				} else {	
					Bullet b = new Halo_Bullet(game, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()) , 17,17);
					b.setDirection(2);
					Bullet c = new Halo_Bullet(game, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()) , 17, 17);
					c.setDirection(2);
					game.getController().addEntity(b);
					game.getController().addEntity(c);
					
				}
		
	}
		 if(!game.getKeyManager().shoot){
			is_shooting = false;
		}
}

	@Override
	public void render(Graphics g) {
		//g.drawImage(Assets.player1, (int) x, (int) y, width, height, null); // resizes images!!!

		if(game.getKeyManager().up){
			if(lookingLeft)
				animJumpLeft.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
			else 
				animJumpRight.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
		}
		else if(game.getKeyManager().down){
			if(lookingLeft)

				g.drawImage(Assets.p1down2Left, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), null);
			//kneel_Left.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
			else 
				g.drawImage(Assets.p1down2, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), null);
			//kneel.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
		}

		else if(game.getKeyManager().down && game.getKeyManager().right){
			animKneelWalkRight.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
		}
		else if(game.getKeyManager().down && game.getKeyManager().left){
			animKneelWalkLeft.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
		}
		else if(game.getKeyManager().right){
			animRight.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
		}

		else if(game.getKeyManager().left){
			animLeft.drawAnimation(g, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), 0);
		}
		else if(!is_shooting)
			if(lookingLeft)
			g.drawImage(Assets.stance_left, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), null);
		else 
			g.drawImage(Assets.stanceR, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), null);
		else if (is_shooting){
			if(lookingLeft)
				g.drawImage(Assets.shootleft, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), null);
			else
				g.drawImage(Assets.shootright, (int) (x-game.getGameCamara().getxOffset()), (int) (y-game.getGameCamara().getyOffset()), null);
		}
	}

		public Boolean getLookingLeft() {
			return lookingLeft;
		}

		public void setLookingLeft(Boolean lookingLeft) {
			this.lookingLeft = lookingLeft;
		}

}
