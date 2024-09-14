// package AdventureCatch;
public class DeadCharacterException extends Exception {
    private Character character;
    public DeadCharacterException(Character c){
        this.character = c;
    }
    public Character getCharacter(){
        return this.character;
    }
    public String getMessage(){
        String s = "The ";
        if (character instanceof Templar){
            s+="templar";
        }else if (character instanceof Monster){
            s+="monster";
        }
        else if (character instanceof Sorcerer){
            s+="sorcerer";
        }else{
            s+="character";
        }
        s+=String.format(" %s is dead.", character.getName());
        return s;
    }
}
