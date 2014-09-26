/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import com.google.gson.Gson;
import entity.PersonEntity;
import exceptions.NotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jonas
 */
public class PersonFacadeDB implements IPersonFacade
{

    Map<Integer, PersonEntity> persons = new HashMap();
    private int nextId;
    private final Gson gson = new Gson();
    private static PersonFacadeDB instance = new PersonFacadeDB();

    public PersonFacadeDB()
    {
    }

    public void createTestData()
    {
        addPerson(gson.toJson(new PersonEntity("Dann", "Mark", "1234")));
        addPerson(gson.toJson(new PersonEntity("Danny", "Boy", "2345")));
        addPerson(gson.toJson(new PersonEntity("Neojan", "Tahaha", "3456")));
        addPerson(gson.toJson(new PersonEntity("Ronald", "McDonald", "4567")));
        addPerson(gson.toJson(new PersonEntity("Jonas", "Petersen", "5678")));
    }

    /*
     Pass in true to create a new instance. Usefull for testing.
     */
    public static PersonFacadeDB getFacade(boolean reseet)
    {
        if (true)
        {
            instance = new PersonFacadeDB();
        }
        return instance;
    }

    @Override
    public PersonEntity addPerson(String json)
    {
        PersonEntity p = gson.fromJson(json, PersonEntity.class);
        p.setId(nextId);
        persons.put(nextId, p);
        nextId++;
        return p;
    }

    @Override
    public PersonEntity deletePerson(int id) throws NotFoundException
    {
        PersonEntity p = persons.remove(id);
        if (p == null)
        {
            throw new NotFoundException("No person exists for the given id");
        }
        return p;
    }

    @Override
    public String getPerson(int id) throws NotFoundException
    {
        PersonEntity p = persons.get(id);
        if (p == null)
        {
            throw new NotFoundException("No person exists for the given id");
        }
        return gson.toJson(p);
    }

    @Override
    public String getPersons()
    {
        if (persons.isEmpty())
        {
            return null;
        }
        return gson.toJson(persons.values());
    }

    @Override
    public PersonEntity editPerson(String json) throws NotFoundException
    {
        PersonEntity p = gson.fromJson(json, PersonEntity.class);
        PersonEntity oldValue = persons.get(p.getId());
        if (oldValue == null)
        {
            throw new NotFoundException("No person exists for the given id");
        }
        persons.put(p.getId(), p);
        return oldValue;
    }

}
