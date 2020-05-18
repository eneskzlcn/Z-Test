/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z.test;

import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {

    double z0;
    double testStatistics;
    String alternativeType = "";
    double sampleOneMean;
    double sampleOneStd;
    double sampleOneVariance;
    double sampleTwoVariance;
    double sampleTwoMean;
    double sampleTwoStd;
    public Graph(double z0, double testStatistics, String alternativeType,double sampleOneMean
    ,double sampleOneStd,double sampleTwoMean,double sampleTwoStd,double sampleOneVariance,double sampleTwoVariance) {
        this.z0 = z0;
        this.testStatistics = testStatistics;
        this.alternativeType = alternativeType;
        this.sampleOneMean = sampleOneMean;
        this.sampleOneStd = sampleOneStd;
        this.sampleOneVariance = sampleOneVariance;
        this.sampleTwoMean = sampleTwoMean;
        this.sampleTwoStd = sampleTwoStd;
        this.sampleTwoVariance = sampleTwoVariance;
    }

    public void paint(Graphics g) {
        super.printComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, 260, 550, 260);
        g.setColor(Color.red);
        int a = -4;
        for (int x = 85; x < 400; x += 40) {
            g.drawString(String.valueOf(a), x, 276);
            a += 1;
        }
        for (double x = -3.1; x <= 3.2; x = x + 0.1) {
            double y = -1 * x * x + 9;
            int xp = (int) Math.round(250 + x * 40);
            int yp = (int) Math.round(250 - y * 10);
            g.fillOval(xp - 2, yp - 2, 6, 6);

        }
        int originX = 85 + 4*40;
        int pos_testStatistics = 0;
        boolean isGreaterThan3 = false;
        boolean isLittleThanNegative3 = false;
        if(testStatistics>0 && testStatistics < 3){
            pos_testStatistics = (int)(originX+(testStatistics*40));         
        }
        else if(testStatistics<0 && testStatistics>-3){
            pos_testStatistics = (int)(originX+(testStatistics*43));         
        }
        else if(testStatistics ==0){
            pos_testStatistics = originX;         
        }
        else if(testStatistics >= 3){
           isGreaterThan3 = true;
        }
        else if(testStatistics <= -3){
            isLittleThanNegative3 = true;
        }
        double pos_y_in_function = -1*testStatistics*testStatistics + 9;
        int yp = (int) Math.round(250 - pos_y_in_function * 10);
        if(!isGreaterThan3 && !isLittleThanNegative3){
            g.setColor(Color.BLACK);
            g.drawLine(pos_testStatistics, 260, pos_testStatistics,yp); 
            g.drawString("Z", pos_testStatistics-5, 287);  
            g.fillOval(pos_testStatistics-2,258, 5, 5);
            g.setColor(Color.RED);
         
        }
        if(isGreaterThan3){
            g.setColor(Color.BLACK);
            g.fillOval(450,258, 5, 5);
            g.drawString("Z", 450, 287); 
            g.setColor(Color.red);
        }
            if(isLittleThanNegative3){
            g.setColor(Color.BLACK);
            g.fillOval(60,258, 5, 5);
            g.drawString("Z", 60, 287); 
            g.setColor(Color.red);
        }

        
        g.setColor(Color.BLACK);
        String str_test_stat = String.format("%.3f", testStatistics);
        g.drawString("Z(Test Statistic) ="+ str_test_stat, 440, 100);
        g.setColor(Color.RED); 
        g.fillRect(430,125, 15, 15);
        g.setColor(Color.black);
        g.drawString("= Rejection Areas", 450, 135);
        g.setColor(Color.RED);
        g.drawString("SAMPLE ONE", 50,400);
        g.setColor(Color.black);
        g.drawString("Mean:"+String.valueOf(sampleOneMean), 50,430);
        g.drawString("Standart Deviation:"+String.valueOf(sampleOneStd), 50,460);
        g.drawString("Variance:"+String.valueOf(sampleOneMean), 50,490);     
        g.setColor(Color.RED);
        g.drawString("SAMPLE TWO", 500,400);
        g.setColor(Color.black);
        g.drawString("Mean:"+String.valueOf(sampleTwoMean), 500,430);
        g.drawString("Standart Deviation:"+String.valueOf(sampleTwoStd), 500,460);
        g.drawString("Variance:"+String.valueOf(sampleTwoMean), 500,490);
        switch (this.alternativeType){
            case "Two-Sided Alternative":/// because of it is two sided alternative,there will be z0/2 instead of z0
                g.setColor(Color.BLUE);
                g.drawString("TWO-SİDED ALTERNATİVE TEST",180 , 50);
                g.setColor(Color.RED);
                 double positiveZ0 = 0;
                 int pos_positiveZ0;
                 double negativeZ0;
                 int pos_negativeZ0;
                 if(z0 > 0){
                     positiveZ0 = z0/2;/// right part of two-sided
                     negativeZ0 = -z0/2;////left part of twi-sided
                 }
                 else{
                     positiveZ0 = -z0/2;
                     negativeZ0 = z0/2;
                 }
                 pos_positiveZ0 = (int)(originX +(positiveZ0*43)); ////absolute value of distances
                 pos_negativeZ0 = (int)(originX + (negativeZ0*40)); // part of distance.
                 double graph_location = positiveZ0;
                 double graph_location_negative = negativeZ0;
                 for (int x = pos_positiveZ0; x < originX+3*40; x+=10) {
                     double y_positive = -1 * graph_location * graph_location+ 9;
                     int y_p = (int) Math.round(250 - y_positive * 9);
                     g.drawLine(x,260,x,y_p);
                     graph_location +=0.25;                   
                }
                g.setColor(Color.BLACK);
                String str_positive = String.format("%.3f", positiveZ0);
                g.drawString("+Z0", pos_positiveZ0-5, 287);
                g.drawString("+Z0 = "+positiveZ0, 500, 50);
                g.drawString("In This Test z0 used as placeholder of (z-alfa/2)", 350, 160);
                g.fillOval(pos_positiveZ0-2,258, 5, 5);
                g.setColor(Color.red);
                for (int x = pos_negativeZ0; x >= originX-3*40; x-=10){
                     double y_negative = -1 * graph_location_negative * graph_location_negative+ 9;
                     int y_p = (int) Math.round(250 - y_negative * 8);
                     g.drawLine(x,260,x,y_p);
                     graph_location_negative -=0.25;                    
                }
                g.setColor(Color.BLACK);
                String str_negative = String.format("%.3f", negativeZ0);
                g.drawString("-Z0",pos_negativeZ0-5, 287);
                g.drawString("-Z0 = "+ str_negative, 503, 75);
                g.fillOval(pos_negativeZ0-2,258, 5, 5);
                String text = "";
                if(testStatistics>=positiveZ0 || testStatistics<= negativeZ0){
                     text = "The hypothesis is rejected.Test statistic value in Rejection Area!";
                }
                else if(testStatistics < positiveZ0 && testStatistics>negativeZ0){
                    text = "The hypothesis is accepted.Test statistic value in Acceptance Area!";
                }
                g.setColor(Color.DARK_GRAY);
                g.drawString(text,120,330);
                g.setColor(Color.red);
                break;
            
            case "Right-Tail Alternative": 
                 g.setColor(Color.BLUE);
                g.drawString("RİGHT-TAİL ALTERNATİVE TEST",180,50);
                 g.setColor(Color.red);
                double right_z0 = this.z0;//rejection area Z<=-z0;
                int pos_z0 = (int)(originX +(right_z0*43));
                double graph_loc = right_z0;
                for (int x = pos_z0; x < originX+3*40; x+=10) {
                     double y_positive = -1 * graph_loc * graph_loc+ 9;
                     int y_p = (int) Math.round(250 - y_positive * 9);
                     g.drawLine(x,260,x,y_p);
                     graph_loc +=0.25;                   
                }
                String str_z0 = String.format("%.3f", right_z0);
                g.setColor(Color.BLACK);
                g.drawString("+Z0", pos_z0-5, 287);
                g.drawString("+Z0 ="+str_z0, 500, 60);
                g.fillOval(pos_z0-2,258, 5, 5);
                g.setColor(Color.red);
                String right_text = "";
                if(testStatistics>= right_z0){
                    right_text = "The hypothesis is rejected.Test statistic value in Rejection Area!";
                }
                else{
                    right_text = "The hypothesis is accepted.Test statistic value in Acceptance Area!";
                }
                g.setColor(Color.DARK_GRAY);
                g.drawString(right_text,120,330);
                g.setColor(Color.red);

                break;
            
            case "Left-Tail Alternative":
                double left_z0 = -this.z0; // rejection area Z<= -z0
                int pos_negative_z0 =(int)(originX + (left_z0*40));
                g.setColor(Color.BLUE);
                g.drawString("LEFT-TAİL ALTERNATİVE TEST",180,50);
                double graphic_loc = left_z0;
                g.setColor(Color.red);
                for (int x = pos_negative_z0; x >= originX-3*40; x-=10){
                     double y_negative = -1 * graphic_loc * graphic_loc+ 9;
                     int y_p = (int) Math.round(250 - y_negative * 8);
                     g.drawLine(x,260,x,y_p);
                     graphic_loc -=0.25;                    
                }
                g.setColor(Color.BLACK);
                String str_left_z0 = String.format("%.3f",left_z0);
                g.drawString("-Z0", pos_negative_z0-5, 287);
                g.fillOval(pos_negative_z0-2,258, 5, 5);
                g.drawString("-Z0 = "+str_left_z0, 500, 60);
                String left_text = "";
                if(testStatistics<=left_z0){
                    left_text = "The hypothesis is rejected.Test statistic value in Rejection Area!";
                }
                else{
                    left_text = "The hypothesis is accepted.Test statistic value in Acceptance Area!";
                }
                g.setColor(Color.DARK_GRAY);
                g.drawString(left_text,120,330);
                g.setColor(Color.red);
                break;
            
            default:
                break;
        }
    }
    

}
