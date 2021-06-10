package one.digitalinovation.personalapi.service;

import one.digitalinovation.personalapi.dto.MessageResponseDTO;
import one.digitalinovation.personalapi.entity.Person;
import one.digitalinovation.personalapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {


    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO.builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
