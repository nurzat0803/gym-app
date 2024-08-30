package com.epam.wca.controller;

import com.epam.wca.entity.Trainee;
import com.epam.wca.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TraineeController {

    @Autowired
    private TraineeService traineeService;

    @GetMapping("/")
    public ModelAndView listTrainees() {
        ModelAndView modelAndView = new ModelAndView("traineeList");
        List<Trainee> trainees = traineeService.listTrainees();
        modelAndView.addObject("trainees", trainees);
        return modelAndView;
    }

    @GetMapping("/trainee/getTraineeAddPage")
    public ModelAndView addTraineePage() {
        ModelAndView modelAndView = new ModelAndView("traineeSave");
        modelAndView.addObject("traineeAdd", new Trainee());
        return modelAndView;
    }

    @PostMapping("/trainees/getTraineeAddPage")
    public ModelAndView traineeSave(@ModelAttribute Trainee trainee) {
        traineeService.addTrainee(trainee);
        List<Trainee> traineeList = traineeService.listTrainees();
        ModelAndView modelAndView = new ModelAndView("traineeList");
        modelAndView.addObject("trainees", traineeList);
        return modelAndView;
    }
    /**/

    @GetMapping("/trainees/edit/{id}")
    public String editTraineeForm(@PathVariable(value = "id") Integer id, Model model) {
        model.addAttribute("trainee", traineeService.getTraineeById(id));
        return "update_trainee";
    }

    @PostMapping("/trainees/{id}")
    public String editTrainee(@PathVariable(value = "id") Integer id,
                           @ModelAttribute Trainee traineeDetail,
                           Model model) {
        model.addAttribute("trainees");
        Trainee exitTrainee = traineeService.getTraineeById(id);

        exitTrainee.setId(id);
        exitTrainee.setDateOfBirth(traineeDetail.getDateOfBirth());
        exitTrainee.setAddress(traineeDetail.getAddress());
        exitTrainee.setId(traineeDetail.getId());

        traineeService.updateTrainee(exitTrainee);
        return "redirect:/";
    }

    @GetMapping ("/trainee/{id}")
    public String deleteTrainee(@PathVariable(value = "id") Integer id, Model model) {
        Trainee trainee = traineeService.getTraineeById(id);
        traineeService.removeTrainee(id);
        return "redirect:/";
    }
}

