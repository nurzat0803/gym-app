package com.epam.wca.controller;//package com.javaXSTACK.controller;
//
//import com.javaXSTACK.entity.Training;
//import com.javaXSTACK.service.TrainingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//public class TrainingController {
//    @Autowired
//    private TrainingService trainingService;
//
//    @GetMapping("/listTraining")
//    public ModelAndView listTrainings() {
//        ModelAndView modelAndView = new ModelAndView("TrainingList");
//        List<Training> trainings = trainingService.listTrainings();
//        modelAndView.addObject("trainings", trainings);
//        return modelAndView;
//    }
//
//    @GetMapping("/training/getTrainingAddPage")
//    public ModelAndView addTrainingPage() {
//        ModelAndView modelAndView = new ModelAndView("trainingSave");
//        modelAndView.addObject("trainingAdd", new Training());
//        return modelAndView;
//    }
//
//    @PostMapping("/trainings/getTrainingAddPage")
//    public ModelAndView trainingSave(@ModelAttribute Training training) {
//        trainingService.addTraining(training);
//        List<Training> trainingList = trainingService.listTrainings();
//        ModelAndView modelAndView = new ModelAndView("trainingList");
//        modelAndView.addObject("trainings", trainingList);
//        return modelAndView;
//    }
//    /**/
//}