package sheridan.hoxhalli.assignment1.assgn1_tvshow.service;

import org.springframework.stereotype.Service;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxValues;

import java.util.Random;

@Service
public class TVshowService {

    private final Random random;
    private static int numBoxes = 4;
    public TVshowService(Random rand) {
        this.random = rand;
    }

    public TVshowService() {
        this(new Random());
    }

    public BoxValues putValues(){
        BoxValues[] boxes = BoxValues.values();
        return boxes[random.nextInt(boxes.length)];
    }
}
