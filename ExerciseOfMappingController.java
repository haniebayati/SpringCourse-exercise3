package ir.freeland.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/api")
public class ExerciseOfMappingController {

    public ExerciseOfMappingController() {
        super();
    }

    @RequestMapping(value = "/books")
    @ResponseBody
    public String getBooksBySimplePath() {
        return "Get your books";
    }

    @RequestMapping(value = "/book/{id}")
    @ResponseBody
    public String getBooksBySimplePathWithPathVariable(@PathVariable final long id) {
        return "Get a Book with id=" + id;
    }
    
    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE )
    @ResponseBody
    public String deleteBooksBySimplePathWithPathVariable(@PathVariable final long id) {
        return "Delete a Book with id=" + id;
    }
    
    @RequestMapping(value = "/book/{id}", method = RequestMethod.PUT )
    @ResponseBody
    public String putBooksBySimplePathWithPathVariable(@PathVariable final long id) {
        return "Put a Book with id=" + id;
    }
    
    @RequestMapping(value = "/book/create", method = RequestMethod.POST)
    @ResponseBody
    public String postBook() {
        return "Post Books";
    }

    @RequestMapping(value = "/book/title/{booktitle}")
    @ResponseBody
    public String getBooksBySimplePathWithPathVariables(@PathVariable final String booktitle) {
        return "Get a Book with title=" + booktitle;
    }

    @RequestMapping(value = "/book", headers = { "key1=name", "key2=publish" })
    @ResponseBody
    public String getBookWithNameAndPublish() {
        return "Get Book with name and publish";
    }   
}
