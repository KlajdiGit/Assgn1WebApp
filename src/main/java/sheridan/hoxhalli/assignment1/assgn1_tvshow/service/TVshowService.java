package sheridan.hoxhalli.assignment1.assgn1_tvshow.service;

import org.springframework.stereotype.Service;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxGuess;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxValues;

import java.util.Random;

import static sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxValues.NOPRIZE;

@Service
public class TVshowService {

    private final Random random;
    //private static final int NUM_BOXES = 4;

    public TVshowService(Random rand) {
        this.random = rand;

    }


    public TVshowService() {
        this(new Random());
    }

    public BoxGuess getBox(BoxValues val){
        return new BoxGuess(putValues());
    }

    public BoxValues putValues(){

        int pick = this.random.nextInt(3);

        if(pick == 0){
            return BoxValues.NOPRIZE;
        }
        else if (pick == 1){
            return BoxValues.SPORTCAR;
        }
        else{
            return BoxValues.MONEY;

        }
    }
}
