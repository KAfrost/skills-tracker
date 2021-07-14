package com.example.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping()
    @ResponseBody
    public String startSkills (){
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>Skills we want to learn.</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<ol>" ;
        return html;
    }

    @GetMapping(value = "form")
    @ResponseBody
    public String formSkills (){
        String html = "<form method='post'> \n" +
                "Name:<br>" +"\n" +
                "<input type = 'text' name = 'name' />" +"\n" +
                "<br>My favorite language:<br>" + "\n" +
                "<select name = 'firstChoice'>" + "\n" +
                "<option value = 'Java'>Java</option>" +  "\n" +
                "<option value = 'Javascript'>JavaScript</option>" + "\n" +
                "<option value = 'Python'>Python</option>" + "\n" +
                "</select>" + "\n" +
                "<br>My second favorite language:<br>" + "\n" +
                "<select name = 'secondChoice'>" + "\n" +
                "<option value = 'Java'>Java</option>" + "\n" +
                "<option value = 'Javascript'>JavaScript</option>" + "\n" +
                "<option value = 'Python'>Python</option>" + "\n" +
                "</select>" + "\n" +
                "<br>My third favorite language:<br>" + "\n" +
                "<select name = 'thirdChoice'>" + "\n" +
                "<option value = 'Java'>Java</option>" + "\n" +
                "<option value = 'Javascript'>JavaScript</option>" + "\n" +
                "<option value = 'Python'>Python</option>" + "\n" +
                "</select><br>" + "\n" +
                "<input type = 'submit' value = 'Submit' />" + "\n" +
                "</form>\n";
        return html;
    }

    @PostMapping(value = "form")
    @ResponseBody
    public String namePage (@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice){
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
        return html;
    }
}
