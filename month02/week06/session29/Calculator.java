public class Calculator {
    int a; // property
    int b;
    int result;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // int буцаадаг add гэдэг нэртэй function
    // тодорхойлоод тэгээд a болон b-гийн утгуудыг
    // result дээр хадгалаад түүнийгээ буцаадаг
    // болгоно уу.
    int add() {
        this.result = this.a + this.b;
        return this.result;
    }

    // minus
    int minus() {
        this.result = this.a - this.b;
        return this.result;
    }

    // multiply
    int multiply() {
        this.result = this.a * this.b;
        return this.result;
    }

    // division
    double division() {
        this.result = this.a / this.b; // өөрөөр (return this.a / this.b;)
        return this.result;
    
    }

}