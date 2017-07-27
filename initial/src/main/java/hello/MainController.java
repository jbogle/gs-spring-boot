package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for web access, just return text in the browser (this is from the example).
 * http://localhost:8080
 */
@RestController
public class MainController {

    @Autowired
    public ChemERepository chemERepository;

    /**
     *  When invoked from a browser or using curl on the command line, the index method returns pure text. That’s because
     *  @RestController combines @Controller and @ResponseBody, two annotations that results in web requests returning data rather than a view.
     */
    @RequestMapping("/textOnly")
    public String textOnly() {
        chemERepository.findAndPrintAll();
        return "Greetings from Spring Boot!  (Chem E jobs are printed on console)";
    }
}

