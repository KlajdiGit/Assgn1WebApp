package sheridan.hoxhalli.assignment1.assgn1_tvshow.service;

import org.springframework.stereotype.Service;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxGuess;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxValues;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service
public class TVshowService {

    //  private final Random random;
    private static final int NUM_BOXES = 4;

    private List <BoxGuess> guesses;
    private Random random;

    private BoxGuess prize;

    public TVshowService() {
        this.guesses = new ArrayList<>();

    }

    public BoxGuess getPrize() {
        random = new Random();
        int ind = random.nextInt(this.guesses.size());

        prize = this .guesses.get(ind);
        return prize;
    }

    public TVshowService(List<BoxGuess> guesses) {
        this.guesses = guesses;
    }

    public List<BoxGuess> getGuesses() {
        return guesses;
    }

    public BoxGuess getBox(BoxValues val){
        return new BoxGuess(putValues());
    }

    public BoxValues putValues(){
        random = new Random();
        int pick = 1+ this.random.nextInt(4);

        if(pick == 0){
            return BoxValues.NOPRIZE;
        }
        else if (pick == 1){
            return BoxValues.SPORTCAR;
        }
        else if( pick == 2)
            return BoxValues.MONEY;
        else{
            return BoxValues.MANSION;

        }
    }

    public List<BoxGuess> generatePrizes(){
        List<BoxGuess> val = new ArrayList<>();
        for (int i = 0;i < NUM_BOXES; i++){

            val.add(new BoxGuess(putValues()));
        }

        for (int i =0; i < 2; i++){
            int j = random.nextInt(4);
            val.get(j).setValue(BoxValues.NOPRIZE);
        }

        return val;
    }
}
