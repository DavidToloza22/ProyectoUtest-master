package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickJoin implements Task {

    public static ClickJoin joinToday(){
        return Tasks.instrumented(ClickJoin.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPage.JOIN_TODAY_BUTTON));
    }
}
