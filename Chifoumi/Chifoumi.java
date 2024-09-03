package Chifoumi;
public class Chifoumi{
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction){
     switch (chifoumiAction) {
         case ROCK:
             return ChifoumiAction.SCISSOR;
         case PAPER:
             return ChifoumiAction.ROCK;
         case SCISSOR:
             return ChifoumiAction.PAPER;
         default:
             throw new IllegalArgumentException("Invalid ChifoumiAction");
     }
    }
}
