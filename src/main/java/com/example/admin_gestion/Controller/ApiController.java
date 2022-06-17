package com.example.admin_gestion.Controller;

import com.example.admin_gestion.Model.Endroit;
import com.example.admin_gestion.Model.ResponseResult;
import com.example.admin_gestion.Repo.EndroitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@RestController
public class ApiController {
@GetMapping(value = "/")
    public String getpage()
    {
          return "welcome";

    }
    @Autowired
    EndroitRepo endroitRepository;

@GetMapping(value = "/endroits")
public List<Endroit> getEndroits()
    {
        return  endroitRepository.findAll();
    }

    @PostMapping("/save")
    public String SaveEndroit(@RequestBody Endroit endroit)
    {
           endroitRepository.save(endroit);
           return "saved ...";
    }
    @PutMapping("update/{id}")
    public String updateEndroit(@PathVariable long id,@RequestBody Endroit endroit)
    {
        Endroit updateendroit=endroitRepository.findById(id).get();
        updateendroit.setName(endroit.getName());
        updateendroit.setDescription(endroit.getDescription());
        updateendroit.setVille(endroit.getVille());
        updateendroit.setNome_photo(endroit.getNome_photo());
        endroitRepository.save(updateendroit);
        return "Updated.....";
    }
    @DeleteMapping("Delete/{id}")
    public String deleteEndroit(@PathVariable long id)
    {
        Endroit deleteendroit =endroitRepository.findById(id).get();
        endroitRepository.delete(deleteendroit);
        return "Delete endroit with the id:"+id;
    }


}
