package org.example;

public interface PersonRepository {
    Person save(Person person);

    Optional<Person> findById(int id);

    List<Person> findAll();

    long count();

    void delete(Person person);
}
