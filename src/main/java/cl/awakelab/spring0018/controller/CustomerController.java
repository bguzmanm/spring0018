package cl.awakelab.spring0018.controller;

import cl.awakelab.spring0018.model.entity.Customer;
import cl.awakelab.spring0018.model.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping()
    public String listClientes(Model model){

        model.addAttribute("customers", service.read());
        return "listClientes";
    }
    // /customer/edit/3
    @PostMapping("/edit/{id}")
    public String updateCliente(@PathVariable("id") int id, @RequestBody Customer c, Model model){
        return "redirect:/customer";
    }

}
