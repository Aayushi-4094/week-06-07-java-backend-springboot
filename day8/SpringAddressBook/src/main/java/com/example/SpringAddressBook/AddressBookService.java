package com.example.SpringAddressBook;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AddressBookService {
    private final List<AddressBookModel> dataStore = new ArrayList<>();

    public List<AddressBookModel> getAll() {
        return dataStore;
    }

    public AddressBookModel getById(int id) {
        return dataStore.stream().filter(entry -> entry.getId() == id).findFirst().orElse(null);
    }

    public AddressBookModel add(AddressBookDTO dto) {
        AddressBookModel model = new AddressBookModel(dataStore.size() + 1, dto.getName(), dto.getAddress(), dto.getPhone());
        dataStore.add(model);
        return model;
    }

    public AddressBookModel update(int id, AddressBookDTO dto) {
        AddressBookModel model = getById(id);
        if (model != null) {
            model.setName(dto.getName());
            model.setAddress(dto.getAddress());
            model.setPhone(dto.getPhone());
        }
        return model;
    }

    public boolean delete(int id) {
        return dataStore.removeIf(entry -> entry.getId() == id);
    }
}