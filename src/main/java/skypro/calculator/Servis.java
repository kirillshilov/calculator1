package skypro.calculator;


import org.springframework.stereotype.Service;

@Service
public class Servis implements CalcServis {
    public class Controller {
        private final Servis servis;

        public Controller(Servis servis) {
            this.servis = servis;
        }
    }
    @Override
    public String showHello() {
        return "Добро пожаловать в калькулятор ";
    }

    @Override
    public String plus(int num1, int num2) {
        return  String.valueOf(num1) + "+" + String.valueOf(num2) + "=" + String.valueOf(num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return  String.valueOf(num1) + "-" + String.valueOf(num2) + "=" + String.valueOf(num1 - num2);
    }
    @Override
    public String multiple(int num1, int num2) {
        return String.valueOf(num1) + "*" + String.valueOf(num2) + "=" + String.valueOf(num1 * num2);
    }
    @Override
    public String divide(int num1, int num2) {

        if (num2 != 0) {
            return   String.valueOf(num1) + "-" + String.valueOf(num2) + "=" + String.valueOf(num1 / num2);}
        else  return
                "На ноль делить нельзя ";
    }
}