package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Main controller for web access.
 * http://localhost:8080
 */
@RestController
public class MainController {

    @Autowired
    public ChemERepository chemERepository;

/*
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
*/

    // THIS DOESN'T WORK YET. NEED HttpServletRequest as input arg to findAll method
    //@RequestMapping(method = RequestMethod.GET, value = "/findall")


    @RequestMapping("/")
    public void findAndPrintAll() {
        chemERepository.findAndPrintAll();
    }
}

