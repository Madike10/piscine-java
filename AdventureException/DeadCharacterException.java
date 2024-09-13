// import AdventureAbstract.Character;

public class DeadCharacterException extends Exception{

    public DeadCharacterException(Object message){
        super();
    }
    public String getMessage(){
        return "The " + AdventureMonster.Character.class + " is dead";
    }
}