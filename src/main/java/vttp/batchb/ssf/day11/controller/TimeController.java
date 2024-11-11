package vttp.batchb.ssf.day11.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// make this a request handler
@Controller
// handles the /time resource
@RequestMapping(path = "/time")
public class TimeController {

    @GetMapping("/gmt")
    public String getTimeGmt(Model model) {

        String currentTime = (new Date().toString());
        model.addAttribute("currTime", "this is the GMT time: %s".formatted(currentTime));
        return "time";
    }

    // this method to handle GET /time
    // inject the model into the handler
    @GetMapping
    public String getTime(Model model) {
        // generate some data for your view
        String currentTime = (new Date().toString());
        // bind the data to the model
        model.addAttribute("currTime", currentTime);
        //display the template/view
        return "time";
        
    }

}
