package sandbox.mathengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Demo {
    public static void main(String[] args) throws Exception {
        String one = "5/6";
        String two = "3+5-6";
        String three = "9+2*(6-3+7)";
        String four = "(10 % 3)*2^6";
        String five = "2%3";
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        Object expResult1 = scriptEngine.eval(one);
        Object expResult2 = scriptEngine.eval(two);
        Object expResult3 = scriptEngine.eval(three);
        Object expResult4 = scriptEngine.eval(four);
        Object expResult5 = scriptEngine.eval(five);
        System.out.println("Result of expression1 = " + expResult1);
        System.out.println("Result of expression2 = " + expResult2);
        System.out.println("Result of expression3 = " + expResult3);
        System.out.println("Result of expression4 = " + expResult4);
        System.out.println("Result of expression5 = " + expResult5);
    }
}