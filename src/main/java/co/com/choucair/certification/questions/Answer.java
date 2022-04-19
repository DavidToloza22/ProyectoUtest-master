package co.com.choucair.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import co.com.choucair.certification.userinterface.UtestSignUp;

public class Answer implements Question<Boolean> {
    private String strSuccessSignUpMessage;

    public Answer(String strSuccessSignUpMessage) {
        this.strSuccessSignUpMessage = strSuccessSignUpMessage;
    }

    public static Answer toThe(String strSuccessSignUpMessage) {
        return new Answer(strSuccessSignUpMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message = Text.of(UtestSignUp.COMPLETED_REGISTER).viewedBy(actor).asString();
        if (strSuccessSignUpMessage.equals(message)){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}