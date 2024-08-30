package com.epam.wca.controller;//package com.javaXSTACK.controller;
//
//import com.javaXSTACK.entity.Trainer;
//import com.javaXSTACK.service.TrainerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//public class TrainerController {
//    @Autowired
//    private TrainerService trainerService;
//
//    @GetMapping("/listTrainer")
//    public ModelAndView listTrainers() {
//        ModelAndView modelAndView = new ModelAndView("TrainerList");
//        List<Trainer> trainers = trainerService.listTrainers();
//        modelAndView.addObject("trainers", trainers);
//        return modelAndView;
//    }
//
//    @GetMapping("/trainer/getTrainerAddPage")
//    public ModelAndView addTrainerPage() {
//        ModelAndView modelAndView = new ModelAndView("trainerSave");
//        modelAndView.addObject("trainerAdd", new Trainer());
//        return modelAndView;
//    }
//
//    @PostMapping("/trainers/getTrainerAddPage")
//    public ModelAndView trainerSave(@ModelAttribute Trainer trainer) {
//        trainerService.addTrainer(trainer);
//        List<Trainer> trainerList = trainerService.listTrainers();
//        ModelAndView modelAndView = new ModelAndView("trainerList");
//        modelAndView.addObject("trainers", trainerList);
//        return modelAndView;
//    }
//    /**/
//
//    @GetMapping("/trainers/edit/{id}")
//    public String editTrainerForm(@PathVariable(value = "id") Integer id, Model model) {
//        model.addAttribute("trainer", trainerService.getTrainerById(id));
//        return "update_trainer";
//    }
//
//    @PostMapping("/trainers/{id}")
//    public String editTrainer(@PathVariable(value = "id") Integer id,
//                           @ModelAttribute Trainer trainerDetail,
//                           Model model) {
//        model.addAttribute("trainers");
//        Trainer exitTrainer = trainerService.getTrainerById(id);
//
//        exitTrainer.setId(id);
//        exitTrainer.setSpecialization(trainerDetail.getSpecialization());
//        exitTrainer.setId(trainerDetail.getId());
//        trainerService.updateTrainer(exitTrainer);
//        return "redirect:/";
//    }
//}