package crudPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class resource {

    @Autowired
    private URepository repo;

    public resource(URepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public @ResponseBody Iterable<employees> index() {
        return repo.findAll();
    }


}
