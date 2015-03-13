package hello;
import org.springframework.beans.factory.annotation.Required;

public class HelloWorld {
    private String message;
    private SpellChecker spellChecker;
    private SpellChecker spellChecker2;
    private SpellChecker spellChecker3;
    private int year;
    public HelloWorld(int year, SpellChecker spellChecker) {
        System.out.println("Inside HelloWorld constructor." );
        this.spellChecker = spellChecker;
        this.year = year;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
    @Required
    public void setSpellChecker2(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker2." );
        this.spellChecker2 = spellChecker;
    }
    public SpellChecker getSpellChecker2() {
        return spellChecker2;
    }
    public void spellCheck2() {
        spellChecker2.checkSpelling();
    }
    public void setSpellChecker3(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker3." );
        this.spellChecker3 = spellChecker;
    }
    public SpellChecker getSpellChecker3() {
        return spellChecker3;
    }
    public void spellCheck3() {
        spellChecker3.checkSpelling();
    }

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + year + message);
    }
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
