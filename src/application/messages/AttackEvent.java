package bgu.spl.mics.application.messages;
import bgu.spl.mics.Event;
import bgu.spl.mics.application.passiveObjects.Attack;

public class AttackEvent implements Event<Boolean> {
    private Attack Attack;

    public AttackEvent(Attack A){
        Attack=A;
    }
    public AttackEvent(){};

    public Attack getAttack(){return Attack;}
}


    
