package edu.mrp.lab4.controller;/*
@author   Makohon Roman
@project   Basic HTTP requests. CRUD
@class  $444A
@version  1.0.0
@since 4.10.2024 - 14.23
*/

import edu.mrp.lab4.model.Book;
import edu.mrp.lab4.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books/")
@RequiredArgsConstructor
public class BookRestController {
    private final BookService bookService;

    @GetMapping
    public List<Book> showAll() {
        return bookService.getAll();
    }

    @GetMapping("{id}")
    public Book showOneById(@PathVariable String id) {
        return bookService.getById(id);
    }

    @PostMapping
    public Book insert(@RequestBody Book book) {
        return bookService.create(book);
    }

    @PutMapping
    public Book edit(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        bookService.delById(id);
    }
}
