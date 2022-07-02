
package com.suraj.carcrashgame;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalTime;
import java.util.Random;

public class CarCrashGame extends Applet implements Runnable , KeyListener
{
   
    int score;
    StringBuilder  scoree = new StringBuilder("Score :   ");
  
    //Declearing Thread
    Thread t;
    
    //Declaring boolean value to control the game
    boolean b = false;

//    CarCrashGame ccg = new CarCrashGame();
    //Declearing variables for strips;
    int strip1 = 0, strip2 = 260, strip3 = 520, strip4 = 780, strip5 = 1040, strip6 = 1300, strip7 = 1560;
    
    //Declaring x axis for player car.
    int car_first_rect = 60, car_second_rect = 35, car_first_tire = 40, car_second_tire = 105;
    
    //Declaring y-axis for player car
    int y_first_rect = 179, y_second_rect = 194, y_first_tire = 214, y_second_tire = 214;
  
    //Declaring variables for obstacle car 1
    int obs_rect_x = 1250, obs_rect2_x = 1225, obs_tire_1_x = 1230, obs_tire_2_x = 1295;
    int obs_rect_y = 179,  obs_rect2_y = 194,  obs_tire_1_y = 214, obs_tire_2_y = 214;
    
     //Declaring variables for obstacle car 2
    int obs2_rect_x = 900, obs2_rect2_x = 875, obs2_tire_1_x = 880, obs2_tire_2_x = 945;
    int obs2_rect_y = 179,  obs2_rect2_y = 194,  obs2_tire_1_y = 214, obs2_tire_2_y = 214;
    
    //Declaring variables for obstacle car 3
    int obs3_rect_x = 500, obs3_rect2_x = 475, obs3_tire_1_x = 480, obs3_tire_2_x = 545;
    int obs3_rect_y = 179,  obs3_rect2_y = 194,  obs3_tire_1_y = 214, obs3_tire_2_y = 214;
    
    //Declaring variables for obstacle car 4
    int obs4_rect_x = 500, obs4_rect2_x = 475, obs4_tire_1_x = 480, obs4_tire2__x = 545;
    int obs4_rect_y = 300,  obs4_rect2_y = 315,  obs4_tire_1_y = 335, obs4_tire_2_y = 335;
    
    //Declaring variables for obstacle car 5
    int obs5_rect_x = 1250, obs5_rect2_x = 1225, obs5_tire_1_x = 1230, obs5_tire_2_x = 1295;
    int obs5_rect_y = 400,  obs5_rect2_y = 415,  obs5_tire_1_y = 435, obs5_tire_2_y = 435;
    
    //Declaring variables for width of obstacle cars 
   int width1 = 50, width2 = 50, width3 =  50, width4 = 50, width5 = 50;
   
   //Declaring variables for height of the obstacle cars
   int height1 = 25,  height2 = 25, height3 = 25, height4 = 25, height5 = 25;
   
   //Declaring variable for player car width and height
   int player_car_height = 25, player_car_width = 50;

                         
  
    @Override
    public void run()
    {
        while(true)
        {
           try
           {
               if(score<100)
               {
                Thread.sleep(150);
               }
               else if(score>100 && score<200)
               {
                   Thread.sleep(95);
               }
               else if(score>200 && score<350)
               {
                   Thread.sleep(50);
               }
               else if(score>350 && score<450)
               {
                   Thread.sleep(10);
               }
               else
               {
                   Thread.sleep(1);
               }
               
               strip1 = strip1-10;
               strip2 = strip2 -10;
               strip3 = strip3-10;
               strip4 = strip4-10;
               strip5 = strip5-10;
               strip6 = strip6 - 10;
               strip7 = strip7 - 10;
               
               obs_rect_x = obs_rect_x-10;
               obs_rect2_x = obs_rect2_x-10;
               obs_tire_1_x = obs_tire_1_x-10;
               obs_tire_2_x = obs_tire_2_x -10;
               
               obs2_rect_x = obs2_rect_x-10;
               obs2_rect2_x = obs2_rect2_x-10;
               obs2_tire_1_x = obs2_tire_1_x-10;
               obs2_tire_2_x = obs2_tire_2_x -10;
              
                obs3_rect_x = obs3_rect_x-10;
               obs3_rect2_x = obs3_rect2_x-10;
               obs3_tire_1_x = obs3_tire_1_x-10;
               obs3_tire_2_x = obs3_tire_2_x -10;
               
                obs4_rect_x = obs4_rect_x-10;
               obs4_rect2_x = obs4_rect2_x-10;
               obs4_tire_1_x = obs4_tire_1_x-10;
               obs4_tire2__x = obs4_tire2__x -10;
              
                obs5_rect_x = obs5_rect_x-10;
               obs5_rect2_x = obs5_rect2_x-10;
               obs5_tire_1_x = obs5_tire_1_x-10;
               obs5_tire_2_x = obs5_tire_2_x -10;
               
               if(obs_rect2_x<=-165)
               {
                   obs_rect2_x = 1400;
                   obs_rect_x = obs_rect2_x+25;
                   obs_tire_1_x = obs_rect2_x+5;
                   obs_tire_2_x = obs_rect2_x+70;
                   
                  obs_rect_y = generateRandomNumber(409, 159);
                  obs_rect2_y = obs_rect_y + 15;
                  obs_tire_1_y = obs_rect_y +35;
                  obs_tire_2_y = obs_rect_y + 35;
               }
              else if(obs2_rect2_x<=-165)
               {
                   obs2_rect2_x = 1400;
                   obs2_rect_x = obs2_rect2_x+25;
                   obs2_tire_1_x = obs2_rect2_x+5;
                   obs2_tire_2_x = obs2_rect2_x+70;
                   
                  obs2_rect_y = generateRandomNumber(409, 159);
                  obs2_rect2_y = obs2_rect_y + 15;
                  obs2_tire_1_y = obs2_rect_y +35;
                  obs2_tire_2_y = obs2_rect_y + 35;
               }
               else if(obs3_rect2_x<=-165)
               {
                   obs3_rect2_x = 1400;
                   obs3_rect_x = obs3_rect2_x+25;
                   obs3_tire_1_x = obs3_rect2_x+5;
                   obs3_tire_2_x = obs3_rect2_x+70;
                   
                  obs3_rect_y = generateRandomNumber(409, 159);
                  obs3_rect2_y = obs3_rect_y + 15;
                  obs3_tire_1_y = obs3_rect_y +35;
                  obs3_tire_2_y = obs3_rect_y + 35;
               }
               else if(obs4_rect2_x<=-165)
               {
                   obs4_rect2_x = 1400;
                   obs4_rect_x = obs4_rect2_x+25;
                   obs4_tire_1_x = obs4_rect2_x+5;
                   obs4_tire2__x = obs4_rect2_x+70;
                   
                  obs4_rect_y = generateRandomNumber(409, 159);
                  obs4_rect2_y = obs4_rect_y + 15;
                  obs4_tire_1_y = obs4_rect_y +35;
                  obs4_tire_2_y = obs4_rect_y + 35;
               }
                else if(obs5_rect2_x<=-165)
               {
                   obs5_rect2_x = 1400;
                   obs5_rect_x = obs5_rect2_x+25;
                   obs5_tire_1_x = obs5_rect2_x+5;
                   obs5_tire_2_x = obs5_rect2_x+70;
                   
                  obs5_rect_y = generateRandomNumber(409, 159);
                  obs5_rect2_y = obs5_rect_y + 15;
                  obs5_tire_1_y = obs5_rect_y +35;
                  obs5_tire_2_y = obs5_rect_y + 35;
               }
               
              if(strip1<=-240)
              {
                  strip1 = 1720;
              }
              else if(strip2 <= -240)
              {
                  strip2 = 1720;
              }
              else if(strip3 <= -240)
              {
                  strip3 = 1720;
              }
              else if(strip4 <= -240)
              {
                  strip4 = 1720;
              }
             else if (strip5 <= -240)
              {
                  strip5 = 1720;
              }
             else if( strip6 <= -240)
              {
                  strip6 = 1720;
              }
              else if(strip7 <= -240)
              {
                  strip7 = 1720;
              }
              if(obs_rect2_y<=(y_second_rect+20) && obs_rect2_y>=(y_second_rect-20) && (obs_rect2_x<=car_second_rect+100) && (obs_rect2_x>=car_second_rect-100))
              {
                  b = true;
                  t.stop();
              }
              else if(obs2_rect2_y<=(y_second_rect+20) && obs2_rect2_y>=(y_second_rect-20) && (obs2_rect2_x<=car_second_rect+100) && (obs2_rect2_x>=car_second_rect-100))
              {
                  b = true;
                  t.stop();
              }
              else if(obs3_rect2_y<=(y_second_rect+20) && obs3_rect2_y>=(y_second_rect-20) && (obs3_rect2_x<=car_second_rect+100) && (obs3_rect2_x>=car_second_rect-100))
              {
                  b = true;
                  t.stop();
              }
              else if(obs4_rect2_y<=(y_second_rect+20) && obs4_rect2_y>=(y_second_rect-20) && (obs4_rect2_x<=car_second_rect+100) && (obs4_rect2_x>=car_second_rect-100))
              {
                  b= true;
                  t.stop();
              }
              else if(obs5_rect2_y<=(y_second_rect+20) && obs5_rect2_y>=(y_second_rect-20) && (obs5_rect2_x<=car_second_rect+100) && (obs5_rect2_x>=car_second_rect-100))
              {
                  b = true;
                  t.stop();
              }
                    if(car_second_rect == (obs_rect2_x + 200))
                    {
                        score= score+1;
                    }
                    if(car_second_rect == (obs2_rect2_x + 200))
                    {
                        score= score+1;
                    }
                    if(car_second_rect == (obs3_rect2_x + 200))
                    {
                        score= score+1;
                    }
                    if(car_second_rect == (obs4_rect2_x + 200))
                    {
                        score= score+1;
                    }
                    if(car_second_rect == (obs5_rect2_x + 200))
                    {
                        score= score+1;
                    }
               
                            if(obs_rect_y>=(y_second_rect-25)&&(obs_rect_y<=(y_second_rect+20))&& obs_rect_x <=(car_second_rect+100)&&obs_rect_x>=(car_second_rect-100))
                            {
                                obs_rect_x = obs_rect_x+5;
                                score = score+2;
                              
                            }
                            
                             else if(obs2_rect_y>=(y_second_rect-25)&&(obs2_rect_y<=(y_second_rect+20))&& obs2_rect_x <=(car_second_rect+100)&&obs2_rect_x>=(car_second_rect-100))
                            {
                                obs2_rect_x = obs2_rect_x+10;
                                score = score+2;
                            } 
                             else if(obs3_rect_y>=(y_second_rect-25)&&(obs3_rect_y<=(y_second_rect+20))&& obs3_rect_x <=(car_second_rect+100)&&obs3_rect_x>=(car_second_rect-100))
                            {
                                obs3_rect_x = obs3_rect_x+10;
                                score = score+2;
                            }  
                             else  if(obs4_rect_y>=(y_second_rect-25)&&(obs4_rect_y<=(y_second_rect+20))&& obs4_rect_x <=(car_second_rect+100)&&obs4_rect_x>=(car_second_rect-100))
                            {
                                obs4_rect_x = obs4_rect_x+10;
                                score = score +2;
                            }  
                              else  if(obs5_rect_y>=(y_second_rect-25)&&(obs5_rect_y<=(y_second_rect+20))&& obs5_rect_x <=(car_second_rect+100)&&obs5_rect_x>=(car_second_rect-100))
                            {
                                obs5_rect_x = obs5_rect_x+10;
                                score = score + 2;
                            } 
                            
               repaint();
           }
           catch(InterruptedException e)
           {
               System.out.println(e);
           }
        }
    }
  
    
    @Override
    public void start()
    {
        setSize(1360, 650);
        setBackground(Color.yellow);
        t =  new Thread(this);
       
         t.start();
     
         addKeyListener(this);
    }
    
    public void paint(Graphics g)
    {
        //createDigitalClock(g).start();
        //Thread t2 = new DigitalClock(g);
        g.setFont(new Font("Arial", Font.BOLD, 22));
         g.setColor(Color.blue);
          LocalTime t = LocalTime.now();
         g.drawString(t.toString(),20, 150);
       // t2.start();
        makeRoad(g);
        makePlayerCar(g);
        makeObstaclesCar(g);
        g.setFont(new Font("Algerian", Font.PLAIN, 60));
        g.setColor(Color.red);
        if(b)
        {
            g.drawString("Game Over", 600, 250);
        }
    }
    
    public void makePlayerCar(Graphics g)
    {
        // Creating player car------------
        
        g.setColor(Color.red);
        g.fillRect(car_first_rect,y_first_rect , player_car_width,player_car_height);
        g.fillRect(car_second_rect, y_second_rect, 100, 20);
        g.setColor(Color.gray);
        g.fillOval(car_first_tire, y_first_tire, 25, 25);
        g.fillOval(car_second_tire, y_second_tire, 25, 25);
        
    }
    public void makeObstaclesCar(Graphics g)
    {
         g.setColor(Color.yellow);
        g.fillRect(obs_rect_x,obs_rect_y , width1, height1);
        g.fillRect(obs_rect2_x, obs_rect2_y, 100, 20);
        g.setColor(Color.gray);
        g.fillOval(obs_tire_1_x, obs_tire_1_y, 25, 25);
        g.fillOval(obs_tire_2_x, obs_tire_2_y, 25, 25);
        
         g.setColor(Color.blue);
        g.fillRect(obs2_rect_x,obs2_rect_y , width2, height2);
        g.fillRect(obs2_rect2_x, obs2_rect2_y, 100, 20);
        g.setColor(Color.yellow);
        g.fillOval(obs2_tire_1_x, obs2_tire_1_y, 25, 25);
        g.fillOval(obs2_tire_2_x, obs2_tire_2_y, 25, 25);
        
         g.setColor(Color.gray);
        g.fillRect(obs3_rect_x,obs3_rect_y , width3, height3);
        g.fillRect(obs3_rect2_x, obs3_rect2_y, 100, 20);
        g.setColor(Color.red);
        g.fillOval(obs3_tire_1_x, obs3_tire_1_y, 25, 25);
        g.fillOval(obs3_tire_2_x, obs3_tire_2_y, 25, 25);
        
        g.setColor(Color.ORANGE);
        g.fillRect(obs4_rect_x,obs4_rect_y , width4, height4);
        g.fillRect(obs4_rect2_x, obs4_rect2_y, 100, 20);
        g.setColor(Color.yellow);
        g.fillOval(obs4_tire_1_x, obs4_tire_1_y, 25, 25);
        g.fillOval(obs4_tire2__x, obs4_tire_2_y, 25, 25);
        
        g.setColor(Color.cyan);
        g.fillRect(obs5_rect_x,obs5_rect_y , width5, height5);
        g.fillRect(obs5_rect2_x, obs5_rect2_y, 100, 20);
        g.setColor(Color.blue);
        g.fillOval(obs5_tire_1_x, obs5_tire_1_y, 25, 25);
        g.fillOval(obs5_tire_2_x, obs5_tire_2_y, 25, 25);
    }
    public void makeRoad(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(0, 162, 1365, 325);
        
        //Making road strips
        
        g.setColor(Color.white);
        g.fillRect(strip1, 305, 160, 40);
        g.fillRect(strip2, 305, 160, 40);
        g.fillRect(strip3, 305, 160, 40);
        g.fillRect(strip4, 305, 160, 40);
        g.fillRect(strip5, 305, 160, 40);
        g.fillRect(strip6, 305, 160, 40);
        g.fillRect(strip7, 305, 160, 40);
        g.setColor(Color.red);
        g.setFont(new Font("Algerian", Font.BOLD, 45));
        g.drawString((scoree+ " " +score), 500, 150);
    
    }

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e)
    {
        if(b== false)
        {
               if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            y_first_rect = y_first_rect - 10;
            y_second_rect = y_second_rect - 10;
            
            y_first_tire = y_first_tire - 10;
            y_second_tire = y_second_tire - 10;
            
            if(y_first_rect<=164)
            {
                y_first_rect = 164;
                y_second_rect = 179;
                y_second_tire = 199;
                y_first_tire = 199;
            }
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
             y_first_rect = y_first_rect + 5;
            y_second_rect = y_second_rect +5;
            
            y_first_tire = y_first_tire + 5;
            y_second_tire = y_second_tire + 5;
           
            if(y_second_tire>=459)
            {
                y_first_tire = 459;
                y_second_tire = 459;
                y_first_rect = 424;
                y_second_rect = 439;
            }
        }
         else  if(e.getKeyCode()== KeyEvent.VK_RIGHT)
        {
            car_first_rect = car_first_rect+5;
            car_second_rect = car_second_rect + 5;
            
            car_first_tire = car_first_tire + 5;
            car_second_tire = car_second_tire + 5;
          
            if(car_second_rect>=1260)
            {
                car_first_rect = 1285;
                car_second_rect = 1260;
                car_first_tire = 1265;
                car_second_tire = 1330;
            }
        }
         else if(e.getKeyCode()==KeyEvent.VK_LEFT)
         {
            car_first_rect = car_first_rect-5;
            car_second_rect = car_second_rect - 5;
            
            car_first_tire = car_first_tire - 5;
            car_second_tire = car_second_tire - 5;  
            
            if(car_first_rect==0)
            {
                car_second_rect = 0;
                car_first_rect = 25;
                car_first_tire = 5;
                car_second_tire = 70;
            }
        }
     
             
         }
          repaint();
    }

    public void keyReleased(KeyEvent e) {}
    
     public int generateRandomNumber(int x, int y)
    {
        // Generating random number for car between y- axis
        Random r = new Random();
        return r.nextInt(x-y) + y;
    }
}


