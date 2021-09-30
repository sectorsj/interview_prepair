package ru.sectorsj.hw7_spring.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.sectorsj.hw7_spring.models.Student;
import ru.sectorsj.hw7_spring.services.StudentService;


@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/")
    public String showAllStudentsPage(Model model, @RequestParam(name = "s", defaultValue = "1") int pageIndex) {
        if (pageIndex < 1) {
            pageIndex = 1;
        }
        Page<Student> page = studentService.findAll(pageIndex - 1, 4);
        model.addAttribute("page", page);
        return "index";
    }

    @GetMapping("/students/{id}")
    public String showStudentInfo(@PathVariable(name = "id") Long id, Model model) {
        studentService.findOneById(id).ifPresent(s -> model.addAttribute("student", s));
        return "student_info";
    }

    @GetMapping("/students/{id}/mark/inc")
    public String incrementStudentMark(@PathVariable Long id) {
        studentService.incrementMarkById(id, 1);
        return "redirect:/";
    }

    @GetMapping("/students/{id}/mark/dec")
    public String decrementStudentMark(@PathVariable Long id) {
        studentService.decrementMarkById(id, 1);
        return "redirect:/";
    }

    @PostMapping("/students/add")
    public String createNewStudent(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/students/add")
    public String showCreateStudentForm() {
        return "create_student_form";
    }

    //TODO продумать метод добавления нового студента с возможностью выбора группы из БД

//    @GetMapping
//    public String main(Model model) {
//        model.addAttribute("studentService", new Order());
//        return "index";
//    }

//    @PostMapping("/students/add")
//    public String showCreateStudentForm(Model model) {
//        Group group = new Group();
//        model.addAttribute("studentsGroup", group);
//        Optional<Group> list = groupService.findById();
//        model.addAttribute("groups", list);
//        return "create_student_form";
//    }



}
