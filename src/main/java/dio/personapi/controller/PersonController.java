package dio.personapi.controller;

import dio.personapi.dto.MessageResponseDTO;
import dio.personapi.entity.Person;
import dio.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    // Acessar a aplicação com o Heroku https://peopleapi-live-dio-java.herokuapp.com/api/v1/people
}
