package org.example;

public class HelloMockito {
    private String greeting = "Hello, %s, from Mockito!";

    // Dependencias
    private final PersonRepository personRepository;
    private final TranslationService translationService;

    public HelloMockito(PersonRepository personRepository, TranslationService translationService) {
        this.personRepository = personRepository;
        this.translationService = translationService;
    }

    public String greet(int id, String sourceLang, String targetLang) {
        Optional<Person> person = personRepository.findById(id);
        String name = person.map(Person::getFirst).orElse("World");
        return translationService.translate(
                String.format(greeting, name), sourceLang, targetLang);
    }
}
