// Thi Nguyen
// TA: Riley Chang
// Assignment 3
// This program will produce a snowman 

import java.awt.*;

public class Doodle {
   public static void main(String[] args) {
      DrawingPanel p = new DrawingPanel(400,400);
      p.setBackground(new Color(176,224,230));
      
      Graphics g = p.getGraphics();
   
     
      drawArms(g, 110, 160, 150, 200, 2); 
      drawHighlight(g);
      drawBody(g, 150, 160, 100, 2);
      drawButton(g, 195, 180, 10, 3);
      g.setColor(Color.BLACK);
      g.fillOval(190, 135, 20, 10);
      drawHat(g, 165, 80, 20, 3);
      drawEyes(g);
   }
   
   // Draw the buttons of the snowman with a loop
   public static void drawButton(Graphics g, int x, int y, int size, int number) {
      for (int i = 0; i < number; i++) {
         g.setColor(Color.RED);
         g.fillOval(x, y + 2 * i * size, size, size);
      }
   }
   
   // Draw the hat of the snowman with a rectangle shape
   public static void drawHat(Graphics g, int x, int y, int size, int number) {
      g.setColor(Color.BLACK);
      g.fillRect(175, 40, 50, 50);
      for (int i = 0; i < number; i++) {
         g.fillRect(x + i * size, y, size, size);
      }
      g.fillRect(215, 80, 20, 20);
   }
   
   // Draw the arms using a line shape
   public static void drawArms(Graphics g, int x1, int y1, int x2, int y2, int number) {
      for (int i = 0; i < number; i++) {
         g.drawLine( x1 + i * (y2 - 60), y1 + i * (x2 - 110), x2 + i * (x2 - 15), y2 - i * (x1 - 70));
      }
   }
   
   // Draw the highlights in the eyes
   public static void drawHighlight(Graphics g) {
      g.setColor(Color.WHITE);
      g.fillOval(180, 110, 5, 5);
      g.fillOval(210, 110, 5, 5);
   }
   
   // Draw the body of the snowman
   public static void drawBody(Graphics g, int x, int y, int size, int number) {
      g.fillOval(160, 90, 80, 80);
      for (int i = 0; i < number; i++) {
         g.fillOval(x - i * (size - 90), y + i * (size - 20), size + i * 20, size + i * 20);
      }
   }
   
   // Draw the eyes of the snowman
   public static void drawEyes(Graphics g) {
      g.setColor(Color.BLACK);
      g.fillOval(180, 110, 10, 10);
      g.fillOval(210, 110, 10, 10);
   }
      

      
         

   
   
}
      
       
      
     