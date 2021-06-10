package one.digitalinovation.personalapi.controller;

import one.digitalinovation.personalapi.dto.MessageResponseDTO;
import one.digitalinovation.personalapi.entity.Person;
import one.digitalinovation.personalapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
