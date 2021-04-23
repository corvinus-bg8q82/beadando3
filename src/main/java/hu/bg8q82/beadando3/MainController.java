package hu.bg8q82.beadando3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;

@RestController
@Controller
public class MainController {


    @GetMapping(path="/")
    public String getMessageNev(@RequestParam(defaultValue = "Felhasznalo") String name){
        return String.format("Hello %s!",name);
    }

    @PostMapping("/fordit")
    public BejovoSzovegDto szovegFordito(@RequestParam(defaultValue = "Alma a fa alatt")String text){
        String kimenoszoveg=new StringBuilder(text).reverse().toString();
        return BejovoSzovegDto.builder().bejovoszoveg(kimenoszoveg).build();
    }



}
