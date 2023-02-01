package sheridan.hoxhalli.assignment1.assgn1_tvshow.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxGuess;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.model.BoxValues;
import sheridan.hoxhalli.assignment1.assgn1_tvshow.service.TVshowService;

@Controller
public class ShowController {

    private final Logger log = LoggerFactory.getLogger(ShowController.class);

    private final TVshowService showService;

    public ShowController(TVshowService tvShowService){
        this.showService = tvShowService;
    }

    @GetMapping(value = {"/", "playTemplate"})
    public String input(){
        log.trace("input() is called");
        return "PlayTemplate";
    }

    @GetMapping("/play")
    public ModelAndView play(
            @RequestParam BoxGuess prize
              ){
        log.trace("play() is called");
        prize.setValue(showService.putValues());
        log.debug("Value: " + prize);
        return new ModelAndView("Output", "boxValue",prize);
    }

}

