package com.duliday.minato;

import org.testng.annotations.Test;

/**
 * @author Minato
 * @description 功能描述
 * @create 2021/9/24 18:14
 */
public class AverageScore {
    int[][] scores = {
            {82, 90, 91},
            {68, 72, 64},
            {95, 91, 89},
            {67, 52, 60},
            {79, 81, 85},
    };

    public double calc() {
        int sum = 0;
        int count = 0;
        double averageScore;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                count++;
            }
        }
        averageScore = (double) sum / (double) count;
        System.out.println("平均分为："+averageScore);
        return averageScore;
    }
    public double calc1(){
        int sum=0;
        int count=0;
        for (int[] a:scores
             ) {
            for (int score:a
                 ) {
                sum+=score;
                count++;
            }
        }
        double averageScore=(double) sum/(double) count;
        System.out.println("平均分为："+averageScore);
        return averageScore;
    }
}
