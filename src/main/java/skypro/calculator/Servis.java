package skypro.calculator;


import org.springframework.stereotype.Service;

@Service
public class Servis implements CalcServis {

    @Override
    public String showHello() {
        return "Добро пожаловать в калькулятор ";
    }

    @Override
    public String plus(int num1, int num2) {
        return num1 + "+" + num2 + "=" + ((num1) + (num2));
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + ((num1) - (num2));
    }
    @Override
    public String multiple(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1) * (num2);
    }
    @Override
    public String divide(int num1, int num2) {

        if (num2 != 0) {
            return num1 + "/" + num2 + "=" + (num1) / (num2);
    }
        else   throw new ZeroIntException ("На ноль делить нельзя");
    }

}