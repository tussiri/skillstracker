package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String skills() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here are the skills we would like to learn</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Swift</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    public String form() {
        String html;
        return "<html>" +
                "<body>" +
                "<form action='form-submit' method='post'>" +
                "<label for='name'>Name: </label> <br>" +
                "<input id='name' type='text' name = 'name' /> <br>" +
                "<label for='favorite-language'>My favorite language: </label><br>" +
                "<select id='favorite-language' name='language1'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Swift'>Python</option>" +
                "</select><br>" +
                "<label for = 'second-favorite'>My second favorite language: </label><br>" +
                "<select id='second-favorite' name='language2'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Swift'>Python</option>" +
                "</select><br>" +
                "<label for = 'third-favorite'>My third favorite language: </label><br>" +
                "<select id='third-favorite' name='language3'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Swift'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "<html>";
    }

    @RequestMapping(value = "form-submit", method = {RequestMethod.GET, RequestMethod.POST})
    public String formSubmit(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body>" +
                "<table>" +
                "<tr><th><h1>" + name + "</h1></th><tr>" +
                "<tr><td>" + language1 + "</td></tr>" +
                "<tr><td>" + language2 + "</td></tr>" +
                "<tr><td>" + language3 + "</td></tr>" +
                "</table>" +
                "</body>" +
                "</html>";
//
//        return "<html>" +
//                "<body>" +
//                "<h1>" + name + "</h1>" +
//                "<ol>" +
//                "<li>" + language1 + "</li>" +
//                "<li>" + language2 + "</li>" +
//                "<li>" + language3 + "</li>" +
//                "</ol>" +
//                "</body>" +
//                "</html>";
//
    }
}
