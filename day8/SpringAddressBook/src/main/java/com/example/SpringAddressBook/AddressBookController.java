package com.example.SpringAddressBook;

import com.example.SpringAddressBook.AddressBookDTO;
import com.example.SpringAddressBook.AddressBookModel;
import com.example.SpringAddressBook.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    @GetMapping("/")
    public ResponseEntity<List<AddressBookModel>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping("/")
    public ResponseEntity<AddressBookModel> create(@RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.add(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressBookModel> update(@PathVariable int id, @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return service.delete(id) ? ResponseEntity.ok("Deleted") : ResponseEntity.status(404).body("Not Found");
    }
}
