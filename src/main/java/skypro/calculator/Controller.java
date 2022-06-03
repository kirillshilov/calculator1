package skypro.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller   {
    private final Servis servis;

    public Controller(Servis servis) {
        this.servis = servis;
    }

    @GetMapping ("/calculator")
    public String showHello() {
        return servis.showHello();
    }
    @GetMapping ("/calculator/plus")
    public String plusTwoNumbers (@RequestParam  int num1, @RequestParam int num2) {
        return servis.plus(num1, num2);

    }
    @GetMapping ("/calculator/minus")
    public String minusTwoNumbers (@RequestParam int num1, @RequestParam int num2) {
        return servis.minus(num1, num2);
    }
    @GetMapping ("/calculator/multiple")
    public String multipleTwoNumbers (@RequestParam int num1, @RequestParam int num2) {
        return  servis.multiple(num1, num2);
    }
    @GetMapping ("/calculator/divide")
    public String divideTwoNumbers (@RequestParam int num1, @RequestParam int num2) {
        return  servis.divide(num1, num2);
    }

}
