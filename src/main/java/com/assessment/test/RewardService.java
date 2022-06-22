package com.assessment.test;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RewardService {

    public int getRewards(Transaction transaction){
        List<Integer> transactions =  transaction.getTransactions();
        int totalReward = 0;
        for(int t: transactions){
            if(t <= 50) {
                continue;
            }
            int eligible = t - 50;
            int twoPoints = eligible - 50;
            if(twoPoints > 0){
                totalReward += 2 * twoPoints;
            }
            if(eligible > 50){
                totalReward += 50;
            }else{
                totalReward += eligible;
            }
        }
        return totalReward;
    }
}
