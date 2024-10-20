package calculator.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 문자열을 입력받는 view
 */
public class InputView {

    public String getInputString() {
        System.out.println("덧셈할 문자열을 입력해주세요.");

        return Console.readLine();
    }

    public String getInputStringFromNextLine(String input) {
        input += "\\n" + Console.readLine();

        return input;
    }

}
