package dev.rude.tie.controller;

import dev.rude.tie.entity.Bill;
import dev.rude.tie.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BillController {

    @Autowired
    private BillRepository billRepository;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Bill create(@RequestBody Bill bill) {
        return billRepository.insert(bill);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Bill update(@RequestBody Bill bill) {
        return billRepository.save(bill);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@RequestBody Bill bill) {
        billRepository.delete(bill);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Bill> findAll() {
        return billRepository.findAll();
    }
}
