package chenzb.pattern.proxy.stative;

import chenzb.pattern.proxy.Person;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chenzibin on 2018/11/4.
 */
public class StaticProxy implements Person {

    public static Logger log = Logger.getLogger(StaticProxy.class.getName());

    private Person person;

    public StaticProxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat(String food) {

        log.setLevel(Level.INFO);

        System.out.println("person eat");;
        person.eat(food);
        log.info("person eat ");
    }

    @Override
    public void sleep() {
        log.setLevel(Level.INFO);

        System.out.println("person sleep");;
        person.sleep();
        log.info("person sleep");
    }

}
