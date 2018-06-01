package com.said.app.carrent.Controller;

import com.said.app.carrent.Model.Owner;
import com.said.app.carrent.Service.ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    private ServiceImplementation serviceImplementation;

    @GetMapping("/owners")
    public List<Owner> getAllMyOwners(){
        return serviceImplementation.getAllOwners();
    }

    @GetMapping("/owner/{id}")
    public Owner getOwnerById(@PathVariable Long id){
        return serviceImplementation.getOwnerById(id);
    }

}
